package androidx.work;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C141786np;
import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$getForegroundInfoAsync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C141786np $jobFuture;
    public Object L$0;
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(CoroutineWorker coroutineWorker, C141786np r3, C023509x r4) {
        super(2, r4);
        this.$jobFuture = r3;
        this.this$0 = coroutineWorker;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.this$0, this.$jobFuture, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C141786np r1 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = r1;
            this.label = 1;
            if (coroutineWorker instanceof XmppLifecycleWorker) {
                throw AnonymousClass001.A09("XmppLifecycleWorker is not supposed to run in foreground");
            }
            throw AnonymousClass001.A09("Not implemented");
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            ((C141786np) this.L$0).A00.A06(obj);
            return AnonymousClass0AJ.A00;
        } else {
            throw AnonymousClass000.A0e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
