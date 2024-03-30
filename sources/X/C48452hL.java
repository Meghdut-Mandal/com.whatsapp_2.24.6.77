package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.2hL  reason: invalid class name and case insensitive filesystem */
public final class C48452hL extends C42581z3 {
    public final View A00;
    public final TextView A01;
    public final WaImageView A02;
    public final UpdatesAdapter A03;
    public final C006302t A04;

    public C48452hL(View view, UpdatesAdapter updatesAdapter, C006302t r4) {
        super(view);
        this.A03 = updatesAdapter;
        this.A04 = r4;
        this.A01 = C36391kE.A0P(view, R.id.updates_banner_text);
        this.A00 = view.findViewById(R.id.btn_close);
        this.A02 = C36421kH.A0J(view, R.id.banner_icon);
    }
}
