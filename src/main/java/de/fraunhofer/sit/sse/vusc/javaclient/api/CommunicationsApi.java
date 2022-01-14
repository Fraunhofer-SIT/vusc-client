/*
 * Public API
 * Assessment API
 *
 * The version of the OpenAPI document: 0.1
 * Contact: helpdesk@codeinspect.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.fraunhofer.sit.sse.vusc.javaclient.api;

import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ApiCallback;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ApiClient;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ApiException;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ApiResponse;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.Configuration;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.Pair;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ProgressRequestBody;
import de.fraunhofer.sit.sse.vusc.javaclient.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import de.fraunhofer.sit.sse.vusc.javaclient.models.HostTLSConfiguration;
import de.fraunhofer.sit.sse.vusc.javaclient.models.ModelAPIException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommunicationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CommunicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommunicationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for checkHostTLSConfiguration
     * @param hostname The Host to check (required)
     * @param forcerefresh Whether to update regardless on whether the host has been checked already (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Not ready - The check has not been completed yet, try again later </td><td>  -  </td></tr>
        <tr><td> 203 </td><td> Could not complete check </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Wrong input </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkHostTLSConfigurationCall(String hostname, Boolean forcerefresh, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/communications/checkHostTLSConfig";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hostname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hostname", hostname));
        }

        if (forcerefresh != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("forcerefresh", forcerefresh));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkHostTLSConfigurationValidateBeforeCall(String hostname, Boolean forcerefresh, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new ApiException("Missing the required parameter 'hostname' when calling checkHostTLSConfiguration(Async)");
        }
        
        // verify the required parameter 'forcerefresh' is set
        if (forcerefresh == null) {
            throw new ApiException("Missing the required parameter 'forcerefresh' when calling checkHostTLSConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = checkHostTLSConfigurationCall(hostname, forcerefresh, _callback);
        return localVarCall;

    }

    /**
     * Checks a host name for the TLS configuration.
     * Checks a host for the TLS configuration. Note that this functionality triggers the server to connect to the specified host name.
     * @param hostname The Host to check (required)
     * @param forcerefresh Whether to update regardless on whether the host has been checked already (required)
     * @return HostTLSConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Not ready - The check has not been completed yet, try again later </td><td>  -  </td></tr>
        <tr><td> 203 </td><td> Could not complete check </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Wrong input </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
     </table>
     */
    public HostTLSConfiguration checkHostTLSConfiguration(String hostname, Boolean forcerefresh) throws ApiException {
        ApiResponse<HostTLSConfiguration> localVarResp = checkHostTLSConfigurationWithHttpInfo(hostname, forcerefresh);
        return localVarResp.getData();
    }

    /**
     * Checks a host name for the TLS configuration.
     * Checks a host for the TLS configuration. Note that this functionality triggers the server to connect to the specified host name.
     * @param hostname The Host to check (required)
     * @param forcerefresh Whether to update regardless on whether the host has been checked already (required)
     * @return ApiResponse&lt;HostTLSConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Not ready - The check has not been completed yet, try again later </td><td>  -  </td></tr>
        <tr><td> 203 </td><td> Could not complete check </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Wrong input </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HostTLSConfiguration> checkHostTLSConfigurationWithHttpInfo(String hostname, Boolean forcerefresh) throws ApiException {
        okhttp3.Call localVarCall = checkHostTLSConfigurationValidateBeforeCall(hostname, forcerefresh, null);
        Type localVarReturnType = new TypeToken<HostTLSConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Checks a host name for the TLS configuration. (asynchronously)
     * Checks a host for the TLS configuration. Note that this functionality triggers the server to connect to the specified host name.
     * @param hostname The Host to check (required)
     * @param forcerefresh Whether to update regardless on whether the host has been checked already (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Not ready - The check has not been completed yet, try again later </td><td>  -  </td></tr>
        <tr><td> 203 </td><td> Could not complete check </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Wrong input </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkHostTLSConfigurationAsync(String hostname, Boolean forcerefresh, final ApiCallback<HostTLSConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkHostTLSConfigurationValidateBeforeCall(hostname, forcerefresh, _callback);
        Type localVarReturnType = new TypeToken<HostTLSConfiguration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
