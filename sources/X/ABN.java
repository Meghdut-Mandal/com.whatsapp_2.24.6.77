package X;

import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Iterator;

public class ABN implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        C18740tg.A0E(r9 instanceof AnonymousClass5J8, C165567td.A0W(r9, "Unexpected message type ", AnonymousClass000.A0u()));
        AnonymousClass5J8 r92 = (AnonymousClass5J8) r9;
        int i = r92.A00;
        AnonymousClass8NE r4 = (AnonymousClass8NE) AnonymousClass8SQ.DEFAULT_INSTANCE.A0p();
        r4.A0U(AnonymousClass91G.PEER_DATA_OPERATION_REQUEST_MESSAGE);
        AnonymousClass8NN A0p = AnonymousClass8RF.DEFAULT_INSTANCE.A0p();
        if (i != -1) {
            AnonymousClass91A A00 = AnonymousClass91A.A00(i);
            AnonymousClass8RF r1 = (AnonymousClass8RF) C90524aI.A0H(A0p);
            r1.peerDataOperationRequestType_ = A00.value;
            r1.bitField0_ |= 1;
            if (i == 0) {
                Iterator it = r92.A01.iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    AnonymousClass8NN A01 = C170918Hz.A01(C172408Ns.DEFAULT_INSTANCE);
                    C172408Ns r12 = (C172408Ns) A01.A00;
                    A0C.getClass();
                    r12.bitField0_ |= 1;
                    r12.fileSha256_ = A0C;
                    AnonymousClass8RF r3 = (AnonymousClass8RF) C90524aI.A0H(A0p);
                    C170918Hz A0R = A01.A0R();
                    A0R.getClass();
                    C23122B6c b6c = r3.requestStickerReupload_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        r3.requestStickerReupload_ = b6c;
                    }
                    b6c.add(A0R);
                }
            } else if (i == 4) {
                Iterator it2 = r92.A01.iterator();
                while (it2.hasNext()) {
                    String A0C2 = AnonymousClass001.A0C(it2);
                    AnonymousClass8NN A0p2 = C172398Nr.DEFAULT_INSTANCE.A0p();
                    try {
                        AnonymousClass8SW r0 = (AnonymousClass8SW) C170918Hz.A08(AnonymousClass8SW.DEFAULT_INSTANCE, Base64.decode(A0C2, 2));
                        C172398Nr r13 = (C172398Nr) C90524aI.A0H(A0p2);
                        r0.getClass();
                        r13.messageKey_ = r0;
                        r13.bitField0_ |= 1;
                        AnonymousClass8RF r32 = (AnonymousClass8RF) C90524aI.A0H(A0p);
                        C170918Hz A0R2 = A0p2.A0R();
                        A0R2.getClass();
                        C23122B6c b6c2 = r32.placeholderMessageResendRequest_;
                        if (!((C21886AcE) b6c2).A00) {
                            b6c2 = C170918Hz.A0A(b6c2);
                            r32.placeholderMessageResendRequest_ = b6c2;
                        }
                        b6c2.add(A0R2);
                    } catch (AnonymousClass186 unused) {
                        throw C165567td.A0K(26);
                    }
                }
            }
        }
        AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(r4);
        AnonymousClass8RF r02 = (AnonymousClass8RF) A0p.A0R();
        r02.getClass();
        A0A.peerDataOperationRequestMessage_ = r02;
        A0A.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        r8.A00.A0c(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3 != 4) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r9) {
        /*
            r8 = this;
            X.91G r1 = X.AnonymousClass97T.A00(r9)
            X.91G r0 = X.AnonymousClass91G.PEER_DATA_OPERATION_REQUEST_MESSAGE
            if (r1 != r0) goto L_0x013e
            X.8SX r4 = r9.A0A
            X.8SQ r0 = r4.protocolMessage_
            if (r0 != 0) goto L_0x0010
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0010:
            X.8RF r1 = r0.peerDataOperationRequestMessage_
            if (r1 != 0) goto L_0x0016
            X.8RF r1 = X.AnonymousClass8RF.DEFAULT_INSTANCE
        L_0x0016:
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x003a
            int r0 = r1.peerDataOperationRequestType_
            X.91A r0 = X.AnonymousClass91A.A00(r0)
            if (r0 != 0) goto L_0x002a
            X.91A r0 = X.AnonymousClass91A.UPLOAD_STICKER
        L_0x002a:
            int r3 = r0.value
            r7 = 4
            r2 = 3
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L_0x0088
            if (r3 == r0) goto L_0x0086
            if (r3 == r1) goto L_0x0084
            if (r3 == r2) goto L_0x0082
            if (r3 == r7) goto L_0x003b
        L_0x003a:
            r7 = -1
        L_0x003b:
            X.3Qa r2 = r9.A0C
            long r0 = r9.A04
            X.5J8 r5 = new X.5J8
            r5.<init>(r2, r0)
            r5.A00 = r7
            X.8SQ r0 = r4.protocolMessage_
            if (r0 != 0) goto L_0x004c
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x004c:
            X.8RF r1 = r0.peerDataOperationRequestMessage_
            if (r1 != 0) goto L_0x0052
            X.8RF r1 = X.AnonymousClass8RF.DEFAULT_INSTANCE
        L_0x0052:
            java.util.HashSet r4 = X.C36441kJ.A16()
            java.lang.Integer r3 = X.C165597tg.A0d()
            if (r7 != 0) goto L_0x0098
            X.B6c r0 = r1.requestStickerReupload_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0091
            X.B6c r0 = r1.requestStickerReupload_
            java.util.Iterator r2 = r0.iterator()
        L_0x006a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r1 = r2.next()
            X.8Ns r1 = (X.C172408Ns) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r1.fileSha256_
            r4.add(r0)
            goto L_0x006a
        L_0x0082:
            r7 = 3
            goto L_0x003b
        L_0x0084:
            r7 = 2
            goto L_0x003b
        L_0x0086:
            r7 = 1
            goto L_0x003b
        L_0x0088:
            r7 = 0
            goto L_0x003b
        L_0x008a:
            java.lang.String r0 = "missing sticker fileHash"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0091:
            java.lang.String r0 = "missing sticker request msg"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0098:
            r6 = 2
            if (r7 != r6) goto L_0x00d5
            X.B6c r0 = r1.requestUrlPreview_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00ce
            X.B6c r0 = r1.requestUrlPreview_
            java.util.Iterator r2 = r0.iterator()
        L_0x00a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r1 = r2.next()
            X.8PB r1 = (X.AnonymousClass8PB) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00c7
            byte[] r0 = r1.A0o()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
            goto L_0x00a9
        L_0x00c7:
            java.lang.String r0 = "missing link preview url"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x00ce:
            java.lang.String r0 = "missing url request msg"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x00d5:
            r0 = 3
            if (r7 != r0) goto L_0x00f2
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0129
            X.8RE r0 = r1.historySyncOnDemandRequest_
            if (r0 != 0) goto L_0x00e4
            X.8RE r0 = X.AnonymousClass8RE.DEFAULT_INSTANCE
        L_0x00e4:
            byte[] r0 = r0.A0o()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
        L_0x00ef:
            r5.A01 = r4
        L_0x00f1:
            return r5
        L_0x00f2:
            r0 = 4
            if (r7 != r0) goto L_0x00f1
            X.B6c r0 = r1.placeholderMessageResendRequest_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0137
            X.B6c r0 = r1.placeholderMessageResendRequest_
            java.util.Iterator r2 = r0.iterator()
        L_0x0103:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r1 = r2.next()
            X.8Nr r1 = (X.C172398Nr) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0130
            X.8SW r0 = r1.messageKey_
            if (r0 != 0) goto L_0x011d
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x0130
        L_0x011d:
            byte[] r0 = r0.A0o()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            r4.add(r0)
            goto L_0x0103
        L_0x0129:
            java.lang.String r0 = "missing history sync on demand payload"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0130:
            java.lang.String r0 = "missing message key in placeholder resend request"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0137:
            java.lang.String r0 = "missing placeholder resend request"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x013e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABN.BlH(X.9YL):X.3T1");
    }
}
