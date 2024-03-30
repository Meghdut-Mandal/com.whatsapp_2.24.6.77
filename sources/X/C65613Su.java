package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
public class C65613Su {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public C65613Su(int i) {
        this(i, 0, 1, 0, 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65613Su)) {
            return false;
        }
        C65613Su r7 = (C65613Su) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1J(objArr, this.A01);
        AnonymousClass000.A1K(objArr, this.A00);
        C36361kB.A1W(objArr, this.A04);
        C36341k9.A1T(objArr, this.A03);
        C36341k9.A1U(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public static C65613Su A00(JSONObject jSONObject) {
        int i;
        try {
            i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        } catch (JSONException unused) {
            i = 0;
        }
        try {
            return new C65613Su(jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getInt("stage"), jSONObject.getInt("version"), jSONObject.getLong("t"), i);
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/fromJSON exception: ", e);
            return null;
        }
    }

    public static JSONObject A01(C65613Su r4) {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.A01);
            A1B.put("stage", r4.A00);
            A1B.put("t", r4.A04);
            A1B.put("version", r4.A03);
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A02);
            return A1B;
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/toJSON exception: ", e);
            return null;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeMetadata{noticeId=");
        A0u.append(this.A01);
        A0u.append(", stage=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        A0u.append(", version=");
        A0u.append(this.A03);
        A0u.append(", type=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }

    public C65613Su(int i, int i2, int i3, long j, int i4) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = j;
        this.A03 = i3;
        if (i4 < 0 || i4 > 2) {
            this.A02 = -1;
        } else {
            this.A02 = i4;
        }
    }
}
