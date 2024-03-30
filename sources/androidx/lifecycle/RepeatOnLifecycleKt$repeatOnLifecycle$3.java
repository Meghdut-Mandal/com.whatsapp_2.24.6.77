package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass01M;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass03P;
import X.AnonymousClass040;
import X.AnonymousClass05R;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import X.C15590na;
import X.C36371kC;
import X.C36401kF;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public final /* synthetic */ AnonymousClass01P $state;
    public final /* synthetic */ AnonymousClass01M $this_repeatOnLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            AnonymousClass01M r2 = r5;
            return new AnonymousClass1(r4, r2, r8, r7, r8);
        }

        public final Object invokeSuspend(Object obj) {
            C10810fG r9;
            C10810fG r3;
            AnonymousClass05R r6;
            AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass01M r4 = r5;
                if (((AnonymousClass01N) r4).A02 != AnonymousClass01P.DESTROYED) {
                    r9 = new C10810fG();
                    r3 = new C10810fG();
                    AnonymousClass01P r5 = r4;
                    AnonymousClass040 r11 = r8;
                    C009003v r8 = r7;
                    this.L$0 = r9;
                    this.L$1 = r3;
                    this.L$2 = r5;
                    this.L$3 = r4;
                    this.L$4 = r11;
                    this.L$5 = r8;
                    this.label = 1;
                    AnonymousClass0AR A12 = C36371kC.A12(this);
                    int ordinal = r5.ordinal();
                    if (ordinal == 2) {
                        r6 = AnonymousClass05R.ON_CREATE;
                    } else if (ordinal == 3) {
                        r6 = AnonymousClass05R.ON_START;
                    } else if (ordinal != 4) {
                        r6 = null;
                    } else {
                        r6 = AnonymousClass05R.ON_RESUME;
                    }
                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(r6, AnonymousClass05R.A00(r5), r8, r9, A12, r11, new C15590na());
                    r3.element = repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
                    r4.A04(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1);
                    if (A12.A0G() == r2) {
                        return r2;
                    }
                }
                return AnonymousClass0AJ.A00;
            } else if (i == 1) {
                r3 = (C10810fG) this.L$1;
                r9 = (C10810fG) this.L$0;
                try {
                    AnonymousClass0AN.A00(obj);
                } catch (Throwable th) {
                    C007403e r1 = (C007403e) r9.element;
                    if (r1 != null) {
                        r1.B2S((CancellationException) null);
                    }
                    AnonymousClass00N r12 = (AnonymousClass00N) r3.element;
                    if (r12 != null) {
                        r5.A05(r12);
                    }
                    throw th;
                }
            } else {
                throw AnonymousClass000.A0e();
            }
            C007403e r13 = (C007403e) r9.element;
            if (r13 != null) {
                r13.B2S((CancellationException) null);
            }
            AnonymousClass00N r14 = (AnonymousClass00N) r3.element;
            if (r14 != null) {
                r5.A05(r14);
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AnonymousClass01P r2, AnonymousClass01M r3, C023509x r4, C009003v r5) {
        super(2, r4);
        this.$this_repeatOnLifecycle = r3;
        this.$state = r2;
        this.$block = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$state, this.$this_repeatOnLifecycle, r6, this.$block);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AnonymousClass040 r8 = (AnonymousClass040) this.L$0;
            AnonymousClass03P A0y = C36401kF.A0y();
            final AnonymousClass01M r5 = this.$this_repeatOnLifecycle;
            final AnonymousClass01P r4 = this.$state;
            final C009003v r7 = this.$block;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, A0y, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
