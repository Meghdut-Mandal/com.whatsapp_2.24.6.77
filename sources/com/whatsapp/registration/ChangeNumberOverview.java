package com.whatsapp.registration;

import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C20380xT;
import X.C32681e1;
import X.C32931eR;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import X.C89354Wf;
import X.C89924Yk;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ScrollView;

public final class ChangeNumberOverview extends AnonymousClass155 {
    public ScrollView A00;
    public C19460v5 A01;
    public C32931eR A02;
    public AnonymousClass1EV A03;
    public AnonymousClass1EU A04;
    public C20380xT A05;
    public C32681e1 A06;
    public int A07;
    public View A08;
    public boolean A09;

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A00;
        if (scrollView == null) {
            throw C36331k8.A0d("scrollView");
        }
        C89924Yk.A00(scrollView.getViewTreeObserver(), this, 7);
    }

    public static final void A01(ChangeNumberOverview changeNumberOverview) {
        float f;
        ScrollView scrollView = changeNumberOverview.A00;
        if (scrollView == null) {
            throw C36331k8.A0d("scrollView");
        }
        boolean A1U = C36421kH.A1U(scrollView);
        View view = changeNumberOverview.A08;
        if (A1U) {
            if (view == null) {
                throw C36331k8.A0d("bottomButtonContainer");
            }
            f = (float) changeNumberOverview.A07;
        } else if (view == null) {
            throw C36331k8.A0d("bottomButtonContainer");
        } else {
            f = 0.0f;
        }
        view.setElevation(f);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36381kD.A0f(A0B);
            this.A03 = C36371kC.A0h(A0B);
            this.A02 = C36431kI.A0g(A0B);
            this.A06 = C36351kA.A0p(r1);
            this.A05 = C36331k8.A0I(A0B);
            this.A01 = C19470v6.A00;
        }
    }

    public ChangeNumberOverview(int i) {
        this.A09 = false;
        C89354Wf.A00(this, 41);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131887691(0x7f12064b, float:1.9409996E38)
            r4.setTitle(r0)
            X.07B r1 = X.C36381kD.A0O(r4)
            r0 = 1
            r1.A0U(r0)
            r1.A0V(r0)
            r0 = 2131624369(0x7f0e01b1, float:1.8875916E38)
            r4.setContentView((int) r0)
            android.view.View r1 = r4.A00
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r4.A00 = r0
            android.view.View r1 = r4.A00
            r0 = 2131428151(0x7f0b0337, float:1.8477938E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            r4.A08 = r0
            X.1EV r0 = r4.A03
            if (r0 == 0) goto L_0x00f7
            boolean r3 = r0.A03()
            if (r3 == 0) goto L_0x00c8
            X.1EV r0 = r4.A03
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x00c8
            r0 = 2131428721(0x7f0b0571, float:1.8479094E38)
            android.view.View r0 = r4.findViewById(r0)
            r2 = 0
            r0.setVisibility(r2)
            r0 = 2131428720(0x7f0b0570, float:1.8479092E38)
            X.C36331k8.A11(r4, r0)
            r0 = 2131428718(0x7f0b056e, float:1.8479088E38)
            android.view.View r1 = X.C36361kB.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887676(0x7f12063c, float:1.9409966E38)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)
            X.C36431kI.A1K(r4, r1, r0)
            r0 = 2131428719(0x7f0b056f, float:1.847909E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r4, r0)
            r1.setVisibility(r2)
            r0 = 2131887677(0x7f12063d, float:1.9409968E38)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)
            X.C36431kI.A1K(r4, r1, r0)
            r0 = 2131428722(0x7f0b0572, float:1.8479097E38)
            android.view.View r1 = X.C36361kB.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887650(0x7f120622, float:1.9409913E38)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)
            X.C36431kI.A1K(r4, r1, r0)
            r0 = 2131428723(0x7f0b0573, float:1.8479099E38)
            android.view.View r1 = X.C36361kB.A0H(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887651(0x7f120623, float:1.9409915E38)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)
            X.C36431kI.A1K(r4, r1, r0)
        L_0x00a4:
            r0 = 2131432071(0x7f0b1287, float:1.848589E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 18
            X.AnonymousClass3Y6.A00(r1, r4, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168241(0x7f070bf1, float:1.7950778E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A07 = r0
            android.widget.ScrollView r0 = r4.A00
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c8:
            X.0wU r2 = r4.A04
            r1 = 0
            X.3vD r0 = new X.3vD
            r0.<init>(r1, r4, r3)
            r2.Boy(r0)
            goto L_0x00a4
        L_0x00d4:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 5
            X.C89634Xh.A00(r1, r4, r0)
            android.widget.ScrollView r0 = r4.A00
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e7:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 7
            X.C89924Yk.A00(r1, r4, r0)
            return
        L_0x00f0:
            java.lang.String r0 = "paymentsGatingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f7:
            java.lang.String r0 = "paymentsGatingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumberOverview.onCreate(android.os.Bundle):void");
    }

    public ChangeNumberOverview() {
        this(0);
    }
}
