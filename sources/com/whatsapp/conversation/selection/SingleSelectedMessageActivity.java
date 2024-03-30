package com.whatsapp.conversation.selection;

import X.AnonymousClass00T;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass2IR;
import X.AnonymousClass2Jf;
import X.AnonymousClass2yY;
import X.AnonymousClass4ZG;
import X.AnonymousClass6O1;
import X.C1261362r;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19890wg;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C39701tL;
import X.C43842Ka;
import X.C43922Kk;
import X.C53102qm;
import X.C61333Bl;
import X.C66033Uk;
import X.C79593ty;
import X.C80313vC;
import X.C81103wT;
import X.C83834Ax;
import X.C83844Ay;
import X.C86194Jz;
import X.C89334Wd;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;

public final class SingleSelectedMessageActivity extends C43922Kk {
    public C19460v5 A00;
    public AnonymousClass2yY A01;
    public AnonymousClass1X4 A02;
    public AnonymousClass16D A03;
    public AnonymousClass171 A04;
    public C43842Ka A05;
    public AnonymousClass2Jf A06;
    public C39701tL A07;
    public C1261362r A08;
    public AnonymousClass6O1 A09;
    public AnonymousClass1XN A0A;
    public EmojiSearchProvider A0B;
    public C19890wg A0C;
    public ReactionsTrayViewModel A0D;
    public Boolean A0E;
    public boolean A0F;
    public final AnonymousClass00T A0G;
    public final AnonymousClass00T A0H;

    public void A2F() {
        if (!this.A0F) {
            this.A0F = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r2 = r3.A00;
            C36321k7.A0X(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A04 = C36401kF.A0X(r2);
            this.A01 = (C61333Bl) A0L.A16.get();
            this.A02 = C36361kB.A0T(r3);
            this.A0A = C36351kA.A0d(r3);
            this.A03 = C36341k9.A0R(r3);
            this.A04 = C36341k9.A0S(r3);
            this.A0B = C36351kA.A0f(r2);
            this.A08 = C36371kC.A0b(r2);
            this.A00 = C36381kD.A0Q(r3.A0x);
            this.A0C = C36351kA.A0m(r3);
            this.A09 = C36351kA.A0c(r2);
            this.A01 = (AnonymousClass2yY) A0L.A1O.get();
            this.A06 = C27111My.A1p(A0L);
        }
    }

    public void A3l() {
        if (this.A0E != null) {
            super.A3l();
            return;
        }
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0D;
        if (reactionsTrayViewModel == null) {
            throw C36331k8.A0d("reactionsTrayViewModel");
        }
        C79593ty r2 = new C79593ty();
        C80313vC.A01(reactionsTrayViewModel.A0E, reactionsTrayViewModel, r2, 18);
        C79593ty.A00(r2, this, 12);
    }

    public void onBackPressed() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0D;
        if (reactionsTrayViewModel == null) {
            throw C36331k8.A0d("reactionsTrayViewModel");
        } else if (C36341k9.A07(reactionsTrayViewModel.A0B) == 2) {
            ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0D;
            if (reactionsTrayViewModel2 == null) {
                throw C36331k8.A0d("reactionsTrayViewModel");
            }
            reactionsTrayViewModel2.A0T(0);
        } else {
            super.onBackPressed();
        }
    }

    public SingleSelectedMessageActivity(int i) {
        this.A0F = false;
        C89334Wd.A00(this, 5);
    }

    public static final void A01(SingleSelectedMessageActivity singleSelectedMessageActivity, boolean z) {
        singleSelectedMessageActivity.A0E = Boolean.valueOf(z);
        super.A3l();
    }

    public void A3k() {
        super.A3k();
        AnonymousClass2IR r2 = this.A03;
        if (r2 != null) {
            r2.post(new C81103wT((Object) this, 46));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object value = this.A0H.getValue();
        if (value == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) C36441kJ.A0b(this).A00(ReactionsTrayViewModel.class);
        this.A0D = reactionsTrayViewModel;
        if (reactionsTrayViewModel == null) {
            throw C36331k8.A0d("reactionsTrayViewModel");
        }
        C66033Uk.A00(this, reactionsTrayViewModel.A0C, new C86194Jz(this), 21);
        AnonymousClass2yY r1 = this.A01;
        if (r1 != null) {
            C39701tL r0 = (C39701tL) AnonymousClass4ZG.A00(this, r1, value, 5).A00(C39701tL.class);
            this.A07 = r0;
            if (r0 == null) {
                throw C36331k8.A0d("singleSelectedMessageViewModel");
            }
            C66033Uk.A00(this, r0.A00, C53102qm.A02(this, 23), 24);
            ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0D;
            if (reactionsTrayViewModel2 == null) {
                throw C36331k8.A0d("reactionsTrayViewModel");
            }
            C66033Uk.A00(this, reactionsTrayViewModel2.A0B, C53102qm.A02(this, 24), 22);
            ReactionsTrayViewModel reactionsTrayViewModel3 = this.A0D;
            if (reactionsTrayViewModel3 == null) {
                throw C36331k8.A0d("reactionsTrayViewModel");
            }
            C66033Uk.A00(this, reactionsTrayViewModel3.A0D, C53102qm.A02(this, 25), 23);
            return;
        }
        throw C36331k8.A0d("singleSelectedMessageViewModelFactory");
    }

    public SingleSelectedMessageActivity() {
        this(0);
        this.A0G = C36431kI.A1I(new C83834Ax(this));
        this.A0H = C36431kI.A1I(new C83844Ay(this));
    }
}
