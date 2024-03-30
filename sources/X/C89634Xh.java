package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Xh  reason: invalid class name and case insensitive filesystem */
public class C89634Xh implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public C89634Xh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnScrollChangedListener(new C89634Xh(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollChanged() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00dd;
                case 2: goto L_0x0114;
                case 3: goto L_0x010c;
                case 4: goto L_0x00ae;
                case 5: goto L_0x0104;
                case 6: goto L_0x004d;
                case 7: goto L_0x003c;
                case 8: goto L_0x002b;
                case 9: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            android.widget.ScrollView r0 = r1.A05
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A03
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
        L_0x0015:
            float r0 = (float) r0
        L_0x0016:
            r2.setElevation(r0)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r1 = r6.A00
            X.3GU r1 = (X.AnonymousClass3GU) r1
            android.view.View r0 = r1.A02
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A01
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
            goto L_0x0015
        L_0x002b:
            java.lang.Object r1 = r6.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r1
            android.widget.ScrollView r0 = r1.A05
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
            goto L_0x0015
        L_0x003c:
            java.lang.Object r1 = r6.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumber r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r1
            android.widget.ScrollView r0 = r1.A07
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A06
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
            goto L_0x0015
        L_0x004d:
            java.lang.Object r5 = r6.A00
            com.whatsapp.registration.RegistrationScrollView r5 = (com.whatsapp.registration.RegistrationScrollView) r5
            r2 = 1
            boolean r1 = r5.canScrollVertically(r2)
            r0 = -1
            boolean r0 = r5.canScrollVertically(r0)
            if (r0 != 0) goto L_0x005f
            if (r1 == 0) goto L_0x0019
        L_0x005f:
            int r0 = r5.getChildCount()
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            int r3 = r0.getBottom()
            int r2 = r5.getHeight()
            int r1 = r5.getScrollY()
            int r0 = r2 + r1
            int r3 = r3 - r0
            android.view.View r0 = X.C36411kG.A0L(r5)
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            float r4 = (float) r1
            float r0 = (float) r0
            float r4 = r4 / r0
            float r3 = (float) r3
            float r3 = r3 / r0
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00aa
            r0 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r0
            float r2 = r5.A06
            float r4 = r4 * r2
        L_0x0094:
            X.C011004s.A05(r1, r4)
            android.widget.LinearLayout r1 = r5.A01
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            r0 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r0
            float r3 = r3 * r2
        L_0x00a4:
            X.C011004s.A05(r1, r3)
            return
        L_0x00a8:
            r3 = r2
            goto L_0x00a4
        L_0x00aa:
            float r4 = r5.A06
            r2 = r4
            goto L_0x0094
        L_0x00ae:
            java.lang.Object r2 = r6.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r2 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r2
            androidx.core.widget.NestedScrollView r0 = r2.A02
            r1 = 1
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != r1) goto L_0x00d0
            android.content.Context r1 = r2.A0a()
            r0 = 2131100314(0x7f06029a, float:1.7813006E38)
        L_0x00c4:
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            android.widget.LinearLayout r0 = r2.A01
            if (r0 == 0) goto L_0x0019
            r0.setBackgroundColor(r1)
            return
        L_0x00d0:
            android.content.Context r1 = r2.A0a()
            android.content.Context r0 = r2.A0a()
            int r0 = X.C36411kG.A01(r0)
            goto L_0x00c4
        L_0x00dd:
            java.lang.Object r1 = r6.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r1 = (com.whatsapp.account.delete.DeleteAccountFeedback) r1
            android.widget.ScrollView r0 = r1.A04
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
            goto L_0x0015
        L_0x00ef:
            java.lang.Object r1 = r6.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r1 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r1
            android.widget.ScrollView r0 = r1.A03
            boolean r0 = X.C36421kH.A1U(r0)
            android.view.View r2 = r1.A02
            if (r0 == 0) goto L_0x0101
            int r0 = r1.A00
            goto L_0x0015
        L_0x0101:
            r0 = 0
            goto L_0x0016
        L_0x0104:
            java.lang.Object r0 = r6.A00
            com.whatsapp.registration.ChangeNumberOverview r0 = (com.whatsapp.registration.ChangeNumberOverview) r0
            com.whatsapp.registration.ChangeNumberOverview.A01(r0)
            return
        L_0x010c:
            java.lang.Object r0 = r6.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A07(r0)
            return
        L_0x0114:
            java.lang.Object r1 = r6.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r1 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r1
            android.widget.ScrollView r0 = r1.A02
            boolean r0 = X.C36421kH.A1U(r0)
            r0 = r0 ^ 1
            r2 = r0 ^ 1
            android.view.View r1 = r1.A01
            r0 = 4
            if (r2 == 0) goto L_0x0128
            r0 = 0
        L_0x0128:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89634Xh.onScrollChanged():void");
    }
}
