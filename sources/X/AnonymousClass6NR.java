package X;

import android.content.Context;

/* renamed from: X.6NR  reason: invalid class name */
public class AnonymousClass6NR {
    public static volatile AnonymousClass6NR A0C;
    public final Context A00;
    public final C158987iZ A01;
    public final AnonymousClass65V A02;
    public final C125285zd A03;
    public final AnonymousClass5Z2 A04;
    public final C1257661e A05;
    public final AnonymousClass6WH A06;
    public final AnonymousClass5ZD A07;
    public final AnonymousClass7fJ A08;
    public final C132126Sg A09;
    public final AnonymousClass6IJ A0A;
    public final AnonymousClass6T8 A0B;

    public static AnonymousClass6NR A00() {
        if (A0C == null) {
            synchronized (AnonymousClass6NR.class) {
                if (A0C == null) {
                    throw AnonymousClass001.A09("Can't find bloks instance. Is it initialized?");
                }
            }
        }
        return A0C;
    }

    public AnonymousClass6T8 A02() {
        AnonymousClass6T8 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
    }

    public AnonymousClass6NR(Context context, C158987iZ r3, AnonymousClass65V r4, C125285zd r5, AnonymousClass6IJ r6, AnonymousClass5Z2 r7, AnonymousClass6WH r8, AnonymousClass5ZD r9, AnonymousClass7fJ r10, C132126Sg r11, AnonymousClass6T8 r12, C1258361l r13) {
        this.A00 = context;
        this.A08 = r10;
        this.A04 = r7;
        this.A07 = r9;
        this.A09 = r11;
        this.A02 = r4;
        this.A06 = r8;
        this.A03 = r5;
        this.A0B = r12;
        this.A0A = r6;
        this.A01 = r3;
        this.A05 = new C1257661e(r13);
    }

    public static AnonymousClass6T8 A01() {
        return A00().A02();
    }
}
