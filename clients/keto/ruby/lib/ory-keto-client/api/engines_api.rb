=begin
#ORY Keto

#A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.

The version of the OpenAPI document: v0.0.0-alpha.1
Contact: hi@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'cgi'

module OryHydraClient
  class EnginesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add a member to an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @option opts [AddOryAccessControlPolicyRoleMembersBody] :body 
    # @return [OryAccessControlPolicyRole]
    def add_ory_access_control_policy_role_members(flavor, id, opts = {})
      data, _status_code, _headers = add_ory_access_control_policy_role_members_with_http_info(flavor, id, opts)
      data
    end

    # Add a member to an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @option opts [AddOryAccessControlPolicyRoleMembersBody] :body 
    # @return [Array<(OryAccessControlPolicyRole, Integer, Hash)>] OryAccessControlPolicyRole data, response status code and response headers
    def add_ory_access_control_policy_role_members_with_http_info(flavor, id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.add_ory_access_control_policy_role_members ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.add_ory_access_control_policy_role_members"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.add_ory_access_control_policy_role_members"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles/{id}/members'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'body']) 

      # return_type
      return_type = opts[:return_type] || 'OryAccessControlPolicyRole' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#add_ory_access_control_policy_role_members\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_ory_access_control_policy(flavor, id, opts = {})
      delete_ory_access_control_policy_with_http_info(flavor, id, opts)
      nil
    end

    # Delete an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_ory_access_control_policy_with_http_info(flavor, id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.delete_ory_access_control_policy ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.delete_ory_access_control_policy"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.delete_ory_access_control_policy"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/policies/{id}'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#delete_ory_access_control_policy\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_ory_access_control_policy_role(flavor, id, opts = {})
      delete_ory_access_control_policy_role_with_http_info(flavor, id, opts)
      nil
    end

    # Delete an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_ory_access_control_policy_role_with_http_info(flavor, id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.delete_ory_access_control_policy_role ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.delete_ory_access_control_policy_role"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.delete_ory_access_control_policy_role"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles/{id}'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#delete_ory_access_control_policy_role\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Check if a request is allowed
    # Use this endpoint to check if a request is allowed or not. If the request is allowed, a 200 response with `{\"allowed\":\"true\"}` will be sent. If the request is denied, a 403 response with `{\"allowed\":\"false\"}` will be sent instead.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicyAllowedInput] :body 
    # @return [AuthorizationResult]
    def do_ory_access_control_policies_allow(flavor, opts = {})
      data, _status_code, _headers = do_ory_access_control_policies_allow_with_http_info(flavor, opts)
      data
    end

    # Check if a request is allowed
    # Use this endpoint to check if a request is allowed or not. If the request is allowed, a 200 response with &#x60;{\&quot;allowed\&quot;:\&quot;true\&quot;}&#x60; will be sent. If the request is denied, a 403 response with &#x60;{\&quot;allowed\&quot;:\&quot;false\&quot;}&#x60; will be sent instead.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicyAllowedInput] :body 
    # @return [Array<(AuthorizationResult, Integer, Hash)>] AuthorizationResult data, response status code and response headers
    def do_ory_access_control_policies_allow_with_http_info(flavor, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.do_ory_access_control_policies_allow ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.do_ory_access_control_policies_allow"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/allowed'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'body']) 

      # return_type
      return_type = opts[:return_type] || 'AuthorizationResult' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#do_ory_access_control_policies_allow\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [OryAccessControlPolicy]
    def get_ory_access_control_policy(flavor, id, opts = {})
      data, _status_code, _headers = get_ory_access_control_policy_with_http_info(flavor, id, opts)
      data
    end

    # Get an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [Array<(OryAccessControlPolicy, Integer, Hash)>] OryAccessControlPolicy data, response status code and response headers
    def get_ory_access_control_policy_with_http_info(flavor, id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.get_ory_access_control_policy ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.get_ory_access_control_policy"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.get_ory_access_control_policy"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/policies/{id}'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'OryAccessControlPolicy' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#get_ory_access_control_policy\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [OryAccessControlPolicyRole]
    def get_ory_access_control_policy_role(flavor, id, opts = {})
      data, _status_code, _headers = get_ory_access_control_policy_role_with_http_info(flavor, id, opts)
      data
    end

    # Get an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param [Hash] opts the optional parameters
    # @return [Array<(OryAccessControlPolicyRole, Integer, Hash)>] OryAccessControlPolicyRole data, response status code and response headers
    def get_ory_access_control_policy_role_with_http_info(flavor, id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.get_ory_access_control_policy_role ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.get_ory_access_control_policy_role"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.get_ory_access_control_policy_role"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles/{id}'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'OryAccessControlPolicyRole' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#get_ory_access_control_policy_role\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List ORY Access Control Policies
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum amount of policies returned.
    # @option opts [Integer] :offset The offset from where to start looking.
    # @option opts [String] :subject The subject for whom the policies are to be listed.
    # @option opts [String] :resource The resource for which the policies are to be listed.
    # @option opts [String] :action The action for which policies are to be listed.
    # @return [Array<OryAccessControlPolicy>]
    def list_ory_access_control_policies(flavor, opts = {})
      data, _status_code, _headers = list_ory_access_control_policies_with_http_info(flavor, opts)
      data
    end

    # List ORY Access Control Policies
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum amount of policies returned.
    # @option opts [Integer] :offset The offset from where to start looking.
    # @option opts [String] :subject The subject for whom the policies are to be listed.
    # @option opts [String] :resource The resource for which the policies are to be listed.
    # @option opts [String] :action The action for which policies are to be listed.
    # @return [Array<(Array<OryAccessControlPolicy>, Integer, Hash)>] Array<OryAccessControlPolicy> data, response status code and response headers
    def list_ory_access_control_policies_with_http_info(flavor, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.list_ory_access_control_policies ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.list_ory_access_control_policies"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/policies'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'offset'] = opts[:'offset'] if !opts[:'offset'].nil?
      query_params[:'subject'] = opts[:'subject'] if !opts[:'subject'].nil?
      query_params[:'resource'] = opts[:'resource'] if !opts[:'resource'].nil?
      query_params[:'action'] = opts[:'action'] if !opts[:'action'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'Array<OryAccessControlPolicy>' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#list_ory_access_control_policies\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List ORY Access Control Policy Roles
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum amount of policies returned.
    # @option opts [Integer] :offset The offset from where to start looking.
    # @option opts [String] :member The member for which the roles are to be listed.
    # @return [Array<OryAccessControlPolicyRole>]
    def list_ory_access_control_policy_roles(flavor, opts = {})
      data, _status_code, _headers = list_ory_access_control_policy_roles_with_http_info(flavor, opts)
      data
    end

    # List ORY Access Control Policy Roles
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :limit The maximum amount of policies returned.
    # @option opts [Integer] :offset The offset from where to start looking.
    # @option opts [String] :member The member for which the roles are to be listed.
    # @return [Array<(Array<OryAccessControlPolicyRole>, Integer, Hash)>] Array<OryAccessControlPolicyRole> data, response status code and response headers
    def list_ory_access_control_policy_roles_with_http_info(flavor, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.list_ory_access_control_policy_roles ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.list_ory_access_control_policy_roles"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'offset'] = opts[:'offset'] if !opts[:'offset'].nil?
      query_params[:'member'] = opts[:'member'] if !opts[:'member'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'Array<OryAccessControlPolicyRole>' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#list_ory_access_control_policy_roles\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Remove a member from an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param member [String] The member to be removed.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def remove_ory_access_control_policy_role_members(flavor, id, member, opts = {})
      remove_ory_access_control_policy_role_members_with_http_info(flavor, id, member, opts)
      nil
    end

    # Remove a member from an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param id [String] The ID of the ORY Access Control Policy Role.
    # @param member [String] The member to be removed.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def remove_ory_access_control_policy_role_members_with_http_info(flavor, id, member, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.remove_ory_access_control_policy_role_members ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.remove_ory_access_control_policy_role_members"
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EnginesApi.remove_ory_access_control_policy_role_members"
      end
      # verify the required parameter 'member' is set
      if @api_client.config.client_side_validation && member.nil?
        fail ArgumentError, "Missing the required parameter 'member' when calling EnginesApi.remove_ory_access_control_policy_role_members"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles/{id}/members/{member}'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s)).sub('{' + 'id' + '}', CGI.escape(id.to_s)).sub('{' + 'member' + '}', CGI.escape(member.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#remove_ory_access_control_policy_role_members\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Upsert an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicy] :body 
    # @return [OryAccessControlPolicy]
    def upsert_ory_access_control_policy(flavor, opts = {})
      data, _status_code, _headers = upsert_ory_access_control_policy_with_http_info(flavor, opts)
      data
    end

    # Upsert an ORY Access Control Policy
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicy] :body 
    # @return [Array<(OryAccessControlPolicy, Integer, Hash)>] OryAccessControlPolicy data, response status code and response headers
    def upsert_ory_access_control_policy_with_http_info(flavor, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.upsert_ory_access_control_policy ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.upsert_ory_access_control_policy"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/policies'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'body']) 

      # return_type
      return_type = opts[:return_type] || 'OryAccessControlPolicy' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#upsert_ory_access_control_policy\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Upsert an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicyRole] :body 
    # @return [OryAccessControlPolicyRole]
    def upsert_ory_access_control_policy_role(flavor, opts = {})
      data, _status_code, _headers = upsert_ory_access_control_policy_role_with_http_info(flavor, opts)
      data
    end

    # Upsert an ORY Access Control Policy Role
    # Roles group several subjects into one. Rules can be assigned to ORY Access Control Policy (OACP) by using the Role ID as subject in the OACP.
    # @param flavor [String] The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.
    # @param [Hash] opts the optional parameters
    # @option opts [OryAccessControlPolicyRole] :body 
    # @return [Array<(OryAccessControlPolicyRole, Integer, Hash)>] OryAccessControlPolicyRole data, response status code and response headers
    def upsert_ory_access_control_policy_role_with_http_info(flavor, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EnginesApi.upsert_ory_access_control_policy_role ...'
      end
      # verify the required parameter 'flavor' is set
      if @api_client.config.client_side_validation && flavor.nil?
        fail ArgumentError, "Missing the required parameter 'flavor' when calling EnginesApi.upsert_ory_access_control_policy_role"
      end
      # resource path
      local_var_path = '/engines/acp/ory/{flavor}/roles'.sub('{' + 'flavor' + '}', CGI.escape(flavor.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'body']) 

      # return_type
      return_type = opts[:return_type] || 'OryAccessControlPolicyRole' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EnginesApi#upsert_ory_access_control_policy_role\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
