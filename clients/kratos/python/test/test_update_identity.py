# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.5.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import ory_kratos_client
from ory_kratos_client.models.update_identity import UpdateIdentity  # noqa: E501
from ory_kratos_client.rest import ApiException

class TestUpdateIdentity(unittest.TestCase):
    """UpdateIdentity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test UpdateIdentity
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = ory_kratos_client.models.update_identity.UpdateIdentity()  # noqa: E501
        if include_optional :
            return UpdateIdentity(
                schema_id = '0', 
                traits = None
            )
        else :
            return UpdateIdentity(
                traits = None,
        )

    def testUpdateIdentity(self):
        """Test UpdateIdentity"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
