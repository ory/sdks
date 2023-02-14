"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.10
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.accept_o_auth2_consent_request_session import AcceptOAuth2ConsentRequestSession
from ory_client.model.string_slice_json_format import StringSliceJSONFormat
globals()['AcceptOAuth2ConsentRequestSession'] = AcceptOAuth2ConsentRequestSession
globals()['StringSliceJSONFormat'] = StringSliceJSONFormat
from ory_client.model.accept_o_auth2_consent_request import AcceptOAuth2ConsentRequest


class TestAcceptOAuth2ConsentRequest(unittest.TestCase):
    """AcceptOAuth2ConsentRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAcceptOAuth2ConsentRequest(self):
        """Test AcceptOAuth2ConsentRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AcceptOAuth2ConsentRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
