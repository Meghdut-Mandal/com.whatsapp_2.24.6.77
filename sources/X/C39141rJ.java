package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.settings.SettingsRowBanner;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
public abstract class C39141rJ extends ConstraintLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C39141rJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((SettingsRowBanner) this).A00 = C36341k9.A0T(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }
}
