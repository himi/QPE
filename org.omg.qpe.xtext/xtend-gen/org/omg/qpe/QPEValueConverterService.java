package org.omg.qpe;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class QPEValueConverterService extends DefaultTerminalConverters {
  private static class QPEValueConverter implements IValueConverter<Object> {
    @Override
    public String toString(final Object value) throws ValueConverterException {
      String _string = value.toString();
      return ("" + _string);
    }
    
    @Override
    public Object toValue(final String string, final INode node) throws ValueConverterException {
      final EObject eo = node.getSemanticElement();
      System.err.println(("E:" + eo));
      return string;
    }
  }
  
  private final QPEValueConverterService.QPEValueConverter qpeValueConverter = new QPEValueConverterService.QPEValueConverter();
  
  @ValueConverter(rule = "VALUE")
  public IValueConverter<Object> getQPEValueConverter() {
    return this.qpeValueConverter;
  }
}
