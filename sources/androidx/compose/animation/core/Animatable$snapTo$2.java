package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C006302t;
import X.C023509x;
import X.C132336Td;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Animatable$snapTo$2 extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ Object $targetValue;
    public int label;
    public final /* synthetic */ C132336Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(C132336Td r2, Object obj, C023509x r4) {
        super(1, r4);
        this.this$0 = r2;
        this.$targetValue = obj;
    }

    public final C023509x create(C023509x r4) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$snapTo$2) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C132336Td.A01(this.this$0);
            Object A00 = C132336Td.A00(this.this$0, this.$targetValue);
            this.this$0.A02.A05.setValue(A00);
            this.this$0.A06.setValue(A00);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
