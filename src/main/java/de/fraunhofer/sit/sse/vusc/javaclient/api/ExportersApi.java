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


import de.fraunhofer.sit.sse.vusc.javaclient.models.ExporterInformation;
import de.fraunhofer.sit.sse.vusc.javaclient.models.ModelAPIException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExportersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExportersApi(ApiClient apiClient) {
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
     * Build call for getExporters
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExportersCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/exporters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getExportersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getExportersCall(_callback);
        return localVarCall;

    }

    /**
     * Gets all exporters installed on the system
     * Gets all components that can export VUSC data to other systems or to downloadable files.
     * @return List&lt;ExporterInformation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
     </table>
     */
    public List<ExporterInformation> getExporters() throws ApiException {
        ApiResponse<List<ExporterInformation>> localVarResp = getExportersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Gets all exporters installed on the system
     * Gets all components that can export VUSC data to other systems or to downloadable files.
     * @return ApiResponse&lt;List&lt;ExporterInformation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ExporterInformation>> getExportersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getExportersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ExporterInformation>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets all exporters installed on the system (asynchronously)
     * Gets all components that can export VUSC data to other systems or to downloadable files.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExportersAsync(final ApiCallback<List<ExporterInformation>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExportersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ExporterInformation>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
