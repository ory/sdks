/*
 * Ory Keto API
 * Documentation for all of Ory Keto's REST APIs. gRPC is documented separately. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.2
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.api;

import sh.ory.keto.ApiCallback;
import sh.ory.keto.ApiClient;
import sh.ory.keto.ApiException;
import sh.ory.keto.ApiResponse;
import sh.ory.keto.Configuration;
import sh.ory.keto.Pair;
import sh.ory.keto.ProgressRequestBody;
import sh.ory.keto.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.keto.model.ExpandTree;
import sh.ory.keto.model.GenericError;
import sh.ory.keto.model.GetCheckResponse;
import sh.ory.keto.model.GetRelationTuplesResponse;
import sh.ory.keto.model.RelationQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReadApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReadApi(ApiClient apiClient) {
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
     * Build call for getCheck
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param maxDepth  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCheckCall(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, Long maxDepth, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/check";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (subjectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_id", subjectId));
        }

        if (subjectSetNamespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.namespace", subjectSetNamespace));
        }

        if (subjectSetObject != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.object", subjectSetObject));
        }

        if (subjectSetRelation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.relation", subjectSetRelation));
        }

        if (maxDepth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max-depth", maxDepth));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCheckValidateBeforeCall(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, Long maxDepth, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCheckCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth, _callback);
        return localVarCall;

    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param maxDepth  (optional)
     * @return GetCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public GetCheckResponse getCheck(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, Long maxDepth) throws ApiException {
        ApiResponse<GetCheckResponse> localVarResp = getCheckWithHttpInfo(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        return localVarResp.getData();
    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param maxDepth  (optional)
     * @return ApiResponse&lt;GetCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCheckResponse> getCheckWithHttpInfo(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, Long maxDepth) throws ApiException {
        okhttp3.Call localVarCall = getCheckValidateBeforeCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth, null);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a relation tuple (asynchronously)
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param maxDepth  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCheckAsync(String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, Long maxDepth, final ApiCallback<GetCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCheckValidateBeforeCall(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth, _callback);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExpand
     * @param namespace Namespace of the Subject Set (required)
     * @param _object Object of the Subject Set (required)
     * @param relation Relation of the Subject Set (required)
     * @param maxDepth  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExpandCall(String namespace, String _object, String relation, Long maxDepth, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/expand";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (maxDepth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max-depth", maxDepth));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExpandValidateBeforeCall(String namespace, String _object, String relation, Long maxDepth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getExpand(Async)");
        }
        
        // verify the required parameter '_object' is set
        if (_object == null) {
            throw new ApiException("Missing the required parameter '_object' when calling getExpand(Async)");
        }
        
        // verify the required parameter 'relation' is set
        if (relation == null) {
            throw new ApiException("Missing the required parameter 'relation' when calling getExpand(Async)");
        }
        

        okhttp3.Call localVarCall = getExpandCall(namespace, _object, relation, maxDepth, _callback);
        return localVarCall;

    }

    /**
     * Expand a Relation Tuple
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Subject Set (required)
     * @param _object Object of the Subject Set (required)
     * @param relation Relation of the Subject Set (required)
     * @param maxDepth  (optional)
     * @return ExpandTree
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ExpandTree getExpand(String namespace, String _object, String relation, Long maxDepth) throws ApiException {
        ApiResponse<ExpandTree> localVarResp = getExpandWithHttpInfo(namespace, _object, relation, maxDepth);
        return localVarResp.getData();
    }

    /**
     * Expand a Relation Tuple
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Subject Set (required)
     * @param _object Object of the Subject Set (required)
     * @param relation Relation of the Subject Set (required)
     * @param maxDepth  (optional)
     * @return ApiResponse&lt;ExpandTree&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExpandTree> getExpandWithHttpInfo(String namespace, String _object, String relation, Long maxDepth) throws ApiException {
        okhttp3.Call localVarCall = getExpandValidateBeforeCall(namespace, _object, relation, maxDepth, null);
        Type localVarReturnType = new TypeToken<ExpandTree>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Expand a Relation Tuple (asynchronously)
     * Use this endpoint to expand a relation tuple.
     * @param namespace Namespace of the Subject Set (required)
     * @param _object Object of the Subject Set (required)
     * @param relation Relation of the Subject Set (required)
     * @param maxDepth  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> expandTree </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExpandAsync(String namespace, String _object, String relation, Long maxDepth, final ApiCallback<ExpandTree> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExpandValidateBeforeCall(namespace, _object, relation, maxDepth, _callback);
        Type localVarReturnType = new TypeToken<ExpandTree>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRelationTuples
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRelationTuplesCall(String pageToken, Long pageSize, String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/relation-tuples";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_token", pageToken));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (_object != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("object", _object));
        }

        if (relation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("relation", relation));
        }

        if (subjectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_id", subjectId));
        }

        if (subjectSetNamespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.namespace", subjectSetNamespace));
        }

        if (subjectSetObject != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.object", subjectSetObject));
        }

        if (subjectSetRelation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subject_set.relation", subjectSetRelation));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRelationTuplesValidateBeforeCall(String pageToken, Long pageSize, String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRelationTuplesCall(pageToken, pageSize, namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, _callback);
        return localVarCall;

    }

    /**
     * Query relation tuples
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @return GetRelationTuplesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public GetRelationTuplesResponse getRelationTuples(String pageToken, Long pageSize, String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation) throws ApiException {
        ApiResponse<GetRelationTuplesResponse> localVarResp = getRelationTuplesWithHttpInfo(pageToken, pageSize, namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation);
        return localVarResp.getData();
    }

    /**
     * Query relation tuples
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @return ApiResponse&lt;GetRelationTuplesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetRelationTuplesResponse> getRelationTuplesWithHttpInfo(String pageToken, Long pageSize, String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation) throws ApiException {
        okhttp3.Call localVarCall = getRelationTuplesValidateBeforeCall(pageToken, pageSize, namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, null);
        Type localVarReturnType = new TypeToken<GetRelationTuplesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query relation tuples (asynchronously)
     * Get all relation tuples that match the query. Only the namespace field is required.
     * @param pageToken  (optional)
     * @param pageSize  (optional)
     * @param namespace Namespace of the Relation Tuple (optional)
     * @param _object Object of the Relation Tuple (optional)
     * @param relation Relation of the Relation Tuple (optional)
     * @param subjectId SubjectID of the Relation Tuple (optional)
     * @param subjectSetNamespace Namespace of the Subject Set (optional)
     * @param subjectSetObject Object of the Subject Set (optional)
     * @param subjectSetRelation Relation of the Subject Set (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getRelationTuplesResponse </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRelationTuplesAsync(String pageToken, Long pageSize, String namespace, String _object, String relation, String subjectId, String subjectSetNamespace, String subjectSetObject, String subjectSetRelation, final ApiCallback<GetRelationTuplesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRelationTuplesValidateBeforeCall(pageToken, pageSize, namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, _callback);
        Type localVarReturnType = new TypeToken<GetRelationTuplesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postCheck
     * @param maxDepth  (optional)
     * @param relationQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCheckCall(Long maxDepth, RelationQuery relationQuery, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = relationQuery;

        // create path and map variables
        String localVarPath = "/check";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (maxDepth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max-depth", maxDepth));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postCheckValidateBeforeCall(Long maxDepth, RelationQuery relationQuery, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = postCheckCall(maxDepth, relationQuery, _callback);
        return localVarCall;

    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param maxDepth  (optional)
     * @param relationQuery  (optional)
     * @return GetCheckResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public GetCheckResponse postCheck(Long maxDepth, RelationQuery relationQuery) throws ApiException {
        ApiResponse<GetCheckResponse> localVarResp = postCheckWithHttpInfo(maxDepth, relationQuery);
        return localVarResp.getData();
    }

    /**
     * Check a relation tuple
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param maxDepth  (optional)
     * @param relationQuery  (optional)
     * @return ApiResponse&lt;GetCheckResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCheckResponse> postCheckWithHttpInfo(Long maxDepth, RelationQuery relationQuery) throws ApiException {
        okhttp3.Call localVarCall = postCheckValidateBeforeCall(maxDepth, relationQuery, null);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a relation tuple (asynchronously)
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     * @param maxDepth  (optional)
     * @param relationQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> genericError </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> getCheckResponse </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> genericError </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCheckAsync(Long maxDepth, RelationQuery relationQuery, final ApiCallback<GetCheckResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postCheckValidateBeforeCall(maxDepth, relationQuery, _callback);
        Type localVarReturnType = new TypeToken<GetCheckResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
