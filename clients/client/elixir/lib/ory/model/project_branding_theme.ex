# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.ProjectBrandingTheme do
  @moduledoc """
  The Project Branding Theme
  """

  @derive [Poison.Encoder]
  defstruct [
    :accent_default_color,
    :accent_disabled_color,
    :accent_emphasis_color,
    :accent_muted_color,
    :accent_subtle_color,
    :background_canvas_color,
    :background_subtle_color,
    :background_surface_color,
    :border_default_color,
    :created_at,
    :error_default_color,
    :error_emphasis_color,
    :error_muted_color,
    :error_subtle_color,
    :foreground_default_color,
    :foreground_disabled_color,
    :foreground_muted_color,
    :foreground_on_accent_color,
    :foreground_on_dark_color,
    :foreground_on_disabled_color,
    :foreground_subtle_color,
    :id,
    :input_background_color,
    :input_disabled_color,
    :input_placeholder_color,
    :input_text_color,
    :logo_type,
    :logo_url,
    :name,
    :primary_color,
    :project_branding_id,
    :secondary_color,
    :success_emphasis_color,
    :text_default_color,
    :text_disabled_color,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :accent_default_color => String.t | nil,
    :accent_disabled_color => String.t | nil,
    :accent_emphasis_color => String.t | nil,
    :accent_muted_color => String.t | nil,
    :accent_subtle_color => String.t | nil,
    :background_canvas_color => String.t | nil,
    :background_subtle_color => String.t | nil,
    :background_surface_color => String.t | nil,
    :border_default_color => String.t | nil,
    :created_at => DateTime.t,
    :error_default_color => String.t | nil,
    :error_emphasis_color => String.t | nil,
    :error_muted_color => String.t | nil,
    :error_subtle_color => String.t | nil,
    :foreground_default_color => String.t | nil,
    :foreground_disabled_color => String.t | nil,
    :foreground_muted_color => String.t | nil,
    :foreground_on_accent_color => String.t | nil,
    :foreground_on_dark_color => String.t | nil,
    :foreground_on_disabled_color => String.t | nil,
    :foreground_subtle_color => String.t | nil,
    :id => String.t,
    :input_background_color => String.t | nil,
    :input_disabled_color => String.t | nil,
    :input_placeholder_color => String.t | nil,
    :input_text_color => String.t | nil,
    :logo_type => String.t | nil,
    :logo_url => String.t | nil,
    :name => String.t,
    :primary_color => String.t | nil,
    :project_branding_id => String.t,
    :secondary_color => String.t | nil,
    :success_emphasis_color => String.t | nil,
    :text_default_color => String.t | nil,
    :text_disabled_color => String.t | nil,
    :updated_at => DateTime.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.ProjectBrandingTheme do
  def decode(value, _options) do
    value
  end
end

