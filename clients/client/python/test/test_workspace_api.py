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

from ory_client.api.workspace_api import WorkspaceApi


class TestWorkspaceApi(unittest.TestCase):
    """WorkspaceApi unit test stubs"""

    def setUp(self) -> None:
        self.api = WorkspaceApi()

    def tearDown(self) -> None:
        pass

    def test_create_workspace(self) -> None:
        """Test case for create_workspace

        Create a new workspace
        """
        pass

    def test_create_workspace_api_key(self) -> None:
        """Test case for create_workspace_api_key

        Create workspace API key
        """
        pass

    def test_delete_workspace_api_key(self) -> None:
        """Test case for delete_workspace_api_key

        Delete workspace API token
        """
        pass

    def test_get_workspace(self) -> None:
        """Test case for get_workspace

        Get a workspace
        """
        pass

    def test_list_workspace_api_keys(self) -> None:
        """Test case for list_workspace_api_keys

        List a workspace's API Tokens
        """
        pass

    def test_list_workspace_projects(self) -> None:
        """Test case for list_workspace_projects

        List all projects of a workspace
        """
        pass

    def test_list_workspaces(self) -> None:
        """Test case for list_workspaces

        List workspaces the user is a member of
        """
        pass

    def test_update_workspace(self) -> None:
        """Test case for update_workspace

        Update an workspace
        """
        pass


if __name__ == '__main__':
    unittest.main()
