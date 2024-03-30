package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.1pt  reason: invalid class name and case insensitive filesystem */
public abstract class C38771pt extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public C38771pt(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass2ML r2 = (AnonymousClass2ML) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            r2.A01 = C36351kA.A0V(r1);
            r2.A00 = C36351kA.A0M(r1);
            r2.A05 = (C29581Xe) r1.A36.get();
            r2.A03 = C36351kA.A0e(r1);
            r2.A04 = C36421kH.A0M(r1);
            r2.A02 = C36341k9.A0T(r1);
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
