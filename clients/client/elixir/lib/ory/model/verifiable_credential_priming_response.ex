# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.VerifiableCredentialPrimingResponse do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :c_nonce,
    :c_nonce_expires_in,
    :error,
    :error_debug,
    :error_description,
    :error_hint,
    :format,
    :status_code
  ]

  @type t :: %__MODULE__{
    :c_nonce => String.t | nil,
    :c_nonce_expires_in => integer() | nil,
    :error => String.t | nil,
    :error_debug => String.t | nil,
    :error_description => String.t | nil,
    :error_hint => String.t | nil,
    :format => String.t | nil,
    :status_code => integer() | nil
  }

  def decode(value) do
    value
  end
end

