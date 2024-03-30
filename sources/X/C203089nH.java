package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9nH  reason: invalid class name and case insensitive filesystem */
public class C203089nH {
    public AnonymousClass9W3 A00;
    public AnonymousClass9W3 A01;
    public AnonymousClass9W3 A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public static AnonymousClass9W3 A03(AnonymousClass9W3 r18, List list, Set set, double d) {
        AnonymousClass9W3 r7 = null;
        AnonymousClass9W3 r0 = r18;
        int i = r0.A02;
        int i2 = r0.A01;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d = A00(i, i2);
        }
        double d2 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass9W3 r6 = (AnonymousClass9W3) it.next();
            int i3 = r6.A02;
            int i4 = r6.A01;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A002 = A00(i3, i4);
            Set set2 = set;
            if (set == null || set2.isEmpty() || set2.contains(Double.valueOf(A002))) {
                if (max2 == max && min2 == min && Math.abs(A002 - d) <= 0.001d) {
                    return r6;
                }
                double abs = Math.abs(d - A002);
                double d3 = abs - d2;
                if (d3 <= 0.001d) {
                    if (Math.abs(d3) > 0.001d) {
                        d2 = abs;
                        r7 = null;
                        z = false;
                    }
                    if (max2 < max || min2 < min) {
                        if (!z) {
                            if (r7 != null && Long.signum((((long) i3) * ((long) i4)) - (((long) r7.A02) * ((long) r7.A01))) <= 0) {
                            }
                        }
                    } else if (!z) {
                        r7 = r6;
                        z = true;
                    } else if (r7 != null) {
                        if (Long.signum((((long) i3) * ((long) i4)) - (((long) r7.A02) * ((long) r7.A01))) >= 0) {
                        }
                    }
                    r7 = r6;
                }
            }
        }
        return r7;
    }

    public static double A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return ((double) Math.max(i, i2)) / ((double) Math.min(i, i2));
    }

    public static AnonymousClass9JN A01(C203089nH r15, List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        HashSet hashSet;
        AnonymousClass9W3 r8;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        List<AnonymousClass9W3> list5 = list;
        AnonymousClass9W3 r3 = new AnonymousClass9W3(Math.max(i6, i7), Math.min(i6, i7));
        C203089nH r12 = r15;
        int i8 = r15.A04;
        if (i8 > 0) {
            float f = (float) i8;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        ArrayList A042 = A04(list3, i3);
        if (list != null) {
            list5 = A04(list5, 10485760);
        }
        if (list2 != null) {
            list4 = A04(list4, 2097152);
        }
        if (list5 != null) {
            int i9 = r15.A03;
            if (i9 <= 0) {
                i9 = r3.A02 * r3.A01;
            }
            i5 = 0;
            if (i9 > 0) {
                Iterator it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass9W3 A022 = A02((AnonymousClass9W3) it.next(), r3);
                    int i10 = A022.A02 * A022.A01;
                    if (i10 > i5) {
                        i5 = i10;
                        if (i10 >= i9) {
                            i5 = i9;
                            break;
                        }
                    }
                }
            }
        } else {
            i5 = 0;
        }
        int i11 = r15.A05;
        if (i4 != 0) {
            double A002 = A00(r3.A02, r3.A01);
            double sqrt = Math.sqrt(((double) i4) / A002);
            r3 = new AnonymousClass9W3((int) (A002 * sqrt), (int) sqrt);
        }
        int i12 = 0;
        AnonymousClass9W3 r10 = null;
        if (i5 <= 0 || list5 == null) {
            hashSet = null;
        } else {
            i12 = (int) (((double) i5) * 0.85d);
            hashSet = C36441kJ.A16();
            for (AnonymousClass9W3 r82 : list5) {
                AnonymousClass9W3 A023 = A02(r82, r3);
                if (A023.A02 * A023.A01 >= i12) {
                    hashSet.add(Double.valueOf(A00(r82.A02, r82.A01)));
                }
            }
        }
        AnonymousClass9W3 A032 = A03(r3, A042, hashSet, 0.0d);
        if (A032 == null && (A032 = A03(r3, A042, (Set) null, 0.0d)) == null) {
            throw C90514aH.A0s("Could not calculate preview size.");
        }
        double A003 = A00(A032.A02, A032.A01);
        if (list5 != null) {
            if (i5 > 0) {
                double sqrt2 = Math.sqrt(((double) i12) / A003);
                r3 = new AnonymousClass9W3((int) (A003 * sqrt2), (int) sqrt2);
            }
            r8 = A03(r3, list5, (Set) null, A003);
        } else {
            r8 = null;
        }
        if (list4 != null) {
            if (i11 == 0) {
                r10 = A03(A032, list4, (Set) null, A003);
            } else {
                double d = 0.0d;
                if (A003 != 0.0d) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < list4.size(); i14++) {
                        AnonymousClass9W3 r6 = (AnonymousClass9W3) list4.get(i14);
                        int i15 = r6.A02;
                        int i16 = r6.A01;
                        int i17 = i15 * i16;
                        double A004 = A00(i15, i16);
                        int A052 = AnonymousClass000.A05(i11, i17);
                        double abs = Math.abs(A003 - A004);
                        if (r10 != null) {
                            double d2 = (double) i17;
                            if (((double) (((int) (abs * d2)) + A052)) >= ((double) (((int) (d2 * d)) + i13))) {
                            }
                        }
                        r10 = r6;
                        d = abs;
                        i13 = A052;
                    }
                }
            }
        }
        r12.A01 = A032;
        r12.A00 = r8;
        r12.A02 = r10;
        return new AnonymousClass9JN(A032, r8, r10);
    }

    public C203089nH(int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }

    public static AnonymousClass9W3 A02(AnonymousClass9W3 r9, AnonymousClass9W3 r10) {
        int i = r9.A02;
        int i2 = r9.A01;
        double A002 = A00(i, i2);
        int i3 = r10.A02;
        int i4 = r10.A01;
        if (Math.abs(A002 - A00(i3, i4)) <= ((double) 0.02f)) {
            return r9;
        }
        if ((i - i2) * (i3 - i4) < 0) {
            r10 = new AnonymousClass9W3(i4, i3);
        }
        float f = (float) r10.A01;
        float f2 = (float) r10.A02;
        int i5 = (int) (((float) i) * (f / f2));
        if (i5 <= i2) {
            return new AnonymousClass9W3(i, i5);
        }
        return new AnonymousClass9W3((int) (((float) i2) * (f2 / f)), i2);
    }

    public static ArrayList A04(List list, int i) {
        ArrayList A0r = C36361kB.A0r(list);
        AnonymousClass9W3 r5 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass9W3 r3 = (AnonymousClass9W3) list.get(i2);
            if (r3.A02 * r3.A01 <= i) {
                A0r.add(r3);
            }
            if (r5 == null || r3.A02 * r3.A01 < r5.A02 * r5.A01) {
                r5 = r3;
            }
        }
        if (A0r.isEmpty() && r5 != null) {
            A0r.add(r5);
        }
        return A0r;
    }

    public C203089nH(int i, int i2, int i3, boolean z) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }
}
