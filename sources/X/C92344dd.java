package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.components.RoundCornerProgressBarV2;

/* renamed from: X.4dd  reason: invalid class name and case insensitive filesystem */
public abstract class C92344dd extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A00() {
        C18820ts A0T;
        RoundCornerProgressBarV2 roundCornerProgressBarV2;
        if (this instanceof RoundCornerProgressBarV2) {
            RoundCornerProgressBarV2 roundCornerProgressBarV22 = (RoundCornerProgressBarV2) this;
            if (!roundCornerProgressBarV22.A01) {
                roundCornerProgressBarV22.A01 = true;
                A0T = C36341k9.A0U(roundCornerProgressBarV22.generatedComponent());
                roundCornerProgressBarV2 = roundCornerProgressBarV22;
            } else {
                return;
            }
        } else if (!this.A01) {
            this.A01 = true;
            A0T = C36341k9.A0T(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
            roundCornerProgressBarV2 = (RoundCornerProgressBar) this;
        } else {
            return;
        }
        roundCornerProgressBarV2.A05 = A0T;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92344dd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
