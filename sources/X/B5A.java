package X;

import android.app.Activity;

public class B5A implements C22950Az2 {
    public Object A00;
    public final int A01;

    public B5A(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bfq() {
        Activity A0h;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 2:
            case 4:
                A0h = ((AnonymousClass02E) obj).A0h();
                break;
            default:
                A0h = (Activity) obj;
                break;
        }
        C199499fP.A00(A0h);
    }
}
