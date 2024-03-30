package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.6OJ  reason: invalid class name */
public final class AnonymousClass6OJ {
    public final C118945oz A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final AnonymousClass133 A03;
    public final C20810yC A04;
    public final AnonymousClass132 A05;

    public static final byte[] A00(AnonymousClass6OJ r3) {
        C1264463z A002;
        String A0t = C36371kC.A0t(C36341k9.A0E(r3.A02), "push:push_pkey_data");
        if (A0t == null || (A002 = AnonymousClass132.A00(new JSONArray(A0t))) == null) {
            return null;
        }
        byte[] A022 = r3.A03.A02(A002, AnonymousClass6JD.A0V);
        if (A022 == null) {
            Log.e("PushEncryptionHelper/getSavedPKey failed to parse");
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if ((r4 + 2592000000L) < X.C19970wo.A00(r8.A01)) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A01(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            X.0v0 r2 = r8.A02
            r0 = -1
            X.005 r3 = r2.A00
            android.content.SharedPreferences r2 = X.C36391kE.A0H(r3)
            java.lang.String r6 = "push:push_pkey_generate_ts"
            long r4 = r2.getLong(r6, r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0025
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 + r0
            X.0wo r0 = r8.A01
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            r0 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "PushEncryptionHelper/isKeyExpired yes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0032:
            r0 = 32
            byte[] r7 = X.C18750th.A0H(r0)
            X.133 r1 = r8.A03
            java.lang.String r0 = X.AnonymousClass6JD.A0V
            X.63z r0 = r1.A01(r0, r7)
            r1 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.String r4 = r0.A00()
            if (r4 == 0) goto L_0x0065
            X.0wo r0 = r8.A01
            long r1 = X.C19970wo.A00(r0)
            android.content.SharedPreferences$Editor r3 = X.C90464aC.A0C(r3)
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r4)
            X.C36341k9.A0w(r0, r6, r1)
            java.lang.String r1 = X.C90504aG.A0o(r7)
        L_0x0060:
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r1)
            return r0
        L_0x0065:
            java.lang.String r0 = "PushEncryptionHelper/makeNewSharedSecret generation failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0060
        L_0x006b:
            byte[] r4 = A00(r8)
            if (r4 == 0) goto L_0x0032
            if (r10 != 0) goto L_0x00a8
            if (r9 == 0) goto L_0x009c
            r3 = 0
            java.security.MessageDigest r0 = X.C90504aG.A0s()     // Catch:{ NoSuchAlgorithmException -> 0x007b }
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            goto L_0x009c
        L_0x0081:
            r2 = 6
            byte[] r1 = new byte[r2]
            byte[] r0 = r0.digest(r4)
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            java.lang.String r0 = X.C36441kJ.A13(r1)
            boolean r1 = r0.equals(r9)
            if (r1 != 0) goto L_0x009a
            java.lang.String r0 = "PushEncryptionHelper/pKey hash mismatch with server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009a:
            r0 = r1 ^ 1
        L_0x009c:
            if (r0 != 0) goto L_0x00a8
            java.lang.Boolean r1 = X.C36381kD.A0j()
            r0 = 0
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            return r0
        L_0x00a8:
            java.lang.String r1 = X.C90504aG.A0o(r4)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OJ.A01(java.lang.String, boolean):android.util.Pair");
    }

    public AnonymousClass6OJ(C118945oz r2, C19970wo r3, C19420v0 r4, AnonymousClass132 r5, AnonymousClass133 r6, C20810yC r7) {
        C36321k7.A1B(r3, r7, r5, r4, r6);
        AnonymousClass00C.A0D(r2, 6);
        this.A01 = r3;
        this.A04 = r7;
        this.A05 = r5;
        this.A02 = r4;
        this.A03 = r6;
        this.A00 = r2;
    }
}
