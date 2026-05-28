package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context ctx = tomcat.addContext("", null);
        Tomcat.addServlet(ctx, "H1", new Servlet1());
        ctx.addServletMappingDecoded("/Hello", "H1");
        tomcat.start();
        tomcat.getServer().await();

    }
}
