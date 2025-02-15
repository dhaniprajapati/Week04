package junit;
import com.junit.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class TaskTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        Task task = new Task();
        task.longRunningTask();
    }
}
