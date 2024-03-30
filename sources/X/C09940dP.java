package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0dP  reason: invalid class name and case insensitive filesystem */
public class C09940dP implements C17060qe {
    public final /* synthetic */ ViewPager2 A00;

    public void BTW(View view) {
    }

    public C09940dP(ViewPager2 viewPager2) {
        this.A00 = viewPager2;
    }

    public void BTV(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw AnonymousClass001.A09("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
