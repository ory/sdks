# coding: utf-8

"""
    ORY Keto

    A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.33
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_keto_client.configuration import Configuration


class UpsertOryAccessControlPolicyRole(object):
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
        'body': 'OryAccessControlPolicyRole',
        'flavor': 'str'
    }

    attribute_map = {
        'body': 'Body',
        'flavor': 'flavor'
    }

    def __init__(self, body=None, flavor=None, local_vars_configuration=None):  # noqa: E501
        """UpsertOryAccessControlPolicyRole - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._body = None
        self._flavor = None
        self.discriminator = None

        if body is not None:
            self.body = body
        self.flavor = flavor

    @property
    def body(self):
        """Gets the body of this UpsertOryAccessControlPolicyRole.  # noqa: E501


        :return: The body of this UpsertOryAccessControlPolicyRole.  # noqa: E501
        :rtype: OryAccessControlPolicyRole
        """
        return self._body

    @body.setter
    def body(self, body):
        """Sets the body of this UpsertOryAccessControlPolicyRole.


        :param body: The body of this UpsertOryAccessControlPolicyRole.  # noqa: E501
        :type: OryAccessControlPolicyRole
        """

        self._body = body

    @property
    def flavor(self):
        """Gets the flavor of this UpsertOryAccessControlPolicyRole.  # noqa: E501

        The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path  # noqa: E501

        :return: The flavor of this UpsertOryAccessControlPolicyRole.  # noqa: E501
        :rtype: str
        """
        return self._flavor

    @flavor.setter
    def flavor(self, flavor):
        """Sets the flavor of this UpsertOryAccessControlPolicyRole.

        The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path  # noqa: E501

        :param flavor: The flavor of this UpsertOryAccessControlPolicyRole.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and flavor is None:  # noqa: E501
            raise ValueError("Invalid value for `flavor`, must not be `None`")  # noqa: E501

        self._flavor = flavor

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
        if not isinstance(other, UpsertOryAccessControlPolicyRole):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, UpsertOryAccessControlPolicyRole):
            return True

        return self.to_dict() != other.to_dict()
