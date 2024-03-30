package X;

import android.view.View;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;

/* renamed from: X.6cc  reason: invalid class name and case insensitive filesystem */
public final class C135386cc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass012 A01;
    public final /* synthetic */ C93044fU A02;

    public void onViewAttachedToWindow(View view) {
    }

    public C135386cc(View view, AnonymousClass012 r2, C93044fU r3) {
        this.A00 = view;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void onViewDetachedFromWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        AnonymousClass01M lifecycle = this.A01.getLifecycle();
        MinimizedCallBannerViewModel minimizedCallBannerViewModel = this.A02.A01;
        if (minimizedCallBannerViewModel == null) {
            throw C36331k8.A0a();
        }
        lifecycle.A05(minimizedCallBannerViewModel);
    }
}
