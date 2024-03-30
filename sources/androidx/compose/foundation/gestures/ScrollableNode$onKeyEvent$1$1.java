package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5RT;
import X.C009003v;
import X.C023509x;
import X.C157507de;
import X.C160557lC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableNode$onKeyEvent$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $scrollAmount;
    public final /* synthetic */ ScrollingLogic $this_with;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            AnonymousClass1 r0 = new AnonymousClass1(r6, j);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                ScrollingLogic.this.A01((C157507de) this.L$0, 4, j);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1$1(ScrollingLogic scrollingLogic, C023509x r3, long j) {
        super(2, r3);
        this.$this_with = scrollingLogic;
        this.$scrollAmount = j;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ScrollableNode$onKeyEvent$1$1(this.$this_with, r6, this.$scrollAmount);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final ScrollingLogic scrollingLogic = this.$this_with;
            C160557lC r5 = scrollingLogic.A03;
            AnonymousClass5RT r4 = AnonymousClass5RT.UserInput;
            final long j = this.$scrollAmount;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (r5.BpQ(r4, this, r0) == r8) {
                return r8;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onKeyEvent$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
