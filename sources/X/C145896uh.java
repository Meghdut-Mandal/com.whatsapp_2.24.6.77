package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6uh  reason: invalid class name and case insensitive filesystem */
public class C145896uh implements C159487jR {
    public C1044059o A00;
    public C145906ui A01;
    public C145836ub A02;
    public C145866ue A03;
    public C145806uY A04;
    public C145856ud A05;
    public C145816uZ A06;
    public C159297j8 A07;
    public C159307j9 A08;
    public C143516qg A09;
    public C143526qh A0A;
    public C143526qh A0B;
    public C119295pa A0C;
    public C122345uh A0D;
    public BusinessDirectoryContextualSearchViewModel A0E;
    public C145846uc A0F;
    public final C158147fs A0G;
    public final C158157ft A0H;
    public final C158167fu A0I;
    public final C158197fx A0J;
    public final C158207fy A0K;
    public final C158217fz A0L;
    public final C117285m0 A0M;
    public final AnonymousClass1QW A0N;
    public final Set A0O = C36441kJ.A16();
    public final C158177fv A0P;
    public final C158187fw A0Q;
    public final C130846Mq A0R;
    public final AnonymousClass16D A0S;
    public final AnonymousClass7h7 A0T;
    public final C157217cb A0U;

    public void A05(AnonymousClass6QG r14) {
        AnonymousClass511 r1;
        A01();
        C158187fw r2 = this.A0Q;
        C1265464l r10 = this.A0M.A00;
        C164407rl r22 = (C164407rl) r2;
        int i = r22.A01;
        Object obj = r22.A00;
        AnonymousClass6QG r5 = r14;
        if (i != 0) {
            C18800tq r12 = ((AnonymousClass1U2) obj).A00;
            C19700wN A0V = C36391kE.A0V(r12);
            C19770wU A0Z = C36341k9.A0Z(r12);
            C18820ts A0T2 = C36341k9.A0T(r12);
            C20810yC A0V2 = C36341k9.A0V(r12);
            C18830tt r0 = r12.A00;
            r1 = new AnonymousClass511(A0V, C18830tt.A13(r0), C90494aF.A0J(r0), r5, C36411kG.A0c(r12), A0T2, A0V2, this, r10, C90494aF.A0O(r0), A0Z);
        } else {
            C18800tq r13 = ((C27121Mz) obj).A01;
            C19700wN A0V3 = C36391kE.A0V(r13);
            C19770wU A0Z2 = C36341k9.A0Z(r13);
            C18820ts A0T3 = C36341k9.A0T(r13);
            C20810yC A0V4 = C36341k9.A0V(r13);
            C18830tt r02 = r13.A00;
            r1 = new AnonymousClass511(A0V3, C18830tt.A13(r02), C90494aF.A0J(r02), r5, C36411kG.A0c(r13), A0T3, A0V4, this, r10, C90494aF.A0O(r02), A0Z2);
        }
        r1.A00 = "2.0";
        r1.A0B();
        this.A00 = r1;
    }

    public void A06(List list, List list2) {
        A01();
        C145846uc r2 = new C145846uc(this, list);
        this.A0F = r2;
        AnonymousClass515 B4A = this.A0J.B4A(r2, this.A0M.A00, (C132406Tm) null, (String) null, list, list2);
        B4A.A0B();
        this.A00 = B4A;
    }

    public void A00() {
        Set<AnonymousClass6VU> set = this.A0O;
        for (AnonymousClass6VU r0 : set) {
            C132446Tt r2 = r0.A06;
            if (r2.A06() != 2 && !C36431kI.A1Y(r2)) {
                r2.A0D(true);
            }
        }
        set.clear();
    }

    public void A01() {
        C1044059o r0 = this.A00;
        if (r0 != null && r0.A06.A06() != 2 && !C36431kI.A1Y(this.A00.A06)) {
            this.A00.A06.A0D(true);
            this.A00 = null;
        }
    }

    public void A02(C119215pS r14, C1260462i r15, AnonymousClass6QG r16, C134986bw r17, String str, String str2, String str3) {
        A01();
        AnonymousClass6QG r4 = r16;
        C145866ue r6 = new C145866ue(r4, this, (Jid) null);
        this.A03 = r6;
        AnonymousClass517 B49 = this.A0H.B49(r14, r15, r4, r17, r6, this.A0M.A00, (C132406Tm) null, "all_descendents", str, str2, str3);
        B49.A0B();
        this.A00 = B49;
    }

    public void A03(C119215pS r18, C1260462i r19, AnonymousClass6QG r20, Jid jid, String str) {
        C1044059o B49;
        A01();
        AnonymousClass1QW r2 = this.A0N;
        C119215pS r6 = r18;
        C1260462i r7 = r19;
        AnonymousClass6QG r8 = r20;
        Jid jid2 = jid;
        if (!r2.A02() || !r2.A03.A0E(3400)) {
            C145866ue r10 = new C145866ue(r8, this, jid2);
            this.A03 = r10;
            B49 = this.A0H.B49(r6, r7, r8, (C134986bw) null, r10, this.A0M.A00, (C132406Tm) null, "all_descendents", "all_descendents", str, "chaining");
        } else {
            C145836ub r12 = new C145836ub(r8, this);
            this.A02 = r12;
            C158167fu r3 = this.A0I;
            C1265464l r13 = this.A0M.A00;
            C164367rh r32 = (C164367rh) r3;
            int i = r32.A01;
            Object obj = r32.A00;
            if (i != 0) {
                C18800tq r22 = ((AnonymousClass1U2) obj).A00;
                C20810yC A0V = C36341k9.A0V(r22);
                C19700wN A0V2 = C36391kE.A0V(r22);
                C19770wU A0Z = C36341k9.A0Z(r22);
                C18820ts A0T2 = C36341k9.A0T(r22);
                C18830tt r1 = r22.A00;
                B49 = new AnonymousClass516(A0V2, C18830tt.A13(r1), C90494aF.A0J(r1), r6, r7, r8, C36411kG.A0c(r22), A0T2, A0V, r12, r13, jid2, C90494aF.A0O(r1), A0Z);
            } else {
                C18800tq r23 = ((C27121Mz) obj).A01;
                C20810yC A0V3 = C36341k9.A0V(r23);
                C19700wN A0V4 = C36391kE.A0V(r23);
                C19770wU A0Z2 = C36341k9.A0Z(r23);
                C18820ts A0T3 = C36341k9.A0T(r23);
                C18830tt r14 = r23.A00;
                B49 = new AnonymousClass516(A0V4, C18830tt.A13(r14), C90494aF.A0J(r14), r6, r7, r8, C36411kG.A0c(r23), A0T3, A0V3, r12, r13, jid2, C90494aF.A0O(r14), A0Z2);
            }
        }
        B49.A0B();
        this.A00 = B49;
    }

    public void A04(C119215pS r14, C1260462i r15, AnonymousClass6QG r16, String str) {
        if (!(this.A00 instanceof AnonymousClass513)) {
            A01();
        }
        AnonymousClass6QG r4 = r16;
        C145866ue r6 = new C145866ue(r4, this, (Jid) null);
        this.A03 = r6;
        AnonymousClass517 B49 = this.A0H.B49(r14, r15, r4, (C134986bw) null, r6, this.A0M.A00, (C132406Tm) null, "all_descendents", "all_descendents", str, "nearby");
        B49.A0B();
        this.A00 = B49;
    }

    public void BWx(C1261662u r4, int i) {
        C119295pa r2 = this.A0C;
        if (r2 != null) {
            C122335ug r1 = r2.A01;
            r1.A01 = 4;
            r1.A00 = i;
            r2.A00.A0C(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C122335ug r1;
        List list = (List) obj;
        C119295pa r7 = this.A0C;
        if (r7 != null) {
            if (list.isEmpty()) {
                r1 = r7.A01;
                r1.A01 = 3;
            } else {
                ArrayList A0I2 = AnonymousClass001.A0I();
                int i = 0;
                while (i < list.size()) {
                    C134986bw r4 = (C134986bw) list.get(i);
                    i++;
                    A0I2.add(new AnonymousClass5E2(new C48942iJ(r7, i, 1, r4), r4.A00, r4.A01));
                }
                r1 = r7.A01;
                r1.A01 = 1;
                List list2 = r1.A03;
                list2.clear();
                list2.addAll(A0I2);
            }
            r7.A00.A0C(r1);
        }
    }

    public C145896uh(C158147fs r2, C158157ft r3, C158167fu r4, C158177fv r5, C158187fw r6, C158197fx r7, C158207fy r8, C157217cb r9, C158217fz r10, C130846Mq r11, AnonymousClass16D r12, C117285m0 r13, AnonymousClass1QW r14, AnonymousClass7h7 r15) {
        this.A0S = r12;
        this.A0N = r14;
        this.A0M = r13;
        this.A0P = r5;
        this.A0K = r8;
        this.A0L = r10;
        this.A0U = r9;
        this.A0I = r4;
        this.A0T = r15;
        this.A0H = r3;
        this.A0J = r7;
        this.A0Q = r6;
        this.A0G = r2;
        this.A0R = r11;
    }
}
