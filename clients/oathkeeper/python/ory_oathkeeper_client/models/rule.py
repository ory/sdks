# coding: utf-8

"""
    ORY Oathkeeper

    ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.4
    Contact: hi@ory.am
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_oathkeeper_client.configuration import Configuration


class Rule(object):
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
        'authenticators': 'list[RuleHandler]',
        'authorizer': 'RuleHandler',
        'description': 'str',
        'id': 'str',
        'match': 'RuleMatch',
        'mutators': 'list[RuleHandler]',
        'upstream': 'Upstream'
    }

    attribute_map = {
        'authenticators': 'authenticators',
        'authorizer': 'authorizer',
        'description': 'description',
        'id': 'id',
        'match': 'match',
        'mutators': 'mutators',
        'upstream': 'upstream'
    }

    def __init__(self, authenticators=None, authorizer=None, description=None, id=None, match=None, mutators=None, upstream=None, local_vars_configuration=None):  # noqa: E501
        """Rule - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._authenticators = None
        self._authorizer = None
        self._description = None
        self._id = None
        self._match = None
        self._mutators = None
        self._upstream = None
        self.discriminator = None

        if authenticators is not None:
            self.authenticators = authenticators
        if authorizer is not None:
            self.authorizer = authorizer
        if description is not None:
            self.description = description
        if id is not None:
            self.id = id
        if match is not None:
            self.match = match
        if mutators is not None:
            self.mutators = mutators
        if upstream is not None:
            self.upstream = upstream

    @property
    def authenticators(self):
        """Gets the authenticators of this Rule.  # noqa: E501

        Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \"falling back\" to others, have that authenticator as the first item in the array.  # noqa: E501

        :return: The authenticators of this Rule.  # noqa: E501
        :rtype: list[RuleHandler]
        """
        return self._authenticators

    @authenticators.setter
    def authenticators(self, authenticators):
        """Sets the authenticators of this Rule.

        Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \"falling back\" to others, have that authenticator as the first item in the array.  # noqa: E501

        :param authenticators: The authenticators of this Rule.  # noqa: E501
        :type: list[RuleHandler]
        """

        self._authenticators = authenticators

    @property
    def authorizer(self):
        """Gets the authorizer of this Rule.  # noqa: E501


        :return: The authorizer of this Rule.  # noqa: E501
        :rtype: RuleHandler
        """
        return self._authorizer

    @authorizer.setter
    def authorizer(self, authorizer):
        """Sets the authorizer of this Rule.


        :param authorizer: The authorizer of this Rule.  # noqa: E501
        :type: RuleHandler
        """

        self._authorizer = authorizer

    @property
    def description(self):
        """Gets the description of this Rule.  # noqa: E501

        Description is a human readable description of this rule.  # noqa: E501

        :return: The description of this Rule.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Rule.

        Description is a human readable description of this rule.  # noqa: E501

        :param description: The description of this Rule.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def id(self):
        """Gets the id of this Rule.  # noqa: E501

        ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule.  # noqa: E501

        :return: The id of this Rule.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Rule.

        ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule.  # noqa: E501

        :param id: The id of this Rule.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def match(self):
        """Gets the match of this Rule.  # noqa: E501


        :return: The match of this Rule.  # noqa: E501
        :rtype: RuleMatch
        """
        return self._match

    @match.setter
    def match(self, match):
        """Sets the match of this Rule.


        :param match: The match of this Rule.  # noqa: E501
        :type: RuleMatch
        """

        self._match = match

    @property
    def mutators(self):
        """Gets the mutators of this Rule.  # noqa: E501

        Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded.  # noqa: E501

        :return: The mutators of this Rule.  # noqa: E501
        :rtype: list[RuleHandler]
        """
        return self._mutators

    @mutators.setter
    def mutators(self, mutators):
        """Sets the mutators of this Rule.

        Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded.  # noqa: E501

        :param mutators: The mutators of this Rule.  # noqa: E501
        :type: list[RuleHandler]
        """

        self._mutators = mutators

    @property
    def upstream(self):
        """Gets the upstream of this Rule.  # noqa: E501


        :return: The upstream of this Rule.  # noqa: E501
        :rtype: Upstream
        """
        return self._upstream

    @upstream.setter
    def upstream(self, upstream):
        """Sets the upstream of this Rule.


        :param upstream: The upstream of this Rule.  # noqa: E501
        :type: Upstream
        """

        self._upstream = upstream

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
        if not isinstance(other, Rule):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Rule):
            return True

        return self.to_dict() != other.to_dict()
