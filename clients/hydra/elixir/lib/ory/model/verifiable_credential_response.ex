# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.VerifiableCredentialResponse do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :credential_draft_00,
    :format
  ]

  @type t :: %__MODULE__{
    :credential_draft_00 => String.t | nil,
    :format => String.t | nil
  }

  def decode(value) do
    value
  end
end

