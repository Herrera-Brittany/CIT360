import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMapping Exception;
import org.codehaus.jackson.map.ObjectMapper;

public class Cit {
    public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
          try {
                  String jsonString ="{"\id\": 1, \"name\": \"A green door\",\"price\":12.50,\"tags\": [\"home\", \"green\"]});"
                  + "MyPojo myPojo = mapper.readValue(json MyPojo.class);"
                  + "System.out.println(myPojo.getTags()[1]);"
                  + ""
                  + "} catch {JsonParseException e) {"
                  + "e.printStackTrace();"
                  + "} catcj {JsonMappingException e) {"
                  + "e.printStackTrace();"
                  + "}"
                  + "catch (IOException e) {"
                  + "e.printStackTrace();"
                  + "}"
                  + "}"
                  + "}o.getId());
}
catch (JsonParseException e) {
} catch (JsonMappingException e) {
} catch (IOException e) {
}}}

