/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Ory.Kratos.Client.Client;
using Ory.Kratos.Client.Api;
// uncomment below to import models
//using Ory.Kratos.Client.Model;

namespace Ory.Kratos.Client.Test.Api
{
    /// <summary>
    ///  Class for testing CourierApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CourierApiTests : IDisposable
    {
        private CourierApi instance;

        public CourierApiTests()
        {
            instance = new CourierApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CourierApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CourierApi
            //Assert.IsType<CourierApi>(instance);
        }

        /// <summary>
        /// Test ListCourierMessages
        /// </summary>
        [Fact]
        public void ListCourierMessagesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? perPage = null;
            //long? page = null;
            //KratosCourierMessageStatus? status = null;
            //string recipient = null;
            //var response = instance.ListCourierMessages(perPage, page, status, recipient);
            //Assert.IsType<List<KratosMessage>>(response);
        }
    }
}
