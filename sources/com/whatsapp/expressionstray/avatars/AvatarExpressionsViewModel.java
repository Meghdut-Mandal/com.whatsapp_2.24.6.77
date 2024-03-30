package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05H;
import X.AnonymousClass05J;
import X.AnonymousClass05L;
import X.AnonymousClass0R1;
import X.AnonymousClass0n5;
import X.AnonymousClass1AP;
import X.AnonymousClass1C2;
import X.AnonymousClass55I;
import X.AnonymousClass55J;
import X.AnonymousClass565;
import X.AnonymousClass63V;
import X.AnonymousClass6O1;
import X.C001700s;
import X.C005502l;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C06820Vf;
import X.C06830Vg;
import X.C07430Xq;
import X.C109325Xd;
import X.C110635az;
import X.C117175lp;
import X.C117185lq;
import X.C119585q6;
import X.C124575yQ;
import X.C125385zp;
import X.C125415zs;
import X.C1266865b;
import X.C130566Lo;
import X.C130616Lt;
import X.C164477rs;
import X.C17980sO;
import X.C18510tH;
import X.C23871Ae;
import X.C24281Bv;
import X.C28201Rs;
import X.C36321k7;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AvatarExpressionsViewModel extends AnonymousClass04R {
    public int A00;
    public C007403e A01;
    public final AnonymousClass6O1 A02;
    public final C130616Lt A03;
    public final AnonymousClass63V A04;
    public final C119585q6 A05;
    public final AvatarOnDemandStickers A06;
    public final C23871Ae A07;
    public final C24281Bv A08;
    public final AnonymousClass1AP A09;
    public final AnonymousClass1C2 A0A;
    public final C124575yQ A0B;
    public final C130566Lo A0C;
    public final C28201Rs A0D = C36441kJ.A0t();
    public final C17980sO A0E = new AnonymousClass0n5();
    public final C005502l A0F;
    public final AnonymousClass05J A0G;
    public final AnonymousClass05J A0H;
    public final AnonymousClass05L A0I;
    public final C001700s A0J;

    public final void A0T(C125385zp r11) {
        AnonymousClass05L r2 = this.A0I;
        C110635az r1 = (C110635az) r2.getValue();
        if ((r1 instanceof AnonymousClass55I) && (r11 instanceof AnonymousClass565)) {
            AnonymousClass55I r12 = (AnonymousClass55I) r1;
            r2.setValue(new AnonymousClass55I(((AnonymousClass565) r11).A00, r12.A01, r12.A03, r12.A04, r12.A05, false));
        }
    }

    public AvatarExpressionsViewModel(AnonymousClass6O1 r4, C117175lp r5, C117185lq r6, C130616Lt r7, AnonymousClass63V r8, C119585q6 r9, AvatarOnDemandStickers avatarOnDemandStickers, C23871Ae r11, C24281Bv r12, AnonymousClass1AP r13, AnonymousClass1C2 r14, C124575yQ r15, C130566Lo r16, C005502l r17) {
        C130566Lo r1 = r16;
        C36321k7.A1B(r11, r13, r1, r9, r15);
        AnonymousClass00C.A0D(r8, 6);
        C36391kE.A1U(r14, r4);
        C36321k7.A15(r5, r6, r12);
        C005502l r2 = r17;
        AnonymousClass00C.A0D(r2, 14);
        this.A07 = r11;
        this.A09 = r13;
        this.A0C = r1;
        this.A05 = r9;
        this.A0B = r15;
        this.A04 = r8;
        this.A06 = avatarOnDemandStickers;
        this.A03 = r7;
        this.A0A = r14;
        this.A02 = r4;
        this.A08 = r12;
        this.A0F = r2;
        AnonymousClass55J r18 = AnonymousClass55J.A00;
        this.A0I = AnonymousClass05E.A00(r18);
        this.A0G = r6.A00;
        this.A0J = C36441kJ.A0Z(r18);
        this.A0H = r5.A00;
        C109325Xd.A01(this, new AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(this, (C023509x) null), this.A0G);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C110635az A01(com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r9, java.util.List r10, boolean r11) {
        /*
            X.05L r0 = r9.A0I
            java.lang.Object r2 = r0.getValue()
            X.5az r2 = (X.C110635az) r2
            r4 = r10
            java.lang.Object r0 = X.C007103b.A0M(r10)
            X.65b r0 = (X.C1266865b) r0
            if (r0 == 0) goto L_0x0075
            X.5zp r1 = r0.A02()
            if (r1 == 0) goto L_0x0075
            boolean r0 = r1 instanceof X.AnonymousClass565
            if (r0 == 0) goto L_0x0075
            X.565 r1 = (X.AnonymousClass565) r1
            if (r1 == 0) goto L_0x0075
            X.5zs r1 = r1.A00
        L_0x0021:
            boolean r0 = r2 instanceof X.AnonymousClass55I
            if (r0 == 0) goto L_0x0072
            X.55I r2 = (X.AnonymousClass55I) r2
            X.5zs r3 = r2.A00
            boolean r0 = A02(r3, r10)
            if (r0 == 0) goto L_0x0072
            boolean r8 = r2.A02
        L_0x0031:
            X.5IC r0 = X.AnonymousClass5IC.A00
            boolean r5 = A02(r0, r10)
            X.5IE r0 = X.AnonymousClass5IE.A00
            boolean r6 = A02(r0, r10)
            X.5IF r0 = X.AnonymousClass5IF.A00
            boolean r7 = A02(r0, r10)
            boolean r1 = r10.isEmpty()
            r0 = 1
            if (r1 != r0) goto L_0x0062
            if (r11 != r0) goto L_0x005f
            X.1Rs r0 = r9.A0D
            java.lang.Object r0 = r0.A04()
            X.6c4 r0 = (X.C135066c4) r0
            X.55G r2 = new X.55G
            r2.<init>(r0)
        L_0x0059:
            X.00s r0 = r9.A0J
            r0.A0C(r2)
            return r2
        L_0x005f:
            X.55J r2 = X.AnonymousClass55J.A00
            goto L_0x0059
        L_0x0062:
            if (r1 != 0) goto L_0x0078
            if (r11 == 0) goto L_0x006c
            X.55H r2 = new X.55H
            r2.<init>(r10)
            goto L_0x0059
        L_0x006c:
            X.55I r2 = new X.55I
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0059
        L_0x0072:
            r3 = r1
            r8 = 0
            goto L_0x0031
        L_0x0075:
            X.5IC r1 = X.AnonymousClass5IC.A00
            goto L_0x0021
        L_0x0078:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel.A01(com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel, java.util.List, boolean):X.5az");
    }

    public static final boolean A02(C125415zs r5, List list) {
        AnonymousClass565 r2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C125385zp A022 = ((C1266865b) it.next()).A02();
                C125415zs r0 = null;
                if ((A022 instanceof AnonymousClass565) && (r2 = (AnonymousClass565) A022) != null) {
                    r0 = r2.A00;
                }
                if (AnonymousClass00C.A0J(r0, r5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0S() {
        C007403e r0;
        C007403e r02 = this.A01;
        if (r02 == null || !r02.BL7() || (r0 = this.A01) == null || r0.BLQ()) {
            C18510tH r03 = new C18510tH((C009003v) new AvatarExpressionsViewModel$observeEverything$3(this, (C023509x) null), (AnonymousClass05H) C06830Vg.A00(new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(this, (C023509x) null), C07430Xq.A01(new C164477rs(this.A0B.A07, 1))), 5);
            C005502l r3 = this.A0F;
            this.A01 = C06820Vf.A01(C109325Xd.A00(this), AnonymousClass0R1.A00(r3, r03));
            if (this.A0D.A04() == null) {
                C36381kD.A1R(r3, new AvatarExpressionsViewModel$getLoudlyCryingAvatarSticker$1(this, (C023509x) null), C109325Xd.A00(this));
                return;
            }
            return;
        }
        Log.e("AvatarExpressionsViewModel/data source is still being observed, no need to subscribe again.");
    }
}
