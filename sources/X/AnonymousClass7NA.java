package X;

/* renamed from: X.7NA  reason: invalid class name */
public final class AnonymousClass7NA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6LO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NA(AnonymousClass6LO r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011c, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            X.6LO r6 = r8.this$0
            org.json.JSONArray r4 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x0120 }
            java.util.List r0 = r6.A02     // Catch:{ JSONException -> 0x0120 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x0120 }
        L_0x000c:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x0120 }
            if (r0 == 0) goto L_0x003a
            java.lang.Object r3 = r5.next()     // Catch:{ JSONException -> 0x0120 }
            X.6Ak r3 = (X.C127986Ak) r3     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "waffle_di"
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "waffle_da"
            X.5Tq r0 = r3.A00     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r0 = r0.iqValue     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "waffle_ds"
            java.lang.String r0 = "STORY"
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            r4.put(r0)     // Catch:{ JSONException -> 0x0120 }
            goto L_0x000c
        L_0x003a:
            org.json.JSONArray r3 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x0120 }
            java.util.List r0 = r6.A03     // Catch:{ JSONException -> 0x0120 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x0120 }
        L_0x0044:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x0120 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r5 = r7.next()     // Catch:{ JSONException -> 0x0120 }
            X.6DM r5 = (X.AnonymousClass6DM) r5     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "media_everstore_direct_path"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "message"
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "link_url"
            java.lang.String r0 = r5.A01     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "wa_status_id"
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "media_type"
            java.lang.String r0 = r5.A03     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "dispatch_timestamp"
            java.lang.Long r0 = r5.A00     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            r3.put(r0)     // Catch:{ JSONException -> 0x0120 }
            goto L_0x0044
        L_0x0088:
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x0120 }
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r0 = "destinations"
            org.json.JSONObject r1 = r1.put(r0, r4)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r0 = "statuses"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch:{ JSONException -> 0x0120 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r0 = X.C36381kD.A0y(r0)
            byte[] r4 = X.C36351kA.A1b(r0)
            int r0 = r4.length
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>(r0)
            r2 = 1
            r1 = 0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ all -> 0x0119 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0119 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0119 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0119 }
            r2.write(r4)     // Catch:{ all -> 0x0112 }
            r2.close()     // Catch:{ all -> 0x0112 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0112 }
            r5 = 2
            byte[] r0 = android.util.Base64.encode(r0, r5)     // Catch:{ all -> 0x0112 }
            r4 = 0
            r2.close()     // Catch:{ all -> 0x0119 }
            r3.close()
            X.AnonymousClass00C.A08(r0)
            X.61M r2 = r6.A00
            java.io.ByteArrayInputStream r3 = X.C90524aI.A0P(r0)     // Catch:{ IOException -> 0x0105 }
            r0 = 24
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x00fe }
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x00fe }
            r0.<init>()     // Catch:{ all -> 0x00fe }
            r0.nextBytes(r1)     // Catch:{ all -> 0x00fe }
            X.5RC r2 = r2.A00(r3, r1)     // Catch:{ all -> 0x00fe }
            byte[] r0 = X.AnonymousClass14X.A04(r2)     // Catch:{ all -> 0x00f7 }
            r2.close()     // Catch:{ all -> 0x00fe }
            r3.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x010b
        L_0x00f7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00fe }
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0105 }
            throw r0     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            java.lang.String r0 = "CrosspostPurposeEncryptionClient/encrypt IOException: data cannot be encrypted"
            X.AnonymousClass3TI.A00(r0)
            r0 = r4
        L_0x010b:
            if (r0 == 0) goto L_0x0111
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r5)
        L_0x0111:
            return r4
        L_0x0112:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0119 }
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)
            throw r1
        L_0x0120:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7NA.invoke():java.lang.Object");
    }
}
