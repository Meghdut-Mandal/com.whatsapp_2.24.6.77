package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C139536k1;
import X.C14300lP;
import X.C154297Rq;
import X.C164237rU;
import X.C18500tG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$1", f = "AECapturePresenter.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C139536k1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$1(C139536k1 r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AECapturePresenter$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AECapturePresenter$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C139536k1 r0 = this.this$0;
            C18500tG r2 = new C18500tG(new C14300lP((C023509x) null, new C154297Rq(r0), r0.A05), 3);
            C164237rU r02 = new C164237rU(this.this$0, 3);
            this.label = 1;
            if (r2.B36(this, r02) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
