package com.shrisha.autoclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.DefaultOAuth2RequestAuthenticator;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by sradhakrishna on 5/2/15.
 */
@Configuration
@EnableOAuth2Client
public class OAuth2ClientConfig {

    @Autowired
    Environment environment;

    @Value("${automatic.accessTokenUrl}")
    private String accessTokenUri;

    @Value("${automatic.authorizeUrl}")
    private String authorizeUrl;

    @Value("${automatic.clientId}")
    private String clientId;

    @Value("${automatic.clientSecret}")
    private String clientSecret;

    @Bean
    public OAuth2ProtectedResourceDetails automaticOAuth2Details() {
        AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
        details.setId("automatic");
        if(clientId.equals("clientIdGoesHere"))
            clientId= environment.getProperty("automatic.clientId");
        details.setClientId(clientId);
        if(clientId.equals("clientSecretGoesHere"))
            clientId= environment.getProperty("automatic.clientSecret");
        details.setClientSecret(clientSecret);
        details.setAccessTokenUri(accessTokenUri);
        details.setUserAuthorizationUri(authorizeUrl);
        details.setScope(Arrays.asList("scope:user:profile", "scope:vehicle:events", "scope:behavior", "scope:vehicle:profile", "scope:trip", "scope:location", "scope:current_location"));
        details.setUseCurrentUri(false);
        details.setClientAuthenticationScheme(AuthenticationScheme.form);
        return details;
    }

    @Bean
    public OAuth2RestTemplate automaticRestTemplate(OAuth2ClientContext clientContext) {
        return new OAuth2RestTemplate(automaticOAuth2Details(), clientContext);
    }

}
