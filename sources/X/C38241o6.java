package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.1o6  reason: invalid class name and case insensitive filesystem */
public abstract class C38241o6 extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A02() {
        if (this instanceof C47112dU) {
            C47112dU r2 = (C47112dU) this;
            if (!r2.A0A) {
                r2.A0A = true;
                C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
                r2.A02 = C36351kA.A0V(A0W);
                r2.A05 = C36341k9.A0V(A0W);
                r2.A00 = C36351kA.A0N(A0W);
                r2.A07 = C36411kG.A0m(A0W);
                r2.A03 = C36341k9.A0T(A0W);
                r2.A01 = C36361kB.A0V(A0W);
                r2.A06 = C36411kG.A0l(A0W);
                r2.A04 = C36371kC.A0X(A0W);
            }
        } else if (this instanceof AnonymousClass2dT) {
            AnonymousClass2dT r22 = (AnonymousClass2dT) this;
            if (!r22.A09) {
                r22.A09 = true;
                C18800tq A0W2 = C36391kE.A0W(r22.generatedComponent());
                r22.A05 = C36341k9.A0V(A0W2);
                r22.A06 = C36391kE.A0j(A0W2);
                r22.A01 = C36371kC.A0R(A0W2);
                r22.A03 = C36341k9.A0T(A0W2);
                r22.A08 = C36371kC.A0l(A0W2);
                r22.A04 = (C32731e6) A0W2.A6S.get();
            }
        } else if (this instanceof C47102dR) {
            C47102dR r23 = (C47102dR) this;
            if (!r23.A04) {
                r23.A04 = true;
                C18800tq A0W3 = C36391kE.A0W(r23.generatedComponent());
                r23.A02 = C36341k9.A0V(A0W3);
                r23.A01 = C36341k9.A0T(A0W3);
            }
        } else {
            AnonymousClass2dS r24 = (AnonymousClass2dS) this;
            if (!r24.A0C) {
                r24.A0C = true;
                C18800tq A0W4 = C36391kE.A0W(r24.generatedComponent());
                r24.A05 = C36351kA.A0M(A0W4);
                r24.A08 = C36361kB.A0V(A0W4);
                r24.A09 = C36341k9.A0T(A0W4);
            }
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

    public C38241o6(Context context) {
        super(context);
        A02();
    }
}
