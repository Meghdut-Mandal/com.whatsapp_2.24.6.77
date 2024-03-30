package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.1gh  reason: invalid class name and case insensitive filesystem */
public abstract class C34251gh extends C015506r implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A04() {
        if (!this.A01) {
            this.A01 = true;
            WDSButton wDSButton = (WDSButton) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            wDSButton.A03 = (C20810yC) r1.A02.get();
            wDSButton.A01 = (C18820ts) r1.A9X.get();
            wDSButton.A02 = (C21520zN) r1.A01.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C34251gh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
    }
}
