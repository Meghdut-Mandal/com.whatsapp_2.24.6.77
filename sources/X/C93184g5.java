package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageButton;

/* renamed from: X.4g5  reason: invalid class name and case insensitive filesystem */
public abstract class C93184g5 extends AnonymousClass07N implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ((WaImageButton) this).A00 = C36341k9.A0T(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
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

    public C93184g5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C93184g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C93184g5(Context context) {
        super(context, (AttributeSet) null);
        A01();
    }
}
