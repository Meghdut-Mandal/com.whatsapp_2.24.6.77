package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;

/* renamed from: X.7vp  reason: invalid class name and case insensitive filesystem */
public abstract class C166447vp extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            PaymentInteropShimmerRow paymentInteropShimmerRow = (PaymentInteropShimmerRow) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            paymentInteropShimmerRow.A01 = C36381kD.A0f(r1);
            paymentInteropShimmerRow.A02 = (C202179lC) r1.A00.A39.get();
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

    public C166447vp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C166447vp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C166447vp(Context context) {
        super(context);
        A01();
    }
}
