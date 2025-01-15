<?php
/**
 * CreateIdentityBody
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       |
 *
 * The version of the OpenAPI document: v1.16.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.7.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Client\Model;

use \ArrayAccess;
use \Ory\Client\ObjectSerializer;

/**
 * CreateIdentityBody Class Doc Comment
 *
 * @category Class
 * @description Create Identity Body
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CreateIdentityBody implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'createIdentityBody';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'credentials' => '\Ory\Client\Model\IdentityWithCredentials',
        'metadataAdmin' => 'mixed',
        'metadataPublic' => 'mixed',
        'recoveryAddresses' => '\Ory\Client\Model\RecoveryIdentityAddress[]',
        'schemaId' => 'string',
        'state' => 'string',
        'traits' => 'object',
        'verifiableAddresses' => '\Ory\Client\Model\VerifiableIdentityAddress[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'credentials' => null,
        'metadataAdmin' => null,
        'metadataPublic' => null,
        'recoveryAddresses' => null,
        'schemaId' => null,
        'state' => null,
        'traits' => null,
        'verifiableAddresses' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'credentials' => false,
        'metadataAdmin' => true,
        'metadataPublic' => true,
        'recoveryAddresses' => false,
        'schemaId' => false,
        'state' => false,
        'traits' => false,
        'verifiableAddresses' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'credentials' => 'credentials',
        'metadataAdmin' => 'metadata_admin',
        'metadataPublic' => 'metadata_public',
        'recoveryAddresses' => 'recovery_addresses',
        'schemaId' => 'schema_id',
        'state' => 'state',
        'traits' => 'traits',
        'verifiableAddresses' => 'verifiable_addresses'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'credentials' => 'setCredentials',
        'metadataAdmin' => 'setMetadataAdmin',
        'metadataPublic' => 'setMetadataPublic',
        'recoveryAddresses' => 'setRecoveryAddresses',
        'schemaId' => 'setSchemaId',
        'state' => 'setState',
        'traits' => 'setTraits',
        'verifiableAddresses' => 'setVerifiableAddresses'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'credentials' => 'getCredentials',
        'metadataAdmin' => 'getMetadataAdmin',
        'metadataPublic' => 'getMetadataPublic',
        'recoveryAddresses' => 'getRecoveryAddresses',
        'schemaId' => 'getSchemaId',
        'state' => 'getState',
        'traits' => 'getTraits',
        'verifiableAddresses' => 'getVerifiableAddresses'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    public const STATE_ACTIVE = 'active';
    public const STATE_INACTIVE = 'inactive';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getStateAllowableValues()
    {
        return [
            self::STATE_ACTIVE,
            self::STATE_INACTIVE,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('credentials', $data ?? [], null);
        $this->setIfExists('metadataAdmin', $data ?? [], null);
        $this->setIfExists('metadataPublic', $data ?? [], null);
        $this->setIfExists('recoveryAddresses', $data ?? [], null);
        $this->setIfExists('schemaId', $data ?? [], null);
        $this->setIfExists('state', $data ?? [], null);
        $this->setIfExists('traits', $data ?? [], null);
        $this->setIfExists('verifiableAddresses', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['schemaId'] === null) {
            $invalidProperties[] = "'schemaId' can't be null";
        }
        $allowedValues = $this->getStateAllowableValues();
        if (!is_null($this->container['state']) && !in_array($this->container['state'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'state', must be one of '%s'",
                $this->container['state'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['traits'] === null) {
            $invalidProperties[] = "'traits' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets credentials
     *
     * @return \Ory\Client\Model\IdentityWithCredentials|null
     */
    public function getCredentials()
    {
        return $this->container['credentials'];
    }

    /**
     * Sets credentials
     *
     * @param \Ory\Client\Model\IdentityWithCredentials|null $credentials credentials
     *
     * @return self
     */
    public function setCredentials($credentials)
    {
        if (is_null($credentials)) {
            throw new \InvalidArgumentException('non-nullable credentials cannot be null');
        }
        $this->container['credentials'] = $credentials;

        return $this;
    }

    /**
     * Gets metadataAdmin
     *
     * @return mixed|null
     */
    public function getMetadataAdmin()
    {
        return $this->container['metadataAdmin'];
    }

    /**
     * Sets metadataAdmin
     *
     * @param mixed|null $metadataAdmin Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
     *
     * @return self
     */
    public function setMetadataAdmin($metadataAdmin)
    {
        if (is_null($metadataAdmin)) {
            array_push($this->openAPINullablesSetToNull, 'metadataAdmin');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('metadataAdmin', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['metadataAdmin'] = $metadataAdmin;

        return $this;
    }

    /**
     * Gets metadataPublic
     *
     * @return mixed|null
     */
    public function getMetadataPublic()
    {
        return $this->container['metadataPublic'];
    }

    /**
     * Sets metadataPublic
     *
     * @param mixed|null $metadataPublic Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
     *
     * @return self
     */
    public function setMetadataPublic($metadataPublic)
    {
        if (is_null($metadataPublic)) {
            array_push($this->openAPINullablesSetToNull, 'metadataPublic');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('metadataPublic', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['metadataPublic'] = $metadataPublic;

        return $this;
    }

    /**
     * Gets recoveryAddresses
     *
     * @return \Ory\Client\Model\RecoveryIdentityAddress[]|null
     */
    public function getRecoveryAddresses()
    {
        return $this->container['recoveryAddresses'];
    }

    /**
     * Sets recoveryAddresses
     *
     * @param \Ory\Client\Model\RecoveryIdentityAddress[]|null $recoveryAddresses RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
     *
     * @return self
     */
    public function setRecoveryAddresses($recoveryAddresses)
    {
        if (is_null($recoveryAddresses)) {
            throw new \InvalidArgumentException('non-nullable recoveryAddresses cannot be null');
        }
        $this->container['recoveryAddresses'] = $recoveryAddresses;

        return $this;
    }

    /**
     * Gets schemaId
     *
     * @return string
     */
    public function getSchemaId()
    {
        return $this->container['schemaId'];
    }

    /**
     * Sets schemaId
     *
     * @param string $schemaId SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
     *
     * @return self
     */
    public function setSchemaId($schemaId)
    {
        if (is_null($schemaId)) {
            throw new \InvalidArgumentException('non-nullable schemaId cannot be null');
        }
        $this->container['schemaId'] = $schemaId;

        return $this;
    }

    /**
     * Gets state
     *
     * @return string|null
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     *
     * @param string|null $state State is the identity's state. active StateActive inactive StateInactive
     *
     * @return self
     */
    public function setState($state)
    {
        if (is_null($state)) {
            throw new \InvalidArgumentException('non-nullable state cannot be null');
        }
        $allowedValues = $this->getStateAllowableValues();
        if (!in_array($state, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'state', must be one of '%s'",
                    $state,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets traits
     *
     * @return object
     */
    public function getTraits()
    {
        return $this->container['traits'];
    }

    /**
     * Sets traits
     *
     * @param object $traits Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
     *
     * @return self
     */
    public function setTraits($traits)
    {
        if (is_null($traits)) {
            throw new \InvalidArgumentException('non-nullable traits cannot be null');
        }
        $this->container['traits'] = $traits;

        return $this;
    }

    /**
     * Gets verifiableAddresses
     *
     * @return \Ory\Client\Model\VerifiableIdentityAddress[]|null
     */
    public function getVerifiableAddresses()
    {
        return $this->container['verifiableAddresses'];
    }

    /**
     * Sets verifiableAddresses
     *
     * @param \Ory\Client\Model\VerifiableIdentityAddress[]|null $verifiableAddresses VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
     *
     * @return self
     */
    public function setVerifiableAddresses($verifiableAddresses)
    {
        if (is_null($verifiableAddresses)) {
            throw new \InvalidArgumentException('non-nullable verifiableAddresses cannot be null');
        }
        $this->container['verifiableAddresses'] = $verifiableAddresses;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


