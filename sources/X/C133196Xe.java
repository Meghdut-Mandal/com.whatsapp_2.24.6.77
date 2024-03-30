package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Xe  reason: invalid class name and case insensitive filesystem */
public class C133196Xe {
    public final float A00;
    public final Context A01;
    public final C139266jV A02;
    public final C132526Ud A03;
    public final List A04 = AnonymousClass001.A0I();
    public final Map A05;
    public final Set A06 = C36441kJ.A16();
    public final double[] A07 = new double[2];

    public static C130866Ms A01(C144426sA r17, C133196Xe r18) {
        C144426sA r3 = r17;
        C133196Xe r7 = r18;
        double[] A062 = A06(r3.BG3(), r7);
        Context context = r7.A01;
        AnonymousClass00C.A0D(context, 0);
        float A012 = r3.A03 + r3.A00 + C90524aI.A01(context, 3.0f);
        float f = r3.A07;
        if (f == -1.0f) {
            f = C90524aI.A01(context, 4.0f);
            r3.A07 = f;
        }
        float A002 = r3.A00(context);
        float A013 = C90524aI.A01(context, 20.0f);
        double A072 = r7.A07(A012 / 2.0f);
        float f2 = A013 / 2.0f;
        return new C130866Ms(A062[0] + r7.A07(f2), A062[1] - A072, r7.A07(f2 + A002 + f) + A062[0], A062[1] + A072);
    }

    public static boolean A05(C130866Ms r5, C130866Ms r6) {
        if (r6 == null || r5.A01 >= r6.A02 || r6.A01 >= r5.A02 || r5.A03 >= r6.A00 || r6.A03 >= r5.A00) {
            return false;
        }
        return true;
    }

    public static double[] A06(C134976bv r4, C133196Xe r5) {
        double[] dArr = r5.A07;
        dArr[0] = AnonymousClass6WY.A01(r4.A01);
        dArr[1] = AnonymousClass6WY.A00(r4.A00);
        return dArr;
    }

    public double A07(float f) {
        C139266jV r1 = this.A02;
        AnonymousClass6WY r0 = r1.A0R;
        float A002 = C134996bx.A00(r1);
        return (double) (f / (((float) ((1 << ((int) A002)) * r0.A00.A0N)) * ((A002 % 1.0f) + 1.0f)));
    }

    public C130866Ms A08(C135076c5 r15, int i) {
        double A072 = A07(C90524aI.A01(this.A01, (float) i));
        C134976bv r3 = r15.A01;
        C134976bv r2 = r15.A00;
        return new C130866Ms(AnonymousClass6WY.A01(r3.A01) - A072, AnonymousClass6WY.A00(r2.A00) - A072, AnonymousClass6WY.A01(r2.A01) + A072, AnonymousClass6WY.A00(r3.A00) + A072);
    }

    public C133196Xe(C139266jV r3) {
        this.A02 = r3;
        this.A03 = new C132526Ud();
        Context context = r3.A0O;
        this.A01 = context;
        this.A05 = AnonymousClass001.A0J();
        this.A00 = C90524aI.A01(context, 80.0f);
    }

    public static C130866Ms A00(C144426sA r14, C133196Xe r15) {
        double[] A062 = A06(r14.BG3(), r15);
        Context context = r15.A01;
        float A012 = C90524aI.A01(context, 20.0f);
        AnonymousClass00C.A0D(context, 0);
        float A013 = r14.A03 + r14.A00 + C90524aI.A01(context, 3.0f);
        float f = r14.A07;
        if (f == -1.0f) {
            f = C90524aI.A01(context, 4.0f);
            r14.A07 = f;
        }
        float A002 = r14.A00(context);
        double A072 = r15.A07(A013 / 2.0f);
        float f2 = A012 / 2.0f;
        return new C130866Ms(A062[0] - r15.A07((float) ((int) ((A002 + f2) + f))), A062[1] - A072, A062[0] - r15.A07(f2), A062[1] + A072);
    }

    public static C130866Ms A02(C144426sA r10, C133196Xe r11, double d) {
        double[] A062 = A06(r10.BG3(), r11);
        double A072 = r11.A07(C90524aI.A01(r11.A01, 20.0f) / 2.0f);
        double d2 = A062[0];
        double d3 = A062[1];
        return new C130866Ms((d2 - A072) - d, (d3 - A072) - d, d2 + A072 + d, d3 + A072 + d);
    }

    public static HashSet A03(C130866Ms r10, C144426sA r11, C133196Xe r12, Set set) {
        HashSet A16 = C36441kJ.A16();
        Double d = r11.A0B.A04;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass72U r3 = (AnonymousClass72U) it.next();
            C144426sA r6 = (C144426sA) r3.A03;
            Double d2 = r6.A0B.A04;
            if (!r12.A06.contains(r6) || d == null || d2 == null || d2.doubleValue() > d.doubleValue()) {
                C130866Ms A022 = A02(r6, r12, 0.0d);
                C130866Ms r1 = null;
                if (r6.A0A) {
                    if (r6.A08 == 2) {
                        r1 = A01(r6, r12);
                    } else {
                        r1 = A00(r6, r12);
                    }
                }
                if (A05(r10, A022) || A05(r10, r1)) {
                    A16.add(r3);
                }
            }
        }
        return A16;
    }

    public static void A04(List list, Set set) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (set.contains(listIterator.next())) {
                listIterator.remove();
            }
        }
    }
}
