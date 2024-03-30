package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass04S;
import X.AnonymousClass0VV;
import X.AnonymousClass17Z;
import X.AnonymousClass4UN;
import X.AnonymousClass52I;
import X.AnonymousClass52J;
import X.AnonymousClass52K;
import X.AnonymousClass52L;
import X.AnonymousClass52M;
import X.AnonymousClass52N;
import X.AnonymousClass52O;
import X.AnonymousClass52P;
import X.AnonymousClass52Q;
import X.AnonymousClass52R;
import X.AnonymousClass52S;
import X.AnonymousClass6WJ;
import X.C007403e;
import X.C023509x;
import X.C105545Fb;
import X.C109325Xd;
import X.C110275aP;
import X.C110285aQ;
import X.C116875lL;
import X.C116885lM;
import X.C116895lN;
import X.C1258761r;
import X.C1511278i;
import X.C164497ru;
import X.C165167sz;
import X.C188448zb;
import X.C19970wo;
import X.C20810yC;
import X.C24261Bt;
import X.C28201Rs;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C61693Db;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C95504lc;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.calling.avatar.CallAvatarARClassManager;
import com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase;
import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public final class CallAvatarViewModel extends C95504lc implements AnonymousClass4UN {
    public static final long A0M;
    public static final long A0N;
    public C007403e A00;
    public C007403e A01;
    public C007403e A02;
    public boolean A03;
    public final ArEffectsFlmConsentManager A04;
    public final CallAvatarARClassManager A05;
    public final AnonymousClass6WJ A06;
    public final C116875lL A07;
    public final InitializeAvatarEffectUseCase A08;
    public final C116885lM A09;
    public final C1258761r A0A;
    public final FetchAvatarEffectUseCase A0B;
    public final C116895lN A0C;
    public final C105545Fb A0D;
    public final C19970wo A0E;
    public final C34831hi A0F = C36441kJ.A0s(new AnonymousClass52S((C1511278i) null, false, false));
    public final C28201Rs A0G = C36441kJ.A0t();
    public final AnonymousClass04S A0H;
    public final C61693Db A0I;
    public final AnonymousClass17Z A0J;
    public final C20810yC A0K;
    public final C24261Bt A0L;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0M = timeUnit.toMillis(10);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        A0N = C90484aE.A0K(timeUnit);
    }

    public CallAvatarViewModel(ArEffectsFlmConsentManager arEffectsFlmConsentManager, CallAvatarARClassManager callAvatarARClassManager, C61693Db r12, AnonymousClass6WJ r13, C116875lL r14, InitializeAvatarEffectUseCase initializeAvatarEffectUseCase, C116885lM r16, C1258761r r17, FetchAvatarEffectUseCase fetchAvatarEffectUseCase, C105545Fb r19, C19970wo r20, AnonymousClass17Z r21, C20810yC r22, C24261Bt r23) {
        Object r1;
        C110275aP r0;
        C105545Fb r2 = r19;
        C19970wo r5 = r20;
        C20810yC r3 = r22;
        C36321k7.A18(r5, r3, r2, r13);
        C24261Bt r15 = r23;
        C36361kB.A1J(r15, 7, callAvatarARClassManager);
        C1258761r r6 = r17;
        C36361kB.A1K(arEffectsFlmConsentManager, r6);
        AnonymousClass17Z r4 = r21;
        AnonymousClass00C.A0D(r4, 13);
        this.A0E = r5;
        this.A0K = r3;
        this.A0D = r2;
        this.A06 = r13;
        this.A0I = r12;
        this.A0B = fetchAvatarEffectUseCase;
        this.A0L = r15;
        this.A05 = callAvatarARClassManager;
        this.A08 = initializeAvatarEffectUseCase;
        this.A04 = arEffectsFlmConsentManager;
        this.A0A = r6;
        this.A07 = r14;
        this.A0J = r4;
        this.A09 = r16;
        C165167sz r32 = new C165167sz(this, 13);
        this.A0H = r32;
        AnonymousClass00T r62 = this.A0A.A01;
        AnonymousClass011 A0j = C36421kH.A0j(C36411kG.A0E(r62).getString("pref_previous_call_id", (String) null), C36371kC.A01(C36411kG.A0E(r62), "pref_previous_view_state"));
        Object obj = A0j.first;
        int A082 = C90474aD.A08(A0j);
        if (AnonymousClass00C.A0J(obj, this.A0D.A05().A0A)) {
            boolean z = true;
            if (A082 != 1) {
                if (A082 == 2) {
                    r0 = AnonymousClass52J.A00;
                } else if (A082 != 3) {
                    if (A082 == 4) {
                        z = false;
                    } else if (A082 != 5) {
                        r1 = new AnonymousClass52S((C1511278i) null, false, false);
                    }
                    r0 = new AnonymousClass52K(z);
                } else {
                    r0 = AnonymousClass52I.A00;
                }
                r1 = new AnonymousClass52M(r0);
            } else {
                r1 = new AnonymousClass52Q(false);
            }
            this.A0F.A0D(r1);
        }
        C36341k9.A0u(C36351kA.A0A(r62).remove("pref_previous_call_id"), "pref_previous_view_state");
        r2.registerObserver(this);
        AnonymousClass0VV.A01(AnonymousClass0VV.A00(new C164497ru(this, 2), this.A0F)).A0A(r32);
        this.A0C = new C116895lN(this);
    }

    public static final int A06(CallAvatarViewModel callAvatarViewModel) {
        switch (callAvatarViewModel.A04.A01().ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 99;
            default:
                throw C36441kJ.A18();
        }
    }

    public static final void A07(CallAvatarViewModel callAvatarViewModel, String str, boolean z) {
        Log.i("voip/CallAvatarViewModel/enableEffect");
        CallAvatarViewModel callAvatarViewModel2 = callAvatarViewModel;
        callAvatarViewModel2.A01 = C36391kE.A12(new CallAvatarViewModel$enableEffect$1(callAvatarViewModel2, (C110285aQ) C36401kF.A0m(callAvatarViewModel.A0F), str, (C023509x) null, z), C109325Xd.A00(callAvatarViewModel));
    }

    public static final boolean A08(CallAvatarViewModel callAvatarViewModel) {
        long A002 = C19970wo.A00(callAvatarViewModel.A0E);
        if (!callAvatarViewModel.A03 || !C36371kC.A1X(callAvatarViewModel.A0L.A00(), true)) {
            return false;
        }
        AnonymousClass00T r8 = callAvatarViewModel.A0A.A01;
        if (A002 - C36411kG.A0E(r8).getLong("pref_last_avatar_calling_use_time", 0) < A0M || A002 - C36411kG.A0E(r8).getLong("pref_last_upsell_banner_shown_time", 0) < A0N || !callAvatarViewModel.A0I.A00.A0E(1756) || !callAvatarViewModel.A0K.A0E(4858)) {
            return false;
        }
        return true;
    }

    public void A0R() {
        C105545Fb r3 = this.A0D;
        String str = r3.A05().A0A;
        AnonymousClass00C.A07(str);
        C34831hi r2 = this.A0F;
        C110285aQ r1 = (C110285aQ) C36401kF.A0m(r2);
        int i = 1;
        if ((r1 instanceof AnonymousClass52S) || (r1 instanceof AnonymousClass52P) || (r1 instanceof AnonymousClass52L) || (r1 instanceof AnonymousClass52R) || (r1 instanceof AnonymousClass52N) || (r1 instanceof AnonymousClass52O)) {
            this.A06.A04(1);
            i = 0;
        } else if (!(r1 instanceof AnonymousClass52Q)) {
            if (r1 instanceof AnonymousClass52M) {
                C110275aP r12 = ((AnonymousClass52M) r1).A00;
                if (r12 instanceof AnonymousClass52J) {
                    i = 2;
                } else if (r12 instanceof AnonymousClass52I) {
                    i = 3;
                } else if (r12 instanceof AnonymousClass52K) {
                    i = 4;
                    if (((AnonymousClass52K) r12).A00) {
                        i = 5;
                    }
                } else {
                    throw C36441kJ.A18();
                }
            } else {
                throw C36441kJ.A18();
            }
        }
        C36341k9.A0v(C36351kA.A0A(this.A0A.A01).putString("pref_previous_call_id", str), "pref_previous_view_state", i);
        r3.unregisterObserver(this);
        AnonymousClass0VV.A01(AnonymousClass0VV.A00(new C164497ru(this, 2), r2)).A0B(this.A0H);
    }

    public final void A0S() {
        Log.i("voip/CallAvatarViewModel/onSwitchToAvatarTapped");
        Object A0m = C36401kF.A0m(this.A0F);
        if (!(A0m instanceof AnonymousClass52S)) {
            C36321k7.A1J(A0m, "voip/CallAvatarViewModel/onSwitchToAvatarTapped Unexpected state=", AnonymousClass000.A0u());
            return;
        }
        String A0V = C90464aC.A0V();
        this.A06.A06(1, A06(this), A0V, this.A05.A00);
        C36331k8.A1T(new CallAvatarViewModel$onSwitchToAvatarTapped$1(this, A0V, (C023509x) null), C109325Xd.A00(this));
    }

    public final boolean A0T() {
        C34831hi r1 = this.A0F;
        if ((r1.A04() instanceof AnonymousClass52P) || (r1.A04() instanceof AnonymousClass52L) || (r1.A04() instanceof AnonymousClass52R) || (r1.A04() instanceof AnonymousClass52N) || (r1.A04() instanceof AnonymousClass52O)) {
            return true;
        }
        return false;
    }

    public C188448zb BBy() {
        return this.A04.A01();
    }

    public void BY8() {
        Log.i("voip/CallAvatarViewModel/onFlmConsentBottomSheetDismissed");
        C110285aQ r3 = (C110285aQ) C36401kF.A0m(this.A0F);
        if (!(r3 instanceof AnonymousClass52L)) {
            C36321k7.A1J(r3, "voip/CallAvatarViewModel/onFlmConsentBottomSheetDismissed Unexpected state=", AnonymousClass000.A0u());
            return;
        }
        C36331k8.A1T(new CallAvatarViewModel$onFlmConsentBottomSheetDismissed$1(this, r3, (C023509x) null), C109325Xd.A00(this));
    }

    public void BY9(AnonymousClass00S r4, AnonymousClass00S r5) {
        Log.i("voip/CallAvatarViewModel/onFlmConsentBottomSheetPrimaryButtonClicked");
        Object A0m = C36401kF.A0m(this.A0F);
        if (!(A0m instanceof AnonymousClass52L)) {
            C36321k7.A1J(A0m, "voip/CallAvatarViewModel/onFlmConsentBottomSheetPrimaryButtonClicked Unexpected state=", AnonymousClass000.A0u());
            return;
        }
        this.A00 = C36391kE.A12(new CallAvatarViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1(this, (C023509x) null, r4, r5), C109325Xd.A00(this));
    }

    public void BYA(AnonymousClass00S r4, AnonymousClass00S r5) {
        Log.i("voip/CallAvatarViewModel/onFlmConsentBottomSheetSecondaryButtonClicked");
        Object A0m = C36401kF.A0m(this.A0F);
        if (!(A0m instanceof AnonymousClass52L)) {
            C36321k7.A1J(A0m, "voip/CallAvatarViewModel/onFlmConsentBottomSheetSecondaryButtonClicked Unexpected state=", AnonymousClass000.A0u());
            return;
        }
        this.A00 = C36391kE.A12(new CallAvatarViewModel$onFlmConsentBottomSheetSecondaryButtonClicked$1(this, (C023509x) null, r4, r5), C109325Xd.A00(this));
    }
}
