# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.5.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_kratos_client.configuration import Configuration


class CreateRecoveryLink(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'expires_in': 'str',
        'identity_id': 'str'
    }

    attribute_map = {
        'expires_in': 'expires_in',
        'identity_id': 'identity_id'
    }

    def __init__(self, expires_in=None, identity_id=None, local_vars_configuration=None):  # noqa: E501
        """CreateRecoveryLink - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._expires_in = None
        self._identity_id = None
        self.discriminator = None

        if expires_in is not None:
            self.expires_in = expires_in
        self.identity_id = identity_id

    @property
    def expires_in(self):
        """Gets the expires_in of this CreateRecoveryLink.  # noqa: E501

        Link Expires In  The recovery link will expire at that point in time. Defaults to the configuration value of `selfservice.flows.recovery.request_lifespan`.  # noqa: E501

        :return: The expires_in of this CreateRecoveryLink.  # noqa: E501
        :rtype: str
        """
        return self._expires_in

    @expires_in.setter
    def expires_in(self, expires_in):
        """Sets the expires_in of this CreateRecoveryLink.

        Link Expires In  The recovery link will expire at that point in time. Defaults to the configuration value of `selfservice.flows.recovery.request_lifespan`.  # noqa: E501

        :param expires_in: The expires_in of this CreateRecoveryLink.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                expires_in is not None and not re.search(r'^[0-9]+(ns|us|ms|s|m|h)$', expires_in)):  # noqa: E501
            raise ValueError(r"Invalid value for `expires_in`, must be a follow pattern or equal to `/^[0-9]+(ns|us|ms|s|m|h)$/`")  # noqa: E501

        self._expires_in = expires_in

    @property
    def identity_id(self):
        """Gets the identity_id of this CreateRecoveryLink.  # noqa: E501


        :return: The identity_id of this CreateRecoveryLink.  # noqa: E501
        :rtype: str
        """
        return self._identity_id

    @identity_id.setter
    def identity_id(self, identity_id):
        """Sets the identity_id of this CreateRecoveryLink.


        :param identity_id: The identity_id of this CreateRecoveryLink.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and identity_id is None:  # noqa: E501
            raise ValueError("Invalid value for `identity_id`, must not be `None`")  # noqa: E501

        self._identity_id = identity_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CreateRecoveryLink):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CreateRecoveryLink):
            return True

        return self.to_dict() != other.to_dict()
