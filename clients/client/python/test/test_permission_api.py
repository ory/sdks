# coding: utf-8

"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

    The version of the OpenAPI document: v1.14.0
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_client.api.permission_api import PermissionApi


class TestPermissionApi(unittest.TestCase):
    """PermissionApi unit test stubs"""

    def setUp(self) -> None:
        self.api = PermissionApi()

    def tearDown(self) -> None:
        pass

    def test_check_permission(self) -> None:
        """Test case for check_permission

        Check a permission
        """
        pass

    def test_check_permission_or_error(self) -> None:
        """Test case for check_permission_or_error

        Check a permission
        """
        pass

    def test_expand_permissions(self) -> None:
        """Test case for expand_permissions

        Expand a Relationship into permissions.
        """
        pass

    def test_post_check_permission(self) -> None:
        """Test case for post_check_permission

        Check a permission
        """
        pass

    def test_post_check_permission_or_error(self) -> None:
        """Test case for post_check_permission_or_error

        Check a permission
        """
        pass


if __name__ == '__main__':
    unittest.main()
