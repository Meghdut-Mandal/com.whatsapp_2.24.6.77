package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C67783ap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class LiveDataScopeImpl$emit$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C67783ap this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(C67783ap r2, Object obj, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$value = obj;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            CoroutineLiveData coroutineLiveData = this.this$0.A00;
            this.label = 1;
            coroutineLiveData.A0G(this);
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A00.A0D(this.$value);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LiveDataScopeImpl$emit$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
