package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.6Q0  reason: invalid class name */
public abstract class AnonymousClass6Q0 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final AnonymousClass0V2 A04;
    public final RecyclerView A05;
    public final ShapePickerRecyclerView A06;
    public final C96134mq A07;
    public final AnonymousClass0UE A08;
    public final C117475mK A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A07.A02.size() <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass6Q0 r4) {
        /*
            androidx.recyclerview.widget.RecyclerView r3 = r4.A05
            int r2 = r3.getVisibility()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0015
            X.4mq r0 = r4.A07
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 0
            if (r1 > 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            if (r2 == r0) goto L_0x0033
            X.5mK r1 = r4.A09
            int r0 = r3.getVisibility()
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            X.6XN r0 = r1.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r0.A0P
            X.1hi r0 = r0.A0X
            boolean r0 = X.C36351kA.A1W(r0)
            r1.A16(r0, r2)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Q0.A00(X.6Q0):void");
    }

    public void A01(C96694nk r5, boolean z) {
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources A0F = C36341k9.A0F(this.A05);
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = A0F.getDimensionPixelSize(i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public void A02(boolean z) {
        RecyclerView recyclerView = this.A05;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources A0F = C36341k9.A0F(recyclerView);
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        layoutParams.height = A0F.getDimensionPixelSize(i);
        recyclerView.setLayoutParams(layoutParams);
        for (int i2 = 0; i2 < this.A07.A02.size(); i2++) {
            C96694nk r0 = (C96694nk) recyclerView.A0Q(i2);
            if (r0 != null) {
                A01(r0, z);
            }
        }
        this.A00 = z;
    }

    public AnonymousClass6Q0(RecyclerView recyclerView, C117475mK r7, ShapePickerRecyclerView shapePickerRecyclerView, boolean z) {
        C162517oi r1 = new C162517oi(this, 12);
        this.A08 = r1;
        C96134mq r4 = new C96134mq(this);
        this.A07 = r4;
        r4.A0B(z);
        recyclerView.setItemAnimator((C02800By) null);
        this.A06 = shapePickerRecyclerView;
        this.A09 = r7;
        shapePickerRecyclerView.A0v(r1);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.A03 = linearLayoutManager;
        this.A04 = new C162497og(recyclerView.getContext(), this, 2);
        this.A05 = recyclerView;
        recyclerView.setAdapter(r4);
        recyclerView.setLayoutManager(linearLayoutManager);
        C163327q1.A00(recyclerView, this, 9);
    }
}
