# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.32
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_kratos_client.configuration import Configuration


class GenericError(object):
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
        'error': 'str',
        'error_code': 'int',
        'error_debug': 'str',
        'error_hint': 'str'
    }

    attribute_map = {
        'error': 'error',
        'error_code': 'error_code',
        'error_debug': 'error_debug',
        'error_hint': 'error_hint'
    }

    def __init__(self, error=None, error_code=None, error_debug=None, error_hint=None, local_vars_configuration=None):  # noqa: E501
        """GenericError - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._error = None
        self._error_code = None
        self._error_debug = None
        self._error_hint = None
        self.discriminator = None

        self.error = error
        if error_code is not None:
            self.error_code = error_code
        if error_debug is not None:
            self.error_debug = error_debug
        if error_hint is not None:
            self.error_hint = error_hint

    @property
    def error(self):
        """Gets the error of this GenericError.  # noqa: E501

        Name is the error name.  # noqa: E501

        :return: The error of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error):
        """Sets the error of this GenericError.

        Name is the error name.  # noqa: E501

        :param error: The error of this GenericError.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and error is None:  # noqa: E501
            raise ValueError("Invalid value for `error`, must not be `None`")  # noqa: E501

        self._error = error

    @property
    def error_code(self):
        """Gets the error_code of this GenericError.  # noqa: E501

        Code represents the error status code (404, 403, 401, ...).  # noqa: E501

        :return: The error_code of this GenericError.  # noqa: E501
        :rtype: int
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """Sets the error_code of this GenericError.

        Code represents the error status code (404, 403, 401, ...).  # noqa: E501

        :param error_code: The error_code of this GenericError.  # noqa: E501
        :type: int
        """

        self._error_code = error_code

    @property
    def error_debug(self):
        """Gets the error_debug of this GenericError.  # noqa: E501

        Debug contains debug information. This is usually not available and has to be enabled.  # noqa: E501

        :return: The error_debug of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._error_debug

    @error_debug.setter
    def error_debug(self, error_debug):
        """Sets the error_debug of this GenericError.

        Debug contains debug information. This is usually not available and has to be enabled.  # noqa: E501

        :param error_debug: The error_debug of this GenericError.  # noqa: E501
        :type: str
        """

        self._error_debug = error_debug

    @property
    def error_hint(self):
        """Gets the error_hint of this GenericError.  # noqa: E501

        Hint contains further information on the nature of the error.  # noqa: E501

        :return: The error_hint of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._error_hint

    @error_hint.setter
    def error_hint(self, error_hint):
        """Sets the error_hint of this GenericError.

        Hint contains further information on the nature of the error.  # noqa: E501

        :param error_hint: The error_hint of this GenericError.  # noqa: E501
        :type: str
        """

        self._error_hint = error_hint

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
        if not isinstance(other, GenericError):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GenericError):
            return True

        return self.to_dict() != other.to_dict()
