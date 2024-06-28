# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CreateProjectBranding do
  @moduledoc """
  Create a Project Branding
  """

  @derive Jason.Encoder
  defstruct [
    :favicon_type,
    :favicon_url,
    :logo_type,
    :logo_url,
    :name,
    :theme
  ]

  @type t :: %__MODULE__{
    :favicon_type => String.t | nil,
    :favicon_url => String.t | nil,
    :logo_type => String.t | nil,
    :logo_url => String.t | nil,
    :name => String.t | nil,
    :theme => Ory.Model.ProjectBrandingColors.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:theme, :struct, Ory.Model.ProjectBrandingColors)
  end
end

