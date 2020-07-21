/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.services;

import com.mcc.MIIUniversitywebservice.entities.Siswa;
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
public class SiswaRestService {
    private final String uri ="http://localhost:8085/api/siswa";
    private static final RestTemplate restTemplate = new RestTemplate();
    
    public List<Siswa> getAll(){
        ResponseEntity<List<Siswa>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Siswa>>(){
                });
List<Siswa> result = response.getBody();
return result;
    }
    public void save(Siswa siswa){
        Siswa result = restTemplate.postForObject(uri +"/siswasave", siswa, Siswa.class);
    }
    public void delete (Integer id){
        Map<String, Integer> params = new HashMap<>();
        params.put("id",id);
        restTemplate.delete(uri +"/siswadelete/{id}", params);
    }
    public Siswa getById(Integer id){
          Map<String, Integer> params = new HashMap<>();
          params.put("id", id);
          
          Siswa result = restTemplate.getForObject(uri + "/siswa/{id}", Siswa.class, params);
          
          return result;
    }
}
