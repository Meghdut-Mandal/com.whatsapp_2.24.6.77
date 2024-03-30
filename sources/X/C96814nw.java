package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4nw  reason: invalid class name and case insensitive filesystem */
public final class C96814nw extends AnonymousClass0D3 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C006302t A03;
    public final View.OnClickListener A04;

    public C96814nw(View view, C006302t r7) {
        super(view);
        this.A03 = r7;
        this.A02 = C36391kE.A0P(view, R.id.text_options_value);
        this.A01 = C36391kE.A0P(view, R.id.text_options_availability);
        this.A00 = view.findViewById(R.id.text_options_selection_mark);
        C135426cg r4 = new C135426cg(this, 43);
        this.A04 = r4;
        View view2 = this.A0H;
        C012005e.A0Y(view2, AnonymousClass0Yd.A08, (C16710px) null, view.getResources().getString(R.string.f12nameremoved));
        view2.setOnClickListener(r4);
    }
}
