package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.07U  reason: invalid class name */
public class AnonymousClass07U extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass07U(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void onChanged() {
        this.A00.A0E();
    }

    public void onInvalidated() {
        this.A00.A0E();
    }
}
