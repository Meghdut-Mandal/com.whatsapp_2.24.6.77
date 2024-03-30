package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;

/* renamed from: X.28I  reason: invalid class name */
public abstract class AnonymousClass28I extends WaTextView {
    public boolean A00;

    public void A09() {
        if (!this.A00) {
            this.A00 = true;
            AvailabilityStateTextView availabilityStateTextView = (AvailabilityStateTextView) this;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C36321k7.A0e(r2.A0M, availabilityStateTextView);
            availabilityStateTextView.A0D(C27861Qc.A05(r2));
        }
    }

    public AnonymousClass28I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
    }
}
