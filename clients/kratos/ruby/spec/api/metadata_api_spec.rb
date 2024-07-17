=begin
#Ory Identities API

#This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

The version of the OpenAPI document: v1.2.1
Contact: office@ory.sh
Generated by: https://openapi-generator.tech
Generator version: 7.7.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OryKratosClient::MetadataApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MetadataApi' do
  before do
    # run before each test
    @api_instance = OryKratosClient::MetadataApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MetadataApi' do
    it 'should create an instance of MetadataApi' do
      expect(@api_instance).to be_instance_of(OryKratosClient::MetadataApi)
    end
  end

  # unit tests for get_version
  # Return Running Software Version.
  # This endpoint returns the version of Ory Kratos.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the version will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [GetVersion200Response]
  describe 'get_version test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for is_alive
  # Check HTTP Server Status
  # This endpoint returns a HTTP 200 status code when Ory Kratos is accepting incoming HTTP requests. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [IsAlive200Response]
  describe 'is_alive test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for is_ready
  # Check HTTP Server and Database Status
  # This endpoint returns a HTTP 200 status code when Ory Kratos is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of Ory Kratos, the health status will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [IsAlive200Response]
  describe 'is_ready test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
