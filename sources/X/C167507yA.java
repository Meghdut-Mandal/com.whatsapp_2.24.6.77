package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7yA  reason: invalid class name and case insensitive filesystem */
public final class C167507yA extends AnonymousClass08X implements C23020B0q {
    public C207109uZ A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final C001700s A06 = C36431kI.A0S();
    public final C001700s A07 = C36441kJ.A0t();
    public final C001700s A08 = C36431kI.A0S();
    public final C001700s A09 = C36431kI.A0S();
    public final C001700s A0A = C36441kJ.A0t();
    public final C001700s A0B = C36431kI.A0S();
    public final C001700s A0C = C36431kI.A0S();
    public final C19730wQ A0D;
    public final C195419Uf A0E;
    public final AnonymousClass1KK A0F;
    public final AnonymousClass1KL A0G;
    public final AnonymousClass9UA A0H;
    public final C29461Ws A0I;
    public final C198849eI A0J;
    public final AnonymousClass9Y1 A0K;
    public final C202279lS A0L;
    public final AnonymousClass1KP A0M;
    public final C131496Pg A0N;
    public final UserJid A0O;
    public final C61223Ba A0P;
    public final AnonymousClass3L6 A0Q;
    public final C28201Rs A0R = C36441kJ.A0t();
    public final C19770wU A0S;
    public final C19460v5 A0T;
    public final C63553Km A0U;
    public final AnonymousClass9ZJ A0V;
    public final C19970wo A0W;

    public final void A0S(UserJid userJid) {
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid, 0);
        if (this.A0M.A03(this.A00, userJid)) {
            C202279lS r6 = this.A0L;
            int i = this.A05;
            int A002 = C36371kC.A00(r6.A08.A0M(userJid) ? 1 : 0) * 4;
            C29461Ws r5 = r6.A0B;
            synchronized (r5) {
                C198089ct r3 = (C198089ct) r5.A01.get(userJid);
                if (r3 != null) {
                    r3.A00 = new AnonymousClass9VS(true, (String) null);
                    List list = r3.A03;
                    int size = list.size();
                    if (size > A002) {
                        for (int i2 = A002; i2 < size; i2++) {
                            list.remove(C36431kI.A07(list));
                        }
                    }
                }
            }
            ArrayList A082 = r5.A08(userJid);
            if (!A082.isEmpty()) {
                r6.A04.A0C(new AnonymousClass8W9(new C193069Js(A082, true, true), userJid));
                A002 *= 2;
            }
            r6.A0G.A01(userJid, AnonymousClass96V.A00(), new C22496AnZ(r6, userJid2, i, A002, true));
            return;
        }
        this.A0I.A0F(userJid, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C167507yA(android.app.Application r19, X.C19460v5 r20, X.C19730wQ r21, X.C195419Uf r22, X.C63553Km r23, X.AnonymousClass1KK r24, X.AnonymousClass1KL r25, X.AnonymousClass9ZJ r26, X.AnonymousClass9UA r27, X.C29461Ws r28, X.C198849eI r29, X.AnonymousClass9Y1 r30, X.C202279lS r31, X.AnonymousClass1KP r32, X.C131496Pg r33, X.C19970wo r34, com.whatsapp.jid.UserJid r35, X.C61223Ba r36, X.AnonymousClass3L6 r37, X.C19770wU r38) {
        /*
            r18 = this;
            r7 = r31
            r5 = r34
            r3 = r37
            r15 = r21
            r17 = r19
            r0 = r17
            X.C36321k7.A1B(r5, r15, r0, r3, r7)
            r6 = r33
            r10 = r28
            r8 = r30
            X.C36321k7.A13(r10, r6, r8)
            r0 = 9
            r9 = r29
            X.AnonymousClass00C.A0D(r9, r0)
            r12 = r24
            r16 = r20
            r0 = r16
            X.C36341k9.A1G(r12, r0)
            r4 = r36
            r14 = r22
            X.C36361kB.A1L(r14, r4)
            r0 = 16
            r11 = r25
            r13 = r23
            X.C165607th.A1J(r11, r0, r13)
            r0 = 20
            r2 = r38
            X.AnonymousClass00C.A0D(r2, r0)
            r1 = r18
            r0 = r17
            r1.<init>(r0)
            r1.A0W = r5
            r1.A0D = r15
            r1.A0Q = r3
            r1.A0L = r7
            r1.A0I = r10
            r1.A0N = r6
            r1.A0K = r8
            r1.A0J = r9
            r0 = r32
            r1.A0M = r0
            r1.A0F = r12
            r0 = r16
            r1.A0T = r0
            r0 = r35
            r1.A0O = r0
            r1.A0E = r14
            r1.A0P = r4
            r1.A0G = r11
            r1.A0U = r13
            r0 = r26
            r1.A0V = r0
            r0 = r27
            r1.A0H = r0
            r1.A0S = r2
            X.00s r0 = X.C36431kI.A0S()
            r1.A09 = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r1.A0R = r0
            X.00s r0 = X.C36431kI.A0S()
            r1.A0B = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r1.A07 = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r1.A0A = r0
            X.00s r0 = X.C36431kI.A0S()
            r1.A08 = r0
            X.00s r0 = X.C36431kI.A0S()
            r1.A06 = r0
            X.00s r0 = X.C36431kI.A0S()
            r1.A0C = r0
            android.content.res.Resources r2 = r17.getResources()
            r0 = 2131167977(0x7f070ae9, float:1.7950243E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.A05 = r0
            android.content.res.Resources r2 = r17.getResources()
            r0 = 2131165696(0x7f070200, float:1.7945616E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167507yA.<init>(android.app.Application, X.0v5, X.0wQ, X.9Uf, X.3Km, X.1KK, X.1KL, X.9ZJ, X.9UA, X.1Ws, X.9eI, X.9Y1, X.9lS, X.1KP, X.6Pg, X.0wo, com.whatsapp.jid.UserJid, X.3Ba, X.3L6, X.0wU):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVk(X.C207109uZ r12) {
        /*
            r11 = this;
            r11.A00 = r12
            X.00s r1 = r11.A08
            X.1KP r4 = r11.A0M
            com.whatsapp.jid.UserJid r6 = r11.A0O
            boolean r0 = r4.A03(r12, r6)
            X.C36341k9.A18(r1, r0)
            X.9uZ r2 = r11.A00
            X.0yC r1 = r4.A01
            r0 = 1514(0x5ea, float:2.122E-42)
            boolean r1 = r1.A0E(r0)
            java.lang.String r0 = "categories"
            boolean r0 = X.AnonymousClass1KP.A00(r4, r2, r0, r1)
            X.6Pg r3 = r11.A0N
            if (r0 != 0) goto L_0x00df
            r3.A03(r6)
            X.00s r2 = r11.A0B
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
        L_0x002c:
            r2.A0D(r0)
        L_0x002f:
            r5 = 0
            X.AnonymousClass00C.A0D(r6, r5)
            r11.A0S(r6)
            X.9lS r1 = r11.A0L
            int r0 = r11.A05
            r1.A08(r6, r0)
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.AnonymousClass1KP.A00(r4, r12, r0, r1)
            if (r0 == 0) goto L_0x009d
            X.1Rs r0 = r11.A0R
            r0.A0D(r12)
            X.1KL r0 = r11.A0G
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131887703(0x7f120657, float:1.941002E38)
            X.2ft r4 = new X.2ft
            r4.<init>(r1, r0)
            X.9tg r0 = r12.A02
            if (r0 == 0) goto L_0x008a
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x008a
            int r1 = r2.hashCode()
            r0 = -2053263135(0xffffffff859db0e1, float:-1.4829184E-35)
            if (r1 == r0) goto L_0x00c0
            r0 = -129639349(0xfffffffff845dc4b, float:-1.6052352E34)
            if (r1 == r0) goto L_0x00b4
            r0 = 98382(0x1804e, float:1.37863E-40)
            if (r1 != r0) goto L_0x00cc
            java.lang.String r0 = "cep"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r1 = 2131887702(0x7f120656, float:1.9410019E38)
        L_0x0083:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.2ft r4 = new X.2ft
            r4.<init>(r0, r1)
        L_0x008a:
            X.00s r3 = r11.A0A
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r2[r5] = r4
            r1 = 2131895258(0x7f1223da, float:1.9425344E38)
        L_0x0095:
            X.2ft r0 = new X.2ft
            r0.<init>(r2, r1)
            r3.A0D(r0)
        L_0x009d:
            X.3Km r0 = r11.A0U
            java.lang.String r1 = r0.A00(r12)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            X.00s r0 = r11.A06
            r0.A0D(r1)
        L_0x00b3:
            return
        L_0x00b4:
            java.lang.String r0 = "zip_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r1 = 2131887705(0x7f120659, float:1.9410025E38)
            goto L_0x0083
        L_0x00c0:
            java.lang.String r0 = "postal_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r1 = 2131887704(0x7f120658, float:1.9410023E38)
            goto L_0x0083
        L_0x00cc:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131887703(0x7f120657, float:1.941002E38)
            X.2ft r4 = new X.2ft
            r4.<init>(r1, r0)
            goto L_0x008a
        L_0x00d7:
            X.00s r3 = r11.A0A
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 2131895259(0x7f1223db, float:1.9425346E38)
            goto L_0x0095
        L_0x00df:
            java.lang.String r1 = "catalog_category_dummy_root_id"
            boolean r0 = r3.A04(r6, r1)
            if (r0 == 0) goto L_0x00ef
            X.00s r2 = r11.A0B
            java.util.ArrayList r0 = r3.A01(r6, r1)
            goto L_0x002c
        L_0x00ef:
            java.util.HashSet r8 = X.C36441kJ.A16()
            X.9Y1 r0 = r11.A0K
            java.lang.String r7 = r0.A02
            X.9lS r3 = r11.A0L
            int r9 = r11.A04
            X.AnonymousClass00C.A0B(r7)
            X.6Co r5 = new X.6Co
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 0
            X.7ps r2 = new X.7ps
            r2.<init>(r6, r11, r0)
            r0 = 1
            X.7sS r1 = new X.7sS
            r1.<init>(r2, r3, r0)
            X.9ge r0 = r3.A0D
            r0.A01(r5, r1)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167507yA.BVk(X.9uZ):void");
    }

    public void Bbk(C207109uZ r4) {
        this.A00 = r4;
        C001700s r1 = this.A08;
        AnonymousClass1KP r0 = this.A0M;
        UserJid userJid = this.A0O;
        C36341k9.A18(r1, r0.A03(r4, userJid));
        AnonymousClass00C.A0D(userJid, 0);
        A0S(userJid);
        this.A0L.A08(userJid, this.A05);
    }
}
