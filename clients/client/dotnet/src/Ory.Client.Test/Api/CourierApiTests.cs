/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.2
 * Contact: support@ory.sh
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

using Ory.Client.Client;
using Ory.Client.Api;
// uncomment below to import models
//using Ory.Client.Model;

namespace Ory.Client.Test.Api
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
        /// Test GetCourierMessage
        /// </summary>
        [Fact]
        public void GetCourierMessageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetCourierMessage(id);
            //Assert.IsType<ClientMessage>(response);
        }

        /// <summary>
        /// Test ListCourierMessages
        /// </summary>
        [Fact]
        public void ListCourierMessagesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? pageSize = null;
            //string pageToken = null;
            //ClientCourierMessageStatus? status = null;
            //string recipient = null;
            //var response = instance.ListCourierMessages(pageSize, pageToken, status, recipient);
            //Assert.IsType<List<ClientMessage>>(response);
        }
    }
}
