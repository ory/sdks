/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.ErrorOAuth2;
import sh.ory.model.JsonWebKeySet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WellknownApi
 */
@Disabled
public class WellknownApiTest {

    private final WellknownApi api = new WellknownApi();

    /**
     * Discover Well-Known JSON Web Keys
     *
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discoverJsonWebKeysTest() throws ApiException {
        JsonWebKeySet response = api.discoverJsonWebKeys();
        // TODO: test validations
    }

}
