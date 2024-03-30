package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0Hu  reason: invalid class name and case insensitive filesystem */
public class C03810Hu extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 A00;

    public boolean A0h(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03810Hu(ViewPager2 viewPager2) {
        super(1);
        this.A00 = viewPager2;
    }

    public void A1k(AnonymousClass0C4 r4, int[] iArr) {
        ViewPager2 viewPager2 = this.A00;
        int i = viewPager2.A01;
        if (i == -1) {
            super.A1k(r4, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * i;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public boolean A0i(Bundle bundle, C02760Bu r3, AnonymousClass0C4 r4, int i) {
        return super.A0i(bundle, r3, r4, i);
    }

    public void A0b(C07650Ys r1, C02760Bu r2, AnonymousClass0C4 r3) {
        super.A0b(r1, r2, r3);
    }
}
