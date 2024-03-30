package X;

/* renamed from: X.1ix  reason: invalid class name and case insensitive filesystem */
public class C35601ix implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C35601ix(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0140, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A03
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0035;
                case 2: goto L_0x00ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.1AP r0 = (X.AnonymousClass1AP) r0
            java.lang.String r3 = r14.A01
            java.lang.String r2 = r14.A02
            X.1BB r0 = r0.A0D
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0017:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.6Fn r0 = (X.C129156Fn) r0
            r0.A0B(r3, r2)
            goto L_0x0017
        L_0x0027:
            java.lang.Object r0 = r14.A00
            X.1c2 r0 = (X.C31571c2) r0
            java.lang.String r2 = r14.A01
            java.lang.String r1 = r14.A02
            X.1WR r0 = r0.A01
            r0.A02(r2, r1)
        L_0x0034:
            return
        L_0x0035:
            java.lang.Object r5 = r14.A00
            X.1YK r5 = (X.AnonymousClass1YK) r5
            java.lang.String r1 = r14.A01
            java.lang.String r0 = r14.A02
            X.00I r9 = new X.00I
            r9.<init>(r1, r0)
            monitor-enter(r5)
            java.lang.Object r1 = r9.A00     // Catch:{ all -> 0x00ab }
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x00ab }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0056
            X.1Dc r1 = r5.A02     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate empty credentialId"
            r1.A05(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00a6
        L_0x0056:
            X.12i r6 = r5.A00     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "unread_payment_method_credential_ids"
            java.lang.String r0 = r6.A01(r4)     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = ""
        L_0x0062:
            java.lang.String r8 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r8)     // Catch:{ all -> 0x00ab }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x00ab }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x00ab }
            r7.<init>(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = ":"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ab }
            r0 = 0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ab }
            r2[r0] = r1     // Catch:{ all -> 0x00ab }
            r1 = 1
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00ab }
            r2[r1] = r0     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = android.text.TextUtils.join(r3, r2)     // Catch:{ all -> 0x00ab }
            r7.add(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = android.text.TextUtils.join(r8, r7)     // Catch:{ all -> 0x00ab }
            X.1Dc r2 = r5.A02     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate/unreadCredential:"
            r1.append(r0)     // Catch:{ all -> 0x00ab }
            r1.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ab }
            r2.A06(r0)     // Catch:{ all -> 0x00ab }
            r6.A04(r4, r3)     // Catch:{ all -> 0x00ab }
        L_0x00a6:
            monitor-exit(r5)
            X.AnonymousClass1YK.A00(r5)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00ae:
            java.lang.Object r5 = r14.A00
            X.1AP r5 = (X.AnonymousClass1AP) r5
            java.lang.String r4 = r14.A01
            java.lang.String r3 = r14.A02
            X.1BI r10 = r5.A0L     // Catch:{ Exception -> 0x014e }
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ Exception -> 0x014e }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ Exception -> 0x014e }
            X.1BM r0 = r10.A01     // Catch:{ Exception -> 0x014e }
            X.68B r8 = r0.A02(r4, r3)     // Catch:{ Exception -> 0x014e }
            byte[] r1 = r0.A04(r8)     // Catch:{ Exception -> 0x014e }
            X.1BO r0 = r10.A05     // Catch:{ Exception -> 0x014e }
            r0.A00(r8, r1)     // Catch:{ Exception -> 0x014e }
            boolean r0 = r8.A0O     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0141
            X.1BJ r1 = r10.A03     // Catch:{ Exception -> 0x014e }
            java.util.List r0 = r8.A05     // Catch:{ Exception -> 0x014e }
            r1.A02(r4, r3, r0)     // Catch:{ Exception -> 0x014e }
            java.util.List r0 = r8.A05     // Catch:{ Exception -> 0x014e }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x014e }
        L_0x00e0:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x0141
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x014e }
            X.6c4 r1 = (X.C135066c4) r1     // Catch:{ Exception -> 0x014e }
            java.lang.String r12 = r1.A0E     // Catch:{ Exception -> 0x014e }
            X.3S2 r0 = r1.A04     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x00f5
            X.1XQ[] r0 = r0.A0D     // Catch:{ Exception -> 0x014e }
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r12 == 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00e0
            X.1BQ r11 = r10.A04     // Catch:{ Exception -> 0x014e }
            java.lang.String r7 = X.C55532um.A00(r0)     // Catch:{ Exception -> 0x014e }
            java.lang.String r6 = r1.A0B     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = "authority"
            java.lang.String r1 = "emojis"
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ Exception -> 0x014e }
            r9.<init>()     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = "plaintext_hash"
            r9.put(r0, r12)     // Catch:{ Exception -> 0x014e }
            r9.put(r2, r4)     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = "sticker_pack_id"
            r9.put(r0, r3)     // Catch:{ Exception -> 0x014e }
            r9.put(r1, r7)     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = "hash_of_image_part"
            r9.put(r0, r6)     // Catch:{ Exception -> 0x014e }
            X.005 r0 = r11.A00     // Catch:{ Exception -> 0x014e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014e }
            X.16q r0 = (X.C229616q) r0     // Catch:{ Exception -> 0x014e }
            X.1M0 r7 = r0.A04()     // Catch:{ Exception -> 0x014e }
            X.14e r6 = r7.A02     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "third_party_sticker_emoji_mapping"
            r1 = 5
            java.lang.String r0 = "addMapping/INSERT_MAPPING"
            r6.A08(r2, r0, r9, r1)     // Catch:{ all -> 0x013a }
            r7.close()     // Catch:{ Exception -> 0x014e }
            goto L_0x00e0
        L_0x013a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ Exception -> 0x014e }
            throw r0     // Catch:{ Exception -> 0x014e }
        L_0x0141:
            X.1BP r0 = r10.A06     // Catch:{ Exception -> 0x014e }
            r0.A02(r8, r4, r3)     // Catch:{ Exception -> 0x014e }
            X.1BH r1 = r5.A0M     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = r8.A0F     // Catch:{ Exception -> 0x014e }
            r1.A02(r0)     // Catch:{ Exception -> 0x014e }
            goto L_0x0153
        L_0x014e:
            java.lang.String r0 = "StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0153:
            X.17Y r2 = r5.A03
            r1 = 3
            X.1ix r0 = new X.1ix
            r0.<init>(r5, r4, r3, r1)
            r2.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35601ix.run():void");
    }
}
