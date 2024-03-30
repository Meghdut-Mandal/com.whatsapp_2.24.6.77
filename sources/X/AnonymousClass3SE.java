package X;

import android.net.Uri;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.3SE  reason: invalid class name */
public class AnonymousClass3SE {
    public static Pattern A0E;
    public ContactUsActivity A00;
    public AnonymousClass11F A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass4U7 A04 = new C75353n5(this);
    public final AnonymousClass17Y A05;
    public final C220412q A06;
    public final C24521Ct A07 = new AnonymousClass4YE(this, 15);
    public final C24381Cf A08;
    public final C20310xM A09;
    public final C20810yC A0A;
    public final AnonymousClass4TG A0B = new C90294Zv(this, 0);
    public final AnonymousClass4TG A0C = new C90294Zv(this, 1);
    public final C19770wU A0D;

    public void A03(String str) {
        String str2 = str;
        ContactUsActivity contactUsActivity = this.A00;
        C18740tg.A06(contactUsActivity);
        contactUsActivity.A3G(contactUsActivity.getString(R.string.f12nameremoved));
        ContactUsActivity contactUsActivity2 = this.A00;
        String A0f = C36331k8.A0f(contactUsActivity2.A00);
        if (!A00()) {
            str2 = null;
        }
        boolean A002 = A00();
        contactUsActivity2.A0G.A00(this.A04, A0f, str2, A002, false);
    }

    private boolean A00() {
        C18740tg.A06(this.A00);
        if (this.A0A.A0E(4150)) {
            return true;
        }
        AppCompatCheckBox appCompatCheckBox = this.A00.A02;
        if (appCompatCheckBox == null || !appCompatCheckBox.isChecked()) {
            return false;
        }
        return true;
    }

    public void A01() {
        ContactUsActivity contactUsActivity = this.A00;
        C18740tg.A06(contactUsActivity);
        String A0f = C36331k8.A0f(contactUsActivity.A00);
        boolean A002 = A00();
        contactUsActivity.A3i(3);
        contactUsActivity.A0N.A00(contactUsActivity, contactUsActivity.A0D, contactUsActivity.A0J, contactUsActivity.A0U, A0f, contactUsActivity.A0T, contactUsActivity.A0V, AnonymousClass001.A0I(), (List) null, A002);
    }

    public void A02(int i) {
        AnonymousClass4TG r12;
        ContactUsActivity contactUsActivity = this.A00;
        C18740tg.A06(contactUsActivity);
        C18740tg.A06(contactUsActivity);
        int length = A0E.matcher(C36331k8.A0f(contactUsActivity.A00)).replaceAll("").getBytes().length;
        if (this.A03 || length >= 10) {
            ContactUsActivity contactUsActivity2 = this.A00;
            C18740tg.A06(contactUsActivity2);
            if ("biz-directory-browsing".equals(contactUsActivity2.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from"))) {
                A01();
                return;
            }
            this.A00.A01.setVisibility(8);
            ContactUsActivity contactUsActivity3 = this.A00;
            contactUsActivity3.A00.setBackgroundDrawable(AnonymousClass00E.A00(contactUsActivity3, R.drawable.description_field_background_state_list));
            ContactUsActivity contactUsActivity4 = this.A00;
            if (i == 1) {
                r12 = this.A0B;
            } else {
                r12 = this.A0C;
            }
            String A0f = C36331k8.A0f(contactUsActivity4.A00);
            C19770wU r11 = contactUsActivity4.A04;
            String str = contactUsActivity4.A0U;
            String str2 = contactUsActivity4.A0V;
            C50132kG r0 = contactUsActivity4.A0H;
            if (r0 != null && r0.A06() == 1) {
                contactUsActivity4.A0H.A0D(false);
            }
            C20050ww r33 = contactUsActivity4.A05;
            C20060wx r15 = contactUsActivity4.A08;
            C20380xT r14 = contactUsActivity4.A0O;
            C18820ts r10 = contactUsActivity4.A08;
            C31211bS r9 = contactUsActivity4.A0P;
            C24341Cb r8 = contactUsActivity4.A07;
            AnonymousClass1CF r7 = contactUsActivity4.A0E;
            C19420v0 r6 = contactUsActivity4.A09;
            AnonymousClass3FE r5 = contactUsActivity4.A0N;
            AnonymousClass3XH r3 = contactUsActivity4.A0D;
            AnonymousClass147 r2 = contactUsActivity4.A0J;
            C18820ts r17 = r10;
            C20060wx r18 = r15;
            AnonymousClass3XH r19 = r3;
            AnonymousClass1CF r20 = r7;
            C20050ww r142 = r33;
            C24341Cb r152 = r8;
            C19420v0 r16 = r6;
            C50132kG r122 = new C50132kG(contactUsActivity4, r142, r152, r16, r17, r18, r19, r20, contactUsActivity4.A0F, r12, r2, r5, r14, r9, contactUsActivity4.A0Q, str, str2, A0f, (List) null, new Uri[0]);
            contactUsActivity4.A0H = r122;
            C36331k8.A1F(r122, r11);
            return;
        }
        ContactUsActivity contactUsActivity5 = this.A00;
        contactUsActivity5.A00.setBackgroundDrawable(AnonymousClass00E.A00(contactUsActivity5, R.drawable.describe_problem_edittext_bg_error));
        ContactUsActivity contactUsActivity6 = this.A00;
        int i2 = R.string.f12nameremoved;
        if (length == 0) {
            i2 = R.string.f12nameremoved;
        }
        contactUsActivity6.A01.setText(i2);
        this.A00.A01.setVisibility(0);
    }

    public boolean A04() {
        return this.A00.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from").equals("SupportAi:fallback:email");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.A06.A0M(r2) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(boolean r6) {
        /*
            r5 = this;
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0086
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0086
            X.0yC r1 = r5.A0A
            r0 = 819(0x333, float:1.148E-42)
            boolean r2 = r1.A0E(r0)
            if (r2 == 0) goto L_0x0055
            X.11F r1 = r5.A01
            if (r1 == 0) goto L_0x0055
            X.12q r0 = r5.A06
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - opening chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r5.A00
            r0.Bnv()
            com.whatsapp.inappsupport.ui.ContactUsActivity r3 = r5.A00
            X.11F r2 = r5.A01
            X.3SE r0 = r3.A0I
            if (r2 == 0) goto L_0x003a
            X.12q r0 = r0.A06
            boolean r0 = r0.A0M(r2)
            r1 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            java.lang.String r0 = "Support group to open doesn't exist"
            X.C18740tg.A0D(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contactusactivity/tryopensupportchat/exists/"
            X.C36321k7.A1K(r2, r0, r1)
            android.content.Intent r0 = X.C36371kC.A0D(r3, r2)
            r3.A33(r0, r4)
        L_0x0050:
            r5.A02 = r4
        L_0x0052:
            boolean r0 = r5.A02
            return r0
        L_0x0055:
            if (r6 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x005d
            X.11F r0 = r5.A01
            if (r0 != 0) goto L_0x0052
        L_0x005d:
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - showing dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r5.A00
            r0.Bnv()
            com.whatsapp.inappsupport.ui.ContactUsActivity r3 = r5.A00
            r1 = 2131887794(0x7f1206b2, float:1.9410205E38)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.3P9 r2 = com.whatsapp.LegacyMessageDialogFragment.A03(r0, r1)
            X.3Vp r1 = X.C66343Vp.A00
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r2.A03 = r0
            r2.A06 = r1
            r2.A00 = r4
            com.whatsapp.LegacyMessageDialogFragment r0 = r2.A02()
            X.C36331k8.A12(r0, r3)
            goto L_0x0050
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SE.A05(boolean):boolean");
    }

    public AnonymousClass3SE(AnonymousClass17Y r3, C220412q r4, C24381Cf r5, C20310xM r6, C20810yC r7, ContactUsActivity contactUsActivity, C19770wU r9) {
        this.A0A = r7;
        this.A05 = r3;
        this.A06 = r4;
        this.A08 = r5;
        this.A00 = contactUsActivity;
        this.A09 = r6;
        this.A0D = r9;
        A0E = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");
    }
}
