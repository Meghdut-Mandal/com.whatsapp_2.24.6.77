package X;

/* renamed from: X.7VS  reason: invalid class name */
public final class AnonymousClass7VS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $name;
    public final /* synthetic */ C006302t $onError;
    public final /* synthetic */ C006302t $onSuccess;
    public final /* synthetic */ int $version;
    public final /* synthetic */ AnonymousClass6CQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VS(AnonymousClass6CQ r2, String str, C006302t r4, C006302t r5, int i) {
        super(1);
        this.$name = str;
        this.$version = i;
        this.this$0 = r2;
        this.$onSuccess = r4;
        this.$onError = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
        r2 = X.C90524aI.A0U(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = X.C131136Nw.A00(r2, r13.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        if (r0 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90464aC.A1J("MLModelCacheManagerImpl/updateModel/found model file for ", r7, r1, ' ');
        X.C36321k7.A1Y(r1, r4);
        r11 = r14.getCanonicalPath();
        X.AnonymousClass00C.A08(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C05600Qi.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90464aC.A1J("MLModelCacheManagerImpl/updateModel/hash verification failed for ", r7, r1, ' ');
        X.C36351kA.A1R(r1, r4);
        r1 = X.AnonymousClass5DF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0164, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r16
            X.0AK r0 = (X.AnonymousClass0AK) r0
            java.lang.Object r6 = r0.value
            java.lang.String r7 = r15.$name
            int r4 = r15.$version
            X.6CQ r2 = r15.this$0
            X.02t r10 = r15.$onSuccess
            X.02t r3 = r15.$onError
            boolean r0 = r6 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            r5 = 32
            if (r0 == 0) goto L_0x0181
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelManager/fetchModel/found ml model url for "
            X.C90464aC.A1J(r0, r7, r1, r5)
            X.C36321k7.A1Y(r1, r4)
            X.5ti r11 = r2.A01     // Catch:{ all -> 0x0048 }
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "MLModelDownloaderImpl/downloadModel/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0048 }
            X.13E r1 = r11.A01     // Catch:{ all -> 0x0048 }
            X.0yd r0 = r11.A02     // Catch:{ all -> 0x0048 }
            r9 = 0
            X.6v1 r8 = r1.A02(r0, r8, r9)     // Catch:{ all -> 0x0048 }
            X.0ww r1 = r11.A00     // Catch:{ all -> 0x0048 }
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0048 }
            X.5RE r9 = r8.B8D(r1, r9, r0)     // Catch:{ all -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            r0 = move-exception
            X.03N r9 = X.C90524aI.A0t(r0)
        L_0x004d:
            boolean r0 = r9 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016a
            r8 = r9
            java.io.InputStream r8 = (java.io.InputStream) r8
            X.6Nw r2 = r2.A00     // Catch:{ all -> 0x0129 }
            r0 = 0
            X.C36321k7.A0v(r7, r0, r8)     // Catch:{ all -> 0x0129 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0129 }
            java.util.Map r0 = X.C90514aH.A15(r7, r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x011a
            java.lang.Object r13 = X.C36371kC.A0r(r0, r4)     // Catch:{ all -> 0x0129 }
            X.6BY r13 = (X.AnonymousClass6BY) r13     // Catch:{ all -> 0x0129 }
            if (r13 == 0) goto L_0x011a
            java.io.File r11 = r2.A01(r7, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            boolean r0 = r11.exists()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            if (r0 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/deleting model file for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.C36321k7.A1Y(r1, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            r11.delete()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
        L_0x0085:
            java.io.File r14 = r2.A01(r7, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.io.File r0 = r14.getParentFile()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            r0.mkdirs()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            boolean r0 = r8 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            if (r0 == 0) goto L_0x00a5
            r2 = r8
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            goto L_0x00ac
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/model file not found for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.C36321k7.A1Y(r1, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            goto L_0x0085
        L_0x00a5:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            r2.<init>(r8, r0)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
        L_0x00ac:
            java.io.FileOutputStream r12 = X.C90524aI.A0W(r14)     // Catch:{ all -> 0x00f6 }
        L_0x00b0:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x00ef }
            int r1 = r2.read(r11)     // Catch:{ all -> 0x00ef }
            if (r1 < 0) goto L_0x00bf
            r0 = 0
            r12.write(r11, r0, r1)     // Catch:{ all -> 0x00ef }
            goto L_0x00b0
        L_0x00bf:
            r12.close()     // Catch:{ all -> 0x00f6 }
            r2.close()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.io.FileInputStream r2 = X.C90524aI.A0U(r14)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r0 = r13.A02     // Catch:{ all -> 0x00e8 }
            boolean r0 = X.C131136Nw.A00(r2, r0)     // Catch:{ all -> 0x00e8 }
            r2.close()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            if (r0 == 0) goto L_0x00fd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/found model file for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.C36321k7.A1Y(r1, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r11 = r14.getCanonicalPath()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.AnonymousClass00C.A08(r11)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            goto L_0x012e
        L_0x00e8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            goto L_0x010b
        L_0x00ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            X.C05600Qi.A00(r12, r1)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            goto L_0x010b
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/hash verification failed for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.C36351kA.A1R(r1, r4)     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
            X.5DF r1 = X.AnonymousClass5DF.A00     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
        L_0x010b:
            throw r1     // Catch:{ IOException -> 0x0113, NoSuchAlgorithmException -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.5DC r1 = new X.5DC     // Catch:{ all -> 0x0129 }
            r1.<init>(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0119
        L_0x0113:
            r0 = move-exception
            X.5DD r1 = new X.5DD     // Catch:{ all -> 0x0129 }
            r1.<init>(r0)     // Catch:{ all -> 0x0129 }
        L_0x0119:
            throw r1     // Catch:{ all -> 0x0129 }
        L_0x011a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "MLModelCacheManagerImpl/verifyModelHashExists/model hash not found for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ all -> 0x0129 }
            X.C36351kA.A1R(r1, r4)     // Catch:{ all -> 0x0129 }
            X.5DE r0 = X.AnonymousClass5DE.A00     // Catch:{ all -> 0x0129 }
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            X.03N r11 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x015e }
        L_0x012e:
            boolean r0 = r11 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x015e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0146
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ all -> 0x015e }
            X.C36321k7.A1Y(r1, r4)     // Catch:{ all -> 0x015e }
            r10.invoke(r2)     // Catch:{ all -> 0x015e }
        L_0x0146:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r11)     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0165
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache failed for "
            X.C90464aC.A1J(r0, r7, r1, r5)     // Catch:{ all -> 0x015e }
            X.C36351kA.A1R(r1, r4)     // Catch:{ all -> 0x015e }
            X.5DG r0 = X.AnonymousClass5DG.A00     // Catch:{ all -> 0x015e }
            r3.invoke(r0)     // Catch:{ all -> 0x015e }
            goto L_0x0165
        L_0x015e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)
            throw r0
        L_0x0165:
            if (r8 == 0) goto L_0x016a
            r8.close()
        L_0x016a:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r9)
            if (r0 == 0) goto L_0x0181
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelManager/fetchModel/downloading ml model file failed for "
            X.C90464aC.A1J(r0, r7, r1, r5)
            X.C36351kA.A1R(r1, r4)
            X.5DH r0 = X.AnonymousClass5DH.A00
            r3.invoke(r0)
        L_0x0181:
            java.lang.String r4 = r15.$name
            int r3 = r15.$version
            X.02t r2 = r15.$onError
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r6)
            if (r0 == 0) goto L_0x019e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelManager/fetchModel/ml model url not found for "
            X.C90464aC.A1J(r0, r4, r1, r5)
            X.C36351kA.A1R(r1, r3)
            X.5DI r0 = X.AnonymousClass5DI.A00
            r2.invoke(r0)
        L_0x019e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VS.invoke(java.lang.Object):java.lang.Object");
    }
}
