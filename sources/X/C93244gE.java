package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.4gE  reason: invalid class name and case insensitive filesystem */
public abstract class C93244gE extends Toolbar implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A0K() {
        if (this instanceof C100724vU) {
            C100724vU r2 = (C100724vU) this;
            if (!r2.A00) {
                r2.A00 = true;
                PayToolbar payToolbar = (PayToolbar) r2;
                C18800tq r1 = ((C27861Qc) ((C27851Qb) r2.generatedComponent())).A0M;
                payToolbar.A00 = (C27941Ql) r1.A00.A0N.get();
                payToolbar.A04 = C36341k9.A0T(r1);
                payToolbar.A05 = C36341k9.A0V(r1);
                return;
            }
            return;
        }
        C100714vT r12 = (C100714vT) this;
        if (!r12.A00) {
            r12.A00 = true;
            r12.A00 = (C27941Ql) C36391kE.A0W(r12.generatedComponent()).A00.A0N.get();
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

    public C93244gE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0K();
    }

    public C93244gE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
    }

    public C93244gE(Context context) {
        super(context, (AttributeSet) null);
        A0K();
    }
}
