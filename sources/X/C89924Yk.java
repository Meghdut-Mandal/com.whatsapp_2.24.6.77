package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Yk  reason: invalid class name and case insensitive filesystem */
public class C89924Yk implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public C89924Yk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnPreDrawListener(new C89924Yk(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r2.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00bb;
                case 2: goto L_0x0129;
                case 3: goto L_0x011a;
                case 4: goto L_0x0110;
                case 5: goto L_0x008e;
                case 6: goto L_0x00ec;
                case 7: goto L_0x0078;
                case 8: goto L_0x0062;
                case 9: goto L_0x004c;
                case 10: goto L_0x0034;
                case 11: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            android.widget.ScrollView r0 = r1.A05
            X.C36351kA.A1D(r0, r5)
            android.widget.ScrollView r0 = r1.A05
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A03
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
        L_0x001a:
            float r0 = (float) r0
        L_0x001b:
            r2.setElevation(r0)
        L_0x001e:
            r0 = 0
            return r0
        L_0x0020:
            java.lang.Object r1 = r5.A00
            X.3GU r1 = (X.AnonymousClass3GU) r1
            android.view.View r0 = r1.A02
            X.C36351kA.A1D(r0, r5)
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A01
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
            goto L_0x001a
        L_0x0034:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            androidx.fragment.app.ListFragment.A00(r2)
            android.widget.ListView r0 = r2.A05
            X.C36351kA.A1D(r0, r5)
            r0 = 22
            X.4VL r1 = new X.4VL
            r1.<init>(r5, r0)
            r0 = 1
            com.whatsapp.status.StatusesFragment.A07(r1, r2, r0)
            goto L_0x001e
        L_0x004c:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r1
            android.widget.ScrollView r0 = r1.A05
            X.C36351kA.A1D(r0, r5)
            android.widget.ScrollView r0 = r1.A05
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
            goto L_0x001a
        L_0x0062:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumber r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r1
            android.widget.ScrollView r0 = r1.A07
            X.C36351kA.A1D(r0, r5)
            android.widget.ScrollView r0 = r1.A07
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A06
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
            goto L_0x001a
        L_0x0078:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.ChangeNumberOverview r1 = (com.whatsapp.registration.ChangeNumberOverview) r1
            android.widget.ScrollView r0 = r1.A00
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0087:
            X.C36351kA.A1D(r0, r5)
            com.whatsapp.registration.ChangeNumberOverview.A01(r1)
            goto L_0x001e
        L_0x008e:
            java.lang.Object r4 = r5.A00
            X.80Q r4 = (X.AnonymousClass80Q) r4
            X.C36351kA.A1D(r4, r5)
            r0 = 1
            r4.A0E = r0
            int r3 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r0 = 0
            r1.height = r0
            r4.requestLayout()
            r0 = 2
            X.4VX r2 = new X.4VX
            r2.<init>(r5, r3, r0)
            r0 = 11
            X.C89234Vt.A00(r2, r5, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r4.startAnimation(r2)
            goto L_0x001e
        L_0x00bb:
            java.lang.Object r1 = r5.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r1 = (com.whatsapp.account.delete.DeleteAccountFeedback) r1
            android.widget.ScrollView r0 = r1.A04
            X.C36351kA.A1D(r0, r5)
            android.widget.ScrollView r0 = r1.A04
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
            goto L_0x001a
        L_0x00d2:
            java.lang.Object r1 = r5.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r1 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r1
            android.widget.ScrollView r0 = r1.A03
            X.C36351kA.A1D(r0, r5)
            android.widget.ScrollView r0 = r1.A03
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x00e9
            int r0 = r1.A00
            goto L_0x001a
        L_0x00e9:
            r0 = 0
            goto L_0x001b
        L_0x00ec:
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            X.C36351kA.A1D(r2, r5)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x0101
            java.lang.String r0 = "statusBar"
            X.C011004s.A08(r1, r0)
        L_0x0101:
            r0 = 16908336(0x1020030, float:2.3877364E-38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = "navigationBar"
            X.C011004s.A08(r1, r0)
            goto L_0x014b
        L_0x0110:
            java.lang.Object r0 = r5.A00
            X.3fk r0 = (X.C70803fk) r0
            X.1SV r0 = r0.A5G
            r0.A0B()
            goto L_0x014b
        L_0x011a:
            java.lang.Object r1 = r5.A00
            X.22g r1 = (X.AnonymousClass22g) r1
            android.widget.ListView r0 = r1.getListView()
            X.C36351kA.A1D(r0, r5)
            r1.A1q()
            goto L_0x014b
        L_0x0129:
            java.lang.Object r4 = r5.A00
            X.2IE r4 = (X.AnonymousClass2IE) r4
            X.1JE r0 = r4.A04
            java.util.HashSet r0 = r0.A00
            X.3Qa r3 = r4.A06
            boolean r0 = r0.contains(r3)
            r2 = 1
            if (r0 != 0) goto L_0x0148
            X.3GO r1 = r4.A05
            java.lang.String r0 = "carousel_message_render_tag"
            r1.A01(r3, r0, r2)
            X.1JE r0 = r4.A04
            java.util.HashSet r0 = r0.A00
            r0.add(r3)
        L_0x0148:
            X.C36351kA.A1D(r4, r5)
        L_0x014b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89924Yk.onPreDraw():boolean");
    }
}
