package org.drools.workbench.models.testscenarios.backend;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Double result;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Double getResult() {
		return this.result;
	}

	public void setResult(java.lang.Double result) {
		this.result = result;
	}

	public Person(java.lang.String name, java.lang.Double result) {
		this.name = name;
		this.result = result;
	}

}