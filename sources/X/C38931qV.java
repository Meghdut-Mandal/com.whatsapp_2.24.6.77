package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.community.CommunityMembersViewModel;

/* renamed from: X.1qV  reason: invalid class name and case insensitive filesystem */
public final class C38931qV extends RelativeLayout implements C18700tb {
    public C87114Nn A00;
    public CommunityMembersViewModel A01;
    public AnonymousClass147 A02;
    public AnonymousClass147 A03;
    public C19770wU A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public final View A07;
    public final AnonymousClass00T A08;

    public final void setCommunityMembersViewModelFactory$app_product_community_community_non_modified(C87114Nn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaWorkers$app_product_community_community_non_modified(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C225314u getActivity() {
        return (C225314u) this.A08.getValue();
    }

    public final C87114Nn getCommunityMembersViewModelFactory$app_product_community_community_non_modified() {
        C87114Nn r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityMembersViewModelFactory");
    }

    public final C19770wU getWaWorkers$app_product_community_community_non_modified() {
        C19770wU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public C38931qV(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A04 = C36341k9.A0Z(r1.A0M);
            this.A00 = (C87114Nn) r1.A0L.A2j.get();
        }
        this.A08 = C36431kI.A1I(new AnonymousClass49G(context));
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A07 = inflate;
    }
}
