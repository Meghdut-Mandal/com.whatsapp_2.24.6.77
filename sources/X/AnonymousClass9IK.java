package X;

import android.content.Context;

/* renamed from: X.9IK  reason: invalid class name */
public class AnonymousClass9IK {
    public String A00;
    public boolean A01;

    public static void A01(C001600r r2) {
        AnonymousClass9IK r1 = new AnonymousClass9IK();
        r1.A01 = true;
        r2.A0D(r1);
    }

    public static void A00(Context context, C001600r r2, int i) {
        String string = context.getString(i);
        AnonymousClass9IK r0 = new AnonymousClass9IK();
        r0.A00 = string;
        r2.A0D(r0);
    }
}
