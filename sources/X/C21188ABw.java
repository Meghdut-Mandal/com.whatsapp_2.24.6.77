package X;

/* renamed from: X.ABw  reason: case insensitive filesystem */
public abstract class C21188ABw implements C22938Ayo, C22942Ays, C17740rx {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B24(X.C196159Xy r9, X.AnonymousClass3T1 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C181008mm
            if (r0 == 0) goto L_0x01a3
            X.8mm r10 = (X.C181008mm) r10
            java.lang.String r2 = r10.A00
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
            X.8NN r5 = r0.A0p()
            X.8NE r5 = (X.AnonymousClass8NE) r5
            X.91G r0 = X.AnonymousClass91G.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE
            r5.A0U(r0)
            X.8Q7 r0 = X.AnonymousClass8Q7.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            X.8Ms r4 = (X.C172148Ms) r4
            boolean r0 = r10 instanceof X.AnonymousClass8Y0
            if (r0 == 0) goto L_0x00c8
            r1 = 0
        L_0x0022:
            X.91A r0 = X.AnonymousClass91A.A00(r1)
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8Q7 r1 = (X.AnonymousClass8Q7) r1
            int r0 = r0.value
            r1.peerDataOperationRequestType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x0036:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004d
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8Q7 r1 = (X.AnonymousClass8Q7) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.stanzaId_ = r2
        L_0x004d:
            boolean r0 = r8 instanceof X.AnonymousClass8Y4
            if (r0 == 0) goto L_0x00d6
            X.8Y0 r10 = (X.AnonymousClass8Y0) r10
            java.util.Map r0 = r10.A00
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)
        L_0x0059:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0188
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r7)
            X.8Qi r0 = X.C173088Qi.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            X.8Mt r6 = (X.C172158Mt) r6
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.918 r0 = (X.AnonymousClass918) r0
            r6.A0U(r0)
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.8SA r0 = (X.AnonymousClass8SA) r0
            if (r0 == 0) goto L_0x0096
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8Qi r1 = (X.C173088Qi) r1
        L_0x008a:
            r1.stickerMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r4.A0U(r6)
            goto L_0x0059
        L_0x0096:
            X.8SA r0 = X.AnonymousClass8SA.DEFAULT_INSTANCE
            X.8NN r3 = r0.A0p()
            X.8N5 r3 = (X.AnonymousClass8N5) r3
            java.lang.String r0 = X.C90494aF.A0f(r1)
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.8I5 r2 = X.C21674AUx.A01(r1, r2, r0)
            X.8SA r1 = X.AnonymousClass8NN.A0B(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.fileSha256_ = r2
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8Qi r1 = (X.C173088Qi) r1
            X.8Hz r0 = r3.A0R()
            X.8SA r0 = (X.AnonymousClass8SA) r0
            r0.getClass()
            goto L_0x008a
        L_0x00c8:
            boolean r0 = r10 instanceof X.C174648Xx
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10 instanceof X.C174658Xy
            if (r0 == 0) goto L_0x00d3
            r1 = 4
            goto L_0x0022
        L_0x00d3:
            r1 = 2
            goto L_0x0022
        L_0x00d6:
            boolean r0 = r8 instanceof X.AnonymousClass8Y3
            if (r0 != 0) goto L_0x0188
            boolean r0 = r8 instanceof X.AnonymousClass8Y2
            if (r0 == 0) goto L_0x0118
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = r10 instanceof X.C174658Xy
            if (r0 == 0) goto L_0x0188
            X.8Xy r10 = (X.C174658Xy) r10
            if (r10 == 0) goto L_0x0188
            java.util.List r0 = r10.A00
            if (r0 == 0) goto L_0x0188
            java.util.Iterator r6 = r0.iterator()
        L_0x00f2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r3 = r6.next()
            X.8Hz r2 = X.C90524aI.A0H(r4)
            X.8Q7 r2 = (X.AnonymousClass8Q7) r2
            r3.getClass()
            X.B6c r1 = r2.peerDataOperationResult_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0114
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.peerDataOperationResult_ = r1
        L_0x0114:
            r1.add(r3)
            goto L_0x00f2
        L_0x0118:
            X.8Xz r10 = (X.C174668Xz) r10
            java.util.Map r0 = r10.A00
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)
        L_0x0120:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0188
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r7)
            X.8Qi r0 = X.C173088Qi.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            X.8Mt r6 = (X.C172158Mt) r6
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.918 r0 = (X.AnonymousClass918) r0
            r6.A0U(r0)
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.8Rh r0 = (X.C173338Rh) r0
            if (r0 == 0) goto L_0x015d
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8Qi r1 = (X.C173088Qi) r1
        L_0x0151:
            r1.linkPreviewResponse_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r4.A0U(r6)
            goto L_0x0120
        L_0x015d:
            X.8Rh r0 = X.C173338Rh.DEFAULT_INSTANCE
            X.8NN r3 = r0.A0p()
            java.lang.String r2 = X.C90494aF.A0f(r1)
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Rh r1 = (X.C173338Rh) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8Qi r1 = (X.C173088Qi) r1
            X.8Hz r0 = r3.A0R()
            X.8Rh r0 = (X.C173338Rh) r0
            r0.getClass()
            goto L_0x0151
        L_0x0188:
            X.8SQ r1 = X.AnonymousClass8NN.A0A(r5)
            X.8Hz r0 = r4.A0R()
            X.8Q7 r0 = (X.AnonymousClass8Q7) r0
            r0.getClass()
            r1.peerDataOperationRequestResponseMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            X.8NL r0 = r9.A00
            r0.A0c(r5)
            return
        L_0x01a3:
            java.lang.String r0 = "FMessagePeerDataOperationRequestResponseSerializer can't handle message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21188ABw.B24(X.9Xy, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r4 != 4) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass9YL r4) {
        /*
            X.91G r1 = X.AnonymousClass97T.A00(r4)
            X.91G r0 = X.AnonymousClass91G.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE
            if (r1 != r0) goto L_0x0048
            X.8SQ r0 = X.C170918Hz.A0L(r4)
            X.8Q7 r1 = r0.peerDataOperationRequestResponseMessage_
            if (r1 != 0) goto L_0x0012
            X.8Q7 r1 = X.AnonymousClass8Q7.DEFAULT_INSTANCE
        L_0x0012:
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0036
            int r0 = r1.peerDataOperationRequestType_
            X.91A r0 = X.AnonymousClass91A.A00(r0)
            if (r0 != 0) goto L_0x0026
            X.91A r0 = X.AnonymousClass91A.UPLOAD_STICKER
        L_0x0026:
            int r4 = r0.value
            r3 = 4
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L_0x0046
            if (r4 == r0) goto L_0x0044
            if (r4 == r1) goto L_0x0042
            if (r4 == r2) goto L_0x0040
            if (r4 == r3) goto L_0x0037
        L_0x0036:
            r3 = -1
        L_0x0037:
            java.util.Set r0 = X.AnonymousClass99Y.A00
            boolean r0 = X.AnonymousClass000.A1Z(r0, r3)
            if (r0 == 0) goto L_0x0048
            return r3
        L_0x0040:
            r3 = 3
            goto L_0x0037
        L_0x0042:
            r3 = 2
            goto L_0x0037
        L_0x0044:
            r3 = 1
            goto L_0x0037
        L_0x0046:
            r3 = 0
            goto L_0x0037
        L_0x0048:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21188ABw.A00(X.9YL):int");
    }

    public static String A01(AnonymousClass9YL r1) {
        AnonymousClass8Q7 r12 = C170918Hz.A0L(r1).peerDataOperationRequestResponseMessage_;
        if (r12 == null) {
            r12 = AnonymousClass8Q7.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 2) != 0) {
            return r12.stanzaId_;
        }
        return null;
    }
}
