package com.lyz.elklogstashdemo;

/**
 * Hello Liu Yongzhao!
 *
 */
import org.apache.log4j.Logger;

public class Log4jTest {
    public static final Logger logger=Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.debug("111 This is a debug message!");
        logger.info("222 This is info message!");
        logger.warn("333 This is a warn message!");
        logger.error("444 This is error message!");

        try{
           System.out.println(5/0);
        }catch(Exception e){
            logger.error(e);
        }
    }
}