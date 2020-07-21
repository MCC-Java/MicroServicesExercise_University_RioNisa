/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.services;

import com.mcc.MIIUniversitywebservice.entities.Jurusan;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Laila
 */
@Service
public class JurusanRestService {
    private final String uri ="http://localhost:8085/api/jurusan";
    private static final RestTemplate restTemplate = new RestTemplate();
    
    public List<Jurusan> getAll(){
        ResponseEntity<List<Jurusan>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Jurusan>>(){
                });
List<Jurusan> result = response.getBody();
return result;
    }
    public void save(Jurusan jurusan){
        Jurusan result = restTemplate.postForObject(uri +"/jurusansave", jurusan, Jurusan.class);
    }
    public void delete (String id){
        Map<String, String> params = new HashMap<>();
        params.put("id",id);
        restTemplate.delete(uri +"/jurusandelete/{id}", params);
    }
    public Jurusan getById(Integer id){
          Map<String, Integer> params = new HashMap<>();
          params.put("id", id);
          
          Jurusan result = restTemplate.getForObject(uri + "/jurusan/{id}", Jurusan.class, params);
          
          return result;
    }
}
