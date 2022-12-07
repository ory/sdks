"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v0.11.0
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.identity_credentials_oidc_provider import IdentityCredentialsOidcProvider
globals()['IdentityCredentialsOidcProvider'] = IdentityCredentialsOidcProvider
from ory_kratos_client.model.identity_credentials_oidc import IdentityCredentialsOidc


class TestIdentityCredentialsOidc(unittest.TestCase):
    """IdentityCredentialsOidc unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIdentityCredentialsOidc(self):
        """Test IdentityCredentialsOidc"""
        # FIXME: construct object with mandatory attributes with example values
        # model = IdentityCredentialsOidc()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
