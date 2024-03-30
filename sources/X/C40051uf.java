package X;

import com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
public class C40051uf extends AnonymousClass04R {
    public int A00;
    public long A01;
    public C70013eS A02;
    public C65073Qp A03;
    public AnonymousClass141 A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public final AnonymousClass08S A0C;
    public final C001700s A0D;
    public final C001700s A0E = C36431kI.A0S();
    public final C001700s A0F;
    public final C001700s A0G;
    public final C001700s A0H;
    public final C001700s A0I;
    public final C001700s A0J;
    public final C19700wN A0K;
    public final C57002xV A0L;
    public final AnonymousClass1LV A0M;
    public final C70003eR A0N;
    public final AnonymousClass343 A0O;
    public final GetGroupProfilePicturesProtocolHelper A0P;
    public final MemberSuggestedGroupsManager A0Q;
    public final C81353ws A0R;
    public final AnonymousClass16D A0S;
    public final AnonymousClass171 A0T;
    public final C220412q A0U;
    public final C24381Cf A0V;
    public final C20310xM A0W;
    public final AnonymousClass17X A0X;
    public final C24541Cv A0Y;
    public final C29541Xa A0Z;
    public final C20810yC A0a;
    public final GetSubgroupsManager A0b;
    public final C20350xQ A0c;
    public final C20510xg A0d;
    public final GetGroupInfoProtocolHelper A0e;
    public final C31681cD A0f;
    public final AnonymousClass1EL A0g;
    public final AnonymousClass147 A0h;
    public final AnonymousClass1C4 A0i;
    public final AnonymousClass1LY A0j;
    public final AnonymousClass1O8 A0k;
    public final SetGroupDescriptionProtocolHelper A0l;
    public final AnonymousClass1A1 A0m;
    public final C34831hi A0n;
    public final C34831hi A0o;
    public final C34831hi A0p;
    public final C34831hi A0q;
    public final C34831hi A0r;
    public final C34831hi A0s;
    public final C19930wk A0t;
    public final C28201Rs A0u;
    public final C28201Rs A0v;
    public final C28201Rs A0w;
    public final C28201Rs A0x;
    public final C19770wU A0y;
    public final List A0z;
    public final List A10;
    public final Set A11;
    public final AtomicBoolean A12;
    public final AnonymousClass00S A13;
    public final AnonymousClass00S A14;
    public final C006302t A15;
    public final AnonymousClass040 A16;
    public final AnonymousClass3N0 A17;
    public final C586530n A18;
    public final C81553xC A19;
    public final AnonymousClass3BL A1A;
    public final C19970wo A1B;
    public final AnonymousClass191 A1C;
    public final AnonymousClass16J A1D;
    public final C26791Ln A1E;
    public final List A1F;

    public static void A02(C40051uf r2) {
        List list = r2.A1F;
        list.clear();
        list.addAll(r2.A10);
        list.addAll(r2.A0z);
        r2.A0p.A0C(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C40051uf r7) {
        /*
            X.1LV r5 = r7.A0M
            X.147 r2 = r7.A0h
            r6 = 0
            X.3QK r0 = X.C36421kH.A0L(r5, r2)
            if (r0 == 0) goto L_0x006e
            com.whatsapp.jid.GroupJid r3 = r0.A02
        L_0x000d:
            X.17X r1 = r7.A0X
            boolean r0 = r1.A0D(r2)
            if (r0 != 0) goto L_0x0023
            if (r3 == 0) goto L_0x006c
            boolean r0 = r1.A0C(r3)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1.A0D(r2)
            if (r0 != 0) goto L_0x006c
        L_0x0023:
            r4 = 1
        L_0x0024:
            boolean r3 = r1.A0D(r2)
            X.AnonymousClass00C.A0D(r2, r6)
            X.16D r0 = r5.A01
            X.141 r1 = r0.A09(r2)
            X.1EM r0 = r5.A0B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0060
            X.17X r0 = r5.A05
            boolean r0 = r0.A0D(r2)
            if (r0 != 0) goto L_0x0051
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x0051
        L_0x0047:
            X.0yC r1 = r5.A06
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0060
        L_0x0051:
            X.1EL r1 = r5.A0A
            X.16D r0 = r1.A00
            X.141 r0 = r0.A0D(r2)
            boolean r0 = r1.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            X.1hi r1 = r7.A0n
            X.3It r0 = new X.3It
            r0.<init>(r3, r4, r2)
            r1.A0C(r0)
            return
        L_0x006c:
            r4 = 0
            goto L_0x0024
        L_0x006e:
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40051uf.A03(X.1uf):void");
    }

    public static void A04(C40051uf r2) {
        C81323wp.A00(r2.A0t, r2, 44);
    }

    public static void A05(C40051uf r3, AnonymousClass3T1 r4, long j) {
        Set<AnonymousClass3QK> A1g;
        if (r4 instanceof AnonymousClass2cS) {
            AnonymousClass2cS r42 = (AnonymousClass2cS) r4;
            if (r42.A00 == 88 && r42.A0I > j) {
                A1g = r42.A03;
            } else {
                return;
            }
        } else if (r4 instanceof C181608nk) {
            C181708nu r43 = (C181708nu) r4;
            if (r43.A0I > j) {
                A1g = r43.A1g();
            } else {
                return;
            }
        } else {
            return;
        }
        if (A1g != null) {
            for (AnonymousClass3QK r0 : A1g) {
                r3.A11.add(r0.A02);
            }
        }
    }

    private void A06(AnonymousClass11F r2, Object obj, List list, int i) {
        if (this.A0N.BvY(i, obj) && this.A02.BvY(i, obj)) {
            list.add(new AnonymousClass3GG(r2, obj, i));
        }
    }

    public void A0R() {
        Object value;
        List A0b2;
        AnonymousClass3BL r5 = this.A1A;
        C586530n r4 = this.A18;
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass05L r3 = r5.A0H;
        do {
            value = r3.getValue();
            A0b2 = C007103b.A0b((Iterable) value, r4);
            if (A0b2.isEmpty()) {
                r5.A03.unregisterObserver(r5.A02);
                r5.A0B.unregisterObserver(r5.A0A);
                r5.A05.unregisterObserver(r5.A04);
                r5.A07.A01(r5.A06);
                r5.A09.unregisterObserver(r5.A08);
            }
        } while (!r3.B3B(value, A0b2));
        this.A1D.unregisterObserver(this.A1C);
        this.A1E.unregisterObserver(this.A17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r2.intValue() <= 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r0.intValue() <= 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0195, code lost:
        if (r5.BvY(11, r6) == false) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C40051uf r14) {
        /*
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.List r0 = r14.A10
            java.util.ArrayList r7 = X.C36441kJ.A15(r0)
            java.util.List r0 = r14.A0z
            java.util.ArrayList r13 = X.C36441kJ.A15(r0)
            X.3xC r0 = r14.A19
            java.util.Collections.sort(r7, r0)
            X.147 r6 = r14.A0h
            r0 = 1
            r14.A06(r6, r6, r8, r0)
            X.0yC r3 = r14.A0a
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.Integer r0 = r14.A05
            if (r0 == 0) goto L_0x0054
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0054
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 != 0) goto L_0x0054
            r5 = 18
            java.lang.Integer r0 = r14.A05
            int r4 = r0.intValue()
            X.02t r2 = r14.A15
            X.17X r0 = r14.A0X
            boolean r0 = r0.A0D(r6)
            if (r0 == 0) goto L_0x017c
            X.2nP r0 = X.C51182nP.ADMIN
        L_0x004b:
            X.3JZ r1 = new X.3JZ
            r1.<init>(r0, r6, r2, r4)
            r0 = 0
            r14.A06(r0, r1, r8, r5)
        L_0x0054:
            java.lang.Integer r2 = r14.A06
            r1 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0061
            int r0 = r2.intValue()
            r10 = 1
            if (r0 > 0) goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            java.lang.Integer r0 = r14.A05
            if (r0 == 0) goto L_0x006d
            int r0 = r0.intValue()
            r4 = 1
            if (r0 > 0) goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0179
            int r0 = r2.intValue()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r14.A0A
            if (r0 != 0) goto L_0x0179
            r0 = 5562(0x15ba, float:7.794E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0179
        L_0x0082:
            r5 = 0
            if (r1 == 0) goto L_0x00a0
            java.util.concurrent.atomic.AtomicBoolean r1 = r14.A12
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x009b
            r1.set(r9)
            X.1LY r2 = r14.A0j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "community_events"
            r2.A00(r0, r1)
        L_0x009b:
            r0 = 21
            r14.A06(r5, r5, r8, r0)
        L_0x00a0:
            if (r10 != 0) goto L_0x00a4
            if (r4 == 0) goto L_0x00bc
        L_0x00a4:
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x00bc
            r4 = 20
            java.lang.Integer r3 = r14.A06
            java.lang.Integer r2 = r14.A05
            X.02t r1 = r14.A15
            X.3Ja r0 = new X.3Ja
            r0.<init>(r6, r3, r2, r1)
            r14.A06(r5, r0, r8, r4)
        L_0x00bc:
            X.17X r0 = r14.A0X
            boolean r0 = r0.A0D(r6)
            if (r0 == 0) goto L_0x00c9
            r0 = 14
            r14.A06(r6, r6, r8, r0)
        L_0x00c9:
            r0 = 15
            r14.A06(r6, r6, r8, r0)
            X.3eR r5 = r14.A0N
            X.3QV r4 = r5.A00
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0104
            r0 = 1
            X.1vp r3 = new X.1vp
            r3.<init>(r14, r0)
            java.util.Iterator r2 = r7.iterator()
        L_0x00e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x00e0
        L_0x00f4:
            X.3QK r1 = (X.AnonymousClass3QK) r1
            if (r1 == 0) goto L_0x0104
            r3 = 3
            com.whatsapp.jid.GroupJid r2 = r1.A02
            r1 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r2, r1)
            r14.A06(r2, r0, r8, r3)
        L_0x0104:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0262
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0180
            java.util.Iterator r12 = r7.iterator()
            r10 = 0
            r11 = 0
        L_0x0114:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r9 = r12.next()
            X.3QK r9 = (X.AnonymousClass3QK) r9
            boolean r0 = r4.A06
            r3 = 3
            if (r0 != 0) goto L_0x012a
            int r0 = r9.A00
            if (r0 != r3) goto L_0x012a
            goto L_0x0114
        L_0x012a:
            if (r10 != 0) goto L_0x0144
            boolean r10 = r4.A0E
            r0 = 2131892112(0x7f121790, float:1.9418963E38)
            if (r10 == 0) goto L_0x0136
            r0 = 2131892111(0x7f12178f, float:1.9418961E38)
        L_0x0136:
            r2 = 0
            r1 = 2
            if (r10 == 0) goto L_0x013c
            r1 = 13
        L_0x013c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A06(r2, r0, r8, r1)
            r10 = 1
        L_0x0144:
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x016a
            X.12q r1 = r14.A0U
            com.whatsapp.jid.GroupJid r0 = r9.A02
            boolean r0 = r1.A0N(r0)
            if (r0 == 0) goto L_0x016a
            if (r11 != 0) goto L_0x0114
            r3 = 19
            boolean r1 = r14.A09
            X.00S r0 = r14.A14
            X.3I1 r2 = new X.3I1
            r2.<init>(r0, r1)
            r1 = 0
            X.3GG r0 = new X.3GG
            r0.<init>(r1, r2, r3)
            r8.add(r0)
            r11 = 1
            goto L_0x0114
        L_0x016a:
            com.whatsapp.jid.GroupJid r2 = r9.A02
            r1 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r2, r1)
            r14.A06(r2, r0, r8, r3)
            goto L_0x0114
        L_0x0176:
            r1 = 0
            goto L_0x00f4
        L_0x0179:
            r1 = 0
            goto L_0x0082
        L_0x017c:
            X.2nP r0 = X.C51182nP.MEMBER
            goto L_0x004b
        L_0x0180:
            X.1hi r0 = r14.A0n
            java.lang.Object r0 = r0.A04()
            X.3It r0 = (X.C63103It) r0
            boolean r0 = r0.A00
            r11 = 11
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0197
            boolean r0 = r5.BvY(r11, r6)
            r10 = 1
            if (r0 != 0) goto L_0x0198
        L_0x0197:
            r10 = 0
        L_0x0198:
            r2 = 0
            if (r10 != 0) goto L_0x01a1
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0226
        L_0x01a1:
            boolean r5 = r4.A0E
            r0 = 2131891655(0x7f1215c7, float:1.9418036E38)
            r1 = 2
            if (r5 == 0) goto L_0x01ae
            r0 = 2131891654(0x7f1215c6, float:1.9418034E38)
            r1 = 13
        L_0x01ae:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A06(r2, r0, r8, r1)
            if (r10 == 0) goto L_0x01ba
            r14.A06(r6, r6, r8, r11)
        L_0x01ba:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0226
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Iterator r12 = r13.iterator()
        L_0x01c8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r10 = r12.next()
            X.3QK r10 = (X.AnonymousClass3QK) r10
            java.util.Set r1 = r14.A11
            com.whatsapp.jid.GroupJid r0 = r10.A02
            boolean r5 = r1.contains(r0)
            java.lang.Integer r1 = r10.A03
            X.3JY r0 = new X.3JY
            r0.<init>(r10, r6, r1, r5)
            r11.add(r0)
            goto L_0x01c8
        L_0x01e7:
            int r1 = r14.A00
            int r0 = r11.size()
            int r10 = java.lang.Math.min(r1, r0)
            r0 = -1
            if (r10 != r0) goto L_0x01f8
            int r10 = r11.size()
        L_0x01f8:
            X.3ws r0 = r14.A0R
            java.util.Collections.sort(r11, r0)
        L_0x01fd:
            if (r9 >= r10) goto L_0x0210
            java.lang.Object r5 = r11.get(r9)
            X.3JY r5 = (X.AnonymousClass3JY) r5
            r1 = 4
            X.3QK r0 = r5.A00
            com.whatsapp.jid.GroupJid r0 = r0.A02
            r14.A06(r0, r5, r8, r1)
            int r9 = r9 + 1
            goto L_0x01fd
        L_0x0210:
            int r0 = r11.size()
            if (r0 <= r10) goto L_0x0226
            r9 = 5
            int r5 = r11.size()
            int r5 = r5 - r10
            X.00S r1 = r14.A13
            X.3I0 r0 = new X.3I0
            r0.<init>(r1, r5)
            r14.A06(r2, r0, r8, r9)
        L_0x0226:
            int r1 = r7.size()
            r0 = 2
            if (r1 > r0) goto L_0x0262
            r1 = 2
            X.1vp r0 = new X.1vp
            r0.<init>(r14, r1)
            boolean r0 = X.C007103b.A0k(r7, r0)
            if (r0 == 0) goto L_0x0262
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0262
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0262
            int r0 = r7.size()
            if (r0 != r3) goto L_0x0255
            r1 = 13
            r0 = 2131889103(0x7f120bcf, float:1.941286E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A06(r2, r0, r8, r1)
        L_0x0255:
            r1 = 17
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A06(r2, r0, r8, r1)
        L_0x0262:
            r0 = 16
            r14.A06(r6, r6, r8, r0)
            r0 = 10
            r14.A06(r6, r6, r8, r0)
            X.1hi r2 = r14.A0o
            int r1 = r7.size()
            int r0 = r13.size()
            int r1 = r1 + r0
            X.C36341k9.A17(r2, r1)
            X.1hi r0 = r14.A0s
            r0.A0C(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40051uf.A01(X.1uf):void");
    }

    public C40051uf(C19700wN r27, C57002xV r28, C57012xW r29, AnonymousClass1LV r30, C70003eR r31, AnonymousClass343 r32, GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass16D r35, AnonymousClass171 r36, C19970wo r37, C220412q r38, C24381Cf r39, C20310xM r40, AnonymousClass17X r41, C24541Cv r42, AnonymousClass16J r43, C29541Xa r44, C20810yC r45, GetSubgroupsManager getSubgroupsManager, C20350xQ r47, C20510xg r48, C26791Ln r49, GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C31681cD r51, AnonymousClass1EL r52, AnonymousClass147 r53, AnonymousClass1C4 r54, AnonymousClass1LY r55, AnonymousClass1O8 r56, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, AnonymousClass1A1 r58, C19770wU r59, AnonymousClass040 r60) {
        C001700s A0Z2;
        Object value;
        ArrayList A0T2;
        C34831hi A0s2 = C36441kJ.A0s(false);
        this.A0q = A0s2;
        C34831hi A0s3 = C36441kJ.A0s(false);
        this.A0r = A0s3;
        this.A0D = C36431kI.A0S();
        this.A0F = C36431kI.A0S();
        AnonymousClass08S A0Y2 = C36441kJ.A0Y();
        this.A0C = A0Y2;
        this.A0I = C36431kI.A0S();
        this.A0J = C36431kI.A0S();
        this.A0s = C36441kJ.A0s(AnonymousClass001.A0I());
        this.A0p = C36441kJ.A0s(AnonymousClass001.A0I());
        this.A0o = C36441kJ.A0s(0);
        this.A0x = C36441kJ.A0t();
        this.A0w = C36441kJ.A0t();
        this.A0v = C36441kJ.A0t();
        this.A0H = C36431kI.A0S();
        this.A0u = new C28201Rs((Object) null);
        this.A0n = C36441kJ.A0s(new C63103It(false, false, false));
        this.A0A = true;
        this.A12 = new AtomicBoolean(true);
        this.A14 = new AnonymousClass2A6(this, 5);
        this.A15 = new C40611vp(this, 3);
        this.A13 = new AnonymousClass2A6(this, 4);
        this.A1F = new CopyOnWriteArrayList();
        this.A10 = AnonymousClass001.A0I();
        this.A0z = AnonymousClass001.A0I();
        this.A11 = C36441kJ.A16();
        this.A05 = null;
        this.A06 = null;
        this.A09 = false;
        this.A00 = -1;
        C90394a5 A002 = C90394a5.A00(this, 8);
        this.A1C = A002;
        AnonymousClass3N0 r2 = new AnonymousClass3N0(this);
        this.A17 = r2;
        C586530n r1 = new C586530n(this);
        this.A18 = r1;
        this.A0R = new C81353ws();
        this.A1B = r37;
        this.A0a = r45;
        this.A0K = r27;
        C19770wU r25 = r59;
        this.A0y = r25;
        C220412q r11 = r38;
        this.A0U = r11;
        this.A0j = r55;
        this.A0i = r54;
        AnonymousClass16D r12 = r35;
        this.A0S = r12;
        AnonymousClass040 r13 = r60;
        this.A16 = r13;
        this.A0T = r36;
        this.A0f = r51;
        this.A0W = r40;
        this.A0m = r58;
        this.A0c = r47;
        this.A0d = r48;
        AnonymousClass16J r10 = r43;
        this.A1D = r10;
        C26791Ln r9 = r49;
        this.A1E = r9;
        this.A0g = r52;
        this.A0Z = r44;
        this.A0b = getSubgroupsManager;
        this.A0k = r56;
        this.A0M = r30;
        this.A0V = r39;
        this.A0X = r41;
        this.A0O = r32;
        this.A0Q = memberSuggestedGroupsManager;
        this.A0e = getGroupInfoProtocolHelper;
        this.A0l = setGroupDescriptionProtocolHelper;
        this.A0L = r28;
        this.A0P = getGroupProfilePicturesProtocolHelper;
        C18800tq r0 = r29.A00.A01;
        AnonymousClass16D A0R2 = C36341k9.A0R(r0);
        AnonymousClass1EL A0d2 = C36381kD.A0d(r0);
        AnonymousClass1LV A0U2 = C36361kB.A0U(r0);
        C005602m A003 = C25141Fd.A00();
        AnonymousClass147 r8 = r53;
        AnonymousClass3BL r132 = new AnonymousClass3BL(A0U2, A0R2, C36351kA.A0S(r0), C36371kC.A0Y(r0), C36381kD.A0c(r0), C36371kC.A0c(r0), C36431kI.A0f(r0), A0d2, r8, A003, r13);
        this.A1A = r132;
        this.A0N = r31;
        this.A0h = r8;
        this.A0Y = r42;
        AnonymousClass141 A082 = r12.A08(r8);
        this.A04 = A082;
        if (A082 == null) {
            A0Z2 = C36431kI.A0S();
        } else {
            A0Z2 = C36441kJ.A0Z(A082);
        }
        this.A0G = A0Z2;
        AnonymousClass05L r14 = r132.A0H;
        do {
            value = r14.getValue();
            List list = (List) value;
            A0T2 = C007103b.A0T(r1, list);
            if (list.isEmpty()) {
                r132.A03.registerObserver(r132.A02);
                r132.A0B.registerObserver(r132.A0A);
                r132.A05.registerObserver(r132.A04);
                r132.A07.A00(r132.A06);
                r132.A09.registerObserver(r132.A08);
            }
        } while (!r14.B3B(value, A0T2));
        r10.registerObserver(A002);
        r9.registerObserver(r2);
        C36321k7.A1K(this, "CommunitySubgroupsViewModel/init/Creating serialExecutor: ", AnonymousClass000.A0u());
        this.A0t = C36411kG.A0r(r25);
        this.A19 = new C81553xC(r11);
        C53822rw.A02(A0s3, A0Y2, this, 11);
        C53822rw.A02(A0s2, A0Y2, this, 11);
    }
}
