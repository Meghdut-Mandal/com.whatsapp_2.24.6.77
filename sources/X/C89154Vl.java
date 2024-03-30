package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Vl  reason: invalid class name and case insensitive filesystem */
public class C89154Vl extends C06590Ue {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89154Vl(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A02(Drawable drawable) {
        C89004Uw r1;
        boolean z = drawable instanceof C165747u5;
        if (this.A02 != 0) {
            if (z) {
                r1 = ((C64753Ph) this.A00).A0D.A0c;
            } else {
                return;
            }
        } else if (!z || (r1 = ((AnonymousClass2IS) this.A00).A0c) == null) {
            return;
        }
        r1.Bwy((AnonymousClass3T1) this.A01);
    }
}
