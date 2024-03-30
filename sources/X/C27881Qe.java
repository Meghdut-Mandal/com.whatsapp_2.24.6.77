package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.MaterialToolbar;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.1Qe  reason: invalid class name and case insensitive filesystem */
public abstract class C27881Qe extends MaterialToolbar implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C27881Qe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            WDSToolbar wDSToolbar = (WDSToolbar) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            wDSToolbar.A02 = (C27941Ql) r1.A00.A0N.get();
            wDSToolbar.A03 = (C20810yC) r1.A02.get();
            wDSToolbar.A04 = (AnonymousClass13J) r1.A6z.get();
        }
    }
}
