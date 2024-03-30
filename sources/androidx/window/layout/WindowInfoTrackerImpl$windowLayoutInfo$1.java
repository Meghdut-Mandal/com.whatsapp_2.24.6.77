package androidx.window.layout;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass773;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C138756ie;
import X.C153097Na;
import X.C163927qz;
import X.C18000sQ;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Activity $activity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C138756ie this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(Activity activity, C138756ie r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$activity = activity;
    }

    public final C023509x create(Object obj, C023509x r5) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.$activity, this.this$0, r5);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r4 = (C18000sQ) this.L$0;
            C163927qz r3 = new C163927qz(r4, 0);
            this.this$0.A00.BnE(this.$activity, r3, AnonymousClass773.A00);
            C153097Na r0 = new C153097Na(r3, this.this$0);
            this.label = 1;
            if (C05770Qz.A00(this, r0, r4) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
