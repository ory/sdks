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
    ///  Class for testing OidcApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class OidcApiTests : IDisposable
    {
        private OidcApi instance;

        public OidcApiTests()
        {
            instance = new OidcApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of OidcApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' OidcApi
            //Assert.IsType<OidcApi>(instance);
        }

        /// <summary>
        /// Test CreateOidcDynamicClient
        /// </summary>
        [Fact]
        public void CreateOidcDynamicClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ClientOAuth2Client clientOAuth2Client = null;
            //var response = instance.CreateOidcDynamicClient(clientOAuth2Client);
            //Assert.IsType<ClientOAuth2Client>(response);
        }

        /// <summary>
        /// Test CreateVerifiableCredential
        /// </summary>
        [Fact]
        public void CreateVerifiableCredentialTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ClientCreateVerifiableCredentialRequestBody clientCreateVerifiableCredentialRequestBody = null;
            //var response = instance.CreateVerifiableCredential(clientCreateVerifiableCredentialRequestBody);
            //Assert.IsType<ClientVerifiableCredentialResponse>(response);
        }

        /// <summary>
        /// Test DeleteOidcDynamicClient
        /// </summary>
        [Fact]
        public void DeleteOidcDynamicClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //instance.DeleteOidcDynamicClient(id);
        }

        /// <summary>
        /// Test DiscoverOidcConfiguration
        /// </summary>
        [Fact]
        public void DiscoverOidcConfigurationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.DiscoverOidcConfiguration();
            //Assert.IsType<ClientOidcConfiguration>(response);
        }

        /// <summary>
        /// Test GetOidcDynamicClient
        /// </summary>
        [Fact]
        public void GetOidcDynamicClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetOidcDynamicClient(id);
            //Assert.IsType<ClientOAuth2Client>(response);
        }

        /// <summary>
        /// Test GetOidcUserInfo
        /// </summary>
        [Fact]
        public void GetOidcUserInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetOidcUserInfo();
            //Assert.IsType<ClientOidcUserInfo>(response);
        }

        /// <summary>
        /// Test RevokeOidcSession
        /// </summary>
        [Fact]
        public void RevokeOidcSessionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.RevokeOidcSession();
        }

        /// <summary>
        /// Test SetOidcDynamicClient
        /// </summary>
        [Fact]
        public void SetOidcDynamicClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //ClientOAuth2Client clientOAuth2Client = null;
            //var response = instance.SetOidcDynamicClient(id, clientOAuth2Client);
            //Assert.IsType<ClientOAuth2Client>(response);
        }
    }
}
