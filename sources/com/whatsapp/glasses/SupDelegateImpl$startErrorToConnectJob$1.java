package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass21A;
import X.AnonymousClass3FS;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C169708Aj;
import X.C203169nR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.glasses.SupDelegateImpl$startErrorToConnectJob$1", f = "SupDelegateImpl.kt", i = {}, l = {461, 463}, m = "invokeSuspend", n = {}, s = {})
public final class SupDelegateImpl$startErrorToConnectJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $shouldDelay;
    public int label;
    public final /* synthetic */ C203169nR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupDelegateImpl$startErrorToConnectJob$1(C203169nR r2, C023509x r3, boolean z) {
        super(2, r3);
        this.$shouldDelay = z;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SupDelegateImpl$startErrorToConnectJob$1(this.this$0, r5, this.$shouldDelay);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.$shouldDelay) {
                AnonymousClass3FS r1 = this.this$0.A02;
                if (!(r1 instanceof AnonymousClass21A) || !(((AnonymousClass21A) r1).A00.A00 instanceof C169708Aj)) {
                    j = 5000;
                    this.label = 2;
                } else {
                    j = 300000;
                    this.label = 1;
                }
                if (C07330Xf.A00(this, j) == r4) {
                    return r4;
                }
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C203169nR r12 = this.this$0;
        if (C203169nR.A05(r12)) {
            C203169nR.A03(r12, false);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupDelegateImpl$startErrorToConnectJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
