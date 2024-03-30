package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.5El  reason: invalid class name and case insensitive filesystem */
public class C105385El extends C46482Xv {
    public final ViewGroup A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105245Dx r10 = (C105245Dx) obj;
        ViewGroup viewGroup = this.A00;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup A0O = C36411kG.A0O(this.A0H, R.id.shimmer_items);
        A0O.removeAllViews();
        if (r10.A00) {
            from.inflate(R.layout.f9nameremoved, A0O, true);
        }
        if (r10.A01) {
            from.inflate(R.layout.f9nameremoved, A0O, true);
        }
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            i = C36431kI.A04(viewGroup.getChildAt(i2), i);
        }
        int round = Math.round(((float) (viewGroup.getHeight() - i)) / ((float) resources.getDimensionPixelSize(R.dimen.f7nameremoved)));
        for (int i3 = 0; i3 < round; i3++) {
            from.inflate(R.layout.f9nameremoved, A0O, true);
        }
    }

    public C105385El(View view, ViewGroup viewGroup) {
        super(view);
        this.A00 = viewGroup;
    }
}
