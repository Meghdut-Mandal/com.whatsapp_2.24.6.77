package X;

import java.util.Objects;

public class A11 implements C22868AxN {
    public final /* synthetic */ AnonymousClass9MI A00;
    public final /* synthetic */ A1T A01;

    public A11(AnonymousClass9MI r1, A1T a1t) {
        this.A01 = a1t;
        this.A00 = r1;
    }

    public void BnN(Object obj) {
        boolean z;
        AU0 A012;
        AnonymousClass9CH r0;
        A1T a1t = this.A01;
        AnonymousClass9MI r4 = this.A00;
        Objects.requireNonNull(r4);
        synchronized (a1t) {
            Objects.requireNonNull(r4);
            int i = r4.A00;
            AnonymousClass6GV.A01(AnonymousClass000.A1R(i));
            int i2 = i - 1;
            r4.A00 = i2;
            if (r4.A01 || i2 != 0) {
                z = false;
            } else {
                a1t.A04.A04(r4.A04, r4);
                z = true;
            }
            A012 = A1T.A01(r4, a1t);
        }
        if (A012 != null) {
            A012.close();
        }
        if (z && (r0 = r4.A03) != null) {
            Object obj2 = r4.A04;
            AnonymousClass9LI r1 = r0.A00;
            synchronized (r1) {
                r1.A03.add(obj2);
            }
        }
        A1T.A04(a1t);
        a1t.A06();
    }
}
