=begin
#Ory Hydra API

#Documentation for all of Ory Hydra's APIs. 

The version of the OpenAPI document: v2.0.2
Contact: hi@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryHydraClient::TokenPaginationRequestParameters
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryHydraClient::TokenPaginationRequestParameters do
  let(:instance) { OryHydraClient::TokenPaginationRequestParameters.new }

  describe 'test an instance of TokenPaginationRequestParameters' do
    it 'should create an instance of TokenPaginationRequestParameters' do
      expect(instance).to be_instance_of(OryHydraClient::TokenPaginationRequestParameters)
    end
  end
  describe 'test attribute "page_size"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "page_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
