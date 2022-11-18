package main.com.nexient.cart.ApiUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.java.sampleTc;

import java.io.FileNotFoundException;

public class TestNgListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("I am inside Test Cases listener - " + result.getName());
        try {
            ApiGeneric.logPrintStream(result.getName());
            sampleTc.setPrintStream();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
