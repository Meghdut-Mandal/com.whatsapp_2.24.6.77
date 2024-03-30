package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

/* renamed from: X.ABz  reason: case insensitive filesystem */
public class C21191ABz implements C22938Ayo, C22942Ays, C17740rx {
    public final C20810yC A00;
    public final C202029kv A01;
    public final C198889eM A02;

    public static AnonymousClass8N5 A00(C196159Xy r9, C46962bx r10, C21191ABz aBz) {
        C65013Qj r3 = r10.A01;
        C64933Qa r2 = r10.A1J;
        boolean z = r2.A00 instanceof C28981Uw;
        if (r3 == null || (r3.A0a == null && !r9.A02() && !z)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key=");
            A0u.append(r2);
            C165567td.A1A(r10, "; media_wa_type=", A0u);
            if (z || !r9.A03 || !C165597tg.A1R(aBz.A00)) {
                return null;
            }
            throw C165567td.A0K(16);
        }
        AnonymousClass8SA r0 = ((AnonymousClass8SX) r9.A00.A00).stickerMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8SA.DEFAULT_INSTANCE;
        }
        AnonymousClass8N5 r4 = (AnonymousClass8N5) r0.A0q();
        byte[] bArr = r3.A0a;
        if (bArr != null) {
            int length = bArr.length;
            if (length == 32 || !r9.A03 || !C165597tg.A1R(aBz.A00)) {
                AnonymousClass8I5 A0O = C90474aD.A0O(r4, r3.A0a);
                AnonymousClass8SA r1 = (AnonymousClass8SA) r4.A00;
                int i = AnonymousClass8SA.CONTEXT_INFO_FIELD_NUMBER;
                r1.bitField0_ |= 8;
                r1.mediaKey_ = A0O;
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("FMessageSticker/buildE2eMessage/media key incorrect length; length=");
                A0u2.append(length);
                C36321k7.A1L(r2, "; message.key=", A0u2);
                throw C165567td.A0K(16);
            }
        } else {
            Log.w("FMessageSticker/buildE2eMessage/sticker media key missing");
        }
        long j = r3.A0D;
        if (j > 0) {
            long A0B = C36391kE.A0B(j);
            AnonymousClass8SA A0B2 = AnonymousClass8NN.A0B(r4);
            A0B2.bitField0_ |= 512;
            A0B2.mediaKeyTimestamp_ = A0B;
        }
        if (!TextUtils.isEmpty(r10.A03)) {
            byte[] decode = Base64.decode(r10.A03, 0);
            int length2 = decode.length;
            if (length2 == 32 || !r9.A03 || !C165597tg.A1R(aBz.A00)) {
                AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, length2);
                AnonymousClass8SA A0B3 = AnonymousClass8NN.A0B(r4);
                A0B3.bitField0_ |= 4;
                A0B3.fileEncSha256_ = A012;
            } else {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("FMessageSticker/bogus sha-256 enc hash; length=");
                A0u3.append(length2);
                C36321k7.A1L(r2, "; message.key=", A0u3);
                throw C165567td.A0K(14);
            }
        }
        if (!TextUtils.isEmpty(r10.A04)) {
            byte[] decode2 = Base64.decode(r10.A04, 0);
            int length3 = decode2.length;
            if (length3 == 32 || !r9.A03 || !C165597tg.A1R(aBz.A00)) {
                AnonymousClass8I5 A013 = C21674AUx.A01(decode2, 0, length3);
                AnonymousClass8SA A0B4 = AnonymousClass8NN.A0B(r4);
                A0B4.bitField0_ |= 2;
                A0B4.fileSha256_ = A013;
            } else {
                StringBuilder A0u4 = AnonymousClass000.A0u();
                A0u4.append("FMessageSticker/bogus sha-256 hash; length=");
                A0u4.append(length3);
                C36321k7.A1L(r2, "; message.key=", A0u4);
                throw C165567td.A0K(14);
            }
        }
        int i2 = r3.A06;
        if (i2 > 0 && r3.A0A > 0) {
            AnonymousClass8SA A0B5 = AnonymousClass8NN.A0B(r4);
            A0B5.bitField0_ |= 32;
            A0B5.height_ = i2;
            int i3 = r3.A0A;
            AnonymousClass8SA r12 = (AnonymousClass8SA) C90524aI.A0H(r4);
            r12.bitField0_ |= 64;
            r12.width_ = i3;
        }
        C80103un r5 = r9.A02;
        byte[] bArr2 = r9.A0B;
        if (C202029kv.A02(r5, r10, bArr2)) {
            AnonymousClass8SG A002 = C196159Xy.A00(aBz.A01, r9, r5, r10, bArr2);
            AnonymousClass8SA A0B6 = AnonymousClass8NN.A0B(r4);
            A002.getClass();
            A0B6.contextInfo_ = A002;
            A0B6.bitField0_ |= 16384;
        }
        String str = r10.A07;
        if (str != null) {
            if (C203359nq.A0D(r2, str) || !r9.A03 || !C165597tg.A1R(aBz.A00)) {
                AnonymousClass8SA A0B7 = AnonymousClass8NN.A0B(r4);
                A0B7.bitField0_ |= 1;
                A0B7.url_ = str;
            } else {
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append("FMessageSticker/buildE2eMessage/sending image with invalid url");
                A0u5.append(str);
                C36321k7.A1L(r2, "; message.key=", A0u5);
                throw C165567td.A0K(15);
            }
        }
        String str2 = r10.A05;
        if (str2 != null) {
            if (r10.A1l() ? !"application/was".equalsIgnoreCase(str2) : !"image/webp".equalsIgnoreCase(str2)) {
                if (r9.A03 && C165597tg.A1R(aBz.A00)) {
                    StringBuilder A0u6 = AnonymousClass000.A0u();
                    A0u6.append("FMessageSticker/invalid mime type; mimetype=");
                    A0u6.append(str2);
                    C36321k7.A1L(r2, "; message.key=", A0u6);
                    throw C165567td.A0K(17);
                }
            }
            AnonymousClass8SA A0B8 = AnonymousClass8NN.A0B(r4);
            A0B8.bitField0_ |= 16;
            A0B8.mimetype_ = str2;
        }
        if (!TextUtils.isEmpty(r3.A0J)) {
            String str3 = r3.A0J;
            AnonymousClass8SA A0B9 = AnonymousClass8NN.A0B(r4);
            str3.getClass();
            A0B9.bitField0_ |= 128;
            A0B9.directPath_ = str3;
        }
        long j2 = r10.A00;
        if (j2 > 0) {
            AnonymousClass8SA A0B10 = AnonymousClass8NN.A0B(r4);
            A0B10.bitField0_ |= 256;
            A0B10.fileLength_ = j2;
        }
        int i4 = r3.A04;
        if (i4 > 0) {
            AnonymousClass8SA A0B11 = AnonymousClass8NN.A0B(r4);
            A0B11.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            A0B11.firstFrameLength_ = i4;
        }
        byte[] bArr3 = r3.A0X;
        if (bArr3 != null) {
            AnonymousClass8I5 A03 = AnonymousClass8NN.A03(r4, bArr3);
            AnonymousClass8SA r13 = (AnonymousClass8SA) r4.A00;
            int i5 = AnonymousClass8SA.CONTEXT_INFO_FIELD_NUMBER;
            r13.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r13.firstFrameSidecar_ = A03;
        }
        boolean z2 = r10.A03;
        AnonymousClass8SA A0B12 = AnonymousClass8NN.A0B(r4);
        A0B12.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A0B12.isAnimated_ = z2;
        long j3 = r10.A04;
        AnonymousClass8SA r22 = (AnonymousClass8SA) C90524aI.A0H(r4);
        r22.bitField0_ |= 32768;
        r22.stickerSentTs_ = j3;
        boolean A1k = r10.A1k();
        AnonymousClass8SA r23 = (AnonymousClass8SA) C90524aI.A0H(r4);
        r23.bitField0_ |= 65536;
        r23.isAvatar_ = A1k;
        boolean A1j = r10.A1j();
        AnonymousClass8SA r24 = (AnonymousClass8SA) C90524aI.A0H(r4);
        r24.bitField0_ |= C132986Wc.A0F;
        r24.isAiSticker_ = A1j;
        boolean A1l = r10.A1l();
        AnonymousClass8SA r25 = (AnonymousClass8SA) C90524aI.A0H(r4);
        r25.bitField0_ |= 262144;
        r25.isLottie_ = A1l;
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r0 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C46962bx A01(X.AnonymousClass9YL r14) {
        /*
            r13 = this;
            X.8SX r0 = r14.A0A
            X.8SA r8 = r0.stickerMessage_
            if (r8 != 0) goto L_0x0008
            X.8SA r8 = X.AnonymousClass8SA.DEFAULT_INSTANCE
        L_0x0008:
            X.3Qa r2 = r14.A0C
            long r0 = r14.A04
            X.2bx r7 = new X.2bx
            r7.<init>(r2, r0)
            boolean r1 = r14.A03()
            X.3Qj r9 = new X.3Qj
            r9.<init>()
            r7.A01 = r9
            X.3Qa r6 = r7.A1J
            X.11F r0 = r6.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r1 != 0) goto L_0x0027
            r12 = 0
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r12 = 1
        L_0x0028:
            int r0 = r8.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0125
            X.AUx r0 = r8.mediaKey_
            byte[] r0 = r0.A06()
            X.C131806Qs.A00(r9, r7, r0)
        L_0x0037:
            int r11 = r8.bitField0_
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0044
            long r0 = r8.mediaKeyTimestamp_
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r9.A0D = r0
        L_0x0044:
            r5 = 14
            java.lang.String r4 = "FMessageSticker/bogus sha-256 hash received; length="
            r3 = 2
            r2 = 32
            java.lang.String r10 = "; message.key="
            if (r12 == 0) goto L_0x0053
            r0 = r11 & 2
            if (r0 == 0) goto L_0x0062
        L_0x0053:
            X.AUx r0 = r8.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r2) goto L_0x0163
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r7.A04 = r0
        L_0x0062:
            int r0 = r8.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0077
            X.AUx r0 = r8.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r2) goto L_0x0157
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r7.A03 = r0
        L_0x0077:
            if (r12 == 0) goto L_0x007f
            int r0 = r8.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00ad
        L_0x007f:
            java.lang.String r2 = r8.mimetype_
            boolean r0 = r8.isLottie_
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x00ab
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageSticker/invalid sticker mime type; mimetype="
            r1.append(r0)
            r1.append(r2)
            X.C36321k7.A1L(r6, r10, r1)
            r0 = 17
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x00a3:
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x008d
        L_0x00ab:
            r7.A05 = r2
        L_0x00ad:
            int r0 = r8.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r8.url_
            r7.A1e(r0)
        L_0x00b8:
            int r1 = r8.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00ca
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00ca
            int r0 = r8.height_
            r9.A06 = r0
            int r0 = r8.width_
            r9.A0A = r0
        L_0x00ca:
            if (r12 == 0) goto L_0x00d0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d4
        L_0x00d0:
            java.lang.String r0 = r8.directPath_
            r9.A0J = r0
        L_0x00d4:
            r0 = r1 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00e6
            long r4 = r8.fileLength_
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0141
            r7.A00 = r4
        L_0x00e6:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00f0
            int r0 = r8.firstFrameLength_
            if (r0 <= 0) goto L_0x00f0
            r9.A04 = r0
        L_0x00f0:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00fe
            X.AUx r0 = r8.firstFrameSidecar_
            if (r0 == 0) goto L_0x00fe
            byte[] r0 = r0.A06()
            r9.A0X = r0
        L_0x00fe:
            boolean r4 = r8.isAiSticker_
            boolean r1 = r8.isAvatar_
            boolean r0 = r8.isLottie_
            if (r4 == 0) goto L_0x0108
            r0 = r0 | 2
        L_0x0108:
            if (r1 == 0) goto L_0x010c
            r0 = r0 | 4
        L_0x010c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A01 = r0
            r7.A02 = r4
            boolean r0 = r8.isAnimated_
            r7.A03 = r0
            int r1 = r8.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0122
            long r2 = r8.stickerSentTs_
        L_0x0122:
            r7.A04 = r2
            return r7
        L_0x0125:
            if (r12 != 0) goto L_0x0037
            X.0yC r1 = r13.A00
            r0 = 4466(0x1172, float:6.258E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageSticker/no media key; message.key="
            X.C36321k7.A1L(r6, r0, r1)
            r0 = 16
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageSticker/bogus media size received; fileLength="
            r1.append(r0)
            r1.append(r4)
            X.C36321k7.A1L(r6, r10, r1)
            r0 = 13
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x0157:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r4)
            X.C36321k7.A1L(r6, r10, r0)
            X.1Tb r0 = X.C165567td.A0J(r5)
            throw r0
        L_0x0163:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r4)
            X.C36321k7.A1L(r6, r10, r0)
            X.1Tb r0 = X.C165567td.A0J(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21191ABz.A01(X.9YL):X.2bx");
    }

    public void B24(C196159Xy r5, AnonymousClass3T1 r6) {
        C165567td.A1B(r6, "FMessageStickerProtobuf: message type is not supported ", AnonymousClass000.A0u(), r6 instanceof C46962bx);
        C46962bx r62 = (C46962bx) r6;
        C202319lY r3 = r62.A0M;
        if (r3 != null) {
            this.A02.A01(r3, r5, new C23200B9i(this, 1), r62);
        } else if (r62.A1l()) {
            AnonymousClass8NL r32 = r5.A00;
            C172328Nk r0 = ((AnonymousClass8SX) r32.A00).lottieStickerMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            AnonymousClass8NC r2 = (AnonymousClass8NC) r0.A0q();
            AnonymousClass8NL r1 = (AnonymousClass8NL) C170918Hz.A0P(r2).A0q();
            AnonymousClass8N5 A002 = A00(r5, r62, this);
            if (A002 != null) {
                r1.A0f(A002);
                C172328Nk A003 = AnonymousClass8NC.A00(r1, r2);
                AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r32, A003);
                A0F.lottieStickerMessage_ = A003;
                A0F.bitField1_ |= 134217728;
            }
        } else {
            AnonymousClass8N5 A004 = A00(r5, r62, this);
            if (A004 != null) {
                r5.A00.A0f(A004);
            }
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r4) {
        AnonymousClass8SX r2 = r4.A0A;
        if (r2.A0z()) {
            return A01(r4);
        }
        if (!AnonymousClass000.A1P(r2.bitField1_ & 134217728)) {
            return null;
        }
        C172328Nk r0 = r2.lottieStickerMessage_;
        if (r0 == null) {
            r0 = C172328Nk.DEFAULT_INSTANCE;
        }
        AnonymousClass8SX r02 = r0.message_;
        AnonymousClass8SX r1 = r02;
        if (r02 == null) {
            r02 = AnonymousClass8SX.DEFAULT_INSTANCE;
        }
        if (r02.A0z()) {
            if (r1 == null) {
                r1 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
            return A01(r4.A01(r1));
        }
        throw C165567td.A0J(0);
    }

    public C21191ABz(C20810yC r1, C202029kv r2, C198889eM r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
