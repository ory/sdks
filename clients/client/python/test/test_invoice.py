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

from ory_client.models.invoice import Invoice

class TestInvoice(unittest.TestCase):
    """Invoice unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Invoice:
        """Test Invoice
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Invoice`
        """
        model = Invoice()
        if include_optional:
            return Invoice(
                id = '',
                invoiced_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                type = 'usage',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                v1 = ory_client.models.invoice_data_v1.InvoiceDataV1(
                    billing_period = ory_client.models.time_interval.TimeInterval(
                        end = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        start = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), 
                    currency = '', 
                    items = [
                        ory_client.models.line_item_v1.LineItemV1(
                            amount_in_cent = 56, 
                            description = '', 
                            quantity = 56, 
                            title = '', 
                            unit_price = '', )
                        ], 
                    plan = '', 
                    stripe_invoice_item = '', 
                    stripe_invoice_status = '', 
                    stripe_link = '', 
                    subtitle = '', 
                    tax = ory_client.models.tax_line_item.TaxLineItem(
                        amount_in_cent = 56, 
                        title = '', ), 
                    title = '', 
                    total_in_cent = 56, )
            )
        else:
            return Invoice(
                id = '',
                invoiced_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                type = 'usage',
        )
        """

    def testInvoice(self):
        """Test Invoice"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
