
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class EvalTest {
   public static void main(String[] args) throws ScriptException {
       ScriptEngineManager manager = new ScriptEngineManager();
       ScriptEngine engine = manager.getEngineByName("js");
       Object result = engine.eval("");
       System.out.println(result);
   }
}

