package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.6Ox  reason: invalid class name and case insensitive filesystem */
public class C131406Ox {
    public final byte[] A00;
    public final byte[] A01;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r4) {
        /*
            r3 = 0
        L_0x0001:
            int r2 = r4.length
            if (r3 >= r2) goto L_0x000d
            byte r1 = r4[r3]
            r0 = 45
            if (r1 != r0) goto L_0x000d
            int r3 = r3 + 1
            goto L_0x0001
        L_0x000d:
            if (r3 != r2) goto L_0x0017
            java.lang.String r0 = "BackupFooter/verify-jid/empty-suffix"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            int r2 = r2 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3, r2)
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131406Ox.A00(byte[]):java.lang.String");
    }

    public C131406Ox(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public C1257861g A01(C24391Cg r6, String str, String str2) {
        int i;
        C36321k7.A1Q("BackupFooter/verify-integrity/actual-digest/  ", str, AnonymousClass000.A0u());
        String A07 = C18750th.A07(this.A00);
        C36321k7.A1Q("BackupFooter/verify-integrity/expected-digest/", A07, AnonymousClass000.A0u());
        if (str.equals(A07)) {
            Log.i("BackupFooter/verify-integrity/digest-matches/success");
            byte[] bArr = this.A01;
            if (!(bArr == null || str2 == null)) {
                String A002 = A00(bArr);
                if (!str2.endsWith(A002)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                    A0u.append(A002);
                    C36321k7.A1P("  actual-jid-user: ", str2, A0u);
                    r6.A00("BackupFooter/verify-integrity/jid-mismatch", 4);
                    return new C1257861g(4, (String) null);
                }
            }
            i = 1;
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("BackupFooter/verify-integrity/failed expected-digest:");
            A0u2.append(A07);
            r6.A00(AnonymousClass000.A0p(" actual-digest:", str, A0u2), 4);
            i = 2;
        }
        return new C1257861g(i, (String) null);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupFooter{digest=");
        C90474aD.A1O(A0u, this.A00);
        A0u.append(", jidSuffix=");
        byte[] bArr = this.A01;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = "null";
        }
        A0u.append(str);
        return AnonymousClass000.A0s(A0u);
    }
}
