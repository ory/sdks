# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Api.Workspace do
  @moduledoc """
  API calls for all endpoints tagged `Workspace`.
  """

  alias Ory.Connection
  import Ory.RequestBuilder

  @doc """
  Create a new workspace

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:body` (CreateWorkspaceBody): 

  ### Returns

  - `{:ok, Ory.Model.Workspace.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec create_workspace(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.Workspace.t} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def create_workspace(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }

    request =
      %{}
      |> method(:post)
      |> url("/workspaces")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {201, Ory.Model.Workspace},
      {400, Ory.Model.ErrorGeneric},
      {401, Ory.Model.ErrorGeneric},
      {403, Ory.Model.ErrorGeneric},
      {500, Ory.Model.ErrorGeneric},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  Create workspace API key
  Create an API key for a workspace.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): The Workspace ID
  - `opts` (keyword): Optional parameters
    - `:body` (CreateWorkspaceApiKeyBody): 

  ### Returns

  - `{:ok, Ory.Model.WorkspaceApiKey.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec create_workspace_api_key(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.WorkspaceApiKey.t} | {:error, Tesla.Env.t}
  def create_workspace_api_key(connection, workspace, opts \\ []) do
    optional_params = %{
      :body => :body
    }

    request =
      %{}
      |> method(:post)
      |> url("/workspaces/#{workspace}/tokens")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {201, Ory.Model.WorkspaceApiKey},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  Delete workspace API token
  Deletes an API token and immediately removes it.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): The Workspace ID or Workspace slug
  - `token_id` (String.t): The Token ID
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec delete_workspace_api_key(Tesla.Env.client, String.t, String.t, keyword()) :: {:ok, nil} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def delete_workspace_api_key(connection, workspace, token_id, _opts \\ []) do
    request =
      %{}
      |> method(:delete)
      |> url("/workspaces/#{workspace}/tokens/#{token_id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {204, false},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  Get a workspace
  Any workspace member can access this endpoint.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.Workspace.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_workspace(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.Workspace.t} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def get_workspace(connection, workspace, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/workspaces/#{workspace}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.Workspace},
      {400, Ory.Model.ErrorGeneric},
      {401, Ory.Model.ErrorGeneric},
      {403, Ory.Model.ErrorGeneric},
      {500, Ory.Model.ErrorGeneric},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  List a workspace's API Tokens
  A list of all the workspace's API tokens.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): The Workspace ID or Workspace slug
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%WorkspaceApiKey{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec list_workspace_api_keys(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, [Ory.Model.WorkspaceApiKey.t]} | {:error, Tesla.Env.t}
  def list_workspace_api_keys(connection, workspace, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/workspaces/#{workspace}/tokens")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.WorkspaceApiKey},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  List all projects of a workspace
  Any workspace member can access this endpoint.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, Ory.Model.ListWorkspaceProjects.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec list_workspace_projects(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.ListWorkspaceProjects.t} | {:error, Tesla.Env.t}
  def list_workspace_projects(connection, workspace, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/workspaces/#{workspace}/projects")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.ListWorkspaceProjects},
      {400, Ory.Model.ErrorGeneric},
      {401, Ory.Model.ErrorGeneric},
      {403, Ory.Model.ErrorGeneric},
      {500, Ory.Model.ErrorGeneric},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  List workspaces the user is a member of

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:page_size` (integer()): Items per Page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
    - `:page_token` (String.t): Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).

  ### Returns

  - `{:ok, Ory.Model.ListWorkspaces.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec list_workspaces(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.ListWorkspaces.t} | {:error, Tesla.Env.t}
  def list_workspaces(connection, opts \\ []) do
    optional_params = %{
      :page_size => :query,
      :page_token => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/workspaces")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.ListWorkspaces},
      {400, Ory.Model.ErrorGeneric},
      {401, Ory.Model.ErrorGeneric},
      {403, Ory.Model.ErrorGeneric},
      {500, Ory.Model.ErrorGeneric},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end

  @doc """
  Update an workspace
  Workspace members with the role `OWNER` can access this endpoint.

  ### Parameters

  - `connection` (Ory.Connection): Connection to server
  - `workspace` (String.t): 
  - `opts` (keyword): Optional parameters
    - `:body` (UpdateWorkspaceBody): 

  ### Returns

  - `{:ok, Ory.Model.Workspace.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec update_workspace(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.Workspace.t} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def update_workspace(connection, workspace, opts \\ []) do
    optional_params = %{
      :body => :body
    }

    request =
      %{}
      |> method(:put)
      |> url("/workspaces/#{workspace}")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, Ory.Model.Workspace},
      {400, Ory.Model.ErrorGeneric},
      {401, Ory.Model.ErrorGeneric},
      {403, Ory.Model.ErrorGeneric},
      {500, Ory.Model.ErrorGeneric},
      {:default, Ory.Model.ErrorGeneric}
    ])
  end
end
