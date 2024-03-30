package X;

/* renamed from: X.9cw  reason: invalid class name and case insensitive filesystem */
public final class C198119cw {
    public final C20310xM A00;
    public final AnonymousClass16J A01;
    public final C30561aP A02;
    public final C25301Ft A03;
    public final C30501aJ A04;
    public final AnonymousClass17Y A05;
    public final AnonymousClass1A1 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C117005lY r16, X.C198119cw r17, X.AnonymousClass3T1 r18, boolean r19) {
        /*
            r3 = r17
            X.1A1 r0 = r3.A06
            r4 = r18
            X.3Qa r10 = r4.A1J
            X.3T1 r6 = r0.A03(r10)
            r15 = 6
            r2 = 4
            if (r6 == 0) goto L_0x008f
            long r0 = r6.A1N     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r7 = -1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x008f
            boolean r0 = r6 instanceof X.AnonymousClass2c3     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r5 = 1
            if (r0 == 0) goto L_0x0088
            X.2c3 r6 = (X.AnonymousClass2c3) r6     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            long r0 = r6.A1O     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r4.A1O = r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.0xM r0 = r3.A00     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r15 = 5
            r0.A0n(r4, r15)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r0 = r6.A00     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r0 != r5) goto L_0x0039
            X.17Y r5 = r3.A05     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r1 = 13
            X.74j r0 = new X.74j     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r0.<init>(r3, r4, r1)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r5.A0H(r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x0039:
            if (r19 != 0) goto L_0x016c
            X.AnonymousClass00C.A07(r10)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.String r9 = r10.A01     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.1Ft r3 = r3.A03     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r4 = 0
            X.12P r0 = r3.A01     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.1M0 r6 = r0.A05()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.11F r1 = r10.A00     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0053
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessageForParentKey/chatJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0080 }
            goto L_0x007b
        L_0x0053:
            X.163 r0 = r3.A00     // Catch:{ all -> 0x0080 }
            long r7 = r0.A08(r1)     // Catch:{ all -> 0x0080 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0078
            java.lang.String r3 = "1"
        L_0x005f:
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0080 }
            r5[r4] = r9     // Catch:{ all -> 0x0080 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0080 }
            X.C36411kG.A1Q(r0, r3, r5, r1)     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "message_orphan.key_id = ? AND message_orphan.chat_row_id = ? AND message_orphan.from_me = ?"
            X.14e r3 = r6.A02     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessageForParentKey"
            r3.A03(r1, r4, r0, r5)     // Catch:{ all -> 0x0080 }
            goto L_0x007b
        L_0x0078:
            java.lang.String r3 = "0"
            goto L_0x005f
        L_0x007b:
            r6.close()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r0 = 3
            return r0
        L_0x0080:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            goto L_0x0155
        L_0x0088:
            int r1 = r6.A1I     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r0 = r4.A1I     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r1 != r0) goto L_0x016c
            return r5
        L_0x008f:
            if (r19 != 0) goto L_0x016c
            if (r16 != 0) goto L_0x0099
            java.lang.String r0 = "MessageOrderPreserver/updateMessage/orphan data callback cannot be null for non orphan use case"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            return r2
        L_0x0099:
            X.00T r0 = X.AnonymousClass6X4.A0E     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r5 = 0
            r12 = 0
            r0 = r4
            X.5Iz r0 = (X.C106265Iz) r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r0 == 0) goto L_0x013e
            X.3Kh r0 = r0.A01     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r1 = r0.A00     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.72O r1 = (X.AnonymousClass72O) r1     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r1 == 0) goto L_0x013e
            X.8QE r0 = X.AnonymousClass8QE.DEFAULT_INSTANCE     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8NN r6 = r0.A0p()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Kv r6 = (X.C171658Kv) r6     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Hz r0 = r6.A00     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8QE r0 = (X.AnonymousClass8QE) r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Ny r0 = r0.callLogMessageInfo_     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r0 != 0) goto L_0x00be
            X.8Ny r0 = X.C172468Ny.DEFAULT_INSTANCE     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x00be:
            X.8NN r8 = r0.A0q()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Ku r8 = (X.C171648Ku) r8     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            long r0 = r1.A02()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Hz r7 = X.C90524aI.A0H(r8)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Ny r7 = (X.C172468Ny) r7     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r5 = X.C172468Ny.CALL_LOG_ROW_ID_FIELD_NUMBER     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r5 = r7.bitField0_     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r5 = r5 | 1
            r7.bitField0_ = r5     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r7.callLogRowId_ = r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Hz r0 = r8.A0R()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Ny r0 = (X.C172468Ny) r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8Hz r1 = X.C90524aI.A0H(r6)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.8QE r1 = (X.AnonymousClass8QE) r1     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r0.getClass()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r1.callLogMessageInfo_ = r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r0 = r1.bitField0_     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            byte[] r0 = X.AnonymousClass8NN.A0N(r6)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.011 r0 = X.C36441kJ.A19(r12, r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.Object r1 = r0.first     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r13 = r1
            byte[] r13 = (byte[]) r13     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.Object r0 = r0.second     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r14 = r0
            byte[] r14 = (byte[]) r14     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r1 != 0) goto L_0x0114
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "MessageOrderPreserver/no data found to store"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.Integer r1 = X.C36381kD.A0m()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.1Fu r0 = new X.1Fu     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r0.<init>(r1, r12)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            goto L_0x013d
        L_0x0114:
            X.AnonymousClass00C.A07(r10)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.11F r8 = r4.A0J()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            long r0 = r4.A0I     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r16 = 1
            X.9XS r7 = new X.9XS     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r9 = r8
            r11 = r10
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.1Ft r0 = r3.A03     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            int r0 = r0.A01(r7)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            if (r0 != r2) goto L_0x0132
            r0 = 2
            return r0
        L_0x0132:
            java.lang.String r0 = "MessageOrderPreserver/handleOrphanMessage/orphan storage failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.String r0 = "MessageOrderPreserver/Failed to store orphan"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x013d:
            throw r0     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.String r0 = "CallingMessageUtil/callLog is null for fMessage key: "
            r1.append(r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.String r0 = r10.A01     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            X.1Fu r1 = new X.1Fu     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
            r1.<init>(r0, r12)     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x0155:
            throw r1     // Catch:{ 1Fu -> 0x0157, Exception -> 0x0156 }
        L_0x0156:
            return r2
        L_0x0157:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageOrderPreserver/updateMessage/Invalid fmessage.key: "
            r1.append(r0)
            java.lang.String r0 = r10.A01
            r1.append(r0)
            java.lang.String r0 = ", exception: "
            X.C36321k7.A1J(r3, r0, r1)
            return r2
        L_0x016c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198119cw.A00(X.5lY, X.9cw, X.3T1, boolean):int");
    }

    public C198119cw(AnonymousClass17Y r1, C20310xM r2, AnonymousClass16J r3, C30561aP r4, C25301Ft r5, C30501aJ r6, AnonymousClass1A1 r7) {
        C36321k7.A1B(r1, r3, r7, r5, r2);
        C36321k7.A10(r6, r4);
        this.A05 = r1;
        this.A01 = r3;
        this.A06 = r7;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
    }
}
