package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass17Z;
import X.AnonymousClass190;
import X.AnonymousClass1CF;
import X.AnonymousClass1RC;
import X.AnonymousClass1RJ;
import X.AnonymousClass1Z8;
import X.AnonymousClass3DY;
import X.AnonymousClass3FE;
import X.AnonymousClass3PI;
import X.AnonymousClass3TS;
import X.AnonymousClass3UF;
import X.AnonymousClass3UV;
import X.AnonymousClass3Y7;
import X.AnonymousClass3YR;
import X.C100754vc;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C20380xT;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C27111My;
import X.C29391Wl;
import X.C33761ft;
import X.C35761jD;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C64683Pa;
import X.C89364Wg;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class SettingsHelpV2 extends AnonymousClass155 {
    public C19460v5 A00;
    public AnonymousClass3DY A01;
    public AnonymousClass17Z A02;
    public C20830yE A03;
    public AnonymousClass1CF A04;
    public C33761ft A05;
    public AnonymousClass190 A06;
    public AnonymousClass3TS A07;
    public AnonymousClass1Z8 A08;
    public C29391Wl A09;
    public AnonymousClass3UV A0A;
    public AnonymousClass3PI A0B;
    public AnonymousClass3FE A0C;
    public C20380xT A0D;
    public boolean A0E;
    public boolean A0F;

    public void A2F() {
        if (!this.A0F) {
            this.A0F = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A06 = C36351kA.A0h(r1);
            this.A00 = C19470v6.A00;
            this.A01 = C36361kB.A0Q(r1);
            this.A0D = C36331k8.A0I(r1);
            this.A04 = C36361kB.A0b(r1);
            this.A07 = (AnonymousClass3TS) r3.A30.get();
            this.A03 = C36351kA.A0X(r1);
            this.A0C = (AnonymousClass3FE) r3.A6C.get();
            this.A08 = (AnonymousClass1Z8) r1.A8m.get();
            this.A0A = C36431kI.A0t(r1);
            this.A09 = (C29391Wl) r1.AdP.get();
            this.A02 = C36411kG.A0c(r1);
            this.A0B = C27111My.A3F(A0L);
            this.A05 = (C33761ft) r1.Abq.get();
        }
    }

    public SettingsHelpV2(int i) {
        this.A0F = false;
        C89364Wg.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        ViewGroup A0E2;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            this.A0E = C36411kG.A1W(this.A0D);
            int A002 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
            View findViewById = findViewById(R.id.get_help_preference);
            ImageView A0N = C36391kE.A0N(findViewById, R.id.settings_row_icon);
            A0N.setImageDrawable(new C100754vc(AnonymousClass00E.A00(this, R.drawable.ic_settings_help), this.A00));
            AnonymousClass3UF.A0E(A0N, A002);
            AnonymousClass3Y7.A00(findViewById, this, 40);
            View findViewById2 = findViewById(R.id.terms_and_privacy_preference);
            TextView A0P = C36391kE.A0P(findViewById2, R.id.settings_row_text);
            ImageView A0N2 = C36391kE.A0N(findViewById2, R.id.settings_row_icon);
            boolean z = this.A0E;
            int i = R.drawable.ic_settings_terms_policy;
            if (z) {
                i = R.drawable.ic_settings_account_unfilled_description;
            }
            C36321k7.A0L(this, A0N2, this.A00, i);
            AnonymousClass3UF.A0E(A0N2, A002);
            A0P.setText(getText(R.string.f12nameremoved));
            AnonymousClass3Y7.A00(findViewById2, this, 42);
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.about_preference);
            if (this.A0E) {
                settingsRowIconText.setIcon((int) R.drawable.ic_settings_help_unfilled_info);
            }
            AnonymousClass3UF.A0E(C36391kE.A0N(settingsRowIconText, R.id.settings_row_icon), A002);
            AnonymousClass3Y7.A00(settingsRowIconText, this, 41);
            C20810yC r2 = this.A0D;
            AnonymousClass00C.A07(r2);
            if (C20800yB.A01(C21000yV.A01, r2, 1799) && (A0E2 = C36421kH.A0E(this, R.id.notice_list)) != null) {
                C29391Wl r0 = this.A09;
                if (r0 != null) {
                    ArrayList A022 = r0.A02();
                    if (C36411kG.A1a(A022)) {
                        AnonymousClass1Z8 r5 = this.A08;
                        if (r5 != null) {
                            LayoutInflater layoutInflater = getLayoutInflater();
                            Iterator it = A022.iterator();
                            while (it.hasNext()) {
                                C64683Pa r6 = (C64683Pa) it.next();
                                if (r6 != null) {
                                    SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) C36361kB.A0E(layoutInflater, A0E2, R.layout.f9nameremoved);
                                    String str = r6.A05.A02;
                                    if (URLUtil.isValidUrl(str)) {
                                        settingsRowNoticeView.setOnClickListener(new AnonymousClass3YR(r6, settingsRowNoticeView, r5, str));
                                    }
                                    settingsRowNoticeView.setNotice(r6);
                                    if (r5.A03(r6, false)) {
                                        settingsRowNoticeView.A01(settingsRowNoticeView.A00, false);
                                        r5.A00.execute(new C35761jD(r5, r6, 15));
                                    } else {
                                        settingsRowNoticeView.A01((Drawable) null, false);
                                    }
                                    C18740tg.A0D(settingsRowNoticeView instanceof View, "UserNoticeBadgeView from the factory is not an android.view.View");
                                    A0E2.addView(settingsRowNoticeView);
                                }
                            }
                        } else {
                            throw C36331k8.A0d("userNoticeBadgeManager");
                        }
                    }
                    A0E2.setVisibility(0);
                } else {
                    throw C36331k8.A0d("noticeBadgeSharedPreferences");
                }
            }
            if (this.A0D.A0E(6297)) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.newsletter_reports_stub);
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                View A0L = C36391kE.A0L(new AnonymousClass1RJ(viewStub), 0);
                AnonymousClass00C.A08(A0L);
                AnonymousClass3Y7.A00(A0L, this, 39);
            }
            AnonymousClass3PI r3 = this.A0B;
            if (r3 != null) {
                View view = this.A00;
                AnonymousClass00C.A08(view);
                r3.A02(view, "help", C36381kD.A0q(this));
                return;
            }
            throw C36331k8.A0d("settingsSearchUtil");
        }
        throw C36381kD.A0k();
    }

    public void onResume() {
        super.onResume();
        if (this.A07 != null) {
            Iterator it = AnonymousClass001.A0I().iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("shouldShowNotice");
            }
            return;
        }
        throw C36331k8.A0d("noticeBadgeManager");
    }

    public SettingsHelpV2() {
        this(0);
    }
}
