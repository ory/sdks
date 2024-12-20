/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.16
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
    ///  Class for testing WorkspaceApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class WorkspaceApiTests : IDisposable
    {
        private WorkspaceApi instance;

        public WorkspaceApiTests()
        {
            instance = new WorkspaceApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of WorkspaceApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' WorkspaceApi
            //Assert.IsType<WorkspaceApi>(instance);
        }

        /// <summary>
        /// Test CreateWorkspace
        /// </summary>
        [Fact]
        public void CreateWorkspaceTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ClientCreateWorkspaceBody? clientCreateWorkspaceBody = null;
            //var response = instance.CreateWorkspace(clientCreateWorkspaceBody);
            //Assert.IsType<ClientWorkspace>(response);
        }

        /// <summary>
        /// Test CreateWorkspaceApiKey
        /// </summary>
        [Fact]
        public void CreateWorkspaceApiKeyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //ClientCreateWorkspaceApiKeyBody? clientCreateWorkspaceApiKeyBody = null;
            //var response = instance.CreateWorkspaceApiKey(workspace, clientCreateWorkspaceApiKeyBody);
            //Assert.IsType<ClientWorkspaceApiKey>(response);
        }

        /// <summary>
        /// Test DeleteWorkspaceApiKey
        /// </summary>
        [Fact]
        public void DeleteWorkspaceApiKeyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //string tokenId = null;
            //instance.DeleteWorkspaceApiKey(workspace, tokenId);
        }

        /// <summary>
        /// Test GetWorkspace
        /// </summary>
        [Fact]
        public void GetWorkspaceTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //var response = instance.GetWorkspace(workspace);
            //Assert.IsType<ClientWorkspace>(response);
        }

        /// <summary>
        /// Test ListWorkspaceApiKeys
        /// </summary>
        [Fact]
        public void ListWorkspaceApiKeysTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //var response = instance.ListWorkspaceApiKeys(workspace);
            //Assert.IsType<List<ClientWorkspaceApiKey>>(response);
        }

        /// <summary>
        /// Test ListWorkspaceProjects
        /// </summary>
        [Fact]
        public void ListWorkspaceProjectsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //var response = instance.ListWorkspaceProjects(workspace);
            //Assert.IsType<ClientListWorkspaceProjects>(response);
        }

        /// <summary>
        /// Test ListWorkspaces
        /// </summary>
        [Fact]
        public void ListWorkspacesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? pageSize = null;
            //string? pageToken = null;
            //var response = instance.ListWorkspaces(pageSize, pageToken);
            //Assert.IsType<ClientListWorkspaces>(response);
        }

        /// <summary>
        /// Test UpdateWorkspace
        /// </summary>
        [Fact]
        public void UpdateWorkspaceTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string workspace = null;
            //ClientUpdateWorkspaceBody? clientUpdateWorkspaceBody = null;
            //var response = instance.UpdateWorkspace(workspace, clientUpdateWorkspaceBody);
            //Assert.IsType<ClientWorkspace>(response);
        }
    }
}
