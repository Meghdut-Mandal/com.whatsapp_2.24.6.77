package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C144196rn;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$2", f = "CallControlStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallControlStateHolder$uiState$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C144196rn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlStateHolder$uiState$2(C144196rn r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallControlStateHolder$uiState$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallControlStateHolder$uiState$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C144196rn r1 = this.this$0;
            Log.i("CallControlState acquireResources");
            r1.A04.A01(r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
