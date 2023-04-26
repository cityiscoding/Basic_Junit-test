import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeOut{

    private class LongRunningTask {
        public void run() throws InterruptedException {
            // giả lập một tác vụ chạy lâu bằng cách chờ đợi trong 300ms
            Thread.sleep(300);
        }
    }

    @Test
    @Timeout(value = 400, unit = TimeUnit.MILLISECONDS)
    public void testLongRunningTask() throws InterruptedException {
        LongRunningTask task = new LongRunningTask();
        task.run();
        assertTrue(true);
    }
}
