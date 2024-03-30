package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.whatsapp.R;

/* renamed from: X.0IH  reason: invalid class name */
public class AnonymousClass0IH extends AnonymousClass0D3 {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public AnonymousClass0IH(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.A00 = textView;
        C012005e.A0a(textView, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
