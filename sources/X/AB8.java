package X;

public final class AB8 implements B6B {
    public final C202909ms A00;

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B25(X.C192559Hl r11, X.AnonymousClass3T1 r12) {
        /*
            r10 = this;
            r1 = 0
            X.C36331k8.A1I(r12, r11)
            boolean r0 = r12 instanceof X.C46812bi
            if (r0 == 0) goto L_0x01de
            r5 = r12
            X.2bv r5 = (X.C46942bv) r5
            r6 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            r4 = 1
            X.3Qj r3 = r5.A01
            r2 = 0
            if (r3 == 0) goto L_0x01a9
            byte[] r8 = r3.A0a
            if (r8 == 0) goto L_0x01a9
            X.8NL r0 = r11.A00
            X.8Hz r0 = r0.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8S5 r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x0025
            X.8S5 r0 = X.AnonymousClass8S5.DEFAULT_INSTANCE
        L_0x0025:
            X.8NN r2 = r0.A0q()
            X.8N2 r2 = (X.AnonymousClass8N2) r2
            int r7 = r8.length
            r0 = 32
            if (r7 == r0) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r1)
        L_0x0041:
            X.8I5 r7 = X.C21674AUx.A01(r8, r6, r7)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r7
            java.lang.String r7 = r5.A05
            if (r7 == 0) goto L_0x0080
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0080
            boolean r0 = X.AnonymousClass1DC.A0A(r7)
            if (r0 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r1)
        L_0x0072:
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r7
        L_0x0080:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x00b7
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b7
            byte[] r8 = android.util.Base64.decode(r1, r6)
            X.AnonymousClass00C.A0B(r8)
            int r7 = r8.length
            r0 = 32
            if (r7 == r0) goto L_0x00a7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudioInterop/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r1)
        L_0x00a7:
            X.8I5 r7 = X.AnonymousClass8NN.A03(r2, r8)
            X.8Hz r1 = r2.A00
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r7
        L_0x00b7:
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x00ee
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ee
            byte[] r7 = android.util.Base64.decode(r1, r6)
            X.AnonymousClass00C.A0B(r7)
            int r6 = r7.length
            r0 = 32
            if (r6 == r0) goto L_0x00de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r1)
        L_0x00de:
            X.8I5 r6 = X.AnonymousClass8NN.A03(r2, r7)
            X.8Hz r1 = r2.A00
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r6
        L_0x00ee:
            long r0 = r5.A00
            r8 = 0
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0107
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = "; message.key="
            X.C165567td.A19(r5, r0, r7)
        L_0x0107:
            long r0 = r5.A00
            X.8Hz r7 = X.C90524aI.A0H(r2)
            X.8S5 r7 = (X.AnonymousClass8S5) r7
            int r6 = r7.bitField0_
            r6 = r6 | 8
            r7.bitField0_ = r6
            r7.fileLength_ = r0
            int r0 = r5.A0B
            if (r0 <= 0) goto L_0x0129
            int r6 = r5.A0B
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r6
        L_0x0129:
            int r0 = r5.A09
            boolean r4 = X.AnonymousClass000.A1S(r0, r4)
            X.8S5 r1 = X.AnonymousClass8NN.A05(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r4
            X.3Kh r0 = r5.A00
            java.lang.Object r6 = r0.A00
            X.3QP r6 = (X.AnonymousClass3QP) r6
            if (r6 == 0) goto L_0x0173
            byte[] r4 = r6.A05
            if (r4 == 0) goto L_0x0161
            int r1 = r4.length
            if (r1 == 0) goto L_0x0161
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0161
            r0 = 0
            X.8I5 r4 = X.C21674AUx.A01(r4, r0, r1)
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.waveform_ = r4
        L_0x0161:
            int r4 = r6.A00
            if (r4 == 0) goto L_0x0173
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.backgroundArgb_ = r4
        L_0x0173:
            long r0 = r3.A0D
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x018b
            long r0 = X.C36391kE.A0B(r0)
            X.8Hz r6 = X.C90524aI.A0H(r2)
            X.8S5 r6 = (X.AnonymousClass8S5) r6
            int r4 = r6.bitField0_
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.bitField0_ = r4
            r6.mediaKeyTimestamp_ = r0
        L_0x018b:
            java.lang.String r3 = r3.A0J
            if (r3 == 0) goto L_0x01bd
            int r0 = r3.length()
            if (r0 == 0) goto L_0x01bd
            X.8Hz r1 = X.C90524aI.A0H(r2)
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r3
        L_0x01a3:
            X.8NL r0 = r11.A00
            r0.A0V(r2)
            return
        L_0x01a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/unable to send audio message due to missing mediaKey; message.key="
            X.C165577te.A1F(r5, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            r1.append(r0)
            int r0 = r5.A1I
            r1.append(r0)
            goto L_0x01c6
        L_0x01bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            X.C165577te.A1F(r5, r0, r1)
        L_0x01c6:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r2 != 0) goto L_0x01a3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key="
            X.C165577te.A1F(r12, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.C165567td.A1A(r12, r0, r1)
            return
        L_0x01de:
            X.1Fu r0 = X.C165567td.A0K(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AB8.B25(X.9Hl, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        r8 = r3.waveform_;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlI(X.AnonymousClass9XL r15) {
        /*
            r14 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            X.8RS r1 = r15.A02
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x014b
            X.8Rz r3 = r1.audioMessage_
            if (r3 != 0) goto L_0x0012
            X.8Rz r3 = X.C173518Rz.DEFAULT_INSTANCE
        L_0x0012:
            X.3Qa r2 = r15.A03
            long r0 = r15.A01
            X.2bi r6 = new X.2bi
            r6.<init>(r2, r0)
            X.AnonymousClass00C.A0B(r3)
            r7 = 1
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)
            boolean r1 = r3.ptt_
            r6.A09 = r1
            X.3Qj r1 = new X.3Qj
            r1.<init>()
            r6.A01 = r1
            r9 = 0
            int r4 = r3.bitField0_
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0045
            X.AUx r8 = r3.waveform_
            int r5 = r8.A02()
            if (r5 <= 0) goto L_0x0045
            r4 = 192(0xc0, float:2.69E-43)
            if (r5 > r4) goto L_0x0045
            byte[] r9 = r8.A06()
        L_0x0045:
            int r4 = r3.bitField0_
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x00f2
            int r10 = r3.backgroundArgb_
        L_0x004d:
            if (r9 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x005c
        L_0x0051:
            r11 = 0
            X.3QP r8 = new X.3QP
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r6.A1j(r8)
        L_0x005c:
            int r4 = r3.bitField0_
            r4 = r4 & 32
            if (r4 == 0) goto L_0x013b
            X.AUx r4 = r3.mediaKey_
            byte[] r4 = r4.A06()
            X.C131806Qs.A00(r1, r6, r4)
            int r12 = r3.bitField0_
            r4 = r12 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0078
            long r4 = r3.mediaKeyTimestamp_
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
            r1.A0D = r4
        L_0x0078:
            r4 = r12 & 4
            boolean r4 = X.AnonymousClass000.A1P(r4)
            java.lang.String r8 = "; message.key="
            if (r4 == 0) goto L_0x008c
            long r4 = r3.fileLength_
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0125
            r6.A00 = r4
        L_0x008c:
            r4 = r12 & 2
            boolean r4 = X.AnonymousClass000.A1P(r4)
            r11 = 14
            java.lang.String r10 = "FMessageAudio/bogus sha-256 hash received; length="
            r9 = 32
            if (r4 == 0) goto L_0x00a9
            X.AUx r4 = r3.fileSha256_
            byte[] r5 = r4.A06()
            int r4 = r5.length
            if (r4 != r9) goto L_0x0119
            java.lang.String r4 = android.util.Base64.encodeToString(r5, r0)
            r6.A04 = r4
        L_0x00a9:
            int r4 = r3.bitField0_
            r4 = r4 & 64
            if (r4 == 0) goto L_0x00be
            X.AUx r4 = r3.fileEncSha256_
            byte[] r5 = r4.A06()
            int r4 = r5.length
            if (r4 != r9) goto L_0x010d
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r0)
            r6.A03 = r0
        L_0x00be:
            java.lang.String r0 = r3.mimetype_
            java.lang.String r0 = X.AnonymousClass1DC.A07(r0, r7)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = r3.mimetype_
            r6.A05 = r0
            int r0 = r3.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r3.directPath_
            r1.A0J = r0
        L_0x00d4:
            int r0 = r3.seconds_
            r6.A0B = r0
            return r6
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r6.A0J()
            X.C36351kA.A1L(r0, r1)
            goto L_0x00d4
        L_0x00f2:
            r10 = 0
            goto L_0x004d
        L_0x00f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r3.mimetype_
            r1.append(r0)
            X.C36321k7.A1L(r2, r8, r1)
            r0 = 17
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x010d:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r4, r10)
            X.C36321k7.A1L(r2, r8, r0)
            X.1Tb r0 = X.C165567td.A0J(r11)
            throw r0
        L_0x0119:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r4, r10)
            X.C36321k7.A1L(r2, r8, r0)
            X.1Tb r0 = X.C165567td.A0J(r11)
            throw r0
        L_0x0125:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/bogus media size received; fileLength="
            r1.append(r0)
            r1.append(r4)
            X.C36321k7.A1L(r2, r8, r1)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/missing media key; message.key="
            X.C36321k7.A1L(r2, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x014b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AB8.BlI(X.9XL):X.3T1");
    }

    public AB8(C202909ms r1) {
        this.A00 = r1;
    }
}
