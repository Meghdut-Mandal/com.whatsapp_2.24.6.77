package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005102h;
import X.C008903u;
import X.C009003v;
import X.C023509x;
import X.C161517n2;
import X.C164237rU;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", i = {}, l = {64, 65}, m = "invokeSuspend", n = {}, s = {})
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C005102h $context;
    public final /* synthetic */ AnonymousClass05H $this_collectAsState;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2  reason: invalid class name */
    public final class AnonymousClass2 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass2(r4, r5, r2);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05H r3 = r2;
                C164237rU r0 = new C164237rU(r4, 2);
                this.label = 1;
                if (r3.B36(this, r0) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(C023509x r2, C005102h r3, AnonymousClass05H r4) {
        super(2, r2);
        this.$context = r3;
        this.$this_collectAsState = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(r5, this.$context, this.$this_collectAsState);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C161517n2 r4 = (C161517n2) this.L$0;
            if (AnonymousClass00C.A0J(this.$context, C008903u.A00)) {
                AnonymousClass05H r1 = this.$this_collectAsState;
                C164237rU r0 = new C164237rU(r4, 1);
                this.label = 1;
                A00 = r1.B36(this, r0);
            } else {
                C005102h r3 = this.$context;
                final AnonymousClass05H r2 = this.$this_collectAsState;
                AnonymousClass2 r02 = new AnonymousClass2((C023509x) null);
                this.label = 2;
                A00 = AnonymousClass0A2.A00(this, r3, r02);
            }
            if (A00 == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
