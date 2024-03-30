package X;

import org.json.JSONObject;

/* renamed from: X.6Te  reason: invalid class name and case insensitive filesystem */
public final class C132346Te {
    public String A00;
    public String A01;
    public JSONObject A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final C19700wN A06;
    public final C24461Cn A07;
    public final C133226Xi A08;
    public final C20810yC A09;
    public final String A0A;
    public final JSONObject A0B;
    public final C24431Ck A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2.length() == 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized org.json.JSONObject A01(X.C132346Te r5) {
        /*
            monitor-enter(r5)
            boolean r0 = r5.A03     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0008
            org.json.JSONObject r0 = r5.A02     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x0008:
            org.json.JSONObject r1 = r5.A0B     // Catch:{ all -> 0x0046 }
            r4 = 0
            if (r1 == 0) goto L_0x0044
            r3 = 1
            r5.A03 = r3     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "encryptedData"
            java.lang.String r2 = r1.optString(r0)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x001f
            int r1 = r2.length()     // Catch:{ all -> 0x0046 }
            r0 = 0
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0044
            X.1Ck r0 = r5.A0C     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r0.A00(r2)     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0031
            int r0 = r1.length()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0031
            r3 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0044
            org.json.JSONObject r0 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x003a }
            r5.A02 = r0     // Catch:{ JSONException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api-v2/backup/failed to parse decrypted metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0046 }
        L_0x0040:
            org.json.JSONObject r0 = r5.A02     // Catch:{ all -> 0x0046 }
        L_0x0042:
            monitor-exit(r5)
            return r0
        L_0x0044:
            monitor-exit(r5)
            return r4
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132346Te.A01(X.6Te):org.json.JSONObject");
    }

    public static final long A00(C132346Te r4, String str) {
        JSONObject jSONObject = r4.A0B;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return jSONObject.optLong(str, -1);
            }
            JSONObject A012 = A01(r4);
            if (A012 != null) {
                return A012.optLong(str, -1);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.length() == 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject A02() {
        /*
            r4 = this;
            org.json.JSONObject r1 = r4.A0B
            r3 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "backupExpiry"
            java.lang.String r2 = r1.optString(r0)
            if (r2 == 0) goto L_0x0014
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r0 != 0) goto L_0x0022
            org.json.JSONObject r3 = X.C36441kJ.A1C(r2)     // Catch:{ JSONException -> 0x001c }
            return r3
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api-v2/get-backup-supported/failed to parse"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132346Te.A02():org.json.JSONObject");
    }

    public C132346Te(C19700wN r1, C24461Cn r2, C24431Ck r3, C133226Xi r4, C20810yC r5, String str, String str2, String str3, JSONObject jSONObject, long j, long j2) {
        this.A09 = r5;
        this.A06 = r1;
        this.A0C = r3;
        this.A07 = r2;
        this.A08 = r4;
        this.A0A = str;
        this.A01 = str2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = str3;
        this.A0B = jSONObject;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Backup{jidUser='");
        A0u.append(this.A0A);
        A0u.append("', name='");
        A0u.append(this.A01);
        A0u.append("', updateTime=");
        A0u.append(this.A05);
        A0u.append(", sizeBytes=");
        A0u.append(this.A04);
        A0u.append(", activeTransactionId='activeTransactionId', clientMetadata=");
        return C90464aC.A0X(this.A0B, A0u);
    }
}
