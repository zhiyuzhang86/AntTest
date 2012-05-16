package test;

import javax.swing.*;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


/**
 * Created by IntelliJ IDEA.
 * User: zzhang
 * Date: May 14, 2012
 * Time: 9:29:25 AM
 * To change this template use File | Settings | File Templates.
 */

public class HelloWorld{

    static Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Hello Zack!");
        BasicConfigurator.configure();
        logger.info("Hello World");
		System.out.println("Hello Zack!!");
	}
}
