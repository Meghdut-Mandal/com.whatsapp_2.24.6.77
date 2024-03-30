package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05H;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass05R;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0R0;
import X.AnonymousClass0R1;
import X.AnonymousClass5YS;
import X.AnonymousClass63Q;
import X.AnonymousClass6YM;
import X.C005502l;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C07430Xq;
import X.C109325Xd;
import X.C116915lP;
import X.C12990iz;
import X.C144186rm;
import X.C164477rs;
import X.C18510tH;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1;
import com.whatsapp.calling.calldatasource.CallRepository$getParticipantAudioLevels$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class MinimizedCallBannerViewModel extends AnonymousClass04R implements AnonymousClass01Y {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass63Q A02;
    public final AnonymousClass05H A03;
    public final AnonymousClass05H A04;
    public final AnonymousClass05L A05;
    public final AnonymousClass05L A06;
    public final C005502l A07;
    public final AnonymousClass05H A08;
    public final AnonymousClass05H A09;
    public final AnonymousClass05L A0A;

    @DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                final MinimizedCallBannerViewModel minimizedCallBannerViewModel = MinimizedCallBannerViewModel.this;
                C18510tH r3 = new C18510tH((Object) new C019408g((C023509x) null) {
                    public int label;

                    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
                        return 

                        public MinimizedCallBannerViewModel(AnonymousClass63Q r7, C116915lP r8, C005502l r9) {
                            AnonymousClass00C.A0D(r9, 3);
                            this.A02 = r7;
                            this.A07 = r9;
                            AnonymousClass05N r3 = new AnonymousClass05N(C36381kD.A0j());
                            this.A06 = r3;
                            C12990iz r4 = new C12990iz(new AnonymousClass5YS(r7, 1), r3, AnonymousClass0R0.A00(new CallRepository$getCallStateModel$1(r8, (C023509x) null, true)));
                            this.A09 = r4;
                            C18510tH r2 = new C18510tH((C009003v) new MinimizedCallBannerViewModelKt$emitNullOnStart$2((C023509x) null), (AnonymousClass05H) new C164477rs(AnonymousClass0R0.A00(new CallRepository$getParticipantAudioLevels$1(r8, (C023509x) null)), 0), 1);
                            this.A08 = r2;
                            this.A04 = AnonymousClass0R1.A00(r9, C07430Xq.A01(new C12990iz(new AnonymousClass5YS(this, 0), r2, r4)));
                            AnonymousClass05N r42 = new AnonymousClass05N(AnonymousClass05R.ON_STOP);
                            this.A0A = r42;
                            AnonymousClass05N r32 = new AnonymousClass05N(C36391kE.A0r());
                            this.A05 = r32;
                            this.A03 = C07430Xq.A01(new C12990iz(new MinimizedCallBannerViewModel$effectiveVisibilityState$1((C023509x) null), r32, r42));
                            C36331k8.A1T(new AnonymousClass1((C023509x) null), C109325Xd.A00(this));
                        }

                        public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
                            AnonymousClass00C.A0D(r2, 1);
                            this.A0A.setValue(r2);
                        }

                        public void A0R() {
                            C144186rm.A00(this.A02.A02, (AnonymousClass6YM) null);
                        }
                    }
