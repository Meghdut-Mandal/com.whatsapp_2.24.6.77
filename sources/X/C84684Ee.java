package X;

import androidx.core.widget.NestedScrollView;

/* renamed from: X.4Ee  reason: invalid class name and case insensitive filesystem */
public final class C84684Ee extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C39131rI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84684Ee(C39131rI r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int A02;
        NestedScrollView nestedScrollView = this.this$0.A04;
        AnonymousClass00C.A0D(nestedScrollView, 0);
        boolean z = true;
        if (!nestedScrollView.canScrollVertically(1) && !nestedScrollView.canScrollVertically(-1)) {
            z = false;
        }
        C39131rI r0 = this.this$0;
        if (z) {
            A02 = C36331k8.A02(r0.A08);
        } else {
            A02 = C36331k8.A02(r0.A09);
        }
        this.this$0.A01.setBackgroundColor(A02);
        return AnonymousClass0AJ.A00;
    }
}
