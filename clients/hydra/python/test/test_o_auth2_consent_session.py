# coding: utf-8

"""
    Ory Hydra API

    Documentation for all of Ory Hydra's APIs. 

    The version of the OpenAPI document: v2.2.1
    Contact: hi@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_hydra_client.models.o_auth2_consent_session import OAuth2ConsentSession

class TestOAuth2ConsentSession(unittest.TestCase):
    """OAuth2ConsentSession unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OAuth2ConsentSession:
        """Test OAuth2ConsentSession
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OAuth2ConsentSession`
        """
        model = OAuth2ConsentSession()
        if include_optional:
            return OAuth2ConsentSession(
                consent_request = ory_hydra_client.models.contains_information_on_an_ongoing_consent_request/.Contains information on an ongoing consent request.(
                    acr = '', 
                    amr = [
                        ''
                        ], 
                    challenge = '', 
                    client = ory_hydra_client.models.o_auth_2/0_client.OAuth 2.0 Client(
                        access_token_strategy = '', 
                        allowed_cors_origins = [
                            ''
                            ], 
                        audience = , 
                        authorization_code_grant_access_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        authorization_code_grant_id_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        authorization_code_grant_refresh_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        backchannel_logout_session_required = True, 
                        backchannel_logout_uri = '', 
                        client_credentials_grant_access_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        client_id = '', 
                        client_name = '', 
                        client_secret = '', 
                        client_secret_expires_at = 56, 
                        client_uri = '', 
                        contacts = , 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        frontchannel_logout_session_required = True, 
                        frontchannel_logout_uri = '', 
                        grant_types = , 
                        implicit_grant_access_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        implicit_grant_id_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        jwks = null, 
                        jwks_uri = '', 
                        jwt_bearer_grant_access_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        logo_uri = '', 
                        metadata = null, 
                        owner = '', 
                        policy_uri = '', 
                        post_logout_redirect_uris = , 
                        redirect_uris = , 
                        refresh_token_grant_access_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        refresh_token_grant_id_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        refresh_token_grant_refresh_token_lifespan = '80728ms0015280217980962255008507620686293393339756506851391026912917327294786014820265m1272755041757701929816286488291663322877m21919116647837856387556598683615248784425528468720999697682157936442848967131857636391us382249351630745068057172793570606620664962415415434479790599868759540626151494012626h19118476173237968022090825677715773090491175877238622700367804481067589385995284318716971h809437255518186242126631124808712420936114222us1109826538733395457796110376067381730053899858052502h9559516531751128043086958209868597220486555936412006917239720304955737734452346677471754449209840m308684917330882243035942890m0673685589682196092806879799560883895980413852591093704397513us546060652528654068834561751457882958790974352941056503031506863433940h59325594064046466694586076706109594796867002468642449871184ms977583459814832574743930384284266731620716351898465ms529386339022152609092509344996631299698075356us34890990125995414960453920343154842307899106337980741065ms35834077484739706353881us714470s2628582763368571328507679471307057663772614811507328336080145326834191317716504454477932763323597ns81241407647h0432196393721552124808999238986208055750640221ms235s', 
                        registration_access_token = '', 
                        registration_client_uri = '', 
                        request_object_signing_alg = '', 
                        request_uris = , 
                        response_types = , 
                        scope = 'scope1 scope-2 scope.3 scope:4', 
                        sector_identifier_uri = '', 
                        skip_consent = True, 
                        skip_logout_consent = True, 
                        subject_type = '', 
                        token_endpoint_auth_method = 'client_secret_basic', 
                        token_endpoint_auth_signing_alg = '', 
                        tos_uri = '', 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        userinfo_signed_response_alg = '', ), 
                    context = null, 
                    login_challenge = '', 
                    login_session_id = '', 
                    oidc_context = ory_hydra_client.models.contains_optional_information_about_the_open_id_connect_request/.Contains optional information about the OpenID Connect request.(
                        acr_values = [
                            ''
                            ], 
                        display = '', 
                        id_token_hint_claims = {
                            'key' : null
                            }, 
                        login_hint = '', 
                        ui_locales = [
                            ''
                            ], ), 
                    request_url = '', 
                    requested_access_token_audience = , 
                    requested_scope = , 
                    skip = True, 
                    subject = '', ),
                context = None,
                expires_at = ory_hydra_client.models.o_auth2_consent_session_expires_at.oAuth2ConsentSession_expires_at(
                    access_token = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    authorize_code = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    id_token = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    par_context = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    refresh_token = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                grant_access_token_audience = [
                    ''
                    ],
                grant_scope = [
                    ''
                    ],
                handled_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                remember = True,
                remember_for = 56,
                session = ory_hydra_client.models.pass_session_data_to_a_consent_request/.Pass session data to a consent request.(
                    access_token = null, 
                    id_token = null, )
            )
        else:
            return OAuth2ConsentSession(
        )
        """

    def testOAuth2ConsentSession(self):
        """Test OAuth2ConsentSession"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
