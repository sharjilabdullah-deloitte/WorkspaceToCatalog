package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.service;

import com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto.WorkspaceContentDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorkspaceContentService {

    private RestTemplate restTemplate;

    @Value("${token}")
    private String token;
    @Value("$(URL)")
    private String URL;

    private WorkspaceContentDto workspaceContentDto;

    @Autowired
    public WorkspaceContentService (RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        this.workspaceContentDto = new WorkspaceContentDto();
    }

    public ResponseEntity<WorkspaceContentDto> printFolderName () throws JsonProcessingException {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(token);
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity <WorkspaceContentDto> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, entity, new ParameterizedTypeReference<>() { });
        System.out.println("Hellooooooo --- >>>");
        return  responseEntity;
    }
}
