package X;

import android.content.Context;

public class B8A implements C22908AyK {
    public Object A00;
    public final int A01;

    public B8A(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTc() {
        switch (this.A01) {
            case 2:
                C225314u r2 = (C225314u) this.A00;
                r2.A33(AnonymousClass190.A01(r2), true);
                return;
            case 3:
                Context context = (Context) this.A00;
                context.startActivity(AnonymousClass190.A01(context));
                return;
            default:
                ((C201239j8) this.A00).A02();
                return;
        }
    }
}
