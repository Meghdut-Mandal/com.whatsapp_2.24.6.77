package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3FS;
import X.AnonymousClass9QU;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C203169nR;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.glasses.SupDelegateImpl$setDelayedCollapseJob$1", f = "SupDelegateImpl.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
public final class SupDelegateImpl$setDelayedCollapseJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $updateUI;
    public int label;
    public final /* synthetic */ C203169nR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupDelegateImpl$setDelayedCollapseJob$1(C203169nR r2, C023509x r3, AnonymousClass00S r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$updateUI = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SupDelegateImpl$setDelayedCollapseJob$1(this.this$0, r5, this.$updateUI);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 3000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C203169nR r32 = this.this$0;
        AnonymousClass3FS A01 = r32.A02.A01((AnonymousClass9QU) null, C36381kD.A0j(), (Boolean) null);
        if (A01 != null) {
            AnonymousClass00S r0 = this.$updateUI;
            r32.A02 = A01;
            r0.invoke();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupDelegateImpl$setDelayedCollapseJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
