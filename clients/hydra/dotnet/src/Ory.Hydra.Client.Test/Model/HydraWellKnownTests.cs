/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.11.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Hydra.Client.Api;
using Ory.Hydra.Client.Model;
using Ory.Hydra.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Hydra.Client.Test.Model
{
    /// <summary>
    ///  Class for testing HydraWellKnown
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class HydraWellKnownTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for HydraWellKnown
        //private HydraWellKnown instance;

        public HydraWellKnownTests()
        {
            // TODO uncomment below to create an instance of HydraWellKnown
            //instance = new HydraWellKnown();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of HydraWellKnown
        /// </summary>
        [Fact]
        public void HydraWellKnownInstanceTest()
        {
            // TODO uncomment below to test "IsType" HydraWellKnown
            //Assert.IsType<HydraWellKnown>(instance);
        }


        /// <summary>
        /// Test the property 'AuthorizationEndpoint'
        /// </summary>
        [Fact]
        public void AuthorizationEndpointTest()
        {
            // TODO unit test for the property 'AuthorizationEndpoint'
        }
        /// <summary>
        /// Test the property 'BackchannelLogoutSessionSupported'
        /// </summary>
        [Fact]
        public void BackchannelLogoutSessionSupportedTest()
        {
            // TODO unit test for the property 'BackchannelLogoutSessionSupported'
        }
        /// <summary>
        /// Test the property 'BackchannelLogoutSupported'
        /// </summary>
        [Fact]
        public void BackchannelLogoutSupportedTest()
        {
            // TODO unit test for the property 'BackchannelLogoutSupported'
        }
        /// <summary>
        /// Test the property 'ClaimsParameterSupported'
        /// </summary>
        [Fact]
        public void ClaimsParameterSupportedTest()
        {
            // TODO unit test for the property 'ClaimsParameterSupported'
        }
        /// <summary>
        /// Test the property 'ClaimsSupported'
        /// </summary>
        [Fact]
        public void ClaimsSupportedTest()
        {
            // TODO unit test for the property 'ClaimsSupported'
        }
        /// <summary>
        /// Test the property 'CodeChallengeMethodsSupported'
        /// </summary>
        [Fact]
        public void CodeChallengeMethodsSupportedTest()
        {
            // TODO unit test for the property 'CodeChallengeMethodsSupported'
        }
        /// <summary>
        /// Test the property 'EndSessionEndpoint'
        /// </summary>
        [Fact]
        public void EndSessionEndpointTest()
        {
            // TODO unit test for the property 'EndSessionEndpoint'
        }
        /// <summary>
        /// Test the property 'FrontchannelLogoutSessionSupported'
        /// </summary>
        [Fact]
        public void FrontchannelLogoutSessionSupportedTest()
        {
            // TODO unit test for the property 'FrontchannelLogoutSessionSupported'
        }
        /// <summary>
        /// Test the property 'FrontchannelLogoutSupported'
        /// </summary>
        [Fact]
        public void FrontchannelLogoutSupportedTest()
        {
            // TODO unit test for the property 'FrontchannelLogoutSupported'
        }
        /// <summary>
        /// Test the property 'GrantTypesSupported'
        /// </summary>
        [Fact]
        public void GrantTypesSupportedTest()
        {
            // TODO unit test for the property 'GrantTypesSupported'
        }
        /// <summary>
        /// Test the property 'IdTokenSigningAlgValuesSupported'
        /// </summary>
        [Fact]
        public void IdTokenSigningAlgValuesSupportedTest()
        {
            // TODO unit test for the property 'IdTokenSigningAlgValuesSupported'
        }
        /// <summary>
        /// Test the property 'Issuer'
        /// </summary>
        [Fact]
        public void IssuerTest()
        {
            // TODO unit test for the property 'Issuer'
        }
        /// <summary>
        /// Test the property 'JwksUri'
        /// </summary>
        [Fact]
        public void JwksUriTest()
        {
            // TODO unit test for the property 'JwksUri'
        }
        /// <summary>
        /// Test the property 'RegistrationEndpoint'
        /// </summary>
        [Fact]
        public void RegistrationEndpointTest()
        {
            // TODO unit test for the property 'RegistrationEndpoint'
        }
        /// <summary>
        /// Test the property 'RequestObjectSigningAlgValuesSupported'
        /// </summary>
        [Fact]
        public void RequestObjectSigningAlgValuesSupportedTest()
        {
            // TODO unit test for the property 'RequestObjectSigningAlgValuesSupported'
        }
        /// <summary>
        /// Test the property 'RequestParameterSupported'
        /// </summary>
        [Fact]
        public void RequestParameterSupportedTest()
        {
            // TODO unit test for the property 'RequestParameterSupported'
        }
        /// <summary>
        /// Test the property 'RequestUriParameterSupported'
        /// </summary>
        [Fact]
        public void RequestUriParameterSupportedTest()
        {
            // TODO unit test for the property 'RequestUriParameterSupported'
        }
        /// <summary>
        /// Test the property 'RequireRequestUriRegistration'
        /// </summary>
        [Fact]
        public void RequireRequestUriRegistrationTest()
        {
            // TODO unit test for the property 'RequireRequestUriRegistration'
        }
        /// <summary>
        /// Test the property 'ResponseModesSupported'
        /// </summary>
        [Fact]
        public void ResponseModesSupportedTest()
        {
            // TODO unit test for the property 'ResponseModesSupported'
        }
        /// <summary>
        /// Test the property 'ResponseTypesSupported'
        /// </summary>
        [Fact]
        public void ResponseTypesSupportedTest()
        {
            // TODO unit test for the property 'ResponseTypesSupported'
        }
        /// <summary>
        /// Test the property 'RevocationEndpoint'
        /// </summary>
        [Fact]
        public void RevocationEndpointTest()
        {
            // TODO unit test for the property 'RevocationEndpoint'
        }
        /// <summary>
        /// Test the property 'ScopesSupported'
        /// </summary>
        [Fact]
        public void ScopesSupportedTest()
        {
            // TODO unit test for the property 'ScopesSupported'
        }
        /// <summary>
        /// Test the property 'SubjectTypesSupported'
        /// </summary>
        [Fact]
        public void SubjectTypesSupportedTest()
        {
            // TODO unit test for the property 'SubjectTypesSupported'
        }
        /// <summary>
        /// Test the property 'TokenEndpoint'
        /// </summary>
        [Fact]
        public void TokenEndpointTest()
        {
            // TODO unit test for the property 'TokenEndpoint'
        }
        /// <summary>
        /// Test the property 'TokenEndpointAuthMethodsSupported'
        /// </summary>
        [Fact]
        public void TokenEndpointAuthMethodsSupportedTest()
        {
            // TODO unit test for the property 'TokenEndpointAuthMethodsSupported'
        }
        /// <summary>
        /// Test the property 'UserinfoEndpoint'
        /// </summary>
        [Fact]
        public void UserinfoEndpointTest()
        {
            // TODO unit test for the property 'UserinfoEndpoint'
        }
        /// <summary>
        /// Test the property 'UserinfoSigningAlgValuesSupported'
        /// </summary>
        [Fact]
        public void UserinfoSigningAlgValuesSupportedTest()
        {
            // TODO unit test for the property 'UserinfoSigningAlgValuesSupported'
        }

    }

}
