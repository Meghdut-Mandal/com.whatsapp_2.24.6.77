package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.1ma  reason: invalid class name and case insensitive filesystem */
public abstract class C37521ma extends View implements C18700tb {
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

    public C37521ma(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C37521ma(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C37521ma(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C37521ma(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
