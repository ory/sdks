# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.NormalizedProjectRevision do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :hydra_oauth2_allowed_top_level_claims,
    :hydra_oauth2_client_credentials_default_grant_allowed_scope,
    :hydra_oauth2_exclude_not_before_claim,
    :hydra_oauth2_grant_jwt_iat_optional,
    :hydra_oauth2_grant_jwt_jti_optional,
    :hydra_oauth2_grant_jwt_max_ttl,
    :hydra_oauth2_pkce_enforced,
    :hydra_oauth2_pkce_enforced_for_public_clients,
    :hydra_oauth2_refresh_token_hook,
    :hydra_oidc_dynamic_client_registration_default_scope,
    :hydra_oidc_dynamic_client_registration_enabled,
    :hydra_oidc_subject_identifiers_pairwise_salt,
    :hydra_oidc_subject_identifiers_supported_types,
    :hydra_secrets_cookie,
    :hydra_secrets_system,
    :hydra_serve_cookies_same_site_legacy_workaround,
    :hydra_serve_cookies_same_site_mode,
    :hydra_strategies_access_token,
    :hydra_strategies_scope,
    :hydra_ttl_access_token,
    :hydra_ttl_auth_code,
    :hydra_ttl_id_token,
    :hydra_ttl_login_consent_request,
    :hydra_ttl_refresh_token,
    :hydra_urls_consent,
    :hydra_urls_error,
    :hydra_urls_login,
    :hydra_urls_logout,
    :hydra_urls_post_logout_redirect,
    :hydra_urls_self_issuer,
    :hydra_webfinger_jwks_broadcast_keys,
    :hydra_webfinger_oidc_discovery_auth_url,
    :hydra_webfinger_oidc_discovery_client_registration_url,
    :hydra_webfinger_oidc_discovery_jwks_url,
    :hydra_webfinger_oidc_discovery_supported_claims,
    :hydra_webfinger_oidc_discovery_supported_scope,
    :hydra_webfinger_oidc_discovery_token_url,
    :hydra_webfinger_oidc_discovery_userinfo_url,
    :id,
    :keto_namespace_configuration,
    :keto_namespaces,
    :keto_read_max_depth,
    :kratos_cookies_same_site,
    :kratos_courier_smtp_connection_uri,
    :kratos_courier_smtp_from_address,
    :kratos_courier_smtp_from_name,
    :kratos_courier_smtp_headers,
    :kratos_courier_templates_recovery_code_invalid_email_body_html,
    :kratos_courier_templates_recovery_code_invalid_email_body_plaintext,
    :kratos_courier_templates_recovery_code_invalid_email_subject,
    :kratos_courier_templates_recovery_code_valid_email_body_html,
    :kratos_courier_templates_recovery_code_valid_email_body_plaintext,
    :kratos_courier_templates_recovery_code_valid_email_subject,
    :kratos_courier_templates_recovery_invalid_email_body_html,
    :kratos_courier_templates_recovery_invalid_email_body_plaintext,
    :kratos_courier_templates_recovery_invalid_email_subject,
    :kratos_courier_templates_recovery_valid_email_body_html,
    :kratos_courier_templates_recovery_valid_email_body_plaintext,
    :kratos_courier_templates_recovery_valid_email_subject,
    :kratos_courier_templates_verification_code_invalid_email_body_html,
    :kratos_courier_templates_verification_code_invalid_email_body_plaintext,
    :kratos_courier_templates_verification_code_invalid_email_subject,
    :kratos_courier_templates_verification_code_valid_email_body_html,
    :kratos_courier_templates_verification_code_valid_email_body_plaintext,
    :kratos_courier_templates_verification_code_valid_email_subject,
    :kratos_courier_templates_verification_invalid_email_body_html,
    :kratos_courier_templates_verification_invalid_email_body_plaintext,
    :kratos_courier_templates_verification_invalid_email_subject,
    :kratos_courier_templates_verification_valid_email_body_html,
    :kratos_courier_templates_verification_valid_email_body_plaintext,
    :kratos_courier_templates_verification_valid_email_subject,
    :kratos_feature_flags_cacheable_sessions,
    :kratos_identity_schemas,
    :kratos_oauth2_provider_headers,
    :kratos_oauth2_provider_override_return_to,
    :kratos_oauth2_provider_url,
    :kratos_secrets_cipher,
    :kratos_secrets_cookie,
    :kratos_secrets_default,
    :kratos_selfservice_allowed_return_urls,
    :kratos_selfservice_default_browser_return_url,
    :kratos_selfservice_flows_error_ui_url,
    :kratos_selfservice_flows_hooks,
    :kratos_selfservice_flows_login_after_default_browser_return_url,
    :kratos_selfservice_flows_login_after_oidc_default_browser_return_url,
    :kratos_selfservice_flows_login_after_password_default_browser_return_url,
    :kratos_selfservice_flows_login_after_webauthn_default_browser_return_url,
    :kratos_selfservice_flows_login_lifespan,
    :kratos_selfservice_flows_login_ui_url,
    :kratos_selfservice_flows_logout_after_default_browser_return_url,
    :kratos_selfservice_flows_recovery_after_default_browser_return_url,
    :kratos_selfservice_flows_recovery_enabled,
    :kratos_selfservice_flows_recovery_lifespan,
    :kratos_selfservice_flows_recovery_notify_unknown_recipients,
    :kratos_selfservice_flows_recovery_ui_url,
    :kratos_selfservice_flows_recovery_use,
    :kratos_selfservice_flows_registration_after_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_oidc_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_password_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_webauthn_default_browser_return_url,
    :kratos_selfservice_flows_registration_enabled,
    :kratos_selfservice_flows_registration_lifespan,
    :kratos_selfservice_flows_registration_ui_url,
    :kratos_selfservice_flows_settings_after_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_password_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_profile_default_browser_return_url,
    :kratos_selfservice_flows_settings_lifespan,
    :kratos_selfservice_flows_settings_privileged_session_max_age,
    :kratos_selfservice_flows_settings_required_aal,
    :kratos_selfservice_flows_settings_ui_url,
    :kratos_selfservice_flows_verification_after_default_browser_return_url,
    :kratos_selfservice_flows_verification_enabled,
    :kratos_selfservice_flows_verification_lifespan,
    :kratos_selfservice_flows_verification_notify_unknown_recipients,
    :kratos_selfservice_flows_verification_ui_url,
    :kratos_selfservice_flows_verification_use,
    :kratos_selfservice_methods_code_config_lifespan,
    :kratos_selfservice_methods_code_enabled,
    :kratos_selfservice_methods_link_config_base_url,
    :kratos_selfservice_methods_link_config_lifespan,
    :kratos_selfservice_methods_link_enabled,
    :kratos_selfservice_methods_lookup_secret_enabled,
    :kratos_selfservice_methods_oidc_config_base_redirect_uri,
    :kratos_selfservice_methods_oidc_config_providers,
    :kratos_selfservice_methods_oidc_enabled,
    :kratos_selfservice_methods_password_config_haveibeenpwned_enabled,
    :kratos_selfservice_methods_password_config_identifier_similarity_check_enabled,
    :kratos_selfservice_methods_password_config_ignore_network_errors,
    :kratos_selfservice_methods_password_config_max_breaches,
    :kratos_selfservice_methods_password_config_min_password_length,
    :kratos_selfservice_methods_password_enabled,
    :kratos_selfservice_methods_profile_enabled,
    :kratos_selfservice_methods_totp_config_issuer,
    :kratos_selfservice_methods_totp_enabled,
    :kratos_selfservice_methods_webauthn_config_passwordless,
    :kratos_selfservice_methods_webauthn_config_rp_display_name,
    :kratos_selfservice_methods_webauthn_config_rp_icon,
    :kratos_selfservice_methods_webauthn_config_rp_id,
    :kratos_selfservice_methods_webauthn_config_rp_origin,
    :kratos_selfservice_methods_webauthn_enabled,
    :kratos_session_cookie_persistent,
    :kratos_session_cookie_same_site,
    :kratos_session_lifespan,
    :kratos_session_whoami_required_aal,
    :name,
    :production,
    :project_id,
    :serve_admin_cors_allowed_origins,
    :serve_admin_cors_enabled,
    :serve_public_cors_allowed_origins,
    :serve_public_cors_enabled,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t | nil,
    :hydra_oauth2_allowed_top_level_claims => [String.t] | nil,
    :hydra_oauth2_client_credentials_default_grant_allowed_scope => boolean() | nil,
    :hydra_oauth2_exclude_not_before_claim => boolean() | nil,
    :hydra_oauth2_grant_jwt_iat_optional => boolean() | nil,
    :hydra_oauth2_grant_jwt_jti_optional => boolean() | nil,
    :hydra_oauth2_grant_jwt_max_ttl => String.t | nil,
    :hydra_oauth2_pkce_enforced => boolean() | nil,
    :hydra_oauth2_pkce_enforced_for_public_clients => boolean() | nil,
    :hydra_oauth2_refresh_token_hook => String.t | nil,
    :hydra_oidc_dynamic_client_registration_default_scope => [String.t] | nil,
    :hydra_oidc_dynamic_client_registration_enabled => boolean() | nil,
    :hydra_oidc_subject_identifiers_pairwise_salt => String.t | nil,
    :hydra_oidc_subject_identifiers_supported_types => [String.t] | nil,
    :hydra_secrets_cookie => [String.t] | nil,
    :hydra_secrets_system => [String.t] | nil,
    :hydra_serve_cookies_same_site_legacy_workaround => boolean() | nil,
    :hydra_serve_cookies_same_site_mode => String.t | nil,
    :hydra_strategies_access_token => String.t | nil,
    :hydra_strategies_scope => String.t | nil,
    :hydra_ttl_access_token => String.t | nil,
    :hydra_ttl_auth_code => String.t | nil,
    :hydra_ttl_id_token => String.t | nil,
    :hydra_ttl_login_consent_request => String.t | nil,
    :hydra_ttl_refresh_token => String.t | nil,
    :hydra_urls_consent => String.t | nil,
    :hydra_urls_error => String.t | nil,
    :hydra_urls_login => String.t | nil,
    :hydra_urls_logout => String.t | nil,
    :hydra_urls_post_logout_redirect => String.t | nil,
    :hydra_urls_self_issuer => String.t | nil,
    :hydra_webfinger_jwks_broadcast_keys => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_auth_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_client_registration_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_jwks_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_supported_claims => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_supported_scope => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_token_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_userinfo_url => String.t | nil,
    :id => String.t | nil,
    :keto_namespace_configuration => String.t | nil,
    :keto_namespaces => [Ory.Model.KetoNamespace.t] | nil,
    :keto_read_max_depth => integer() | nil,
    :kratos_cookies_same_site => String.t | nil,
    :kratos_courier_smtp_connection_uri => String.t | nil,
    :kratos_courier_smtp_from_address => String.t | nil,
    :kratos_courier_smtp_from_name => String.t | nil,
    :kratos_courier_smtp_headers => map() | nil,
    :kratos_courier_templates_recovery_code_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_code_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_code_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_valid_email_subject => String.t | nil,
    :kratos_feature_flags_cacheable_sessions => boolean() | nil,
    :kratos_identity_schemas => [Ory.Model.NormalizedProjectRevisionIdentitySchema.t] | nil,
    :kratos_oauth2_provider_headers => map() | nil,
    :kratos_oauth2_provider_override_return_to => boolean() | nil,
    :kratos_oauth2_provider_url => String.t | nil,
    :kratos_secrets_cipher => [String.t] | nil,
    :kratos_secrets_cookie => [String.t] | nil,
    :kratos_secrets_default => [String.t] | nil,
    :kratos_selfservice_allowed_return_urls => [String.t] | nil,
    :kratos_selfservice_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_error_ui_url => String.t | nil,
    :kratos_selfservice_flows_hooks => [Ory.Model.NormalizedProjectRevisionHook.t] | nil,
    :kratos_selfservice_flows_login_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_oidc_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_webauthn_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_lifespan => String.t | nil,
    :kratos_selfservice_flows_login_ui_url => String.t | nil,
    :kratos_selfservice_flows_logout_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_recovery_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_recovery_enabled => boolean() | nil,
    :kratos_selfservice_flows_recovery_lifespan => String.t | nil,
    :kratos_selfservice_flows_recovery_notify_unknown_recipients => boolean() | nil,
    :kratos_selfservice_flows_recovery_ui_url => String.t | nil,
    :kratos_selfservice_flows_recovery_use => String.t | nil,
    :kratos_selfservice_flows_registration_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_oidc_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_webauthn_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_enabled => boolean() | nil,
    :kratos_selfservice_flows_registration_lifespan => String.t | nil,
    :kratos_selfservice_flows_registration_ui_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_profile_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_lifespan => String.t | nil,
    :kratos_selfservice_flows_settings_privileged_session_max_age => String.t | nil,
    :kratos_selfservice_flows_settings_required_aal => String.t | nil,
    :kratos_selfservice_flows_settings_ui_url => String.t | nil,
    :kratos_selfservice_flows_verification_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_verification_enabled => boolean() | nil,
    :kratos_selfservice_flows_verification_lifespan => String.t | nil,
    :kratos_selfservice_flows_verification_notify_unknown_recipients => boolean() | nil,
    :kratos_selfservice_flows_verification_ui_url => String.t | nil,
    :kratos_selfservice_flows_verification_use => String.t | nil,
    :kratos_selfservice_methods_code_config_lifespan => String.t | nil,
    :kratos_selfservice_methods_code_enabled => boolean() | nil,
    :kratos_selfservice_methods_link_config_base_url => String.t | nil,
    :kratos_selfservice_methods_link_config_lifespan => String.t | nil,
    :kratos_selfservice_methods_link_enabled => boolean() | nil,
    :kratos_selfservice_methods_lookup_secret_enabled => boolean() | nil,
    :kratos_selfservice_methods_oidc_config_base_redirect_uri => String.t | nil,
    :kratos_selfservice_methods_oidc_config_providers => [Ory.Model.NormalizedProjectRevisionThirdPartyProvider.t] | nil,
    :kratos_selfservice_methods_oidc_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_haveibeenpwned_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_identifier_similarity_check_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_ignore_network_errors => boolean() | nil,
    :kratos_selfservice_methods_password_config_max_breaches => integer() | nil,
    :kratos_selfservice_methods_password_config_min_password_length => integer() | nil,
    :kratos_selfservice_methods_password_enabled => boolean() | nil,
    :kratos_selfservice_methods_profile_enabled => boolean() | nil,
    :kratos_selfservice_methods_totp_config_issuer => String.t | nil,
    :kratos_selfservice_methods_totp_enabled => boolean() | nil,
    :kratos_selfservice_methods_webauthn_config_passwordless => boolean() | nil,
    :kratos_selfservice_methods_webauthn_config_rp_display_name => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_icon => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_id => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_origin => String.t | nil,
    :kratos_selfservice_methods_webauthn_enabled => boolean() | nil,
    :kratos_session_cookie_persistent => boolean() | nil,
    :kratos_session_cookie_same_site => String.t | nil,
    :kratos_session_lifespan => String.t | nil,
    :kratos_session_whoami_required_aal => String.t | nil,
    :name => String.t,
    :production => boolean() | nil,
    :project_id => String.t | nil,
    :serve_admin_cors_allowed_origins => [String.t] | nil,
    :serve_admin_cors_enabled => boolean() | nil,
    :serve_public_cors_allowed_origins => [String.t] | nil,
    :serve_public_cors_enabled => boolean() | nil,
    :updated_at => DateTime.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.NormalizedProjectRevision do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:keto_namespaces, :list, Ory.Model.KetoNamespace, options)
    |> deserialize(:kratos_identity_schemas, :list, Ory.Model.NormalizedProjectRevisionIdentitySchema, options)
    |> deserialize(:kratos_selfservice_flows_hooks, :list, Ory.Model.NormalizedProjectRevisionHook, options)
    |> deserialize(:kratos_selfservice_methods_oidc_config_providers, :list, Ory.Model.NormalizedProjectRevisionThirdPartyProvider, options)
  end
end

