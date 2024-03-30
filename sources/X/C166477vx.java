package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.7vx  reason: invalid class name and case insensitive filesystem */
public abstract class C166477vx extends LinearLayout implements C18700tb {
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

    public C166477vx(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C180388li r2 = (C180388li) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            r2.A0P = C36341k9.A0V(r1);
            r2.A0A = C36351kA.A0M(r1);
            r2.A0Q = (C28371Sj) r1.A4r.get();
            r2.A0X = C36341k9.A0Z(r1);
            r2.A0L = C165577te.A0Q(r1);
            r2.A0I = C36361kB.A0V(r1);
            r2.A0J = C36341k9.A0R(r1);
            r2.A0U = C36381kD.A0f(r1);
            r2.A0M = C36371kC.A0Z(r1);
            r2.A0N = (AnonymousClass1VZ) r1.A6B.get();
            r2.A0W = C36431kI.A0p(r1);
            r2.A0T = C36371kC.A0h(r1);
            C18830tt r12 = r1.A00;
            r2.A0R = (C202629mK) r12.AAf.get();
            r2.A0V = (C202179lC) r12.A39.get();
        }
    }
}
