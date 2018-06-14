package org.omg.qpe.formal

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import java.util.Collections
import scala.collection.JavaConverters._
import org.omg.qpe.model.QPE
import org.omg.qpe.QPEStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import java.io.InputStream
import org.eclipse.xtext.resource.XtextResource
import java.io.ByteArrayInputStream

object ExecQuery {

  def load(uri: String) : Seq[EObject] = {
    val rs = new ResourceSetImpl();
    val u = URI.createFileURI(uri);
    val r = rs.createResource(u);
    r.load(Collections.emptyMap());
    val l = r.getContents();
    return l.asScala
  }

  def parse(qpe: String) : QPE = {
    val injector = new QPEStandaloneSetup().createInjectorAndDoEMFRegistration();
    val resourceSet = injector.getInstance(classOf[XtextResourceSet]);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);
    val resource = resourceSet.createResource(URI.createURI("dummy:/foo.qpe"));
    val in = new ByteArrayInputStream(qpe.getBytes());
    resource.load(in, resourceSet.getLoadOptions());
    val r = resource.getContents().get(0);
    
    return r.asInstanceOf[QPE];  
  }

  def main(args : Array[String]) : Unit = {
    if (args.length < 2) {
      System.err.println("ExecQuery ModelURI QPE ... QPE");
    } else {
      val qpe = parse(args(0));
      System.err.println("QPE:" + qpe.toString());
    }
  }
}
