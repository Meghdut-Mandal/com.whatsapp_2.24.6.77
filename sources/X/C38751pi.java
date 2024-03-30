package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.1pi  reason: invalid class name and case insensitive filesystem */
public final class C38751pi extends LinearLayout implements C18700tb {
    public C24801Dv A00;
    public C20810yC A01;
    public AnonymousClass147 A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public final AnonymousClass1RJ A05;
    public final View A06;
    public final View A07;
    public final View A08;

    public final void setAbProps$app_product_community_community_non_modified(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setActivityUtils$app_product_community_community_non_modified(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    private final void setUpClickListeners(C33541fX r2, C33541fX r3) {
        this.A06.setOnClickListener(r2);
        this.A07.setOnClickListener(r3);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps$app_product_community_community_non_modified() {
        C20810yC r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C24801Dv getActivityUtils$app_product_community_community_non_modified() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public C38751pi(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36351kA.A0J(A0W);
            this.A01 = C36341k9.A0V(A0W);
        }
        Activity A012 = C24801Dv.A01(context, AnonymousClass01L.class);
        View inflate = View.inflate(getContext(), R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A08 = inflate;
        this.A06 = C36361kB.A0G(inflate, R.id.edit_community_info_btn);
        this.A07 = C36361kB.A0G(inflate, R.id.manage_groups_btn);
        this.A05 = C36341k9.A0Y(this, R.id.community_settings_button);
        setUpClickListeners(new C48812i6(this, A012, 33), new C48812i6(this, context, 34));
    }
}
