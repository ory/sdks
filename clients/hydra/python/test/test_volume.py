"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v1.11.0
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_hydra_client
from ory_hydra_client.model.volume_usage_data import VolumeUsageData
globals()['VolumeUsageData'] = VolumeUsageData
from ory_hydra_client.model.volume import Volume


class TestVolume(unittest.TestCase):
    """Volume unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testVolume(self):
        """Test Volume"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Volume()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
