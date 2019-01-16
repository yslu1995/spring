package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
    static Logger logger = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) throws InterruptedException {
/*        1. 知道是log4j.TestLog4j这个类里的日志
        2. 是在[main]线程里的日志
        3. 日志级别可观察，一共有6个级别 TRACE DEBUG INFO WARN ERROR FATAL
        4. 日志输出级别范围可控制， 如代码所示，只输出高于DEBUG级别的，那么TRACE级别的日志自动不输出
        5. 每句日志消耗的毫秒数(最前面的数字)，可观察，这样就可以进行性能计算*/
//        BasicConfigurator.configure();
//        /**
//         * 只输出大于等于 DEBUG 的日志
//         */
//        logger.setLevel(Level.DEBUG);
//        logger.trace("跟踪信息");
//        logger.debug("调试信息");
//        logger.info("输出信息");
//        Thread.sleep(1000);
//        logger.warn("警告信息");
//        logger.error("错误信息");
//        logger.fatal("致命信息");
        //E:\workspace\spring\src
        PropertyConfigurator.configure("e:\\workspace\\spring\\src\\log4j.properties");
        for (int i = 0; i < 10; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");

        }


    }
}
