package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6OZ;
import X.C019408g;
import X.C023509x;
import X.C36441kJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$yTranslation$1", f = "CallHeaderStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallHeaderStateHolder$yTranslation$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ float F$0;
    public /* synthetic */ Object L$0;
    public int label;

    public CallHeaderStateHolder$yTranslation$1(C023509x r2) {
        super(3, r2);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            float f = this.F$0;
            if (!((AnonymousClass6OZ) this.L$0).A0N) {
                f = 0.0f;
            }
            return new Float(f);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        float A03 = C36441kJ.A03(obj);
        CallHeaderStateHolder$yTranslation$1 callHeaderStateHolder$yTranslation$1 = new CallHeaderStateHolder$yTranslation$1((C023509x) obj3);
        callHeaderStateHolder$yTranslation$1.F$0 = A03;
        callHeaderStateHolder$yTranslation$1.L$0 = obj2;
        return callHeaderStateHolder$yTranslation$1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
