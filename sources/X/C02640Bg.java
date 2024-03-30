package X;

import android.content.Context;

/* renamed from: X.0Bg  reason: invalid class name and case insensitive filesystem */
public class C02640Bg {
    public static C02640Bg A01 = new C02640Bg();
    public C02650Bh A00 = null;

    public static C02650Bh A00(Context context) {
        C02650Bh r0;
        C02640Bg r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C02650Bh(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
