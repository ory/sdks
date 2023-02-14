# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UiNodeAttributes do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :autocomplete,
    :disabled,
    :label,
    :name,
    :node_type,
    :onclick,
    :pattern,
    :required,
    :type,
    :value,
    :id,
    :text,
    :height,
    :src,
    :width,
    :href,
    :title,
    :async,
    :crossorigin,
    :integrity,
    :nonce,
    :referrerpolicy
  ]

  @type t :: %__MODULE__{
    :autocomplete => String.t | nil,
    :disabled => boolean(),
    :label => Ory.Model.UiText.t | nil,
    :name => String.t,
    :node_type => String.t,
    :onclick => String.t | nil,
    :pattern => String.t | nil,
    :required => boolean() | nil,
    :type => String.t,
    :value => AnyType | nil,
    :id => String.t,
    :text => Ory.Model.UiText.t,
    :height => integer(),
    :src => String.t,
    :width => integer(),
    :href => String.t,
    :title => Ory.Model.UiText.t,
    :async => boolean(),
    :crossorigin => String.t,
    :integrity => String.t,
    :nonce => String.t,
    :referrerpolicy => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.UiNodeAttributes do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:label, :struct, Ory.Model.UiText, options)
    |> deserialize(:value, :struct, Ory.Model.AnyType, options)
    |> deserialize(:text, :struct, Ory.Model.UiText, options)
    |> deserialize(:title, :struct, Ory.Model.UiText, options)
  end
end

