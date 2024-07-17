# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.NeedsPrivilegedSessionError do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :error,
    :redirect_browser_to
  ]

  @type t :: %__MODULE__{
    :error => Ory.Model.GenericError.t | nil,
    :redirect_browser_to => String.t
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:error, :struct, Ory.Model.GenericError)
  end
end

