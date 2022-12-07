=begin
#Ory Identities API

#This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

The version of the OpenAPI document: v0.11.0
Contact: office@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'date'
require 'time'

module OryKratosClient
  # Create Identity Body
  class CreateIdentityBody
    attr_accessor :credentials

    # Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
    attr_accessor :metadata_admin

    # Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
    attr_accessor :metadata_public

    # RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
    attr_accessor :recovery_addresses

    # SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
    attr_accessor :schema_id

    attr_accessor :state

    # Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
    attr_accessor :traits

    # VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
    attr_accessor :verifiable_addresses

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'credentials' => :'credentials',
        :'metadata_admin' => :'metadata_admin',
        :'metadata_public' => :'metadata_public',
        :'recovery_addresses' => :'recovery_addresses',
        :'schema_id' => :'schema_id',
        :'state' => :'state',
        :'traits' => :'traits',
        :'verifiable_addresses' => :'verifiable_addresses'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'credentials' => :'IdentityWithCredentials',
        :'metadata_admin' => :'Object',
        :'metadata_public' => :'Object',
        :'recovery_addresses' => :'Array<RecoveryIdentityAddress>',
        :'schema_id' => :'String',
        :'state' => :'IdentityState',
        :'traits' => :'Object',
        :'verifiable_addresses' => :'Array<VerifiableIdentityAddress>'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'metadata_admin',
        :'metadata_public',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OryKratosClient::CreateIdentityBody` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OryKratosClient::CreateIdentityBody`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'credentials')
        self.credentials = attributes[:'credentials']
      end

      if attributes.key?(:'metadata_admin')
        self.metadata_admin = attributes[:'metadata_admin']
      end

      if attributes.key?(:'metadata_public')
        self.metadata_public = attributes[:'metadata_public']
      end

      if attributes.key?(:'recovery_addresses')
        if (value = attributes[:'recovery_addresses']).is_a?(Array)
          self.recovery_addresses = value
        end
      end

      if attributes.key?(:'schema_id')
        self.schema_id = attributes[:'schema_id']
      end

      if attributes.key?(:'state')
        self.state = attributes[:'state']
      end

      if attributes.key?(:'traits')
        self.traits = attributes[:'traits']
      end

      if attributes.key?(:'verifiable_addresses')
        if (value = attributes[:'verifiable_addresses']).is_a?(Array)
          self.verifiable_addresses = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @schema_id.nil?
        invalid_properties.push('invalid value for "schema_id", schema_id cannot be nil.')
      end

      if @traits.nil?
        invalid_properties.push('invalid value for "traits", traits cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @schema_id.nil?
      return false if @traits.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          credentials == o.credentials &&
          metadata_admin == o.metadata_admin &&
          metadata_public == o.metadata_public &&
          recovery_addresses == o.recovery_addresses &&
          schema_id == o.schema_id &&
          state == o.state &&
          traits == o.traits &&
          verifiable_addresses == o.verifiable_addresses
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [credentials, metadata_admin, metadata_public, recovery_addresses, schema_id, state, traits, verifiable_addresses].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OryKratosClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
