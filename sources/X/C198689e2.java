package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9e2  reason: invalid class name and case insensitive filesystem */
public final class C198689e2 {
    public C135086c7 A00;
    public String A01;

    public C198689e2(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A00 = C165617ti.A0P(C146356vT.A00(), String.class, A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), "upiSequenceNumber");
                this.A01 = A1C.optString("status");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ id: ");
        A0u.append(this.A00);
        A0u.append(" status: ");
        return C165567td.A0Y(C200449hQ.A00(this.A01), A0u);
    }

    public C198689e2(C203399nx r6) {
        this.A00 = C165617ti.A0P(C146356vT.A00(), String.class, r6.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null), "upiSequenceNumber");
        this.A01 = r6.A0i("status", (String) null);
    }
}
