"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.5.2
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import unittest

import ory_client
from ory_client.api.events_api import EventsApi  # noqa: E501


class TestEventsApi(unittest.TestCase):
    """EventsApi unit test stubs"""

    def setUp(self):
        self.api = EventsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_event_stream(self):
        """Test case for create_event_stream

        Create an event stream for your project.  # noqa: E501
        """
        pass

    def test_delete_event_stream(self):
        """Test case for delete_event_stream

        Remove an event stream from a project  # noqa: E501
        """
        pass

    def test_list_event_streams(self):
        """Test case for list_event_streams

        List all event streams for the project. This endpoint is not paginated.  # noqa: E501
        """
        pass

    def test_set_event_stream(self):
        """Test case for set_event_stream

        Update an event stream for a project.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
