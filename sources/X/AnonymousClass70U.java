package X;

/* renamed from: X.70U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70U implements C25711Hj {
    public final /* synthetic */ C194999Sb A00;
    public final /* synthetic */ C30641aX A01;
    public final /* synthetic */ C146506vi A02;
    public final /* synthetic */ C135066c4 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    public /* synthetic */ AnonymousClass70U(C194999Sb r1, C30641aX r2, C146506vi r3, C135066c4 r4, String str, byte[] bArr) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = bArr;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a9, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b0, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r31) {
        /*
            r30 = this;
            r5 = r31
            r2 = r30
            X.1aX r4 = r2.A01
            X.6vi r1 = r2.A02
            java.lang.String r0 = r2.A04
            r29 = r0
            X.6c4 r3 = r2.A03
            byte[] r7 = r2.A05
            X.9Sb r15 = r2.A00
            java.lang.Number r5 = (java.lang.Number) r5
            X.5xD r9 = r1.A04()
            r1.A05()
            int r2 = r5.intValue()
            if (r2 != 0) goto L_0x01e9
            if (r9 == 0) goto L_0x01e9
            X.6Fj r14 = r9.A02
            java.lang.String r0 = r14.A03()
            if (r0 == 0) goto L_0x01e9
            X.1Y5 r5 = r4.A0H
            X.5z2 r2 = r1.A0M
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            X.1DE r0 = r5.A00
            r0.A04(r2)
            java.lang.String r2 = r3.A0E
            X.C18740tg.A06(r2)
            r6 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r7, r6)
            java.lang.String r0 = r14.A07()
            r3.A0H = r0
            java.lang.String r0 = r14.A03()
            r3.A07 = r0
            r3.A0C = r5
            java.lang.String r0 = r14.A05()
            r3.A09 = r0
            X.005 r1 = r4.A0N
            java.lang.Object r0 = r1.get()
            X.5Ar r0 = (X.C104665Ar) r0
            boolean r0 = r0.A0L(r2)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r7 = r1.get()
            X.5Ar r7 = (X.C104665Ar) r7
            java.lang.String r17 = r14.A06()
            java.lang.String r18 = r14.A07()
            java.lang.String r19 = r14.A05()
            java.lang.String r20 = r14.A03()
            java.lang.String r11 = r3.A0D
            X.6Pj r0 = r9.A01
            X.5z9 r0 = r0.A02
            long r0 = r0.A03
            int r10 = (int) r0
            java.lang.Integer r0 = r14.A02()
            if (r0 != 0) goto L_0x0153
            r25 = 0
        L_0x008d:
            java.lang.Integer r0 = r14.A01()
            if (r0 != 0) goto L_0x0149
            r26 = 0
        L_0x0095:
            java.lang.String r8 = r3.A08
            boolean r1 = r3.A0M
            boolean r0 = r3.A0N
            r16 = r7
            r21 = r11
            r22 = r5
            r23 = r8
            r24 = r10
            r27 = r1
            r28 = r0
            r16.A0K(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x00ac:
            X.1Ar r13 = r4.A0J
            boolean r0 = r13.A03(r2)
            if (r0 == 0) goto L_0x01c9
            java.lang.String r11 = r14.A06()
            java.lang.String r12 = r14.A07()
            java.lang.String r10 = r14.A05()
            java.lang.String r8 = r14.A03()
            java.lang.String r7 = r3.A0D
            X.6Pj r0 = r9.A01
            X.5z9 r0 = r0.A02
            long r0 = r0.A03
            int r9 = (int) r0
            r18 = r9
            java.lang.Integer r0 = r14.A02()
            if (r0 != 0) goto L_0x0140
            r16 = 0
        L_0x00d7:
            java.lang.Integer r0 = r14.A01()
            if (r0 == 0) goto L_0x00e5
            java.lang.Integer r0 = r14.A01()
            int r6 = r0.intValue()
        L_0x00e5:
            java.lang.String r14 = r3.A08
            boolean r0 = r3.A0M
            r17 = r0
            X.1As r13 = r13.A05
            r9 = 0
            X.AnonymousClass00C.A0D(r11, r9)
            java.lang.String r19 = "plaintext_hash = ?"
            android.content.ContentValues r1 = X.C36441kJ.A0E()
            java.lang.String r0 = "url"
            r1.put(r0, r12)
            java.lang.String r0 = "enc_hash"
            r1.put(r0, r10)
            java.lang.String r0 = "direct_path"
            r1.put(r0, r8)
            java.lang.String r0 = "mimetype"
            r1.put(r0, r7)
            java.lang.String r0 = "media_key"
            r1.put(r0, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            java.lang.String r0 = "file_size"
            r1.put(r0, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            java.lang.String r0 = "width"
            r1.put(r0, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "height"
            r1.put(r0, r5)
            java.lang.String r0 = "emojis"
            r1.put(r0, r14)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_first_party"
            r1.put(r0, r5)
            X.005 r8 = r13.A00
            X.1M0 r7 = X.C90494aF.A0K(r8)
            goto L_0x015d
        L_0x0140:
            java.lang.Integer r0 = r14.A02()
            int r16 = r0.intValue()
            goto L_0x00d7
        L_0x0149:
            java.lang.Integer r0 = r14.A01()
            int r26 = r0.intValue()
            goto L_0x0095
        L_0x0153:
            java.lang.Integer r0 = r14.A02()
            int r25 = r0.intValue()
            goto L_0x008d
        L_0x015d:
            X.14e r6 = r7.A02     // Catch:{ all -> 0x01ad }
            java.lang.String r18 = "starred_stickers"
            r5 = 1
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x01ad }
            r0[r9] = r11     // Catch:{ all -> 0x01ad }
            java.lang.String r20 = "updateStickerAttrsByFileHash/UPDATE_STARRED_STICKERS"
            r16 = r6
            r17 = r1
            r21 = r0
            r16.A01(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ad }
            r7.close()
            X.C18740tg.A00()
            X.AnonymousClass00C.A0D(r2, r9)
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r9] = r2
            X.1M0 r6 = X.C90484aE.A0W(r8)
            X.14e r5 = r6.A02     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "SELECT timestamp FROM starred_stickers WHERE plaintext_hash = ?"
            java.lang.String r0 = "getStickerStarredTimestamp/GET_STARRED_STICKER_TIMESTAMP_BY_PLAIN_HASH "
            android.database.Cursor r5 = r5.A09(r1, r0, r7)     // Catch:{ all -> 0x01a6 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = "timestamp"
            long r0 = X.C36351kA.A07(r5, r0)     // Catch:{ all -> 0x019f }
            goto L_0x019b
        L_0x0199:
            r0 = -1
        L_0x019b:
            r5.close()     // Catch:{ all -> 0x01a6 }
            goto L_0x01b4
        L_0x019f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x01ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        L_0x01b4:
            r6.close()
            X.196 r8 = r4.A06
            if (r8 == 0) goto L_0x01c9
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01c9
            r5 = 1
            java.util.Set r0 = r8.A0A(r3, r0, r5)
            r8.A0Q(r0)
        L_0x01c9:
            X.1aY r4 = r4.A0K
            monitor-enter(r4)
            X.00v r1 = r4.A00     // Catch:{ all -> 0x01e6 }
            if (r1 != 0) goto L_0x01d9
            r0 = 60
            X.00v r1 = new X.00v     // Catch:{ all -> 0x01e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e6 }
            r4.A00 = r1     // Catch:{ all -> 0x01e6 }
        L_0x01d9:
            r1.A08(r2, r3)     // Catch:{ all -> 0x01e6 }
            monitor-exit(r4)
            X.918 r2 = X.AnonymousClass918.SUCCESS
            r1 = 1
            r0 = r29
            r15.A00(r2, r3, r0, r1)
            return
        L_0x01e6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01e9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NonMessageDataRequestManager/uploadSticker/failed to upload, error:"
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass6H7.A00(r2)
            X.C36321k7.A1Z(r1, r0)
            X.918 r3 = X.AnonymousClass918.GENERAL_ERROR
            r2 = 0
            r1 = 0
            r0 = r29
            r15.A00(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70U.accept(java.lang.Object):void");
    }
}
