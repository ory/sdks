=begin
#Ory Kratos

#Welcome to the ORY Kratos HTTP API documentation!

The version of the OpenAPI document: v0.5.0-alpha.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryHydraClient::CreateRecoveryLink
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'CreateRecoveryLink' do
  before do
    # run before each test
    @instance = OryHydraClient::CreateRecoveryLink.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CreateRecoveryLink' do
    it 'should create an instance of CreateRecoveryLink' do
      expect(@instance).to be_instance_of(OryHydraClient::CreateRecoveryLink)
    end
  end
  describe 'test attribute "expires_in"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "identity_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
