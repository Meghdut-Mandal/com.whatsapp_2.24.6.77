package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.5Et  reason: invalid class name and case insensitive filesystem */
public class C105465Et extends C46482Xv {
    public final WaImageView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105265Dz r6 = (C105265Dz) obj;
        WaTextView waTextView = this.A01;
        View view = this.A0H;
        Context context = view.getContext();
        AnonymousClass6QG r1 = r6.A00;
        waTextView.setText(C131846Qw.A01(context, r1));
        WaImageView waImageView = this.A00;
        Context context2 = view.getContext();
        boolean equals = "device".equals(r1.A08);
        int i = R.drawable.business_directory_ic_location;
        if (equals) {
            i = R.drawable.ic_location_nearby;
        }
        C36391kE.A18(context2, waImageView, i);
        view.setOnClickListener(r6.A01);
    }

    public C105465Et(View view) {
        super(view);
        this.A00 = C36431kI.A0X(view, R.id.location_icon);
        this.A01 = C36401kF.A0Q(view, R.id.search_location_address);
    }
}
