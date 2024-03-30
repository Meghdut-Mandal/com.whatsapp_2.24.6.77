package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.9fB  reason: invalid class name and case insensitive filesystem */
public class C199359fB {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199359fB)) {
            return false;
        }
        C199359fB r7 = (C199359fB) obj;
        return r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public C199359fB(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, this.A01);
        AnonymousClass000.A1K(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public C199359fB(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        this.A00 = A1C.getInt("update_count");
        this.A01 = A1C.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }
}
