package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1uw  reason: invalid class name and case insensitive filesystem */
public class C40111uw extends AnonymousClass04R implements B3n {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass141 A02;
    public AnonymousClass147 A03;
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36441kJ.A0Z(false);
    public final C001700s A06 = C36441kJ.A0Z(false);
    public final C001700s A07 = C36441kJ.A0Z(false);
    public final C001700s A08 = C36441kJ.A0Z(false);
    public final C001700s A09 = C36441kJ.A0Z(false);
    public final C001700s A0A = C36441kJ.A0Z(false);
    public final C001700s A0B = C36441kJ.A0Z(false);
    public final C001700s A0C = C36441kJ.A0Z(false);
    public final C001700s A0D = C36441kJ.A0Z(false);
    public final C001700s A0E = C36441kJ.A0Z(false);
    public final C001700s A0F = C36441kJ.A0Z(false);
    public final C001700s A0G = C36441kJ.A0Z(false);
    public final C001700s A0H = C36441kJ.A0Z(false);
    public final C19730wQ A0I;
    public final AnonymousClass16D A0J;
    public final AnonymousClass171 A0K;
    public final C220412q A0L;
    public final C24381Cf A0M;
    public final AnonymousClass1PF A0N;
    public final AnonymousClass17X A0O;
    public final C20810yC A0P;
    public final C20350xQ A0Q;
    public final C20510xg A0R;
    public final C76943ph A0S;
    public final C27561Or A0T;
    public final C87244Oa A0U;
    public final RtaXmppClient A0V;
    public final AnonymousClass1EM A0W;
    public final C28201Rs A0X = new C28201Rs(false);
    public final C28201Rs A0Y = new C28201Rs(false);
    public final C19770wU A0Z;
    public final AnonymousClass17Y A0a;
    public final C19600wD A0b;
    public final C19970wo A0c;
    public final C21010yW A0d;
    public final C589431q A0e;
    public final C87854Qk A0f;
    public final C27541Op A0g;
    public final AnonymousClass19A A0h;
    public final C28201Rs A0i = C36441kJ.A0t();

    public void Bwz(int i, boolean z) {
        String str;
        StringBuilder sb;
        String str2;
        boolean z2;
        String str3;
        String str4;
        C001600r r1;
        boolean z3;
        String str5;
        String str6;
        String str7;
        boolean z4 = z;
        int i2 = i;
        if (i2 == 1) {
            z2 = !z;
            AnonymousClass141 r12 = this.A02;
            if (r12 == null || r12.A13 == z2) {
                str = "EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            C20510xg r9 = this.A0R;
            AnonymousClass147 r4 = this.A03;
            AnonymousClass23D r13 = new AnonymousClass23D(this.A0M, this.A0Q, r4, (String) null, (List) null, 159, true);
            if (z2) {
                str3 = "locked";
            } else {
                str3 = "unlocked";
            }
            C20510xg.A02(r9, r4, r13, r13, str3, (AnonymousClass1AL[]) null, 159);
            sb = AnonymousClass000.A0u();
            str2 = "GroupXmppMethods/set-restrict-mode; restrictModeEnabled=";
        } else if (i2 != 2) {
            if (i2 != 3) {
                AnonymousClass141 r0 = this.A02;
                if (i2 != 4) {
                    if (r0 != null && r0.A0p != z4) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("GroupPermissionsActivity report to admin toggled ");
                        if (z) {
                            str7 = "On";
                        } else {
                            str7 = "Off";
                        }
                        C36321k7.A1a(A0u, str7);
                        if (z) {
                            C36341k9.A19(this.A0D, true);
                            this.A0V.A03(this.A03, this.A0U, true);
                            return;
                        }
                        r1 = this.A0Y;
                        z3 = true;
                    } else {
                        return;
                    }
                } else if (r0 != null && AnonymousClass000.A1O(r0.A04) != z4) {
                    C76543p3 r92 = new C76543p3(this.A0h);
                    AnonymousClass147 r7 = this.A03;
                    if (z) {
                        str6 = "all_member_add";
                    } else {
                        str6 = "admin_add";
                    }
                    r92.A00 = new C61473Ca(this);
                    AnonymousClass19A r8 = r92.A01;
                    String A092 = r8.A09();
                    C203399nx r6 = new C203399nx("member_add_mode", str6, (AnonymousClass1AL[]) null);
                    AnonymousClass1AL[] r5 = new AnonymousClass1AL[4];
                    C36381kD.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092, r5);
                    r5[1] = new AnonymousClass1AL("xmlns", "w:g2");
                    C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r5);
                    r5[3] = new AnonymousClass1AL((Jid) r7, "to");
                    r8.A0E(r92, C36391kE.A0m(r6, r5), A092, 336, 0);
                    AnonymousClass2NX r14 = new AnonymousClass2NX();
                    r14.A00 = Boolean.valueOf(z4);
                    this.A0d.Bly(r14);
                    return;
                } else {
                    return;
                }
            } else {
                AnonymousClass141 r02 = this.A02;
                if (r02 != null && r02.A12 != z4) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("GroupPermissionsActivity require membership approval toggled ");
                    if (z) {
                        str5 = "On";
                    } else {
                        str5 = "Off";
                    }
                    C36321k7.A1a(A0u2, str5);
                    if (z) {
                        this.A0S.A01(this.A03, true);
                        r1 = this.A0B;
                    } else {
                        r1 = this.A0X;
                    }
                    z3 = true;
                } else {
                    return;
                }
            }
            r1.A0C(z3);
            return;
        } else {
            z2 = !z;
            AnonymousClass141 r15 = this.A02;
            if (r15 == null || r15.A0d == z2) {
                str = "SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            C20510xg r93 = this.A0R;
            AnonymousClass147 r42 = this.A03;
            AnonymousClass23D r16 = new AnonymousClass23D(this.A0M, this.A0Q, r42, (String) null, (List) null, 161, true);
            if (z2) {
                str4 = "announcement";
            } else {
                str4 = "not_announcement";
            }
            C20510xg.A02(r93, r42, r16, r16, str4, (AnonymousClass1AL[]) null, 161);
            sb = AnonymousClass000.A0u();
            str2 = "GroupXmppMethods/set-announcements-only; announcementsEnabled=";
        }
        str = C36371kC.A0z(str2, sb, z2);
        Log.i(str);
    }

    public void A0R() {
        this.A0g.A01(this.A0f);
    }

    public void B6K(C225314u r18, List list) {
        int A012;
        C20350xQ r1;
        int i;
        Object obj;
        int i2;
        AnonymousClass17X r5 = this.A0O;
        AnonymousClass147 r14 = this.A03;
        C232317r r6 = r5.A07;
        C20760y7 A072 = r6.A0C(r14).A07();
        HashSet A16 = C36441kJ.A16();
        C225614x it = A072.iterator();
        while (it.hasNext()) {
            AnonymousClass6PM r12 = (AnonymousClass6PM) it.next();
            UserJid userJid = r12.A03;
            if (!(this.A0I.A0M(userJid) || (i2 = r12.A01) == 0 || i2 == 2)) {
                A16.add(userJid);
            }
        }
        List list2 = list;
        ArrayList A15 = C36441kJ.A15(list2);
        A15.removeAll(A16);
        ArrayList A152 = C36441kJ.A15(A16);
        A152.removeAll(list2);
        if (A15.size() != 0 || A152.size() != 0) {
            C225314u r7 = r18;
            if (!this.A0b.A09()) {
                this.A0a.A06(C36421kH.A02(r7), 0);
                return;
            }
            if (r5.A04.A05(r14) == 1) {
                A012 = r5.A0B.A07(1655);
            } else {
                A012 = r5.A01(r14) - 1;
            }
            if (A012 < (r6.A0C(r14).A0F().size() + A15.size()) - A152.size()) {
                if (this.A0W.A06(r14)) {
                    r1 = this.A0Q;
                    i = 3019;
                    obj = Integer.valueOf(A012);
                } else {
                    HashMap A0J2 = AnonymousClass001.A0J();
                    Iterator it2 = A15.iterator();
                    while (it2.hasNext()) {
                        C36341k9.A1K(it2.next(), A0J2, 419);
                    }
                    r1 = this.A0Q;
                    i = 3003;
                    obj = A0J2;
                }
                r1.A0T(i, obj);
                return;
            }
            C36391kE.A1Q(new C50012k3(r7, this.A0a, this.A0J, this.A0K, this.A0c, this.A0Q, this.A0R, r14, A15, A152), this.A0Z);
        }
    }

    public void BUC() {
        C001600r r2;
        boolean z;
        int i;
        int i2 = this.A00;
        if (i2 <= 0 || i2 <= (i = this.A01)) {
            this.A0S.A01(this.A03, false);
            r2 = this.A0B;
            z = false;
        } else {
            r2 = this.A0i;
            z = new C595534j(i, i2);
        }
        r2.A0C(z);
    }

    public void BUF() {
        this.A0S.A01(this.A03, false);
        C36341k9.A19(this.A0B, false);
    }

    public void BeR() {
        C36331k8.A13(this.A0B);
    }

    public void BeT() {
        C36331k8.A13(this.A0B);
    }

    public ArrayList B8L() {
        ArrayList A0I2 = AnonymousClass001.A0I();
        C225614x it = C36381kD.A0R(this.A0O, this.A03).iterator();
        while (it.hasNext()) {
            AnonymousClass6PM r2 = (AnonymousClass6PM) it.next();
            int i = r2.A01;
            if (!(i == 0 || i == 2)) {
                C19730wQ r0 = this.A0I;
                UserJid userJid = r2.A03;
                if (!r0.A0M(userJid)) {
                    A0I2.add(userJid);
                }
            }
        }
        return A0I2;
    }

    public C001600r B8M() {
        return this.A04;
    }

    public C001600r BCs() {
        return this.A05;
    }

    public C001700s BCt() {
        return this.A06;
    }

    public C001600r BCu() {
        return this.A07;
    }

    public C001600r BCv() {
        return this.A08;
    }

    public C001600r BCw() {
        return this.A09;
    }

    public C001600r BCx() {
        return this.A0A;
    }

    public C001700s BCy() {
        return this.A0B;
    }

    public C001700s BCz() {
        return this.A0C;
    }

    public C001600r BD1() {
        return this.A0E;
    }

    public C001600r BD2() {
        return this.A0F;
    }

    public C001700s BD3() {
        return this.A0G;
    }

    public C001600r BD4() {
        return this.A0H;
    }

    public C001600r BGh() {
        return this.A0D;
    }

    public C28201Rs BHW() {
        return this.A0X;
    }

    public C001600r BHX() {
        return this.A0Y;
    }

    public C28201Rs BHY() {
        return this.A0i;
    }

    public void Beq(boolean z) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupPermissionsActivity report to admin dialog result ");
        if (z) {
            str = "off";
        } else {
            str = "On";
        }
        C36321k7.A1a(A0u, str);
        C36341k9.A19(this.A0D, !z);
        if (z) {
            this.A0V.A03(this.A03, this.A0U, false);
        }
    }

    public C40111uw(AnonymousClass2xY r10, AnonymousClass17Y r11, C19730wQ r12, C19600wD r13, AnonymousClass16D r14, AnonymousClass171 r15, C19970wo r16, C220412q r17, C24381Cf r18, AnonymousClass1PF r19, AnonymousClass17X r20, C20810yC r21, C21010yW r22, C20350xQ r23, C27541Op r24, C20510xg r25, AnonymousClass147 r26, AnonymousClass19A r27, C27561Or r28, RtaXmppClient rtaXmppClient, AnonymousClass1EM r30, C19770wU r31) {
        C89584Xc r1 = new C89584Xc(this, 15);
        this.A0f = r1;
        C589431q r7 = new C589431q(this);
        this.A0e = r7;
        this.A0U = new C77503qb(this);
        this.A03 = r26;
        this.A0c = r16;
        this.A0P = r21;
        this.A0a = r11;
        this.A0I = r12;
        this.A0Z = r31;
        this.A0L = r17;
        this.A0d = r22;
        this.A0h = r27;
        this.A0W = r30;
        this.A0K = r15;
        this.A0J = r14;
        this.A0Q = r23;
        this.A0R = r25;
        this.A0T = r28;
        this.A0M = r18;
        this.A0V = rtaXmppClient;
        C27541Op r2 = r24;
        this.A0g = r2;
        this.A0O = r20;
        this.A0b = r13;
        this.A0N = r19;
        C18800tq r0 = r10.A00.A01;
        this.A0S = new C76943ph(C36351kA.A0V(r0), C36341k9.A0V(r0), C36351kA.A0g(r0), r7, C36361kB.A0c(r0));
        r2.A00(r1);
        C80243v5.A01(this.A0Z, this, 42);
    }
}
