=begin
#Ory Identities API

#This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

The version of the OpenAPI document: v0.11.0
Contact: office@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryKratosClient::UpdateRecoveryFlowBody
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryKratosClient::UpdateRecoveryFlowBody do
  describe '.openapi_one_of' do
    it 'lists the items referenced in the oneOf array' do
      expect(described_class.openapi_one_of).to_not be_empty
    end
  end

  describe '.openapi_discriminator_name' do
    it 'returns the value of the "discriminator" property' do
      expect(described_class.openapi_discriminator_name).to_not be_empty
    end
  end

  describe '.openapi_discriminator_mapping' do
    it 'returns the key/values of the "mapping" property' do
      expect(described_class.openapi_discriminator_mapping.values.sort).to eq(described_class.openapi_one_of.sort)
    end
  end

  describe '.build' do
    it 'returns the correct model' do
    end
  end
end
