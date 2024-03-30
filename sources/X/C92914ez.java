package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4ez  reason: invalid class name and case insensitive filesystem */
public class C92914ez extends FrameLayout implements C18700tb {
    public TextView A00;
    public TextView A01;
    public C19970wo A02;
    public C18820ts A03;
    public AnonymousClass1FR A04;
    public AnonymousClass1QZ A05;
    public boolean A06;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public C92914ez(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36351kA.A0V(A0W);
            this.A04 = (AnonymousClass1FR) A0W.A6O.get();
            this.A03 = C36341k9.A0T(A0W);
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A01 = C36391kE.A0O(this, R.id.date);
        this.A00 = C36391kE.A0O(this, R.id.amount);
    }
}
