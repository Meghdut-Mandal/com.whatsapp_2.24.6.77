package X;

import android.text.TextUtils;

/* renamed from: X.7pN  reason: invalid class name and case insensitive filesystem */
public class C162927pN extends C132446Tt {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C162927pN(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0203, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0206, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r11 = r26
            int r0 = r11.A03
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r11.A00
            X.1Yo r0 = (X.C29931Yo) r0
            X.1Ee r1 = r0.A06
            java.lang.Object r0 = r11.A01
            X.6c9 r0 = (X.C135106c9) r0
            java.lang.String r0 = r0.A0F
            X.6c9 r0 = r1.A03(r0)
            return r0
        L_0x0017:
            java.lang.Object r4 = r11.A02
            X.683 r4 = (X.AnonymousClass683) r4
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.0ts r2 = r4.A03
            java.util.Locale r0 = X.C36401kF.A0x(r2)
            java.lang.String r1 = X.C26621Kw.A05(r0)
            java.util.Locale r0 = X.C36401kF.A0x(r2)
            java.lang.String r3 = X.C26621Kw.A04(r0)
            int r0 = r3.length()
            if (r0 != 0) goto L_0x003b
            java.lang.String r3 = r2.A05()
        L_0x003b:
            X.AnonymousClass00C.A0B(r3)
            X.6O2 r0 = r4.A07
            java.util.TreeSet r0 = r0.A02()
            r0.add(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x004b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = X.AnonymousClass001.A0C(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            r0 = 45
            java.lang.String r0 = X.C90464aC.A0f(r3, r1, r0)
            r5.add(r0)
            goto L_0x004b
        L_0x0063:
            java.lang.String r0 = ","
            java.lang.String r7 = X.C36381kD.A0x(r0, r5)
            X.6LL r3 = r4.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dictionaryloader/prepare/cache language: "
            r1.append(r0)
            java.lang.String r0 = r3.A03
            r1.append(r0)
            java.lang.String r0 = ", last attempted language: "
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = ", request languages: "
            X.C36321k7.A1Q(r0, r7, r1)
            X.0wo r10 = r4.A02
            long r5 = X.C19970wo.A00(r10)
            X.1XI r13 = r4.A06
            int r0 = r13.getCount()
            r12 = 1
            r2 = 0
            boolean r8 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = r3.A03
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            r18 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L_0x0113
            long r0 = r3.A00
            long r16 = r5 - r0
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0113
        L_0x00b2:
            X.62v r0 = new X.62v
            r0.<init>(r4, r2, r8)
        L_0x00b7:
            boolean r15 = r0.A00
            r9 = 0
            r8 = 1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            if (r15 == 0) goto L_0x00d9
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = r3.A03
            boolean r1 = X.AnonymousClass00C.A0J(r7, r1)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = "dictionaryloader/prepare/publish progress to show search"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Boolean[] r1 = new java.lang.Boolean[r12]
            r1[r2] = r14
            r11.A0F(r1)
        L_0x00d9:
            boolean r0 = r0.A01
            r4.A00 = r0
            if (r15 == 0) goto L_0x024e
            X.0wD r0 = r4.A01
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x024e
            X.58J r2 = new X.58J
            r2.<init>()
            r2.A05 = r7
            java.lang.String r0 = r3.A03
            r2.A04 = r0
            long r0 = r3.A01
            r15 = 0
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1Q(r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.A01 = r12
            java.lang.Long r0 = X.C90504aG.A0h(r5, r0)
            r2.A03 = r0
            r2.A00 = r14
            java.lang.Object r12 = r11.A01
            java.lang.Integer r12 = (java.lang.Integer) r12
            long r15 = X.C19970wo.A00(r10)
            goto L_0x012a
        L_0x0113:
            long r0 = r3.A01
            long r14 = r5 - r0
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0124
            java.lang.String r0 = r3.A05
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 == 0) goto L_0x0124
            goto L_0x00b2
        L_0x0124:
            X.62v r0 = new X.62v
            r0.<init>(r4, r12, r8)
            goto L_0x00b7
        L_0x012a:
            X.7kS r11 = r4.A05     // Catch:{ IOException -> 0x020b }
            java.lang.String r0 = r3.A04     // Catch:{ IOException -> 0x020b }
            X.6v1 r5 = r11.B3S(r0, r7)     // Catch:{ IOException -> 0x020b }
            java.net.HttpURLConnection r10 = r5.A01     // Catch:{ all -> 0x0204 }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x0204 }
            java.lang.Long r0 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x0204 }
            r2.A02 = r0     // Catch:{ all -> 0x0204 }
            r0 = 304(0x130, float:4.26E-43)
            r6 = 0
            if (r1 != r0) goto L_0x0159
            java.lang.String r0 = "dictionaryloader/prepare-from-network/not_modified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0204 }
            X.5Ts r11 = X.C108495Ts.UPTO_DATE     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x0204 }
            X.6LL r0 = new X.6LL     // Catch:{ all -> 0x0204 }
            r14 = r7
            r10 = r0
            r12 = r1
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0204 }
            goto L_0x01f9
        L_0x0159:
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L_0x0194
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0204 }
            r13.B2o()     // Catch:{ Exception -> 0x0174 }
            X.5Ts r11 = X.C108495Ts.LANGUAGE_UNAVAILABLE     // Catch:{ Exception -> 0x0174 }
            X.6LL r0 = new X.6LL     // Catch:{ Exception -> 0x0174 }
            r14 = r7
            r10 = r0
            r12 = r6
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x0174 }
            goto L_0x01f9
        L_0x0174:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable/clear-fail"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0204 }
            X.5Ts r18 = X.C108495Ts.FETCH_ERROR     // Catch:{ all -> 0x0204 }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x0204 }
            long r10 = r3.A00     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0204 }
            X.6LL r0 = new X.6LL     // Catch:{ all -> 0x0204 }
            r17 = r0
            r19 = r6
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0204 }
            goto L_0x01f9
        L_0x0194:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01bb
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "dictionaryloader/prepare-from-network/servererror: "
            X.C36321k7.A1S(r0, r6, r1)     // Catch:{ all -> 0x0204 }
            X.5Ts r18 = X.C108495Ts.FETCH_ERROR     // Catch:{ all -> 0x0204 }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x0204 }
            long r10 = r3.A00     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0204 }
            X.6LL r0 = new X.6LL     // Catch:{ all -> 0x0204 }
            r17 = r0
            r19 = r6
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0204 }
            goto L_0x01f9
        L_0x01bb:
            int r0 = r10.getContentLength()     // Catch:{ all -> 0x0204 }
            long r0 = (long) r0     // Catch:{ all -> 0x0204 }
            java.io.InputStream r6 = r11.BCm(r5, r6)     // Catch:{ all -> 0x0204 }
            boolean r0 = r11.BJe(r6, r12, r0)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "ETag"
            java.lang.String r12 = r10.getHeaderField(r0)     // Catch:{ all -> 0x01fd }
            X.5Ts r11 = X.C108495Ts.UPTO_DATE     // Catch:{ all -> 0x01fd }
            X.6LL r0 = new X.6LL     // Catch:{ all -> 0x01fd }
            r14 = r7
            r10 = r0
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x01fd }
            goto L_0x01f6
        L_0x01dd:
            X.5Ts r18 = X.C108495Ts.FETCH_ERROR     // Catch:{ all -> 0x01fd }
            java.lang.String r12 = r3.A04     // Catch:{ all -> 0x01fd }
            long r10 = r3.A00     // Catch:{ all -> 0x01fd }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x01fd }
            X.6LL r0 = new X.6LL     // Catch:{ all -> 0x01fd }
            r17 = r0
            r19 = r12
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x01fd }
        L_0x01f6:
            r6.close()     // Catch:{ all -> 0x0204 }
        L_0x01f9:
            r5.close()     // Catch:{ IOException -> 0x020b }
            goto L_0x022a
        L_0x01fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0204 }
            throw r0     // Catch:{ all -> 0x0204 }
        L_0x0204:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0206 }
        L_0x0206:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IOException -> 0x020b }
            throw r0     // Catch:{ IOException -> 0x020b }
        L_0x020b:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/connecterror"
            com.whatsapp.util.Log.e(r0, r1)
            X.5Ts r18 = X.C108495Ts.NETWORK_ERROR
            java.lang.String r10 = r3.A04
            long r5 = r3.A00
            java.lang.String r1 = r3.A03
            X.6LL r0 = new X.6LL
            r17 = r0
            r19 = r10
            r20 = r7
            r21 = r1
            r24 = r5
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)
        L_0x022a:
            X.5Ts r1 = r0.A02
            r4.A01(r0)
            java.lang.String r0 = r0.A03
            r2.A07 = r0
            if (r1 == 0) goto L_0x024c
            java.lang.String r0 = r1.fieldStatString
        L_0x0237:
            r2.A06 = r0
            if (r1 == 0) goto L_0x0246
            boolean r0 = r1.fetchSuccessful
            if (r0 != r8) goto L_0x0246
            boolean r0 = r1.gotDictionary
            if (r0 != r8) goto L_0x0244
            r9 = 1
        L_0x0244:
            r4.A00 = r9
        L_0x0246:
            X.0yW r0 = r4.A04
            r0.Bly(r2)
            goto L_0x0268
        L_0x024c:
            r0 = 0
            goto L_0x0237
        L_0x024e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dictionaryloader/prepare/skip network fetch, want to fetch: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", network available: "
            r1.append(r0)
            X.0wD r0 = r4.A01
            boolean r0 = r0.A09()
            X.C36331k8.A1S(r1, r0)
        L_0x0268:
            boolean r0 = r4.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162927pN.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (this.A03 != 0) {
            C135106c9 r7 = (C135106c9) obj;
            if (r7 != null) {
                C135106c9 r1 = (C135106c9) this.A01;
                if (!TextUtils.isEmpty(r7.A05)) {
                    r1.A05 = r7.A05;
                }
                if (!TextUtils.isEmpty(r7.A06)) {
                    r1.A01 = r7.A01;
                    r1.A06 = r7.A06;
                }
            }
            C29931Yo r5 = (C29931Yo) this.A00;
            C135106c9 r4 = (C135106c9) this.A01;
            C17800s3 r3 = (C17800s3) this.A02;
            if (TextUtils.isEmpty(r4.A05)) {
                r5.A0A.A00(new C145226tY(r4, r3, r5), r4.A0F);
                return;
            }
            r5.A0D.Boy(new C35631j0(r5, r4, r3, 48));
            return;
        }
        boolean A1X = AnonymousClass000.A1X(obj);
        ((AnonymousClass683) this.A02).A06.Br6(A1X);
        ((AnonymousClass610) this.A00).A00(A1X);
    }
}
