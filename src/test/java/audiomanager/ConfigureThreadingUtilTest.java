package audiomanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

class ConfigureThreadingUtilTest {
    
    MyApplication myApplication = mock(MyApplication.class); 

    @Test
    public void threadPoolShouldBeConfigured() {
        // mock MyApplication
        // call ConfigureThreadingUtil.configureThreadPool
        ConfigureThreadingUtil.configureThreadPool(myApplication);
        // verify that getNumberOfThreads was the only one called on app
        verify(myApplication, only()).getNumberOfThreads(); 
    }
}