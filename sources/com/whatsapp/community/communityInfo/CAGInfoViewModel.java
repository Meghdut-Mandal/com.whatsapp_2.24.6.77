package com.whatsapp.community.communityInfo;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass08S;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1NN;
import X.AnonymousClass2Dz;
import X.AnonymousClass2EH;
import X.AnonymousClass3HQ;
import X.AnonymousClass49V;
import X.AnonymousClass49W;
import X.AnonymousClass49X;
import X.C19770wU;
import X.C20510xg;
import X.C20810yC;
import X.C220412q;
import X.C232317r;
import X.C235718z;
import X.C24381Cf;
import X.C27541Op;
import X.C28201Rs;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39811tr;
import X.C65073Qp;
import X.C87854Qk;
import X.C87874Qm;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class CAGInfoViewModel extends AnonymousClass04R {
    public AnonymousClass141 A00;
    public C39811tr A01;
    public AnonymousClass2EH A02;
    public AnonymousClass147 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass2Dz A07;
    public final AnonymousClass08S A08 = C36441kJ.A0Y();
    public final AnonymousClass17Y A09;
    public final C235718z A0A;
    public final AnonymousClass16D A0B;
    public final AnonymousClass171 A0C;
    public final C220412q A0D;
    public final C24381Cf A0E;
    public final AnonymousClass16J A0F;
    public final C232317r A0G;
    public final C20810yC A0H;
    public final C27541Op A0I;
    public final AnonymousClass1NN A0J;
    public final C20510xg A0K;
    public final C28201Rs A0L = C36441kJ.A0t();
    public final List A0M = new CopyOnWriteArrayList();
    public final AnonymousClass00T A0N = C36431kI.A1I(new AnonymousClass49V(this));
    public final AnonymousClass00T A0O = C36431kI.A1I(new AnonymousClass49W(this));
    public final AnonymousClass00T A0P = C36431kI.A1I(new AnonymousClass49X(this));
    public final C87874Qm A0Q;
    public final C19770wU A0R;

    public static final void A01(CAGInfoViewModel cAGInfoViewModel) {
        List list = cAGInfoViewModel.A0M;
        list.clear();
        if (cAGInfoViewModel.A05) {
            AnonymousClass3HQ.A00(7, list);
            AnonymousClass3HQ.A00(10, list);
        }
        int i = 14;
        if (!cAGInfoViewModel.A0H.A0E(7628)) {
            AnonymousClass3HQ.A00(9, list);
            i = 3;
        }
        AnonymousClass3HQ.A00(i, list);
        AnonymousClass3HQ.A00(8, list);
        if (cAGInfoViewModel.A06) {
            AnonymousClass3HQ.A00(5, list);
        }
        AnonymousClass3HQ.A00(11, list);
        AnonymousClass3HQ.A00(1, list);
        if (cAGInfoViewModel.A04) {
            AnonymousClass3HQ.A00(6, list);
        }
        C220412q r1 = cAGInfoViewModel.A0D;
        AnonymousClass147 r0 = cAGInfoViewModel.A03;
        if (r0 == null) {
            throw C36331k8.A0d("cagJid");
        }
        C65073Qp A0W = C36371kC.A0W(r1, r0);
        if (cAGInfoViewModel.A0A.A0O() && A0W != null) {
            AnonymousClass3HQ.A00(4, list);
        }
        AnonymousClass3HQ.A00(2, list);
        AnonymousClass3HQ.A00(12, list);
        AnonymousClass3HQ.A00(13, list);
        AnonymousClass3HQ.A00(0, list);
        cAGInfoViewModel.A08.A0C(list);
    }

    public static final void A02(CAGInfoViewModel cAGInfoViewModel) {
        C39811tr r0 = cAGInfoViewModel.A01;
        if (r0 == null) {
            throw C36331k8.A0d("groupParticipantsViewModel");
        }
        r0.A0S();
        C36331k8.A1E(cAGInfoViewModel.A07);
        AnonymousClass2EH r1 = cAGInfoViewModel.A02;
        if (r1 == null) {
            throw C36331k8.A0d("groupChatInfoViewModel");
        }
        r1.A0T();
        C87874Qm r2 = cAGInfoViewModel.A0Q;
        AnonymousClass2EH r12 = cAGInfoViewModel.A02;
        if (r12 == null) {
            throw C36331k8.A0d("groupChatInfoViewModel");
        }
        AnonymousClass147 r02 = cAGInfoViewModel.A03;
        if (r02 == null) {
            throw C36331k8.A0d("cagJid");
        }
        AnonymousClass2Dz B3x = r2.B3x(r12, r02);
        cAGInfoViewModel.A07 = B3x;
        C36331k8.A1F(B3x, cAGInfoViewModel.A0R);
    }

    public void A0R() {
        if (this.A03 != null) {
            C36411kG.A1I(this.A0F, this.A0O);
            C36411kG.A1I(this.A0E, this.A0N);
            this.A0I.A01((C87854Qk) this.A0P.getValue());
        }
    }

    public CAGInfoViewModel(AnonymousClass17Y r2, C235718z r3, AnonymousClass16D r4, AnonymousClass171 r5, C220412q r6, C24381Cf r7, AnonymousClass16J r8, C232317r r9, C20810yC r10, C27541Op r11, AnonymousClass1NN r12, C20510xg r13, C87874Qm r14, C19770wU r15) {
        C36321k7.A1B(r10, r2, r15, r6, r4);
        C36321k7.A1C(r12, r5, r3, r13, r8);
        C36321k7.A15(r9, r7, r14);
        AnonymousClass00C.A0D(r11, 14);
        this.A0H = r10;
        this.A09 = r2;
        this.A0R = r15;
        this.A0D = r6;
        this.A0B = r4;
        this.A0J = r12;
        this.A0C = r5;
        this.A0A = r3;
        this.A0K = r13;
        this.A0F = r8;
        this.A0G = r9;
        this.A0E = r7;
        this.A0Q = r14;
        this.A0I = r11;
    }
}
