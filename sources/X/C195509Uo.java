package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.9Uo  reason: invalid class name and case insensitive filesystem */
public class C195509Uo {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass9Y2 A09;
    public final AnonymousClass815 A0A;
    public final AnonymousClass81B A0B;
    public final AnonymousClass9L3 A0C;
    public final C208599yW A0D;
    public final C190979Bc A0E;
    public final AnonymousClass9M9 A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final boolean A0N;

    public String toString() {
        return A00("");
    }

    public String A00(String str) {
        int i;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(this.A0I);
        A0v.append("\n");
        AnonymousClass9Y2 r5 = this.A09;
        C195509Uo r1 = (C195509Uo) r5.A05.A05(this.A08);
        if (r1 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A0v.append(str2);
                A0v.append(r1.A0I);
                r1 = (C195509Uo) r5.A05.A05(r1.A08);
                if (r1 == null) {
                    break;
                }
                str2 = "->";
            }
            A0v.append(str);
            A0v.append("\n");
        }
        List list = this.A0L;
        if (!list.isEmpty()) {
            A0v.append(str);
            C36371kC.A1R("\tMasks: ", A0v, list);
            A0v.append("\n");
        }
        int i2 = this.A06;
        if (!(i2 == 0 || (i = this.A05) == 0)) {
            A0v.append(str);
            A0v.append("\tBackground: ");
            Locale locale = Locale.US;
            Object[] A1Q = C36441kJ.A1Q();
            C36331k8.A1W(A1Q, i2);
            AnonymousClass000.A1L(A1Q, i, 1);
            AnonymousClass000.A1L(A1Q, this.A04, 2);
            A0v.append(String.format(locale, "%dx%d %X\n", A1Q));
        }
        List list2 = this.A0M;
        if (!list2.isEmpty()) {
            A0v.append(str);
            A0v.append("\tShapes:\n");
            for (Object next : list2) {
                A0v.append(str);
                A0v.append("\t\t");
                A0v.append(next);
                A0v.append("\n");
            }
        }
        return A0v.toString();
    }

    public C195509Uo(AnonymousClass9Y2 r3, AnonymousClass815 r4, AnonymousClass81B r5, AnonymousClass9L3 r6, C208599yW r7, C190979Bc r8, AnonymousClass9M9 r9, Integer num, Integer num2, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0M = list;
        this.A09 = r3;
        this.A0I = str;
        this.A07 = j;
        this.A0G = num;
        this.A08 = j2;
        this.A0J = str2;
        this.A0L = list2;
        this.A0D = r7;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = r5;
        this.A0C = r6;
        this.A0K = list3;
        this.A0H = num2;
        this.A0A = r4;
        this.A0N = z;
        this.A0E = r8;
        this.A0F = r9;
    }
}
