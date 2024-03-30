package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lH  reason: invalid class name and case insensitive filesystem */
public final class C14220lH extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05H[] $flows;
    public final /* synthetic */ int $i;
    public final /* synthetic */ AtomicInteger $nonClosed;
    public final /* synthetic */ C18010sR $resultChannel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14220lH(AtomicInteger atomicInteger, C023509x r3, C18010sR r4, AnonymousClass05H[] r5, int i) {
        super(2, r3);
        this.$flows = r5;
        this.$i = i;
        this.$nonClosed = atomicInteger;
        this.$resultChannel = r4;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new C14220lH(this.$nonClosed, r8, this.$resultChannel, this.$flows, this.$i);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H[] r0 = this.$flows;
            int i2 = this.$i;
            AnonymousClass05H r2 = r0[i2];
            C13040j4 r02 = new C13040j4(this.$resultChannel, i2);
            this.label = 1;
            if (r2.B36(this, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Throwable th) {
                th = th;
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.B33((Throwable) null);
                    throw th;
                }
            }
        } else {
            th = AnonymousClass000.A0e();
            throw th;
        }
        if (this.$nonClosed.decrementAndGet() == 0) {
            this.$resultChannel.B33((Throwable) null);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14220lH) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
