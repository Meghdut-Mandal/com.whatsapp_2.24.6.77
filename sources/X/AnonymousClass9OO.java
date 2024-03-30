package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.9OO  reason: invalid class name */
public final class AnonymousClass9OO {
    public Looper A00;
    public C199399fF A01;
    public C199379fD A02;
    public B40 A03;
    public C198289dD A04 = new C198289dD();
    public C22897Ay9 A05;
    public C22897Ay9 A06;
    public C22897Ay9 A07;
    public C22897Ay9 A08;
    public C22897Ay9 A09;
    public boolean A0A;
    public final Context A0B;

    public AnonymousClass9OO(Context context) {
        A6O a6o = A6O.A00;
        A6P a6p = A6P.A00;
        C203839ox r3 = new C203839ox(context, 1);
        A6Q a6q = A6Q.A00;
        C203839ox r1 = new C203839ox(context, 2);
        this.A0B = context;
        this.A08 = a6o;
        this.A07 = a6p;
        this.A09 = r3;
        this.A06 = a6q;
        this.A05 = r1;
        Looper myLooper = Looper.myLooper();
        this.A00 = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.A02 = C199379fD.A03;
        this.A01 = C199399fF.A03;
        this.A03 = B40.A00;
    }
}
