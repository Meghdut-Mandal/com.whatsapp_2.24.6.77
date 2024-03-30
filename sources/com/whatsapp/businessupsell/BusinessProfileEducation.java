package com.whatsapp.businessupsell;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass2PD;
import X.C1497172m;
import X.C18800tq;
import X.C18830tt;
import X.C197659c4;
import X.C20380xT;
import X.C21010yW;
import X.C27111My;
import X.C32691e2;
import X.C34021gK;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C429721s;
import X.C61673Cz;
import X.C89314Wb;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class BusinessProfileEducation extends AnonymousClass155 {
    public C32691e2 A00;
    public C21010yW A01;
    public C197659c4 A02;
    public C20380xT A03;
    public C61673Cz A04;
    public boolean A05;

    public static void A01(BusinessProfileEducation businessProfileEducation, int i) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = C36421kH.A0U();
        businessProfileEducation.A01.Bly(r1);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = C36351kA.A0g(r2);
            this.A00 = C36371kC.A0R(r2);
            this.A03 = C36331k8.A0I(r2);
            this.A04 = C27111My.A3Y(A0L);
            this.A02 = C27111My.A3W(A0L);
        }
    }

    public BusinessProfileEducation(int i) {
        this.A05 = false;
        C89314Wb.A00(this, 31);
    }

    public void onCreate(Bundle bundle) {
        int i;
        Object[] objArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36361kB.A17(findViewById(R.id.close), this, 29);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.business_account_info_description);
        C34021gK r2 = new C34021gK(this.A0D);
        r2.A00 = new C1497172m(this, 38);
        A0I.setLinkHandler(r2);
        String stringExtra = getIntent().getStringExtra("key_extra_business_name");
        boolean A1S = AnonymousClass000.A1S(getIntent().getIntExtra("key_extra_verified_level", -1), 3);
        boolean A0E = this.A0D.A0E(5295);
        if (!A1S || stringExtra == null || A0E) {
            i = R.string.f12nameremoved;
            objArr = new Object[]{this.A03.A05("643460927283235")};
        } else {
            i = R.string.f12nameremoved;
            objArr = AnonymousClass001.A0M();
            objArr[0] = Html.escapeHtml(stringExtra);
            objArr[1] = this.A03.A05("643460927283235");
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(Html.fromHtml(getString(i, objArr)));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0P.getSpans(0, A0P.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                C36351kA.A18(A0P, uRLSpan, C429721s.A00(this, uRLSpan, this.A00, this.A05, this.A08));
            }
        }
        C36331k8.A16(A0I, this.A08);
        C36431kI.A1M(A0I, A0P);
        C36361kB.A17(findViewById(R.id.upsell_button), this, 30);
        A01(this, 1);
        if (AnonymousClass000.A1S(getIntent().getIntExtra("key_extra_verified_level", -1), 3)) {
            C197659c4 r3 = this.A02;
            String stringExtra2 = getIntent().getStringExtra("key_extra_business_jid");
            AnonymousClass00C.A0D(stringExtra2, 0);
            C197659c4.A00(r3, C36361kB.A0j(), stringExtra2, 3, 4);
        }
    }

    public BusinessProfileEducation() {
        this(0);
    }
}
