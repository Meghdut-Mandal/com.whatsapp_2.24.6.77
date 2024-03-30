package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1oO  reason: invalid class name and case insensitive filesystem */
public final class C38341oO extends FrameLayout implements C18700tb {
    public C24801Dv A00;
    public C20810yC A01;
    public C20380xT A02;
    public C32681e1 A03;
    public AnonymousClass1QZ A04;
    public boolean A05;

    public C38341oO(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36341k9.A0V(A0W);
            this.A03 = C36351kA.A0p(A0W.A00);
            this.A00 = C36351kA.A0J(A0W);
            this.A02 = C36331k8.A0I(A0W);
        }
        TextView A0F = C36351kA.A0F(View.inflate(context, R.layout.f9nameremoved, this), R.id.cag_info_tab_footer_text_view);
        A0F.setText(getLinkifier$app_product_community_community_non_modified().A02(A0F.getContext(), new C81093wS((Object) this, 25), C36391kE.A0v(context, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more"));
        C36331k8.A10(A0F, getAbProps$app_product_community_community_non_modified());
    }

    public final void setAbProps$app_product_community_community_non_modified(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setActivityUtils$app_product_community_community_non_modified(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory$app_product_community_community_non_modified(C20380xT r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier$app_product_community_community_non_modified(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
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

    public final C20380xT getFaqLinkFactory$app_product_community_community_non_modified() {
        C20380xT r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("faqLinkFactory");
    }

    public final C32681e1 getLinkifier$app_product_community_community_non_modified() {
        C32681e1 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }
}
