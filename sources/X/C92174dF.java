package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* renamed from: X.4dF  reason: invalid class name and case insensitive filesystem */
public abstract class C92174dF extends SurfaceView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public C92174dF(Context context) {
        super(context, (AttributeSet) null, 0);
        A0A();
    }

    public void A0A() {
        if (this instanceof C1030453i) {
            C1030453i r2 = (C1030453i) this;
            if (!r2.A03) {
                r2.A03 = true;
                C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
                r2.A0F = C36351kA.A0U(A0W);
                r2.A0H = (AnonymousClass1JD) A0W.A00.A5x.get();
                r2.A0I = C36351kA.A0m(A0W);
                r2.A0G = C36351kA.A0X(A0W);
            }
        } else if (!this.A01) {
            this.A01 = true;
            C1030553k r22 = (C1030553k) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            r22.A0F = C36351kA.A0U(r1);
            r22.A0H = (AnonymousClass1JD) r1.A00.A5x.get();
            r22.A0I = C36351kA.A0m(r1);
            r22.A0G = C36351kA.A0X(r1);
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
}
