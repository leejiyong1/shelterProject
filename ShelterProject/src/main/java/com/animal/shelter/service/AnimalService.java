package com.animal.shelter.service;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service
public class AnimalService {
	
	@Autowired
    private RestTemplate restTemplate;
    @Value("${my.api.key}")
    private String apiKey;

    public String getAbandonedAnimals() throws Exception {
        // 이미 인코딩된 API 키를 사용할 경우 아래 인코딩 과정 생략
        System.out.println("apikey:"+apiKey);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.odcloud.kr/api")
                .path("/15040381/v1/uddi:476e8e1b-9973-432b-a0ca-cba08bda7085")
                .queryParam("page", "1")
                .queryParam("perPage", "10")
                // 인코딩된 API 키를 쿼리 파라미터로 추가
                .queryParam("serviceKey", apiKey); 

        String uriString = builder.build().toUriString(); // 인코딩을 추가로 적용하지 않음
        URI uri = new URI(uriString);
        System.out.println("uri:" + uri);
        return restTemplate.getForObject(uri, String.class);
        
        
    }
}