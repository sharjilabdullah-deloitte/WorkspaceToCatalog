package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class BasicConfigProperties {

    @Value("${sony.ci.bearer.token}")
    private String bearerToken;

    @Value("${sony.ci.workspace.id}")
    private String workspaceId;
}
