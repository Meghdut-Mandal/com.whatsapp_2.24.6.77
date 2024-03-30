package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

/* renamed from: X.6Yo  reason: invalid class name and case insensitive filesystem */
public final class C133456Yo implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ BloksVideoPlayerView A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C133456Yo(BloksVideoPlayerView bloksVideoPlayerView) {
        this.A00 = bloksVideoPlayerView;
    }

    public void onActivityPaused(Activity activity) {
        BloksVideoPlayerView bloksVideoPlayerView = this.A00;
        C128186Bg r0 = bloksVideoPlayerView.A0B;
        bloksVideoPlayerView.A0B = new C128186Bg(r0.A01, r0.A02, false);
        bloksVideoPlayerView.A02();
    }

    public void onActivityResumed(Activity activity) {
        BloksVideoPlayerView bloksVideoPlayerView = this.A00;
        C128186Bg r0 = bloksVideoPlayerView.A0B;
        bloksVideoPlayerView.A0B = new C128186Bg(r0.A01, r0.A02, true);
        bloksVideoPlayerView.A02();
    }
}
