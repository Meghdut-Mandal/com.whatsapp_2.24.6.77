package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass041;
import X.AnonymousClass05H;
import X.AnonymousClass0R0;
import X.AnonymousClass0n9;
import X.AnonymousClass1B5;
import X.AnonymousClass1B6;
import X.AnonymousClass1BA;
import X.AnonymousClass1BB;
import X.AnonymousClass1BD;
import X.AnonymousClass1BI;
import X.AnonymousClass1BP;
import X.AnonymousClass5Kc;
import X.C005502l;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C06340Tf;
import X.C07360Xi;
import X.C106535Kb;
import X.C1268665y;
import X.C13120jC;
import X.C163907qx;
import X.C18000sQ;
import X.C18510tH;
import X.C20810yC;
import X.C23871Ae;
import X.C23981Ap;
import X.C23991Aq;
import X.C24181Bk;
import X.C36321k7;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C90494aF;
import X.C90504aG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class StickerPackFlow {
    public C106535Kb A00 = new C106535Kb(C023409w.A00);
    public final C20810yC A01;
    public final C23871Ae A02;
    public final C23981Ap A03;
    public final AnonymousClass1BB A04;
    public final AnonymousClass1B6 A05;
    public final AnonymousClass1BD A06;
    public final AnonymousClass1B5 A07;
    public final C24181Bk A08;
    public final C23991Aq A09;
    public final AnonymousClass1BI A0A;
    public final AnonymousClass1BP A0B;
    public final Map A0C = C36431kI.A1G();
    public final C005502l A0D;
    public final AnonymousClass040 A0E;
    public final AnonymousClass040 A0F;
    public final AnonymousClass05H A0G;
    public final AnonymousClass1BA A0H;
    public final C005502l A0I;

    public StickerPackFlow(C20810yC r8, C23871Ae r9, C23981Ap r10, AnonymousClass1BB r11, AnonymousClass1BA r12, AnonymousClass1B6 r13, AnonymousClass1BD r14, AnonymousClass1B5 r15, C24181Bk r16, C23991Aq r17, AnonymousClass1BI r18, AnonymousClass1BP r19, C005502l r20, C005502l r21, AnonymousClass040 r22) {
        C23991Aq r5 = r17;
        C36321k7.A1B(r8, r9, r5, r10, r11);
        C36321k7.A10(r13, r15);
        AnonymousClass040 r1 = r22;
        C36391kE.A1U(r14, r1);
        AnonymousClass1BI r4 = r18;
        C005502l r2 = r20;
        C36321k7.A15(r2, r12, r4);
        AnonymousClass1BP r3 = r19;
        AnonymousClass00C.A0D(r3, 14);
        C005502l r6 = r21;
        AnonymousClass00C.A0D(r6, 15);
        this.A01 = r8;
        this.A02 = r9;
        this.A09 = r5;
        this.A03 = r10;
        this.A04 = r11;
        this.A05 = r13;
        this.A07 = r15;
        this.A08 = r16;
        this.A06 = r14;
        this.A0E = r1;
        this.A0I = r2;
        this.A0H = r12;
        this.A0A = r4;
        this.A0B = r3;
        this.A0D = r6;
        AnonymousClass041 A0n = C90494aF.A0n(r2);
        this.A0F = A0n;
        this.A0G = new C18510tH((C009003v) new StickerPackFlow$packFlow$2(this, (C023509x) null), (AnonymousClass05H) C07360Xi.A01(AnonymousClass5Kc.A00, A0n, AnonymousClass0R0.A00(new StickerPackFlow$packFlow$1(this, (C023509x) null)), new C13120jC(0)), 5);
    }

    public static final void A00(C106535Kb r5, StickerPackFlow stickerPackFlow, C18000sQ r7) {
        String str;
        AnonymousClass0n9 r1;
        Throwable th;
        List list = r5.A00;
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Object next : list) {
            if (!((C1268665y) next).A00().A0R) {
                A0I2.add(next);
            }
        }
        HashSet A16 = C36441kJ.A16();
        ArrayList A0I3 = AnonymousClass001.A0I();
        for (Object next2 : A0I2) {
            C90504aG.A1H(((C1268665y) next2).A01(), next2, A16, A0I3);
        }
        List A002 = C163907qx.A00(A0I3, 19);
        AnonymousClass00C.A0D(A002, 0);
        C106535Kb r0 = new C106535Kb(A002);
        stickerPackFlow.A00 = r0;
        Object BwE = r7.BwE(r0);
        if (BwE instanceof C06340Tf) {
            C23871Ae r3 = stickerPackFlow.A02;
            if (!(BwE instanceof AnonymousClass0n9) || (r1 = (AnonymousClass0n9) BwE) == null || (th = r1.A00) == null || (str = th.getMessage()) == null) {
                str = "no exception message";
            }
            r3.A02(2, "sticker_flow_send_fail", str);
        }
    }

    public static final void A01(C106535Kb r1, StickerPackFlow stickerPackFlow, C18000sQ r3) {
        String str;
        AnonymousClass0n9 r12;
        Throwable th;
        C106535Kb r0 = new C106535Kb(r1.A00);
        stickerPackFlow.A00 = r0;
        Object BwE = r3.BwE(r0);
        if (BwE instanceof C06340Tf) {
            C23871Ae r32 = stickerPackFlow.A02;
            if (!(BwE instanceof AnonymousClass0n9) || (r12 = (AnonymousClass0n9) BwE) == null || (th = r12.A00) == null || (str = th.getMessage()) == null) {
                str = "no exception message";
            }
            r32.A02(2, "sticker_flow_send_fail", str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass68B r8, X.C023509x r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C151727Ar
            if (r0 == 0) goto L_0x0077
            r6 = r9
            X.7Ar r6 = (X.C151727Ar) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r4) goto L_0x0093
            java.lang.Object r3 = r6.L$2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r8 = r6.L$1
            X.68B r8 = (X.AnonymousClass68B) r8
            X.AnonymousClass0AN.A00(r2)
        L_0x0028:
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0039
            int r1 = r2.size()
            r0 = 3
            if (r1 <= r0) goto L_0x0039
            java.util.List r2 = X.C007103b.A0a(r2, r0)
        L_0x0039:
            r8.A05 = r2
            java.lang.String r2 = r8.A0F
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x007d
            X.AnonymousClass00C.A08(r2)
            java.lang.Number r0 = X.C90524aI.A0b(r2, r3)
            int r1 = X.C90484aE.A0B(r0)
            X.5Kg r0 = new X.5Kg
            r0.<init>(r8, r2, r1)
            return r0
        L_0x0054:
            X.AnonymousClass0AN.A00(r2)
            X.1BA r0 = r7.A0H
            java.util.Map r0 = r0.A01
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r0)
            X.02l r2 = r7.A0D
            r1 = 0
            com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1
            r0.<init>(r8, r7, r1)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.L$2 = r3
            r6.label = r4
            java.lang.Object r2 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r2 != r5) goto L_0x0028
            return r5
        L_0x0077:
            X.7Ar r6 = new X.7Ar
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x007d:
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x008a
            X.AnonymousClass00C.A08(r2)
            X.5Kf r0 = new X.5Kf
            r0.<init>(r8, r2)
            return r0
        L_0x008a:
            X.AnonymousClass00C.A08(r2)
            X.5Kd r0 = new X.5Kd
            r0.<init>(r8, r2)
            return r0
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow.A02(X.68B, X.09x):java.lang.Object");
    }
}
