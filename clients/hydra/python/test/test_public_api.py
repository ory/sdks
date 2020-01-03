# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: latest
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import ory_
from ory_.api.public_api import PublicApi  # noqa: E501
from ory_.rest import ApiException


class TestPublicApi(unittest.TestCase):
    """PublicApi unit test stubs"""

    def setUp(self):
        self.api = ory_.api.public_api.PublicApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_disconnect_user(self):
        """Test case for disconnect_user

        OpenID Connect Front-Backchannel enabled Logout  # noqa: E501
        """
        pass

    def test_discover_open_id_configuration(self):
        """Test case for discover_open_id_configuration

        OpenID Connect Discovery  # noqa: E501
        """
        pass

    def test_is_instance_ready(self):
        """Test case for is_instance_ready

        Check readiness status  # noqa: E501
        """
        pass

    def test_oauth2_token(self):
        """Test case for oauth2_token

        The OAuth 2.0 token endpoint  # noqa: E501
        """
        pass

    def test_oauth_auth(self):
        """Test case for oauth_auth

        The OAuth 2.0 authorize endpoint  # noqa: E501
        """
        pass

    def test_revoke_o_auth2_token(self):
        """Test case for revoke_o_auth2_token

        Revoke OAuth2 tokens  # noqa: E501
        """
        pass

    def test_userinfo(self):
        """Test case for userinfo

        OpenID Connect Userinfo  # noqa: E501
        """
        pass

    def test_well_known(self):
        """Test case for well_known

        JSON Web Keys Discovery  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
