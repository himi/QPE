/*
 * generated by Xtext
 */
package org.omg.qpe


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class QPEStandaloneSetup extends QPEStandaloneSetupGenerated {

	def static void doSetup() {
		new QPEStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
