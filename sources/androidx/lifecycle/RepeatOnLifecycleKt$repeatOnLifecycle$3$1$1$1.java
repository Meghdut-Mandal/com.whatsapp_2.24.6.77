package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass040;
import X.AnonymousClass05R;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AP;
import X.C007403e;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C10810fG;
import X.C17170qq;
import X.C36391kE;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements AnonymousClass01Y {
    public final /* synthetic */ AnonymousClass05R A00;
    public final /* synthetic */ AnonymousClass05R A01;
    public final /* synthetic */ C009003v A02;
    public final /* synthetic */ C10810fG A03;
    public final /* synthetic */ AnonymousClass0AP A04;
    public final /* synthetic */ AnonymousClass040 A05;
    public final /* synthetic */ C17170qq A06;

    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r5, r1, r2);
        }

        public final Object invokeSuspend(Object obj) {
            C17170qq r2;
            C009003v r1;
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                r2 = r2;
                r1 = r1;
                this.L$0 = r2;
                this.L$1 = r1;
                this.label = 1;
                if (r2.BOV((Object) null, this) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                r1 = (C009003v) this.L$1;
                r2 = (C17170qq) this.L$0;
                AnonymousClass0AN.A00(obj);
            } else if (i == 2) {
                r2 = (C17170qq) this.L$0;
                try {
                    AnonymousClass0AN.A00(obj);
                    AnonymousClass0AJ r0 = AnonymousClass0AJ.A00;
                    r2.BwJ((Object) null);
                    return r0;
                } catch (Throwable th) {
                    th = th;
                    r2.BwJ((Object) null);
                    throw th;
                }
            } else {
                throw AnonymousClass000.A0e();
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1((C023509x) null, r1);
                this.L$0 = r2;
                this.L$1 = null;
                this.label = 2;
                if (C009403z.A00(this, repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) == r5) {
                    return r5;
                }
                AnonymousClass0AJ r02 = AnonymousClass0AJ.A00;
                r2.BwJ((Object) null);
                return r02;
            } catch (Throwable th2) {
                th = th2;
                r2.BwJ((Object) null);
                throw th;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(AnonymousClass05R r1, AnonymousClass05R r2, C009003v r3, C10810fG r4, AnonymousClass0AP r5, AnonymousClass040 r6, C17170qq r7) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void BhM(AnonymousClass05R r7, AnonymousClass012 r8) {
        AnonymousClass00C.A0D(r7, 1);
        if (r7 == this.A01) {
            C10810fG r4 = this.A03;
            AnonymousClass040 r3 = this.A05;
            final C17170qq r2 = this.A06;
            final C009003v r1 = this.A02;
            r4.element = C36391kE.A12(new AnonymousClass1((C023509x) null), r3);
            return;
        }
        if (r7 == this.A00) {
            C10810fG r12 = this.A03;
            C007403e r0 = (C007403e) r12.element;
            if (r0 != null) {
                r0.B2S((CancellationException) null);
            }
            r12.element = null;
        }
        if (r7 == AnonymousClass05R.ON_DESTROY) {
            this.A04.resumeWith(AnonymousClass0AJ.A00);
        }
    }
}
