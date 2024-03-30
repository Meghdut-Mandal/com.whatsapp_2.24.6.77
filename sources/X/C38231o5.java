package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.1o5  reason: invalid class name and case insensitive filesystem */
public abstract class C38231o5 extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A00() {
        if (this instanceof C43872Kd) {
            C43872Kd r2 = (C43872Kd) this;
            if (!r2.A03) {
                r2.A03 = true;
                C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
                r2.A04 = C36351kA.A0q(A0W);
                r2.A00 = C36341k9.A0T(A0W);
                return;
            }
            return;
        }
        C43882Ke r22 = (C43882Ke) this;
        if (!r22.A06) {
            r22.A06 = true;
            C18800tq A0W2 = C36391kE.A0W(r22.generatedComponent());
            r22.A04 = C36351kA.A0q(A0W2);
            r22.A04 = C36351kA.A0W(A0W2);
            r22.A01 = C36351kA.A0N(A0W2);
            r22.A02 = C36341k9.A0R(A0W2);
            r22.A03 = C36351kA.A0U(A0W2);
            r22.A00 = C36351kA.A0K(A0W2);
            r22.A05 = C36341k9.A0T(A0W2);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38231o5(Context context) {
        super(context);
        A00();
    }
}
