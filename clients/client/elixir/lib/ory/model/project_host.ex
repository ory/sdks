# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ProjectHost do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"host",
    :"id",
    :"project_id"
  ]

  @type t :: %__MODULE__{
    :"host" => String.t,
    :"id" => String.t,
    :"project_id" => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.ProjectHost do
  def decode(value, _options) do
    value
  end
end

