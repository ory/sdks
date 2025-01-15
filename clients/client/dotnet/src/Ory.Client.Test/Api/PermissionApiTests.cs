/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.0
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
    ///  Class for testing PermissionApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PermissionApiTests : IDisposable
    {
        private PermissionApi instance;

        public PermissionApiTests()
        {
            instance = new PermissionApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PermissionApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' PermissionApi
            //Assert.IsType<PermissionApi>(instance);
        }

        /// <summary>
        /// Test BatchCheckPermission
        /// </summary>
        [Fact]
        public void BatchCheckPermissionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? maxDepth = null;
            //ClientBatchCheckPermissionBody? clientBatchCheckPermissionBody = null;
            //var response = instance.BatchCheckPermission(maxDepth, clientBatchCheckPermissionBody);
            //Assert.IsType<ClientBatchCheckPermissionResult>(response);
        }

        /// <summary>
        /// Test CheckPermission
        /// </summary>
        [Fact]
        public void CheckPermissionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? varNamespace = null;
            //string? varObject = null;
            //string? relation = null;
            //string? subjectId = null;
            //string? subjectSetNamespace = null;
            //string? subjectSetObject = null;
            //string? subjectSetRelation = null;
            //long? maxDepth = null;
            //var response = instance.CheckPermission(varNamespace, varObject, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
            //Assert.IsType<ClientCheckPermissionResult>(response);
        }

        /// <summary>
        /// Test CheckPermissionOrError
        /// </summary>
        [Fact]
        public void CheckPermissionOrErrorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? varNamespace = null;
            //string? varObject = null;
            //string? relation = null;
            //string? subjectId = null;
            //string? subjectSetNamespace = null;
            //string? subjectSetObject = null;
            //string? subjectSetRelation = null;
            //long? maxDepth = null;
            //var response = instance.CheckPermissionOrError(varNamespace, varObject, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
            //Assert.IsType<ClientCheckPermissionResult>(response);
        }

        /// <summary>
        /// Test ExpandPermissions
        /// </summary>
        [Fact]
        public void ExpandPermissionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string varNamespace = null;
            //string varObject = null;
            //string relation = null;
            //long? maxDepth = null;
            //var response = instance.ExpandPermissions(varNamespace, varObject, relation, maxDepth);
            //Assert.IsType<ClientExpandedPermissionTree>(response);
        }

        /// <summary>
        /// Test PostCheckPermission
        /// </summary>
        [Fact]
        public void PostCheckPermissionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? maxDepth = null;
            //ClientPostCheckPermissionBody? clientPostCheckPermissionBody = null;
            //var response = instance.PostCheckPermission(maxDepth, clientPostCheckPermissionBody);
            //Assert.IsType<ClientCheckPermissionResult>(response);
        }

        /// <summary>
        /// Test PostCheckPermissionOrError
        /// </summary>
        [Fact]
        public void PostCheckPermissionOrErrorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? maxDepth = null;
            //ClientPostCheckPermissionOrErrorBody? clientPostCheckPermissionOrErrorBody = null;
            //var response = instance.PostCheckPermissionOrError(maxDepth, clientPostCheckPermissionOrErrorBody);
            //Assert.IsType<ClientCheckPermissionResult>(response);
        }
    }
}
