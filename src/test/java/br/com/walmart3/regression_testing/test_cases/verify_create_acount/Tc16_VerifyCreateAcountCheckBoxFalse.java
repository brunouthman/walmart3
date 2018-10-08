package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc16_VerifyCreateAcountCheckBoxFalse extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "Tc16_VerifyCreateAcountCheckBoxFalse";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
		System.out.println("criar um metodo que gera um usuario completo check box news=false");
	}

}
