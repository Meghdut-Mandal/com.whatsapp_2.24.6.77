package X;

import android.text.TextUtils;

/* renamed from: X.ABj  reason: case insensitive filesystem */
public class C21175ABj implements C22938Ayo, C22942Ays, C17740rx {
    public final C19700wN A00;
    public final AnonymousClass1EO A01;

    public void B24(C196159Xy r2, AnonymousClass3T1 r3) {
        AnonymousClass2cT r32 = (AnonymousClass2cT) r3;
        C23044B1p A002 = this.A01.A00(r32);
        if (A002 != null) {
            A002.B23(r2, r32);
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r17) {
        Integer num;
        String str;
        AnonymousClass8Q3 r0;
        int i;
        String str2;
        AnonymousClass90O r3;
        C206919uD r02;
        C207149ud r1;
        AnonymousClass2cT r9;
        String str3;
        AnonymousClass90P r03;
        AnonymousClass9YL r32 = r17;
        AnonymousClass8SX r7 = r32.A0A;
        if ((r7.bitField0_ & 1073741824) != 0) {
            AnonymousClass8RD r5 = r7.listResponseMessage_;
            if (r5 == null) {
                r5 = AnonymousClass8RD.DEFAULT_INSTANCE;
            }
            C18740tg.A06(r5);
            r9 = new AnonymousClass2cT(r32.A0C, r32.A04);
            String str4 = r5.title_;
            String str5 = r5.description_;
            C172388Nq r04 = r5.singleSelectReply_;
            if (r04 == null) {
                r04 = C172388Nq.DEFAULT_INSTANCE;
            }
            String str6 = r04.selectedRowId_;
            int i2 = r5.listType_;
            if (i2 == 0 || i2 != 1) {
                r03 = AnonymousClass90P.UNKNOWN;
            } else {
                r03 = AnonymousClass90P.SINGLE_SELECT;
            }
            r1 = new C207149ud(str4, str5, str6, r03.value);
        } else if ((r7.bitField1_ & 32) == 0) {
            return null;
        } else {
            C19700wN r6 = this.A00;
            C64933Qa r10 = r32.A0C;
            long j = r32.A04;
            int i3 = r32.A01;
            AnonymousClass8QZ r2 = r7.interactiveResponseMessage_;
            if (r2 == null) {
                r2 = AnonymousClass8QZ.DEFAULT_INSTANCE;
            }
            int i4 = r2.interactiveResponseMessageCase_;
            if (i4 == 0) {
                num = C023109s.A01;
            } else if (i4 != 2) {
                num = null;
            } else {
                num = C023109s.A00;
            }
            if (num == null || num == C023109s.A01) {
                str = "messageCase null/not_set";
            } else {
                int intValue = num.intValue();
                if (intValue != 0) {
                    i = -1;
                } else {
                    if (i4 == 2) {
                        r0 = (AnonymousClass8Q3) r2.interactiveResponseMessage_;
                    } else {
                        r0 = AnonymousClass8Q3.DEFAULT_INSTANCE;
                    }
                    i = r0.version_;
                    if (i <= 1) {
                        if ((r2.bitField0_ & 1) != 0) {
                            AnonymousClass8P6 r12 = r2.body_;
                            AnonymousClass8P6 r05 = r12;
                            if (r12 == null) {
                                r12 = AnonymousClass8P6.DEFAULT_INSTANCE;
                            }
                            str2 = r12.text_;
                            if (r05 == null) {
                                r05 = AnonymousClass8P6.DEFAULT_INSTANCE;
                            }
                            int i5 = r05.format_;
                            if (i5 == 0 || i5 != 1) {
                                r3 = AnonymousClass90O.DEFAULT;
                            } else {
                                r3 = AnonymousClass90O.EXTENSIONS_1;
                            }
                        } else {
                            str2 = null;
                            r3 = null;
                        }
                        if (i4 != 2) {
                            throw C90464aC.A0R("Unexpected value: ", AnonymousClass000.A0u(), 0);
                        } else if (!TextUtils.isEmpty(str2)) {
                            if (r2.interactiveResponseMessageCase_ == 2) {
                                AnonymousClass8Q3 r06 = (AnonymousClass8Q3) r2.interactiveResponseMessage_;
                                r02 = new C206919uD(r06.name_, r06.paramsJson_);
                            } else {
                                r02 = null;
                            }
                            r1 = new C207149ud(r3, r02, str2);
                            r9 = new AnonymousClass2cT(r10, j);
                        } else {
                            throw C165617ti.A0S(C165597tg.A0d(), "NFM response message is required body");
                        }
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("message: ");
                if (1 - intValue != 0) {
                    str3 = "NATIVE_FLOW_RESPONSE_MESSAGE";
                } else {
                    str3 = "INTERACTIVERESPONSEMESSAGE_NOT_SET";
                }
                A0u.append(str3);
                str = AnonymousClass000.A0r(", version: ", A0u, i);
            }
            r6.A0E("FMessageInteractiveResponseFactory/isUnknownInteractiveMessage", str, false);
            return new AnonymousClass2bK(r10, r7.A0o(), 2, i3, j);
        }
        r9.A00 = r1;
        return r9;
    }

    public C21175ABj(C19700wN r1, AnonymousClass1EO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
