package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.1oC  reason: invalid class name and case insensitive filesystem */
public final class C38301oC extends FrameLayout implements C18700tb {
    public C236419g A00;
    public C20810yC A01;
    public C45632Sc A02;
    public AnonymousClass147 A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final ListItemWithLeftIcon A06;
    public final View A07;
    public final AnonymousClass00T A08;

    public C38301oC(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36341k9.A0V(A0W);
            this.A00 = C36381kD.A0a(A0W);
        }
        this.A08 = C36431kI.A1I(new C833449a(context));
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A07 = inflate;
        this.A06 = (ListItemWithLeftIcon) C36361kB.A0F(inflate, R.id.report_cag_button);
    }

    public final void setAbProps$app_product_community_community_non_modified(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCompanionDeviceManager$app_product_community_community_non_modified(C236419g r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
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

    public final C225314u getActivity() {
        return (C225314u) this.A08.getValue();
    }

    public final C236419g getCompanionDeviceManager$app_product_community_community_non_modified() {
        C236419g r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("companionDeviceManager");
    }
}
