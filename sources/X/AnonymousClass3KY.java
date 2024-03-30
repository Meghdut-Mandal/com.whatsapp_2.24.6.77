package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3KY  reason: invalid class name */
public final class AnonymousClass3KY {
    public final C225314u A00;
    public final C61703Dc A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C19600wD A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass171 A06;
    public final C24381Cf A07;
    public final AnonymousClass17X A08;
    public final C20350xQ A09;
    public final C20510xg A0A;
    public final AnonymousClass147 A0B;
    public final AnonymousClass1EM A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 != 2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.UserJid r15, java.lang.Integer r16) {
        /*
            r14 = this;
            r6 = r14
            X.17X r0 = r14.A08
            X.147 r8 = r14.A0B
            r9 = r15
            X.6PM r0 = r0.A03(r8, r15)
            if (r0 == 0) goto L_0x0012
            int r2 = r0.A01
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r5 = 0
            if (r0 == 0) goto L_0x0087
            X.0wQ r0 = r14.A03
            boolean r0 = r0.A0M(r15)
            if (r0 == 0) goto L_0x006f
            X.1EM r0 = r14.A0C
            boolean r0 = r0.A06(r8)
            if (r0 == 0) goto L_0x006f
            r3 = 2131888763(0x7f120a7b, float:1.941217E38)
            X.14u r2 = r14.A00
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x003f
            X.1qm r1 = X.AnonymousClass3LW.A00(r2)
            java.lang.String r0 = r2.getString(r3)
            X.C39001qm.A0A(r1, r0)
            X.C36341k9.A11(r1)
        L_0x003f:
            X.3Dc r0 = r14.A01
            if (r0 == 0) goto L_0x006e
            X.AnonymousClass00C.A0D(r15, r5)
            X.3Eh r1 = r0.A02
            X.0wQ r0 = r1.A00
            boolean r0 = r0.A0M(r15)
            if (r0 == 0) goto L_0x006e
            X.00T r0 = r1.A05
            java.lang.Object r3 = r0.getValue()
            X.3Hq r3 = (X.C62813Hq) r3
            r2 = 1
            X.2PH r1 = X.AnonymousClass2PH.A00(r3)
            java.lang.Integer r0 = X.C36361kB.A0j()
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r3.A01
            r0.Bly(r1)
        L_0x006e:
            return
        L_0x006f:
            X.14u r4 = r14.A00
            r3 = 2131889325(0x7f120cad, float:1.941331E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.171 r1 = r14.A06
            X.16D r0 = r14.A05
            X.141 r0 = r0.A0D(r15)
            X.C36361kB.A1F(r1, r0, r2, r5)
            r4.BO9(r2, r5, r3)
            return
        L_0x0087:
            X.0wD r0 = r14.A04
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x00a3
            X.17Y r2 = r14.A02
            X.14u r0 = r14.A00
            boolean r1 = X.C19600wD.A02(r0)
            r0 = 2131891264(0x7f121440, float:1.9417243E38)
            if (r1 == 0) goto L_0x009f
            r0 = 2131891265(0x7f121441, float:1.9417245E38)
        L_0x009f:
            r2.A06(r0, r5)
            return
        L_0x00a3:
            X.14u r2 = r14.A00
            r1 = 2131892106(0x7f12178a, float:1.941895E38)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r2.Bu2(r1, r0)
            X.0xQ r7 = r14.A09
            X.1Cf r5 = r14.A07
            java.util.List r11 = java.util.Collections.singletonList(r15)
            r12 = 92
            X.2VR r4 = new X.2VR
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.0xg r7 = r14.A0A
            X.005 r1 = r7.A09
            java.lang.Object r0 = r1.get()
            X.1EM r0 = (X.AnonymousClass1EM) r0
            X.147 r8 = r4.A03
            boolean r13 = r0.A06(r8)
            java.util.List r11 = r4.A05
            X.C18740tg.A06(r11)
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupIqResponseUtil/remove-admin/timeout; groupId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; participants="
            X.C36321k7.A1J(r11, r0, r1)
            r9 = 0
        L_0x00ea:
            java.lang.String r10 = "demote"
            X.AcK r6 = X.C21891AcK.create()
            X.C20510xg.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x00f4:
            java.lang.Object r0 = r1.get()
            X.1EM r0 = (X.AnonymousClass1EM) r0
            boolean r5 = r0.A06(r8)
            X.3pO r9 = new X.3pO
            r3 = r4
            r0 = r9
            r1 = r4
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3KY.A01(com.whatsapp.jid.UserJid, java.lang.Integer):void");
    }

    public void A00(UserJid userJid, Integer num) {
        int A012;
        C65693Tc r12;
        if (!A02()) {
            AnonymousClass17X r2 = this.A08;
            AnonymousClass147 r6 = this.A0B;
            if (r2.A04.A05(r6) == 1) {
                A012 = r2.A0B.A07(1655);
            } else {
                A012 = r2.A01(r6) - 1;
            }
            UserJid userJid2 = userJid;
            if (A012 > r2.A07.A0C(r6).A0F().size()) {
                this.A00.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                AnonymousClass2VQ r22 = new AnonymousClass2VQ(this.A07, this, this.A09, r6, userJid2, num, Collections.singletonList(userJid2));
                C20510xg r5 = this.A0A;
                AnonymousClass147 r62 = r22.A03;
                boolean A062 = ((AnonymousClass1EM) r5.A09.get()).A06(r62);
                List list = r22.A05;
                C18740tg.A06(list);
                if (r22.A00) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("GroupIqResponseUtil/add-admin/timeout; groupId=");
                    A0u.append(r62);
                    C36321k7.A1J(list, "; participants=", A0u);
                    r12 = null;
                } else {
                    r12 = new C65693Tc(r22, r5, r22, r22, 1);
                }
                C20510xg.A01(C21891AcK.create(), r5, r62, r12, "promote", list, 91, A062);
                return;
            }
            HashMap A0J = AnonymousClass001.A0J();
            C36341k9.A1K(userJid2, A0J, 419);
            boolean A063 = this.A0C.A06(r6);
            C20350xQ r1 = this.A09;
            int i = 3003;
            if (A063) {
                i = 3019;
            }
            r1.A0T(i, A0J);
        }
    }

    public boolean A02() {
        if (this.A04.A09()) {
            return false;
        }
        AnonymousClass17Y r2 = this.A02;
        boolean A022 = C19600wD.A02(this.A00.getApplicationContext());
        int i = R.string.f12nameremoved;
        if (A022) {
            i = R.string.f12nameremoved;
        }
        r2.A06(i, 0);
        return true;
    }

    public AnonymousClass3KY(C225314u r1, AnonymousClass17Y r2, C19730wQ r3, C61703Dc r4, C19600wD r5, AnonymousClass16D r6, AnonymousClass171 r7, C24381Cf r8, AnonymousClass17X r9, C20350xQ r10, C20510xg r11, AnonymousClass147 r12, AnonymousClass1EM r13) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A0C = r13;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r5;
        this.A00 = r1;
        this.A0B = r12;
        this.A01 = r4;
    }
}
