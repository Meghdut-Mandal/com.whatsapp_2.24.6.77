package X;

import android.content.SharedPreferences;

/* renamed from: X.1bR  reason: invalid class name and case insensitive filesystem */
public class C31201bR {
    public final AnonymousClass12U A00;
    public final C21180yn A01;
    public final C31191bQ A02;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r5 = this;
            X.1bQ r4 = r5.A02
            X.005 r0 = r4.A04
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "ab_props:hash_v2"
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)
            if (r1 == 0) goto L_0x0055
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004f }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x004f }
            X.63z r2 = X.AnonymousClass132.A00(r0)     // Catch:{ JSONException -> 0x004f }
            if (r2 == 0) goto L_0x0055
            X.133 r1 = r4.A01     // Catch:{ JSONException -> 0x004f }
            java.lang.String r0 = X.AnonymousClass6JD.A00     // Catch:{ JSONException -> 0x004f }
            byte[] r1 = r1.A02(r2, r0)     // Catch:{ JSONException -> 0x004f }
            if (r1 == 0) goto L_0x0055
            java.nio.charset.Charset r0 = X.C31191bQ.A08     // Catch:{ JSONException -> 0x004f }
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x004f }
            r3.<init>(r1, r0)     // Catch:{ JSONException -> 0x004f }
            X.005 r0 = r4.A03
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r2 = r0.getAll()
            java.util.Set r1 = r2.keySet()
            X.3aH r0 = X.C67663aH.A00
            X.AnonymousClass6XG.A01(r0, r1)
            java.lang.String r0 = X.C21190yo.A00(r2)
            boolean r0 = r3.equals(r0)
            r1 = r0 ^ 1
            goto L_0x0056
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "AB Props Hash couldn't be decrypted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0055:
            r1 = 0
        L_0x0056:
            X.12U r0 = r5.A00
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "unregistered"
            return r0
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "true"
            return r0
        L_0x0066:
            java.lang.String r0 = "false"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31201bR.A00():java.lang.String");
    }

    public String A01() {
        boolean z;
        C21180yn r3 = this.A01;
        String string = ((SharedPreferences) r3.A00.get()).getString("server_props:hash", (String) null);
        if (string != null) {
            z = !string.equals(C21190yo.A00(((SharedPreferences) r3.A01.get()).getAll()));
        } else {
            z = false;
        }
        if (!this.A00.A03()) {
            return "unregistered";
        }
        if (z) {
            return "true";
        }
        return "false";
    }

    public C31201bR(C21180yn r1, C31191bQ r2, AnonymousClass12U r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }
}
