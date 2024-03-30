package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

/* renamed from: X.9ms  reason: invalid class name and case insensitive filesystem */
public final class C202909ms {
    public final C20810yC A00;

    public C202909ms(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass8S8 r11, C46932bu r12) {
        C65013Qj r4 = new C65013Qj();
        r12.A01 = r4;
        if ((r11.bitField0_ & 16) != 0) {
            C131806Qs.A00(r4, r12, r11.mediaKey_.A06());
            byte[] A06 = r11.streamingSidecar_.A06();
            if (A06.length != 0) {
                AnonymousClass6Q6 A1Y = r12.A1Y();
                C18740tg.A06(A1Y);
                synchronized (A1Y) {
                    A1Y.A03(A06, (int[]) null);
                }
            }
            if (AnonymousClass000.A1P(r11.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
                r4.A0D = r11.mediaKeyTimestamp_ * 1000;
            }
            byte[] A062 = r11.jpegThumbnail_.A06();
            AnonymousClass00C.A0B(A062);
            if (A062.length != 0) {
                r12.A02 = 1;
                r12.A1D(A062, false);
            }
            long j = r11.fileLength_;
            if (j > 0) {
                r12.A00 = j;
                r4.A0A = r11.width_;
                r4.A06 = r11.height_;
                byte[] A063 = r11.fileSha256_.A06();
                int length = A063.length;
                if (length == 32) {
                    r12.A04 = Base64.encodeToString(A063, 2);
                    if ((r11.bitField0_ & 512) != 0) {
                        byte[] A064 = r11.fileEncSha256_.A06();
                        int length2 = A064.length;
                        if (length2 == 32) {
                            r12.A03 = Base64.encodeToString(A064, 2);
                        } else {
                            C165567td.A19(r12, "; message.key=", C90464aC.A0h(length2, "FMessageVideoCommon/bogus sha-256 hash received; length="));
                            throw C165567td.A0J(14);
                        }
                    }
                    if (AnonymousClass1DC.A08(r11.mimetype_, true) != null) {
                        r12.A05 = r11.mimetype_;
                        String str = r11.caption_;
                        if (!(str == null || str.length() == 0)) {
                            C165607th.A1G(r12, str);
                        }
                        if ((r11.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                            r4.A0J = r11.directPath_;
                        } else {
                            C165567td.A19(r12, "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key=", AnonymousClass000.A0u());
                        }
                        int i = r11.bitField0_;
                        if (!((32768 & i) == 0 || (131072 & i) == 0 || (i & 65536) == 0)) {
                            AnonymousClass3L1 r2 = new AnonymousClass3L1();
                            r2.A04 = r11.thumbnailDirectPath_;
                            C165587tf.A13(r11.thumbnailEncSha256_, r2, r11.thumbnailSha256_.A06());
                            r2.A0A = r11.mediaKey_.A06();
                            r2.A02 = r11.mediaKeyTimestamp_ * 1000;
                            r12.A12(r2);
                        }
                        r12.A0B = r11.seconds_;
                        return;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("FMessageVideoCommon/unrecognized video mime type; mimeType=");
                    A0u.append(r11.mimetype_);
                    C165567td.A19(r12, "; message.key=", A0u);
                    throw C165567td.A0J(17);
                }
                C165567td.A19(r12, "; message.key=", C90464aC.A0h(length, "FMessageVideoCommon/bogus sha-256 hash received; length="));
                throw C165567td.A0J(14);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("FMessageVideoCommon/bogus media size received; file_length=");
            A0u2.append(j);
            C165567td.A19(r12, "; message.key=", A0u2);
            throw C165567td.A0J(13);
        }
        C165567td.A19(r12, "FMessageVideoCommon/missing media key; message.key=", AnonymousClass000.A0u());
        throw C165567td.A0J(16);
    }

    public final AnonymousClass8NH A01(AnonymousClass8NH r11, C46932bu r12, boolean z) {
        byte[] bArr;
        boolean z2;
        C36331k8.A1I(r12, r11);
        C65013Qj r4 = r12.A01;
        C63683Kz A0V = r12.A0V();
        AnonymousClass00C.A08(A0V);
        if (r4 == null || (bArr = r4.A0a) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165577te.A1F(r12, "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key=", A0u);
            C165567td.A1A(r12, "; media_wa_type=", A0u);
            return null;
        }
        int length = bArr.length;
        if (length != 32) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("FMessageVideoCommon/buildE2eMessage/media key incorrect length; length=");
            A0u2.append(length);
            C165567td.A19(r12, "; message.key=", A0u2);
        }
        String str = r12.A07;
        if (AnonymousClass2bU.A03(str)) {
            C64933Qa r3 = r12.A1J;
            if (!C203359nq.A0D(r3, str)) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("FMessageVideoCommon/buildE2eMessage/sending image with invalid url");
                A0u3.append(str);
                C36321k7.A1L(r3, "; message.key=", A0u3);
            }
        }
        String str2 = r12.A05;
        if (!(str2 == null || str2.length() == 0)) {
            C18740tg.A06(str2);
            AnonymousClass8SE A0C = AnonymousClass8NN.A0C(r11);
            A0C.bitField0_ |= 2;
            A0C.mimetype_ = str2;
        }
        String str3 = r12.A04;
        if (!(str3 == null || str3.length() == 0)) {
            AnonymousClass8I5 A02 = AnonymousClass8NN.A02(r11, str3);
            AnonymousClass8SE r1 = (AnonymousClass8SE) r11.A00;
            int i = AnonymousClass8SE.ANNOTATIONS_FIELD_NUMBER;
            r1.bitField0_ |= 4;
            r1.fileSha256_ = A02;
        }
        String str4 = r12.A03;
        if (!(str4 == null || str4.length() == 0)) {
            AnonymousClass8I5 A022 = AnonymousClass8NN.A02(r11, str4);
            AnonymousClass8SE r13 = (AnonymousClass8SE) r11.A00;
            int i2 = AnonymousClass8SE.ANNOTATIONS_FIELD_NUMBER;
            r13.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r13.fileEncSha256_ = A022;
        }
        long j = r12.A00;
        if (j > 0) {
            AnonymousClass8SE A0C2 = AnonymousClass8NN.A0C(r11);
            A0C2.bitField0_ |= 8;
            A0C2.fileLength_ = j;
            long j2 = r12.A00;
            if (j2 <= 0) {
                StringBuilder A0u4 = AnonymousClass000.A0u();
                A0u4.append("FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size=");
                A0u4.append(j2);
                C165567td.A19(r12, "; message.key=", A0u4);
            }
        }
        if (r12.A0B > 0) {
            int i3 = r12.A0B;
            AnonymousClass8SE A0C3 = AnonymousClass8NN.A0C(r11);
            A0C3.bitField0_ |= 16;
            A0C3.seconds_ = i3;
        }
        String A1a = r12.A1a();
        if (A1a != null) {
            AnonymousClass8SE A0C4 = AnonymousClass8NN.A0C(r11);
            A0C4.bitField0_ |= 64;
            A0C4.caption_ = A1a;
        }
        byte[] bArr2 = r4.A0a;
        if (bArr2 != null) {
            AnonymousClass8I5 A01 = C21674AUx.A01(bArr2, 0, bArr2.length);
            AnonymousClass8SE A0C5 = AnonymousClass8NN.A0C(r11);
            A0C5.bitField0_ |= 32;
            A0C5.mediaKey_ = A01;
        }
        long j3 = r4.A0D;
        if (j3 > 0) {
            long A0B = C36391kE.A0B(j3);
            AnonymousClass8SE A0C6 = AnonymousClass8NN.A0C(r11);
            A0C6.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            A0C6.mediaKeyTimestamp_ = A0B;
        }
        AnonymousClass3L1 r7 = r12.A0a;
        if (r7 == null || r7.A04 == null || r7.A08 == null || r7.A05 == null || !Arrays.equals(r7.A0A, r4.A0a) || r7.A02 != r4.A0D) {
            z2 = true;
        } else {
            z2 = r7.A0C;
            String str5 = r7.A04;
            AnonymousClass8SE A0C7 = AnonymousClass8NN.A0C(r11);
            str5.getClass();
            A0C7.bitField0_ |= 262144;
            A0C7.thumbnailDirectPath_ = str5;
            AnonymousClass8I5 A023 = AnonymousClass8NN.A02(r11, r7.A08);
            AnonymousClass8SE r2 = (AnonymousClass8SE) r11.A00;
            r2.bitField0_ |= 524288;
            r2.thumbnailSha256_ = A023;
            AnonymousClass8I5 A024 = AnonymousClass8NN.A02(r11, r7.A05);
            AnonymousClass8SE r22 = (AnonymousClass8SE) r11.A00;
            r22.bitField0_ |= 1048576;
            r22.thumbnailEncSha256_ = A024;
        }
        if (z || A0V.A02() == null || !z2) {
            C165567td.A19(r12, "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key=", AnonymousClass000.A0u());
        } else {
            byte[] A025 = A0V.A02();
            AnonymousClass8I5 A012 = C21674AUx.A01(A025, 0, A025.length);
            AnonymousClass8SE A0C8 = AnonymousClass8NN.A0C(r11);
            A0C8.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            A0C8.jpegThumbnail_ = A012;
        }
        int i4 = r4.A06;
        if (i4 > 0 && r4.A0A > 0) {
            AnonymousClass8SE A0C9 = AnonymousClass8NN.A0C(r11);
            A0C9.bitField0_ |= 256;
            A0C9.height_ = i4;
            int i5 = r4.A0A;
            AnonymousClass8SE r14 = (AnonymousClass8SE) C90524aI.A0H(r11);
            r14.bitField0_ |= 512;
            r14.width_ = i5;
        }
        String str6 = r4.A0J;
        if (str6 == null || str6.length() == 0) {
            StringBuilder A0u5 = AnonymousClass000.A0u();
            C165577te.A1F(r12, "FMessageVideoCommon/message without direct path received; message.key=", A0u5);
            A0u5.append("; message.senderJid=");
            C36351kA.A1L(r12.A0J(), A0u5);
            return r11;
        }
        AnonymousClass8SE A0C10 = AnonymousClass8NN.A0C(r11);
        A0C10.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A0C10.directPath_ = str6;
        return r11;
    }
}
