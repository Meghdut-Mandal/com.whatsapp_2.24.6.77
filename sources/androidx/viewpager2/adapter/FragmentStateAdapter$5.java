package androidx.viewpager2.adapter;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0Hz;
import android.os.Handler;

public class FragmentStateAdapter$5 implements AnonymousClass01Y {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass0Hz A01;
    public final /* synthetic */ Runnable A02;

    public FragmentStateAdapter$5(Handler handler, AnonymousClass0Hz r2, Runnable runnable) {
        this.A01 = r2;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        if (r3 == AnonymousClass05R.ON_DESTROY) {
            this.A00.removeCallbacks(this.A02);
            r4.getLifecycle().A05(this);
        }
    }
}
