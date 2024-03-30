package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.1qw  reason: invalid class name and case insensitive filesystem */
public abstract class C39031qw extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public C39031qw(Context context) {
        super(context, (AttributeSet) null);
        A02();
    }

    public void A02() {
        if (this instanceof C45962Tx) {
            C45962Tx r1 = (C45962Tx) this;
            if (!r1.A00) {
                r1.A00 = true;
                r1.generatedComponent();
            }
        } else if (this instanceof C45952Tw) {
            C45952Tw r2 = (C45952Tw) this;
            if (r2 instanceof C45932Tg) {
                C45932Tg r22 = (C45932Tg) r2;
                if (!r22.A00) {
                    r22.A00 = true;
                    C18800tq A0W = C36391kE.A0W(r22.generatedComponent());
                    r22.A06 = A0W.A00.A4o();
                    r22.A05 = C36341k9.A0T(A0W);
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                C45942Ti r23 = (C45942Ti) r2;
                C18800tq r12 = ((C27861Qc) ((C27851Qb) r2.generatedComponent())).A0M;
                r23.A06 = r12.A00.A4o();
                r23.A05 = C36341k9.A0T(r12);
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
}
