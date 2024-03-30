package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass01M;
import X.AnonymousClass01P;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C17300r3;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
public final class FlowExtKt$flowWithLifecycle$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass01M $lifecycle;
    public final /* synthetic */ AnonymousClass01P $minActiveState;
    public final /* synthetic */ AnonymousClass05H $this_flowWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r5, r42, r1);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05H r2 = r1;
                AnonymousClass4Z8 r0 = new AnonymousClass4Z8(r42, 1);
                this.label = 1;
                if (r2.B36(this, r0) == r4) {
                    return r4;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(AnonymousClass01P r2, AnonymousClass01M r3, C023509x r4, AnonymousClass05H r5) {
        super(2, r4);
        this.$lifecycle = r3;
        this.$minActiveState = r2;
        this.$this_flowWithLifecycle = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$minActiveState, this.$lifecycle, r6, this.$this_flowWithLifecycle);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invokeSuspend(Object obj) {
        C17300r3 r4;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C18000sQ r42 = (C18000sQ) this.L$0;
            AnonymousClass01M r3 = this.$lifecycle;
            AnonymousClass01P r2 = this.$minActiveState;
            final AnonymousClass05H r1 = this.$this_flowWithLifecycle;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.L$0 = r42;
            this.label = 1;
            r4 = r42;
            if (AnonymousClass3LK.A00(r2, r3, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            r4 = (C17300r3) this.L$0;
        } else {
            throw AnonymousClass000.A0e();
        }
        r4.B33((Throwable) null);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$flowWithLifecycle$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
