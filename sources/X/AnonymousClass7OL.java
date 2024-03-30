package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7OL  reason: invalid class name */
public final class AnonymousClass7OL extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $accessTokenWrapped;
    public final /* synthetic */ AnonymousClass6JV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OL(C134876bk r2, AnonymousClass6JV r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        JSONObject optJSONObject;
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            String str = (String) A00;
            C123305wH A01 = this.this$0.A00.A01(str, C36381kD.A13(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "picture.type(large)"));
            AnonymousClass6JV.A00(A01);
            String str2 = null;
            try {
                JSONObject jSONObject = A01.A04;
                if (jSONObject != null) {
                    String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("picture");
                    if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("data")) == null)) {
                        str2 = optJSONObject.optString("url");
                    }
                    if (string != null) {
                        AnonymousClass00C.A0D(str, 0);
                        Class<String> cls = String.class;
                        return new C134716bU(new C134876bk(new C135086c7(C146356vT.A00(), cls, str, "XFamilyFbAccessToken"), 2), new C134876bk(new C135086c7(C146356vT.A00(), cls, string, "XFamilyFbFullName"), 2), new C134876bk(new C135086c7(C146356vT.A00(), cls, str2, "XFamilyProfilePicUrl"), 2));
                    }
                }
                throw AnonymousClass001.A09("Required value was null.");
            } catch (JSONException e) {
                throw new AnonymousClass5QU(e);
            }
        } else {
            throw AnonymousClass001.A09("Required value was null.");
        }
    }
}
