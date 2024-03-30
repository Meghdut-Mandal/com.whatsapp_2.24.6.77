package X;

import android.util.Base64;
import com.whatsapp.util.Log;

public class ABO implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r10, AnonymousClass3T1 r11) {
        if (r11 instanceof C180848mW) {
            C180848mW r112 = (C180848mW) r11;
            if (r112.A03 == null || r112.A01 == null || r112.A00 <= 0) {
                Log.w("FMessageMediaExpressPathNotify/buildE2EMessage unable to send media express path noitfy message due to missing params");
                throw C165567td.A0K(26);
            }
            AnonymousClass8NL r4 = r10.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r4);
            C172918Pr r0 = ((AnonymousClass8SQ) A0J.A00).mediaNotifyMessage_;
            if (r0 == null) {
                r0 = C172918Pr.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            String str = r112.A03;
            C64933Qa r5 = r112.A1J;
            if (C203359nq.A0D(r5, str)) {
                String str2 = r112.A03;
                C172918Pr r1 = (C172918Pr) C90524aI.A0H(A0q);
                int i = C172918Pr.EXPRESS_PATH_URL_FIELD_NUMBER;
                str2.getClass();
                r1.bitField0_ |= 1;
                r1.expressPathUrl_ = str2;
                long j = r112.A00;
                if (j >= 0) {
                    C172918Pr r7 = (C172918Pr) C90524aI.A0H(A0q);
                    r7.bitField0_ |= 4;
                    r7.fileLength_ = j;
                    try {
                        byte[] decode = Base64.decode(r112.A01, 2);
                        C22898AyA ayA = C21674AUx.A01;
                        AnonymousClass8I5 A0O = C90474aD.A0O(A0q, decode);
                        C172918Pr r12 = (C172918Pr) A0q.A00;
                        r12.bitField0_ |= 2;
                        r12.fileEncSha256_ = A0O;
                        if (r112.A02 == null) {
                            A0J.A0U(AnonymousClass91G.MEDIA_NOTIFY_MESSAGE);
                            C172918Pr r02 = (C172918Pr) A0q.A0R();
                            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(A0J);
                            r02.getClass();
                            A0A.mediaNotifyMessage_ = r02;
                            A0A.bitField0_ |= 65536;
                            r4.A0c(A0J);
                            return;
                        }
                        AnonymousClass8SC r03 = ((AnonymousClass8SX) r4.A00).documentMessage_;
                        if (r03 == null) {
                            r03 = AnonymousClass8SC.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NI r3 = (AnonymousClass8NI) r03.A0q();
                        if (C203359nq.A0D(r5, r112.A03)) {
                            String str3 = r112.A03;
                            AnonymousClass8SC A07 = AnonymousClass8NN.A07(r3);
                            str3.getClass();
                            A07.bitField0_ |= 1;
                            A07.url_ = str3;
                            long j2 = r112.A00;
                            if (j2 >= 0) {
                                AnonymousClass8SC A072 = AnonymousClass8NN.A07(r3);
                                A072.bitField0_ |= 16;
                                A072.fileLength_ = j2;
                                try {
                                    byte[] decode2 = Base64.decode(r112.A02, 2);
                                    AnonymousClass8I5 A01 = C21674AUx.A01(decode2, 0, decode2.length);
                                    AnonymousClass8SC A073 = AnonymousClass8NN.A07(r3);
                                    A073.bitField0_ |= 8;
                                    A073.fileSha256_ = A01;
                                    byte[] decode3 = Base64.decode(r112.A01, 2);
                                    AnonymousClass8I5 A012 = C21674AUx.A01(decode3, 0, decode3.length);
                                    AnonymousClass8SC A074 = AnonymousClass8NN.A07(r3);
                                    A074.bitField0_ |= 256;
                                    A074.fileEncSha256_ = A012;
                                    AnonymousClass8SC A075 = AnonymousClass8NN.A07(r3);
                                    A075.bitField0_ |= 2;
                                    A075.mimetype_ = "document";
                                    r4.A0X(r3);
                                } catch (Exception e) {
                                    C36321k7.A1J(e, "fmessagemediaexpresspathnotify/createdocumentmessagebuilder ex = ", AnonymousClass000.A0u());
                                    throw C165567td.A0K(14);
                                }
                            } else {
                                throw C165567td.A0K(13);
                            }
                        } else {
                            throw C165567td.A0K(15);
                        }
                    } catch (Exception e2) {
                        C36321k7.A1J(e2, "fmessagemediaexpresspathnotify/createdocumentmessagebuilder ex = ", AnonymousClass000.A0u());
                        throw C165567td.A0K(14);
                    }
                } else {
                    throw C165567td.A0K(13);
                }
            } else {
                throw C165567td.A0K(15);
            }
        } else {
            throw AnonymousClass001.A08("FMessageMediaExpressPathNotifyProtobuf/not supported message");
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r11) {
        C180848mW r6;
        byte[] bArr;
        AnonymousClass8SX r3 = r11.A0A;
        AnonymousClass8SQ r2 = r3.protocolMessage_;
        if (r2 == null) {
            r2 = AnonymousClass8SQ.DEFAULT_INSTANCE;
        }
        if (C170918Hz.A0K(r2) == AnonymousClass91G.MEDIA_NOTIFY_MESSAGE) {
            if ((r2.bitField0_ & 65536) != 0) {
                C64933Qa r5 = r11.A0C;
                r6 = new C180848mW(r5, r11.A04);
                AnonymousClass8SQ r0 = r3.protocolMessage_;
                if (r0 == null) {
                    r0 = AnonymousClass8SQ.DEFAULT_INSTANCE;
                }
                C172918Pr r8 = r0.mediaNotifyMessage_;
                if (r8 == null) {
                    r8 = C172918Pr.DEFAULT_INSTANCE;
                }
                if ((r8.bitField0_ & 1) == 0 || !C203359nq.A0D(r5, r8.expressPathUrl_)) {
                    throw C165567td.A0J(15);
                }
                r6.A03 = r8.expressPathUrl_;
                int i = r8.bitField0_;
                if ((i & 4) != 0) {
                    long j = r8.fileLength_;
                    if (j >= 0) {
                        r6.A00 = j;
                        if ((i & 2) != 0) {
                            bArr = r8.fileEncSha256_.A06();
                            int length = bArr.length;
                            if (length != 32) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                                A0u.append(length);
                                C36321k7.A1J(r5, "; message.key=", A0u);
                                throw C165567td.A0J(14);
                            }
                        }
                        return r6;
                    }
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("FMessageMediaExpessPathNotify/bogus media size received; file_length=");
                A0u2.append(r8.fileLength_);
                C90504aG.A1G(A0u2);
                throw C165567td.A0J(13);
            }
            throw C165567td.A0J(11);
        } else if ((r3.bitField0_ & 64) == 0 || !"medianotify".equals(r11.A0J)) {
            return null;
        } else {
            AnonymousClass8SC r7 = r3.documentMessage_;
            if (r7 == null) {
                r7 = AnonymousClass8SC.DEFAULT_INSTANCE;
            }
            C18740tg.A06(r7);
            C64933Qa r4 = r11.A0C;
            r6 = new C180848mW(r4, r11.A04);
            if ((r7.bitField0_ & 1) == 0 || !C203359nq.A0D(r4, r7.url_)) {
                throw C165567td.A0J(15);
            }
            r6.A03 = r7.url_;
            int i2 = r7.bitField0_;
            if ((i2 & 16) != 0) {
                long j2 = r7.fileLength_;
                if (j2 >= 0) {
                    r6.A00 = j2;
                    if (AnonymousClass000.A1P(i2 & 8)) {
                        byte[] A06 = r7.fileSha256_.A06();
                        int length2 = A06.length;
                        if (length2 == 32) {
                            r6.A02 = C36441kJ.A13(A06);
                        } else {
                            StringBuilder A0u3 = AnonymousClass000.A0u();
                            A0u3.append("FMessageMediaExpessPathNotify/bogus sha-256 hash received; length=");
                            A0u3.append(length2);
                            C36321k7.A1L(r4, "; message.key=", A0u3);
                            throw C165567td.A0J(14);
                        }
                    }
                    if ((r7.bitField0_ & 256) != 0) {
                        bArr = r7.fileEncSha256_.A06();
                        int length3 = bArr.length;
                        if (length3 != 32) {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                            A0u4.append(length3);
                            C36321k7.A1J(r4, "; message.key=", A0u4);
                            throw C165567td.A0J(14);
                        }
                    }
                    return r6;
                }
            }
            throw C165567td.A0J(13);
        }
        r6.A01 = C36441kJ.A13(bArr);
        return r6;
    }
}
