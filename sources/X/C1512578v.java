package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78v  reason: invalid class name and case insensitive filesystem */
public final class C1512578v extends ArrayList<C132056Ry<?>> {
    public static final C106365Jk A00 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A01 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 27);
    public static final C106365Jk A02 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A03 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 24);
    public static final C106365Jk A04 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A05 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A06 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A07 = new C106365Jk(C36381kD.A0j(), 13);
    public static final C106365Jk A08 = new C106365Jk(true, 13);
    public static final C106365Jk A09 = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public static final C106365Jk A0A = new C106365Jk(Integer.valueOf(R.string.f12nameremoved), 1);
    public C1512778x latestBucket = null;
    public final AnonymousClass1DU linkifyWeb;
    public final C145646uI timeBucketsProvider;

    public int A00(int i) {
        if (i < 0 || i >= size()) {
            return -1;
        }
        return ((C132056Ry) get(i)).A00;
    }

    public void A03(AnonymousClass3T1 r5, boolean z) {
        C1512778x A002 = this.timeBucketsProvider.A00(r5.A0I);
        if (!C1901797e.A00(A002, this.latestBucket)) {
            add(new C106365Jk(C36441kJ.A0Q(A002.toString(), Boolean.valueOf(z)), 12));
            this.latestBucket = A002;
        }
    }

    public C1512578v(C19630wG r3, C18820ts r4, AnonymousClass1DU r5) {
        this.linkifyWeb = r5;
        this.timeBucketsProvider = new C145646uI(r3.A00, r4);
    }

    public AnonymousClass3T1 A01(int i) {
        return (AnonymousClass3T1) ((C132056Ry) get(i)).A01;
    }

    public void A02(C20810yC r6, List list, boolean z) {
        Object r0;
        int i;
        C46812bi r1;
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0l != null) {
                if (z) {
                    A03(A0l, false);
                }
                if (A0l instanceof AnonymousClass2bV) {
                    ArrayList A052 = this.linkifyWeb.A05(A0l.A0b(), true);
                    i = 7;
                    r1 = A0l;
                    if (A052 != null) {
                        i = 19;
                        r1 = A0l;
                    }
                } else if (A0l instanceof C46972by) {
                    i = 11;
                    r1 = A0l;
                } else if (A0l instanceof AnonymousClass2bL) {
                    i = 20;
                    r1 = A0l;
                } else if (A0l instanceof C46812bi) {
                    C46812bi r12 = (C46812bi) A0l;
                    if (r12.A0W() != null) {
                        i = 40;
                        r1 = r12;
                    } else {
                        boolean A1l = r12.A1l();
                        i = 14;
                        r1 = r12;
                        if (A1l) {
                            i = 15;
                            r1 = r12;
                        }
                    }
                } else {
                    if (!(A0l instanceof C46852bm)) {
                        if (A0l instanceof C46882bp) {
                            i = 16;
                            r1 = A0l;
                        } else if (A0l instanceof C181798o3) {
                            i = 17;
                            r1 = A0l;
                        } else if (A0l instanceof C181788o2) {
                            i = 18;
                            r1 = A0l;
                        } else if ((A0l instanceof AnonymousClass2bX) || (A0l instanceof AnonymousClass2bW)) {
                            i = 21;
                            r1 = A0l;
                        } else if ((A0l instanceof AnonymousClass2bS) && r6.A0E(2662)) {
                            i = 26;
                            r1 = A0l;
                        }
                    }
                    r0 = new C106445Js(A0l);
                    add(r0);
                }
                r0 = new C106365Jk(r1, i);
                add(r0);
            }
        }
    }

    public void A04(List list, int i, int i2) {
        ArrayList A0I = AnonymousClass001.A0I();
        while (i < list.size() && i < i2) {
            A0I.add(new C106365Jk(list.get(i), 43));
            i++;
        }
        addAll(A0I);
    }
}
