package com.whatsapp.businessproductlist.view.adapter;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0D3;
import X.AnonymousClass1KP;
import X.AnonymousClass367;
import X.AnonymousClass4PF;
import X.AnonymousClass4PG;
import X.AnonymousClass80I;
import X.AnonymousClass8VI;
import X.AnonymousClass8WQ;
import X.AnonymousClass9ED;
import X.C109925Zq;
import X.C18820ts;
import X.C196089Xp;
import X.C19730wQ;
import X.C36371kC;
import X.C36391kE;
import X.C88374Sl;
import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class BusinessProductListAdapter extends AnonymousClass8VI implements AnonymousClass4PF, AnonymousClass01Y {
    public final AnonymousClass012 A00;
    public final AnonymousClass1KP A01;
    public final AnonymousClass4PG A02;
    public final C88374Sl A03;

    public AnonymousClass80I A0M(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i != 5) {
            return super.A0M(viewGroup, i);
        }
        List list = AnonymousClass0D3.A0I;
        Context A0B = C36371kC.A0B(viewGroup);
        UserJid userJid = this.A06;
        AnonymousClass00C.A07(userJid);
        C19730wQ r3 = this.A03;
        AnonymousClass00C.A07(r3);
        C18820ts r11 = this.A04;
        AnonymousClass00C.A07(r11);
        C196089Xp r5 = this.A05;
        AnonymousClass00C.A07(r5);
        C88374Sl r10 = this.A03;
        return C109925Zq.A00(A0B, viewGroup2, r3, new AnonymousClass9ED(897460087), r5, this, this, this.A01, this.A02, r10, r11, userJid);
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3.ordinal() == 5) {
            this.A00.getLifecycle().A05(this);
            this.A05.A00();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BusinessProductListAdapter(X.AnonymousClass012 r15, X.C24801Dv r16, X.AnonymousClass17Y r17, X.C19730wQ r18, X.C202279lS r19, X.C196089Xp r20, X.AnonymousClass1KP r21, X.AnonymousClass4PG r22, X.C88374Sl r23, X.AnonymousClass16D r24, X.AnonymousClass185 r25, X.AnonymousClass171 r26, X.C18820ts r27, X.C20810yC r28, com.whatsapp.jid.UserJid r29) {
        /*
            r14 = this;
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            X.C36321k7.A19(r4, r5, r3, r6)
            r7 = r20
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            X.C36321k7.A1C(r8, r10, r11, r9, r7)
            r0 = 11
            r12 = r28
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 14
            r1 = r23
            X.AnonymousClass00C.A0D(r1, r0)
            r2 = r14
            r13 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r14.A01 = r0
            r14.A00 = r15
            r14.A03 = r1
            r0 = r22
            r14.A02 = r0
            java.util.List r1 = r14.A00
            X.8WN r0 = new X.8WN
            r0.<init>()
            r1.add(r0)
            int r0 = X.C36431kI.A07(r1)
            r14.A08(r0)
            X.01M r0 = r15.getLifecycle()
            r0.A04(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter.<init>(X.012, X.1Dv, X.17Y, X.0wQ, X.9lS, X.9Xp, X.1KP, X.4PG, X.4Sl, X.16D, X.185, X.171, X.0ts, X.0yC, com.whatsapp.jid.UserJid):void");
    }

    public AnonymousClass367 B9s(int i) {
        if (C36391kE.A0t(this.A00) instanceof AnonymousClass8WQ) {
            return new AnonymousClass367((String) null, String.valueOf(i), (String) null);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return A0M(viewGroup, i);
    }
}
