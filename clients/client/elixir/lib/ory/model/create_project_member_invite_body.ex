# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CreateProjectMemberInviteBody do
  @moduledoc """
  Create Project MemberInvite Request Body
  """

  @derive Jason.Encoder
  defstruct [
    :invitee_email
  ]

  @type t :: %__MODULE__{
    :invitee_email => String.t | nil
  }

  def decode(value) do
    value
  end
end

