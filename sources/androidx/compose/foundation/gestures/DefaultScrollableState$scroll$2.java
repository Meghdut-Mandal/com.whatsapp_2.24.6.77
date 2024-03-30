package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5RT;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C118245nZ;
import X.C136616eh;
import X.C157507de;
import X.C90474aD;
import androidx.compose.foundation.MutatorMutex$mutateWith$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultScrollableState$scroll$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public final /* synthetic */ AnonymousClass5RT $scrollPriority;
    public int label;
    public final /* synthetic */ C136616eh this$0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            AnonymousClass1 r0 = new AnonymousClass1(r5, r0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                Object obj2 = this.L$0;
                C90474aD.A11(C136616eh.this.A02, true);
                C009003v r0 = r0;
                this.label = 1;
                if (r0.invoke(obj2, this) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                try {
                    AnonymousClass0AN.A00(obj);
                } catch (Throwable th) {
                    C90474aD.A11(C136616eh.this.A02, false);
                    throw th;
                }
            } else {
                throw AnonymousClass000.A0e();
            }
            C90474aD.A11(C136616eh.this.A02, false);
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(AnonymousClass5RT r2, C136616eh r3, C023509x r4, C009003v r5) {
        super(2, r4);
        this.this$0 = r3;
        this.$scrollPriority = r2;
        this.$block = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new DefaultScrollableState$scroll$2(this.$scrollPriority, this.this$0, r6, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C136616eh r1 = this.this$0;
            C118245nZ r6 = r1.A00;
            C157507de r7 = r1.A01;
            AnonymousClass5RT r5 = this.$scrollPriority;
            final C009003v r0 = this.$block;
            AnonymousClass1 r9 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (C009403z.A00(this, new MutatorMutex$mutateWith$2(r5, r6, r7, (C023509x) null, r9)) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DefaultScrollableState$scroll$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
