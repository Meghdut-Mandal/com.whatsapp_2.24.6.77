package X;

/* renamed from: X.7sS  reason: invalid class name and case insensitive filesystem */
public class C164837sS implements C23023B0t {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164837sS(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BXJ(C128516Co r3, int i) {
        if (this.A02 != 0) {
            C36321k7.A1S("GetCategoriesGraphQLService.Listener/onFailure errorCode =", AnonymousClass000.A0u(), i);
            if (406 == i || 421 == i) {
                C202279lS.A00((C202279lS) this.A01, r3.A02);
            }
            ((C159207iz) this.A00).BXd(r3, i);
            return;
        }
        ((C159197iy) this.A00).BXP(this.A01, i);
    }

    public void Bi4(C128516Co r3, A90 a90) {
        if (this.A02 != 0) {
            ((C159207iz) this.A00).BXe(r3, a90);
        } else {
            ((C159197iy) this.A00).BiC(this.A01, a90);
        }
    }
}
