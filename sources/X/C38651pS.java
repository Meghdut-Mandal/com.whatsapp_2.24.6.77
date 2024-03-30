package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.1pS  reason: invalid class name and case insensitive filesystem */
public final class C38651pS extends LinearLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final AnonymousClass1RJ A03;
    public final AnonymousClass1RJ A04;

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public C38651pS(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setId(R.id.community_pending_groups_and_events_container);
        C36321k7.A0N(this);
        setOrientation(0);
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
        this.A04 = C36341k9.A0X(this, R.id.upcoming_events_container);
        this.A03 = C36341k9.A0X(this, R.id.member_suggested_groups_container);
    }
}
