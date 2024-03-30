package X;

import android.app.Activity;

/* renamed from: X.2Ky  reason: invalid class name and case insensitive filesystem */
public class C44052Ky implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public Object A01;
    public final int A02;

    public C44052Ky(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object invoke() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ((C74173lB) this.A01).A0E((Activity) obj);
        } else {
            C70803fk.A1E((C70803fk) obj, ((AnonymousClass3BR) this.A01).A06);
        }
        return AnonymousClass0AJ.A00;
    }
}
