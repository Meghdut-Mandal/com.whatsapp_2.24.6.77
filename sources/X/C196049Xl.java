package X;

/* renamed from: X.9Xl  reason: invalid class name and case insensitive filesystem */
public class C196049Xl {
    public final C20810yC A00;
    public final C202029kv A01;

    public void A03(AnonymousClass8SE r5, C46932bu r6, int i, boolean z) {
        if (i != 1 || z) {
            C65013Qj r3 = r6.A01;
            C18740tg.A06(r3);
            if ((r5.bitField0_ & 32) != 0) {
                byte[] A06 = r5.streamingSidecar_.A06();
                if (A06.length > 0) {
                    AnonymousClass6Q6 A1Y = r6.A1Y();
                    C18740tg.A06(A1Y);
                    synchronized (A1Y) {
                        A1Y.A03(A06, (int[]) null);
                    }
                }
            }
            C203359nq.A09(r3, this.A00, r5.interactiveAnnotations_, r5.annotations_);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r12 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if ((r1 & 256) != 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        r3.A0A = r14.width_;
        r3.A06 = r14.height_;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass8SE r14, X.C46932bu r15, int r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r6 = 1
            r0 = r16
            if (r0 != r6) goto L_0x001b
            if (r17 != 0) goto L_0x001b
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r14.caption_
            X.C165607th.A1G(r15, r0)
            return
        L_0x0015:
            r0 = 0
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x001b:
            X.3Qj r3 = new X.3Qj
            r3.<init>()
            r15.A01 = r3
            X.3Qa r4 = r15.A1J
            X.11F r0 = r4.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r17 != 0) goto L_0x002d
            r12 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r12 = 1
        L_0x002e:
            int r0 = r14.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0150
            X.AUx r0 = r14.mediaKey_
            byte[] r0 = r0.A06()
            X.C131806Qs.A00(r3, r15, r0)
        L_0x003d:
            int r0 = r14.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x004e
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r10
            r3.A0D = r0
        L_0x004e:
            X.AUx r0 = r14.jpegThumbnail_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x005e
            r15.A02 = r6
            r0 = r18
            r15.A1D(r1, r0)
        L_0x005e:
            java.lang.String r5 = "; message.key="
            if (r12 == 0) goto L_0x0068
            int r0 = r14.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0074
        L_0x0068:
            long r1 = r14.fileLength_
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0192
            r15.A00 = r1
            if (r12 == 0) goto L_0x007e
        L_0x0074:
            int r1 = r14.bitField0_
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0086
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0086
        L_0x007e:
            int r0 = r14.width_
            r3.A0A = r0
            int r0 = r14.height_
            r3.A06 = r0
        L_0x0086:
            r9 = 14
            java.lang.String r8 = "FMessageVideoCommon/bogus sha-256 hash received; length="
            r7 = 32
            r2 = 2
            if (r12 == 0) goto L_0x0095
            int r0 = r14.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00a4
        L_0x0095:
            X.AUx r0 = r14.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0186
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r2)
            r15.A04 = r0
        L_0x00a4:
            int r0 = r14.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00b9
            X.AUx r0 = r14.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x017a
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r2)
            r15.A03 = r0
        L_0x00b9:
            if (r12 == 0) goto L_0x00c1
            int r0 = r14.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00cd
        L_0x00c1:
            java.lang.String r0 = r14.mimetype_
            java.lang.String r0 = X.AnonymousClass1DC.A08(r0, r6)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r14.mimetype_
            r15.A05 = r0
        L_0x00cd:
            int r1 = r14.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r14.staticUrl_
        L_0x00d6:
            r15.A1e(r0)
        L_0x00d9:
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = r14.caption_
            X.C165607th.A1G(r15, r0)
        L_0x00e6:
            if (r12 == 0) goto L_0x0142
            int r0 = r14.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0142
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key="
            X.C36321k7.A1L(r4, r0, r1)
        L_0x00f7:
            int r1 = r14.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x012c
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x012c
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x012c
            X.3L1 r2 = new X.3L1
            r2.<init>()
            java.lang.String r0 = r14.thumbnailDirectPath_
            r2.A04 = r0
            X.AUx r0 = r14.thumbnailSha256_
            byte[] r1 = r0.A06()
            X.AUx r0 = r14.thumbnailEncSha256_
            X.C165587tf.A13(r0, r2, r1)
            X.AUx r0 = r14.mediaKey_
            byte[] r0 = r0.A06()
            r2.A0A = r0
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r10
            r2.A02 = r0
            r15.A12(r2)
        L_0x012c:
            int r0 = r14.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0140
            int r0 = r14.seconds_
        L_0x0134:
            r15.A0B = r0
            X.0yC r2 = r13.A00
            X.B6c r1 = r14.interactiveAnnotations_
            X.B6c r0 = r14.annotations_
            X.C203359nq.A09(r3, r2, r1, r0)
            return
        L_0x0140:
            r0 = 0
            goto L_0x0134
        L_0x0142:
            java.lang.String r0 = r14.directPath_
            r3.A0J = r0
            goto L_0x00f7
        L_0x0147:
            if (r12 == 0) goto L_0x014d
            r0 = r1 & 1
            if (r0 == 0) goto L_0x00d9
        L_0x014d:
            java.lang.String r0 = r14.url_
            goto L_0x00d6
        L_0x0150:
            if (r12 != 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/missing media key; message.key="
            X.C36321k7.A1L(r4, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0162:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r14.mimetype_
            r1.append(r0)
            X.C36321k7.A1L(r4, r5, r1)
            r0 = 17
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x017a:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C36321k7.A1L(r4, r5, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        L_0x0186:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C36321k7.A1L(r4, r5, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        L_0x0192:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/bogus media size received; file_length="
            r3.append(r0)
            r3.append(r1)
            X.C36321k7.A1L(r4, r5, r3)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196049Xl.A04(X.8SE, X.2bu, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.C64933Qa.A04(r14) != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d3, code lost:
        if (r14.A0B > 0) goto L_0x01d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8NH A01(X.AnonymousClass8NH r12, X.C80103un r13, X.C46932bu r14, byte[] r15, boolean r16, boolean r17, boolean r18) {
        /*
            r11 = this;
            X.3Qj r2 = r14.A01
            X.3Kz r10 = r14.A0V()
            r7 = 0
            if (r16 != 0) goto L_0x0010
            boolean r0 = X.C64933Qa.A04(r14)
            r9 = 0
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r9 = 1
        L_0x0011:
            r8 = 16
            r3 = 4465(0x1171, float:6.257E-42)
            if (r2 == 0) goto L_0x035a
            if (r9 != 0) goto L_0x001d
            byte[] r0 = r2.A0a
            if (r0 == 0) goto L_0x035a
        L_0x001d:
            byte[] r0 = r2.A0a
            r6 = 32
            java.lang.String r4 = "; message.key="
            if (r0 == 0) goto L_0x0046
            int r5 = r0.length
            if (r5 == r6) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r5)
            X.C165567td.A19(r14, r4, r1)
            if (r18 == 0) goto L_0x0046
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x0046
            X.1Fu r0 = X.C165567td.A0K(r8)
            throw r0
        L_0x0046:
            java.lang.String r5 = r14.A07
            boolean r0 = X.AnonymousClass2bU.A03(r5)
            if (r0 == 0) goto L_0x008e
            X.8SE r8 = X.AnonymousClass8NN.A0C(r12)
            r5.getClass()
            int r1 = r8.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r8.bitField0_ = r1
            r8.staticUrl_ = r5
        L_0x005e:
            boolean r0 = X.AnonymousClass2bU.A03(r5)
            if (r0 != 0) goto L_0x0066
            if (r9 != 0) goto L_0x00bb
        L_0x0066:
            X.3Qa r8 = r14.A1J
            boolean r0 = X.C203359nq.A0D(r8, r5)
            if (r0 != 0) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r5)
            X.C36321k7.A1L(r8, r4, r1)
            if (r18 == 0) goto L_0x00bb
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x00bb
            r0 = 15
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x008e:
            if (r9 == 0) goto L_0x0098
            java.lang.String r0 = r14.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005e
        L_0x0098:
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            r5.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r5
            if (r9 != 0) goto L_0x005e
            java.lang.String r0 = r14.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with url not set; message.key="
            X.C165567td.A19(r14, r0, r1)
            goto L_0x005e
        L_0x00bb:
            java.lang.String r5 = r14.A05
            if (r16 == 0) goto L_0x00c5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0109
        L_0x00c5:
            if (r9 != 0) goto L_0x00fa
            X.C18740tg.A06(r5)
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fa
            if (r18 == 0) goto L_0x00fa
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x00fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            r1.append(r5)
            X.C165567td.A19(r14, r4, r1)
            r0 = 17
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x00fa:
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            r5.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r5
        L_0x0109:
            r8 = 14
            if (r16 == 0) goto L_0x0115
            java.lang.String r0 = r14.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014f
        L_0x0115:
            java.lang.String r0 = r14.A04
            byte[] r1 = android.util.Base64.decode(r0, r7)
            if (r9 != 0) goto L_0x013e
            int r5 = r1.length
            if (r5 == r6) goto L_0x013e
            if (r18 == 0) goto L_0x013e
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x013e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r5)
            X.C165567td.A19(r14, r4, r1)
            X.1Fu r0 = X.C165567td.A0K(r8)
            throw r0
        L_0x013e:
            int r0 = r1.length
            X.8I5 r5 = X.C21674AUx.A01(r1, r7, r0)
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r5
        L_0x014f:
            java.lang.String r0 = r14.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0191
            java.lang.String r0 = r14.A03
            byte[] r1 = android.util.Base64.decode(r0, r7)
            if (r9 != 0) goto L_0x0180
            int r5 = r1.length
            if (r5 == r6) goto L_0x0180
            if (r18 == 0) goto L_0x0180
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x0180
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/bogus enc sha-256 hash; length="
            r1.append(r0)
            r1.append(r5)
            X.C165567td.A19(r14, r4, r1)
            X.1Fu r0 = X.C165567td.A0K(r8)
            throw r0
        L_0x0180:
            int r0 = r1.length
            X.8I5 r5 = X.C21674AUx.A01(r1, r7, r0)
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r5
        L_0x0191:
            r7 = 0
            if (r16 == 0) goto L_0x019b
            long r0 = r14.A00
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d1
        L_0x019b:
            long r0 = r14.A00
            X.8SE r6 = X.AnonymousClass8NN.A0C(r12)
            int r5 = r6.bitField0_
            r5 = r5 | 8
            r6.bitField0_ = r5
            r6.fileLength_ = r0
            if (r16 != 0) goto L_0x01d1
            long r0 = r14.A00
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x01d5
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size="
            r6.append(r5)
            r6.append(r0)
            X.C165567td.A19(r14, r4, r6)
            if (r18 == 0) goto L_0x01d5
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x01d5
            r0 = 13
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x01d1:
            int r0 = r14.A0B
            if (r0 <= 0) goto L_0x01e3
        L_0x01d5:
            int r3 = r14.A0B
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r3
        L_0x01e3:
            java.lang.String r3 = r14.A1a()
            if (r3 == 0) goto L_0x01f5
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r3
        L_0x01f5:
            if (r9 == 0) goto L_0x01fb
            byte[] r0 = r2.A0a
            if (r0 == 0) goto L_0x020f
        L_0x01fb:
            byte[] r0 = r2.A0a
            X.8I5 r3 = X.C90474aD.A0O(r12, r0)
            X.8Hz r1 = r12.A00
            X.8SE r1 = (X.AnonymousClass8SE) r1
            int r0 = X.AnonymousClass8SE.ANNOTATIONS_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.mediaKey_ = r3
        L_0x020f:
            long r0 = r2.A0D
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0225
            long r0 = X.C36391kE.A0B(r0)
            X.8SE r4 = X.AnonymousClass8NN.A0C(r12)
            int r3 = r4.bitField0_
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r4.bitField0_ = r3
            r4.mediaKeyTimestamp_ = r0
        L_0x0225:
            X.3L1 r6 = r14.A0a
            if (r6 == 0) goto L_0x0357
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x0357
            java.lang.String r0 = r6.A08
            if (r0 == 0) goto L_0x0357
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x0357
            byte[] r1 = r6.A0A
            byte[] r0 = r2.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0357
            long r3 = r6.A02
            long r0 = r2.A0D
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0357
            boolean r5 = r6.A0C
            java.lang.String r4 = r6.A04
            X.8SE r3 = X.AnonymousClass8NN.A0C(r12)
            r4.getClass()
            int r1 = r3.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.thumbnailDirectPath_ = r4
            java.lang.String r0 = r6.A08
            X.8I5 r4 = X.AnonymousClass8NN.A02(r12, r0)
            X.8Hz r3 = r12.A00
            X.8SE r3 = (X.AnonymousClass8SE) r3
            int r1 = r3.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.thumbnailSha256_ = r4
            java.lang.String r0 = r6.A05
            X.8I5 r4 = X.AnonymousClass8NN.A02(r12, r0)
            X.8Hz r3 = r12.A00
            X.8SE r3 = (X.AnonymousClass8SE) r3
            int r1 = r3.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.thumbnailEncSha256_ = r4
        L_0x0281:
            r4 = r17
            if (r17 != 0) goto L_0x034c
            byte[] r0 = r10.A02()
            if (r0 == 0) goto L_0x034c
            if (r5 == 0) goto L_0x034c
            byte[] r0 = r10.A02()
            X.8I5 r3 = X.C90474aD.A0O(r12, r0)
            X.8Hz r1 = r12.A00
            X.8SE r1 = (X.AnonymousClass8SE) r1
            int r0 = X.AnonymousClass8SE.ANNOTATIONS_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r3
        L_0x02a3:
            boolean r0 = X.C202029kv.A02(r13, r14, r15)
            if (r0 == 0) goto L_0x02be
            X.9kv r0 = r11.A01
            X.8SG r0 = r0.A03(r13, r14, r15, r4)
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x02be:
            int r3 = r2.A06
            if (r3 <= 0) goto L_0x02e2
            int r0 = r2.A0A
            if (r0 <= 0) goto L_0x02e2
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.height_ = r3
            int r3 = r2.A0A
            X.8Hz r1 = X.C90524aI.A0H(r12)
            X.8SE r1 = (X.AnonymousClass8SE) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.width_ = r3
        L_0x02e2:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0336
            java.lang.String r3 = r2.A0J
            X.8SE r1 = X.AnonymousClass8NN.A0C(r12)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.directPath_ = r3
        L_0x02fb:
            X.0yC r5 = r11.A00
            r0 = 1
            java.util.ArrayList r4 = X.C203359nq.A07(r2, r5, r0)
            X.8SE r3 = X.AnonymousClass8NN.A0C(r12)
            X.B6c r1 = r3.interactiveAnnotations_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0315
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r3.interactiveAnnotations_ = r1
        L_0x0315:
            X.C21071A7i.A0O(r4, r1)
            r0 = 0
            java.util.ArrayList r3 = X.C203359nq.A07(r2, r5, r0)
            X.8Hz r2 = X.C90524aI.A0H(r12)
            X.8SE r2 = (X.AnonymousClass8SE) r2
            X.B6c r1 = r2.annotations_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0332
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.annotations_ = r1
        L_0x0332:
            X.C21071A7i.A0O(r3, r1)
            return r12
        L_0x0336:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/message without direct path received; message.key="
            X.C165577te.A1F(r14, r0, r1)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r14.A0J()
            X.C36351kA.A1L(r0, r1)
            goto L_0x02fb
        L_0x034c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key="
            X.C165567td.A19(r14, r0, r1)
            goto L_0x02a3
        L_0x0357:
            r5 = 1
            goto L_0x0281
        L_0x035a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key="
            X.C165577te.A1F(r14, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.C165567td.A1A(r14, r0, r1)
            if (r18 == 0) goto L_0x0377
            X.0yC r0 = r11.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x0377
            X.1Fu r0 = X.C165567td.A0K(r8)
            throw r0
        L_0x0377:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196049Xl.A01(X.8NH, X.3un, X.2bu, byte[], boolean, boolean, boolean):X.8NH");
    }

    public C196049Xl(C20810yC r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static void A00(AnonymousClass9YL r8, AnonymousClass8SE r9, C46932bu r10, C196049Xl r11) {
        AnonymousClass8SE r3 = r9;
        C46932bu r4 = r10;
        C196049Xl r2 = r11;
        r2.A04(r3, r4, r8.A01, r8.A03(), r8.A0O);
        r11.A03(r9, r10, r8.A01, r8.A0N);
    }

    public void A02(C196159Xy r9, AnonymousClass8NH r10, C46932bu r11) {
        boolean A02 = r9.A02();
        AnonymousClass8NH A012 = A01(r10, r9.A02, r11, r9.A0B, A02, r9.A04, r9.A03);
        C65013Qj r1 = r11.A01;
        boolean A04 = C64933Qa.A04(r11);
        if (r1 == null || A012 == null || (!A04 && !A02 && r1.A0a == null)) {
            C165567td.A1A(r11, "FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=", AnonymousClass000.A0u());
            return;
        }
        AnonymousClass6Q6 A1Y = r11.A1Y();
        C18740tg.A06(A1Y);
        byte[] A05 = A1Y.A05();
        if (A05 != null) {
            AnonymousClass8I5 A0O = C165607th.A0O(A05);
            AnonymousClass8SE A0C = AnonymousClass8NN.A0C(A012);
            A0C.bitField0_ |= 32768;
            A0C.streamingSidecar_ = A0O;
        }
    }
}
