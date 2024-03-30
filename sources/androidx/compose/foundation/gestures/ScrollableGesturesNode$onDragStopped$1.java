package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C133156Wz;
import X.C36331k8;
import X.C94804io;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableGesturesNode$onDragStopped$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ long J$0;
    public int label;
    public final /* synthetic */ C94804io this$0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1", f = "Scrollable.kt", i = {}, l = {612}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r6, j);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                ScrollingLogic scrollingLogic = C94804io.this.A02;
                long j = j;
                this.label = 1;
                if (scrollingLogic.A03(this, j) == r4) {
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
    public ScrollableGesturesNode$onDragStopped$1(C94804io r2, C023509x r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        long j = ((C133156Wz) obj2).A00;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this.this$0, (C023509x) obj3);
        scrollableGesturesNode$onDragStopped$1.J$0 = j;
        return scrollableGesturesNode$onDragStopped$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            final long j = this.J$0;
            AnonymousClass040 r5 = (AnonymousClass040) this.this$0.A03.A01.invoke();
            if (r5 != null) {
                final C94804io r1 = this.this$0;
                C36331k8.A1T(new AnonymousClass1((C023509x) null), r5);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass001.A09("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        throw AnonymousClass000.A0e();
    }
}
