package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.4bK  reason: invalid class name and case insensitive filesystem */
public class C91024bK extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public C91024bK(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onChanged() {
        this.A00.A0A();
    }

    public void onInvalidated() {
        this.A00.A0A();
    }
}
