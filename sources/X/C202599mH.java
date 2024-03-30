package X;

import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9mH  reason: invalid class name and case insensitive filesystem */
public class C202599mH {
    public final int A00;
    public final C199769fw A01;
    public final C201539jo A02;
    public final AnonymousClass8SS A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202599mH)) {
            return false;
        }
        C202599mH r4 = (C202599mH) obj;
        return this.A04.equals(r4.A04) && C1901797e.A00(this.A03, r4.A03) && this.A01.equals(r4.A01);
    }

    public static String A00(String str) {
        try {
            return new JSONArray(str).getString(0);
        } catch (JSONException unused) {
            throw AnonymousClass001.A08("SyncMutationData/getValidMutationName: corrupt index");
        }
    }

    public static String[] A01(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        int i = 0;
        while (i < jSONArray.length()) {
            strArr[i] = jSONArray.getString(i);
            if (!strArr[i].isEmpty()) {
                i++;
            } else {
                throw AnonymousClass000.A0d("SyncMutationData/getValidKeyArrayIndex: The key is empty in the keyArray at position: ", AnonymousClass000.A0u(), i);
            }
        }
        if (length > 0) {
            return strArr;
        }
        throw AnonymousClass001.A08("SyncMutationData/getValidKeyArrayIndex: keyArray length should have action name");
    }

    public C202599mH(C201669k5 r2) {
        this.A00 = r2.A03;
        this.A04 = r2.A06();
        this.A02 = r2.A00;
        this.A06 = r2.A0A();
        this.A01 = r2.A05;
        this.A03 = r2.A05();
        this.A05 = r2.A01;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A04;
        A1Q[1] = this.A03;
        return C90484aE.A0D(this.A01, A1Q);
    }

    public String toString() {
        return "SyncMutationData";
    }

    public C202599mH(C199769fw r2, C201539jo r3, String str, byte[] bArr, byte[] bArr2, int i) {
        AnonymousClass8SS r0;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r3;
        this.A06 = A01(str);
        this.A01 = r2;
        if (bArr != null) {
            r0 = (AnonymousClass8SS) C170918Hz.A08(AnonymousClass8SS.DEFAULT_INSTANCE, bArr);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A05 = bArr2;
    }

    public C202599mH(C199769fw r1, C201539jo r2, AnonymousClass8SS r3, String str, byte[] bArr, String[] strArr, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A02 = r2;
        this.A06 = strArr;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = bArr;
    }
}
