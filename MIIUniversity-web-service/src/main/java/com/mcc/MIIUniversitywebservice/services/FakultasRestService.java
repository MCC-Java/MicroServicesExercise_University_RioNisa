/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.services;

import com.mcc.MIIUniversitywebservice.entities.Fakultas;
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
public class FakultasRestService {
    private final String uri ="http://localhost:8085/api/fakultas";
    private static final RestTemplate restTemplate = new RestTemplate();
    
    public List<Fakultas> getAll(){
        ResponseEntity<List<Fakultas>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Fakultas>>(){
                });
List<Fakultas> result = response.getBody();
return result;
    }
    public void save(Fakultas fakultas){
        Fakultas result = restTemplate.postForObject(uri +"/save", fakultas, Fakultas.class);
    }
    public void delete (String id){
        Map<String, String> params = new HashMap<>();
        params.put("id",id);
        restTemplate.delete(uri +"/{id}", params);
    }
    public Fakultas getById(Integer id){
          Map<String, Integer> params = new HashMap<>();
          params.put("id", id);
          
          Fakultas result = restTemplate.getForObject(uri + "/{id}", Fakultas.class, params);
          
          return result;
    }
}
