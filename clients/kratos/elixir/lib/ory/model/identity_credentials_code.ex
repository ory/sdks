# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentityCredentialsCode do
  @moduledoc """
  CredentialsCode represents a one time login/registration code
  """

  @derive Jason.Encoder
  defstruct [
    :address_type,
    :used_at
  ]

  @type t :: %__MODULE__{
    :address_type => String.t | nil,
    :used_at => DateTime.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:used_at, :datetime, nil)
  end
end

