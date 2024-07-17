/* tslint:disable */
/* eslint-disable */
/**
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.1
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  CourierMessageStatus,
  ErrorGeneric,
  Message,
} from '../models/index';
import {
    CourierMessageStatusFromJSON,
    CourierMessageStatusToJSON,
    ErrorGenericFromJSON,
    ErrorGenericToJSON,
    MessageFromJSON,
    MessageToJSON,
} from '../models/index';

export interface GetCourierMessageRequest {
    id: string;
}

export interface ListCourierMessagesRequest {
    pageSize?: number;
    pageToken?: string;
    status?: CourierMessageStatus;
    recipient?: string;
}

/**
 * 
 */
export class CourierApi extends runtime.BaseAPI {

    /**
     * Gets a specific messages by the given ID.
     * Get a Message
     */
    async getCourierMessageRaw(requestParameters: GetCourierMessageRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Message>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling getCourierMessage().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // oryAccessToken authentication
        }

        const response = await this.request({
            path: `/admin/courier/messages/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MessageFromJSON(jsonValue));
    }

    /**
     * Gets a specific messages by the given ID.
     * Get a Message
     */
    async getCourierMessage(requestParameters: GetCourierMessageRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Message> {
        const response = await this.getCourierMessageRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Lists all messages by given status and recipient.
     * List Messages
     */
    async listCourierMessagesRaw(requestParameters: ListCourierMessagesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<Message>>> {
        const queryParameters: any = {};

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['pageToken'] != null) {
            queryParameters['page_token'] = requestParameters['pageToken'];
        }

        if (requestParameters['status'] != null) {
            queryParameters['status'] = requestParameters['status'];
        }

        if (requestParameters['recipient'] != null) {
            queryParameters['recipient'] = requestParameters['recipient'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // oryAccessToken authentication
        }

        const response = await this.request({
            path: `/admin/courier/messages`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(MessageFromJSON));
    }

    /**
     * Lists all messages by given status and recipient.
     * List Messages
     */
    async listCourierMessages(requestParameters: ListCourierMessagesRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<Message>> {
        const response = await this.listCourierMessagesRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
