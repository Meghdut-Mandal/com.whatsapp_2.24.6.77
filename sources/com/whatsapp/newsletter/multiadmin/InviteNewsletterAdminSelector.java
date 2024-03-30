package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass12O;
import X.AnonymousClass141;
import X.AnonymousClass1ZV;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass378;
import X.AnonymousClass4RH;
import X.AnonymousClass4TO;
import X.C023509x;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C27111My;
import X.C28981Uw;
import X.C32681e1;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36411kG;
import X.C36431kI;
import X.C50952mu;
import X.C51872oW;
import X.C61823Do;
import X.C62403Ga;
import X.C81123wV;
import X.C84124Ca;
import X.C84134Cb;
import X.C84144Cc;
import X.C89344We;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminSelector extends AnonymousClass27v implements AnonymousClass4TO, AnonymousClass4RH {
    public AnonymousClass12O A00;
    public AnonymousClass1ZV A01;
    public C62403Ga A02;
    public C61823Do A03;
    public C20380xT A04;
    public C32681e1 A05;
    public List A06;
    public boolean A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r6 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r6 == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3v(X.C62463Gg r9, X.AnonymousClass141 r10) {
        /*
            r8 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r9, r3)
            super.A3v(r9, r10)
            java.util.List r0 = r8.A06
            r5 = -1
            if (r0 == 0) goto L_0x002a
            java.util.Iterator r1 = r0.iterator()
            r7 = 0
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.378 r0 = (X.AnonymousClass378) r0
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.C36411kG.A1V(r10, r0)
            if (r0 != 0) goto L_0x002b
            int r7 = r7 + 1
            goto L_0x0011
        L_0x002a:
            r7 = -1
        L_0x002b:
            r4 = 0
            if (r7 == r5) goto L_0x0071
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.get(r7)
            X.378 r0 = (X.AnonymousClass378) r0
            if (r0 == 0) goto L_0x00ba
            boolean r6 = r0.A01
            r2 = 2131890555(0x7f12117b, float:1.9415805E38)
            if (r6 != 0) goto L_0x0044
        L_0x0041:
            r2 = 2131890554(0x7f12117a, float:1.9415803E38)
        L_0x0044:
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r0.get(r7)
            X.378 r0 = (X.AnonymousClass378) r0
            if (r0 == 0) goto L_0x00b8
            X.2pL r1 = r0.A02
        L_0x0052:
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 == r0) goto L_0x006a
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.get(r7)
            X.378 r0 = (X.AnonymousClass378) r0
            if (r0 == 0) goto L_0x00b6
            X.2pL r1 = r0.A02
        L_0x0064:
            X.2pL r0 = X.C52382pL.OWNER
            if (r1 == r0) goto L_0x006a
            if (r6 == 0) goto L_0x0071
        L_0x006a:
            java.lang.String r0 = r8.getString(r2)
            r9.A00(r0, r3)
        L_0x0071:
            java.util.List r0 = r8.A0P
            if (r0 == 0) goto L_0x00b2
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            X.11F r0 = X.C36341k9.A0W(r1)
            boolean r0 = X.C36411kG.A1V(r10, r0)
            if (r0 == 0) goto L_0x00b3
            if (r2 == r5) goto L_0x00b2
            X.00T r0 = r8.A08
            java.lang.Object r1 = X.C36381kD.A0p(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = r8.A0P
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r0.get(r2)
            X.141 r0 = (X.AnonymousClass141) r0
            if (r0 == 0) goto L_0x00a2
            X.11F r4 = r0.A0H
        L_0x00a2:
            boolean r0 = X.C007103b.A0j(r1, r4)
            if (r0 == 0) goto L_0x00b2
            r0 = 2131890555(0x7f12117b, float:1.9415805E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A00(r0, r3)
        L_0x00b2:
            return
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x007a
        L_0x00b6:
            r1 = r4
            goto L_0x0064
        L_0x00b8:
            r1 = r4
            goto L_0x0052
        L_0x00ba:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector.A3v(X.3Gg, X.141):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A49(java.util.List r9) {
        /*
            r8 = this;
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r9.iterator()
        L_0x0009:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r4 = r5.next()
            X.3KO r4 = (X.AnonymousClass3KO) r4
            X.13w r2 = r4.A03
            if (r2 == 0) goto L_0x0046
            X.12O r0 = r8.A00
            if (r0 == 0) goto L_0x0048
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r2)
            if (r1 == 0) goto L_0x0046
        L_0x0023:
            X.11F r1 = (X.AnonymousClass11F) r1
            if (r1 == 0) goto L_0x0009
            X.16D r0 = r8.A09
            X.141 r3 = r0.A0D(r1)
            r3.A0x = r7
            X.2pL r2 = r4.A01
            X.00T r0 = r8.A08
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.contains(r1)
            X.378 r0 = new X.378
            r0.<init>(r2, r3, r1)
            r6.add(r0)
            goto L_0x0009
        L_0x0046:
            r1 = r2
            goto L_0x0023
        L_0x0048:
            java.lang.String r0 = "waJidMapRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector.A49(java.util.List):java.util.List");
    }

    public void B2c(AnonymousClass141 r4) {
        Object obj;
        AnonymousClass00C.A0D(r4, 0);
        super.B2c(r4);
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C36411kG.A1V(r4, ((AnonymousClass378) obj).A00.A0H)) {
                    break;
                }
            }
            AnonymousClass378 r1 = (AnonymousClass378) obj;
            if (r1 != null) {
                r1.A00.A0x = r4.A0x;
                this.A01.notifyDataSetChanged();
            }
        }
    }

    public void BgD(C28981Uw r8, String str, List list) {
        C36321k7.A0w(r8, list);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
        C36331k8.A1T(new InviteNewsletterAdminSelector$onSend$1(r8, this, str, list, (C023509x) null), A002);
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A01 = (AnonymousClass1ZV) r2.A5n.get();
            this.A05 = C36351kA.A0p(r1);
            this.A04 = C36331k8.A0I(r2);
            this.A02 = (C62403Ga) r1.AA8.get();
            this.A00 = C36411kG.A0d(r2);
            this.A03 = (C61823Do) r1.AA9.get();
        }
    }

    public InviteNewsletterAdminSelector(int i) {
        this.A07 = false;
        C89344We.A00(this, 18);
    }

    public void Bji(C51872oW r2, String str, List list) {
        C28981Uw A0i;
        C36321k7.A0w(list, r2);
        if (r2 == C51872oW.INVITE && (A0i = C36431kI.A0i(this.A09)) != null && str != null) {
            BgD(A0i, str, list);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bx9();
        this.A04.Bp1(new C81123wV((Object) this, 8));
        WDSSearchBar wDSSearchBar = this.A0M;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C50952mu.A00);
            wDSSearchBar.A07.setHint((int) R.string.f12nameremoved);
        }
    }

    public void BUS(AnonymousClass141 r1) {
        B2c(r1);
    }

    public InviteNewsletterAdminSelector() {
        this(0);
        this.A09 = C36431kI.A1I(new C84134Cb(this));
        this.A0A = C36431kI.A1I(new C84144Cc(this));
        this.A08 = C36431kI.A1I(new C84124Ca(this));
    }
}
