package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6Ud  reason: invalid class name and case insensitive filesystem */
public class C132526Ud {
    public static final C130866Ms A03 = new C130866Ms(0.0d, 0.0d, 1.0d, 1.0d);
    public final C124355y2 A00 = new C124355y2(A03, 0);
    public final C130866Ms A01 = new C130866Ms();
    public final double[] A02 = new double[2];

    public static void A00(C124355y2 r19, C132526Ud r20, C130866Ms r21, Collection collection) {
        C130866Ms r13 = r21;
        double d = r13.A01;
        double d2 = r13.A02;
        C124355y2 r14 = r19;
        C132526Ud r212 = r20;
        Collection collection2 = collection;
        if (d > d2) {
            C130866Ms r2 = r212.A01;
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = d;
            r2.A02 = d2;
            r2.A02 = 1.0d;
            A00(r14, r212, r2, collection2);
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = r13.A01;
            r2.A02 = r13.A02;
            r2.A01 = 0.0d;
            A00(r14, r212, r2, collection2);
            return;
        }
        C130866Ms r15 = r14.A06;
        double d3 = r15.A01;
        double d4 = d3;
        if (d3 <= d2) {
            double d5 = r15.A02;
            double d6 = d5;
            if (d <= d5) {
                double d7 = r15.A03;
                double d8 = r13.A00;
                if (d7 <= d8) {
                    double d9 = r13.A03;
                    double d10 = r15.A00;
                    if (d9 > d10) {
                        return;
                    }
                    if (!r14.A04) {
                        C132526Ud r0 = r212;
                        A00(r14.A01, r0, r13, collection2);
                        A00(r14.A00, r0, r13, collection2);
                        A00(r14.A03, r0, r13, collection2);
                        A00(r14.A02, r0, r13, collection2);
                        return;
                    }
                    boolean z = false;
                    if (d <= d2 && d9 <= d8 && d <= d4 && d4 <= d2 && d <= d6 && d6 <= d2 && d9 <= d10 && d10 <= d8 && d9 <= d7 && d7 <= d8) {
                        z = true;
                    }
                    ArrayList arrayList = r14.A07;
                    if (z) {
                        collection2.addAll(arrayList);
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass72U r9 = (AnonymousClass72U) it.next();
                        double[] dArr = r212.A02;
                        r9.A00(dArr);
                        double d11 = dArr[0];
                        double d12 = dArr[1];
                        double d13 = r13.A01;
                        double d14 = r13.A02;
                        if (d13 <= d14) {
                            double d15 = r13.A03;
                            double d16 = r13.A00;
                            if (d15 <= d16 && d13 <= d11 && d11 <= d14 && d15 <= d12 && d12 <= d16) {
                                collection2.add(r9);
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean A01(AnonymousClass72U r28, C124355y2 r29, C132526Ud r30) {
        int i;
        C132526Ud r9 = r30;
        double[] dArr = r9.A02;
        AnonymousClass72U r11 = r28;
        r11.A00(dArr);
        C124355y2 r10 = r29;
        C130866Ms r8 = r10.A06;
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = r8.A01;
        double d4 = r8.A02;
        if (d3 <= d4) {
            double d5 = r8.A03;
            double d6 = r8.A00;
            if (d5 <= d6 && d3 <= d && d <= d4 && d5 <= d2 && d2 <= d6) {
                if (r10.A04) {
                    ArrayList arrayList = r10.A07;
                    if (arrayList.size() < 40 || (i = r10.A05) > 20) {
                        arrayList.add(r11);
                        return true;
                    }
                    double d7 = r8.A01;
                    double d8 = r8.A02;
                    double d9 = (d7 + d8) * 0.5d;
                    double d10 = r8.A03;
                    double d11 = (d10 + r8.A00) * 0.5d;
                    int i2 = i + 1;
                    r10.A00 = new C124355y2(new C130866Ms(d9, d10, d8, d11), i2);
                    r10.A03 = new C124355y2(new C130866Ms(r8.A01, d11, d9, r8.A00), i2);
                    r10.A01 = new C124355y2(new C130866Ms(r8.A01, r8.A03, d9, d11), i2);
                    r10.A02 = new C124355y2(new C130866Ms(d9, d11, r8.A02, r8.A00), i2);
                    r10.A04 = false;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AnonymousClass72U r1 = (AnonymousClass72U) arrayList.get(i3);
                        if (!A01(r1, r10.A01, r9) && !A01(r1, r10.A00, r9) && !A01(r1, r10.A03, r9)) {
                            A01(r1, r10.A02, r9);
                        }
                    }
                    arrayList.clear();
                }
                if (!A01(r11, r10.A01, r9) && !A01(r11, r10.A00, r9) && !A01(r11, r10.A03, r9)) {
                    if (!A01(r11, r10.A02, r9)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
