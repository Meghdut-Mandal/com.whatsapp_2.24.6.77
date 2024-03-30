package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.1qX  reason: invalid class name and case insensitive filesystem */
public abstract class C38951qX extends RelativeLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static Rect A00(KeyboardPopupLayout keyboardPopupLayout) {
        keyboardPopupLayout.A04 = false;
        keyboardPopupLayout.A01 = -1;
        keyboardPopupLayout.A00 = -1;
        return new Rect();
    }

    public void A08() {
        if (!this.A01) {
            this.A01 = true;
            ((KeyboardPopupLayout) this).A03 = C36401kF.A0f(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
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

    public C38951qX(Context context) {
        super(context);
        A08();
    }

    public C38951qX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
    }

    public C38951qX(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A08();
    }

    public C38951qX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
    }
}
