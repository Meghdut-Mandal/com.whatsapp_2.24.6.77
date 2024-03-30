package X;

import android.view.WindowMetrics;

/* renamed from: X.AkS  reason: case insensitive filesystem */
public final class C22304AkS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass80Z $splitRule;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22304AkS(AnonymousClass80Z r2) {
        super(1);
        this.$splitRule = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        AnonymousClass00C.A0D(windowMetrics, 0);
        return Boolean.valueOf(this.$splitRule.A00(windowMetrics));
    }
}
