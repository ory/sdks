=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v1.1.10
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryClient::VerificationFlowState
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryClient::VerificationFlowState do
  let(:instance) { OryClient::VerificationFlowState.new }

  describe 'test an instance of VerificationFlowState' do
    it 'should create an instance of VerificationFlowState' do
      expect(instance).to be_instance_of(OryClient::VerificationFlowState)
    end
  end
end
