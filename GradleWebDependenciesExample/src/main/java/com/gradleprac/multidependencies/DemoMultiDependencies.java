package com.gradleprac.multidependencies;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class DemoMultiDependencies {
    //apache logger or log4j - provided by direct dependencies
    private Logger apacheLogger = Logger.getLogger(this.getClass());

    // jcl - jakarta commons logging framework - provided by Sring core
    private Log jclLogger = LogFactory.getLog(this.getClass());

    public void printApacheLogs() {
        apacheLogger.log(Priority.INFO, "Printing apache logs.");
    }

    public void printJCLLogs() {
        jclLogger.info("Printing jcl logs");
    }

    public static void main(String[] args) {
        DemoMultiDependencies demoObj = new DemoMultiDependencies();
        demoObj.printApacheLogs();
        demoObj.printJCLLogs();
    }
}
