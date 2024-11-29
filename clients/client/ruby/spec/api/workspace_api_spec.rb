=begin
#Ory APIs

## Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

The version of the OpenAPI document: v1.15.13
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
Generator version: 7.7.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OryClient::WorkspaceApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'WorkspaceApi' do
  before do
    # run before each test
    @api_instance = OryClient::WorkspaceApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of WorkspaceApi' do
    it 'should create an instance of WorkspaceApi' do
      expect(@api_instance).to be_instance_of(OryClient::WorkspaceApi)
    end
  end

  # unit tests for create_workspace
  # Create a new workspace
  # @param [Hash] opts the optional parameters
  # @option opts [CreateWorkspaceBody] :create_workspace_body 
  # @return [Workspace]
  describe 'create_workspace test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for create_workspace_api_key
  # Create workspace API key
  # Create an API key for a workspace.
  # @param workspace The Workspace ID
  # @param [Hash] opts the optional parameters
  # @option opts [CreateWorkspaceApiKeyBody] :create_workspace_api_key_body 
  # @return [WorkspaceApiKey]
  describe 'create_workspace_api_key test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for delete_workspace_api_key
  # Delete workspace API key
  # Deletes an API key and immediately removes it.
  # @param workspace The Workspace ID or Workspace slug
  # @param token_id The Token ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_workspace_api_key test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for get_workspace
  # Get a workspace
  # Any workspace member can access this endpoint.
  # @param workspace 
  # @param [Hash] opts the optional parameters
  # @return [Workspace]
  describe 'get_workspace test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for list_workspace_api_keys
  # List a workspace&#39;s API keys
  # A list of all the workspace&#39;s API keys.
  # @param workspace The Workspace ID or Workspace slug
  # @param [Hash] opts the optional parameters
  # @return [Array<WorkspaceApiKey>]
  describe 'list_workspace_api_keys test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for list_workspace_projects
  # List all projects of a workspace
  # Any workspace member can access this endpoint.
  # @param workspace 
  # @param [Hash] opts the optional parameters
  # @return [ListWorkspaceProjects]
  describe 'list_workspace_projects test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for list_workspaces
  # List workspaces the user is a member of
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page_size Items per Page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
  # @option opts [String] :page_token Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
  # @return [ListWorkspaces]
  describe 'list_workspaces test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for update_workspace
  # Update an workspace
  # Workspace members with the role &#x60;OWNER&#x60; can access this endpoint.
  # @param workspace 
  # @param [Hash] opts the optional parameters
  # @option opts [UpdateWorkspaceBody] :update_workspace_body 
  # @return [Workspace]
  describe 'update_workspace test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
