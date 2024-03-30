package com.whatsapp.conversation;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass04H;
import X.AnonymousClass0C0;
import X.AnonymousClass12O;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1A5;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass2HC;
import X.AnonymousClass3QI;
import X.AnonymousClass3T1;
import X.AnonymousClass3YE;
import X.AnonymousClass3ZC;
import X.AnonymousClass4AD;
import X.AnonymousClass4AE;
import X.AnonymousClass4AF;
import X.AnonymousClass4AG;
import X.AnonymousClass4AH;
import X.AnonymousClass4AI;
import X.AnonymousClass4AJ;
import X.AnonymousClass4AK;
import X.AnonymousClass4AL;
import X.AnonymousClass4AM;
import X.AnonymousClass4AN;
import X.AnonymousClass4FY;
import X.AnonymousClass4FZ;
import X.AnonymousClass4WK;
import X.AnonymousClass9SI;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C06820Vf;
import X.C183808rO;
import X.C18510tH;
import X.C18820ts;
import X.C19420v0;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20310xM;
import X.C20350xQ;
import X.C20810yC;
import X.C21060yb;
import X.C27731Pn;
import X.C29551Xb;
import X.C32681e1;
import X.C33311f5;
import X.C33521fV;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39431sG;
import X.C40001uV;
import X.C40061uh;
import X.C40441vY;
import X.C41291wy;
import X.C57402yB;
import X.C58192zT;
import X.C65723Tf;
import X.C80273v8;
import X.C88974Ut;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;

public final class CommentsBottomSheet extends Hilt_CommentsBottomSheet {
    public C57402yB A00;
    public C58192zT A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public AnonymousClass16D A04;
    public C27731Pn A05;
    public C33751fs A06;
    public C40441vY A07;
    public C21060yb A08;
    public C19970wo A09;
    public C19420v0 A0A;
    public C18820ts A0B;
    public AnonymousClass1A5 A0C;
    public C20310xM A0D;
    public AnonymousClass12O A0E;
    public AnonymousClass1N0 A0F;
    public AnonymousClass1H2 A0G;
    public C20810yC A0H;
    public C20350xQ A0I;
    public C19890wg A0J;
    public C29551Xb A0K;
    public C32681e1 A0L;
    public C19770wU A0M;
    public C88974Ut A0N;
    public C005502l A0O;
    public C005502l A0P;
    public C40061uh A0Q;
    public final AnonymousClass0C0 A0R = new AnonymousClass0C0();
    public final AnonymousClass00T A0S = C36431kI.A1I(new AnonymousClass4AD(this));
    public final AnonymousClass00T A0T;
    public final AnonymousClass00T A0U;
    public final AnonymousClass00T A0V;
    public final AnonymousClass00T A0W;
    public final AnonymousClass00T A0X;
    public final AnonymousClass00T A0Y;
    public final AnonymousClass00T A0Z;
    public final AnonymousClass00T A0a;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C27731Pn r2 = this.A05;
        if (r2 != null) {
            this.A07 = new C40441vY(r2.A03(A0a(), this, "comments-contact-picture"), (AnonymousClass9SI) this.A0S.getValue());
            A1D();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1f(1);
            linearLayoutManager.A1l(true);
            linearLayoutManager.A1m(true);
            AnonymousClass00T r22 = this.A0Z;
            ((RecyclerView) r22.getValue()).setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView = (RecyclerView) r22.getValue();
            C40441vY r0 = this.A07;
            if (r0 == null) {
                throw C36331k8.A0Y();
            }
            recyclerView.setAdapter(r0);
            ((RecyclerView) r22.getValue()).A0v(new C41291wy(linearLayoutManager, this));
            AnonymousClass00T r3 = this.A0U;
            C06820Vf.A01(C009403z.A02(A1m()), new C18510tH((C009003v) new CommentsBottomSheet$setupRecyclerView$2(linearLayoutManager, (C023509x) null), ((C40001uV) r3.getValue()).A0O, 5));
            C36371kC.A1L(this, new CommentsBottomSheet$setupRecyclerView$3(this, (C023509x) null), ((C40001uV) r3.getValue()).A0M);
            C36361kB.A0G(view, R.id.emoji_picker_btn).setVisibility(8);
            AnonymousClass2HC r5 = (AnonymousClass2HC) C36361kB.A0G(view, R.id.entry);
            r5.setOnTouchListener(AnonymousClass3ZC.A00);
            C65723Tf.A02(r5, new AnonymousClass3QI(C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), 0, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), 0));
            r5.setHint(R.string.f12nameremoved);
            ImageView A0L2 = C36341k9.A0L(view, R.id.send);
            C18820ts r23 = this.A0B;
            if (r23 != null) {
                C36361kB.A13(C36381kD.A0H(A0L2.getContext(), R.drawable.input_send), A0L2, r23);
                r5.addTextChangedListener(new AnonymousClass4WK(r5, this, 1));
                AnonymousClass3YE.A00(A0L2, this, r5, 46);
                r5.setupEnterIsSend(new C80273v8(this, r5, 27));
                r5.setInputType(147456);
                C33521fV.A07(C36401kF.A0F(this.A0V), true);
                C36331k8.A1T(new CommentsBottomSheet$onViewCreated$1(view, this, (C023509x) null), C33311f5.A00(this));
                C36371kC.A1L(this, new CommentsBottomSheet$onViewCreated$2(this, (C023509x) null), ((C40001uV) r3.getValue()).A0N);
                C36371kC.A1L(this, new CommentsBottomSheet$onViewCreated$3(this, (C023509x) null), ((C40001uV) r3.getValue()).A0P);
                return;
            }
            throw C36321k7.A09();
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C40061uh r1 = this.A0Q;
        if (r1 == null) {
            throw C36331k8.A0d("messagesViewModel");
        }
        r1.A0Z((AnonymousClass3T1) null);
    }

    public void A1H() {
        AnonymousClass9SI r2 = (AnonymousClass9SI) this.A0S.getValue();
        C183808rO r1 = r2.A00;
        if (r1 != null) {
            r1.A02 = true;
            r1.interrupt();
            r2.A00 = null;
        }
        super.A1H();
    }

    public final C005502l A1m() {
        C005502l r0 = this.A0P;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public CommentsBottomSheet() {
        C000800j r2 = C000800j.NONE;
        this.A0T = C001400p.A00(r2, new AnonymousClass4FY(this));
        this.A0Y = C36431kI.A1I(new AnonymousClass4AI(this));
        AnonymousClass4AE r4 = new AnonymousClass4AE(this);
        AnonymousClass00T A002 = C001400p.A00(r2, new AnonymousClass4AM(new AnonymousClass4AL(this)));
        this.A0U = C36441kJ.A0a(new AnonymousClass4AN(A002), r4, new AnonymousClass4FZ(A002), C36441kJ.A1A(C40001uV.class));
        this.A0X = C36431kI.A1I(new AnonymousClass4AH(this));
        this.A0a = C36431kI.A1I(new AnonymousClass4AK(this));
        this.A0Z = C36431kI.A1I(new AnonymousClass4AJ(this));
        this.A0V = C36431kI.A1I(new AnonymousClass4AF(this));
        this.A0W = C36431kI.A1I(new AnonymousClass4AG(this));
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) C36381kD.A0P(this).A00(MessageSelectionViewModel.class);
        AnonymousClass1A5 r2 = this.A0C;
        if (r2 != null) {
            AnonymousClass00T r1 = this.A0T;
            AnonymousClass141 A012 = r2.A01(C36421kH.A0O(r1));
            AnonymousClass01I A0i = A0i();
            C57402yB r6 = this.A00;
            if (r6 != null) {
                AnonymousClass01I A0i2 = A0i();
                C88974Ut r10 = this.A0N;
                if (r10 != null) {
                    this.A0Q = (C40061uh) new AnonymousClass04H(new C39431sG(A0i().getIntent(), A0i2, r6, messageSelectionViewModel, A012, C36421kH.A0O(r1), r10), A0i).A00(C40061uh.class);
                    return;
                }
                throw C36331k8.A0d("inlineVideoPlaybackHandler");
            }
            throw C36331k8.A0d("messagesViewModelFactory");
        }
        throw C36331k8.A0d("conversationContactManager");
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
