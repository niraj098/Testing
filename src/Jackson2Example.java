import com.fasterxml.jackson.core.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Jackson2Example {
    public static void main(String[] args) {
        Jackson2Example obj = new Jackson2Example();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        //Staff staff = createDummyObject();
        //Staff staff = new Staff();

        try {

            String test="{\"name\":\"mkyong\",\"age\":33,\"position\":\"Developer\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";



            //String JsonString=mapper.writeValueAsString(staff);
            //System.out.println(JsonString);
            //student stud=mapper.readValue(test,student.class);
            Staff staff = new Staff();
            staff.setAge(32);
            student stud= new student();
            //Staff staff1= mapper.readValue(JsonString,Staff.class);
            Staff staff1= mapper.readValue(test,Staff.class);

            System.out.println(staff1);



            // Convert object to JSON string and save into a file directly
            //mapper.writeValue(new File("D:\\staff.json"), staff);

            // Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(staff);
            System.out.println(jsonInString);

            // Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("mkyong");
        staff.setAge(33);
        staff.setPosition("Developer");
        staff.setSalary(new BigDecimal("7500"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");

        staff.setSkills(skills);

        return staff;

    }

}
