# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.HealthNotReadyStatus do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :errors
  ]

  @type t :: %__MODULE__{
    :errors => %{optional(String.t) => String.t} | nil
  }

  def decode(value) do
    value
  end
end

