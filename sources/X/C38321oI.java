package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.1oI  reason: invalid class name and case insensitive filesystem */
public final class C38321oI extends FrameLayout implements C18700tb {
    public C33751fs A00;
    public C26801Lo A01;
    public AnonymousClass1LY A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public final WDSBanner A05;

    public final void setContextualHelpHandler(C33751fs r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setNuxManager(AnonymousClass1LY r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setParentGroupObservers(C26801Lo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C33751fs getContextualHelpHandler() {
        C33751fs r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contextualHelpHandler");
    }

    public final AnonymousClass1LY getNuxManager() {
        AnonymousClass1LY r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("nuxManager");
    }

    public final C26801Lo getParentGroupObservers() {
        C26801Lo r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("parentGroupObservers");
    }

    public C38321oI(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = (AnonymousClass1LY) A0W.A5r.get();
            this.A01 = C36431kI.A0f(A0W);
            this.A00 = C36361kB.A0X(A0W.A00);
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setId(R.id.community_events_banner_view);
        C36371kC.A1D(this);
        setPadding(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, C36371kC.A03(this, R.dimen.f7nameremoved), 0);
        WDSBanner wDSBanner = (WDSBanner) C36361kB.A0G(this, R.id.community_events_banner);
        this.A05 = wDSBanner;
        C62053Eo r1 = new C62053Eo();
        r1.A02 = C50712lP.A00;
        C62053Eo.A00(wDSBanner, r1, C63953Mb.A00(context, R.string.f12nameremoved));
        AnonymousClass3YE.A00(wDSBanner, context, this, 29);
        wDSBanner.setOnDismissListener((AnonymousClass00S) new C834849o(this));
    }
}
