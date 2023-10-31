<?php
/**
 * QuotaUsage
 *
 * PHP version 7.3
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
 * The version of the OpenAPI document: v1.2.16
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.4.0
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
 * QuotaUsage Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class QuotaUsage implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'quotaUsage';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'additionalPrice' => 'int',
        'canUseMore' => 'bool',
        'feature' => 'string',
        'featureAvailable' => 'bool',
        'included' => 'int',
        'used' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'additionalPrice' => 'int64',
        'canUseMore' => null,
        'feature' => null,
        'featureAvailable' => null,
        'included' => 'int64',
        'used' => 'int64'
    ];

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
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'additionalPrice' => 'additional_price',
        'canUseMore' => 'can_use_more',
        'feature' => 'feature',
        'featureAvailable' => 'feature_available',
        'included' => 'included',
        'used' => 'used'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'additionalPrice' => 'setAdditionalPrice',
        'canUseMore' => 'setCanUseMore',
        'feature' => 'setFeature',
        'featureAvailable' => 'setFeatureAvailable',
        'included' => 'setIncluded',
        'used' => 'setUsed'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'additionalPrice' => 'getAdditionalPrice',
        'canUseMore' => 'getCanUseMore',
        'feature' => 'getFeature',
        'featureAvailable' => 'getFeatureAvailable',
        'included' => 'getIncluded',
        'used' => 'getUsed'
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

    const FEATURE_REGION_EU = 'region_eu';
    const FEATURE_REGION_US = 'region_us';
    const FEATURE_REGION_APAC = 'region_apac';
    const FEATURE_REGION_GLOBAL = 'region_global';
    const FEATURE_PRODUCTION_PROJECTS = 'production_projects';
    const FEATURE_DAILY_ACTIVE_USERS = 'daily_active_users';
    const FEATURE_CUSTOM_DOMAINS = 'custom_domains';
    const FEATURE_SLA = 'sla';
    const FEATURE_COLLABORATOR_SEATS = 'collaborator_seats';
    const FEATURE_EDGE_CACHE = 'edge_cache';
    const FEATURE_BRANDING_THEMES = 'branding_themes';
    const FEATURE_ZENDESK_SUPPORT = 'zendesk_support';
    const FEATURE_PROJECT_METRICS = 'project_metrics';
    const FEATURE_PROJECT_METRICS_TIME_WINDOW = 'project_metrics_time_window';
    const FEATURE_ORGANIZATIONS = 'organizations';
    const FEATURE_ROP_GRANT = 'rop_grant';
    const FEATURE_RATE_LIMIT_TIER = 'rate_limit_tier';
    const FEATURE_SESSION_RATE_LIMIT_TIER = 'session_rate_limit_tier';
    const FEATURE_IDENTITIES_LIST_RATE_LIMIT_TIER = 'identities_list_rate_limit_tier';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getFeatureAllowableValues()
    {
        return [
            self::FEATURE_REGION_EU,
            self::FEATURE_REGION_US,
            self::FEATURE_REGION_APAC,
            self::FEATURE_REGION_GLOBAL,
            self::FEATURE_PRODUCTION_PROJECTS,
            self::FEATURE_DAILY_ACTIVE_USERS,
            self::FEATURE_CUSTOM_DOMAINS,
            self::FEATURE_SLA,
            self::FEATURE_COLLABORATOR_SEATS,
            self::FEATURE_EDGE_CACHE,
            self::FEATURE_BRANDING_THEMES,
            self::FEATURE_ZENDESK_SUPPORT,
            self::FEATURE_PROJECT_METRICS,
            self::FEATURE_PROJECT_METRICS_TIME_WINDOW,
            self::FEATURE_ORGANIZATIONS,
            self::FEATURE_ROP_GRANT,
            self::FEATURE_RATE_LIMIT_TIER,
            self::FEATURE_SESSION_RATE_LIMIT_TIER,
            self::FEATURE_IDENTITIES_LIST_RATE_LIMIT_TIER,
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
        $this->container['additionalPrice'] = $data['additionalPrice'] ?? null;
        $this->container['canUseMore'] = $data['canUseMore'] ?? null;
        $this->container['feature'] = $data['feature'] ?? null;
        $this->container['featureAvailable'] = $data['featureAvailable'] ?? null;
        $this->container['included'] = $data['included'] ?? null;
        $this->container['used'] = $data['used'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['additionalPrice'] === null) {
            $invalidProperties[] = "'additionalPrice' can't be null";
        }
        if ($this->container['canUseMore'] === null) {
            $invalidProperties[] = "'canUseMore' can't be null";
        }
        if ($this->container['feature'] === null) {
            $invalidProperties[] = "'feature' can't be null";
        }
        $allowedValues = $this->getFeatureAllowableValues();
        if (!is_null($this->container['feature']) && !in_array($this->container['feature'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'feature', must be one of '%s'",
                $this->container['feature'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['featureAvailable'] === null) {
            $invalidProperties[] = "'featureAvailable' can't be null";
        }
        if ($this->container['included'] === null) {
            $invalidProperties[] = "'included' can't be null";
        }
        if ($this->container['used'] === null) {
            $invalidProperties[] = "'used' can't be null";
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
     * Gets additionalPrice
     *
     * @return int
     */
    public function getAdditionalPrice()
    {
        return $this->container['additionalPrice'];
    }

    /**
     * Sets additionalPrice
     *
     * @param int $additionalPrice The additional price per unit in cents.
     *
     * @return self
     */
    public function setAdditionalPrice($additionalPrice)
    {
        $this->container['additionalPrice'] = $additionalPrice;

        return $this;
    }

    /**
     * Gets canUseMore
     *
     * @return bool
     */
    public function getCanUseMore()
    {
        return $this->container['canUseMore'];
    }

    /**
     * Sets canUseMore
     *
     * @param bool $canUseMore canUseMore
     *
     * @return self
     */
    public function setCanUseMore($canUseMore)
    {
        $this->container['canUseMore'] = $canUseMore;

        return $this;
    }

    /**
     * Gets feature
     *
     * @return string
     */
    public function getFeature()
    {
        return $this->container['feature'];
    }

    /**
     * Sets feature
     *
     * @param string $feature region_eu RegionEU region_us RegionUS region_apac RegionAPAC region_global RegionGlobal production_projects ProductionProjects daily_active_users DailyActiveUsers custom_domains CustomDomains sla SLA collaborator_seats CollaboratorSeats edge_cache EdgeCache branding_themes BrandingThemes zendesk_support ZendeskSupport project_metrics ProjectMetrics project_metrics_time_window ProjectMetricsTimeWindow organizations Organizations rop_grant ResourceOwnerPasswordGrant rate_limit_tier RateLimitTier session_rate_limit_tier RateLimitTierSessions identities_list_rate_limit_tier RateLimitTierIdentitiesList
     *
     * @return self
     */
    public function setFeature($feature)
    {
        $allowedValues = $this->getFeatureAllowableValues();
        if (!in_array($feature, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'feature', must be one of '%s'",
                    $feature,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['feature'] = $feature;

        return $this;
    }

    /**
     * Gets featureAvailable
     *
     * @return bool
     */
    public function getFeatureAvailable()
    {
        return $this->container['featureAvailable'];
    }

    /**
     * Sets featureAvailable
     *
     * @param bool $featureAvailable featureAvailable
     *
     * @return self
     */
    public function setFeatureAvailable($featureAvailable)
    {
        $this->container['featureAvailable'] = $featureAvailable;

        return $this;
    }

    /**
     * Gets included
     *
     * @return int
     */
    public function getIncluded()
    {
        return $this->container['included'];
    }

    /**
     * Sets included
     *
     * @param int $included included
     *
     * @return self
     */
    public function setIncluded($included)
    {
        $this->container['included'] = $included;

        return $this;
    }

    /**
     * Gets used
     *
     * @return int
     */
    public function getUsed()
    {
        return $this->container['used'];
    }

    /**
     * Sets used
     *
     * @param int $used used
     *
     * @return self
     */
    public function setUsed($used)
    {
        $this->container['used'] = $used;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
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
    public function offsetSet($offset, $value)
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
    public function offsetUnset($offset)
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


