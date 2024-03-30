package com.whatsapp.companiondevice.optin.ui;

import X.AnonymousClass04H;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C39861tz;
import X.C53592rZ;
import X.C61713Dd;
import X.C66943Xx;
import X.C68133bO;
import X.C89324Wc;
import X.C89634Xh;
import X.C90104Zc;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public class ForcedOptInActivity extends AnonymousClass155 {
    public ProgressDialog A00;
    public View A01;
    public ScrollView A02;
    public TextEmojiLabel A03;
    public C61713Dd A04;
    public C39861tz A05;
    public C20380xT A06;
    public WDSButton A07;
    public boolean A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setSupportActionBar((Toolbar) findViewById(R.id.title_toolbar));
        AnonymousClass07B A0O = C36381kD.A0O(this);
        A0O.A0I(R.string.f12nameremoved);
        A0O.A0U(true);
        this.A02 = (ScrollView) C03570Gk.A0B(this, R.id.scroll_view);
        this.A01 = C03570Gk.A0B(this, R.id.update_sheet_shadow);
        this.A03 = C36441kJ.A0e(this, R.id.improvement_description);
        this.A07 = (WDSButton) C03570Gk.A0B(this, R.id.update_button);
        AnonymousClass17Y r6 = this.A05;
        C19770wU r10 = this.A04;
        this.A05 = (C39861tz) new AnonymousClass04H(new C68133bO(r6, this.A04, this.A07, this.A09, r10), this).A00(C39861tz.class);
        C20810yC r102 = this.A0D;
        AnonymousClass17Y r7 = this.A05;
        C24801Dv r62 = this.A01;
        C21060yb r9 = this.A08;
        AnonymousClass6YV.A0E(this, this.A06.A04("download-and-installation", "about-linked-devices"), r62, r7, this.A03, r9, r102, C36391kE.A0v(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more");
        C90104Zc.A00(this.A02.getViewTreeObserver(), this, 11);
        C89634Xh.A00(this.A02.getViewTreeObserver(), this, 2);
        C66943Xx.A00(this.A07, this, 20);
        C53592rZ.A00(this, this.A05.A02, 36);
        C53592rZ.A00(this, this.A05.A04, 34);
        C53592rZ.A00(this, this.A05.A05, 35);
        C53592rZ.A00(this, this.A05.A01, 37);
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A06 = C36331k8.A0I(A0B);
            this.A04 = (C61713Dd) r1.A9y.get();
        }
    }

    public ForcedOptInActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 21);
    }

    public ForcedOptInActivity() {
        this(0);
    }
}
