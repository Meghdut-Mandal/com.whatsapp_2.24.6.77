package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.4et  reason: invalid class name and case insensitive filesystem */
public abstract class C92864et extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A01() {
        AnonymousClass5NT r2 = (AnonymousClass5NT) this;
        if (!r2.A00) {
            r2.A00 = true;
            C18800tq A0W = C36391kE.A0W(r2.generatedComponent());
            r2.A02 = C36341k9.A0V(A0W);
            r2.A01 = C36341k9.A0T(A0W);
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

    public C92864et(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
