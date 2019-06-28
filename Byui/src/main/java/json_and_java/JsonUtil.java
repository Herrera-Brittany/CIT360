package json_and_java;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonGenerationException;
/**
 *
 * @author PC User
 */
public class JsonUtil {
    private static ObjectMapper mapper;
    static{
        mapper=new ObjectMapper();
    }
    public static String convertJavaToJson(Object object) {
     String jsonResult="";
     try {
         jsonResult=mapper.writeValueAsString(object);
     } catch (JsonGenerationException e) {
   System.out.println("Exception Occured while converting Java Object inot JSON --> ");
   }
    catch (JsonMappingException e) {
   System.out.println("Exception Occured while converting Java Object inot JSON --> ");
} catch (IOException e) {
   System.out.println("Exception Occured while converting Java Object inot JSON --> ");
        
}
     return jsonResult;
    }            
}