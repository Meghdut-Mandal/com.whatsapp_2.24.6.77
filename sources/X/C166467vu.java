package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7vu  reason: invalid class name and case insensitive filesystem */
public final class C166467vu extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;

    public C166467vu(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = C36431kI.A1I(new C22167Ahq(this));
        this.A04 = C36431kI.A1I(new C22171Ahu(this));
        this.A05 = C36431kI.A1I(new C22172Ahv(this));
        this.A02 = C36431kI.A1I(new C22165Aho(this));
        this.A09 = C36431kI.A1I(new C22170Aht(this));
        this.A07 = C36431kI.A1I(new C22168Ahr(this));
        this.A06 = C36431kI.A1I(new C22166Ahp(this));
        this.A08 = C36431kI.A1I(new C22169Ahs(this));
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass3J9 r8) {
        /*
            r7 = this;
            r5 = 0
            X.00T r0 = r7.A04
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            X.AUj r4 = r8.A02
            java.lang.String r0 = r4.A08
            r1.setText(r0)
            X.00T r0 = r7.A03
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            X.00T r0 = r7.A02
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            int r1 = r4.A01
            r3 = 1
            if (r1 == r3) goto L_0x00b7
            r0 = 2
            if (r1 == r0) goto L_0x008b
            r0 = 3
            if (r1 != r0) goto L_0x005d
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131232134(0x7f080586, float:1.8080369E38)
            X.C36391kE.A18(r1, r2, r0)
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099706(0x7f06003a, float:1.7811773E38)
            android.content.res.ColorStateList r0 = X.C36431kI.A0G(r1, r0)
            X.AnonymousClass06T.A00(r0, r2)
            android.widget.LinearLayout r2 = r7.getAlertBannerComponent()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
        L_0x005a:
            X.C36341k9.A0q(r1, r2, r0)
        L_0x005d:
            android.widget.ImageView r0 = r7.getAlertCloseIcon()
            r6 = 8
            r0.setVisibility(r6)
            int r2 = r8.A00
            android.widget.LinearLayout r0 = r7.getAlertCountLayout()
            if (r2 <= r3) goto L_0x00e4
            r0.setVisibility(r5)
            X.00T r0 = r7.A05
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.setText(r0)
            android.view.View r1 = r7.getRootView()
            X.3Y2 r0 = new X.3Y2
            r0.<init>(r7, r6)
            r1.setOnClickListener(r0)
            return
        L_0x008b:
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131231895(0x7f080497, float:1.8079884E38)
            X.C36391kE.A18(r1, r2, r0)
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099705(0x7f060039, float:1.781177E38)
            android.content.res.ColorStateList r0 = X.C36431kI.A0G(r1, r0)
            X.AnonymousClass06T.A00(r0, r2)
            android.widget.LinearLayout r2 = r7.getAlertBannerComponent()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            goto L_0x005a
        L_0x00b7:
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            X.C36391kE.A18(r1, r2, r0)
            android.widget.ImageView r2 = r7.getAlertIcon()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            android.content.res.ColorStateList r0 = X.C36431kI.A0G(r1, r0)
            X.AnonymousClass06T.A00(r0, r2)
            android.widget.LinearLayout r2 = r7.getAlertBannerComponent()
            android.content.Context r1 = r7.getContext()
            r0 = 2131099700(0x7f060034, float:1.781176E38)
            goto L_0x005a
        L_0x00e4:
            r0.setVisibility(r6)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0100
            android.widget.ImageView r0 = r7.getAlertCloseIcon()
            r0.setVisibility(r5)
            android.widget.ImageView r2 = r7.getAlertCloseIcon()
            r1 = 44
            X.3Yo r0 = new X.3Yo
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r8, (int) r1)
            r2.setOnClickListener(r0)
        L_0x0100:
            android.view.View r2 = r7.getRootView()
            r1 = 22
            X.3YG r0 = new X.3YG
            r0.<init>(r8, r8, r1)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166467vu.A00(X.3J9):void");
    }

    private final TextView getAlertActionText() {
        return C36351kA.A0G(this.A02);
    }

    private final LinearLayout getAlertBannerComponent() {
        return (LinearLayout) C36381kD.A0p(this.A06);
    }

    private final TextView getAlertBody() {
        return C36351kA.A0G(this.A03);
    }

    private final ImageView getAlertCloseIcon() {
        return (ImageView) C36381kD.A0p(this.A07);
    }

    private final LinearLayout getAlertCountLayout() {
        return (LinearLayout) C36381kD.A0p(this.A08);
    }

    private final ImageView getAlertIcon() {
        return (ImageView) C36381kD.A0p(this.A09);
    }

    private final TextView getAlertTitle() {
        return C36351kA.A0G(this.A04);
    }

    private final TextView getAlertsCount() {
        return C36351kA.A0G(this.A05);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
