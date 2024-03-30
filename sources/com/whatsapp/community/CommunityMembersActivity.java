package com.whatsapp.community;

import X.AnonymousClass07B;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass190;
import X.AnonymousClass1H2;
import X.AnonymousClass1LV;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass1T4;
import X.AnonymousClass1WR;
import X.AnonymousClass3H1;
import X.AnonymousClass3QK;
import X.AnonymousClass3UU;
import X.AnonymousClass3UX;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C20380xT;
import X.C20430xY;
import X.C21710zg;
import X.C232317r;
import X.C24801Dv;
import X.C27111My;
import X.C27731Pn;
import X.C32661dz;
import X.C32681e1;
import X.C32811eE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C41061wY;
import X.C53582rY;
import X.C55422ub;
import X.C61013Af;
import X.C61993Eh;
import X.C65363Rt;
import X.C65533Sl;
import X.C65933Ua;
import X.C87114Nn;
import X.C87494Pa;
import X.C87504Pb;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;

public class CommunityMembersActivity extends AnonymousClass155 {
    public AnonymousClass07B A00;
    public AnonymousClass1WR A01;
    public C65363Rt A02;
    public AnonymousClass1T4 A03;
    public C87494Pa A04;
    public AnonymousClass1LV A05;
    public C87504Pb A06;
    public C87114Nn A07;
    public AnonymousClass1Pp A08;
    public AnonymousClass16D A09;
    public AnonymousClass171 A0A;
    public C27731Pn A0B;
    public C20430xY A0C;
    public AnonymousClass17X A0D;
    public C232317r A0E;
    public AnonymousClass190 A0F;
    public C20380xT A0G;
    public C32661dz A0H;
    public C32811eE A0I;
    public C32681e1 A0J;
    public Runnable A0K;
    public boolean A0L;

    public int A2I() {
        return 579545668;
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A07 = (C87114Nn) A0L2.A2j.get();
            this.A01 = (AnonymousClass1WR) r2.A03.get();
            this.A0J = C36351kA.A0p(r3);
            this.A0F = C36351kA.A0h(r2);
            this.A0B = C36351kA.A0T(r2);
            this.A08 = C36361kB.A0V(r2);
            this.A09 = C36341k9.A0R(r2);
            this.A0G = C36331k8.A0I(r2);
            this.A0A = C36341k9.A0S(r2);
            this.A0I = C36401kF.A0e(r2);
            this.A0H = C36371kC.A0k(r2);
            this.A0C = C36421kH.A0K(r2);
            this.A05 = C36361kB.A0U(r2);
            this.A0E = (C232317r) r2.A61.get();
            this.A03 = (AnonymousClass1T4) r2.A1p.get();
            this.A0D = C36351kA.A0b(r2);
            this.A02 = (C65363Rt) r2.ABN.get();
            this.A06 = (C87504Pb) A0L2.A0d.get();
            this.A04 = (C87494Pa) A0L2.A0c.get();
        }
    }

    public void onCreate(Bundle bundle) {
        GroupJid groupJid;
        super.onCreate(bundle);
        A2T("load_community_member");
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B A0O = C36381kD.A0O(this);
        this.A00 = A0O;
        A0O.A0X(true);
        this.A00.A0U(true);
        this.A00.A0I(R.string.f12nameremoved);
        AnonymousClass1RY A052 = this.A0B.A05(this, "community-view-members");
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.community_members_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1f(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "extra_community_jid");
        C18740tg.A06(A002);
        boolean A1T = C36421kH.A1T(getIntent(), "extra_non_cag_members_view");
        AnonymousClass3QK A0L2 = C36421kH.A0L(this.A05, A002);
        if (A0L2 != null) {
            groupJid = A0L2.A02;
        } else {
            groupJid = null;
        }
        C61993Eh B3v = this.A04.B3v(this, A002, 2);
        CommunityMembersViewModel A003 = C53582rY.A00(this, this.A07, A002);
        C87504Pb r2 = this.A06;
        C19730wQ r15 = this.A02;
        AnonymousClass1H2 r10 = this.A0C;
        C41061wY B4J = r2.B4J(new C61013Af(this.A02, r15, this, B3v, A003, this.A09, this.A0A, r10), A052, groupJid, A002);
        B4J.A0B(true);
        recyclerView.setAdapter(B4J);
        C55422ub.A01(this, A003.A01, 41);
        A003.A00.A08(this, new C65933Ua(B4J, this, 0, A1T));
        A003.A02.A08(this, new AnonymousClass3UU(0, B4J, A1T));
        C32681e1 r22 = this.A0J;
        AnonymousClass190 r1 = this.A0F;
        C24801Dv r102 = this.A01;
        AnonymousClass16D r13 = this.A09;
        C20380xT r0 = this.A0G;
        A003.A03.A08(this, new AnonymousClass3UX(A002, this, new AnonymousClass3H1(r102, this, A003, r13, this.A0A, this.A08, r1, r0, r22), 0));
    }

    public CommunityMembersActivity(int i) {
        this.A0L = false;
        C89324Wc.A00(this, 5);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        A2K.A04 = true;
        return A2K;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0C.A08();
            this.A0H.A01();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0K;
        if (runnable != null) {
            this.A05.A0G(runnable);
        }
    }

    public CommunityMembersActivity() {
        this(0);
    }
}
