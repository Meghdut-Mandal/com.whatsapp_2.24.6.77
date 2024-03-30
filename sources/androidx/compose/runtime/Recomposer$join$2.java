package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C108185Sm;
import X.C36361kB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Recomposer$join$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;

    public Recomposer$join$2(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r3) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(r3);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2((C023509x) obj2);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return Boolean.valueOf(C36361kB.A1a(this.L$0, C108185Sm.ShutDown));
        }
        throw AnonymousClass000.A0e();
    }
}
