package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;

/* renamed from: X.3nW  reason: invalid class name and case insensitive filesystem */
public final class C75613nW implements C160657lN {
    public Context A00;
    public boolean A01 = true;
    public final WfalManager A02;
    public final C28781Ua A03;
    public final AnonymousClass171 A04;
    public final DefaultRecipientsView A05;

    public C75613nW(WfalManager wfalManager, AnonymousClass171 r4, DefaultRecipientsView defaultRecipientsView, C28781Ua r6) {
        C36321k7.A16(r6, wfalManager, r4, 1);
        this.A03 = r6;
        this.A02 = wfalManager;
        this.A04 = r4;
        this.A05 = defaultRecipientsView;
        this.A00 = C36371kC.A0B(defaultRecipientsView);
    }

    public void B5T() {
        DefaultRecipientsView defaultRecipientsView = this.A05;
        defaultRecipientsView.A05 = false;
        defaultRecipientsView.A00 = R.color.f6nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013e, code lost:
        if (r10 < r0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brt(X.AnonymousClass3XT r17, java.util.List r18, boolean r19) {
        /*
            r16 = this;
            r2 = r17
            r5 = r18
            X.C36321k7.A0w(r5, r2)
            boolean r1 = X.AnonymousClass143.A0N(r5)
            r7 = r16
            X.171 r0 = r7.A04
            android.content.Context r3 = r7.A00
            java.util.ArrayList r6 = r0.A0a(r3, r5)
            if (r1 == 0) goto L_0x0148
            java.lang.String r4 = X.AnonymousClass3TM.A00(r3, r2)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0038
            X.1Ua r0 = r7.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0038
            r2 = 2131167384(0x7f070898, float:1.794904E38)
            r1 = 2130968682(0x7f04006a, float:1.7546025E38)
            r0 = 2131099762(0x7f060072, float:1.7811886E38)
            int r0 = X.C224514j.A00(r3, r1, r0)
            android.text.SpannableStringBuilder r4 = X.AnonymousClass6Y4.A00(r3, r4, r2, r0)
        L_0x0038:
            com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView r3 = r7.A05
            r3.setRecipientsChips(r6, r4)
            int r0 = r5.size()
            r3.setRecipientsContentDescription(r0)
            if (r4 == 0) goto L_0x0145
            X.38Y r9 = r3.A08
            X.005 r8 = r9.A02
            r8.get()
            r7 = 1
            r6 = 0
            X.005 r2 = r9.A03
            java.lang.Object r1 = r2.get()
            X.2nB r1 = (X.C51072nB) r1
            X.005 r0 = r1.A01
            X.1UM r0 = X.C36431kI.A10(r0)
            X.1US r11 = X.C51072nB.A03
            boolean r0 = r0.A06(r11)
            r15 = 1
            if (r0 == 0) goto L_0x0142
            X.005 r0 = r1.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NV.A01(r0)
            java.lang.String r0 = "pref_xfamily_audience_tooltip"
            int r0 = X.C36371kC.A01(r1, r0)
            if (r0 >= r7) goto L_0x0142
        L_0x0074:
            java.lang.Object r14 = r2.get()
            X.2nB r14 = (X.C51072nB) r14
            X.005 r0 = r14.A01
            X.1UM r0 = X.C36431kI.A10(r0)
            java.lang.Boolean r0 = r0.A01(r11)
            r13 = 1
            boolean r1 = X.C36371kC.A1X(r0, r7)
            X.005 r12 = r14.A02
            android.content.SharedPreferences r0 = X.AnonymousClass3NV.A01(r12)
            java.lang.String r4 = "pref_xfamily_sharing_to_fb_tooltip"
            int r10 = r0.getInt(r4, r6)
            if (r1 != 0) goto L_0x0133
            if (r10 <= 0) goto L_0x00ae
            X.0yC r1 = r14.A00
            r0 = 6490(0x195a, float:9.094E-42)
            int r0 = r1.A07(r0)
            if (r0 <= 0) goto L_0x00ae
            android.content.SharedPreferences r0 = X.AnonymousClass3NV.A01(r12)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36341k9.A0v(r0, r4, r6)
        L_0x00ae:
            r13 = 0
        L_0x00af:
            X.3AZ r10 = r9.A00
            boolean r0 = r10.A00
            if (r0 != 0) goto L_0x0145
            if (r15 != 0) goto L_0x00b9
            if (r13 == 0) goto L_0x0145
        L_0x00b9:
            if (r19 == 0) goto L_0x0132
            r8.get()
            r9 = 2
            java.lang.Object r1 = r2.get()
            X.2nB r1 = (X.C51072nB) r1
            X.005 r0 = r1.A01
            X.1UM r0 = X.C36431kI.A10(r0)
            boolean r0 = r0.A06(r11)
            if (r0 == 0) goto L_0x00e0
            X.005 r0 = r1.A02
            android.content.SharedPreferences r1 = X.AnonymousClass3NV.A01(r0)
            java.lang.String r0 = "pref_xfamily_audience_tooltip"
            int r0 = X.C36371kC.A01(r1, r0)
            if (r0 >= r7) goto L_0x00e0
            r9 = 1
        L_0x00e0:
            r10.A00 = r6
            android.widget.PopupWindow r1 = r10.A03
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x00ed
            r1.dismiss()
        L_0x00ed:
            com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView r0 = r10.A06
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.4Zd r0 = new X.4Zd
            r0.<init>(r10, r9)
            r1.addOnGlobalLayoutListener(r0)
            r10.A00 = r7
            r8.get()
            java.lang.Object r0 = r2.get()
            X.2nB r0 = (X.C51072nB) r0
            X.005 r2 = r0.A02
            android.content.SharedPreferences r0 = X.AnonymousClass3NV.A01(r2)
            if (r9 != r7) goto L_0x0110
            java.lang.String r4 = "pref_xfamily_audience_tooltip"
        L_0x0110:
            int r1 = r0.getInt(r4, r6)
            java.lang.Object r0 = r2.get()
            X.3NV r0 = (X.AnonymousClass3NV) r0
            int r1 = r1 + 1
            android.content.SharedPreferences r0 = X.AnonymousClass3NV.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36341k9.A0v(r0, r4, r1)
        L_0x0127:
            boolean r0 = r5.isEmpty()
            int r0 = X.C36381kD.A00(r0)
            r3.setVisibility(r0)
        L_0x0132:
            return
        L_0x0133:
            X.0yC r1 = r14.A00
            r0 = 6490(0x195a, float:9.094E-42)
            int r0 = r1.A07(r0)
            if (r0 > r7) goto L_0x013e
            r0 = 1
        L_0x013e:
            if (r10 >= r0) goto L_0x00ae
            goto L_0x00af
        L_0x0142:
            r15 = 0
            goto L_0x0074
        L_0x0145:
            if (r19 == 0) goto L_0x0132
            goto L_0x0127
        L_0x0148:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75613nW.Brt(X.3XT, java.util.List, boolean):void");
    }

    public void Bru(AnonymousClass4U9 r2) {
        this.A05.setRecipientsListener$app_product_mediacomposer_mediacomposer_non_modified(r2);
    }

    public boolean isEnabled() {
        return this.A01;
    }

    public void Bqq(boolean z) {
        this.A01 = z;
    }
}
