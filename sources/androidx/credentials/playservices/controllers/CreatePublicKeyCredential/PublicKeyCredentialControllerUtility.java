package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass099;
import X.AnonymousClass0KK;
import X.AnonymousClass0KL;
import X.AnonymousClass0KM;
import X.AnonymousClass0KO;
import X.AnonymousClass0KP;
import X.AnonymousClass0KQ;
import X.AnonymousClass0KR;
import X.AnonymousClass0KS;
import X.AnonymousClass0KT;
import X.AnonymousClass0KU;
import X.AnonymousClass0KV;
import X.AnonymousClass0KX;
import X.AnonymousClass0LS;
import X.AnonymousClass0LT;
import X.AnonymousClass0LV;
import X.AnonymousClass0T0;
import X.AnonymousClass0TW;
import X.AnonymousClass9BZ;
import X.C000300d;
import X.C000400e;
import X.C04280Ka;
import X.C04290Kb;
import X.C04310Kd;
import X.C04330Kf;
import X.C04350Kh;
import X.C04410Kn;
import X.C04420Ko;
import X.C04440Kq;
import X.C04450Kr;
import X.C05090Nj;
import X.C05100Nl;
import X.C05110Nm;
import X.C05130No;
import X.C05180Nx;
import X.C05250Oz;
import X.C06280Sz;
import X.C08830bO;
import X.C165567td;
import X.C165607th;
import X.C166897wz;
import X.C166977x7;
import X.C167027xC;
import X.C167107xK;
import X.C167137xN;
import X.C167167xQ;
import X.C167177xR;
import X.C167197xT;
import X.C167207xU;
import X.C167267xa;
import X.C167287xc;
import X.C167307xe;
import X.C167327xg;
import X.C167337xh;
import X.C167387xm;
import X.C167407xo;
import X.C167427xq;
import X.C167457xt;
import X.C167467xu;
import X.C1889591l;
import X.C1889691m;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Companion();
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final LinkedHashMap orderedErrorCodeToExceptions;

    public final class Companion {
        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            AnonymousClass00C.A0D(bArr, 0);
            C36321k7.A11(bArr2, strArr, jSONObject);
            JSONObject A1B = C36441kJ.A1B();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
            String encodeToString = Base64.encodeToString(bArr, 11);
            AnonymousClass00C.A08(encodeToString);
            A1B.put(str, encodeToString);
            String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
            String encodeToString2 = Base64.encodeToString(bArr2, 11);
            AnonymousClass00C.A08(encodeToString2);
            A1B.put(str2, encodeToString2);
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(strArr));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A1B);
        }

        public final byte[] b64Decode(String str) {
            AnonymousClass00C.A0D(str, 0);
            byte[] decode = Base64.decode(str, 11);
            AnonymousClass00C.A08(decode);
            return decode;
        }

        public final String b64Encode(byte[] bArr) {
            AnonymousClass00C.A0D(bArr, 0);
            String encodeToString = Base64.encodeToString(bArr, 11);
            AnonymousClass00C.A08(encodeToString);
            return encodeToString;
        }

        public final C1889691m beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(C05090Nj r5, String str) {
            AnonymousClass00C.A0D(r5, 0);
            AnonymousClass9BZ r2 = (AnonymousClass9BZ) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(r5);
            if (r2 == null) {
                return new C167467xu(new C167427xq(), AnonymousClass000.A0p("unknown fido gms exception - ", str, AnonymousClass000.A0u()));
            }
            if (r5 == C05090Nj.CONSTRAINT_ERR && str != null && AnonymousClass099.A0O(str, "Unable to get sync account", false)) {
                return new C167107xK("Passkey retrieval was cancelled by the user.");
            }
            return new C167467xu(r2, str);
        }

        public final AnonymousClass0LV convert(C166897wz r2) {
            AnonymousClass00C.A0D(r2, 0);
            return convertJSON$credentials_play_services_auth_release(C36441kJ.A1C(r2.A00));
        }

        public final AnonymousClass0LV convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            AnonymousClass00C.A0D(jSONObject, 0);
            AnonymousClass0TW r1 = new AnonymousClass0TW();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, r1);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, r1);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, r1);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, r1);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, r1);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, r1);
            C04310Kd r3 = r1.A03;
            C04350Kh r4 = r1.A04;
            byte[] bArr = r1.A08;
            List list = r1.A06;
            Double d = r1.A05;
            List list2 = r1.A07;
            return new AnonymousClass0LV(r1.A01, r1.A02, r3, r4, (C04280Ka) null, d, (Integer) null, C36331k8.A0h(r1.A00), list, list2, bArr);
        }

        public final AnonymousClass0KV convertToPlayAuthPasskeyJsonRequest(C166977x7 r4) {
            AnonymousClass00C.A0D(r4, 0);
            return new AnonymousClass0KV(true, r4.A00);
        }

        public final C04290Kb convertToPlayAuthPasskeyRequest(C166977x7 r5) {
            AnonymousClass00C.A0D(r5, 0);
            JSONObject A1C = C36441kJ.A1C(r5.A00);
            String optString = A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            if (C165607th.A08(optString) != 0) {
                return new C04290Kb(getChallenge(A1C), optString, true);
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r9) {
            String obj;
            String obj2;
            C36331k8.A1I(jSONObject, r9);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                AnonymousClass0T0 r5 = new AnonymousClass0T0();
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, false);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                C05130No r1 = null;
                if (C165607th.A08(optString) > 0) {
                    r1 = C05130No.A00(optString);
                }
                r5.A02 = Boolean.valueOf(optBoolean);
                r5.A01 = r1;
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                if (C165607th.A08(optString2) > 0) {
                    r5.A00 = C05100Nl.A00(optString2);
                }
                C05100Nl r0 = r5.A00;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.toString();
                }
                Boolean bool = r5.A02;
                C05130No r02 = r5.A01;
                if (r02 == null) {
                    obj2 = null;
                } else {
                    obj2 = r02.toString();
                }
                r9.A02 = new C04440Kq(bool, obj, (String) null, obj2);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r13) {
            boolean A1a = C36341k9.A1a(jSONObject, r13);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                C06280Sz r2 = new C06280Sz();
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                if (C165607th.A08(optString) > 0) {
                    r2.A00 = new AnonymousClass0KK(optString);
                }
                if (jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    r2.A01 = new AnonymousClass0KL(A1a);
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    r2.A02 = new AnonymousClass0KM(A1a);
                }
                r13.A01 = new C04420Ko(r2.A00, r2.A01, r2.A02, (AnonymousClass0KO) null, (AnonymousClass0KP) null, (AnonymousClass0KQ) null, (AnonymousClass0KR) null, (AnonymousClass0KS) null, (AnonymousClass0KT) null, (AnonymousClass0KU) null);
            }
        }

        public final C1889591l publicKeyCredentialResponseContainsError(C04450Kr r6) {
            AnonymousClass00C.A0D(r6, 0);
            Object obj = r6.A02;
            if (obj == null && (obj = r6.A01) == null && (obj = r6.A03) == null) {
                throw AnonymousClass001.A09("No response set.");
            } else if (!(obj instanceof AnonymousClass0LS)) {
                return null;
            } else {
                AnonymousClass0LS r3 = (AnonymousClass0LS) obj;
                C05090Nj r1 = r3.A00;
                AnonymousClass00C.A08(r1);
                AnonymousClass9BZ r2 = (AnonymousClass9BZ) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(r1);
                String str = r3.A01;
                if (r2 == null) {
                    return C167457xt.A00(new C167427xq(), AnonymousClass000.A0p("unknown fido gms exception - ", str, AnonymousClass000.A0u()));
                }
                if (r1 == C05090Nj.CONSTRAINT_ERR && str != null && AnonymousClass099.A0O(str, "Unable to get sync account", false)) {
                    return new C167027xC("Passkey registration was cancelled by the user.");
                }
                return C167457xt.A00(r2, str);
            }
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            if (C165607th.A08(optString) == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            byte[] decode = Base64.decode(optString, 11);
            AnonymousClass00C.A08(decode);
            return decode;
        }

        public final boolean checkAlgSupported(int i) {
            try {
                C08830bO.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r6) {
            C36321k7.A0w(jSONObject, r6);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            if (jSONObject.has(str)) {
                r6.A05 = Double.valueOf(((double) jSONObject.getLong(str)) / ((double) 1000));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r13) {
            C36321k7.A0w(jSONObject, r13);
            ArrayList A0I = AnonymousClass001.A0I();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    byte[] decode = Base64.decode(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2), 11);
                    AnonymousClass00C.A08(decode);
                    String A0e = C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2);
                    if (A0e.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    } else if (decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    } else {
                        ArrayList arrayList = null;
                        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                        if (jSONObject2.has(str2)) {
                            arrayList = AnonymousClass001.A0I();
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                            int length2 = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length2) {
                                try {
                                    arrayList.add(Transport.A00(jSONArray2.getString(i2)));
                                    i2++;
                                } catch (C05180Nx e) {
                                    throw C167457xt.A00(new C167207xU(), e.getMessage());
                                }
                            }
                        }
                        A0I.add(new C04330Kf(A0e, arrayList, decode));
                        i++;
                    }
                }
            }
            r13.A07 = A0I;
            String str3 = "none";
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, str3);
            if (C165607th.A08(optString) != 0) {
                str3 = optString;
            }
            r13.A00 = C05110Nm.A00(str3);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r8) {
            C36321k7.A0w(jSONObject, r8);
            byte[] challenge = getChallenge(jSONObject);
            AnonymousClass006.A01(challenge);
            r8.A08 = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            byte[] decode = Base64.decode(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2), 11);
            AnonymousClass00C.A08(decode);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            if (C165607th.A08(string2) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            } else if (decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            } else if (C165607th.A08(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            } else {
                C04350Kh r0 = new C04350Kh(string, optString, string2, decode);
                AnonymousClass006.A01(r0);
                r8.A04 = r0;
            }
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, AnonymousClass0TW r11) {
            C36321k7.A0w(jSONObject, r11);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            AnonymousClass00C.A0B(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (C165607th.A08(optString) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            } else if (C165607th.A08(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            } else {
                C04310Kd r0 = new C04310Kd(string, optString, optString2);
                AnonymousClass006.A01(r0);
                r11.A03 = r0;
                JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
                ArrayList A0I = AnonymousClass001.A0I();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    int i2 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                    String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                    if (C165607th.A08(optString3) == 0) {
                        throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                    }
                    try {
                        C08830bO.A00(i2);
                        A0I.add(new AnonymousClass0KX(optString3, i2));
                    } catch (Throwable unused) {
                    }
                }
                AnonymousClass006.A01(A0I);
                r11.A06 = A0I;
            }
        }

        public final String toAssertPasskeyResponse(C04410Kn r5) {
            Object obj;
            JSONObject A0q = C90464aC.A0q(r5);
            C04450Kr r1 = r5.A01;
            if (r1 != null) {
                obj = r1.A02;
                if (obj == null && (obj = r1.A01) == null && (obj = r1.A03) == null) {
                    throw AnonymousClass001.A09("No response set.");
                }
            } else {
                obj = null;
            }
            AnonymousClass00C.A0B(obj);
            if (obj instanceof AnonymousClass0LS) {
                AnonymousClass0LS r2 = (AnonymousClass0LS) obj;
                C05090Nj r12 = r2.A00;
                AnonymousClass00C.A08(r12);
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(r12, r2.A01);
            } else if (obj instanceof AnonymousClass0LT) {
                try {
                    String A02 = r1.A02();
                    AnonymousClass00C.A08(A02);
                    return A02;
                } catch (Throwable th) {
                    throw new C167137xN(C36331k8.A0i("The PublicKeyCredential response json had an unexpected exception when parsing: ", AnonymousClass000.A0u(), th));
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1N(obj, "AuthenticatorResponse expected assertion response but got: ", A0u);
                Log.e(PublicKeyCredentialControllerUtility.TAG, A0u.toString());
                return C36381kD.A0y(A0q);
            }
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }

    public static final AnonymousClass0LV convert(C166897wz r1) {
        return Companion.convert(r1);
    }

    static {
        AnonymousClass011[] r2 = new AnonymousClass011[12];
        C90464aC.A1E(C05090Nj.UNKNOWN_ERR, new C167427xq(), r2);
        C90464aC.A1F(C05090Nj.ABORT_ERR, new C167167xQ(), r2);
        C90474aD.A1F(C05090Nj.ATTESTATION_NOT_PRIVATE_ERR, new C167327xg(), r2);
        C90474aD.A1G(C05090Nj.CONSTRAINT_ERR, new C167177xR(), r2);
        C90484aE.A1H(C05090Nj.DATA_ERR, new C167197xT(), r2);
        r2[5] = C36441kJ.A19(C05090Nj.INVALID_STATE_ERR, new C167267xa());
        r2[6] = C36441kJ.A19(C05090Nj.ENCODING_ERR, new C167207xU());
        r2[7] = C36441kJ.A19(C05090Nj.NETWORK_ERR, new C167287xc());
        r2[8] = C36441kJ.A19(C05090Nj.NOT_ALLOWED_ERR, new C167307xe());
        r2[9] = C36441kJ.A19(C05090Nj.NOT_SUPPORTED_ERR, new C167337xh());
        r2[10] = C36441kJ.A19(C05090Nj.SECURITY_ERR, new C167387xm());
        r2[11] = C36441kJ.A19(C05090Nj.TIMEOUT_ERR, new C167407xo());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(12));
        C000400e.A0E(linkedHashMap, r2);
        orderedErrorCodeToExceptions = linkedHashMap;
    }
}
