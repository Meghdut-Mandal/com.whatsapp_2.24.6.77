package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.0Hx  reason: invalid class name */
public class AnonymousClass0Hx extends AnonymousClass0CZ {
    public final MaterialCalendar A00;

    public int A0J() {
        return this.A00.A06.A03;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        int i2 = this.A00.A06.A05.A04 + i;
        TextView textView = ((AnonymousClass0IG) r9).A00;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        Context context = textView.getContext();
        int i3 = AnonymousClass0YR.A00().get(1);
        int i4 = R.string.f12nameremoved;
        if (i3 == i2) {
            i4 = R.string.f12nameremoved;
        }
        textView.setContentDescription(String.format(context.getString(i4), new Object[]{valueOf}));
        AnonymousClass0YR.A00().get(1);
        throw AnonymousClass001.A0A("getSelectedDays");
    }

    public AnonymousClass0Hx(MaterialCalendar materialCalendar) {
        this.A00 = materialCalendar;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new AnonymousClass0IG((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false));
    }
}
