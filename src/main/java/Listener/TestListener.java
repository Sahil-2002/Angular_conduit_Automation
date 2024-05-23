package Listener;

import Base.Testbase;
import Util.Testutil;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener extends Testbase implements ITestListener {
    private ExtentTest test;
    private Testutil util;

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getMethodName() + " test started ...");
        extentReports.attachReporter(sparkReporter);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getMethodName() + " test successfull ...");
        test = extentReports.createTest(result.getMethod().getMethodName());
        test.pass("test successfully executed ...");
        extentReports.flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getMethod().getMethodName() + " test failed ");
        test = extentReports.createTest(result.getMethod().getMethodName());
        test.fail("Test method failed ");

        String ftname = result.getMethod().getMethodName();
        util = new Testutil();
        System.out.println("Capturing screenshot...");
        try {
            util.screenshot(ftname);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath("D:\\intellij_workspace\\React-pom\\Screenshot" + ftname + ".png");
        extentReports.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.printf(result.getMethod().getMethodName() + " test skipped ...");
        test = extentReports.createTest(result.getMethod().getMethodName());
        test.skip("Test method skipped ...");
        extentReports.flush();
    }

}
