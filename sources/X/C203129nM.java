package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9nM  reason: invalid class name and case insensitive filesystem */
public class C203129nM {
    public final C19700wN A00;
    public final C20310xM A01;
    public final C20810yC A02;
    public final AnonymousClass1DL A03;
    public final AnonymousClass1FO A04;
    public final C195329Tv A05;
    public final C195739Vt A06;
    public final AnonymousClass9Te A07;
    public final Map A08;
    public final Set A09;
    public final C198499df A0A;
    public final C196049Xl A0B;

    private C181778o1 A01(AnonymousClass8SV r8, C64933Qa r9, C207219uk r10, long j, boolean z, boolean z2) {
        AnonymousClass8SE r2;
        AnonymousClass8SN r22 = r8.header_;
        if (r22 == null) {
            r22 = AnonymousClass8SN.DEFAULT_INSTANCE;
        }
        if (r22.mediaCase_ == 7) {
            r2 = (AnonymousClass8SE) r22.media_;
        } else {
            r2 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        C181778o1 r3 = new C181778o1(r9, r10, j);
        C196049Xl r1 = this.A0B;
        r1.A04(r2, r3, r3.A01, z, z2);
        r1.A03(r2, r3, r3.A01, z);
        return r3;
    }

    public C203129nM(C19700wN r1, C20310xM r2, C20810yC r3, AnonymousClass1DL r4, AnonymousClass1FO r5, C195329Tv r6, C195739Vt r7, C198499df r8, AnonymousClass9Te r9, C196049Xl r10, Map map, Set set) {
        this.A06 = r7;
        this.A0B = r10;
        this.A05 = r6;
        this.A0A = r8;
        this.A07 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A08 = map;
        this.A09 = set;
    }

    public static int A00(AnonymousClass8SV r3) {
        int intValue = r3.A0v().intValue();
        if (intValue == 0) {
            return 4;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return 0;
            }
            return 7;
        } else if (r3.interactiveMessageCase_ == 6 && C202419ln.A01(r3, "review_and_pay")) {
            return 3;
        } else {
            if (r3.interactiveMessageCase_ == 6 && C202419ln.A01(r3, "mpm")) {
                return 6;
            }
            if (r3.interactiveMessageCase_ != 6 || (r3.bitField0_ & 1) == 0) {
                return 5;
            }
            AnonymousClass8SN r0 = r3.header_;
            if (r0 == null) {
                r0 = AnonymousClass8SN.DEFAULT_INSTANCE;
            }
            if (r0.mediaCase_ == 9) {
                return 9;
            }
            return 5;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "COLLECTION_MESSAGE";
            case 2:
                return "NATIVE_FLOW_MESSAGE";
            case 3:
                return "CAROUSEL_MESSAGE";
            case 4:
                return "INTERACTIVEMESSAGE_NOT_SET";
            default:
                return "SHOP_STOREFRONT_MESSAGE";
        }
    }

    public AnonymousClass3T1 A03(AnonymousClass8SX r26, C64933Qa r27, String str, int i, long j, boolean z, boolean z2, boolean z3) {
        int i2;
        C28541Tb r2;
        AnonymousClass2bZ r6;
        C23043B1o b1o;
        AnonymousClass2bZ r62;
        AnonymousClass8RR r3;
        C46872bo r8;
        AnonymousClass8RR r32;
        AnonymousClass8SF r33;
        C173508Ry r22;
        AnonymousClass8SC r34;
        AnonymousClass8SF r35;
        AnonymousClass8Q2 r23;
        AnonymousClass8P4 r24;
        AnonymousClass8Q0 r25;
        AnonymousClass8SX r7 = r26;
        AnonymousClass8SV A002 = C203099nI.A00(r7);
        C64933Qa r5 = r27;
        int i3 = i;
        long j2 = j;
        try {
            if (A00(A002) != 7 || this.A02.A0E(4668)) {
                Integer A0v = A002.A0v();
                if (A0v == null || A0v == C023109s.A0R) {
                    this.A00.A0E("FMessageInteractiveFactory/isUnknownInteractiveMessage", "messageCase null/not_set", false);
                } else {
                    int intValue = A0v.intValue();
                    if (intValue == 0) {
                        if (A002.interactiveMessageCase_ == 4) {
                            r23 = (AnonymousClass8Q2) A002.interactiveMessage_;
                        } else {
                            r23 = AnonymousClass8Q2.DEFAULT_INSTANCE;
                        }
                        i2 = r23.messageVersion_;
                    } else if (intValue == 2) {
                        i2 = A002.A0u().messageVersion_;
                    } else if (intValue == 3) {
                        if (A002.interactiveMessageCase_ == 7) {
                            r24 = (AnonymousClass8P4) A002.interactiveMessage_;
                        } else {
                            r24 = AnonymousClass8P4.DEFAULT_INSTANCE;
                        }
                        i2 = r24.messageVersion_;
                    } else if (intValue != 1) {
                        i2 = -1;
                    } else {
                        if (A002.interactiveMessageCase_ == 5) {
                            r25 = (AnonymousClass8Q0) A002.interactiveMessage_;
                        } else {
                            r25 = AnonymousClass8Q0.DEFAULT_INSTANCE;
                        }
                        i2 = r25.messageVersion_;
                    }
                    if (i2 == -1) {
                        C19700wN r4 = this.A00;
                        StringBuilder A0v2 = AnonymousClass000.A0v("message: ");
                        A0v2.append(A02(A0v));
                        r4.A0E("FMessageInteractiveFactory/isUnknownInteractiveMessage", AnonymousClass000.A0r(", version: ", A0v2, i2), false);
                    } else if (i2 <= 1) {
                        int A003 = A00(A002);
                        C201279jG r28 = (C201279jG) C36371kC.A0r(this.A08, A003);
                        if (r28 != null) {
                            String str2 = str;
                            r28.A00 = str2;
                            r28.A01 = z3;
                            C207219uk A022 = r28.A02(A002);
                            AnonymousClass8SV A004 = C203099nI.A00(r7);
                            AnonymousClass00C.A0D(A004, 0);
                            if (A004.interactiveMessageCase_ != 6 || !C202419ln.A01(A004, "review_and_pay")) {
                                int i4 = 0;
                                if (C202419ln.A01(A004, "review_order") || C202419ln.A01(A004, "payment_method") || C202419ln.A01(A004, "payment_status")) {
                                    boolean A0E = this.A02.A0E(5770);
                                    AnonymousClass8SV A005 = C203099nI.A00(r7);
                                    C36321k7.A0y(r5, A022);
                                    r6 = new AnonymousClass2bZ(r5, 55, j2);
                                    r6.A00 = A022;
                                    AnonymousClass2bZ.A01(r6);
                                    AnonymousClass00C.A0D(A005, 0);
                                    if (C202419ln.A01(A005, "payment_method") || C202419ln.A01(A005, "payment_status")) {
                                        C20310xM r36 = this.A01;
                                        AnonymousClass11F r29 = r5.A00;
                                        C18740tg.A06(r29);
                                        b1o = C202449lr.A01(r36, r29, r7, A0E);
                                    } else if (C202419ln.A01(A005, "review_order")) {
                                        C20310xM r42 = this.A01;
                                        AnonymousClass11F r37 = r5.A00;
                                        C18740tg.A06(r37);
                                        b1o = C202449lr.A00(r42, r37, this.A03, r7, r6, A0E);
                                    }
                                    if (b1o != null) {
                                        this.A04.A00(r6, (AnonymousClass3T1) b1o);
                                    }
                                } else {
                                    boolean z4 = z;
                                    boolean z5 = z2;
                                    if ((A004.bitField0_ & 1) != 0) {
                                        AnonymousClass8SN r210 = A004.header_;
                                        AnonymousClass8SN r38 = r210;
                                        if (r210 == null) {
                                            r210 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                        }
                                        if (r210.A0u()) {
                                            if (r38 == null) {
                                                r38 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                            }
                                            if (r38.mediaCase_ == 4 && !"catalog_message".equals(str2)) {
                                                C46872bo r63 = new C46872bo(r5, A022, j2);
                                                C195739Vt r43 = this.A06;
                                                AnonymousClass8SN r39 = A004.header_;
                                                if (r39 == null) {
                                                    r39 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r39.mediaCase_ == 4) {
                                                    r35 = (AnonymousClass8SF) r39.media_;
                                                } else {
                                                    r35 = AnonymousClass8SF.DEFAULT_INSTANCE;
                                                }
                                                r43.A02(r35, r63, r63.A01, z4, z5);
                                                return r63;
                                            }
                                        }
                                    }
                                    if ((A004.bitField0_ & 1) != 0) {
                                        AnonymousClass8SN r211 = A004.header_;
                                        AnonymousClass8SN r310 = r211;
                                        if (r211 == null) {
                                            r211 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                        }
                                        if (r211.A0u()) {
                                            if (r310 == null) {
                                                r310 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                            }
                                            if (r310.mediaCase_ == 7) {
                                                return A01(A004, r5, A022, j2, z4, z5);
                                            }
                                        }
                                    }
                                    int i5 = A004.bitField0_ & 1;
                                    if (i5 != 0) {
                                        AnonymousClass8SN r212 = A004.header_;
                                        AnonymousClass8SN r311 = r212;
                                        if (r212 == null) {
                                            r212 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                        }
                                        if (r212.A0u()) {
                                            if (r311 == null) {
                                                r311 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                            }
                                            if (r311.mediaCase_ == 3) {
                                                C46832bk r64 = new C46832bk(r5, A022, j2);
                                                C195329Tv r44 = this.A05;
                                                AnonymousClass8SN r312 = A004.header_;
                                                if (r312 == null) {
                                                    r312 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r312.mediaCase_ == 3) {
                                                    r34 = (AnonymousClass8SC) r312.media_;
                                                } else {
                                                    r34 = AnonymousClass8SC.DEFAULT_INSTANCE;
                                                }
                                                r44.A01(r34, r64, r64.A01, z4, z5);
                                                return r64;
                                            }
                                        }
                                    }
                                    if (i5 != 0) {
                                        AnonymousClass8SN r213 = A004.header_;
                                        AnonymousClass8SN r313 = r213;
                                        if (r213 == null) {
                                            r213 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                        }
                                        if (r213.A0u()) {
                                            if (r313 == null) {
                                                r313 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                            }
                                            if (r313.mediaCase_ == 8) {
                                                AnonymousClass2cB r65 = new AnonymousClass2cB(r5, A022, j2);
                                                AnonymousClass8SN r314 = A004.header_;
                                                if (r314 == null) {
                                                    r314 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r314.mediaCase_ == 8) {
                                                    r22 = (C173508Ry) r314.media_;
                                                } else {
                                                    r22 = C173508Ry.DEFAULT_INSTANCE;
                                                }
                                                C198499df.A00(r22, r65, z5);
                                                return r65;
                                            }
                                        }
                                    }
                                    if (A004.interactiveMessageCase_ == 7) {
                                        C23122B6c b6c = ((AnonymousClass8P4) A004.interactiveMessage_).cards_;
                                        ArrayList A0I = AnonymousClass001.A0I();
                                        while (i4 < b6c.size()) {
                                            AnonymousClass8SV r15 = (AnonymousClass8SV) b6c.get(i4);
                                            if ((r15.bitField0_ & 1) != 0) {
                                                AnonymousClass8SN r214 = r15.header_;
                                                AnonymousClass8SN r315 = r214;
                                                if (r214 == null) {
                                                    r214 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r214.A0u()) {
                                                    if (r315 == null) {
                                                        r315 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                    }
                                                    if (r315.mediaCase_ == 4) {
                                                        C46772be r316 = new C46772be(r5, i4);
                                                        C206489tU r215 = A022.A02;
                                                        C18740tg.A06(r215);
                                                        C46872bo r82 = new C46872bo(r316, (C207219uk) r215.A00.get(i4), j2);
                                                        C195739Vt r66 = this.A06;
                                                        AnonymousClass8SN r317 = r15.header_;
                                                        if (r317 == null) {
                                                            r317 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                        }
                                                        if (r317.mediaCase_ == 4) {
                                                            r33 = (AnonymousClass8SF) r317.media_;
                                                        } else {
                                                            r33 = AnonymousClass8SF.DEFAULT_INSTANCE;
                                                        }
                                                        r66.A02(r33, r82, r82.A01, z4, z5);
                                                        r8 = r82;
                                                        A0I.add(r8);
                                                        i4++;
                                                    }
                                                }
                                            }
                                            if ((r15.bitField0_ & 1) != 0) {
                                                AnonymousClass8SN r216 = r15.header_;
                                                AnonymousClass8SN r318 = r216;
                                                if (r216 == null) {
                                                    r216 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r216.A0u()) {
                                                    if (r318 == null) {
                                                        r318 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                    }
                                                    if (r318.mediaCase_ == 7) {
                                                        C46772be r319 = new C46772be(r5, i4);
                                                        C206489tU r217 = A022.A02;
                                                        C18740tg.A06(r217);
                                                        long j3 = j2;
                                                        r8 = A01(r15, r319, (C207219uk) r217.A00.get(i4), j3, z4, z5);
                                                        A0I.add(r8);
                                                        i4++;
                                                    }
                                                }
                                            }
                                            if ((r15.bitField0_ & 1) != 0) {
                                                AnonymousClass8SN r218 = r15.header_;
                                                AnonymousClass8SN r320 = r218;
                                                if (r218 == null) {
                                                    r218 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r218.A0u()) {
                                                    if (r320 == null) {
                                                        r320 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                    }
                                                    if (r320.mediaCase_ == 9) {
                                                        C46772be r321 = new C46772be(r5, i4);
                                                        C206489tU r219 = A022.A02;
                                                        C18740tg.A06(r219);
                                                        AnonymousClass2c6 r83 = new AnonymousClass2c6(r321, (C207219uk) r219.A00.get(i4), j2);
                                                        AnonymousClass9Te r67 = this.A07;
                                                        AnonymousClass8SN r322 = r15.header_;
                                                        if (r322 == null) {
                                                            r322 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                        }
                                                        if (r322.mediaCase_ == 9) {
                                                            r32 = (AnonymousClass8RR) r322.media_;
                                                        } else {
                                                            r32 = AnonymousClass8RR.DEFAULT_INSTANCE;
                                                        }
                                                        r67.A01(r32, r83, r83.A01, z4, z5);
                                                        r8 = r83;
                                                        A0I.add(r8);
                                                        i4++;
                                                    }
                                                }
                                            }
                                            r2 = C165617ti.A0S(C165597tg.A0d(), "not supported carousel card type");
                                        }
                                        C36321k7.A0y(r5, A022);
                                        r62 = new AnonymousClass2bZ(r5, 55, j2);
                                        r62.A00 = A022;
                                        AnonymousClass2bZ.A01(r62);
                                        r62.A1Y(A0I);
                                    } else {
                                        if ((A004.bitField0_ & 1) != 0) {
                                            AnonymousClass8SN r220 = A004.header_;
                                            AnonymousClass8SN r323 = r220;
                                            if (r220 == null) {
                                                r220 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                            }
                                            if (r220.A0u()) {
                                                if (r323 == null) {
                                                    r323 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                }
                                                if (r323.mediaCase_ == 9) {
                                                    AnonymousClass2c6 r68 = new AnonymousClass2c6(r5, A022, j2);
                                                    AnonymousClass9Te r45 = this.A07;
                                                    AnonymousClass8SN r324 = A004.header_;
                                                    if (r324 == null) {
                                                        r324 = AnonymousClass8SN.DEFAULT_INSTANCE;
                                                    }
                                                    if (r324.mediaCase_ == 9) {
                                                        r3 = (AnonymousClass8RR) r324.media_;
                                                    } else {
                                                        r3 = AnonymousClass8RR.DEFAULT_INSTANCE;
                                                    }
                                                    r45.A01(r3, r68, r68.A01, z4, z5);
                                                    return r68;
                                                }
                                            }
                                        }
                                        C36321k7.A0y(r5, A022);
                                        r62 = new AnonymousClass2bZ(r5, 55, j2);
                                        r62.A00 = A022;
                                    }
                                    AnonymousClass2bZ.A01(r62);
                                    return r62;
                                }
                            } else {
                                C36321k7.A0y(r5, A022);
                                r6 = new AnonymousClass2bZ(r5, 54, j2);
                                r6.A00 = A022;
                                AnonymousClass2bZ.A01(r6);
                                for (C194629Qm A006 : this.A09) {
                                    A006.A00(r6);
                                }
                            }
                            return r6;
                        }
                        r2 = C165617ti.A0S(C165597tg.A0d(), AnonymousClass000.A0r("unknown type: ", AnonymousClass000.A0u(), A003));
                        throw r2;
                    } else {
                        C19700wN r46 = this.A00;
                        StringBuilder A0v3 = AnonymousClass000.A0v("message: ");
                        A0v3.append(A02(A0v));
                        r46.A0E("FMessageInteractiveFactory/isUnknownInteractiveMessage: unsupported version", AnonymousClass000.A0r(", version: ", A0v3, i2), false);
                    }
                }
            }
            return new AnonymousClass2bK(r5, r7.A0o(), 2, i3, j2);
        } catch (C28541Tb e) {
            if (e.e2eFailureReason.intValue() != 0) {
                C36321k7.A1L(r5, "FMessageInteractiveFactory/parseInteractiveMessage/invalid message; message.key=", AnonymousClass000.A0u());
                C19700wN r69 = this.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("error: ");
                r69.A0E("FMessageInteractiveFactory/parseInteractiveMessage/invalid_message", AnonymousClass000.A0q(e.description, A0u), true);
                return new AnonymousClass2bK(r5, r7.A0o(), 2, i3, j2);
            }
            throw e;
        }
    }
}
