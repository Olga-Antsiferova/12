package reqres;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Get {

    @Test
            public void get{
        Responce responce = RestAssured
                .get("https://reqres.in/api/users?page=2")
                .andReturn();
        responce.prettyPrint();
    }

}
