package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4ev  reason: invalid class name and case insensitive filesystem */
public abstract class C92884ev extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A09() {
        if (this instanceof AnonymousClass5NC) {
            AnonymousClass5NC r2 = (AnonymousClass5NC) this;
            if (!r2.A05) {
                r2.A05 = true;
                C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
                r2.A0G = C90504aG.A0W(A0W);
                r2.A01 = (AnonymousClass1K3) A0W.A0x.get();
                r2.A02 = (AnonymousClass66D) A0W.A00.A0Q.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass5ND) this).A0G = C90504aG.A0W(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
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

    public C92884ev(Context context) {
        super(context);
        A09();
    }
}
