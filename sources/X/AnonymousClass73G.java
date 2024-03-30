package X;

import java.util.Iterator;

/* renamed from: X.73G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73G implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass6E3 A03;

    public /* synthetic */ AnonymousClass73G(AnonymousClass6E3 r1, float f, int i, int i2) {
        this.A03 = r1;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
    }

    public final void run() {
        AnonymousClass6E3 r2 = this.A03;
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        C117925n3 r0 = r2.A05;
        if (r0 != null) {
            int i3 = r2.A09;
            AnonymousClass6PP r22 = new AnonymousClass6PP(i, i2, f);
            AnonymousClass6WC r1 = r0.A00;
            r1.A0D[i3] = r22;
            if (i3 == r1.A00 % 2) {
                AnonymousClass6WC.A03(r1, i3);
            }
            for (C1255660j r02 : r1.A0B) {
                AnonymousClass6WA r03 = r02.A00.A01;
                if (r03 != null) {
                    Iterator it = r03.A03.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }
}
