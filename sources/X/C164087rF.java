package X;

import android.view.View;

/* renamed from: X.7rF  reason: invalid class name and case insensitive filesystem */
public class C164087rF implements AnonymousClass7eG {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164087rF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BVw() {
        switch (this.A02) {
            case 0:
                C124775ym r2 = (C124775ym) this.A00;
                AnonymousClass3RP.A00(r2.A07.A00, (View) this.A01);
                AnonymousClass7eG r0 = r2.A05;
                if (r0 != null) {
                    r0.BVw();
                    return;
                }
                return;
            case 1:
                C160377ku r22 = (C160377ku) this.A00;
                C100674vP r1 = (C100674vP) this.A01;
                if (r22 != null) {
                    AnonymousClass6JI.A00(r1, AnonymousClass6MO.A01, r22);
                    return;
                }
                return;
            default:
                AnonymousClass3RP.A00(((C1271967i) this.A00).A00, (View) this.A01);
                return;
        }
    }
}
