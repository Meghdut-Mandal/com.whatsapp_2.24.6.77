package X;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
/* renamed from: X.0kL  reason: invalid class name and case insensitive filesystem */
public final class C13720kL extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C13720kL(C023509x r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C06800Vd.A01((Collection) null, this);
    }
}
