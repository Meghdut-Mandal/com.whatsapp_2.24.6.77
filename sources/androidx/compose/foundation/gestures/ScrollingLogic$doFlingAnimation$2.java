package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5RU;
import X.C009003v;
import X.C023509x;
import X.C10800fF;
import X.C133156Wz;
import X.C136566ec;
import X.C136606eg;
import X.C154697Te;
import X.C157497dd;
import X.C157507de;
import X.C36441kJ;
import X.C90464aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $available;
    public final /* synthetic */ C10800fF $result;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, C023509x r3, C10800fF r4, long j) {
        super(2, r3);
        this.this$0 = scrollingLogic;
        this.$result = r4;
        this.$available = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, r8, this.$result, this.$available);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        C10800fF r7;
        long j;
        float A00;
        ScrollingLogic scrollingLogic2;
        long A0B;
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            scrollingLogic = this.this$0;
            C136606eg r9 = new C136606eg(scrollingLogic, new C154697Te((C157507de) this.L$0, scrollingLogic));
            r7 = this.$result;
            long j2 = this.$available;
            C157497dd r5 = scrollingLogic.A01;
            j = r7.element;
            AnonymousClass5RU r13 = scrollingLogic.A02;
            AnonymousClass5RU r12 = AnonymousClass5RU.Horizontal;
            long j3 = C133156Wz.A01;
            if (r13 == r12) {
                A00 = C90464aC.A01(j2);
            } else {
                A00 = C90464aC.A00(j2);
            }
            if (scrollingLogic.A05) {
                A00 *= (float) -1;
            }
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = r7;
            this.J$0 = j;
            this.label = 1;
            C136566ec r52 = (C136566ec) r5;
            r52.A00 = 0;
            obj = AnonymousClass0A2.A00(this, r52.A02, new DefaultFlingBehavior$performFling$2(r52, r9, (C023509x) null, A00));
            if (obj == r8) {
                return r8;
            }
            scrollingLogic2 = scrollingLogic;
        } else if (i == 1) {
            j = this.J$0;
            r7 = (C10800fF) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        float A03 = C36441kJ.A03(obj);
        if (scrollingLogic2.A05) {
            A03 *= (float) -1;
        }
        AnonymousClass5RU r53 = scrollingLogic.A02;
        AnonymousClass5RU r2 = AnonymousClass5RU.Horizontal;
        long j4 = C133156Wz.A01;
        if (r53 == r2) {
            A0B = C90464aC.A0B(A03, C90464aC.A00(j));
        } else {
            A0B = C90464aC.A0B(C90464aC.A01(j), A03);
        }
        r7.element = A0B;
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
