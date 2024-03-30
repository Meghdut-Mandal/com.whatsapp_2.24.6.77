package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6CQ  reason: invalid class name */
public final class AnonymousClass6CQ {
    public final C131136Nw A00;
    public final C121785ti A01;
    public final C19770wU A02;
    public final AnonymousClass616 A03;

    public AnonymousClass6CQ(C131136Nw r2, C121785ti r3, AnonymousClass616 r4, C19770wU r5) {
        AnonymousClass00C.A0D(r5, 1);
        this.A02 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
    }

    public final void A02(List list) {
        AnonymousClass00C.A0D(list, 0);
        C131136Nw r6 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6BY r4 = (AnonymousClass6BY) it.next();
            Map map = r6.A01;
            String str = r4.A01;
            Map A15 = C90514aH.A15(str, map);
            if (A15 == null) {
                A15 = C36431kI.A1G();
            }
            C90504aG.A1K(r4, A15, r4.A00);
            map.put(str, A15);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r6, int r7) {
        /*
            r5 = this;
            X.6Nw r4 = r5.A00     // Catch:{ 5Ug -> 0x0085 }
            java.util.Map r0 = r4.A01     // Catch:{ 5Ug -> 0x0085 }
            java.util.Map r0 = X.C90514aH.A15(r6, r0)     // Catch:{ 5Ug -> 0x0085 }
            r2 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = X.C36371kC.A0r(r0, r7)     // Catch:{ 5Ug -> 0x0085 }
            X.6BY r1 = (X.AnonymousClass6BY) r1     // Catch:{ 5Ug -> 0x0085 }
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            r3 = 32
            if (r1 == 0) goto L_0x0076
            java.io.File r4 = r4.A01(r6, r7)     // Catch:{ 5Ug -> 0x0085 }
            boolean r0 = r4.exists()     // Catch:{ 5Ug -> 0x0085 }
            if (r0 == 0) goto L_0x0065
            java.io.FileInputStream r2 = X.C90524aI.A0U(r4)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0050 }
            boolean r0 = X.C131136Nw.A00(r2, r0)     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            if (r0 == 0) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/found model file for "
            X.C90464aC.A1J(r0, r6, r1, r3)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            X.C36321k7.A1Y(r1, r7)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            java.lang.String r2 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            return r2
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/hash verification failed for "
            X.C90464aC.A1J(r0, r6, r1, r3)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            X.C36351kA.A1R(r1, r7)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            X.5DF r1 = X.AnonymousClass5DF.A00     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
            goto L_0x0056
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
        L_0x0056:
            throw r1     // Catch:{ IOException -> 0x0057, NoSuchAlgorithmException -> 0x005e }
        L_0x0057:
            r0 = move-exception
            X.5DD r1 = new X.5DD     // Catch:{ 5Ug -> 0x0085 }
            r1.<init>(r0)     // Catch:{ 5Ug -> 0x0085 }
            goto L_0x0064
        L_0x005e:
            r0 = move-exception
            X.5DC r1 = new X.5DC     // Catch:{ 5Ug -> 0x0085 }
            r1.<init>(r0)     // Catch:{ 5Ug -> 0x0085 }
        L_0x0064:
            throw r1     // Catch:{ 5Ug -> 0x0085 }
        L_0x0065:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5Ug -> 0x0085 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model file not found for "
            X.C90464aC.A1J(r0, r6, r1, r3)     // Catch:{ 5Ug -> 0x0085 }
            java.lang.String r0 = X.C36381kD.A10(r1, r7)     // Catch:{ 5Ug -> 0x0085 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 5Ug -> 0x0085 }
            return r2
        L_0x0076:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5Ug -> 0x0085 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model hash not found for "
            X.C90464aC.A1J(r0, r6, r1, r3)     // Catch:{ 5Ug -> 0x0085 }
            X.C36351kA.A1R(r1, r7)     // Catch:{ 5Ug -> 0x0085 }
            X.5DE r0 = X.AnonymousClass5DE.A00     // Catch:{ 5Ug -> 0x0085 }
            throw r0     // Catch:{ 5Ug -> 0x0085 }
        L_0x0085:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelManager/getModelFilePath/Failed to get model path from cacheManager: "
            X.C36321k7.A1J(r2, r0, r1)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CQ.A00(java.lang.String, int):java.lang.String");
    }

    public final void A01(String str, C006302t r6, C006302t r7, int i) {
        String A002 = A00(str, i);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A002 != null) {
            C90464aC.A1J("MLModelManager/fetchModel/found ml model file in cache for ", str, A0u, ' ');
            C36321k7.A1Y(A0u, i);
            r6.invoke(A002);
            return;
        }
        C90464aC.A1J("MLModelManager/fetchModel/start to fetch ml model file for ", str, A0u, ' ');
        C36321k7.A1Y(A0u, i);
        this.A03.A00(str, new AnonymousClass7VS(this, str, r6, r7, i), i);
    }
}
