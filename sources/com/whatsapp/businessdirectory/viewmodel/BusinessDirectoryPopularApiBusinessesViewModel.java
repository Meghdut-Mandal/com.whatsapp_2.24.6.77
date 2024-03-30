package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass08X;
import X.AnonymousClass1QW;
import X.AnonymousClass517;
import X.AnonymousClass5E0;
import X.AnonymousClass67X;
import X.AnonymousClass6QG;
import X.C001700s;
import X.C105145Dn;
import X.C105225Dv;
import X.C119215pS;
import X.C1260462i;
import X.C1261662u;
import X.C128836Du;
import X.C132296Sz;
import X.C132406Tm;
import X.C134986bw;
import X.C142646pD;
import X.C144416s9;
import X.C145866ue;
import X.C145896uh;
import X.C159307j9;
import X.C160727lU;
import X.C163287px;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C90464aC;
import android.app.Application;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class BusinessDirectoryPopularApiBusinessesViewModel extends AnonymousClass08X implements C160727lU, C159307j9 {
    public final C001700s A00 = C36431kI.A0S();
    public final C142646pD A01;
    public final AnonymousClass67X A02;
    public final C145896uh A03;
    public final C132296Sz A04;
    public final AnonymousClass1QW A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryPopularApiBusinessesViewModel(Application application, C142646pD r5, C145896uh r6, AnonymousClass67X r7, C132296Sz r8, AnonymousClass1QW r9) {
        super(application);
        C36321k7.A1A(application, r8, r5, r9, 1);
        this.A03 = r6;
        this.A02 = r7;
        this.A04 = r8;
        this.A01 = r5;
        this.A05 = r9;
        r6.A08 = this;
        r5.A04((Integer) null, 13, 89);
        A01();
    }

    public void BSS(C1261662u r4, int i) {
        C001700s r2 = this.A00;
        int i2 = 2;
        if (i == -1) {
            i2 = 1;
        }
        r2.A0C(C36371kC.A11(new C105225Dv(this, i2)));
    }

    private final void A01() {
        this.A00.A0C(C36371kC.A11(new C105145Dn()));
        C145896uh r1 = this.A03;
        AnonymousClass6QG A002 = C132296Sz.A00(this.A04);
        r1.A01();
        C145866ue r7 = new C145866ue(A002, r1, (Jid) null);
        r1.A03 = r7;
        AnonymousClass517 B49 = r1.A0H.B49(new C119215pS(25, (String) null), (C1260462i) null, A002, (C134986bw) null, r7, r1.A0M.A00, (C132406Tm) null, "all_descendents", "all_descendents", (String) null, "per_category_popular_biz");
        B49.A0B();
        r1.A00 = B49;
    }

    public void A0R() {
        this.A03.A08 = null;
    }

    public void BTX(int i) {
        throw AnonymousClass001.A09("Popular api businesses do not need location information");
    }

    public void BTb() {
        throw AnonymousClass001.A09("Popular api businesses do not show filters");
    }

    public void BfW() {
        throw AnonymousClass001.A09("Popular api businesses do not need location information");
    }

    public void Bg2() {
        throw AnonymousClass001.A09("Popular api businesses do not show categories");
    }

    public void BST(C128836Du r13) {
        ArrayList A0l = C36341k9.A0l(r13);
        for (C144416s9 r4 : r13.A06) {
            A0l.add(new AnonymousClass5E0(r4, new C163287px(this, r4, 1), 70));
        }
        C142646pD r5 = this.A01;
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        A1G2.put("endpoint", "businesses");
        Integer A0m = C36381kD.A0m();
        A1G2.put("local_biz_count", A0m);
        A1G2.put("api_biz_count", C36431kI.A14());
        A1G2.put("sub_categories", A0m);
        A1G.put("result", A1G2);
        r5.A08((Integer) null, 13, A1G, 13, 4, 2);
        this.A00.A0C(A0l);
    }

    public void BaJ() {
        throw C90464aC.A0o();
    }

    public void BfX() {
        A01();
    }
}
