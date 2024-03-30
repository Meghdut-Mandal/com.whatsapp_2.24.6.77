package X;

/* renamed from: X.9e4  reason: invalid class name and case insensitive filesystem */
public class C198709e4 {
    public final C20810yC A00;
    public final C202029kv A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = r9.waveform_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        if (r12 != false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass8S5 r9, X.C64933Qa r10, X.C46942bv r11, boolean r12) {
        /*
            boolean r0 = r9.ptt_
            r11.A09 = r0
            X.3Qj r2 = new X.3Qj
            r2.<init>()
            r11.A01 = r2
            r4 = 0
            r5 = 0
            int r0 = r9.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0023
            X.AUx r3 = r9.waveform_
            int r1 = r3.A02()
            if (r1 <= 0) goto L_0x0023
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0023
            byte[] r4 = r3.A06()
        L_0x0023:
            int r0 = r9.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x002b
            int r5 = r9.backgroundArgb_
        L_0x002b:
            if (r4 != 0) goto L_0x002f
            if (r5 == 0) goto L_0x003a
        L_0x002f:
            r6 = 0
            X.3QP r3 = new X.3QP
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r11.A1j(r3)
        L_0x003a:
            int r0 = r9.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00bc
            X.AUx r0 = r9.mediaKey_
            byte[] r0 = r0.A06()
            X.C131806Qs.A00(r2, r11, r0)
        L_0x0049:
            int r8 = r9.bitField0_
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0056
            long r0 = r9.mediaKeyTimestamp_
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r2.A0D = r0
        L_0x0056:
            java.lang.String r4 = "; message.key="
            if (r12 == 0) goto L_0x005e
            r0 = r8 & 8
            if (r0 == 0) goto L_0x0068
        L_0x005e:
            long r0 = r9.fileLength_
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0127
            r11.A00 = r0
        L_0x0068:
            r7 = 14
            java.lang.String r6 = "FMessageAudio/bogus sha-256 hash received; length="
            r5 = 2
            r3 = 32
            if (r12 == 0) goto L_0x0075
            r0 = r8 & 4
            if (r0 == 0) goto L_0x0084
        L_0x0075:
            X.AUx r0 = r9.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x011b
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r11.A04 = r0
        L_0x0084:
            int r0 = r9.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0099
            X.AUx r0 = r9.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x010f
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r11.A03 = r0
        L_0x0099:
            if (r12 != 0) goto L_0x00d4
            java.lang.String r1 = r9.mimetype_
            r0 = 1
            java.lang.String r0 = X.AnonymousClass1DC.A07(r1, r0)
            if (r0 != 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r9.mimetype_
            r1.append(r0)
            X.C36321k7.A1L(r10, r4, r1)
            r0 = 17
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x00bc:
            if (r12 != 0) goto L_0x0049
            boolean r0 = X.C64933Qa.A04(r11)
            if (r0 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/missing media key; message.key="
            X.C36321k7.A1L(r10, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x00d4:
            java.lang.String r0 = r9.mimetype_
            r11.A05 = r0
            if (r12 == 0) goto L_0x00e0
            int r0 = r9.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00e7
        L_0x00e0:
            java.lang.String r0 = r9.url_
            r11.A1e(r0)
            if (r12 == 0) goto L_0x010a
        L_0x00e7:
            int r0 = r9.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r11.A0J()
            X.C36351kA.A1L(r0, r1)
        L_0x0105:
            int r0 = r9.seconds_
            r11.A0B = r0
            return
        L_0x010a:
            java.lang.String r0 = r9.directPath_
            r2.A0J = r0
            goto L_0x0105
        L_0x010f:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r6)
            X.C36321k7.A1L(r10, r4, r0)
            X.1Tb r0 = X.C165567td.A0J(r7)
            throw r0
        L_0x011b:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r6)
            X.C36321k7.A1L(r10, r4, r0)
            X.1Tb r0 = X.C165567td.A0J(r7)
            throw r0
        L_0x0127:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "FMessageAudio/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C36321k7.A1L(r10, r4, r3)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198709e4.A00(X.8S5, X.3Qa, X.2bv, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025a, code lost:
        r3 = X.C90474aD.A0O(r2, r6.A0a);
        r1 = (X.AnonymousClass8S5) r2.A00;
        r1.bitField0_ |= 64;
        r1.mediaKey_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026c, code lost:
        r0 = (X.AnonymousClass3QP) r13.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0272, code lost:
        if (r0 == null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0274, code lost:
        r3 = r0.A05;
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0278, code lost:
        if (r3 == null) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x027a, code lost:
        r1 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027b, code lost:
        if (r1 <= 0) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027f, code lost:
        if (r1 > 192) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        r3 = X.C21674AUx.A01(r3, 0, r1);
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.waveform_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0292, code lost:
        if (r4 == 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0294, code lost:
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
        r1.backgroundArgb_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a0, code lost:
        r0 = r6.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a4, code lost:
        if (r0 <= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a6, code lost:
        r0 = X.C36391kE.A0B(r0);
        r4 = X.AnonymousClass8NN.A05(r2);
        r4.bitField0_ |= 512;
        r4.mediaKeyTimestamp_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b6, code lost:
        r3 = r12.A02;
        r1 = r12.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02be, code lost:
        if (X.C202029kv.A02(r3, r13, r1) == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c0, code lost:
        r0 = X.C196159Xy.A00(r11.A01, r12, r3, r13, r1);
        r1 = X.AnonymousClass8NN.A05(r2);
        r0.getClass();
        r1.contextInfo_ = r0;
        r1.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02db, code lost:
        if (android.text.TextUtils.isEmpty(r6.A0J) != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02dd, code lost:
        r3 = r6.A0J;
        r1 = X.AnonymousClass8NN.A05(r2);
        r3.getClass();
        r1.bitField0_ |= 256;
        r1.directPath_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ef, code lost:
        X.C165567td.A19(r13, "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key=", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f8, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.C64933Qa.A04(r13) != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r10 != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (android.text.TextUtils.isEmpty(r13.A04) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r5 = android.util.Base64.decode(r13.A04, 0);
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r4 == 32) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("FMessageAudio/bogus sha-256 hash; length=");
        r1.append(r4);
        X.C165567td.A19(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r12.A03 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        if (X.C165597tg.A1R(r11.A00) == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        throw X.C165567td.A0K(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        r4 = X.C21674AUx.A01(r5, 0, r4);
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= 4;
        r1.fileSha256_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (android.text.TextUtils.isEmpty(r13.A03) != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0108, code lost:
        r5 = android.util.Base64.decode(r13.A03, 0);
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        if (r4 == 32) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0113, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("FMessageAudio/bogus sha-256 enc hash; length=");
        r1.append(r4);
        X.C165567td.A19(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r12.A03 == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012e, code lost:
        if (X.C165597tg.A1R(r11.A00) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0136, code lost:
        throw X.C165567td.A0K(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0137, code lost:
        r4 = X.C21674AUx.A01(r5, 0, r4);
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= 128;
        r1.fileEncSha256_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        r0 = r13.A00;
        r4 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014d, code lost:
        if (r10 == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r4 <= 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0151, code lost:
        r0 = r13.A00;
        r5 = X.AnonymousClass8NN.A05(r2);
        r5.bitField0_ |= 8;
        r5.fileLength_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015f, code lost:
        if (r10 == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0163, code lost:
        if (r13.A0B <= 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0165, code lost:
        r4 = r13.A0B;
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= 16;
        r1.seconds_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0175, code lost:
        if (r13.A09 == 1) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0177, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0178, code lost:
        r1 = X.AnonymousClass8NN.A05(r2);
        r1.bitField0_ |= 32;
        r1.ptt_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        if (r9 == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0188, code lost:
        if (r6.A0a == null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018a, code lost:
        r0 = r6.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018c, code lost:
        if (r10 != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018e, code lost:
        r3 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0191, code lost:
        if (r3 == 32) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0193, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("FMessageAudio/buildE2eMessage/media key incorrect length; length=");
        r1.append(r3);
        X.C165567td.A19(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a6, code lost:
        if (r12.A03 == false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ae, code lost:
        if (X.C165597tg.A1R(r11.A00) == false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b6, code lost:
        throw X.C165567td.A0K(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b7, code lost:
        if (r4 > 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b9, code lost:
        r5 = X.AnonymousClass000.A0u();
        r5.append("FMessageAudio/buildE2eMessage/sending audio with media size not set, size=");
        r5.append(r0);
        X.C165567td.A19(r13, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cc, code lost:
        if (r12.A03 == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d4, code lost:
        if (X.C165597tg.A1R(r11.A00) == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dc, code lost:
        throw X.C165567td.A0K(13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8N2 A01(X.C196159Xy r12, X.C46942bv r13) {
        /*
            r11 = this;
            X.3Qj r6 = r13.A01
            boolean r10 = r12.A02()
            r3 = 1
            r7 = 0
            if (r10 != 0) goto L_0x0011
            boolean r0 = X.C64933Qa.A04(r13)
            r9 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r9 = 1
        L_0x0012:
            r2 = 0
            if (r6 == 0) goto L_0x01dd
            if (r9 != 0) goto L_0x001b
            byte[] r0 = r6.A0a
            if (r0 == 0) goto L_0x01dd
        L_0x001b:
            X.8NL r0 = r12.A00
            X.8Hz r0 = r0.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8S5 r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x0027
            X.8S5 r0 = X.AnonymousClass8S5.DEFAULT_INSTANCE
        L_0x0027:
            X.8NN r2 = r0.A0q()
            X.8N2 r2 = (X.AnonymousClass8N2) r2
            java.lang.String r4 = r13.A07
            if (r9 == 0) goto L_0x0037
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0074
        L_0x0037:
            if (r10 != 0) goto L_0x0065
            X.3Qa r5 = r13.A1J
            boolean r0 = X.C203359nq.A0D(r5, r4)
            if (r0 != 0) goto L_0x0065
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending message with invalid url"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.C36321k7.A1L(r5, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0065
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x0065
            r0 = 15
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x0065:
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r4
        L_0x0074:
            java.lang.String r4 = r13.A05
            if (r10 == 0) goto L_0x007e
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00b9
        L_0x007e:
            boolean r0 = X.AnonymousClass1DC.A0A(r4)
            if (r0 != 0) goto L_0x00a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r13, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x00a8
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 17
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x00a8:
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r4
            if (r10 == 0) goto L_0x00c1
        L_0x00b9:
            java.lang.String r0 = r13.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0100
        L_0x00c1:
            java.lang.String r0 = r13.A04
            byte[] r5 = android.util.Base64.decode(r0, r7)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x00f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r13, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x00f0
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 14
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x00f0:
            X.8I5 r4 = X.C21674AUx.A01(r5, r7, r4)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r4
        L_0x0100:
            java.lang.String r0 = r13.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = r13.A03
            byte[] r5 = android.util.Base64.decode(r0, r7)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x0137
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r13, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0137
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x0137
            r0 = 14
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x0137:
            X.8I5 r4 = X.C21674AUx.A01(r5, r7, r4)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r4
        L_0x0147:
            r7 = 0
            long r0 = r13.A00
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x01b7
            if (r4 <= 0) goto L_0x0161
        L_0x0151:
            long r0 = r13.A00
            X.8S5 r5 = X.AnonymousClass8NN.A05(r2)
            int r4 = r5.bitField0_
            r4 = r4 | 8
            r5.bitField0_ = r4
            r5.fileLength_ = r0
            if (r10 == 0) goto L_0x0165
        L_0x0161:
            int r0 = r13.A0B
            if (r0 <= 0) goto L_0x0173
        L_0x0165:
            int r4 = r13.A0B
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r4
        L_0x0173:
            int r0 = r13.A09
            if (r0 == r3) goto L_0x0178
            r3 = 0
        L_0x0178:
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r3
            if (r9 == 0) goto L_0x018a
            byte[] r0 = r6.A0a
            if (r0 == 0) goto L_0x026c
        L_0x018a:
            byte[] r0 = r6.A0a
            if (r10 != 0) goto L_0x025a
            int r3 = r0.length
            r0 = 32
            if (r3 == r0) goto L_0x025a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r13, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x025a
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x025a
            r0 = 16
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x01b7:
            if (r4 > 0) goto L_0x0151
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r13, r0, r5)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0151
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x0151
            r0 = 13
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x01dd:
            if (r10 == 0) goto L_0x0234
            X.8NL r0 = r12.A00
            X.8Hz r0 = r0.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8S5 r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x01eb
            X.8S5 r0 = X.AnonymousClass8S5.DEFAULT_INSTANCE
        L_0x01eb:
            X.8NN r2 = r0.A0q()
            X.8N2 r2 = (X.AnonymousClass8N2) r2
            int r0 = r13.A09
            if (r0 == r3) goto L_0x01f6
            r3 = 0
        L_0x01f6:
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r3
            X.3un r3 = r12.A02
            byte[] r1 = r12.A0B
            boolean r0 = X.C202029kv.A02(r3, r13, r1)
            if (r0 == 0) goto L_0x0221
            X.9kv r0 = r11.A01
            X.8SG r0 = X.C196159Xy.A00(r0, r12, r3, r13, r1)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
        L_0x0221:
            int r0 = r13.A0B
            if (r0 <= 0) goto L_0x02ee
            int r3 = r13.A0B
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r3
            return r2
        L_0x0234:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/unable to send audio message due to missing mediaKey; message.key="
            X.C165577te.A1F(r13, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.C165567td.A1A(r13, r0, r1)
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x02ee
            X.0yC r0 = r11.A00
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x02ee
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1Fu r0 = new X.1Fu
            r0.<init>(r1, r2)
            throw r0
        L_0x025a:
            byte[] r0 = r6.A0a
            X.8I5 r3 = X.C90474aD.A0O(r2, r0)
            X.8Hz r1 = r2.A00
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r3
        L_0x026c:
            X.3Kh r0 = r13.A00
            java.lang.Object r0 = r0.A00
            X.3QP r0 = (X.AnonymousClass3QP) r0
            if (r0 == 0) goto L_0x02a0
            byte[] r3 = r0.A05
            int r4 = r0.A00
            if (r3 == 0) goto L_0x0292
            int r1 = r3.length
            if (r1 <= 0) goto L_0x0292
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0292
            r0 = 0
            X.8I5 r3 = X.C21674AUx.A01(r3, r0, r1)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.waveform_ = r3
        L_0x0292:
            if (r4 == 0) goto L_0x02a0
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.backgroundArgb_ = r4
        L_0x02a0:
            long r0 = r6.A0D
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b6
            long r0 = X.C36391kE.A0B(r0)
            X.8S5 r4 = X.AnonymousClass8NN.A05(r2)
            int r3 = r4.bitField0_
            r3 = r3 | 512(0x200, float:7.175E-43)
            r4.bitField0_ = r3
            r4.mediaKeyTimestamp_ = r0
        L_0x02b6:
            X.3un r3 = r12.A02
            byte[] r1 = r12.A0B
            boolean r0 = X.C202029kv.A02(r3, r13, r1)
            if (r0 == 0) goto L_0x02d5
            X.9kv r0 = r11.A01
            X.8SG r0 = X.C196159Xy.A00(r0, r12, r3, r13, r1)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
        L_0x02d5:
            java.lang.String r0 = r6.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ef
            java.lang.String r3 = r6.A0J
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r3
        L_0x02ee:
            return r2
        L_0x02ef:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            X.C165567td.A19(r13, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198709e4.A01(X.9Xy, X.2bv):X.8N2");
    }

    public C198709e4(C20810yC r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
