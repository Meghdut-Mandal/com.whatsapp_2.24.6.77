package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.1pL  reason: invalid class name and case insensitive filesystem */
public abstract class C38581pL extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public abstract void A01();

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38581pL(Context context) {
        super(context);
        A01();
    }
}
