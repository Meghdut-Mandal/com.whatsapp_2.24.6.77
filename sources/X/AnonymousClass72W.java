package X;

import java.util.List;

/* renamed from: X.72W  reason: invalid class name */
public final class AnonymousClass72W implements Comparable {
    public static final AnonymousClass72W A01;
    public static final AnonymousClass72W A02;
    public static final AnonymousClass72W A03;
    public static final AnonymousClass72W A04;
    public static final AnonymousClass72W A05;
    public static final AnonymousClass72W A06;
    public static final AnonymousClass72W A07;
    public static final AnonymousClass72W A08;
    public static final AnonymousClass72W A09;
    public static final AnonymousClass72W A0A;
    public static final AnonymousClass72W A0B;
    public static final AnonymousClass72W A0C;
    public static final AnonymousClass72W A0D;
    public static final AnonymousClass72W A0E;
    public static final AnonymousClass72W A0F;
    public static final AnonymousClass72W A0G;
    public static final AnonymousClass72W A0H;
    public static final AnonymousClass72W A0I;
    public static final List A0J;
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass72W) && this.A00 == ((AnonymousClass72W) obj).A00);
    }

    static {
        AnonymousClass72W r10 = new AnonymousClass72W(100);
        A0B = r10;
        AnonymousClass72W r9 = new AnonymousClass72W(200);
        A0C = r9;
        AnonymousClass72W r8 = new AnonymousClass72W(300);
        A0D = r8;
        AnonymousClass72W r7 = new AnonymousClass72W(400);
        A0E = r7;
        AnonymousClass72W r6 = new AnonymousClass72W(500);
        A0F = r6;
        AnonymousClass72W r5 = new AnonymousClass72W(600);
        A04 = r5;
        AnonymousClass72W r4 = new AnonymousClass72W(700);
        A0G = r4;
        AnonymousClass72W r3 = new AnonymousClass72W(800);
        A0H = r3;
        AnonymousClass72W r2 = new AnonymousClass72W(900);
        A0I = r2;
        A0A = r10;
        A07 = r9;
        A08 = r8;
        A03 = r7;
        A02 = r6;
        A09 = r5;
        A01 = r4;
        A06 = r3;
        A05 = r2;
        AnonymousClass72W[] r1 = new AnonymousClass72W[9];
        C36321k7.A1F(r10, r9, r8, r7, r1);
        AnonymousClass000.A18(r6, r5, r4, r3, r1);
        A0J = C36341k9.A0m(r2, r1, 8);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AnonymousClass00C.A00(this.A00, ((AnonymousClass72W) obj).A00);
    }

    public AnonymousClass72W(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw AnonymousClass000.A0d("Font weight can be in range [1, 1000]. Current value: ", AnonymousClass000.A0u(), i);
        }
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FontWeight(weight=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
