=begin
#ORY Hydra

#Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.

The version of the OpenAPI document: latest

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for ORYHydraClient::RejectRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'RejectRequest' do
  before do
    # run before each test
    @instance = ORYHydraClient::RejectRequest.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of RejectRequest' do
    it 'should create an instance of RejectRequest' do
      expect(@instance).to be_instance_of(ORYHydraClient::RejectRequest)
    end
  end
  describe 'test attribute "error"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "error_debug"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "error_description"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "error_hint"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "status_code"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
