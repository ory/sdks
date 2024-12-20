<?php
/**
 * Session
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
 * The version of the OpenAPI document: v1.15.16
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
 * Session Class Doc Comment
 *
 * @category Class
 * @description A Session
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Session implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'session';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'active' => 'bool',
        'authenticatedAt' => '\DateTime',
        'authenticationMethods' => '\Ory\Client\Model\SessionAuthenticationMethod[]',
        'authenticatorAssuranceLevel' => '\Ory\Client\Model\AuthenticatorAssuranceLevel',
        'devices' => '\Ory\Client\Model\SessionDevice[]',
        'expiresAt' => '\DateTime',
        'id' => 'string',
        'identity' => '\Ory\Client\Model\Identity',
        'issuedAt' => '\DateTime',
        'tokenized' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'active' => null,
        'authenticatedAt' => 'date-time',
        'authenticationMethods' => null,
        'authenticatorAssuranceLevel' => null,
        'devices' => null,
        'expiresAt' => 'date-time',
        'id' => 'uuid',
        'identity' => null,
        'issuedAt' => 'date-time',
        'tokenized' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'active' => false,
        'authenticatedAt' => false,
        'authenticationMethods' => false,
        'authenticatorAssuranceLevel' => false,
        'devices' => false,
        'expiresAt' => false,
        'id' => false,
        'identity' => false,
        'issuedAt' => false,
        'tokenized' => false
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
        'active' => 'active',
        'authenticatedAt' => 'authenticated_at',
        'authenticationMethods' => 'authentication_methods',
        'authenticatorAssuranceLevel' => 'authenticator_assurance_level',
        'devices' => 'devices',
        'expiresAt' => 'expires_at',
        'id' => 'id',
        'identity' => 'identity',
        'issuedAt' => 'issued_at',
        'tokenized' => 'tokenized'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'active' => 'setActive',
        'authenticatedAt' => 'setAuthenticatedAt',
        'authenticationMethods' => 'setAuthenticationMethods',
        'authenticatorAssuranceLevel' => 'setAuthenticatorAssuranceLevel',
        'devices' => 'setDevices',
        'expiresAt' => 'setExpiresAt',
        'id' => 'setId',
        'identity' => 'setIdentity',
        'issuedAt' => 'setIssuedAt',
        'tokenized' => 'setTokenized'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'active' => 'getActive',
        'authenticatedAt' => 'getAuthenticatedAt',
        'authenticationMethods' => 'getAuthenticationMethods',
        'authenticatorAssuranceLevel' => 'getAuthenticatorAssuranceLevel',
        'devices' => 'getDevices',
        'expiresAt' => 'getExpiresAt',
        'id' => 'getId',
        'identity' => 'getIdentity',
        'issuedAt' => 'getIssuedAt',
        'tokenized' => 'getTokenized'
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
        $this->setIfExists('active', $data ?? [], null);
        $this->setIfExists('authenticatedAt', $data ?? [], null);
        $this->setIfExists('authenticationMethods', $data ?? [], null);
        $this->setIfExists('authenticatorAssuranceLevel', $data ?? [], null);
        $this->setIfExists('devices', $data ?? [], null);
        $this->setIfExists('expiresAt', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('identity', $data ?? [], null);
        $this->setIfExists('issuedAt', $data ?? [], null);
        $this->setIfExists('tokenized', $data ?? [], null);
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

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
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
     * Gets active
     *
     * @return bool|null
     */
    public function getActive()
    {
        return $this->container['active'];
    }

    /**
     * Sets active
     *
     * @param bool|null $active Active state. If false the session is no longer active.
     *
     * @return self
     */
    public function setActive($active)
    {
        if (is_null($active)) {
            throw new \InvalidArgumentException('non-nullable active cannot be null');
        }
        $this->container['active'] = $active;

        return $this;
    }

    /**
     * Gets authenticatedAt
     *
     * @return \DateTime|null
     */
    public function getAuthenticatedAt()
    {
        return $this->container['authenticatedAt'];
    }

    /**
     * Sets authenticatedAt
     *
     * @param \DateTime|null $authenticatedAt The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
     *
     * @return self
     */
    public function setAuthenticatedAt($authenticatedAt)
    {
        if (is_null($authenticatedAt)) {
            throw new \InvalidArgumentException('non-nullable authenticatedAt cannot be null');
        }
        $this->container['authenticatedAt'] = $authenticatedAt;

        return $this;
    }

    /**
     * Gets authenticationMethods
     *
     * @return \Ory\Client\Model\SessionAuthenticationMethod[]|null
     */
    public function getAuthenticationMethods()
    {
        return $this->container['authenticationMethods'];
    }

    /**
     * Sets authenticationMethods
     *
     * @param \Ory\Client\Model\SessionAuthenticationMethod[]|null $authenticationMethods A list of authenticators which were used to authenticate the session.
     *
     * @return self
     */
    public function setAuthenticationMethods($authenticationMethods)
    {
        if (is_null($authenticationMethods)) {
            throw new \InvalidArgumentException('non-nullable authenticationMethods cannot be null');
        }
        $this->container['authenticationMethods'] = $authenticationMethods;

        return $this;
    }

    /**
     * Gets authenticatorAssuranceLevel
     *
     * @return \Ory\Client\Model\AuthenticatorAssuranceLevel|null
     */
    public function getAuthenticatorAssuranceLevel()
    {
        return $this->container['authenticatorAssuranceLevel'];
    }

    /**
     * Sets authenticatorAssuranceLevel
     *
     * @param \Ory\Client\Model\AuthenticatorAssuranceLevel|null $authenticatorAssuranceLevel authenticatorAssuranceLevel
     *
     * @return self
     */
    public function setAuthenticatorAssuranceLevel($authenticatorAssuranceLevel)
    {
        if (is_null($authenticatorAssuranceLevel)) {
            throw new \InvalidArgumentException('non-nullable authenticatorAssuranceLevel cannot be null');
        }
        $this->container['authenticatorAssuranceLevel'] = $authenticatorAssuranceLevel;

        return $this;
    }

    /**
     * Gets devices
     *
     * @return \Ory\Client\Model\SessionDevice[]|null
     */
    public function getDevices()
    {
        return $this->container['devices'];
    }

    /**
     * Sets devices
     *
     * @param \Ory\Client\Model\SessionDevice[]|null $devices Devices has history of all endpoints where the session was used
     *
     * @return self
     */
    public function setDevices($devices)
    {
        if (is_null($devices)) {
            throw new \InvalidArgumentException('non-nullable devices cannot be null');
        }
        $this->container['devices'] = $devices;

        return $this;
    }

    /**
     * Gets expiresAt
     *
     * @return \DateTime|null
     */
    public function getExpiresAt()
    {
        return $this->container['expiresAt'];
    }

    /**
     * Sets expiresAt
     *
     * @param \DateTime|null $expiresAt The Session Expiry  When this session expires at.
     *
     * @return self
     */
    public function setExpiresAt($expiresAt)
    {
        if (is_null($expiresAt)) {
            throw new \InvalidArgumentException('non-nullable expiresAt cannot be null');
        }
        $this->container['expiresAt'] = $expiresAt;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id Session ID
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets identity
     *
     * @return \Ory\Client\Model\Identity|null
     */
    public function getIdentity()
    {
        return $this->container['identity'];
    }

    /**
     * Sets identity
     *
     * @param \Ory\Client\Model\Identity|null $identity identity
     *
     * @return self
     */
    public function setIdentity($identity)
    {
        if (is_null($identity)) {
            throw new \InvalidArgumentException('non-nullable identity cannot be null');
        }
        $this->container['identity'] = $identity;

        return $this;
    }

    /**
     * Gets issuedAt
     *
     * @return \DateTime|null
     */
    public function getIssuedAt()
    {
        return $this->container['issuedAt'];
    }

    /**
     * Sets issuedAt
     *
     * @param \DateTime|null $issuedAt The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.
     *
     * @return self
     */
    public function setIssuedAt($issuedAt)
    {
        if (is_null($issuedAt)) {
            throw new \InvalidArgumentException('non-nullable issuedAt cannot be null');
        }
        $this->container['issuedAt'] = $issuedAt;

        return $this;
    }

    /**
     * Gets tokenized
     *
     * @return string|null
     */
    public function getTokenized()
    {
        return $this->container['tokenized'];
    }

    /**
     * Sets tokenized
     *
     * @param string|null $tokenized Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the `tokenize` query parameter was set to a valid tokenize template during calls to `/session/whoami`.
     *
     * @return self
     */
    public function setTokenized($tokenized)
    {
        if (is_null($tokenized)) {
            throw new \InvalidArgumentException('non-nullable tokenized cannot be null');
        }
        $this->container['tokenized'] = $tokenized;

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


