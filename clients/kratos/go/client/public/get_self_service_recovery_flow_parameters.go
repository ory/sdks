// Code generated by go-swagger; DO NOT EDIT.

package public

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"
	"net/http"
	"time"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/runtime"
	cr "github.com/go-openapi/runtime/client"
	"github.com/go-openapi/strfmt"
)

// NewGetSelfServiceRecoveryFlowParams creates a new GetSelfServiceRecoveryFlowParams object
// with the default values initialized.
func NewGetSelfServiceRecoveryFlowParams() *GetSelfServiceRecoveryFlowParams {
	var ()
	return &GetSelfServiceRecoveryFlowParams{

		timeout: cr.DefaultTimeout,
	}
}

// NewGetSelfServiceRecoveryFlowParamsWithTimeout creates a new GetSelfServiceRecoveryFlowParams object
// with the default values initialized, and the ability to set a timeout on a request
func NewGetSelfServiceRecoveryFlowParamsWithTimeout(timeout time.Duration) *GetSelfServiceRecoveryFlowParams {
	var ()
	return &GetSelfServiceRecoveryFlowParams{

		timeout: timeout,
	}
}

// NewGetSelfServiceRecoveryFlowParamsWithContext creates a new GetSelfServiceRecoveryFlowParams object
// with the default values initialized, and the ability to set a context for a request
func NewGetSelfServiceRecoveryFlowParamsWithContext(ctx context.Context) *GetSelfServiceRecoveryFlowParams {
	var ()
	return &GetSelfServiceRecoveryFlowParams{

		Context: ctx,
	}
}

// NewGetSelfServiceRecoveryFlowParamsWithHTTPClient creates a new GetSelfServiceRecoveryFlowParams object
// with the default values initialized, and the ability to set a custom HTTPClient for a request
func NewGetSelfServiceRecoveryFlowParamsWithHTTPClient(client *http.Client) *GetSelfServiceRecoveryFlowParams {
	var ()
	return &GetSelfServiceRecoveryFlowParams{
		HTTPClient: client,
	}
}

/*GetSelfServiceRecoveryFlowParams contains all the parameters to send to the API endpoint
for the get self service recovery flow operation typically these are written to a http.Request
*/
type GetSelfServiceRecoveryFlowParams struct {

	/*ID
	  The Flow ID

	The value for this parameter comes from `request` URL Query parameter sent to your
	application (e.g. `/recovery?flow=abcde`).

	*/
	ID string

	timeout    time.Duration
	Context    context.Context
	HTTPClient *http.Client
}

// WithTimeout adds the timeout to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) WithTimeout(timeout time.Duration) *GetSelfServiceRecoveryFlowParams {
	o.SetTimeout(timeout)
	return o
}

// SetTimeout adds the timeout to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) SetTimeout(timeout time.Duration) {
	o.timeout = timeout
}

// WithContext adds the context to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) WithContext(ctx context.Context) *GetSelfServiceRecoveryFlowParams {
	o.SetContext(ctx)
	return o
}

// SetContext adds the context to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) SetContext(ctx context.Context) {
	o.Context = ctx
}

// WithHTTPClient adds the HTTPClient to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) WithHTTPClient(client *http.Client) *GetSelfServiceRecoveryFlowParams {
	o.SetHTTPClient(client)
	return o
}

// SetHTTPClient adds the HTTPClient to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) SetHTTPClient(client *http.Client) {
	o.HTTPClient = client
}

// WithID adds the id to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) WithID(id string) *GetSelfServiceRecoveryFlowParams {
	o.SetID(id)
	return o
}

// SetID adds the id to the get self service recovery flow params
func (o *GetSelfServiceRecoveryFlowParams) SetID(id string) {
	o.ID = id
}

// WriteToRequest writes these params to a swagger request
func (o *GetSelfServiceRecoveryFlowParams) WriteToRequest(r runtime.ClientRequest, reg strfmt.Registry) error {

	if err := r.SetTimeout(o.timeout); err != nil {
		return err
	}
	var res []error

	// query param id
	qrID := o.ID
	qID := qrID
	if qID != "" {
		if err := r.SetQueryParam("id", qID); err != nil {
			return err
		}
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}
