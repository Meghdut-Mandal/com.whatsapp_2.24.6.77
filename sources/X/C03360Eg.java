package X;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.0Eg  reason: invalid class name and case insensitive filesystem */
public class C03360Eg extends BaseAdapter {
    public static final int A03;
    public final int A00;
    public final int A01;
    public final Calendar A02;

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
        }
        Calendar calendar = this.A02;
        int i2 = i + this.A01;
        int i3 = this.A00;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, A03, textView.getResources().getConfiguration().locale));
        String string = viewGroup.getContext().getString(R.string.f12nameremoved);
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = calendar.getDisplayName(7, 2, Locale.getDefault());
        textView.setContentDescription(String.format(string, A0L));
        return textView;
    }

    static {
        int i = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        }
        A03 = i;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.A01;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public C03360Eg(int i) {
        Calendar A022 = AnonymousClass0YR.A02((Calendar) null);
        this.A02 = A022;
        this.A00 = A022.getMaximum(7);
        this.A01 = i;
    }

    public int getCount() {
        return this.A00;
    }

    public C03360Eg() {
        Calendar A022 = AnonymousClass0YR.A02((Calendar) null);
        this.A02 = A022;
        this.A00 = A022.getMaximum(7);
        this.A01 = A022.getFirstDayOfWeek();
    }
}
