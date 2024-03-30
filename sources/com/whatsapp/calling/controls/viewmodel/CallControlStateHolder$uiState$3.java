package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C019408g;
import X.C023509x;
import X.C144196rn;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.controls.viewmodel.CallControlStateHolder$uiState$3", f = "CallControlStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallControlStateHolder$uiState$3 extends AnonymousClass0A1 implements C019408g {
    public int label;
    public final /* synthetic */ C144196rn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlStateHolder$uiState$3(C144196rn r2, C023509x r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        return new CallControlStateHolder$uiState$3(this.this$0, (C023509x) obj3).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C144196rn r1 = this.this$0;
            Log.i("CallControlState releaseResources");
            r1.A04.A02(r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
