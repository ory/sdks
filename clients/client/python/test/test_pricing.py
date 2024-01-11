"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.5.0
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.plan_details import PlanDetails
globals()['PlanDetails'] = PlanDetails
from ory_client.model.pricing import Pricing


class TestPricing(unittest.TestCase):
    """Pricing unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPricing(self):
        """Test Pricing"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Pricing()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
