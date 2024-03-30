package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.voipcalling.VoipCallAnswerCallView;

/* renamed from: X.4fV  reason: invalid class name and case insensitive filesystem */
public abstract class C93054fV extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C93054fV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        VoipCallAnswerCallView voipCallAnswerCallView = (VoipCallAnswerCallView) this;
        if (!voipCallAnswerCallView.A09) {
            voipCallAnswerCallView.A09 = true;
            voipCallAnswerCallView.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) voipCallAnswerCallView.generatedComponent())).A0M);
        }
    }
}
