import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class AddedAfterRerturnAspect {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
public void afterReturn(Object returnValue) throws Throwable{
	logger.info("vakye return was {}",returnValue);
}

}