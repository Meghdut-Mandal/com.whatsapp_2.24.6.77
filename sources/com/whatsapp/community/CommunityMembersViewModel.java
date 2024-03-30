package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass0W6;
import X.AnonymousClass147;
import X.AnonymousClass16C;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1WR;
import X.AnonymousClass2Ey;
import X.AnonymousClass2Ez;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass4WU;
import X.C000400e;
import X.C001600r;
import X.C005502l;
import X.C007403e;
import X.C008903u;
import X.C023409w;
import X.C07360Xi;
import X.C109325Xd;
import X.C13010j1;
import X.C19580wB;
import X.C19600wD;
import X.C19730wQ;
import X.C203399nx;
import X.C233117z;
import X.C27541Op;
import X.C28391Sm;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C49392j2;
import X.C53002qX;
import X.C587130t;
import X.C592133b;
import X.C62833Hs;
import X.C68563c6;
import X.C80053ui;
import X.C81503x7;
import X.C82183yH;
import X.C86674Lv;
import X.C87854Qk;
import X.C89584Xc;
import com.whatsapp.jid.UserJid;

public final class CommunityMembersViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001600r A03;
    public final AnonymousClass16C A04 = new C68563c6(this);
    public final AnonymousClass1WR A05;
    public final C19730wQ A06;
    public final C28391Sm A07;
    public final C19600wD A08;
    public final AnonymousClass16D A09;
    public final AnonymousClass16I A0A;
    public final AnonymousClass4W3 A0B = AnonymousClass4W3.A00(this, 5);
    public final AnonymousClass17X A0C;
    public final C87854Qk A0D = new C89584Xc(this, 1);
    public final C27541Op A0E;
    public final C81503x7 A0F;
    public final C233117z A0G;
    public final AnonymousClass4WB A0H = new AnonymousClass4WB(this, 3);
    public final AnonymousClass147 A0I;
    public final C005502l A0J;
    public final AnonymousClass05L A0K;
    public final AnonymousClass05L A0L;
    public final AnonymousClass05L A0M;
    public final AnonymousClass05L A0N;
    public final C587130t A0O;
    public final AnonymousClass171 A0P;
    public final AnonymousClass05K A0Q;
    public final AnonymousClass05K A0R;
    public final AnonymousClass05K A0S;
    public final AnonymousClass05K A0T;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:10:0x0045->B:12:0x004b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.community.CommunityMembersViewModel r9, X.C023509x r10, X.C16970qV r11, boolean r12) {
        /*
            boolean r0 = r10 instanceof X.C82773zF
            if (r0 == 0) goto L_0x0091
            r6 = r10
            X.3zF r6 = (X.C82773zF) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r8 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r8) goto L_0x0098
            boolean r12 = r6.Z$0
            java.lang.Object r5 = r6.L$1
            java.lang.Object r9 = r6.L$0
            com.whatsapp.community.CommunityMembersViewModel r9 = (com.whatsapp.community.CommunityMembersViewModel) r9
            X.AnonymousClass0AN.A00(r2)
        L_0x0028:
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.0tV r1 = new X.0tV
            r1.<init>(r5, r0)
            X.4MV r0 = new X.4MV
            r0.<init>(r9, r2, r12)
            X.0ih r0 = X.C15060md.A03(r0, r1)
            java.util.LinkedHashMap r6 = X.C36431kI.A1G()
            X.0hx r2 = new X.0hx
            r2.<init>(r0)
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3Gm r0 = (X.C62523Gm) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r6.put(r0, r1)
            goto L_0x0045
        L_0x0058:
            X.AnonymousClass0AN.A00(r2)
            X.4N5 r0 = X.AnonymousClass4N5.A00
            X.0ih r1 = X.C15060md.A03(r0, r11)
            X.4J1 r0 = new X.4J1
            r0.<init>(r9)
            X.0ih r0 = X.C15060md.A03(r0, r1)
            java.util.List r5 = X.C15060md.A00(r0)
            boolean r0 = X.C36401kF.A1a(r5)
            if (r0 == 0) goto L_0x00c5
            X.1Sm r4 = r9.A07
            X.147 r3 = r9.A0I
            X.02l r2 = r9.A0J
            r6.L$0 = r9
            r6.L$1 = r5
            r6.Z$0 = r12
            r6.label = r8
            X.1Sn r4 = (X.C28401Sn) r4
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r4, r3, r1)
            java.lang.Object r2 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r2 != r7) goto L_0x0028
            return r7
        L_0x0091:
            X.3zF r6 = new X.3zF
            r6.<init>(r9, r10)
            goto L_0x0012
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x009d:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            r0.putAll(r6)
            boolean r0 = r5.B3B(r4, r0)
            if (r0 == 0) goto L_0x00ca
            X.0wQ r0 = r9.A06
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r6.get(r0)
            if (r2 == 0) goto L_0x00c5
            X.05L r1 = r9.A0M
        L_0x00bb:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.B3B(r0, r2)
            if (r0 == 0) goto L_0x00bb
        L_0x00c5:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00c8:
            X.05L r5 = r9.A0K
        L_0x00ca:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r0)
        L_0x00d9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009d
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r6.get(r0)
            if (r0 != 0) goto L_0x00d9
            X.C36411kG.A1T(r3, r1)
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersViewModel.A01(com.whatsapp.community.CommunityMembersViewModel, X.09x, X.0qV, boolean):java.lang.Object");
    }

    public static final void A02(CommunityMembersViewModel communityMembersViewModel, UserJid userJid) {
        AnonymousClass05L r2 = communityMembersViewModel.A0N;
        do {
        } while (!r2.B3B(r2.getValue(), AnonymousClass2Ez.A00));
        C587130t r22 = communityMembersViewModel.A0O;
        AnonymousClass147 r1 = communityMembersViewModel.A0I;
        C86674Lv r4 = new C86674Lv(communityMembersViewModel, userJid);
        AnonymousClass19A r8 = r22.A00;
        String A092 = r8.A09();
        C80053ui r3 = new C80053ui(r1, A092, C36371kC.A11(userJid));
        C49392j2 r5 = new C49392j2(r22, 0);
        C49392j2 r6 = new C49392j2(r22, 1);
        C203399nx r10 = ((C592133b) r3.A03.getValue()).A00;
        AnonymousClass00C.A08(r10);
        r8.A0E(new AnonymousClass4WU(r3, r4, r5, r6, 1), r10, A092, 347, 32000);
    }

    public void A0R() {
        AnonymousClass1WR r0 = this.A05;
        ((C19580wB) r0.A06.get()).unregisterObserver(this.A04);
        this.A0A.unregisterObserver(this.A0B);
        this.A0G.unregisterObserver(this.A0H);
        this.A0E.A01(this.A0D);
    }

    public CommunityMembersViewModel(AnonymousClass1WR r7, C19730wQ r8, C28391Sm r9, C587130t r10, C19600wD r11, AnonymousClass16D r12, AnonymousClass16I r13, AnonymousClass171 r14, AnonymousClass17X r15, C27541Op r16, C233117z r17, AnonymousClass147 r18, C005502l r19) {
        C36321k7.A1B(r7, r8, r14, r12, r13);
        C27541Op r2 = r16;
        C005502l r0 = r19;
        C36321k7.A1C(r9, r2, r15, r0, r11);
        C233117z r1 = r17;
        C36341k9.A1G(r1, r10);
        this.A05 = r7;
        this.A06 = r8;
        this.A0P = r14;
        this.A09 = r12;
        this.A0A = r13;
        this.A07 = r9;
        this.A0E = r2;
        this.A0C = r15;
        this.A0J = r0;
        this.A08 = r11;
        this.A0G = r1;
        this.A0O = r10;
        AnonymousClass147 r110 = r18;
        this.A0I = r110;
        this.A0F = new C81503x7(r8, r14);
        AnonymousClass05N r111 = new AnonymousClass05N(new C62833Hs(r15.A0D(r110) ^ true ? 1 : 0, (Integer) null));
        this.A0L = r111;
        C13010j1 r02 = new C13010j1((C007403e) null, r111);
        this.A0R = r02;
        C008903u r4 = C008903u.A00;
        this.A01 = C53002qX.A00(r4, r02);
        AnonymousClass05N A002 = AnonymousClass05E.A00(C000400e.A0D());
        this.A0K = A002;
        C82183yH r3 = new C82183yH(this, A002);
        C13010j1 A012 = C07360Xi.A01(C023409w.A00, C109325Xd.A00(this), r3, AnonymousClass0W6.A00);
        this.A0Q = A012;
        this.A00 = C53002qX.A00(r4, A012);
        AnonymousClass05N A003 = AnonymousClass05E.A00((Object) null);
        this.A0M = A003;
        C13010j1 r03 = new C13010j1((C007403e) null, A003);
        this.A0S = r03;
        this.A02 = C53002qX.A00(r4, r03);
        AnonymousClass05N A004 = AnonymousClass05E.A00(AnonymousClass2Ey.A00);
        this.A0N = A004;
        C13010j1 r04 = new C13010j1((C007403e) null, A004);
        this.A0T = r04;
        this.A03 = C53002qX.A00(r4, r04);
    }
}
