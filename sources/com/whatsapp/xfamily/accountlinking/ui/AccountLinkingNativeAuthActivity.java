package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1UM;
import X.AnonymousClass1UZ;
import X.AnonymousClass5VM;
import X.AnonymousClass5u5;
import X.AnonymousClass6YV;
import X.AnonymousClass7NL;
import X.AnonymousClass7NM;
import X.C105555Fd;
import X.C131886Rd;
import X.C134716bU;
import X.C1501674f;
import X.C162667ox;
import X.C163037pY;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19630wG;
import X.C20050ww;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C24801Dv;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C90464aC;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class AccountLinkingNativeAuthActivity extends AnonymousClass155 {
    public C19460v5 A00;
    public C20050ww A01;
    public C19630wG A02;
    public C105555Fd A03;
    public AnonymousClass5u5 A04;
    public C134716bU A05;
    public AnonymousClass1UM A06;
    public AnonymousClass1UZ A07;
    public boolean A08;

    public static final SpannableStringBuilder A01(Runnable runnable, String str, String str2, int i) {
        Spanned fromHtml = Html.fromHtml(str);
        AnonymousClass00C.A08(fromHtml);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    int spanFlags = A0P.getSpanFlags(uRLSpan);
                    A0P.removeSpan(uRLSpan);
                    A0P.setSpan(new C162667ox(runnable, i), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A0P;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("fb_app_user_entity_as_parcel");
        if (parcelableExtra != null) {
            this.A05 = (C134716bU) parcelableExtra;
            View findViewById = findViewById(R.id.consent_login_button);
            AnonymousClass00C.A08(findViewById);
            C36351kA.A1E(findViewById, this, 38);
            C131886Rd.A01(new AnonymousClass7NL(this), 2);
            C131886Rd.A01(new AnonymousClass7NM(this), 2);
            C36351kA.A1E(findViewById(R.id.close_button), this, 39);
            TextView A0Q = C36391kE.A0Q(this, R.id.different_login);
            A0Q.setText(A01(new C1501674f(this, 12), C36381kD.A0s(getResources(), R.string.f12nameremoved), "log-in", A0Q.getCurrentTextColor()));
            C36331k8.A10(A0Q, this.A0D);
            C36391kE.A0Q(this, R.id.disclosure_ds_wa).setText(Html.fromHtml(getResources().getString(R.string.f12nameremoved)));
            C20810yC r12 = this.A0D;
            AnonymousClass17Y r9 = this.A05;
            C24801Dv r8 = this.A01;
            C21060yb r11 = this.A08;
            String string = getResources().getString(R.string.f12nameremoved);
            AnonymousClass6YV.A0E(this, this.A04.A00("https://faq.whatsapp.com/help/whatsapp/517414157043660"), r8, r9, (TextEmojiLabel) findViewById(R.id.disclosure_footer_text), r11, r12, string, "learn-more");
            C36331k8.A10(C36391kE.A0Q(this, R.id.disclosure_footer_text), this.A0D);
            TextView A0Q2 = C36391kE.A0Q(this, R.id.disclosure_ds_fb);
            A0Q2.setText(A01(new C1501674f(this, 13), C36381kD.A0s(getResources(), R.string.f12nameremoved), "privacy-policy", getResources().getColor(C224514j.A00(A0Q2.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved))));
            C36331k8.A10(A0Q2, this.A0D);
            AnonymousClass1UZ r1 = this.A07;
            if (r1 != null) {
                r1.A04("SEE_NATIVE_AUTH");
                return;
            }
            throw C36331k8.A0d("xFamilyUserFlowLogger");
        }
        throw C36381kD.A0l();
    }

    public static final void A07(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity, Integer num, Integer num2, boolean z) {
        C105555Fd r1 = accountLinkingNativeAuthActivity.A03;
        if (r1 != null) {
            r1.A00((AnonymousClass5VM) null, num, num2, z);
            accountLinkingNativeAuthActivity.finish();
            return;
        }
        throw C36331k8.A0d("accountLinkingResultObservers");
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A02 = C36351kA.A0W(r2);
            this.A01 = C36381kD.A0U(r2);
            this.A04 = (AnonymousClass5u5) A0L.A00.get();
            this.A03 = (C105555Fd) r1.A4d.get();
            this.A06 = (AnonymousClass1UM) r2.A3S.get();
            this.A07 = (AnonymousClass1UZ) r2.AfD.get();
            this.A00 = C19460v5.A01(r1.ADy());
        }
    }

    public AccountLinkingNativeAuthActivity(int i) {
        this.A08 = false;
        C163037pY.A00(this, 15);
    }

    public AccountLinkingNativeAuthActivity() {
        this(0);
    }
}
