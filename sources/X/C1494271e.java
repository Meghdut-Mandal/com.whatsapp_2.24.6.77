package X;

/* renamed from: X.71e  reason: invalid class name and case insensitive filesystem */
public final class C1494271e implements C160227kf {
    public final /* synthetic */ C121175si A00;
    public final /* synthetic */ C158077fl A01;
    public final /* synthetic */ C158077fl A02;
    public final /* synthetic */ Object A03;

    public C1494271e(C121175si r1, C158077fl r2, C158077fl r3, Object obj) {
        this.A00 = r1;
        this.A03 = obj;
        this.A02 = r2;
        this.A01 = r3;
    }

    private final void A00() {
        C19650wI r4 = this.A00.A01;
        if (r4 != null) {
            r4.Bp3(new C1501874h(this.A03, this.A01.B7y(), 5));
            return;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r0 = "bloks_response"
            java.lang.String r1 = r7.getString(r0)     // Catch:{ JSONException -> 0x0072 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ JSONException -> 0x0072 }
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.io.ByteArrayInputStream r4 = X.C90524aI.A0P(r0)     // Catch:{ IOException -> 0x006c }
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x0065 }
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            java.io.ByteArrayOutputStream r2 = X.C90524aI.A0Q()     // Catch:{ all -> 0x005e }
            X.AnonymousClass6YY.A0J(r3, r2)     // Catch:{ all -> 0x0057 }
            java.nio.charset.Charset r0 = X.C19430v1.A0D     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r2.toString(r0)     // Catch:{ all -> 0x0057 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0057 }
            r2.close()     // Catch:{ all -> 0x005e }
            r3.close()     // Catch:{ all -> 0x0065 }
            r4.close()     // Catch:{ IOException -> 0x006c }
            X.5si r0 = r6.A00
            X.5ke r4 = r0.A00
            if (r4 == 0) goto L_0x0050
            java.lang.Object r3 = r6.A03
            X.7fl r2 = r6.A02
            X.7fl r0 = r6.A01
            X.6qA r1 = new X.6qA
            r1.<init>(r4, r2, r0, r3)
            r0 = 0
            X.C131816Qt.A00(r1, r0, r5)
            return
        L_0x0050:
            java.lang.String r0 = "accountLinkingExtensionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x006c }
            throw r0     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0072:
            r6.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494271e.onSuccess(java.lang.Object):void");
    }

    public void BVK() {
        A00();
    }

    public void BWl(Exception exc, Integer num) {
        A00();
    }
}
