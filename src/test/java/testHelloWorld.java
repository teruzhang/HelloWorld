import com.zl.maven.HelloWorld.HelloWorld;
import org.junit.Test;

public class testHelloWorld{
    @Test
    public void getSayHi(){
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.sayHi());
    }
}
