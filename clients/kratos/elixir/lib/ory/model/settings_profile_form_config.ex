# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SettingsProfileFormConfig do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"action",
    :"messages",
    :"method",
    :"nodes"
  ]

  @type t :: %__MODULE__{
    :"action" => String.t,
    :"messages" => [Ory.Model.UiText.t] | nil,
    :"method" => String.t,
    :"nodes" => [Ory.Model.UiNode.t]
  }
end

defimpl Poison.Decoder, for: Ory.Model.SettingsProfileFormConfig do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"messages", :list, Ory.Model.UiText, options)
    |> deserialize(:"nodes", :list, Ory.Model.UiNode, options)
  end
end

