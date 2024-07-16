# coding: utf-8

"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

    The version of the OpenAPI document: v1.14.0
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class AccountExperienceThemeVariables(BaseModel):
    """
    AccountExperienceThemeVariables
    """ # noqa: E501
    accent: Optional[StrictStr] = None
    bg_default: Optional[StrictStr] = Field(default=None, alias="bg-default")
    border_radius_branding: Optional[StrictStr] = Field(default=None, alias="border-radius-branding")
    border_radius_buttons: Optional[StrictStr] = Field(default=None, alias="border-radius-buttons")
    border_radius_cards: Optional[StrictStr] = Field(default=None, alias="border-radius-cards")
    border_radius_forms: Optional[StrictStr] = Field(default=None, alias="border-radius-forms")
    border_radius_general: Optional[StrictStr] = Field(default=None, alias="border-radius-general")
    button_primary_bg_default: Optional[StrictStr] = Field(default=None, alias="button-primary-bg-default")
    button_primary_bg_disabled: Optional[StrictStr] = Field(default=None, alias="button-primary-bg-disabled")
    button_primary_bg_hover: Optional[StrictStr] = Field(default=None, alias="button-primary-bg-hover")
    button_primary_border_default: Optional[StrictStr] = Field(default=None, alias="button-primary-border-default")
    button_primary_border_disabled: Optional[StrictStr] = Field(default=None, alias="button-primary-border-disabled")
    button_primary_border_hover: Optional[StrictStr] = Field(default=None, alias="button-primary-border-hover")
    button_primary_fg_default: Optional[StrictStr] = Field(default=None, alias="button-primary-fg-default")
    button_primary_fg_disabled: Optional[StrictStr] = Field(default=None, alias="button-primary-fg-disabled")
    button_primary_fg_hover: Optional[StrictStr] = Field(default=None, alias="button-primary-fg-hover")
    button_secondary_bg_default: Optional[StrictStr] = Field(default=None, alias="button-secondary-bg-default")
    button_secondary_bg_disabled: Optional[StrictStr] = Field(default=None, alias="button-secondary-bg-disabled")
    button_secondary_bg_hover: Optional[StrictStr] = Field(default=None, alias="button-secondary-bg-hover")
    button_secondary_border_default: Optional[StrictStr] = Field(default=None, alias="button-secondary-border-default")
    button_secondary_border_disabled: Optional[StrictStr] = Field(default=None, alias="button-secondary-border-disabled")
    button_secondary_border_hover: Optional[StrictStr] = Field(default=None, alias="button-secondary-border-hover")
    button_secondary_fg_default: Optional[StrictStr] = Field(default=None, alias="button-secondary-fg-default")
    button_secondary_fg_disabled: Optional[StrictStr] = Field(default=None, alias="button-secondary-fg-disabled")
    button_secondary_fg_hover: Optional[StrictStr] = Field(default=None, alias="button-secondary-fg-hover")
    button_social_bg_default: Optional[StrictStr] = Field(default=None, alias="button-social-bg-default")
    button_social_bg_disabled: Optional[StrictStr] = Field(default=None, alias="button-social-bg-disabled")
    button_social_bg_hover: Optional[StrictStr] = Field(default=None, alias="button-social-bg-hover")
    button_social_bg_provider: Optional[StrictStr] = Field(default=None, alias="button-social-bg-provider")
    button_social_border_default: Optional[StrictStr] = Field(default=None, alias="button-social-border-default")
    button_social_border_disabled: Optional[StrictStr] = Field(default=None, alias="button-social-border-disabled")
    button_social_border_hover: Optional[StrictStr] = Field(default=None, alias="button-social-border-hover")
    button_social_border_provider: Optional[StrictStr] = Field(default=None, alias="button-social-border-provider")
    button_social_fg_default: Optional[StrictStr] = Field(default=None, alias="button-social-fg-default")
    button_social_fg_disabled: Optional[StrictStr] = Field(default=None, alias="button-social-fg-disabled")
    button_social_fg_hover: Optional[StrictStr] = Field(default=None, alias="button-social-fg-hover")
    button_social_fg_provider: Optional[StrictStr] = Field(default=None, alias="button-social-fg-provider")
    created_at: Optional[datetime] = None
    dialog_bg_default: Optional[StrictStr] = Field(default=None, alias="dialog-bg-default")
    dialog_bg_subtle: Optional[StrictStr] = Field(default=None, alias="dialog-bg-subtle")
    dialog_border_default: Optional[StrictStr] = Field(default=None, alias="dialog-border-default")
    dialog_fg_default: Optional[StrictStr] = Field(default=None, alias="dialog-fg-default")
    dialog_fg_mute: Optional[StrictStr] = Field(default=None, alias="dialog-fg-mute")
    dialog_fg_subtle: Optional[StrictStr] = Field(default=None, alias="dialog-fg-subtle")
    forms_bg_default: Optional[StrictStr] = Field(default=None, alias="forms-bg-default")
    forms_bg_disabled: Optional[StrictStr] = Field(default=None, alias="forms-bg-disabled")
    forms_bg_hover: Optional[StrictStr] = Field(default=None, alias="forms-bg-hover")
    forms_border_default: Optional[StrictStr] = Field(default=None, alias="forms-border-default")
    forms_border_disabled: Optional[StrictStr] = Field(default=None, alias="forms-border-disabled")
    forms_border_error: Optional[StrictStr] = Field(default=None, alias="forms-border-error")
    forms_border_focus: Optional[StrictStr] = Field(default=None, alias="forms-border-focus")
    forms_border_hover: Optional[StrictStr] = Field(default=None, alias="forms-border-hover")
    forms_border_success: Optional[StrictStr] = Field(default=None, alias="forms-border-success")
    forms_border_warn: Optional[StrictStr] = Field(default=None, alias="forms-border-warn")
    forms_checkbox_bg_checked: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-bg-checked")
    forms_checkbox_bg_default: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-bg-default")
    forms_checkbox_border_checked: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-border-checked")
    forms_checkbox_border_default: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-border-default")
    forms_checkbox_fg_checked: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-fg-checked")
    forms_checkbox_fg_default: Optional[StrictStr] = Field(default=None, alias="forms-checkbox-fg-default")
    forms_fg_default: Optional[StrictStr] = Field(default=None, alias="forms-fg-default")
    forms_fg_error: Optional[StrictStr] = Field(default=None, alias="forms-fg-error")
    forms_fg_mute: Optional[StrictStr] = Field(default=None, alias="forms-fg-mute")
    forms_fg_subtle: Optional[StrictStr] = Field(default=None, alias="forms-fg-subtle")
    forms_fg_success: Optional[StrictStr] = Field(default=None, alias="forms-fg-success")
    forms_fg_warn: Optional[StrictStr] = Field(default=None, alias="forms-fg-warn")
    forms_radio_bg_checked: Optional[StrictStr] = Field(default=None, alias="forms-radio-bg-checked")
    forms_radio_bg_default: Optional[StrictStr] = Field(default=None, alias="forms-radio-bg-default")
    forms_radio_border_checked: Optional[StrictStr] = Field(default=None, alias="forms-radio-border-checked")
    forms_radio_border_default: Optional[StrictStr] = Field(default=None, alias="forms-radio-border-default")
    forms_radio_fg_checked: Optional[StrictStr] = Field(default=None, alias="forms-radio-fg-checked")
    forms_radio_fg_default: Optional[StrictStr] = Field(default=None, alias="forms-radio-fg-default")
    forms_toggle_bg_checked: Optional[StrictStr] = Field(default=None, alias="forms-toggle-bg-checked")
    forms_toggle_bg_default: Optional[StrictStr] = Field(default=None, alias="forms-toggle-bg-default")
    forms_toggle_border_checked: Optional[StrictStr] = Field(default=None, alias="forms-toggle-border-checked")
    forms_toggle_border_default: Optional[StrictStr] = Field(default=None, alias="forms-toggle-border-default")
    forms_toggle_fg_checked: Optional[StrictStr] = Field(default=None, alias="forms-toggle-fg-checked")
    forms_toggle_fg_default: Optional[StrictStr] = Field(default=None, alias="forms-toggle-fg-default")
    id: Optional[StrictStr] = None
    links_link_default: Optional[StrictStr] = Field(default=None, alias="links-link-default")
    links_link_disabled: Optional[StrictStr] = Field(default=None, alias="links-link-disabled")
    links_link_hover: Optional[StrictStr] = Field(default=None, alias="links-link-hover")
    links_link_inverted_default: Optional[StrictStr] = Field(default=None, alias="links-link-inverted-default")
    links_link_inverted_hover: Optional[StrictStr] = Field(default=None, alias="links-link-inverted-hover")
    links_link_mute_default: Optional[StrictStr] = Field(default=None, alias="links-link-mute-default")
    links_link_mute_hover: Optional[StrictStr] = Field(default=None, alias="links-link-mute-hover")
    syntax_syntax: Optional[StrictStr] = Field(default=None, alias="syntax-syntax")
    syntax_syntax_key: Optional[StrictStr] = Field(default=None, alias="syntax-syntax-key")
    syntax_syntax_num: Optional[StrictStr] = Field(default=None, alias="syntax-syntax-num")
    syntax_syntax_value: Optional[StrictStr] = Field(default=None, alias="syntax-syntax-value")
    updated_at: Optional[datetime] = None
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["accent", "bg-default", "border-radius-branding", "border-radius-buttons", "border-radius-cards", "border-radius-forms", "border-radius-general", "button-primary-bg-default", "button-primary-bg-disabled", "button-primary-bg-hover", "button-primary-border-default", "button-primary-border-disabled", "button-primary-border-hover", "button-primary-fg-default", "button-primary-fg-disabled", "button-primary-fg-hover", "button-secondary-bg-default", "button-secondary-bg-disabled", "button-secondary-bg-hover", "button-secondary-border-default", "button-secondary-border-disabled", "button-secondary-border-hover", "button-secondary-fg-default", "button-secondary-fg-disabled", "button-secondary-fg-hover", "button-social-bg-default", "button-social-bg-disabled", "button-social-bg-hover", "button-social-bg-provider", "button-social-border-default", "button-social-border-disabled", "button-social-border-hover", "button-social-border-provider", "button-social-fg-default", "button-social-fg-disabled", "button-social-fg-hover", "button-social-fg-provider", "created_at", "dialog-bg-default", "dialog-bg-subtle", "dialog-border-default", "dialog-fg-default", "dialog-fg-mute", "dialog-fg-subtle", "forms-bg-default", "forms-bg-disabled", "forms-bg-hover", "forms-border-default", "forms-border-disabled", "forms-border-error", "forms-border-focus", "forms-border-hover", "forms-border-success", "forms-border-warn", "forms-checkbox-bg-checked", "forms-checkbox-bg-default", "forms-checkbox-border-checked", "forms-checkbox-border-default", "forms-checkbox-fg-checked", "forms-checkbox-fg-default", "forms-fg-default", "forms-fg-error", "forms-fg-mute", "forms-fg-subtle", "forms-fg-success", "forms-fg-warn", "forms-radio-bg-checked", "forms-radio-bg-default", "forms-radio-border-checked", "forms-radio-border-default", "forms-radio-fg-checked", "forms-radio-fg-default", "forms-toggle-bg-checked", "forms-toggle-bg-default", "forms-toggle-border-checked", "forms-toggle-border-default", "forms-toggle-fg-checked", "forms-toggle-fg-default", "id", "links-link-default", "links-link-disabled", "links-link-hover", "links-link-inverted-default", "links-link-inverted-hover", "links-link-mute-default", "links-link-mute-hover", "syntax-syntax", "syntax-syntax-key", "syntax-syntax-num", "syntax-syntax-value", "updated_at"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of AccountExperienceThemeVariables from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        excluded_fields: Set[str] = set([
            "additional_properties",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AccountExperienceThemeVariables from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "accent": obj.get("accent"),
            "bg-default": obj.get("bg-default"),
            "border-radius-branding": obj.get("border-radius-branding"),
            "border-radius-buttons": obj.get("border-radius-buttons"),
            "border-radius-cards": obj.get("border-radius-cards"),
            "border-radius-forms": obj.get("border-radius-forms"),
            "border-radius-general": obj.get("border-radius-general"),
            "button-primary-bg-default": obj.get("button-primary-bg-default"),
            "button-primary-bg-disabled": obj.get("button-primary-bg-disabled"),
            "button-primary-bg-hover": obj.get("button-primary-bg-hover"),
            "button-primary-border-default": obj.get("button-primary-border-default"),
            "button-primary-border-disabled": obj.get("button-primary-border-disabled"),
            "button-primary-border-hover": obj.get("button-primary-border-hover"),
            "button-primary-fg-default": obj.get("button-primary-fg-default"),
            "button-primary-fg-disabled": obj.get("button-primary-fg-disabled"),
            "button-primary-fg-hover": obj.get("button-primary-fg-hover"),
            "button-secondary-bg-default": obj.get("button-secondary-bg-default"),
            "button-secondary-bg-disabled": obj.get("button-secondary-bg-disabled"),
            "button-secondary-bg-hover": obj.get("button-secondary-bg-hover"),
            "button-secondary-border-default": obj.get("button-secondary-border-default"),
            "button-secondary-border-disabled": obj.get("button-secondary-border-disabled"),
            "button-secondary-border-hover": obj.get("button-secondary-border-hover"),
            "button-secondary-fg-default": obj.get("button-secondary-fg-default"),
            "button-secondary-fg-disabled": obj.get("button-secondary-fg-disabled"),
            "button-secondary-fg-hover": obj.get("button-secondary-fg-hover"),
            "button-social-bg-default": obj.get("button-social-bg-default"),
            "button-social-bg-disabled": obj.get("button-social-bg-disabled"),
            "button-social-bg-hover": obj.get("button-social-bg-hover"),
            "button-social-bg-provider": obj.get("button-social-bg-provider"),
            "button-social-border-default": obj.get("button-social-border-default"),
            "button-social-border-disabled": obj.get("button-social-border-disabled"),
            "button-social-border-hover": obj.get("button-social-border-hover"),
            "button-social-border-provider": obj.get("button-social-border-provider"),
            "button-social-fg-default": obj.get("button-social-fg-default"),
            "button-social-fg-disabled": obj.get("button-social-fg-disabled"),
            "button-social-fg-hover": obj.get("button-social-fg-hover"),
            "button-social-fg-provider": obj.get("button-social-fg-provider"),
            "created_at": obj.get("created_at"),
            "dialog-bg-default": obj.get("dialog-bg-default"),
            "dialog-bg-subtle": obj.get("dialog-bg-subtle"),
            "dialog-border-default": obj.get("dialog-border-default"),
            "dialog-fg-default": obj.get("dialog-fg-default"),
            "dialog-fg-mute": obj.get("dialog-fg-mute"),
            "dialog-fg-subtle": obj.get("dialog-fg-subtle"),
            "forms-bg-default": obj.get("forms-bg-default"),
            "forms-bg-disabled": obj.get("forms-bg-disabled"),
            "forms-bg-hover": obj.get("forms-bg-hover"),
            "forms-border-default": obj.get("forms-border-default"),
            "forms-border-disabled": obj.get("forms-border-disabled"),
            "forms-border-error": obj.get("forms-border-error"),
            "forms-border-focus": obj.get("forms-border-focus"),
            "forms-border-hover": obj.get("forms-border-hover"),
            "forms-border-success": obj.get("forms-border-success"),
            "forms-border-warn": obj.get("forms-border-warn"),
            "forms-checkbox-bg-checked": obj.get("forms-checkbox-bg-checked"),
            "forms-checkbox-bg-default": obj.get("forms-checkbox-bg-default"),
            "forms-checkbox-border-checked": obj.get("forms-checkbox-border-checked"),
            "forms-checkbox-border-default": obj.get("forms-checkbox-border-default"),
            "forms-checkbox-fg-checked": obj.get("forms-checkbox-fg-checked"),
            "forms-checkbox-fg-default": obj.get("forms-checkbox-fg-default"),
            "forms-fg-default": obj.get("forms-fg-default"),
            "forms-fg-error": obj.get("forms-fg-error"),
            "forms-fg-mute": obj.get("forms-fg-mute"),
            "forms-fg-subtle": obj.get("forms-fg-subtle"),
            "forms-fg-success": obj.get("forms-fg-success"),
            "forms-fg-warn": obj.get("forms-fg-warn"),
            "forms-radio-bg-checked": obj.get("forms-radio-bg-checked"),
            "forms-radio-bg-default": obj.get("forms-radio-bg-default"),
            "forms-radio-border-checked": obj.get("forms-radio-border-checked"),
            "forms-radio-border-default": obj.get("forms-radio-border-default"),
            "forms-radio-fg-checked": obj.get("forms-radio-fg-checked"),
            "forms-radio-fg-default": obj.get("forms-radio-fg-default"),
            "forms-toggle-bg-checked": obj.get("forms-toggle-bg-checked"),
            "forms-toggle-bg-default": obj.get("forms-toggle-bg-default"),
            "forms-toggle-border-checked": obj.get("forms-toggle-border-checked"),
            "forms-toggle-border-default": obj.get("forms-toggle-border-default"),
            "forms-toggle-fg-checked": obj.get("forms-toggle-fg-checked"),
            "forms-toggle-fg-default": obj.get("forms-toggle-fg-default"),
            "id": obj.get("id"),
            "links-link-default": obj.get("links-link-default"),
            "links-link-disabled": obj.get("links-link-disabled"),
            "links-link-hover": obj.get("links-link-hover"),
            "links-link-inverted-default": obj.get("links-link-inverted-default"),
            "links-link-inverted-hover": obj.get("links-link-inverted-hover"),
            "links-link-mute-default": obj.get("links-link-mute-default"),
            "links-link-mute-hover": obj.get("links-link-mute-hover"),
            "syntax-syntax": obj.get("syntax-syntax"),
            "syntax-syntax-key": obj.get("syntax-syntax-key"),
            "syntax-syntax-num": obj.get("syntax-syntax-num"),
            "syntax-syntax-value": obj.get("syntax-syntax-value"),
            "updated_at": obj.get("updated_at")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


