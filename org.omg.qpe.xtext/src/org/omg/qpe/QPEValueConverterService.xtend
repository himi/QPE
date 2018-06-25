package org.omg.qpe

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverter

class QPEValueConverterService extends DefaultTerminalConverters {
    private static class QPEValueConverter implements IValueConverter<Object> {
        override toString(Object value) throws ValueConverterException {
            return "" + value.toString();
        }
					
        override toValue(String string, INode node) throws ValueConverterException {
        	val eo = node.getSemanticElement();
        	System.err.println("E:" + eo);
        	return string;
        }
    }

    private val qpeValueConverter = new QPEValueConverter;

    @ValueConverter(rule = "VALUE")
    def IValueConverter<Object> getQPEValueConverter() {
        return qpeValueConverter;
    }
}
