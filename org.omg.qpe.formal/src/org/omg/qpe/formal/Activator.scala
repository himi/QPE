package org.omg.qpe.formal

import org.osgi.framework.BundleContext
import org.osgi.framework.BundleActivator

class Activator extends BundleActivator {

  override def start(context: BundleContext) = {
    println("Scala Execution Test! : $context")
  }

  override def stop(context: BundleContext) = {
  }
}
