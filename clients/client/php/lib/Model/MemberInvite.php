<?php
/**
 * MemberInvite
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
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.
 *
 * The version of the OpenAPI document: v1.14.0
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
 * MemberInvite Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class MemberInvite implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'memberInvite';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'createdAt' => '\DateTime',
        'id' => 'string',
        'inviteeEmail' => 'string',
        'inviteeId' => 'string',
        'ownerEmail' => 'string',
        'ownerId' => 'string',
        'projectId' => 'string',
        'role' => 'string',
        'status' => 'string',
        'updatedAt' => '\DateTime',
        'workspaceId' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'createdAt' => 'date-time',
        'id' => 'uuid',
        'inviteeEmail' => null,
        'inviteeId' => 'uuid4',
        'ownerEmail' => null,
        'ownerId' => 'uuid',
        'projectId' => 'uuid4',
        'role' => null,
        'status' => null,
        'updatedAt' => 'date-time',
        'workspaceId' => 'uuid4'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'createdAt' => false,
        'id' => false,
        'inviteeEmail' => false,
        'inviteeId' => true,
        'ownerEmail' => false,
        'ownerId' => false,
        'projectId' => true,
        'role' => true,
        'status' => false,
        'updatedAt' => false,
        'workspaceId' => true
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
        'createdAt' => 'created_at',
        'id' => 'id',
        'inviteeEmail' => 'invitee_email',
        'inviteeId' => 'invitee_id',
        'ownerEmail' => 'owner_email',
        'ownerId' => 'owner_id',
        'projectId' => 'project_id',
        'role' => 'role',
        'status' => 'status',
        'updatedAt' => 'updated_at',
        'workspaceId' => 'workspace_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'createdAt' => 'setCreatedAt',
        'id' => 'setId',
        'inviteeEmail' => 'setInviteeEmail',
        'inviteeId' => 'setInviteeId',
        'ownerEmail' => 'setOwnerEmail',
        'ownerId' => 'setOwnerId',
        'projectId' => 'setProjectId',
        'role' => 'setRole',
        'status' => 'setStatus',
        'updatedAt' => 'setUpdatedAt',
        'workspaceId' => 'setWorkspaceId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'createdAt' => 'getCreatedAt',
        'id' => 'getId',
        'inviteeEmail' => 'getInviteeEmail',
        'inviteeId' => 'getInviteeId',
        'ownerEmail' => 'getOwnerEmail',
        'ownerId' => 'getOwnerId',
        'projectId' => 'getProjectId',
        'role' => 'getRole',
        'status' => 'getStatus',
        'updatedAt' => 'getUpdatedAt',
        'workspaceId' => 'getWorkspaceId'
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

    public const STATUS_PENDING = 'pending';
    public const STATUS_ACCEPTED = 'accepted';
    public const STATUS_DECLINED = 'declined';
    public const STATUS_EXPIRED = 'expired';
    public const STATUS_CANCELLED = 'cancelled';
    public const STATUS_REMOVED = 'removed';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getStatusAllowableValues()
    {
        return [
            self::STATUS_PENDING,
            self::STATUS_ACCEPTED,
            self::STATUS_DECLINED,
            self::STATUS_EXPIRED,
            self::STATUS_CANCELLED,
            self::STATUS_REMOVED,
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
        $this->setIfExists('createdAt', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('inviteeEmail', $data ?? [], null);
        $this->setIfExists('inviteeId', $data ?? [], null);
        $this->setIfExists('ownerEmail', $data ?? [], null);
        $this->setIfExists('ownerId', $data ?? [], null);
        $this->setIfExists('projectId', $data ?? [], null);
        $this->setIfExists('role', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], null);
        $this->setIfExists('updatedAt', $data ?? [], null);
        $this->setIfExists('workspaceId', $data ?? [], null);
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

        if ($this->container['createdAt'] === null) {
            $invalidProperties[] = "'createdAt' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['inviteeEmail'] === null) {
            $invalidProperties[] = "'inviteeEmail' can't be null";
        }
        if ($this->container['ownerEmail'] === null) {
            $invalidProperties[] = "'ownerEmail' can't be null";
        }
        if ($this->container['ownerId'] === null) {
            $invalidProperties[] = "'ownerId' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalidProperties[] = "'status' can't be null";
        }
        $allowedValues = $this->getStatusAllowableValues();
        if (!is_null($this->container['status']) && !in_array($this->container['status'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'status', must be one of '%s'",
                $this->container['status'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['updatedAt'] === null) {
            $invalidProperties[] = "'updatedAt' can't be null";
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
     * Gets createdAt
     *
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->container['createdAt'];
    }

    /**
     * Sets createdAt
     *
     * @param \DateTime $createdAt The Project's Revision Creation Date
     *
     * @return self
     */
    public function setCreatedAt($createdAt)
    {
        if (is_null($createdAt)) {
            throw new \InvalidArgumentException('non-nullable createdAt cannot be null');
        }
        $this->container['createdAt'] = $createdAt;

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
     * @param string $id The invite's ID.
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
     * Gets inviteeEmail
     *
     * @return string
     */
    public function getInviteeEmail()
    {
        return $this->container['inviteeEmail'];
    }

    /**
     * Sets inviteeEmail
     *
     * @param string $inviteeEmail The invitee's email
     *
     * @return self
     */
    public function setInviteeEmail($inviteeEmail)
    {
        if (is_null($inviteeEmail)) {
            throw new \InvalidArgumentException('non-nullable inviteeEmail cannot be null');
        }
        $this->container['inviteeEmail'] = $inviteeEmail;

        return $this;
    }

    /**
     * Gets inviteeId
     *
     * @return string|null
     */
    public function getInviteeId()
    {
        return $this->container['inviteeId'];
    }

    /**
     * Sets inviteeId
     *
     * @param string|null $inviteeId inviteeId
     *
     * @return self
     */
    public function setInviteeId($inviteeId)
    {
        if (is_null($inviteeId)) {
            array_push($this->openAPINullablesSetToNull, 'inviteeId');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('inviteeId', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['inviteeId'] = $inviteeId;

        return $this;
    }

    /**
     * Gets ownerEmail
     *
     * @return string
     */
    public function getOwnerEmail()
    {
        return $this->container['ownerEmail'];
    }

    /**
     * Sets ownerEmail
     *
     * @param string $ownerEmail The invite owner's email Usually the project's owner email
     *
     * @return self
     */
    public function setOwnerEmail($ownerEmail)
    {
        if (is_null($ownerEmail)) {
            throw new \InvalidArgumentException('non-nullable ownerEmail cannot be null');
        }
        $this->container['ownerEmail'] = $ownerEmail;

        return $this;
    }

    /**
     * Gets ownerId
     *
     * @return string
     */
    public function getOwnerId()
    {
        return $this->container['ownerId'];
    }

    /**
     * Sets ownerId
     *
     * @param string $ownerId The invite owner's ID Usually the project's owner
     *
     * @return self
     */
    public function setOwnerId($ownerId)
    {
        if (is_null($ownerId)) {
            throw new \InvalidArgumentException('non-nullable ownerId cannot be null');
        }
        $this->container['ownerId'] = $ownerId;

        return $this;
    }

    /**
     * Gets projectId
     *
     * @return string|null
     */
    public function getProjectId()
    {
        return $this->container['projectId'];
    }

    /**
     * Sets projectId
     *
     * @param string|null $projectId projectId
     *
     * @return self
     */
    public function setProjectId($projectId)
    {
        if (is_null($projectId)) {
            array_push($this->openAPINullablesSetToNull, 'projectId');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('projectId', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['projectId'] = $projectId;

        return $this;
    }

    /**
     * Gets role
     *
     * @return string|null
     */
    public function getRole()
    {
        return $this->container['role'];
    }

    /**
     * Sets role
     *
     * @param string|null $role role
     *
     * @return self
     */
    public function setRole($role)
    {
        if (is_null($role)) {
            array_push($this->openAPINullablesSetToNull, 'role');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('role', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['role'] = $role;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status The invite's status Keeps track of the invites status such as pending, accepted, declined, expired pending PENDING accepted ACCEPTED declined DECLINED expired EXPIRED cancelled CANCELLED removed REMOVED
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $allowedValues = $this->getStatusAllowableValues();
        if (!in_array($status, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'status', must be one of '%s'",
                    $status,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets updatedAt
     *
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->container['updatedAt'];
    }

    /**
     * Sets updatedAt
     *
     * @param \DateTime $updatedAt Last Time Project's Revision was Updated
     *
     * @return self
     */
    public function setUpdatedAt($updatedAt)
    {
        if (is_null($updatedAt)) {
            throw new \InvalidArgumentException('non-nullable updatedAt cannot be null');
        }
        $this->container['updatedAt'] = $updatedAt;

        return $this;
    }

    /**
     * Gets workspaceId
     *
     * @return string|null
     */
    public function getWorkspaceId()
    {
        return $this->container['workspaceId'];
    }

    /**
     * Sets workspaceId
     *
     * @param string|null $workspaceId workspaceId
     *
     * @return self
     */
    public function setWorkspaceId($workspaceId)
    {
        if (is_null($workspaceId)) {
            array_push($this->openAPINullablesSetToNull, 'workspaceId');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('workspaceId', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['workspaceId'] = $workspaceId;

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


