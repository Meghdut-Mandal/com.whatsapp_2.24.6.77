package X;

import android.app.Application;
import android.os.Handler;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;

/* renamed from: X.4ZD  reason: invalid class name */
public class AnonymousClass4ZD implements AnonymousClass04G {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4ZD(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public static AnonymousClass04H A00(AnonymousClass016 r2, Object obj, Object obj2, Object obj3, int i) {
        return new AnonymousClass04H(new AnonymousClass4ZD(obj, obj2, obj3, i), r2);
    }

    public AnonymousClass04R B3o(Class cls) {
        switch (this.A03) {
            case 0:
                AnonymousClass3QV r1 = (AnonymousClass3QV) this.A01;
                C70003eR r12 = new C70003eR(r1);
                C27121Mz r2 = ((C56992xU) this.A00).A00;
                C18800tq r0 = r2.A01;
                C19970wo A0V = C36351kA.A0V(r0);
                C20810yC A0V2 = C36341k9.A0V(r0);
                C19700wN A0V3 = C36391kE.A0V(r0);
                C19770wU A0Z = C36341k9.A0Z(r0);
                C220412q A0a = C36351kA.A0a(r0);
                AnonymousClass1C4 A0Q = C36421kH.A0Q(r0);
                AnonymousClass16D A0R = C36341k9.A0R(r0);
                AnonymousClass040 A002 = C26581Ks.A00();
                AnonymousClass171 A0S = C36341k9.A0S(r0);
                C31681cD AzX = r0.AzX();
                C20310xM A0Z2 = C36371kC.A0Z(r0);
                AnonymousClass1A1 A0n = C36351kA.A0n(r0);
                C20350xQ A0a2 = C36361kB.A0a(r0);
                C20510xg A0e = C36431kI.A0e(r0);
                AnonymousClass16J A0Z3 = C36361kB.A0Z(r0);
                AnonymousClass1EL A0d = C36381kD.A0d(r0);
                C29541Xa A0M = C36421kH.A0M(r0);
                AnonymousClass1LV A0U = C36361kB.A0U(r0);
                C24381Cf A0Y = C36371kC.A0Y(r0);
                AnonymousClass17X A0b = C36351kA.A0b(r0);
                C18830tt r3 = r0.A00;
                GetGroupInfoProtocolHelper ADw = C18800tq.ADw(r0);
                C27111My r22 = r2.A00;
                AnonymousClass343 r19 = (AnonymousClass343) r3.A2V.get();
                MemberSuggestedGroupsManager memberSuggestedGroupsManager = (MemberSuggestedGroupsManager) r0.A4q.get();
                C57012xW r16 = (C57012xW) r22.A0X.get();
                C40051uf r13 = new C40051uf(A0V3, (C57002xV) r22.A2k.get(), r16, A0U, r12, r19, C18830tt.A38(r3), memberSuggestedGroupsManager, A0R, A0S, A0V, A0a, A0Y, A0Z2, A0b, (C24541Cv) r0.A4O.get(), A0Z3, A0M, A0V2, (GetSubgroupsManager) r0.A3d.get(), A0a2, A0e, (C26791Ln) r0.A8F.get(), ADw, AzX, A0d, (AnonymousClass147) this.A02, A0Q, (AnonymousClass1LY) r0.A5r.get(), (AnonymousClass1O8) r0.A6q.get(), (SetGroupDescriptionProtocolHelper) r3.A3p.get(), A0n, A0Z, A002);
                int i = r1.A00;
                r13.A00 = i;
                C57002xV r14 = r13.A0L;
                r13.A02 = new C70013eS(new C89854Yd(r13, 2), C36341k9.A0T(r14.A00.A01), new C81323wp((Object) r13, 39), i);
                C19930wk r32 = r13.A0t;
                C81323wp.A00(r32, r13, 40);
                if (r13.A0N.A00.A0D) {
                    C36321k7.A1K(r13, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A0u());
                    C81323wp.A00(r32, r13, 42);
                }
                C81323wp.A00(r32, r13, 34);
                C81323wp.A00(r32, r13, 38);
                C40051uf.A04(r13);
                C19770wU r23 = r13.A0y;
                C81323wp.A01(r23, r13, 36);
                C20810yC r15 = r13.A0a;
                if (r15.A0E(4184)) {
                    C81323wp.A00(r32, r13, 43);
                    C81323wp.A01(r23, r13, 37);
                }
                if (!r15.A0E(5563)) {
                    return r13;
                }
                C81323wp.A01(r23, r13, 45);
                return r13;
            case 1:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 2:
                C27121Mz r17 = ((C57082xf) this.A00).A00;
                C18800tq r02 = r17.A01;
                C19970wo A0V4 = C36351kA.A0V(r02);
                C20810yC A0V5 = C36341k9.A0V(r02);
                AnonymousClass17Y A0M2 = C36351kA.A0M(r02);
                C19770wU A0Z4 = C36341k9.A0Z(r02);
                AnonymousClass1DU A0j = C36391kE.A0j(r02);
                C21010yW A0g = C36351kA.A0g(r02);
                C20050ww A0U2 = C36381kD.A0U(r02);
                AnonymousClass19A A0c = C36361kB.A0c(r02);
                AnonymousClass1DW A0b2 = C36431kI.A0b(r02);
                C18820ts A0T = C36341k9.A0T(r02);
                AnonymousClass1GQ A0f = C36371kC.A0f(r02);
                AnonymousClass185 A0U3 = C36371kC.A0U(r02);
                C19420v0 A0Y2 = C36351kA.A0Y(r02);
                C27111My r18 = r17.A00;
                AnonymousClass3FY A1u = C27111My.A1u(r18);
                Application A003 = AnonymousClass1JT.A00(r02.AfJ);
                AnonymousClass19J r192 = (AnonymousClass19J) r02.A9p.get();
                AnonymousClass1KK r20 = (AnonymousClass1KK) r02.A19.get();
                C31751cK r21 = (C31751cK) this.A01;
                C29461Ws r222 = (C29461Ws) r02.A1S.get();
                C202279lS r232 = (C202279lS) r02.A1T.get();
                return new C39471sS(A003, (Handler) this.A02, A0M2, A0U2, (AnonymousClass164) r02.A99.get(), r192, r20, r21, r222, r232, (C89034Uz) r02.A7j.get(), A0U3, A1u, A0V4, A0Y2, A0T, A0b2, A0V5, A0g, A0j, (AnonymousClass1D0) r02.A4l.get(), A0c, A0f, (AnonymousClass353) r18.A37.get(), A0Z4);
            case 3:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 4:
                C27121Mz r6 = ((C75103mg) ((AnonymousClass4O9) this.A00)).A00;
                C18800tq r03 = r6.A01;
                C19970wo A0V6 = C36351kA.A0V(r03);
                C20810yC A0V7 = C36341k9.A0V(r03);
                C18830tt r24 = r03.A00;
                C32681e1 A0p = C36351kA.A0p(r24);
                C19730wQ A0N = C36351kA.A0N(r03);
                C19770wU A0Z5 = C36341k9.A0Z(r03);
                C220412q A0a3 = C36351kA.A0a(r03);
                AnonymousClass16D A0R2 = C36341k9.A0R(r03);
                C33751fs A0X = C36361kB.A0X(r24);
                AnonymousClass17X A0b3 = C36351kA.A0b(r03);
                AnonymousClass1PF r223 = (AnonymousClass1PF) r03.A3s.get();
                return new C39811tr((C57022xX) r6.A00.A0Z.get(), A0N, A0R2, (C32631dw) r03.A2v.get(), (AnonymousClass1PC) r03.A3t.get(), A0X, A0V6, A0a3, r223, A0b3, (C27291Nq) r03.A5p.get(), (C233017y) r03.A63.get(), A0V7, (C27281Np) r03.A3m.get(), (AnonymousClass147) this.A01, (AnonymousClass174) this.A02, A0p, A0Z5);
            case 5:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            default:
                C18800tq r04 = ((C57272xy) this.A01).A00.A01;
                C19770wU A0Z6 = C36341k9.A0Z(r04);
                return new C39781tl(C18830tt.A23(r04.A00), (UserJid) this.A02, (AnonymousClass3K0) this.A00, A0Z6);
        }
    }

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r27, Class cls) {
        switch (this.A03) {
            case 1:
                C32591ds r2 = ((C58192zT) this.A00).A00;
                C18800tq r0 = r2.A02;
                C20810yC A0V = C36341k9.A0V(r0);
                C19730wQ A0N = C36351kA.A0N(r0);
                AnonymousClass16D A0R = C36341k9.A0R(r0);
                C21060yb A0U = C36351kA.A0U(r0);
                AnonymousClass1A1 A0n = C36351kA.A0n(r0);
                C20350xQ A0a = C36361kB.A0a(r0);
                AnonymousClass16J A0Z = C36361kB.A0Z(r0);
                AnonymousClass1EL A0d = C36381kD.A0d(r0);
                AnonymousClass1X4 A0w = C18800tq.A0w(r0);
                C005602m A002 = C25141Fd.A00();
                AnonymousClass03P A003 = C24291Bw.A00();
                AnonymousClass17X A0b = C36351kA.A0b(r0);
                C19890wg A0m = C36351kA.A0m(r0);
                return new C40001uV((C58202zU) r2.A01.A0Y.get(), A0N, A0w, (MessageCommentsManager) r0.A4z.get(), A0R, A0U, A0b, A0Z, A0V, A0a, C36371kC.A0c(r0), A0d, (AnonymousClass11F) this.A01, (AnonymousClass1XS) r0.A3U.get(), A0m, (C64933Qa) this.A02, A0n, A002, A003);
            case 3:
                C51282nZ r13 = (C51282nZ) this.A02;
                C18800tq r1 = ((C58232zX) this.A00).A00.A02;
                C19730wQ A0N2 = C36351kA.A0N(r1);
                C19630wG A0W = C36351kA.A0W(r1);
                C29581Xe r12 = (C29581Xe) r1.A36.get();
                AnonymousClass1QO r11 = (AnonymousClass1QO) r1.A7E.get();
                AnonymousClass1A1 A0n2 = C36351kA.A0n(r1);
                AnonymousClass16J A0Z2 = C36361kB.A0Z(r1);
                C005602m A004 = C25141Fd.A00();
                return new C40091uu(A0N2, A0W, C36351kA.A0b(r1), A0Z2, r11, r12, r13, (C64933Qa) this.A01, A0n2, C36361kB.A0e(r1), A004);
            case 5:
                C27121Mz r22 = ((C57582yT) this.A01).A00;
                C27111My r14 = r22.A00;
                C18800tq r6 = r22.A01;
                C19770wU A0Z3 = C36341k9.A0Z(r6);
                C18800tq r23 = r14.A5g;
                AnonymousClass2LF r24 = new AnonymousClass2LF((C27761Ps) r23.A2D.get(), (C19630wG) r23.A91.get(), (C19770wU) r23.A9Y.get());
                C220412q A0a2 = C36351kA.A0a(r6);
                C18830tt r7 = r6.A00;
                C30131Zi A0m2 = C36431kI.A0m(r6);
                AnonymousClass12O A0d2 = C36411kG.A0d(r6);
                AnonymousClass16D A0R2 = C36341k9.A0R(r6);
                return new AnonymousClass2EJ(C19470v6.A00, (C58062zG) r14.A2Z.get(), r24, A0R2, A0a2, (AnonymousClass141) this.A00, A0d2, C36341k9.A0V(r6), (AnonymousClass11F) this.A02, C36371kC.A0f(r6), A0m2, (C62133Ex) r7.A2t.get(), (AnonymousClass3G3) r7.A2w.get(), A0Z3, C25141Fd.A00());
            default:
                return AnonymousClass0QC.A00(this, cls);
        }
    }
}
