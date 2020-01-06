# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_kratos_client.configuration import Configuration


class RegistrationRequestMethod(object):
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
        'config': 'RegistrationRequestMethodConfig',
        'method': 'str'
    }

    attribute_map = {
        'config': 'config',
        'method': 'method'
    }

    def __init__(self, config=None, method=None, local_vars_configuration=None):  # noqa: E501
        """RegistrationRequestMethod - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._config = None
        self._method = None
        self.discriminator = None

        if config is not None:
            self.config = config
        if method is not None:
            self.method = method

    @property
    def config(self):
        """Gets the config of this RegistrationRequestMethod.  # noqa: E501


        :return: The config of this RegistrationRequestMethod.  # noqa: E501
        :rtype: RegistrationRequestMethodConfig
        """
        return self._config

    @config.setter
    def config(self, config):
        """Sets the config of this RegistrationRequestMethod.


        :param config: The config of this RegistrationRequestMethod.  # noqa: E501
        :type: RegistrationRequestMethodConfig
        """

        self._config = config

    @property
    def method(self):
        """Gets the method of this RegistrationRequestMethod.  # noqa: E501

        and so on.  # noqa: E501

        :return: The method of this RegistrationRequestMethod.  # noqa: E501
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """Sets the method of this RegistrationRequestMethod.

        and so on.  # noqa: E501

        :param method: The method of this RegistrationRequestMethod.  # noqa: E501
        :type: str
        """

        self._method = method

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
        if not isinstance(other, RegistrationRequestMethod):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RegistrationRequestMethod):
            return True

        return self.to_dict() != other.to_dict()
