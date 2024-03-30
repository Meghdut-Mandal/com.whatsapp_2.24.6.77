package com.whatsapp.infra.graphql;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1SL;
import X.AnonymousClass1ZL;
import X.AnonymousClass1ZT;
import X.AnonymousClass9UD;
import X.AnonymousClass9Y8;
import X.B6H;
import X.B7F;
import X.C177258dV;
import X.C177268dW;
import X.C177278dX;
import X.C178238fP;
import X.C199939gI;
import X.C201259jD;
import X.C26141Ja;
import X.C27621Oz;
import X.C28981Uw;
import X.C30071Zc;
import X.C30111Zg;
import X.C35741jB;
import X.C44072La;
import X.C51952oe;
import X.C52382pL;
import X.C65073Qp;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl;
import org.json.JSONArray;

public abstract class BaseMexCallback implements B6H {
    public C199939gI A00;
    public C27621Oz A01;
    public Long A02;

    public void A05(Throwable th) {
        C201259jD r0 = new C201259jD(th, (JSONArray) null);
        A04(r0, false);
        A06(r0);
    }

    public final void BXQ(Throwable th) {
        AnonymousClass00C.A0D(th, 0);
        A05(th);
    }

    public final void Bey(C177278dX r2) {
        AnonymousClass00C.A0D(r2, 0);
        A03(r2);
    }

    public void A02(AnonymousClass9Y8 r9) {
        if (this instanceof C177268dW) {
            AnonymousClass00C.A0D(r9, 0);
            C177258dV r0 = ((C177268dW) this).A00;
            if (r0 != null) {
                r0.A02(r9);
            }
        } else if (this instanceof C177258dV) {
            AnonymousClass00C.A0D(r9, 0);
            ((C177258dV) this).A00.invoke(r9);
        } else {
            B7F b7f = (B7F) this;
            switch (b7f.A03) {
                case 0:
                    AnonymousClass00C.A0D(r9, 0);
                    C30071Zc r2 = (C30071Zc) b7f.A02;
                    if (!AnonymousClass1ZL.A08(AnonymousClass9Y8.A00(r9, NewsletterMuteResponseImpl.Xwa2NewsletterMuteV2.class, "xwa2_newsletter_mute_v2"))) {
                        AnonymousClass1ZT r4 = r2.A01;
                        C51952oe r3 = C51952oe.MUTE;
                        C178238fP r1 = new C178238fP((String) null, 0);
                        r4.A03.A01((C28981Uw) b7f.A01, r3, r1);
                        return;
                    }
                    r2.A01.A03((C28981Uw) b7f.A01, true);
                    return;
                case 1:
                    AnonymousClass00C.A0D(r9, 0);
                    boolean A08 = AnonymousClass1ZL.A08(AnonymousClass9Y8.A00(r9, NewsletterUnmuteResponseImpl.Xwa2NewsletterUnmuteV2.class, "xwa2_newsletter_unmute_v2"));
                    AnonymousClass1ZT r42 = ((C30071Zc) b7f.A02).A01;
                    if (!A08) {
                        C51952oe r32 = C51952oe.UNMUTE;
                        C178238fP r12 = new C178238fP((String) null, 0);
                        r42.A03.A01((C28981Uw) b7f.A01, r32, r12);
                        return;
                    }
                    r42.A03((C28981Uw) b7f.A01, false);
                    return;
                case 2:
                    AnonymousClass00C.A0D(r9, 0);
                    C30111Zg r5 = (C30111Zg) b7f.A02;
                    if (!AnonymousClass1ZL.A08(AnonymousClass9Y8.A00(r9, NewsletterJoinResponseImpl.Xwa2NewsletterJoinV2.class, "xwa2_newsletter_join_v2"))) {
                        r5.A02.A01((C28981Uw) b7f.A01, C51952oe.FOLLOW, new C178238fP((String) null, 0));
                        return;
                    }
                    C26141Ja r13 = r5.A00;
                    C28981Uw r43 = (C28981Uw) b7f.A01;
                    r13.A07(C52382pL.SUBSCRIBED, r43);
                    r5.A04.A0F(r43);
                    AnonymousClass1SL r33 = r5.A03;
                    C65073Qp A09 = r33.A01.A09(r43, false);
                    if (!(A09 instanceof C44072La) || A09 == null) {
                        throw AnonymousClass001.A09("NewsletterInfo expected in chatCache");
                    }
                    r33.A0B.Boy(new C35741jB(r33, r43, 29));
                    r5.A02.A00(r43, C51952oe.FOLLOW);
                    return;
                default:
                    AnonymousClass00C.A0D(r9, 0);
                    C30111Zg r34 = (C30111Zg) b7f.A02;
                    C26141Ja r14 = r34.A00;
                    C28981Uw r22 = (C28981Uw) b7f.A01;
                    r14.A07(C52382pL.GUEST, r22);
                    r34.A04.A0F(r22);
                    r34.A02.A00(r22, C51952oe.UNFOLLOW);
                    return;
            }
        }
    }

    public void A03(C177278dX r4) {
        C201259jD r2 = null;
        if (r4.A03) {
            r2 = new C201259jD((Throwable) null, r4.A01);
        }
        boolean z = r4.A02;
        A04(r2, z);
        if ((r2 == null || A06(r2)) && z) {
            A02(r4.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r11 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C201259jD r11, boolean r12) {
        /*
            r10 = this;
            X.9gI r6 = r10.A00
            if (r6 == 0) goto L_0x0082
            X.1Oz r0 = r10.A01
            if (r0 == 0) goto L_0x0018
            if (r12 == 0) goto L_0x000d
            r2 = 2
            if (r11 == 0) goto L_0x000e
        L_0x000d:
            r2 = 3
        L_0x000e:
            X.1P0 r0 = r0.A03
            X.0ze r1 = r0.A00
            r0 = 239471030(0xe4609b6, float:2.441006E-30)
            r1.markerEnd(r0, r2)
        L_0x0018:
            X.1Oz r5 = r10.A01
            if (r5 == 0) goto L_0x0082
            java.lang.Long r2 = r10.A02
            X.0wo r0 = r5.A00
            long r0 = X.C19970wo.A00(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            X.8cD r4 = new X.8cD
            r4.<init>()
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r4.A01 = r0
            r4.A04 = r2
            r4.A03 = r1
            r8 = 0
            if (r2 == 0) goto L_0x00c4
            long r2 = r2.longValue()
            if (r1 == 0) goto L_0x00c4
            long r0 = r1.longValue()
            java.lang.Long r0 = X.C90504aG.A0h(r0, r2)
        L_0x004c:
            r4.A02 = r0
            if (r11 == 0) goto L_0x00c2
            java.util.List r3 = r11.A00
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0063
            java.lang.String r2 = ","
            X.AoE r1 = X.C22532AoE.A00
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r2, r0, r0, r3, r1)
        L_0x0063:
            r4.A05 = r0
            if (r11 == 0) goto L_0x0071
            java.util.List r1 = r11.A00
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0083
            java.lang.String r8 = ""
        L_0x0071:
            r4.A06 = r8
            java.lang.String r0 = r6.A04
            r4.A07 = r0
            java.lang.String r0 = r6.A05
            r4.A08 = r0
            r4.A00 = r7
            X.0yW r0 = r5.A02
            r0.Bly(r4)
        L_0x0082:
            return
        L_0x0083:
            org.json.JSONArray r9 = X.C90524aI.A0u()
            java.util.Iterator r8 = r1.iterator()
        L_0x008b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r3 = r8.next()
            X.B2T r3 = (X.B2T) r3
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            int r1 = r3.B9n()
            java.lang.String r0 = "code"
            r2.put(r0, r1)
            java.lang.String r1 = r3.BB3()
            java.lang.String r0 = "detail"
            r2.put(r0, r1)
            java.lang.String r1 = r3.B9T()
            java.lang.String r0 = "category"
            r2.put(r0, r1)
            r9.put(r2)
            goto L_0x008b
        L_0x00ba:
            java.lang.String r8 = r9.toString()
            X.AnonymousClass00C.A0B(r8)
            goto L_0x0071
        L_0x00c2:
            r0 = r8
            goto L_0x0063
        L_0x00c4:
            r0 = r8
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.infra.graphql.BaseMexCallback.A04(X.9jD, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.A01((X.C28981Uw) r4.A01, r2, X.C1900696t.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r1 = X.C1900696t.A00(r6);
        r0.A03.A01((X.C28981Uw) r4.A01, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C201259jD r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C177268dW
            if (r0 == 0) goto L_0x0010
            r1 = r5
            X.8dW r1 = (X.C177268dW) r1
            X.8dV r0 = r1.A00
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A06(r6)
            return r0
        L_0x0010:
            boolean r0 = r5 instanceof X.C177258dV
            if (r0 == 0) goto L_0x001e
            r1 = r5
            X.8dV r1 = (X.C177258dV) r1
            X.02t r0 = r1.A01
            boolean r0 = X.C90464aC.A1Y(r6, r0)
            return r0
        L_0x001e:
            r4 = r5
            X.B7F r4 = (X.B7F) r4
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x004a;
                case 2: goto L_0x006f;
                default: goto L_0x0026;
            }
        L_0x0026:
            A01(r4, r6)
            java.lang.Object r0 = r4.A02
            X.1Zg r0 = (X.C30111Zg) r0
            X.1ZX r3 = r0.A02
            X.2oe r2 = X.C51952oe.UNFOLLOW
        L_0x0031:
            java.lang.Object r1 = r4.A01
            X.1Uw r1 = (X.C28981Uw) r1
            X.Abe r0 = X.C1900696t.A00(r6)
            r3.A01(r1, r2, r0)
        L_0x003c:
            r0 = 0
            return r0
        L_0x003e:
            A01(r4, r6)
            java.lang.Object r0 = r4.A02
            X.1Zc r0 = (X.C30071Zc) r0
            X.1ZT r0 = r0.A01
            X.2oe r3 = X.C51952oe.MUTE
            goto L_0x0061
        L_0x004a:
            java.lang.Object r1 = r4.A00
            X.9UD r1 = (X.AnonymousClass9UD) r1
            X.B2T r0 = r6.A00()
            int r0 = r0.B9n()
            r1.A00(r0)
            java.lang.Object r0 = r4.A02
            X.1Zc r0 = (X.C30071Zc) r0
            X.1ZT r0 = r0.A01
            X.2oe r3 = X.C51952oe.UNMUTE
        L_0x0061:
            java.lang.Object r2 = r4.A01
            X.1Uw r2 = (X.C28981Uw) r2
            X.Abe r1 = X.C1900696t.A00(r6)
            X.1ZX r0 = r0.A03
            r0.A01(r2, r3, r1)
            goto L_0x003c
        L_0x006f:
            A01(r4, r6)
            java.lang.Object r0 = r4.A02
            X.1Zg r0 = (X.C30111Zg) r0
            X.1ZX r3 = r0.A02
            X.2oe r2 = X.C51952oe.FOLLOW
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.infra.graphql.BaseMexCallback.A06(X.9jD):boolean");
    }

    public static void A01(B7F b7f, C201259jD r3) {
        ((AnonymousClass9UD) b7f.A00).A00(r3.A00().B9n());
    }
}
