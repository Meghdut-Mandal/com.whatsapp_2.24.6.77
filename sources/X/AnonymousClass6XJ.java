package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.6XJ  reason: invalid class name */
public abstract class AnonymousClass6XJ {
    public static final Object A00 = new AnonymousClass68I("compositionLocalMap");
    public static final Object A01 = new AnonymousClass68I("provider");
    public static final Object A02 = new AnonymousClass68I("provider");
    public static final Object A03 = new AnonymousClass68I("providers");
    public static final Object A04 = new AnonymousClass68I("reference");
    public static final Comparator A05 = C1503775a.A00;

    public static final void A02(AnonymousClass7bJ r10, AnonymousClass6YK r11) {
        Object obj;
        int i = r11.A00;
        int i2 = r11.A01;
        while (i < i2) {
            int A012 = AnonymousClass6YK.A01(r11, i);
            int[] iArr = r11.A0G;
            if (AnonymousClass6QR.A03(iArr, A012)) {
                Object[] objArr = r11.A0H;
                int A032 = AnonymousClass6YK.A03(r11, iArr, A012);
                if (A032 >= r11.A0B) {
                    A032 += r11.A09;
                }
                obj = objArr[A032];
            } else {
                obj = null;
            }
            if (obj instanceof C159837k0) {
                ((C136996fQ) r10).A01.add(obj);
            }
            int A013 = AnonymousClass6YK.A01(r11, i);
            int[] iArr2 = r11.A0G;
            int A052 = AnonymousClass6YK.A05(r11, iArr2, A013);
            int i3 = i + 1;
            int A022 = AnonymousClass6YK.A02(r11, iArr2, i3);
            for (int i4 = A052; i4 < A022; i4++) {
                int i5 = i4 - A052;
                Object[] objArr2 = r11.A0H;
                int i6 = i4;
                if (i4 >= r11.A0B) {
                    i6 = i4 + r11.A09;
                }
                Object obj2 = objArr2[i6];
                if (obj2 instanceof C114295gz) {
                    C159847k1 r6 = ((C114295gz) obj2).A00;
                    if (r6 instanceof C17480rU) {
                        continue;
                    } else if (obj2 == r11.A0J(C129736Ig.A00, i, i5)) {
                        ((C136996fQ) r10).A01.add(r6);
                    } else {
                        throw A01("Slot table is out of sync");
                    }
                } else if (!(obj2 instanceof C136976fO)) {
                    continue;
                } else if (obj2 == r11.A0J(C129736Ig.A00, i, i5)) {
                    ((C136976fO) obj2).A00();
                } else {
                    throw A01("Slot table is out of sync");
                }
            }
            i = i3;
        }
    }

    public static final void A03(AnonymousClass7bJ r6, AnonymousClass6YK r7) {
        int A0C;
        int[] iArr = r7.A0G;
        int i = r7.A00;
        int A012 = AnonymousClass6YK.A01(r7, i);
        AnonymousClass76S r4 = new AnonymousClass76S(r7, AnonymousClass6YK.A03(r7, iArr, A012), AnonymousClass6YK.A02(r7, iArr, i + C90524aI.A05(iArr, A012)));
        while (r4.hasNext()) {
            Object next = r4.next();
            if (next instanceof C159837k0) {
                C136996fQ r5 = (C136996fQ) r6;
                AnonymousClass0GB r2 = r5.A00;
                if (r2 == null) {
                    AnonymousClass0GB r0 = AnonymousClass0RB.A00;
                    r2 = new AnonymousClass0GB(6);
                    r5.A00 = r2;
                }
                r2.A03[AnonymousClass0GB.A01(r2, next)] = next;
                r5.A01.add(next);
            }
            if (next instanceof C114295gz) {
                ((C136996fQ) r6).A01.add(((C114295gz) next).A00);
            }
            if (next instanceof C136976fO) {
                ((C136976fO) next).A00();
            }
        }
        if (r7.A06 == 0) {
            int i2 = r7.A00;
            int i3 = r7.A02;
            int A013 = AnonymousClass6YK.A01(r7, i2);
            int[] iArr2 = r7.A0G;
            int i4 = A013 * 5;
            int i5 = iArr2[i4 + 3] + i2;
            r7.A00 = i5;
            r7.A02 = AnonymousClass6YK.A02(r7, iArr2, i5);
            if (AnonymousClass6QR.A03(iArr2, A013)) {
                A0C = 1;
            } else {
                A0C = C90494aF.A0C(iArr2, i4);
            }
            AnonymousClass6YK.A09(r7, r7.A08);
            AnonymousClass6Ne r1 = r7.A0C;
            if (r1 != null) {
                while (C36401kF.A1a(r1.A00) && AnonymousClass000.A0I(C007103b.A0L(r1.A00)) >= i2) {
                    r1.A00();
                }
            }
            AnonymousClass6YK.A0H(r7, i2, r7.A00 - i2);
            int i6 = r7.A02 - i3;
            int i7 = i2 - 1;
            if (i6 > 0) {
                int i8 = r7.A09;
                int i9 = i3 + i6;
                AnonymousClass6YK.A0C(r7, i9, i7);
                r7.A0B = i3;
                r7.A09 = i8 + i6;
                AnonymousClass02Q.A04(r7.A0H, i3, i9);
                int i10 = r7.A03;
                if (i10 >= i3) {
                    r7.A03 = i10 - i6;
                }
            }
            r7.A00 = i2;
            r7.A02 = i3;
            r7.A07 -= A0C;
            return;
        }
        throw A01("Cannot remove group while inserting");
    }

    public static final void A06(boolean z) {
        if (!z) {
            throw A01("Check failed");
        }
    }

    public static final int A00(List list, int i) {
        int A07 = C36431kI.A07(list);
        int i2 = 0;
        while (i2 <= A07) {
            int i3 = (i2 + A07) >>> 1;
            int A002 = AnonymousClass00C.A00(((C120645rq) list.get(i3)).A01, i);
            if (A002 < 0) {
                i2 = i3 + 1;
            } else if (A002 <= 0) {
                return i3;
            } else {
                A07 = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static RuntimeException A01(String str) {
        A04(str);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static final void A04(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        A0u.append(str);
        throw new AnonymousClass5VS(AnonymousClass000.A0q("). Please report to Google or use https://goo.gle/compose-feedback", A0u));
    }

    public static final void A05(List list, int i, int i2) {
        int A002 = A00(list, i);
        if (A002 < 0) {
            A002 = -(A002 + 1);
        }
        while (A002 < list.size() && ((C120645rq) list.get(A002)).A01 < i2) {
            list.remove(A002);
        }
    }
}
