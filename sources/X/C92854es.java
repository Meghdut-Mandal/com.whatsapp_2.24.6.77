package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4es  reason: invalid class name and case insensitive filesystem */
public abstract class C92854es extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A02() {
        if (this instanceof C106295Jc) {
            C106295Jc r1 = (C106295Jc) this;
            if (!r1.A00) {
                r1.A00 = true;
                r1.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r1.generatedComponent())).A0M);
            }
        } else if (this instanceof C106285Jb) {
            C106285Jb r12 = (C106285Jb) this;
            if (!r12.A00) {
                r12.A00 = true;
                r12.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r12.generatedComponent())).A0M);
            }
        } else if (this instanceof C106325Jf) {
            C106325Jf r2 = (C106325Jf) this;
            if (!r2.A03) {
                r2.A03 = true;
                C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
                r2.A00 = C36341k9.A0V(A0W);
                r2.A00 = C36341k9.A0S(A0W);
                r2.A02 = C36351kA.A0e(A0W);
                r2.A01 = C36341k9.A0T(A0W);
            }
        } else if (this instanceof C106315Je) {
            C106315Je r13 = (C106315Je) this;
            if (!r13.A00) {
                r13.A00 = true;
                r13.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r13.generatedComponent())).A0M);
            }
        } else {
            C106305Jd r14 = (C106305Jd) this;
            if (!r14.A00) {
                r14.A00 = true;
                r14.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r14.generatedComponent())).A0M);
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

    public C92854es(Context context) {
        super(context);
        A02();
    }
}
