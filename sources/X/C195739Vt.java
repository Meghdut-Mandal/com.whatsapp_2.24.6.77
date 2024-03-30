package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9Vt  reason: invalid class name and case insensitive filesystem */
public class C195739Vt {
    public final C20810yC A00;
    public final C202029kv A01;

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e4, code lost:
        if (r12 != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020c, code lost:
        if ((r1 & 32) != 0) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020e, code lost:
        r2.A0A = r14.width_;
        r2.A06 = r14.height_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0224, code lost:
        if (r12 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass8SF r14, X.C46922bt r15, int r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r5 = 1
            r0 = r16
            if (r0 != r5) goto L_0x001b
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
            X.3Qj r2 = new X.3Qj
            r2.<init>()
            r15.A01 = r2
            X.3Qa r4 = r15.A1J
            X.11F r0 = r4.A00
            boolean r3 = r0 instanceof X.C28981Uw
            r8 = 0
            if (r17 != 0) goto L_0x002e
            r12 = 0
            if (r3 == 0) goto L_0x002f
        L_0x002e:
            r12 = 1
        L_0x002f:
            int r0 = r14.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0146
            X.AUx r0 = r14.mediaKey_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0041
            X.C131806Qs.A00(r2, r15, r1)
        L_0x0041:
            int r7 = r14.bitField0_
            r0 = r7 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0052
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r9
            r2.A0D = r0
        L_0x0052:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r7
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6 = 2
            if (r0 == 0) goto L_0x008a
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r7
            if (r0 == 0) goto L_0x008a
            r0 = 2097152(0x200000, float:2.938736E-39)
            r7 = r7 & r0
            if (r7 == 0) goto L_0x008a
            X.3L1 r7 = new X.3L1
            r7.<init>()
            java.lang.String r0 = r14.thumbnailDirectPath_
            r7.A04 = r0
            X.AUx r0 = r14.thumbnailSha256_
            byte[] r1 = r0.A06()
            X.AUx r0 = r14.thumbnailEncSha256_
            X.C165587tf.A13(r0, r7, r1)
            X.AUx r0 = r14.mediaKey_
            byte[] r0 = r0.A06()
            r7.A0A = r0
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r9
            r7.A02 = r0
            r15.A12(r7)
        L_0x008a:
            X.B62 r0 = r14.scanLengths_
            int r9 = r0.size()
            int r1 = r14.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r7 = 32
            if (r0 == 0) goto L_0x010a
            if (r9 <= 0) goto L_0x010a
            X.AUx r0 = r14.scansSidecar_
            byte[] r1 = r0.A06()
            int[] r11 = new int[r9]
            r10 = 0
        L_0x00a8:
            X.B62 r0 = r14.scanLengths_
            X.8I0 r0 = (X.AnonymousClass8I0) r0
            X.AnonymousClass8I0.A00(r0, r10)
            int[] r0 = r0.A01
            int r10 = X.C165607th.A0E(r0, r11, r10)
            if (r10 < r9) goto L_0x00a8
            if (r9 < r6) goto L_0x010a
            int r0 = r1.length
            int r0 = r0 / 10
            if (r0 != r9) goto L_0x010a
            X.6Q6 r0 = r15.A1Y()
            X.C18740tg.A06(r0)
            r0.A03(r1, r11)
            int r1 = r14.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00de
            X.AUx r0 = r14.midQualityFileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x00de
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r2.A0O = r0
        L_0x00de:
            int r1 = r14.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f4
            X.AUx r0 = r14.midQualityFileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x00f4
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r2.A0N = r0
        L_0x00f4:
            r10 = 10
            byte[] r9 = new byte[r10]
            X.AUx r1 = r14.scansSidecar_
            int r0 = r1.A02()
            X.C21674AUx.A00(r8, r10, r0)
            r1.A05(r9, r10)
            r2.A0X = r9
            r0 = r11[r8]
            r2.A04 = r0
        L_0x010a:
            X.AUx r0 = r14.jpegThumbnail_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            r8 = r18
            if (r0 > 0) goto L_0x0117
            if (r18 == 0) goto L_0x011c
        L_0x0117:
            r15.A02 = r5
            r15.A1D(r1, r8)
        L_0x011c:
            java.lang.String r5 = "; message.key="
            if (r12 == 0) goto L_0x0126
            int r0 = r14.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x015e
        L_0x0126:
            long r0 = r14.fileLength_
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0158
            if (r3 != 0) goto L_0x0158
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "FMessageImageCommon/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C36321k7.A1L(r4, r5, r3)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0146:
            if (r12 != 0) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/missing media key; message.key="
            X.C36321k7.A1L(r4, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0158:
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x015e
            r15.A00 = r0
        L_0x015e:
            r9 = 14
            java.lang.String r8 = "FMessageImageCommon/bogus sha-256 hash received; length="
            if (r12 == 0) goto L_0x016a
            int r0 = r14.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0179
        L_0x016a:
            X.AUx r0 = r14.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0233
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A04 = r0
        L_0x0179:
            int r0 = r14.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018e
            X.AUx r0 = r14.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0227
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A03 = r0
        L_0x018e:
            if (r3 != 0) goto L_0x019c
            int r1 = r14.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = r14.staticUrl_
        L_0x0199:
            r15.A1e(r0)
        L_0x019c:
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = r14.caption_
            X.C165607th.A1G(r15, r0)
        L_0x01a9:
            if (r12 == 0) goto L_0x01b1
            int r0 = r14.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01e6
        L_0x01b1:
            java.lang.String r3 = r14.mimetype_
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x01e2
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x01e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r3)
            X.C36321k7.A1L(r4, r5, r1)
            r0 = 17
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x01d9:
            if (r17 == 0) goto L_0x01df
            r0 = r1 & 1
            if (r0 == 0) goto L_0x019c
        L_0x01df:
            java.lang.String r0 = r14.url_
            goto L_0x0199
        L_0x01e2:
            r15.A05 = r3
            if (r12 == 0) goto L_0x0220
        L_0x01e6:
            int r0 = r14.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0220
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/message without direct path received; message.key="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r15.A0J()
            X.C36351kA.A1L(r0, r1)
        L_0x0204:
            int r1 = r14.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0216
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0216
        L_0x020e:
            int r0 = r14.width_
            r2.A0A = r0
            int r0 = r14.height_
            r2.A06 = r0
        L_0x0216:
            X.0yC r3 = r13.A00
            X.B6c r1 = r14.interactiveAnnotations_
            X.B6c r0 = r14.annotations_
            X.C203359nq.A09(r2, r3, r1, r0)
            return
        L_0x0220:
            java.lang.String r0 = r14.directPath_
            r2.A0J = r0
            if (r12 == 0) goto L_0x020e
            goto L_0x0204
        L_0x0227:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C36321k7.A1L(r4, r5, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        L_0x0233:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C36321k7.A1L(r4, r5, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195739Vt.A02(X.8SF, X.2bt, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r11 != false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0357  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8NJ A00(X.C196159Xy r21, X.AnonymousClass8NJ r22, X.C46922bt r23) {
        /*
            r20 = this;
            r7 = r21
            boolean r19 = r7.A02()
            r8 = r23
            X.3Qj r5 = r8.A01
            X.3Kz r18 = r8.A0V()
            X.3Qa r4 = r8.A1J
            X.11F r0 = r4.A00
            boolean r11 = r0 instanceof X.C28981Uw
            r3 = 0
            if (r19 != 0) goto L_0x001a
            r13 = 0
            if (r11 == 0) goto L_0x001b
        L_0x001a:
            r13 = 1
        L_0x001b:
            r17 = 16
            r9 = 4465(0x1171, float:6.257E-42)
            r2 = r20
            if (r5 == 0) goto L_0x0379
            if (r13 != 0) goto L_0x0029
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x0379
        L_0x0029:
            java.lang.String r12 = r8.A07
            boolean r0 = X.AnonymousClass2bU.A03(r12)
            r6 = r22
            if (r0 == 0) goto L_0x0075
            X.8SF r10 = X.AnonymousClass8NN.A09(r6)
            r12.getClass()
            int r1 = r10.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r10.bitField0_ = r1
            r10.staticUrl_ = r12
        L_0x0043:
            boolean r0 = X.AnonymousClass2bU.A03(r12)
            java.lang.String r10 = "; message.key="
            if (r0 != 0) goto L_0x004d
            if (r13 != 0) goto L_0x008d
        L_0x004d:
            boolean r0 = X.C203359nq.A0D(r4, r12)
            if (r0 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r12)
            X.C36321k7.A1L(r4, r10, r1)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x008d
            X.0yC r0 = r2.A00
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x008d
            r0 = 15
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x0075:
            if (r13 == 0) goto L_0x007d
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0043
        L_0x007d:
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            r12.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r12
            goto L_0x0043
        L_0x008d:
            java.lang.String r12 = r8.A05
            java.lang.String r13 = "image/jpeg"
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            if (r12 == 0) goto L_0x00c3
            r1.mimetype_ = r12
            boolean r0 = r13.equalsIgnoreCase(r12)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 != 0) goto L_0x00c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r12)
            X.C36321k7.A1L(r4, r10, r1)
            r0 = 17
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x00c3:
            r1.mimetype_ = r13
        L_0x00c5:
            java.lang.String r12 = r8.A1a()
            if (r12 == 0) goto L_0x00d7
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.caption_ = r12
        L_0x00d7:
            r15 = 14
            r14 = 32
            if (r19 == 0) goto L_0x00e5
            java.lang.String r0 = r8.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0112
        L_0x00e5:
            java.lang.String r0 = r8.A04
            byte[] r0 = android.util.Base64.decode(r0, r3)
            int r12 = r0.length
            X.8I5 r13 = X.C21674AUx.A01(r0, r3, r12)
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r13
            if (r12 == r14) goto L_0x0112
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r12)
            X.C36321k7.A1L(r4, r10, r1)
            X.1Fu r0 = X.C165567td.A0K(r15)
            throw r0
        L_0x0112:
            java.lang.String r0 = r8.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = r8.A03
            byte[] r0 = android.util.Base64.decode(r0, r3)
            int r12 = r0.length
            X.8I5 r13 = X.C21674AUx.A01(r0, r3, r12)
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r13
            if (r12 == r14) goto L_0x0147
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r12)
            X.C36321k7.A1L(r4, r10, r1)
            X.1Fu r0 = X.C165567td.A0K(r15)
            throw r0
        L_0x0147:
            r16 = 13
            r14 = 0
            if (r19 == 0) goto L_0x0173
            long r0 = r8.A00
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x0173
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r12 = "FMessageImageCommon/buildE2eMessage/image media size not set, size="
            r13.append(r12)
            r13.append(r0)
            X.C36321k7.A1L(r4, r10, r13)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x01a9
            X.0yC r0 = r2.A00
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x01a9
            X.1Fu r0 = X.C165567td.A0K(r16)
            throw r0
        L_0x0173:
            long r0 = r8.A00
            X.8SF r13 = X.AnonymousClass8NN.A09(r6)
            int r12 = r13.bitField0_
            r12 = r12 | 16
            r13.bitField0_ = r12
            r13.fileLength_ = r0
            if (r19 != 0) goto L_0x01a9
            long r0 = r8.A00
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x01a9
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r12 = "FMessageImageCommon/buildE2eMessage/sending image with media size not set, size="
            r13.append(r12)
            r13.append(r0)
            X.C36321k7.A1L(r4, r10, r13)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x01a9
            X.0yC r0 = r2.A00
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x01a9
            X.1Fu r0 = X.C165567td.A0K(r16)
            throw r0
        L_0x01a9:
            if (r11 != 0) goto L_0x01ed
            if (r19 == 0) goto L_0x01b1
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x01ed
        L_0x01b1:
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x01da
            int r11 = r0.length
            r0 = 32
            if (r11 == r0) goto L_0x01da
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r11)
            X.C36321k7.A1L(r4, r10, r1)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x01da
            X.0yC r0 = r2.A00
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x01da
            X.1Fu r0 = X.C165567td.A0K(r17)
            throw r0
        L_0x01da:
            byte[] r1 = r5.A0a
            int r0 = r1.length
            X.8I5 r9 = X.C21674AUx.A01(r1, r3, r0)
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.mediaKey_ = r9
        L_0x01ed:
            long r0 = r5.A0D
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0203
            long r0 = X.C36391kE.A0B(r0)
            X.8SF r10 = X.AnonymousClass8NN.A09(r6)
            int r9 = r10.bitField0_
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r10.bitField0_ = r9
            r10.mediaKeyTimestamp_ = r0
        L_0x0203:
            int r9 = r5.A06
            if (r9 <= 0) goto L_0x0227
            int r0 = r5.A0A
            if (r0 <= 0) goto L_0x0227
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.height_ = r9
            int r9 = r5.A0A
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8SF r1 = (X.AnonymousClass8SF) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.width_ = r9
        L_0x0227:
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x036e
            java.lang.String r9 = r5.A0J
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            r9.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r9
        L_0x0240:
            X.6Q6 r14 = r8.A1Y()
            if (r14 == 0) goto L_0x036b
            byte[] r9 = r14.A05()
            int[] r13 = r14.A06()
            if (r13 == 0) goto L_0x036b
            if (r9 == 0) goto L_0x036b
            int r12 = r13.length
            r0 = 2
            if (r12 < r0) goto L_0x036b
            int r1 = r9.length
            int r0 = r1 / 10
            if (r0 != r12) goto L_0x036b
            X.8I5 r10 = X.C21674AUx.A01(r9, r3, r1)
            X.8SF r9 = X.AnonymousClass8NN.A09(r6)
            int r1 = r9.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r9.bitField0_ = r1
            r9.scansSidecar_ = r10
            r11 = 0
        L_0x026d:
            r10 = r13[r11]
            X.8Hz r9 = X.C90524aI.A0H(r6)
            X.8SF r9 = (X.AnonymousClass8SF) r9
            X.B62 r1 = r9.scanLengths_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0284
            X.8I0 r1 = X.C170918Hz.A09(r1)
            r9.scanLengths_ = r1
        L_0x0284:
            r1.B0O(r10)
            int r11 = r11 + 1
            if (r11 < r12) goto L_0x026d
            boolean r0 = r14.A05
            r10 = r0 ^ 1
            java.lang.String r0 = r5.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = r5.A0O
            X.8I5 r11 = X.AnonymousClass8NN.A02(r6, r0)
            X.8Hz r9 = r6.A00
            X.8SF r9 = (X.AnonymousClass8SF) r9
            int r1 = r9.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r9.bitField0_ = r1
            r9.midQualityFileSha256_ = r11
        L_0x02aa:
            X.3L1 r11 = r8.A0a
            if (r11 == 0) goto L_0x0306
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0306
            java.lang.String r0 = r11.A08
            if (r0 == 0) goto L_0x0306
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x0306
            byte[] r1 = r11.A0A
            byte[] r0 = r5.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0306
            long r8 = r11.A02
            long r0 = r5.A0D
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0306
            boolean r10 = r11.A0C
            java.lang.String r9 = r11.A04
            X.8SF r8 = X.AnonymousClass8NN.A09(r6)
            r9.getClass()
            int r1 = r8.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r8.bitField0_ = r1
            r8.thumbnailDirectPath_ = r9
            java.lang.String r0 = r11.A08
            X.8I5 r9 = X.AnonymousClass8NN.A02(r6, r0)
            X.8Hz r8 = r6.A00
            X.8SF r8 = (X.AnonymousClass8SF) r8
            int r1 = r8.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r8.bitField0_ = r1
            r8.thumbnailSha256_ = r9
            java.lang.String r0 = r11.A05
            X.8I5 r9 = X.AnonymousClass8NN.A02(r6, r0)
            X.8Hz r8 = r6.A00
            X.8SF r8 = (X.AnonymousClass8SF) r8
            int r1 = r8.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r8.bitField0_ = r1
            r8.thumbnailEncSha256_ = r9
        L_0x0306:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x0361
            byte[] r0 = r18.A02()
            if (r0 == 0) goto L_0x0361
            if (r10 == 0) goto L_0x0361
            byte[] r1 = r18.A02()
            int r0 = r1.length
            X.8I5 r4 = X.C21674AUx.A01(r1, r3, r0)
            X.8SF r1 = X.AnonymousClass8NN.A09(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r4
        L_0x0327:
            X.0yC r7 = r2.A00
            r0 = 1
            java.util.ArrayList r4 = X.C203359nq.A07(r5, r7, r0)
            X.8SF r2 = X.AnonymousClass8NN.A09(r6)
            X.B6c r1 = r2.interactiveAnnotations_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0341
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.interactiveAnnotations_ = r1
        L_0x0341:
            X.C21071A7i.A0O(r4, r1)
            java.util.ArrayList r3 = X.C203359nq.A07(r5, r7, r3)
            X.8Hz r2 = X.C90524aI.A0H(r6)
            X.8SF r2 = (X.AnonymousClass8SF) r2
            X.B6c r1 = r2.annotations_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x035d
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.annotations_ = r1
        L_0x035d:
            X.C21071A7i.A0O(r3, r1)
            return r22
        L_0x0361:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/image thumbnail missing; message.key="
            X.C36321k7.A1L(r4, r0, r1)
            goto L_0x0327
        L_0x036b:
            r10 = 1
            goto L_0x02aa
        L_0x036e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with directPath not set; message.key="
            X.C36321k7.A1L(r4, r0, r1)
            goto L_0x0240
        L_0x0379:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/unable to send encrypted media message due to missing mediaKey; message.key="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; media_wa_type="
            X.C165567td.A1A(r8, r0, r1)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x039b
            X.0yC r0 = r2.A00
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x039b
            X.1Fu r0 = X.C165567td.A0K(r17)
            throw r0
        L_0x039b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195739Vt.A00(X.9Xy, X.8NJ, X.2bt):X.8NJ");
    }

    public C195739Vt(C20810yC r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass8NJ A01(C196159Xy r5, AnonymousClass8NJ r6, C46922bt r7) {
        AnonymousClass8NJ A002 = A00(r5, r6, r7);
        if (A002 != null) {
            C80103un r2 = r5.A02;
            byte[] bArr = r5.A0B;
            if (C202029kv.A02(r2, r7, bArr)) {
                AnonymousClass8SG A003 = C196159Xy.A00(this.A01, r5, r2, r7, bArr);
                AnonymousClass8SF A09 = AnonymousClass8NN.A09(A002);
                A003.getClass();
                A09.contextInfo_ = A003;
                A09.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            }
        }
        return A002;
    }
}
