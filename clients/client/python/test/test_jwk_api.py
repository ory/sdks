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

from ory_client.api.jwk_api import JwkApi


class TestJwkApi(unittest.TestCase):
    """JwkApi unit test stubs"""

    def setUp(self) -> None:
        self.api = JwkApi()

    def tearDown(self) -> None:
        pass

    def test_create_json_web_key_set(self) -> None:
        """Test case for create_json_web_key_set

        Create JSON Web Key
        """
        pass

    def test_delete_json_web_key(self) -> None:
        """Test case for delete_json_web_key

        Delete JSON Web Key
        """
        pass

    def test_delete_json_web_key_set(self) -> None:
        """Test case for delete_json_web_key_set

        Delete JSON Web Key Set
        """
        pass

    def test_get_json_web_key(self) -> None:
        """Test case for get_json_web_key

        Get JSON Web Key
        """
        pass

    def test_get_json_web_key_set(self) -> None:
        """Test case for get_json_web_key_set

        Retrieve a JSON Web Key Set
        """
        pass

    def test_set_json_web_key(self) -> None:
        """Test case for set_json_web_key

        Set JSON Web Key
        """
        pass

    def test_set_json_web_key_set(self) -> None:
        """Test case for set_json_web_key_set

        Update a JSON Web Key Set
        """
        pass


if __name__ == '__main__':
    unittest.main()
