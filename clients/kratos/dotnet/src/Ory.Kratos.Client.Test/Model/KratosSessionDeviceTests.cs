/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.9.0-alpha.3
 * Contact: hi@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Kratos.Client.Api;
using Ory.Kratos.Client.Model;
using Ory.Kratos.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Kratos.Client.Test.Model
{
    /// <summary>
    ///  Class for testing KratosSessionDevice
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class KratosSessionDeviceTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for KratosSessionDevice
        //private KratosSessionDevice instance;

        public KratosSessionDeviceTests()
        {
            // TODO uncomment below to create an instance of KratosSessionDevice
            //instance = new KratosSessionDevice();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of KratosSessionDevice
        /// </summary>
        [Fact]
        public void KratosSessionDeviceInstanceTest()
        {
            // TODO uncomment below to test "IsType" KratosSessionDevice
            //Assert.IsType<KratosSessionDevice>(instance);
        }


        /// <summary>
        /// Test the property 'UserAgent'
        /// </summary>
        [Fact]
        public void UserAgentTest()
        {
            // TODO unit test for the property 'UserAgent'
        }

    }

}
