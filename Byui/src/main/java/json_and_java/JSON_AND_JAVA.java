
package json_and_java;
import org.codehaus.jackson.map.JsonMappingException;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSON_AND_JAVA {
    private static ObjectMapper mapper;
    static{
        mapper=new ObjectMapper();
    }
    public static String convertJavaToJson(Object object) {
     String jsonResult="";
     try {
        jsonResult=mapper.writeValueAsString(object);
    } catch (JSONGenerationException e) {
    e.printStackTrace();
} catch (JsonMappingException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
        return jsonResult;
    }          }