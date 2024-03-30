package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.HomePagerSlidingTabStrip;

/* renamed from: X.3Un  reason: invalid class name and case insensitive filesystem */
public class C66063Un implements LayoutTransition.TransitionListener {
    public final /* synthetic */ HomePagerSlidingTabStrip A00;

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C66063Un(HomePagerSlidingTabStrip homePagerSlidingTabStrip) {
        this.A00 = homePagerSlidingTabStrip;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.invalidate();
    }
}
