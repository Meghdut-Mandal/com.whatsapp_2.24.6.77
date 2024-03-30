package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* renamed from: X.82v  reason: invalid class name and case insensitive filesystem */
public class C1689982v extends C1690082w implements C22858AxA {
    public C202709mU A00;
    public boolean A01;
    public int A02;
    public int A03;
    public B3L A04;
    public final C199579fY A05;
    public final C21662AUe A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;

    private void A00() {
        List A15;
        this.A01 = false;
        List list = this.A09;
        if (list.isEmpty()) {
            A15 = Collections.emptyList();
        } else {
            A15 = C36441kJ.A15(list);
        }
        list.clear();
        A04(new AnonymousClass82D(this.A04, this.A07, this.A03, this.A02), (Object) null);
        if (!A15.isEmpty()) {
            C196149Xx A062 = this.A00.A06(this);
            A062.A01(6);
            A062.A02(A15);
            A062.A00();
        }
    }

    public final synchronized void A06(C202709mU r6, boolean z) {
        super.A06(r6, z);
        this.A00 = r6;
        List<C21662AUe> list = this.A08;
        if (list.isEmpty()) {
            A00();
        } else {
            this.A04 = this.A04.B2z(0, list.size());
            int i = 0;
            for (C21662AUe A022 : list) {
                A02(A022, i);
                i++;
            }
            if (!this.A01) {
                C196149Xx A062 = this.A00.A06(this);
                A062.A01(5);
                A062.A00();
                this.A01 = true;
            }
        }
    }

    public final void BJd(int i, Object obj) {
        switch (i) {
            case 0:
                AnonymousClass9GH r11 = (AnonymousClass9GH) obj;
                B3L b3l = this.A04;
                int i2 = r11.A00;
                this.A04 = b3l.B2z(i2, 1);
                A02((C21662AUe) r11.A01, i2);
                break;
            case 1:
                AnonymousClass9GH r112 = (AnonymousClass9GH) obj;
                B3L b3l2 = this.A04;
                int i3 = r112.A00;
                Collection<C21662AUe> collection = (Collection) r112.A01;
                this.A04 = b3l2.B2z(i3, collection.size());
                for (C21662AUe A022 : collection) {
                    A02(A022, i3);
                    i3++;
                }
                break;
            case 2:
                B3L b3l3 = this.A04;
                int i4 = ((AnonymousClass9GH) obj).A00;
                this.A04 = b3l3.B30(i4, i4 + 1);
                A01(i4);
                break;
            case 3:
                AnonymousClass9GH r113 = (AnonymousClass9GH) obj;
                B3L b3l4 = this.A04;
                int i5 = r113.A00;
                B3L B30 = b3l4.B30(i5, i5 + 1);
                this.A04 = B30;
                int A0I = AnonymousClass000.A0I(r113.A01);
                this.A04 = B30.B2z(A0I, 1);
                int min = Math.min(i5, A0I);
                int max = Math.max(i5, A0I);
                List list = this.A07;
                int i6 = ((C21662AUe) list.get(min)).A02;
                int i7 = ((C21662AUe) list.get(min)).A01;
                list.add(A0I, list.remove(i5));
                while (min <= max) {
                    C21662AUe aUe = (C21662AUe) list.get(min);
                    aUe.A02 = i6;
                    aUe.A01 = i7;
                    C1690282y r1 = aUe.A03;
                    i6 += r1.A01();
                    i7 += r1.A00();
                    min++;
                }
                break;
            case 4:
                int size = this.A07.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        A01(size);
                    }
                }
            case 5:
                A00();
                return;
            case 6:
                List list2 = (List) obj;
                if (0 < list2.size()) {
                    list2.get(0);
                    throw AnonymousClass001.A0A("dispatchEvent");
                }
                return;
            default:
                throw C165617ti.A0V();
        }
        if (!this.A01) {
            C196149Xx A062 = this.A00.A06(this);
            A062.A01(5);
            A062.A00();
            this.A01 = true;
        }
    }

    private void A01(int i) {
        C21662AUe aUe = (C21662AUe) this.A07.remove(i);
        C1690282y r1 = aUe.A03;
        A03(this, i, -1, -r1.A01(), -r1.A00());
        aUe.A06 = true;
        if (aUe.A04.isEmpty()) {
            AnonymousClass9J0 r2 = (AnonymousClass9J0) this.A02.remove(aUe);
            B38 b38 = r2.A01;
            b38.BnU(r2.A00);
            b38.Bnl(r2.A02);
        }
    }

    private void A02(C21662AUe aUe, int i) {
        boolean z;
        if (i > 0) {
            C21662AUe aUe2 = (C21662AUe) this.A07.get(i - 1);
            int i2 = aUe2.A02;
            C1690282y r2 = aUe2.A03;
            int A012 = i2 + r2.A01();
            aUe.A00 = i;
            aUe.A02 = A012;
            aUe.A01 = aUe2.A01 + r2.A00();
            z = false;
        } else {
            z = false;
            aUe.A00 = i;
            aUe.A02 = 0;
            aUe.A01 = 0;
        }
        aUe.A05 = z;
        aUe.A06 = z;
        aUe.A04.clear();
        C1690282y r0 = aUe.A03;
        A03(this, i, 1, r0.A01(), r0.A00());
        this.A07.add(i, aUe);
        A07(aUe.A08, aUe);
    }

    public static void A03(C1689982v r3, int i, int i2, int i3, int i4) {
        r3.A03 += i3;
        r3.A02 += i4;
        while (true) {
            List list = r3.A07;
            if (i < list.size()) {
                ((C21662AUe) list.get(i)).A00 += i2;
                ((C21662AUe) list.get(i)).A02 += i3;
                ((C21662AUe) list.get(i)).A01 += i4;
                i++;
            } else {
                return;
            }
        }
    }

    public final B5S B4q(AnonymousClass9WT r7, C195899Ws r8, long j) {
        int i = r7.A02;
        C21662AUe aUe = this.A06;
        aUe.A01 = i;
        List list = this.A07;
        int binarySearch = Collections.binarySearch(list, aUe);
        if (binarySearch >= 0) {
            while (binarySearch < C36431kI.A07(list)) {
                int i2 = binarySearch + 1;
                if (((C21662AUe) list.get(i2)).A01 != i) {
                    break;
                }
                binarySearch = i2;
            }
        } else {
            binarySearch = (-binarySearch) - 2;
        }
        C21662AUe aUe2 = (C21662AUe) list.get(binarySearch);
        C209359zs r5 = new C209359zs(r7.A00(i - aUe2.A01), aUe2.A08, r8);
        this.A0A.put(r5, aUe2);
        aUe2.A04.add(r5);
        if (aUe2.A05) {
            B5S B4q = r5.A05.B4q(r5.A04, r5.A06, r5.A01);
            r5.A03 = B4q;
            if (r5.A02 != null) {
                B4q.Bm4(r5, r5.A01);
            }
        }
        return r5;
    }

    public final void BnT(B5S b5s) {
        C21662AUe aUe = (C21662AUe) this.A0A.remove(b5s);
        C209359zs r0 = (C209359zs) b5s;
        B5S b5s2 = r0.A03;
        if (b5s2 != null) {
            r0.A05.BnT(b5s2);
        }
        List list = aUe.A04;
        list.remove(b5s);
        if (list.isEmpty() && aUe.A06) {
            AnonymousClass9J0 r2 = (AnonymousClass9J0) this.A02.remove(aUe);
            B38 b38 = r2.A01;
            b38.BnU(r2.A00);
            b38.Bnl(r2.A02);
        }
    }

    public C1689982v(B3L b3l, B38... b38Arr) {
        int length = b38Arr.length;
        for (int i = 0; i < length; i = 1) {
            Objects.requireNonNull(b38Arr[i]);
        }
        this.A04 = b3l.getLength() > 0 ? b3l.B2y() : b3l;
        this.A0A = new IdentityHashMap();
        this.A08 = AnonymousClass001.A0I();
        this.A07 = AnonymousClass001.A0I();
        this.A09 = AnonymousClass001.A0I();
        this.A06 = new C21662AUe((B38) null);
        this.A05 = new C199579fY();
        List<B38> asList = Arrays.asList(b38Arr);
        synchronized (this) {
            List list = this.A08;
            int size = list.size();
            for (B38 requireNonNull : asList) {
                Objects.requireNonNull(requireNonNull);
            }
            ArrayList A0r = C36361kB.A0r(asList);
            for (B38 aUe : asList) {
                A0r.add(new C21662AUe(aUe));
            }
            list.addAll(size, A0r);
            if (this.A00 != null && !asList.isEmpty()) {
                C196149Xx A062 = this.A00.A06(this);
                A062.A01(1);
                A062.A02(new AnonymousClass9GH(A0r, size));
                A062.A00();
            }
        }
    }

    public final void A05() {
        super.A05();
        this.A07.clear();
        this.A00 = null;
        this.A04 = this.A04.B2y();
        this.A03 = 0;
        this.A02 = 0;
    }

    public C1689982v() {
        this(new A05(new Random(), new int[0]), new B38[0]);
    }
}
