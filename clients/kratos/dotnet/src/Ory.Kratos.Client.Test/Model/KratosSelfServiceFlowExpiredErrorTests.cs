/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.1
 * Contact: office@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Kratos.Client.Model;
using Ory.Kratos.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Kratos.Client.Test.Model
{
    /// <summary>
    ///  Class for testing KratosSelfServiceFlowExpiredError
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class KratosSelfServiceFlowExpiredErrorTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for KratosSelfServiceFlowExpiredError
        //private KratosSelfServiceFlowExpiredError instance;

        public KratosSelfServiceFlowExpiredErrorTests()
        {
            // TODO uncomment below to create an instance of KratosSelfServiceFlowExpiredError
            //instance = new KratosSelfServiceFlowExpiredError();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of KratosSelfServiceFlowExpiredError
        /// </summary>
        [Fact]
        public void KratosSelfServiceFlowExpiredErrorInstanceTest()
        {
            // TODO uncomment below to test "IsType" KratosSelfServiceFlowExpiredError
            //Assert.IsType<KratosSelfServiceFlowExpiredError>(instance);
        }

        /// <summary>
        /// Test the property 'Error'
        /// </summary>
        [Fact]
        public void ErrorTest()
        {
            // TODO unit test for the property 'Error'
        }

        /// <summary>
        /// Test the property 'ExpiredAt'
        /// </summary>
        [Fact]
        public void ExpiredAtTest()
        {
            // TODO unit test for the property 'ExpiredAt'
        }

        /// <summary>
        /// Test the property 'Since'
        /// </summary>
        [Fact]
        public void SinceTest()
        {
            // TODO unit test for the property 'Since'
        }

        /// <summary>
        /// Test the property 'UseFlowId'
        /// </summary>
        [Fact]
        public void UseFlowIdTest()
        {
            // TODO unit test for the property 'UseFlowId'
        }
    }
}
