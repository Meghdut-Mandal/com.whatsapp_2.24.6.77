package X;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6DR  reason: invalid class name */
public class AnonymousClass6DR {
    public int A00 = -1;
    public View A01;
    public C93024fQ A02;
    public TabLayout A03;
    public CharSequence A04;
    public CharSequence A05;
    public Object A06;

    public void A00() {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            tabLayout.A0J(this, true);
            return;
        }
        throw AnonymousClass001.A08("Tab not attached to a TabLayout");
    }

    public void A01(int i) {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            A02(tabLayout.getResources().getText(i));
            return;
        }
        throw AnonymousClass001.A08("Tab not attached to a TabLayout");
    }

    public void A02(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A04) && !TextUtils.isEmpty(charSequence)) {
            this.A02.setContentDescription(charSequence);
        }
        this.A05 = charSequence;
        C93024fQ r0 = this.A02;
        if (r0 != null) {
            r0.A06();
        }
    }
}
