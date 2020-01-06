# -*- encoding: utf-8 -*-

=begin
#Ory Kratos

#Welcome to the ORY Kratos HTTP API documentation!

The version of the OpenAPI document: v0.0.0-alpha.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

$:.push File.expand_path("../lib", __FILE__)
require "ory-kratos-client/version"

Gem::Specification.new do |s|
  s.name        = "ory-kratos-client"
  s.version     = OryHydraClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["ORY GmbH"]
  s.email       = ["opensource@ory.sh"]
  s.homepage    = "https://www.ory.sh"
  s.summary     = "Ory Kratos Ruby Gem"
  s.description = "Welcome to the ORY Kratos HTTP API documentation!"
  s.license     = 'Apache-2.0'
  s.required_ruby_version = ">= 1.9"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'
  s.add_runtime_dependency 'json', '~> 2.1', '>= 2.1.0'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
