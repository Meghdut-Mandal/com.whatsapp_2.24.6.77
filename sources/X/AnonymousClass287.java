package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;

/* renamed from: X.287  reason: invalid class name */
public abstract class AnonymousClass287 extends WaImageView {
    public boolean A00;

    public void A03() {
        if (!this.A00) {
            this.A00 = true;
            AvailabilityStateImageView availabilityStateImageView = (AvailabilityStateImageView) this;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r3.A0M;
            AnonymousClass5ZS.A00(availabilityStateImageView, C36341k9.A0T(r1));
            availabilityStateImageView.A04(C27861Qc.A06(r3), C36381kD.A0b(r1));
        }
    }

    public AnonymousClass287(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
