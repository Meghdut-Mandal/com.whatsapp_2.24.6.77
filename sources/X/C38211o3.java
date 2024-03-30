package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.1o3  reason: invalid class name and case insensitive filesystem */
public abstract class C38211o3 extends FrameLayout implements C18700tb {
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

    public C38211o3(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
