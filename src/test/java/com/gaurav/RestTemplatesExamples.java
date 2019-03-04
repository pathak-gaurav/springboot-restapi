package com.gaurav;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class RestTemplatesExamples {

    private static final String API_ROOT = "https://api.predic8.de:443/shop/";

    @Test
    public void getCategories() {
        String api_url = API_ROOT + "/categories/";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(api_url, JsonNode.class);
        log.info(jsonNode.toString());
    }

    @Test
    public void getCustomers() {
        String api_url = API_ROOT + "/customers/";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(api_url, JsonNode.class);
        log.debug(jsonNode.toString());
    }

   /* @Test
    public void createCustomer() throws Exception {
        String api_url = API_ROOT + "/customers/";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> map = new HashMap<>();
        map.put("firstName", "Zack");
        map.put("lastName", "Anderson");

        JsonNode jsonNode = restTemplate.postForObject(api_url, map, JsonNode.class);

        System.out.println(jsonNode.toString());
    }
*/
}
