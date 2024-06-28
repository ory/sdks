"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v1.1.0
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import unittest

import ory_kratos_client
from ory_kratos_client.api.courier_api import CourierApi  # noqa: E501


class TestCourierApi(unittest.TestCase):
    """CourierApi unit test stubs"""

    def setUp(self):
        self.api = CourierApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_courier_message(self):
        """Test case for get_courier_message

        Get a Message  # noqa: E501
        """
        pass

    def test_list_courier_messages(self):
        """Test case for list_courier_messages

        List Messages  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
