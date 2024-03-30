package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: X.05x  reason: invalid class name */
public abstract class AnonymousClass05x extends ImageButton {
    public int A00 = getVisibility();

    public AnonymousClass05x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void A03(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.A00 = i;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00 = i;
    }

    public final int getUserSetVisibility() {
        return this.A00;
    }
}
