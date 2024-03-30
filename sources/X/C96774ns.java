package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.4ns  reason: invalid class name and case insensitive filesystem */
public class C96774ns extends AnonymousClass0D3 {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public C96774ns(Context context, ViewGroup viewGroup) {
        super(C36361kB.A0E(LayoutInflater.from(context), viewGroup, R.layout.f9nameremoved));
        View view = this.A0H;
        this.A02 = C36391kE.A0N(view, R.id.icon);
        this.A00 = view.findViewById(R.id.badge);
        this.A01 = view.findViewById(R.id.sel_marker);
    }
}
