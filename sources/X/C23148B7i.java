package X;

import android.content.Context;

/* renamed from: X.B7i  reason: case insensitive filesystem */
public class C23148B7i implements C87724Px {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23148B7i(Context context, AnonymousClass3FX r2, AnonymousClass3T1 r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = context;
        this.A02 = r3;
    }

    public final void BSV(int i) {
        int i2;
        int i3 = this.A03;
        AnonymousClass3FX r3 = (AnonymousClass3FX) this.A00;
        Context context = (Context) this.A01;
        AnonymousClass3T1 r1 = (AnonymousClass3T1) this.A02;
        switch (i3) {
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 0;
                break;
            case 4:
                i2 = 3;
                break;
            default:
                i2 = 2;
                break;
        }
        r3.A01(context, r1, i2);
    }
}
