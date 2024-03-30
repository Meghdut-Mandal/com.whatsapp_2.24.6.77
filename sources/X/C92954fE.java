package X;

import android.content.Context;
import android.widget.HorizontalScrollView;

/* renamed from: X.4fE  reason: invalid class name and case insensitive filesystem */
public abstract class C92954fE extends HorizontalScrollView implements C18700tb {
    public AnonymousClass1QZ A00;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92954fE(Context context) {
        super(context);
        C106355Jj r1 = (C106355Jj) this;
        if (!r1.A00) {
            r1.A00 = true;
            r1.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) r1.generatedComponent())).A0M);
        }
    }
}
