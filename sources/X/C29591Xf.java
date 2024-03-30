package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Xf  reason: invalid class name and case insensitive filesystem */
public class C29591Xf implements AnonymousClass1EI {
    public final C19730wQ A00;
    public final C26171Jd A01;

    public synchronized boolean A01(AnonymousClass3T1 r6, int i) {
        boolean z;
        z = false;
        if (A00(r6, i)) {
            ArrayList A0E = this.A01.A0E(r6, i);
            if (!A0E.isEmpty()) {
                boolean z2 = true;
                if (i == 56) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = A0E.iterator();
                    while (it.hasNext()) {
                        AnonymousClass2bM r1 = (AnonymousClass2bM) it.next();
                        if (r1 instanceof C180868mY) {
                            arrayList.add((C180868mY) r1);
                            z = true;
                        }
                    }
                    r6.A1U(new C68983cm(this.A00, arrayList));
                } else if ((r6 instanceof AnonymousClass2bS) && i == 67) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = A0E.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass2bM r12 = (AnonymousClass2bM) it2.next();
                        if (r12 instanceof C180858mX) {
                            arrayList2.add(r12);
                            z = true;
                        }
                    }
                    ((AnonymousClass2bS) r6).A1X(arrayList2);
                } else if (i == 68) {
                    if (A0E.size() > 1) {
                        z2 = false;
                    }
                    C18740tg.A0D(z2, "Multiple KeepInChat messages linked to a parent message");
                    Iterator it3 = A0E.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass2bM r13 = (AnonymousClass2bM) it3.next();
                        if (r13 instanceof C46752bc) {
                            C46752bc r14 = (C46752bc) r13;
                            r6.A1U = r14;
                            if (r14 != null) {
                                r6.A07 = r14.A01;
                            }
                            z = true;
                        }
                    }
                } else if (i == 79) {
                    if (A0E.size() > 1) {
                        z2 = false;
                    }
                    C18740tg.A0D(z2, "Multiple PinInChat add-on message linked to a parent message");
                    Iterator it4 = A0E.iterator();
                    while (it4.hasNext()) {
                        AnonymousClass2bM r15 = (AnonymousClass2bM) it4.next();
                        if (r15 instanceof AnonymousClass5J2) {
                            r6.A1V = (AnonymousClass5J2) r15;
                            z = true;
                        }
                    }
                } else if (i == 86) {
                    if (A0E.size() > 1) {
                        z2 = false;
                    }
                    C18740tg.A0D(z2, "Multiple ScheduledCallEdit add-on message linked to a parent message");
                    Iterator it5 = A0E.iterator();
                    while (it5.hasNext()) {
                        AnonymousClass2bM r16 = (AnonymousClass2bM) it5.next();
                        if ((r16 instanceof C46742bb) && (r6 instanceof AnonymousClass2c9)) {
                            ((AnonymousClass2c9) r6).A00 = r16;
                            z = true;
                        }
                    }
                } else if (i == 93 && (r6 instanceof AnonymousClass2bT)) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it6 = A0E.iterator();
                    while (it6.hasNext()) {
                        AnonymousClass2bM r17 = (AnonymousClass2bM) it6.next();
                        if (r17 instanceof C46762bd) {
                            arrayList3.add((C46762bd) r17);
                            z = true;
                        }
                    }
                    ((AnonymousClass2bT) r6).A1a(this.A00, arrayList3);
                }
            }
        }
        return z;
    }

    public static boolean A00(AnonymousClass3T1 r3, int i) {
        Object A1X;
        boolean z = false;
        if (r3.A08 != 0) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (i == 56) {
            if (!r3.A1S(1)) {
                return false;
            }
            A1X = r3.A0J;
        } else if (i == 67) {
            if (!(r3 instanceof AnonymousClass2bS)) {
                return false;
            }
            AnonymousClass2bS r1 = (AnonymousClass2bS) r3;
            if (!r3.A1S(2)) {
                return false;
            }
            A1X = r1.A04;
        } else if (i == 68) {
            if (!r3.A1S(4)) {
                return false;
            }
            A1X = r3.A1U;
        } else if (i == 79) {
            if (!r3.A1S(8)) {
                return false;
            }
            A1X = r3.A1V;
        } else if (i == 86) {
            if (!(r3 instanceof AnonymousClass2c9)) {
                return false;
            }
            AnonymousClass2c9 r12 = (AnonymousClass2c9) r3;
            if (!r3.A1S(16)) {
                return false;
            }
            A1X = r12.A00;
        } else if (i != 93 || !(r3 instanceof AnonymousClass2bT)) {
            return false;
        } else {
            AnonymousClass2bT r32 = (AnonymousClass2bT) r3;
            if (!r32.A1S(32)) {
                return false;
            }
            A1X = r32.A1X();
        }
        if (A1X == null) {
            return true;
        }
        return false;
    }

    public boolean BQ5(AnonymousClass3IP r4, AnonymousClass3T1 r5) {
        if (!r4.A00.contains(C25111Fa.SKIP_ADDONS) && !r4.A01) {
            for (Number intValue : new C82293yT().keySet()) {
                if (A00(r5, intValue.intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C29591Xf(C19730wQ r1, C26171Jd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BON(AnonymousClass3IP r3, AnonymousClass3T1 r4) {
        if (BQ5(r3, r4)) {
            for (Number intValue : new C82293yT().keySet()) {
                A01(r4, intValue.intValue());
            }
        }
    }
}
