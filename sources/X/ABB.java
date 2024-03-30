package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

public final class ABB implements B6B {
    public final C202909ms A00;

    public AnonymousClass3T1 BlI(AnonymousClass9XL r14) {
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass8RS r1 = r14.A02;
        if ((r1.bitField0_ & 2) == 0) {
            return null;
        }
        AnonymousClass8SB r6 = r1.imageMessage_;
        if (r6 == null) {
            r6 = AnonymousClass8SB.DEFAULT_INSTANCE;
        }
        C46882bp r3 = new C46882bp(r14.A03, r14.A01);
        AnonymousClass00C.A0B(r6);
        AnonymousClass00C.A0D(r6, 1);
        C65013Qj r5 = new C65013Qj();
        r3.A01 = r5;
        if ((r6.bitField0_ & 64) != 0) {
            byte[] A06 = r6.mediaKey_.A06();
            AnonymousClass00C.A0B(A06);
            if (A06.length != 0) {
                C131806Qs.A00(r5, r3, A06);
            }
            int i = r6.bitField0_;
            if (AnonymousClass000.A1P(i & 512)) {
                r5.A0D = r6.mediaKeyTimestamp_ * 1000;
            }
            if (!(!AnonymousClass000.A1P(32768 & i) || (131072 & i) == 0 || (i & 65536) == 0)) {
                AnonymousClass3L1 r2 = new AnonymousClass3L1();
                r2.A04 = r6.thumbnailDirectPath_;
                C165587tf.A13(r6.thumbnailEncSha256_, r2, r6.thumbnailSha256_.A06());
                r2.A0A = r6.mediaKey_.A06();
                r2.A02 = r6.mediaKeyTimestamp_ * 1000;
                r3.A12(r2);
            }
            int size = r6.scanLengths_.size();
            if (AnonymousClass000.A1P(r6.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) && size > 0) {
                byte[] A062 = r6.scansSidecar_.A06();
                int[] iArr = new int[size];
                int i2 = 0;
                do {
                    AnonymousClass8I0 r0 = (AnonymousClass8I0) r6.scanLengths_;
                    AnonymousClass8I0.A00(r0, i2);
                    i2 = C165607th.A0E(r0.A01, iArr, i2);
                } while (i2 < size);
                if (size >= 2 && A062.length / 10 == size) {
                    AnonymousClass6Q6 A1Y = r3.A1Y();
                    C18740tg.A06(A1Y);
                    A1Y.A03(A062, iArr);
                    if ((r6.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                        byte[] A063 = r6.midQualityFileSha256_.A06();
                        if (A063.length == 32) {
                            r5.A0O = Base64.encodeToString(A063, 2);
                        }
                    }
                    if ((r6.bitField0_ & 16384) != 0) {
                        byte[] A064 = r6.midQualityFileEncSha256_.A06();
                        if (A064.length == 32) {
                            r5.A0N = Base64.encodeToString(A064, 2);
                        }
                    }
                    byte[] bArr = new byte[10];
                    C21674AUx aUx = r6.scansSidecar_;
                    C21674AUx.A00(0, 10, aUx.A02());
                    aUx.A05(bArr, 10);
                    r5.A0X = bArr;
                    r5.A04 = iArr[0];
                }
            }
            byte[] A065 = r6.jpegThumbnail_.A06();
            AnonymousClass00C.A0B(A065);
            if (A065.length != 0) {
                r3.A02 = 1;
                r3.A1C(A065);
            }
            long j = r6.fileLength_;
            if (j >= 0) {
                r3.A00 = j;
                byte[] A066 = r6.fileSha256_.A06();
                int length = A066.length;
                if (length == 32) {
                    r3.A04 = Base64.encodeToString(A066, 2);
                    if ((r6.bitField0_ & 128) != 0) {
                        byte[] A067 = r6.fileEncSha256_.A06();
                        int length2 = A067.length;
                        if (length2 == 32) {
                            r3.A03 = Base64.encodeToString(A067, 2);
                        } else {
                            C165567td.A19(r3, "; message.key=", C90464aC.A0h(length2, "FMessageImageCommon/bogus sha-256 hash received; length="));
                            throw C165567td.A0J(14);
                        }
                    }
                    String str = r6.caption_;
                    if (!(str == null || str.length() == 0)) {
                        C165607th.A1G(r3, str);
                    }
                    String str2 = r6.mimetype_;
                    if ("image/jpeg".equalsIgnoreCase(str2) || "image/png".equalsIgnoreCase(str2)) {
                        r3.A05 = str2;
                        r5.A0J = r6.directPath_;
                        r5.A0A = r6.width_;
                        r5.A06 = r6.height_;
                        return r3;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("FMessageImageCommon/invalid mime type; mimetype=");
                    A0u.append(str2);
                    C165567td.A19(r3, "; message.key=", A0u);
                    throw C165567td.A0J(17);
                }
                C165567td.A19(r3, "; message.key=", C90464aC.A0h(length, "FMessageImageCommon/bogus sha-256 hash received; length="));
                throw C165567td.A0J(14);
            }
            throw C165567td.A0J(13);
        }
        C165567td.A19(r3, "FMessageImageCommon/missing media key; message.key=", AnonymousClass000.A0u());
        throw C165567td.A0J(16);
    }

    public void B25(C192559Hl r17, AnonymousClass3T1 r18) {
        int length;
        int length2;
        AnonymousClass3T1 r7 = r18;
        C192559Hl r10 = r17;
        C36331k8.A1I(r7, r10);
        if (r7 instanceof C46882bp) {
            AnonymousClass2bU r72 = (AnonymousClass2bU) r7;
            AnonymousClass8NL r9 = r10.A00;
            AnonymousClass8SF r0 = ((AnonymousClass8SX) r9.A00).imageMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            AnonymousClass8NJ r6 = (AnonymousClass8NJ) r0.A0q();
            C36331k8.A1I(r72, r6);
            C65013Qj r8 = r72.A01;
            C63683Kz A0V = r72.A0V();
            AnonymousClass00C.A08(A0V);
            if (r8 != null) {
                String str = r72.A05;
                boolean z = true;
                if (str == null) {
                    AnonymousClass8SF A09 = AnonymousClass8NN.A09(r6);
                    A09.bitField0_ |= 2;
                    A09.mimetype_ = "image/jpeg";
                } else if ("image/jpeg".equalsIgnoreCase(str) || "image/png".equalsIgnoreCase(str)) {
                    AnonymousClass8SF A092 = AnonymousClass8NN.A09(r6);
                    A092.bitField0_ |= 2;
                    A092.mimetype_ = str;
                } else {
                    throw C165567td.A0K(17);
                }
                String A1a = r72.A1a();
                if (A1a != null) {
                    AnonymousClass8SF A093 = AnonymousClass8NN.A09(r6);
                    A093.bitField0_ |= 4;
                    A093.caption_ = A1a;
                }
                byte[] decode = Base64.decode(r72.A04, 0);
                int length3 = decode.length;
                AnonymousClass8I5 A01 = C21674AUx.A01(decode, 0, length3);
                AnonymousClass8SF A094 = AnonymousClass8NN.A09(r6);
                A094.bitField0_ |= 8;
                A094.fileSha256_ = A01;
                if (length3 == 32) {
                    String str2 = r72.A03;
                    if (!(str2 == null || str2.length() == 0)) {
                        byte[] decode2 = Base64.decode(str2, 0);
                        int length4 = decode2.length;
                        AnonymousClass8I5 A012 = C21674AUx.A01(decode2, 0, length4);
                        AnonymousClass8SF r1 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        r1.bitField0_ |= 256;
                        r1.fileEncSha256_ = A012;
                        if (length4 != 32) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("FMessageImageCommon/bogus sha-256 enc hash; length=");
                            A0u.append(length4);
                            C165567td.A19(r72, "; message.key=", A0u);
                            throw C165567td.A0K(14);
                        }
                    }
                    long j = r72.A00;
                    AnonymousClass8SF A095 = AnonymousClass8NN.A09(r6);
                    A095.bitField0_ |= 16;
                    A095.fileLength_ = j;
                    long j2 = r72.A00;
                    if (j2 <= 0) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("FMessageImageCommon/buildE2eInteropMessage/sending image with media size not set, size=");
                        A0u2.append(j2);
                        C165567td.A19(r72, "; message.key=", A0u2);
                    }
                    long j3 = r72.A00;
                    AnonymousClass8SF A096 = AnonymousClass8NN.A09(r6);
                    A096.bitField0_ |= 16;
                    A096.fileLength_ = j3;
                    byte[] bArr = r8.A0a;
                    if (!(bArr == null || (length2 = bArr.length) == 32)) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
                        A0u3.append(length2);
                        C165567td.A19(r72, "; message.key=", A0u3);
                    }
                    AnonymousClass8I5 A03 = AnonymousClass8NN.A03(r6, r8.A0a);
                    AnonymousClass8SF r12 = (AnonymousClass8SF) r6.A00;
                    r12.bitField0_ |= 128;
                    r12.mediaKey_ = A03;
                    long j4 = r8.A0D;
                    if (j4 > 0) {
                        long A0B = C36391kE.A0B(j4);
                        AnonymousClass8SF r3 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        r3.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r3.mediaKeyTimestamp_ = A0B;
                    }
                    int i = r8.A06;
                    if (i > 0 && r8.A0A > 0) {
                        AnonymousClass8SF r13 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        r13.bitField0_ |= 32;
                        r13.height_ = i;
                        int i2 = r8.A0A;
                        AnonymousClass8SF r14 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        r14.bitField0_ |= 64;
                        r14.width_ = i2;
                    }
                    String str3 = r8.A0J;
                    if (str3 == null || str3.length() == 0) {
                        C165567td.A19(r72, "FMessageImageCommon/buildE2eInteropMessage/sending image with directPath not set; message.key=", AnonymousClass000.A0u());
                    } else {
                        AnonymousClass8SF r15 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        r15.bitField0_ |= 512;
                        r15.directPath_ = str3;
                    }
                    AnonymousClass6Q6 A1Y = r72.A1Y();
                    if (A1Y != null) {
                        byte[] A05 = A1Y.A05();
                        int[] A06 = A1Y.A06();
                        if (!(A06 == null || A05 == null || (length = A06.length) < 2)) {
                            int length5 = A05.length;
                            if (length5 / 10 == length) {
                                AnonymousClass8I5 A013 = C21674AUx.A01(A05, 0, length5);
                                AnonymousClass8SF r2 = (AnonymousClass8SF) C90524aI.A0H(r6);
                                r2.bitField0_ |= 65536;
                                r2.scansSidecar_ = A013;
                                int i3 = 0;
                                do {
                                    int i4 = A06[i3];
                                    AnonymousClass8SF r22 = (AnonymousClass8SF) C90524aI.A0H(r6);
                                    B62 b62 = r22.scanLengths_;
                                    boolean z2 = ((C21886AcE) b62).A00;
                                    AnonymousClass8I0 r16 = b62;
                                    if (!z2) {
                                        AnonymousClass8I0 A097 = C170918Hz.A09(b62);
                                        r22.scanLengths_ = A097;
                                        r16 = A097;
                                    }
                                    r16.B0O(i4);
                                    i3++;
                                } while (i3 < length);
                                z = !A1Y.A05;
                                String str4 = r8.A0O;
                                if (!(str4 == null || str4.length() == 0)) {
                                    AnonymousClass8I5 A02 = AnonymousClass8NN.A02(r6, str4);
                                    AnonymousClass8SF r23 = (AnonymousClass8SF) r6.A00;
                                    r23.bitField0_ |= C132986Wc.A0F;
                                    r23.midQualityFileSha256_ = A02;
                                }
                            }
                        }
                    }
                    AnonymousClass3L1 r11 = r72.A0a;
                    if (!(r11 == null || r11.A04 == null || r11.A08 == null || r11.A05 == null || !Arrays.equals(r11.A0A, r8.A0a) || r11.A02 != r8.A0D)) {
                        z = r11.A0C;
                        String str5 = r11.A04;
                        AnonymousClass8SF r24 = (AnonymousClass8SF) C90524aI.A0H(r6);
                        str5.getClass();
                        r24.bitField0_ |= 1048576;
                        r24.thumbnailDirectPath_ = str5;
                        AnonymousClass8I5 A022 = AnonymousClass8NN.A02(r6, r11.A08);
                        AnonymousClass8SF r25 = (AnonymousClass8SF) r6.A00;
                        r25.bitField0_ |= 2097152;
                        r25.thumbnailSha256_ = A022;
                        AnonymousClass8I5 A023 = AnonymousClass8NN.A02(r6, r11.A05);
                        AnonymousClass8SF r26 = (AnonymousClass8SF) r6.A00;
                        r26.bitField0_ |= 4194304;
                        r26.thumbnailEncSha256_ = A023;
                    }
                    if (r10.A01 || A0V.A02() == null || !z) {
                        C165567td.A19(r72, "FMessageImageCommon/buildE2eInteropMessage/image thumbnail missing; message.key=", AnonymousClass000.A0u());
                    } else {
                        byte[] A024 = A0V.A02();
                        AnonymousClass8I5 A014 = C21674AUx.A01(A024, 0, A024.length);
                        AnonymousClass8SF A098 = AnonymousClass8NN.A09(r6);
                        A098.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                        A098.jpegThumbnail_ = A014;
                    }
                    r9.A0Z((AnonymousClass8SF) r6.A0R());
                    return;
                }
                StringBuilder A0u4 = AnonymousClass000.A0u();
                A0u4.append("FMessageImageCommon/bogus sha-256 hash; length=");
                A0u4.append(length3);
                C165567td.A19(r72, "; message.key=", A0u4);
                throw C165567td.A0K(14);
            }
            StringBuilder A0u5 = AnonymousClass000.A0u();
            C165577te.A1F(r72, "FMessageImageCommon/buildE2eInteropMessage/unable to send encrypted media message due to missing mediaKey; message.key=", A0u5);
            C165567td.A1A(r72, "; media_wa_type=", A0u5);
            return;
        }
        throw C165567td.A0K(0);
    }

    public ABB(C202909ms r1) {
        this.A00 = r1;
    }
}
