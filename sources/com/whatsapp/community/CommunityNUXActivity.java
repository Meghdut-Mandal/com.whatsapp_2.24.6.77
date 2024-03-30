package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass155;
import X.AnonymousClass1LY;
import X.AnonymousClass1Sk;
import X.C03570Gk;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20380xT;
import X.C28421Sp;
import X.C28431Sq;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C66933Xw;
import X.C81323wp;
import X.C89324Wc;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class CommunityNUXActivity extends AnonymousClass155 {
    public C28431Sq A00;
    public C28421Sp A01;
    public AnonymousClass1Sk A02;
    public C33751fs A03;
    public C18820ts A04;
    public AnonymousClass1LY A05;
    public C20380xT A06;
    public C32681e1 A07;
    public boolean A08;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A07 = C36351kA.A0p(r1);
            this.A05 = (AnonymousClass1LY) A0B.A5r.get();
            this.A06 = C36331k8.A0I(A0B);
            this.A04 = C36341k9.A0T(A0B);
            this.A00 = C36391kE.A0b(A0B);
            this.A02 = C36431kI.A0Z(A0B);
            this.A01 = (C28421Sp) A0B.ADy.get();
            this.A03 = C36361kB.A0X(r1);
        }
    }

    public /* synthetic */ void A3i() {
        String A002 = this.A01.A00();
        this.A02.A09(this.A01.A00, A002, 3, 3);
        super.onBackPressed();
    }

    public void onBackPressed() {
        String A002 = this.A01.A00();
        this.A02.A09(this.A01.A00, A002, 8, 3);
        super.onBackPressed();
    }

    public CommunityNUXActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.A00("community", (Object) null);
        setContentView((int) R.layout.f9nameremoved);
        C66933Xw.A00(C03570Gk.A0B(this, R.id.community_nux_next_button), this, 33);
        C66933Xw.A00(C03570Gk.A0B(this, R.id.community_nux_close), this, 34);
        if (this.A0D.A0E(2356)) {
            TextView A0H = C36401kF.A0H(this, R.id.community_nux_disclaimer_pp);
            String A0v = C36391kE.A0v(this, "625069579217642", AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            A0H.setText(this.A07.A03(A0H.getContext(), new C81323wp((Object) this, 32), A0v, "625069579217642", C36341k9.A05(A0H.getContext())));
            C36331k8.A0z(A0H, this, this.A0D);
            A0H.setVisibility(0);
        }
        View A0B = C03570Gk.A0B(this, R.id.see_example_communities);
        TextView A0H2 = C36401kF.A0H(this, R.id.see_example_communities_text);
        ImageView A0P = C36431kI.A0P(this, R.id.see_example_communities_arrow);
        String A0v2 = C36391kE.A0v(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        A0H2.setText(this.A07.A03(A0H2.getContext(), new C81323wp((Object) this, 31), A0v2, "learn-more", C36341k9.A05(A0H2.getContext())));
        C36331k8.A0z(A0H2, this, this.A0D);
        C36321k7.A0L(this, A0P, this.A04, R.drawable.chevron_right);
        C66933Xw.A00(A0P, this, 35);
        A0B.setVisibility(0);
    }

    public CommunityNUXActivity() {
        this(0);
    }
}
