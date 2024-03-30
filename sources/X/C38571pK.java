package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.1pK  reason: invalid class name and case insensitive filesystem */
public abstract class C38571pK extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A02() {
        C43472Ht r4 = (C43472Ht) this;
        if (!r4.A08) {
            r4.A08 = true;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) r4.generatedComponent());
            r4.A01 = new C62503Gk();
            C27111My r2 = r3.A0L;
            r4.A00 = r2.ADd();
            C18800tq r1 = r3.A0M;
            r4.A06 = C36341k9.A0V(r1);
            r4.A04 = r2.ADe();
            r4.A07 = (AnonymousClass1JL) r1.A00.A3t.get();
            r4.A03 = (AnonymousClass3C1) r2.A2B.get();
            r4.A02 = C27861Qc.A02(r3);
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

    public C38571pK(Context context) {
        super(context);
        A02();
    }
}
