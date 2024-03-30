package X;

import java.io.File;

/* renamed from: X.5Kh  reason: invalid class name */
public final class AnonymousClass5Kh extends AnonymousClass6FM {
    public final C20810yC A00;
    public final C21010yW A01;
    public final C23971Ao A02;
    public final File A03;
    public final AnonymousClass6KV A04;

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0192, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        com.whatsapp.util.Log.e("LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream too many files to unzip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C05600Qi.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0138, code lost:
        if (r2 != r1) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0149, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c0 A[Catch:{ 5UY | IOException | JSONException -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0140 A[Catch:{ 5UY | IOException | JSONException -> 0x0193 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:59:0x00bb=Splitter:B:59:0x00bb, B:82:0x013b=Splitter:B:82:0x013b, B:98:0x017d=Splitter:B:98:0x017d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.C108055Rz r15) {
        /*
            r14 = this;
            X.6KV r9 = r14.A04
            java.io.File r2 = r14.A03
            java.lang.String r5 = "LottieValidator/validateLottieFile error validating lottie file"
            r4 = 0
            X.0yC r1 = r9.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            r0 = 7886(0x1ece, float:1.105E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            r7 = 0
            if (r0 == 0) goto L_0x014e
            java.io.FileInputStream r3 = X.C90524aI.A0U(r2)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.io.ByteArrayOutputStream r6 = X.C90524aI.A0Q()     // Catch:{ IOException -> 0x00b4 }
            java.io.ByteArrayOutputStream r8 = X.C90524aI.A0Q()     // Catch:{ IOException -> 0x00b4 }
            X.005 r0 = r9.A01     // Catch:{ IOException -> 0x00b4 }
            java.lang.Object r10 = r0.get()     // Catch:{ IOException -> 0x00b4 }
            X.2TE r10 = (X.AnonymousClass2TE) r10     // Catch:{ IOException -> 0x00b4 }
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00b4 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00b4 }
            java.util.zip.ZipEntry r13 = r2.getNextEntry()     // Catch:{ all -> 0x00ad }
            r12 = 0
            r11 = 0
            r9 = 0
        L_0x0032:
            if (r13 == 0) goto L_0x0080
            if (r12 == 0) goto L_0x0038
            if (r11 != 0) goto L_0x0080
        L_0x0038:
            java.lang.String r1 = "animation/animation.json"
            java.lang.String r0 = r13.getName()     // Catch:{ all -> 0x00ad }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x004b
            X.AnonymousClass2TE.A00(r10, r6, r2)     // Catch:{ all -> 0x006e }
            r6.close()     // Catch:{ all -> 0x00ad }
            r12 = 1
        L_0x004b:
            java.lang.String r1 = "animation/animation.json.trust_token"
            java.lang.String r0 = r13.getName()     // Catch:{ all -> 0x00ad }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x005e
            X.AnonymousClass2TE.A00(r10, r8, r2)     // Catch:{ all -> 0x0075 }
            r8.close()     // Catch:{ all -> 0x00ad }
            r11 = 1
        L_0x005e:
            java.util.zip.ZipEntry r13 = r2.getNextEntry()     // Catch:{ all -> 0x00ad }
            int r9 = r9 + 1
            r0 = 20
            if (r9 <= r0) goto L_0x0032
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream too many files to unzip"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00ad }
            goto L_0x007c
        L_0x006e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)     // Catch:{ all -> 0x00ad }
            goto L_0x007b
        L_0x0075:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            X.C05600Qi.A00(r8, r0)     // Catch:{ all -> 0x00ad }
        L_0x007b:
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x007c:
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00ba
        L_0x0080:
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            if (r12 == 0) goto L_0x00a7
            if (r11 == 0) goto L_0x00a7
            byte[] r0 = r6.toByteArray()     // Catch:{ IOException -> 0x00b4 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IOException -> 0x00b4 }
            java.nio.charset.Charset r6 = X.AnonymousClass0S4.A05     // Catch:{ IOException -> 0x00b4 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x00b4 }
            r2.<init>(r0, r6)     // Catch:{ IOException -> 0x00b4 }
            byte[] r1 = r8.toByteArray()     // Catch:{ IOException -> 0x00b4 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException -> 0x00b4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x00b4 }
            r0.<init>(r1, r6)     // Catch:{ IOException -> 0x00b4 }
            X.6Ab r6 = new X.6Ab     // Catch:{ IOException -> 0x00b4 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00bb
        L_0x00a7:
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveTokenAndAnimationOutputStream unable to find either animation or token entry"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00ba
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x00b4 }
            throw r0     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "LottieValidator/getUnzipResult failed to create lottie json"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x018c }
        L_0x00ba:
            r6 = r7
        L_0x00bb:
            r3.close()     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r6 == 0) goto L_0x0197
            java.lang.String r0 = r6.A01     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.String r0 = X.AnonymousClass091.A01(r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            X.6SL r1 = new X.6SL     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            r1.<init>(r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.util.Map r0 = X.AnonymousClass6KV.A03     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            X.5ar r2 = X.AnonymousClass6H2.A00(r1, r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            X.54O r0 = X.AnonymousClass54O.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r2 instanceof X.AnonymousClass54N     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r0 == 0) goto L_0x00ef
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.String r0 = "LottieValidator/validateLottieFile failed to verify jwt token, "
            r1.append(r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            X.54N r2 = (X.AnonymousClass54N) r2     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.String r0 = r2.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            X.C36341k9.A1O(r1, r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            goto L_0x0197
        L_0x00ef:
            java.lang.String r6 = r6.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            org.json.JSONObject r1 = r1.A03     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r1 == 0) goto L_0x0197
            java.lang.String r0 = "sticker_file_type"
            java.lang.String r3 = X.AnonymousClass6HO.A01(r0, r7, r1)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.String r0 = "sticker_file_trusted_origin"
            java.lang.String r2 = X.AnonymousClass6HO.A01(r0, r7, r1)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.String r0 = "lottie_json"
            boolean r0 = r0.equals(r3)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r2)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r0 == 0) goto L_0x0197
            byte[] r0 = X.C36351kA.A1b(r6)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.io.ByteArrayInputStream r3 = X.C90524aI.A0P(r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.security.MessageDigest r0 = X.C90504aG.A0s()     // Catch:{ all -> 0x0147 }
            X.AnonymousClass6UG.A03(r3, r0)     // Catch:{ all -> 0x0147 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = X.C90504aG.A0o(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "sticker_file_sha256"
            java.lang.String r1 = X.AnonymousClass6HO.A01(r0, r7, r1)     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x0137
            if (r1 == 0) goto L_0x013a
            boolean r0 = r2.contentEquals(r1)     // Catch:{ all -> 0x0147 }
            goto L_0x013b
        L_0x0137:
            r0 = 1
            if (r2 == r1) goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            r3.close()     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r0 == 0) goto L_0x0197
            X.6Nn r0 = X.C203529oE.A05(r6)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.Object r0 = r0.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            goto L_0x0188
        L_0x0147:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            goto L_0x0192
        L_0x014e:
            java.io.FileInputStream r3 = X.C90524aI.A0U(r2)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.io.ByteArrayOutputStream r8 = X.C90524aI.A0Q()     // Catch:{ all -> 0x018c }
            X.005 r0 = r9.A01     // Catch:{ all -> 0x018c }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x018c }
            X.2TE r1 = (X.AnonymousClass2TE) r1     // Catch:{ all -> 0x018c }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x018c }
            r0.<init>(r3)     // Catch:{ all -> 0x018c }
            long r6 = r1.A02(r8, r0)     // Catch:{ all -> 0x018c }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x016f
            r2 = 0
            goto L_0x017d
        L_0x016f:
            byte[] r1 = r8.toByteArray()     // Catch:{ all -> 0x018c }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x018c }
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ all -> 0x018c }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x018c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x018c }
        L_0x017d:
            r3.close()     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x0197
            X.6Nn r0 = X.C203529oE.A05(r2)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
            java.lang.Object r0 = r0.A00     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
        L_0x0188:
            if (r0 == 0) goto L_0x0197
            r4 = 1
            return r4
        L_0x018c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
        L_0x0192:
            throw r1     // Catch:{ 5UY | IOException | JSONException -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x0197:
            int r0 = r15.ordinal()
            r2 = 3
            if (r0 == r4) goto L_0x019f
            r2 = 4
        L_0x019f:
            X.0yC r1 = r14.A00
            r0 = 6787(0x1a83, float:9.51E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01b9
            X.2Nu r1 = new X.2Nu
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r14.A01
            r0.Bly(r1)
        L_0x01b9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Kh.A02(X.5Rz):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5Kh(C20810yC r2, C21010yW r3, C23971Ao r4, AnonymousClass6KV r5, File file) {
        super(file);
        C36321k7.A0x(r2, r3);
        AnonymousClass00C.A0D(r4, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A02 = r4;
        this.A03 = file;
    }
}
