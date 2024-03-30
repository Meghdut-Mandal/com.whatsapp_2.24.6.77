package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public final class C40351vM extends C02830Cb {
    public static final C40351vM A00 = new C40351vM();

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        boolean A0J;
        C63403Jx r5 = (C63403Jx) obj;
        C63403Jx r6 = (C63403Jx) obj2;
        C36321k7.A0w(r5, r6);
        if (!AnonymousClass00C.A0J(r5.A04, r6.A04) || !AnonymousClass00C.A0J(r5.A02, r6.A02) || r5.A00 != r6.A00 || !AnonymousClass00C.A0J(r5.A03, r6.A03)) {
            return false;
        }
        Drawable drawable = r5.A01;
        Drawable drawable2 = r6.A01;
        if (drawable == null) {
            if (drawable2 == null) {
                return true;
            }
            return false;
        } else if (drawable2 == null) {
            return false;
        } else {
            Drawable.ConstantState constantState = drawable.getConstantState();
            Drawable.ConstantState constantState2 = drawable2.getConstantState();
            if (constantState == null && constantState2 == null) {
                A0J = drawable.equals(drawable2);
            } else {
                A0J = AnonymousClass00C.A0J(constantState, constantState2);
            }
            if (A0J) {
                return true;
            }
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C63403Jx r3 = (C63403Jx) obj;
        C63403Jx r4 = (C63403Jx) obj2;
        C36321k7.A0w(r3, r4);
        return AnonymousClass00C.A0J(r3.A02, r4.A02);
    }
}
