package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.3Sm  reason: invalid class name and case insensitive filesystem */
public final class C65543Sm {
    public static final C65543Sm A00 = new C65543Sm();

    public static final boolean A00(AnonymousClass3KF r9, AnonymousClass3KF r10) {
        Boolean bool;
        Boolean bool2;
        C52602pr r5;
        C52602pr r4;
        Boolean bool3;
        Boolean bool4;
        C52602pr r1;
        C52602pr r8 = null;
        if (r9 != null) {
            bool = Boolean.valueOf(r9.A03);
            bool2 = Boolean.valueOf(r9.A05);
            r5 = r9.A00;
            r4 = r9.A01;
        } else {
            bool = null;
            bool2 = null;
            r5 = null;
            r4 = null;
        }
        if (r10 != null) {
            bool3 = Boolean.valueOf(r10.A03);
            bool4 = Boolean.valueOf(r10.A05);
            r1 = r10.A00;
            r8 = r10.A01;
        } else {
            bool3 = null;
            bool4 = null;
            r1 = null;
        }
        if (!AnonymousClass00C.A0J(bool, bool3) || r5 != r1 || r4 != r8 || !AnonymousClass00C.A0J(bool2, bool4)) {
            return false;
        }
        return true;
    }

    public final boolean A01(C48032ga r18, C48032ga r19) {
        AnonymousClass141 r10;
        AnonymousClass141 r9;
        UserJid userJid;
        UserJid userJid2;
        Integer num;
        Integer num2;
        Integer num3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C48012gY r4;
        Boolean bool;
        C48022gZ r42;
        C48032ga r43 = r19;
        C48032ga r6 = r18;
        boolean A1a = C36341k9.A1a(r6, r43);
        C65663Sz A002 = r6.A00();
        C65663Sz A003 = r43.A00();
        boolean z = r6 instanceof C48012gY;
        if (z) {
            r10 = ((C48012gY) r6).A00;
        } else {
            r10 = ((C48022gZ) r6).A00;
        }
        boolean z2 = r43 instanceof C48012gY;
        if (z2) {
            r9 = ((C48012gY) r43).A00;
        } else {
            r9 = ((C48022gZ) r43).A00;
        }
        Integer num4 = null;
        if (A002 != null) {
            userJid = A002.A09;
        } else {
            userJid = null;
        }
        if (A003 != null) {
            userJid2 = A003.A09;
        } else {
            userJid2 = null;
        }
        if (AnonymousClass00C.A0J(userJid, userJid2)) {
            if (A002 != null) {
                num = Integer.valueOf(A002.A03());
            } else {
                num = null;
            }
            if (A003 != null) {
                num2 = Integer.valueOf(A003.A03());
            } else {
                num2 = null;
            }
            if (AnonymousClass00C.A0J(num, num2)) {
                if (A002 != null) {
                    num3 = Integer.valueOf(A002.A02());
                } else {
                    num3 = null;
                }
                if (A003 != null) {
                    num4 = Integer.valueOf(A003.A02());
                }
                if (AnonymousClass00C.A0J(num3, num4)) {
                    if (z) {
                        charSequence = ((C48012gY) r6).A03;
                    } else {
                        charSequence = ((C48022gZ) r6).A03;
                    }
                    if (z2) {
                        charSequence2 = ((C48012gY) r43).A03;
                    } else {
                        charSequence2 = ((C48022gZ) r43).A03;
                    }
                    if (AnonymousClass00C.A0J(charSequence, charSequence2) && r10.A05 == r9.A05 && r10.A0C == r9.A0C && AnonymousClass00C.A0J(r10.A0J(), r9.A0J())) {
                        Boolean bool2 = null;
                        if (z) {
                            C48012gY r62 = (C48012gY) r6;
                            if (r62 != null) {
                                AnonymousClass3EL r3 = r62.A02;
                                AnonymousClass3EK r1 = r3.A02;
                                if (z2 && (r4 = (C48012gY) r43) != null) {
                                    AnonymousClass3EL r0 = r4.A02;
                                    AnonymousClass3EK r2 = r0.A02;
                                    if (A00(r3.A01, r0.A01)) {
                                        long size = (long) r1.A01.size();
                                        long size2 = (long) r1.A02.size();
                                        long size3 = (long) r1.A00.size();
                                        Set set = r1.A03;
                                        long size4 = (long) set.size();
                                        long size5 = (long) r2.A01.size();
                                        long size6 = (long) r2.A02.size();
                                        long size7 = (long) r2.A00.size();
                                        long size8 = (long) set.size();
                                        if (size == size5 && size2 == size6 && size3 == size7 && size4 == size8) {
                                            return true;
                                        }
                                        return false;
                                    }
                                }
                            }
                        } else if (!z2) {
                            if (!(r6 instanceof C48022gZ)) {
                                if (!(r43 instanceof C48022gZ)) {
                                    return A1a;
                                }
                                bool = null;
                            } else {
                                C48022gZ r63 = (C48022gZ) r6;
                                if (r63 != null) {
                                    bool = Boolean.valueOf(r63.A05);
                                }
                                bool = null;
                            }
                            if ((r43 instanceof C48022gZ) && (r42 = (C48022gZ) r43) != null) {
                                bool2 = Boolean.valueOf(r42.A05);
                            }
                            return AnonymousClass00C.A0J(bool, bool2);
                        }
                    }
                }
            }
        }
        return false;
    }
}
