package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

public final class AB9 implements B6B {
    public final C202909ms A00;

    public void B25(C192559Hl r14, AnonymousClass3T1 r15) {
        boolean z;
        boolean z2;
        AnonymousClass8I5 A01;
        C36331k8.A1I(r15, r14);
        if (r15 instanceof C46972by) {
            C46972by r152 = (C46972by) r15;
            AnonymousClass8NL r7 = r14.A00;
            AnonymousClass8SC r0 = ((AnonymousClass8SX) r7.A00).documentMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8SC.DEFAULT_INSTANCE;
            }
            AnonymousClass8NI r6 = (AnonymousClass8NI) r0.A0q();
            C36321k7.A0v(r152, 0, r6);
            boolean z3 = r14.A01;
            C65013Qj r4 = r152.A01;
            if (r4 != null) {
                C63683Kz A0V = r152.A0V();
                AnonymousClass00C.A08(A0V);
                String str = r152.A05;
                if (str != null) {
                    AnonymousClass8SC A07 = AnonymousClass8NN.A07(r6);
                    A07.bitField0_ |= 2;
                    A07.mimetype_ = str;
                }
                String A1a = r152.A1a();
                if (A1a != null) {
                    AnonymousClass8SC A072 = AnonymousClass8NN.A07(r6);
                    A072.bitField0_ |= 4;
                    A072.title_ = A1a;
                }
                String A1b = r152.A1b();
                if (A1b != null) {
                    AnonymousClass8SC A073 = AnonymousClass8NN.A07(r6);
                    A073.bitField0_ |= 128;
                    A073.fileName_ = A1b;
                }
                String str2 = r152.A01;
                if (str2 != null) {
                    AnonymousClass8SC A074 = AnonymousClass8NN.A07(r6);
                    A074.bitField0_ |= 524288;
                    A074.caption_ = str2;
                }
                int i = r152.A00;
                if (i >= 0) {
                    AnonymousClass8SC A075 = AnonymousClass8NN.A07(r6);
                    A075.bitField0_ |= 32;
                    A075.pageCount_ = i;
                }
                String str3 = r152.A04;
                if (!(str3 == null || str3.length() == 0)) {
                    byte[] decode = Base64.decode(str3, 0);
                    AnonymousClass00C.A0B(decode);
                    int length = decode.length;
                    if (length != 32) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("FMessageAudioInterop/bogus sha-256 hash; length=");
                        A0u.append(length);
                        C165567td.A19(r152, "; message.key=", A0u);
                    }
                    AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, length);
                    AnonymousClass8SC A076 = AnonymousClass8NN.A07(r6);
                    A076.bitField0_ |= 8;
                    A076.fileSha256_ = A012;
                }
                String str4 = r152.A03;
                if (!(str4 == null || str4.length() == 0)) {
                    byte[] decode2 = Base64.decode(str4, 0);
                    AnonymousClass00C.A0B(decode2);
                    int length2 = decode2.length;
                    if (length2 != 32) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("FMessageAudio/bogus sha-256 enc hash; length=");
                        A0u2.append(length2);
                        C165567td.A19(r152, "; message.key=", A0u2);
                    }
                    AnonymousClass8I5 A013 = C21674AUx.A01(decode2, 0, length2);
                    AnonymousClass8SC A077 = AnonymousClass8NN.A07(r6);
                    A077.bitField0_ |= 256;
                    A077.fileEncSha256_ = A013;
                }
                long j = r152.A00;
                if (j > 0) {
                    if (j <= 0) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("FMessageAudio/buildE2eMessage/sending audio with media size not set, size=");
                        A0u3.append(j);
                        C165567td.A19(r152, "; message.key=", A0u3);
                    }
                    long j2 = r152.A00;
                    AnonymousClass8SC A078 = AnonymousClass8NN.A07(r6);
                    A078.bitField0_ |= 16;
                    A078.fileLength_ = j2;
                }
                byte[] bArr = r4.A0a;
                if (bArr != null) {
                    int length3 = bArr.length;
                    if (length3 != 32) {
                        StringBuilder A0u4 = AnonymousClass000.A0u();
                        A0u4.append("FMessageAudio/buildE2eMessage/media key incorrect length; length=");
                        A0u4.append(length3);
                        C165567td.A19(r152, "; message.key=", A0u4);
                    }
                    AnonymousClass8I5 A014 = C21674AUx.A01(bArr, 0, bArr.length);
                    AnonymousClass8SC A079 = AnonymousClass8NN.A07(r6);
                    A079.bitField0_ |= 64;
                    A079.mediaKey_ = A014;
                }
                long j3 = r4.A0D;
                if (j3 > 0) {
                    long A0B = C36391kE.A0B(j3);
                    AnonymousClass8SC A0710 = AnonymousClass8NN.A07(r6);
                    A0710.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    A0710.mediaKeyTimestamp_ = A0B;
                }
                AnonymousClass3L1 r10 = r152.A0a;
                byte[] bArr2 = null;
                if (r10 == null || r10.A04 == null || r10.A08 == null || r10.A05 == null || r10.A0B == null || !Arrays.equals(r10.A0A, r4.A0a) || r10.A02 != r4.A0D) {
                    z = false;
                } else {
                    z = true;
                    String str5 = r10.A04;
                    AnonymousClass8SC A0711 = AnonymousClass8NN.A07(r6);
                    str5.getClass();
                    A0711.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                    A0711.thumbnailDirectPath_ = str5;
                    AnonymousClass8I5 A02 = AnonymousClass8NN.A02(r6, r10.A08);
                    AnonymousClass8SC r1 = (AnonymousClass8SC) r6.A00;
                    r1.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                    r1.thumbnailSha256_ = A02;
                    C170918Hz.A0U(AnonymousClass8NN.A02(r6, r10.A05), r6, r10);
                }
                if (!z3) {
                    if (r10 != null) {
                        z2 = r10.A0C;
                    } else {
                        z2 = false;
                    }
                    if (z && z2) {
                        if (r10 != null) {
                            bArr2 = r10.A0B;
                        }
                        A01 = C21674AUx.A01(bArr2, 0, bArr2.length);
                    } else if (A0V.A02() != null) {
                        byte[] A022 = A0V.A02();
                        A01 = C21674AUx.A01(A022, 0, A022.length);
                    }
                    AnonymousClass8SC A0712 = AnonymousClass8NN.A07(r6);
                    A0712.bitField0_ |= 32768;
                    A0712.jpegThumbnail_ = A01;
                }
                String str6 = r4.A0J;
                if (str6 == null || str6.length() == 0) {
                    C165567td.A19(r152, "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key=", AnonymousClass000.A0u());
                } else {
                    AnonymousClass8SC A0713 = AnonymousClass8NN.A07(r6);
                    A0713.bitField0_ |= 512;
                    A0713.directPath_ = str6;
                }
                if (r152.A09 == 7) {
                    AnonymousClass8SC A0714 = AnonymousClass8NN.A07(r6);
                    A0714.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    A0714.contactVcard_ = true;
                }
                AnonymousClass8SC r02 = (AnonymousClass8SC) r6.A0R();
                AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r7, r02);
                A0F.documentMessage_ = r02;
                A0F.bitField0_ |= 64;
                return;
            }
            throw C165567td.A0K(0);
        }
        throw C165567td.A0K(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        if (r7.length() == 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlI(X.AnonymousClass9XL r13) {
        /*
            r12 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.8RS r2 = r13.A02
            int r0 = r2.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01b9
            java.lang.String r1 = r13.A04
            java.lang.String r0 = "medianotify"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x01b9
            X.8S7 r3 = r2.documentMessage_
            if (r3 != 0) goto L_0x001c
            X.8S7 r3 = X.AnonymousClass8S7.DEFAULT_INSTANCE
        L_0x001c:
            X.3Qa r4 = r13.A03
            long r0 = r13.A01
            X.2by r2 = new X.2by
            r2.<init>(r4, r0)
            X.AnonymousClass00C.A0B(r3)
            r4 = 1
            X.AnonymousClass00C.A0D(r3, r4)
            X.3Qj r6 = new X.3Qj
            r6.<init>()
            r2.A01 = r6
            int r0 = r3.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x01a9
            X.AUx r0 = r3.mediaKey_
            byte[] r0 = r0.A06()
            X.C131806Qs.A00(r6, r2, r0)
            int r0 = r3.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0053
            long r0 = r3.mediaKeyTimestamp_
            long r0 = r0 * r10
            r6.A0D = r0
        L_0x0053:
            X.AUx r0 = r3.jpegThumbnail_
            byte[] r1 = r0.A06()
            X.AnonymousClass00C.A0B(r1)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0064
            r2.A02 = r4
            r2.A1C(r1)
        L_0x0064:
            int r1 = r3.bitField0_
            r0 = r1 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r7 = "; message.key="
            if (r0 == 0) goto L_0x007a
            long r4 = r3.fileLength_
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0193
            r2.A00 = r4
        L_0x007a:
            r0 = r1 & 4
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r9 = 14
            java.lang.String r8 = "FMessageDocument/bogus sha-256 hash received; length="
            r5 = 32
            r4 = 2
            if (r0 == 0) goto L_0x0098
            X.AUx r0 = r3.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r5) goto L_0x0187
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r4)
            r2.A04 = r0
        L_0x0098:
            int r0 = r3.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ad
            X.AUx r0 = r3.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r5) goto L_0x017b
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r4)
            r2.A03 = r0
        L_0x00ad:
            java.lang.String r7 = r3.title_
            if (r7 == 0) goto L_0x00b8
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = X.AnonymousClass14B.A0C(r7, r5)
            r2.A02 = r0
        L_0x00c3:
            int r0 = r3.pageCount_
            r2.A00 = r0
            java.lang.String r1 = r3.caption_
            if (r1 == 0) goto L_0x00d4
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00d4
            r2.A1k(r1)
        L_0x00d4:
            java.lang.String r1 = r3.fileName_
            if (r1 == 0) goto L_0x00e4
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = X.AnonymousClass14B.A0C(r1, r5)
            r2.A06 = r0
        L_0x00e4:
            int r0 = r3.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r3.directPath_
            r6.A0J = r0
        L_0x00ee:
            int r1 = r3.bitField0_
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0158
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0158
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0158
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0158
            X.3L1 r5 = new X.3L1
            r5.<init>()
            java.lang.String r0 = r3.thumbnailDirectPath_
            r5.A04 = r0
            X.AUx r0 = r3.thumbnailSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            r5.A08 = r0
            X.AUx r0 = r3.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            r5.A05 = r0
            X.AUx r0 = r3.mediaKey_
            byte[] r0 = r0.A06()
            r5.A0A = r0
            int r4 = r3.bitField0_
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0134
            long r0 = r3.mediaKeyTimestamp_
            long r0 = r0 * r10
            r5.A02 = r0
        L_0x0134:
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0140
            X.AUx r0 = r3.jpegThumbnail_
            byte[] r0 = r0.A06()
            r5.A0B = r0
        L_0x0140:
            int r1 = r3.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x014b
            int r0 = r3.thumbnailWidth_
            r5.A01 = r0
        L_0x014b:
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0155
            int r0 = r3.thumbnailHeight_
            r5.A00 = r0
        L_0x0155:
            r2.A12(r5)
        L_0x0158:
            java.lang.String r0 = r3.mimetype_
            r2.A05 = r0
            boolean r0 = r3.contactVcard_
            if (r0 == 0) goto L_0x0163
            r0 = 7
            r2.A09 = r0
        L_0x0163:
            return r2
        L_0x0164:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            X.C165577te.A1F(r2, r0, r1)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.11F r0 = r2.A0J()
            X.C36351kA.A1L(r0, r1)
            goto L_0x00ee
        L_0x017b:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C165567td.A19(r2, r7, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        L_0x0187:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r8)
            X.C165567td.A19(r2, r7, r0)
            X.1Tb r0 = X.C165567td.A0J(r9)
            throw r0
        L_0x0193:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/bogus media size received; file_length="
            r1.append(r0)
            r1.append(r4)
            X.C165567td.A19(r2, r7, r1)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x01a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageDocument/missing media key; message.key="
            X.C165567td.A19(r2, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x01b9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AB9.BlI(X.9XL):X.3T1");
    }

    public AB9(C202909ms r1) {
        this.A00 = r1;
    }
}
