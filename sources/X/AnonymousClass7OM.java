package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7OM  reason: invalid class name */
public final class AnonymousClass7OM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $accessTokenWrapped;
    public final /* synthetic */ AnonymousClass6JV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OM(C134876bk r2, AnonymousClass6JV r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_WEB_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            C123305wH A01 = this.this$0.A00.A01((String) A00, C36371kC.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            AnonymousClass6JV.A00(A01);
            String str = null;
            try {
                JSONObject jSONObject = A01.A04;
                if (jSONObject != null) {
                    str = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }
                C146356vT A002 = C146356vT.A00();
                Class<String> cls = String.class;
                if (str != null) {
                    return new C134876bk(new C135086c7(A002, cls, str, "XFamilyFbFullName"), 2);
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
