package br.com.walmart3.regression_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.walmart3.regression_testing.test_cases.verify_create_acount.Tc01_VerifyCreateAcountLinkClick;

@RunWith(Suite.class)
@SuiteClasses({ 
	StartRegressionTesting.class,
	CloseRegressionTesting.class,
	Tc01_VerifyCreateAcountLinkClick.class})
public class AllTests {

}
