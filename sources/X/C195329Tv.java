package X;

/* renamed from: X.9Tv  reason: invalid class name and case insensitive filesystem */
public class C195329Tv {
    public final C20810yC A00;
    public final C202029kv A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (X.C64933Qa.A04(r13) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass8SC r12, X.C46972by r13, int r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r4 = 1
            if (r14 != r4) goto L_0x0013
            if (r15 != 0) goto L_0x0013
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = r12.caption_
            r13.A1k(r0)
        L_0x0012:
            return
        L_0x0013:
            X.3Qj r1 = new X.3Qj
            r1.<init>()
            r13.A01 = r1
            if (r15 != 0) goto L_0x0023
            boolean r0 = X.C64933Qa.A04(r13)
            r10 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r10 = 1
        L_0x0024:
            int r0 = r12.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0174
            X.AUx r0 = r12.mediaKey_
            byte[] r0 = r0.A06()
            X.C131806Qs.A00(r1, r13, r0)
        L_0x0033:
            int r0 = r12.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0044
            long r2 = r12.mediaKeyTimestamp_
            long r2 = r2 * r8
            r1.A0D = r2
        L_0x0044:
            X.AUx r0 = r12.jpegThumbnail_
            byte[] r2 = r0.A06()
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0054
            r13.A02 = r4
            r0 = r16
            r13.A1D(r2, r0)
        L_0x0054:
            java.lang.String r4 = "; message.key="
            if (r10 == 0) goto L_0x005e
            int r0 = r12.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0068
        L_0x005e:
            long r2 = r12.fileLength_
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01a4
            r13.A00 = r2
        L_0x0068:
            r7 = 14
            java.lang.String r6 = "FMessageDocument/bogus sha-256 hash received; length="
            r5 = 32
            r2 = 2
            if (r10 == 0) goto L_0x0077
            int r0 = r12.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0086
        L_0x0077:
            X.AUx r0 = r12.fileSha256_
            byte[] r3 = r0.A06()
            int r0 = r3.length
            if (r0 != r5) goto L_0x0198
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A04 = r0
        L_0x0086:
            int r0 = r12.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x009b
            X.AUx r0 = r12.fileEncSha256_
            byte[] r3 = r0.A06()
            int r0 = r3.length
            if (r0 != r5) goto L_0x018c
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A03 = r0
        L_0x009b:
            if (r10 == 0) goto L_0x00a3
            int r0 = r12.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00a8
        L_0x00a3:
            java.lang.String r0 = r12.url_
            r13.A1e(r0)
        L_0x00a8:
            java.lang.String r0 = r12.title_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = r12.title_
            java.lang.String r0 = X.AnonymousClass14B.A0C(r0, r3)
            r13.A02 = r0
        L_0x00ba:
            int r0 = r12.pageCount_
            r13.A00 = r0
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = r12.caption_
            r13.A1k(r0)
        L_0x00cb:
            java.lang.String r0 = r12.fileName_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = r12.fileName_
            java.lang.String r0 = X.AnonymousClass14B.A0C(r0, r3)
            r13.A06 = r0
        L_0x00db:
            if (r10 == 0) goto L_0x016f
            int r0 = r12.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x016f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            X.C165577te.A1F(r13, r0, r1)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r13.A0J()
            X.C36351kA.A1L(r0, r1)
        L_0x00f8:
            int r1 = r12.bitField0_
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0163
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0163
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0163
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0163
            X.3L1 r3 = new X.3L1
            r3.<init>()
            java.lang.String r0 = r12.thumbnailDirectPath_
            r3.A04 = r0
            X.AUx r0 = r12.thumbnailSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            r3.A08 = r0
            X.AUx r0 = r12.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            r3.A05 = r0
            X.AUx r0 = r12.mediaKey_
            byte[] r0 = r0.A06()
            r3.A0A = r0
            int r2 = r12.bitField0_
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x013e
            long r0 = r12.mediaKeyTimestamp_
            long r0 = r0 * r8
            r3.A02 = r0
        L_0x013e:
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x014c
            X.AUx r0 = r12.jpegThumbnail_
            byte[] r0 = r0.A06()
            r3.A0B = r0
        L_0x014c:
            int r1 = r12.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0157
            int r0 = r12.thumbnailWidth_
            r3.A01 = r0
        L_0x0157:
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0160
            int r0 = r12.thumbnailHeight_
            r3.A00 = r0
        L_0x0160:
            r13.A12(r3)
        L_0x0163:
            java.lang.String r0 = r12.mimetype_
            r13.A05 = r0
            boolean r0 = r12.contactVcard_
            if (r0 == 0) goto L_0x0012
            r0 = 7
            r13.A09 = r0
            return
        L_0x016f:
            java.lang.String r0 = r12.directPath_
            r1.A0J = r0
            goto L_0x00f8
        L_0x0174:
            if (r10 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/missing media key; message.key="
            X.C165567td.A19(r13, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0186:
            r0 = 0
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x018c:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r6)
            X.C165567td.A19(r13, r4, r0)
            X.1Tb r0 = X.C165567td.A0J(r7)
            throw r0
        L_0x0198:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r6)
            X.C165567td.A19(r13, r4, r0)
            X.1Tb r0 = X.C165567td.A0J(r7)
            throw r0
        L_0x01a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/bogus media size received; file_length="
            r1.append(r0)
            r1.append(r2)
            X.C165567td.A19(r13, r4, r1)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195329Tv.A01(X.8SC, X.2by, int, boolean, boolean):void");
    }

    public C195329Tv(C20810yC r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        if (X.C64933Qa.A04(r5) != false) goto L_0x0176;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C65013Qj r13, X.C196159Xy r14, X.AnonymousClass8NI r15, X.C63683Kz r16, X.C46972by r17) {
        /*
            r12 = this;
            boolean r9 = r14.A02()
            boolean r8 = r14.A04
            X.3un r7 = r14.A02
            byte[] r6 = r14.A0B
            r5 = r17
            if (r9 == 0) goto L_0x0016
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003a
        L_0x0016:
            java.lang.String r2 = r5.A07
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            if (r9 != 0) goto L_0x003a
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with url not set; message.key="
            X.C165567td.A19(r5, r0, r1)
        L_0x003a:
            java.lang.String r2 = r5.A05
            if (r2 == 0) goto L_0x004a
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L_0x004a:
            java.lang.String r2 = r5.A1a()
            if (r2 == 0) goto L_0x005c
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.title_ = r2
        L_0x005c:
            java.lang.String r0 = r5.A1b()
            if (r0 == 0) goto L_0x0075
            java.lang.String r2 = r5.A1b()
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileName_ = r2
        L_0x0075:
            if (r9 == 0) goto L_0x007b
            int r0 = r5.A00
            if (r0 < 0) goto L_0x0089
        L_0x007b:
            int r2 = r5.A00
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.pageCount_ = r2
        L_0x0089:
            java.lang.String r3 = r5.A01
            if (r3 == 0) goto L_0x009a
            X.8SC r2 = X.AnonymousClass8NN.A07(r15)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.caption_ = r3
        L_0x009a:
            r4 = 0
            if (r9 == 0) goto L_0x00a5
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e4
        L_0x00a5:
            java.lang.String r0 = r5.A04
            byte[] r2 = android.util.Base64.decode(r0, r4)
            int r1 = r2.length
            r0 = 32
            if (r1 == r0) goto L_0x00d4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 hash; length="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r3)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x00d4
            X.0yC r0 = r12.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x00d4
            r0 = 14
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x00d4:
            X.8I5 r2 = X.C21674AUx.A01(r2, r4, r1)
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r2
        L_0x00e4:
            java.lang.String r0 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = r5.A03
            byte[] r2 = android.util.Base64.decode(r0, r4)
            int r1 = r2.length
            r0 = 32
            if (r1 == r0) goto L_0x011b
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 enc hash; length="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r3)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x011b
            X.0yC r0 = r12.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x011b
            r0 = 14
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x011b:
            X.8I5 r2 = X.C21674AUx.A01(r2, r4, r1)
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r2
        L_0x012b:
            r10 = 0
            if (r9 == 0) goto L_0x0135
            long r0 = r5.A00
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0176
        L_0x0135:
            long r0 = r5.A00
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x015f
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "FMessageDocument/buildE2eMessage/sending document with media size not set, size="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r3)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x015f
            X.0yC r0 = r12.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x015f
            r0 = 13
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x015f:
            long r0 = r5.A00
            X.8SC r3 = X.AnonymousClass8NN.A07(r15)
            int r2 = r3.bitField0_
            r2 = r2 | 16
            r3.bitField0_ = r2
            r3.fileLength_ = r0
            if (r9 != 0) goto L_0x0176
            boolean r1 = X.C64933Qa.A04(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0177
        L_0x0176:
            r0 = 1
        L_0x0177:
            byte[] r1 = r13.A0a
            if (r1 != 0) goto L_0x0184
            if (r0 != 0) goto L_0x01c8
            r0 = 16
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x0184:
            r0 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 4465(0x1171, float:6.257E-42)
            int r9 = r1.length
            r0 = 32
            if (r9 == r0) goto L_0x01b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r1)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x01b5
            X.0yC r0 = r12.A00
            boolean r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x01b5
            r1 = 0
            X.1Fu r0 = new X.1Fu
            r0.<init>(r2, r1)
            throw r0
        L_0x01b5:
            byte[] r1 = r13.A0a
            int r0 = r1.length
            X.8I5 r2 = X.C21674AUx.A01(r1, r4, r0)
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x01c8:
            long r0 = r13.A0D
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01de
            long r0 = X.C36391kE.A0B(r0)
            X.8SC r3 = X.AnonymousClass8NN.A07(r15)
            int r2 = r3.bitField0_
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3.bitField0_ = r2
            r3.mediaKeyTimestamp_ = r0
        L_0x01de:
            X.3L1 r9 = r5.A0a
            if (r9 == 0) goto L_0x02ab
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x02ab
            java.lang.String r0 = r9.A08
            if (r0 == 0) goto L_0x02ab
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x02ab
            byte[] r0 = r9.A0B
            if (r0 == 0) goto L_0x02ab
            byte[] r1 = r9.A0A
            byte[] r0 = r13.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x02ab
            long r2 = r9.A02
            long r0 = r13.A0D
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x02ab
            r3 = 1
            java.lang.String r2 = r9.A04
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.thumbnailDirectPath_ = r2
            java.lang.String r0 = r9.A08
            X.8I5 r2 = X.AnonymousClass8NN.A02(r15, r0)
            X.8Hz r1 = r15.A00
            X.8SC r1 = (X.AnonymousClass8SC) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.thumbnailSha256_ = r2
            java.lang.String r0 = r9.A05
            X.8I5 r0 = X.AnonymousClass8NN.A02(r15, r0)
            X.C170918Hz.A0U(r0, r15, r9)
        L_0x0231:
            if (r8 != 0) goto L_0x024e
            if (r3 == 0) goto L_0x02a0
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x02a0
            byte[] r1 = r9.A0B
        L_0x023b:
            int r0 = r1.length
            X.8I5 r3 = X.C21674AUx.A01(r1, r4, r0)
            X.8SC r2 = X.AnonymousClass8NN.A07(r15)
            int r1 = r2.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.jpegThumbnail_ = r3
        L_0x024e:
            boolean r0 = X.C202029kv.A02(r7, r5, r6)
            if (r0 == 0) goto L_0x026a
            X.9kv r0 = r12.A01
            X.8SG r0 = r0.A03(r7, r5, r6, r8)
            X.8SC r2 = X.AnonymousClass8NN.A07(r15)
            r0.getClass()
            r2.contextInfo_ = r0
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x026a:
            java.lang.String r0 = r13.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0296
            java.lang.String r2 = r13.A0J
            X.8SC r1 = X.AnonymousClass8NN.A07(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x0283:
            int r1 = r5.A09
            r0 = 7
            if (r1 != r0) goto L_0x0295
            X.8SC r2 = X.AnonymousClass8NN.A07(r15)
            r1 = 1
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.contactVcard_ = r1
        L_0x0295:
            return
        L_0x0296:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key="
            X.C165567td.A19(r5, r0, r1)
            goto L_0x0283
        L_0x02a0:
            byte[] r0 = r16.A02()
            if (r0 == 0) goto L_0x024e
            byte[] r1 = r16.A02()
            goto L_0x023b
        L_0x02ab:
            r3 = 0
            goto L_0x0231
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195329Tv.A00(X.3Qj, X.9Xy, X.8NI, X.3Kz, X.2by):void");
    }
}
