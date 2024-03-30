package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.4MS  reason: invalid class name */
public final class AnonymousClass4MS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C42831zZ $adapter;
    public final /* synthetic */ ShimmerFrameLayout $shimmerContainer;
    public final /* synthetic */ View $touchInterceptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MS(View view, ShimmerFrameLayout shimmerFrameLayout, C42831zZ r4) {
        super(1);
        this.$shimmerContainer = shimmerFrameLayout;
        this.$touchInterceptor = view;
        this.$adapter = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C62743Hj r4 = (C62743Hj) obj;
        boolean z = r4.A01;
        ShimmerFrameLayout shimmerFrameLayout = this.$shimmerContainer;
        if (z) {
            shimmerFrameLayout.A02();
        } else {
            shimmerFrameLayout.A01();
        }
        View view = this.$touchInterceptor;
        AnonymousClass00C.A07(view);
        view.setVisibility(C36351kA.A00(z ? 1 : 0));
        C42831zZ r0 = this.$adapter;
        r0.A00 = r4;
        r0.A06();
        return AnonymousClass0AJ.A00;
    }
}
