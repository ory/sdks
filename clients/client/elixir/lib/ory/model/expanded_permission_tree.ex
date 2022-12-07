# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ExpandedPermissionTree do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :children,
    :tuple,
    :type
  ]

  @type t :: %__MODULE__{
    :children => [Ory.Model.ExpandedPermissionTree.t] | nil,
    :tuple => Ory.Model.Relationship.t | nil,
    :type => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.ExpandedPermissionTree do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:children, :list, Ory.Model.ExpandedPermissionTree, options)
    |> deserialize(:tuple, :struct, Ory.Model.Relationship, options)
  end
end

