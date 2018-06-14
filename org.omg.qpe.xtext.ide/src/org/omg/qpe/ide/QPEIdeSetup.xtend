/*
 * generated by Xtext
 */
package org.omg.qpe.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.omg.qpe.QPERuntimeModule
import org.omg.qpe.QPEStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class QPEIdeSetup extends QPEStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new QPERuntimeModule, new QPEIdeModule))
	}
	
}