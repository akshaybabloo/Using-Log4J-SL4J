package com.gollahalli;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author Akshay Raj Gollahalli
 */
public class UsingLog4J {
    
    static {
        // Getting the current path of this folder.
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        
        // adding the location to the log file, if the log file is not already present
        // a log file with LOG4JSL4J.log is created
        System.setProperty("LOG4JSL4J", s + "/LOG4JSL4J.log");
        // Location of the log4j config file
        System.setProperty("log4j.configurationFile", "com/gollahalli/log4j-configFile.xml");        
    }
    
    // Initialising the logger class.
    public static final Logger LOGGER = LogManager.getLogger(UsingLog4JSLF4J.class);
    
    public static void main(String[] args) {
        LOGGER.error("This is an error");
        LOGGER.info("this is info log");
        LOGGER.debug("A debug messaage, works only in debug mode");
        LOGGER.fatal("fatal message");
        System.out.println("class name is " + LOGGER.getName());
        LOGGER.warn("warning");
        LOGGER.log(Level.INFO, "Another way to log Info errors");
        
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
            LOGGER.catching(e);
        }
        
        }
    
}
