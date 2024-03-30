package com.whatsapp.calling.header.ui;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01P;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C15390nG;
import X.C164237rU;
import X.C52992qW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.ui.CallScreenDetailsLayout$setupOnAttach$1", f = "CallScreenDetailsLayout.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class CallScreenDetailsLayout$setupOnAttach$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass012 $lifecycleOwner;
    public int label;
    public final /* synthetic */ CallScreenDetailsLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout$setupOnAttach$1(AnonymousClass012 r2, CallScreenDetailsLayout callScreenDetailsLayout, C023509x r4) {
        super(2, r4);
        this.this$0 = callScreenDetailsLayout;
        this.$lifecycleOwner = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CallScreenDetailsLayout$setupOnAttach$1(this.$lifecycleOwner, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H r2 = this.this$0.getCallScreenDetailsStateHolder().A03;
            AnonymousClass01M lifecycle = this.$lifecycleOwner.getLifecycle();
            AnonymousClass00C.A08(lifecycle);
            C15390nG A00 = C52992qW.A00(AnonymousClass01P.STARTED, lifecycle, r2);
            C164237rU r0 = new C164237rU(this.this$0, 7);
            this.label = 1;
            if (A00.B36(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallScreenDetailsLayout$setupOnAttach$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
