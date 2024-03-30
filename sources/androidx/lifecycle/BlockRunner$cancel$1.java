package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C607539f;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$cancel$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C607539f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(C607539f r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new BlockRunner$cancel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BlockRunner$cancel$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 5000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C607539f r1 = this.this$0;
        if (r1.A02.A00 <= 0) {
            C007403e r0 = r1.A01;
            if (r0 != null) {
                r0.B2S((CancellationException) null);
            }
            this.this$0.A01 = null;
        }
        return AnonymousClass0AJ.A00;
    }
}
