package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.1o4  reason: invalid class name and case insensitive filesystem */
public abstract class C38221o4 extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A00() {
        if (this instanceof C43552Iq) {
            C43552Iq r2 = (C43552Iq) this;
            if (!r2.A00) {
                r2.A00 = true;
                C43532Ij r22 = (C43532Ij) r2;
                C18800tq r1 = ((C27861Qc) ((C27851Qb) r2.generatedComponent())).A0M;
                r22.A00 = C36371kC.A0R(r1);
                r22.A00 = (C20690y0) r1.A6r.get();
                r22.A01 = C36401kF.A0g(r1);
                r22.A02 = C24291Bw.A00();
                return;
            }
            return;
        }
        C43542Ip r23 = (C43542Ip) this;
        if (!r23.A00) {
            r23.A00 = true;
            C43522Ii r24 = (C43522Ii) r23;
            C18800tq r12 = ((C27861Qc) ((C27851Qb) r23.generatedComponent())).A0M;
            r24.A00 = C36371kC.A0R(r12);
            r24.A00 = C36341k9.A0V(r12);
            r24.A01 = C36391kE.A0j(r12);
            r24.A02 = C36401kF.A0g(r12);
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

    public C38221o4(Context context) {
        super(context);
        A00();
    }
}
