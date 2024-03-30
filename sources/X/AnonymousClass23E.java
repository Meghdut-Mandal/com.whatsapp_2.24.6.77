package X;

import android.content.Context;
import com.whatsapp.RollingCounterView;

/* renamed from: X.23E  reason: invalid class name */
public class AnonymousClass23E extends RollingCounterView implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass23E(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
    }
}
