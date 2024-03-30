package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.1pd  reason: invalid class name and case insensitive filesystem */
public abstract class C38721pd extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38721pd(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C43512Ic r2 = (C43512Ic) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            r2.A04 = C36341k9.A0V(r1);
            r2.A03 = C36341k9.A0T(r1);
            r2.A05 = (C64633Ov) r1.A00.A2u.get();
        }
    }
}
