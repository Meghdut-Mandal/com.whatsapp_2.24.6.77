package X;

/* renamed from: X.62U  reason: invalid class name */
public class AnonymousClass62U {
    public final /* synthetic */ C135056c3 A00;
    public final /* synthetic */ C133326Xw A01;
    public final /* synthetic */ AnonymousClass679 A02;

    public AnonymousClass62U(C133326Xw r1, AnonymousClass679 r2, C135056c3 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d8, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d9, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ec, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ed, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0254, code lost:
        r0 = th;
        r12 = r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:54:0x0130, B:83:0x018e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0254 A[ExcHandler: all (th java.lang.Throwable), PHI: r12 
      PHI: (r12v3 java.io.BufferedInputStream) = (r12v7 java.io.BufferedInputStream), (r12v10 java.io.BufferedInputStream) binds: [B:83:0x018e, B:54:0x0130] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01bb A[LOOP:2: B:95:0x01b8->B:97:0x01bb, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C135056c3 r23, X.AnonymousClass5VK r24, java.io.File r25) {
        /*
            r22 = this;
            r3 = r25
            r5 = r24
            if (r25 != 0) goto L_0x000f
            if (r24 != 0) goto L_0x000f
            java.lang.String r1 = "DefaultAssetManager"
            java.lang.String r0 = "download result and error should not be null at the same time."
            X.AnonymousClass6YR.A08(r1, r0)
        L_0x000f:
            r20 = r22
            r0 = r20
            X.6Xw r4 = r0.A01
            java.lang.Object r7 = r4.A04
            monitor-enter(r7)
            X.679 r2 = r0.A02     // Catch:{ all -> 0x025f }
            X.1Ak r19 = X.C133326Xw.A01(r4, r2)     // Catch:{ all -> 0x025f }
            int r0 = r2.A00     // Catch:{ all -> 0x025f }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1 = 0
            r18 = 0
            if (r0 != 0) goto L_0x002b
            r18 = 1
        L_0x002b:
            X.6W8 r0 = r4.A01     // Catch:{ all -> 0x025f }
            java.util.Map r6 = r0.A02     // Catch:{ all -> 0x025f }
            X.6c3 r0 = r2.A03     // Catch:{ all -> 0x025f }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x025f }
            r6.remove(r0)     // Catch:{ all -> 0x025f }
            monitor-exit(r7)     // Catch:{ all -> 0x025f }
            r21 = r23
            if (r25 == 0) goto L_0x0097
            if (r24 != 0) goto L_0x0097
            r0 = r21
            long r5 = r0.A00
            X.6VA r0 = r0.A01
            java.lang.String r9 = r0.A0A
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r0.A02
            java.lang.String r8 = r0.name()
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            long r11 = r3.length()
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            java.lang.String r7 = "DefaultAssetManager"
            java.lang.String r12 = "[%s]-%s asset result size check. Expected - Actual : %d - %d"
            X.7m1 r0 = X.AnonymousClass6YR.A01
            r11 = 4
            boolean r0 = r0.BMH(r11)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r12, r9, r8, r10, r13)
            X.AnonymousClass6YR.A06(r7, r0)
        L_0x006d:
            r12 = -1
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            long r12 = r3.length()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            X.63o r8 = X.C108395Ti.A00()
            java.lang.String r0 = "size_mismatch"
            r8.A02 = r0
            long r5 = r3.length()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "[%s] downloaded asset size mismatch. %d vs %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r10, r5)
        L_0x0091:
            r8.A01 = r0
            X.5VK r5 = r8.A00()
        L_0x0097:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x00be
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
            X.682 r0 = (X.AnonymousClass682) r0
            X.6SG r0 = r0.A07
            java.util.List r10 = java.util.Collections.singletonList(r0)
            java.lang.Integer r9 = X.C023109s.A0S
            boolean r13 = X.AnonymousClass000.A1W(r5)
            if (r25 == 0) goto L_0x00c8
            long r11 = r3.length()
        L_0x00b7:
            r6 = r4
            r7 = r21
            r8 = r5
            X.C133326Xw.A07(r6, r7, r8, r9, r10, r11, r13)
        L_0x00be:
            if (r5 == 0) goto L_0x023a
            r0 = 0
            X.C133326Xw.A06(r4, r2, r0, r5, r1)
            if (r25 == 0) goto L_0x0236
            goto L_0x022a
        L_0x00c8:
            r11 = 0
            goto L_0x00b7
        L_0x00cb:
            r0 = r21
            java.lang.Integer r0 = r0.A04
            r17 = r0
            if (r0 != 0) goto L_0x0224
            java.lang.String r6 = "null"
        L_0x00d5:
            r0 = r21
            java.lang.String r13 = r0.A05
            java.lang.String r5 = "[%s]-%s asset hash check. HashType : %s. Expected : %s"
            X.7m1 r0 = X.AnonymousClass6YR.A01
            boolean r0 = r0.BMH(r11)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r5, r9, r8, r6, r13)
            X.AnonymousClass6YR.A06(r7, r0)
        L_0x00ea:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0221
            if (r17 == 0) goto L_0x0221
            int r0 = r17.intValue()
            r5 = 1
            if (r0 == r5) goto L_0x0183
            if (r0 == r1) goto L_0x0123
            r12 = 0
        L_0x00fc:
            X.63o r8 = X.C108395Ti.A00()
            java.lang.String r0 = "hash_value_mismatch"
            r8.A02 = r0
            r0 = 6
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r1] = r9
            java.lang.String r0 = X.AnonymousClass5YE.A00(r17)
            X.C90464aC.A1D(r0, r13, r12, r7)
            r0 = 4
            r7[r0] = r10
            r0 = 5
            long r5 = r3.length()
            X.AnonymousClass000.A1M(r7, r0, r5)
            java.lang.String r0 = "asset hash mismatch. asset id: %s, hash type: %s, server hash value: %s, actual hash value: %s. server file size: %d, actual file size: %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r7)
            goto L_0x0091
        L_0x0123:
            java.lang.String r6 = "AssetFileUtil"
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r16 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x024b }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r12 = 0
            boolean r0 = r3 instanceof X.C107735Qq     // Catch:{ FileNotFoundException -> 0x016f, IOException -> 0x015c, all -> 0x0254 }
            if (r0 == 0) goto L_0x013c
            r0 = r3
            X.5Qq r0 = (X.C107735Qq) r0     // Catch:{ FileNotFoundException -> 0x016f, IOException -> 0x015c, all -> 0x0254 }
        L_0x0137:
            java.io.BufferedInputStream r11 = X.C90474aD.A0U(r0)     // Catch:{ FileNotFoundException -> 0x016f, IOException -> 0x015c, all -> 0x0254 }
            goto L_0x0142
        L_0x013c:
            X.5Qq r0 = new X.5Qq     // Catch:{ FileNotFoundException -> 0x016f, IOException -> 0x015c, all -> 0x0254 }
            r0.<init>((java.io.File) r3)     // Catch:{ FileNotFoundException -> 0x016f, IOException -> 0x015c, all -> 0x0254 }
            goto L_0x0137
        L_0x0142:
            int r14 = r11.read(r15)     // Catch:{ FileNotFoundException -> 0x015a, IOException -> 0x0158 }
            if (r14 <= 0) goto L_0x014e
            r0 = r16
            r0.update(r15, r1, r14)     // Catch:{ FileNotFoundException -> 0x015a, IOException -> 0x0158 }
            goto L_0x0142
        L_0x014e:
            X.AnonymousClass6I7.A00(r11)
            byte[] r12 = r16.digest()
            r0 = 32
            goto L_0x01b5
        L_0x0158:
            r8 = move-exception
            goto L_0x015e
        L_0x015a:
            r8 = move-exception
            goto L_0x0171
        L_0x015c:
            r8 = move-exception
            r11 = r12
        L_0x015e:
            java.lang.String r7 = "Couldn't read the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0251 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0251 }
            r5[r1] = r0     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6YR.A0E(r6, r7, r8, r5)     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6I7.A00(r11)
            goto L_0x00fc
        L_0x016f:
            r8 = move-exception
            r11 = r12
        L_0x0171:
            java.lang.String r7 = "Couldn't find the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0251 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0251 }
            r5[r1] = r0     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6YR.A0E(r6, r7, r8, r5)     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6I7.A00(r11)
            goto L_0x00fc
        L_0x0183:
            java.lang.String r14 = "AssetFileUtil"
            java.security.MessageDigest r16 = X.C90504aG.A0s()     // Catch:{ NoSuchAlgorithmException -> 0x0259 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r12 = 0
            boolean r0 = r3 instanceof X.C107735Qq     // Catch:{ FileNotFoundException -> 0x01ec, IOException -> 0x01d8, all -> 0x0254 }
            if (r0 == 0) goto L_0x019a
            r0 = r3
            X.5Qq r0 = (X.C107735Qq) r0     // Catch:{ FileNotFoundException -> 0x01ec, IOException -> 0x01d8, all -> 0x0254 }
        L_0x0195:
            java.io.BufferedInputStream r11 = X.C90474aD.A0U(r0)     // Catch:{ FileNotFoundException -> 0x01ec, IOException -> 0x01d8, all -> 0x0254 }
            goto L_0x01a0
        L_0x019a:
            X.5Qq r0 = new X.5Qq     // Catch:{ FileNotFoundException -> 0x01ec, IOException -> 0x01d8, all -> 0x0254 }
            r0.<init>((java.io.File) r3)     // Catch:{ FileNotFoundException -> 0x01ec, IOException -> 0x01d8, all -> 0x0254 }
            goto L_0x0195
        L_0x01a0:
            int r6 = r11.read(r15)     // Catch:{ FileNotFoundException -> 0x01d6, IOException -> 0x01d4 }
            if (r6 <= 0) goto L_0x01ac
            r0 = r16
            r0.update(r15, r1, r6)     // Catch:{ FileNotFoundException -> 0x01d6, IOException -> 0x01d4 }
            goto L_0x01a0
        L_0x01ac:
            X.AnonymousClass6I7.A00(r11)
            byte[] r12 = r16.digest()
            r0 = 64
        L_0x01b5:
            char[] r11 = new char[r0]
            r6 = 0
        L_0x01b8:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0200
            byte r0 = r12[r6]
            r14 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r6 * 2
            char[] r15 = X.AnonymousClass6I7.A00
            int r0 = r14 >>> 4
            char r0 = r15[r0]
            r11[r5] = r0
            int r5 = r5 + 1
            r0 = r14 & 15
            char r0 = r15[r0]
            r11[r5] = r0
            int r6 = r6 + 1
            goto L_0x01b8
        L_0x01d4:
            r7 = move-exception
            goto L_0x01da
        L_0x01d6:
            r7 = move-exception
            goto L_0x01ee
        L_0x01d8:
            r7 = move-exception
            r11 = r12
        L_0x01da:
            java.lang.String r6 = "Couldn't read the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0251 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0251 }
            r5[r1] = r0     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6YR.A0E(r14, r6, r7, r5)     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6I7.A00(r11)
            goto L_0x00fc
        L_0x01ec:
            r7 = move-exception
            r11 = r12
        L_0x01ee:
            java.lang.String r6 = "Couldn't find the file: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0251 }
            java.lang.String r0 = r3.getPath()     // Catch:{ all -> 0x0251 }
            r5[r1] = r0     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6YR.A0E(r14, r6, r7, r5)     // Catch:{ all -> 0x0251 }
            X.AnonymousClass6I7.A00(r11)
            goto L_0x00fc
        L_0x0200:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            boolean r0 = android.text.TextUtils.equals(r12, r13)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r10 = X.AnonymousClass5YE.A00(r17)
            java.lang.String r6 = "[%s]-%s asset hash match. Hash type: %s,"
            X.7m1 r5 = X.AnonymousClass6YR.A01
            r0 = 4
            boolean r0 = r5.BMH(r0)
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r9, r8, r10)
            X.AnonymousClass6YR.A06(r7, r0)
        L_0x0221:
            r5 = 0
            goto L_0x0097
        L_0x0224:
            java.lang.String r6 = X.AnonymousClass5YE.A00(r17)
            goto L_0x00d5
        L_0x022a:
            r3.delete()     // Catch:{ SecurityException -> 0x022e }
            goto L_0x0236
        L_0x022e:
            r2 = move-exception
            java.lang.String r1 = "DefaultAssetManager"
            java.lang.String r0 = "failed to delete corrupted downloaded asset."
            X.AnonymousClass6YR.A0C(r1, r0, r2)
        L_0x0236:
            X.C133326Xw.A05(r4)
            return
        L_0x023a:
            if (r18 == 0) goto L_0x0248
            java.util.concurrent.Executor r4 = r4.A06
        L_0x023e:
            r2 = 11
            r1 = r20
            r0 = r21
            X.C1503374w.A01(r1, r0, r3, r4, r2)
            return
        L_0x0248:
            java.util.concurrent.Executor r4 = r4.A05
            goto L_0x023e
        L_0x024b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0251:
            r0 = move-exception
            r12 = r11
            goto L_0x0255
        L_0x0254:
            r0 = move-exception
        L_0x0255:
            X.AnonymousClass6I7.A00(r12)
            throw r0
        L_0x0259:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x025f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x025f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass62U.A00(X.6c3, X.5VK, java.io.File):void");
    }
}
