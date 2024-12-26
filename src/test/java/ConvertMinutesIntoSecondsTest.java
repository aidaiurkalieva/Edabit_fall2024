import easyPromlems.ConvertMinutesIntoSeconds;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertMinutesIntoSecondsTest {
    @Test
    public void testConvertPositiveMinutes() {
        ConvertMinutesIntoSeconds timeConverter = new ConvertMinutesIntoSeconds();

        int result = timeConverter.convertMinutesToSeconds(5); // Преобразуем 5 минут в секунды
        Assert.assertEquals(result, 300, "5 minutes should equal 300 seconds."); // Проверяем результат

    }

}







