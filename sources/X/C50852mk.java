package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2mk  reason: invalid class name and case insensitive filesystem */
public final class C50852mk extends WDSButton implements C22928Aye {
    public C28391Sm A00;
    public C20230xE A01;
    public AnonymousClass1Sk A02;
    public C19770wU A03;
    public boolean A04;

    public C50852mk(Context context) {
        super(context, (AttributeSet) null);
        A04();
        setVariant(C27981Qp.OUTLINE);
        setText(R.string.f12nameremoved);
    }

    public final void setCommunityMembersManager(C28391Sm r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator(C20230xE r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCommunityWamEventHelper(AnonymousClass1Sk r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public void A04() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            C36321k7.A0k(A0W, this);
            this.A02 = C36431kI.A0Z(A0W);
            this.A00 = C18800tq.A4s(A0W);
            this.A01 = C18800tq.A4u(A0W);
            this.A03 = C36341k9.A0Z(A0W);
        }
    }

    public final C28391Sm getCommunityMembersManager() {
        C28391Sm r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityMembersManager");
    }

    public final C20230xE getCommunityNavigator() {
        C20230xE r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityNavigator");
    }

    public final AnonymousClass1Sk getCommunityWamEventHelper() {
        AnonymousClass1Sk r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityWamEventHelper");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public List getCTAViews() {
        return C36371kC.A11(this);
    }
}
