# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CloudAccount do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :email,
    :email_verified,
    :id,
    :name
  ]

  @type t :: %__MODULE__{
    :email => String.t,
    :email_verified => boolean(),
    :id => String.t,
    :name => String.t
  }

  def decode(value) do
    value
  end
end

