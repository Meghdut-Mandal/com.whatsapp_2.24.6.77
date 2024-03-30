package X;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.0Hy  reason: invalid class name and case insensitive filesystem */
public class C03820Hy extends AnonymousClass0CZ {
    public final int A00;
    public final C08720bD A01;
    public final C16090oX A02;

    public long A0E(int i) {
        Calendar A012 = AnonymousClass0YR.A01(this.A01.A05.A05);
        A012.add(2, i);
        return new C10940fT(A012).A05.getTimeInMillis();
    }

    public int A0J() {
        return this.A01.A02;
    }

    public int A0L(C10940fT r5) {
        C10940fT r3 = this.A01.A05;
        if (r3.A05 instanceof GregorianCalendar) {
            return ((r5.A04 - r3.A04) * 12) + (r5.A03 - r3.A03);
        }
        throw AnonymousClass001.A08("Only Gregorian calendars are supported.");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        AnonymousClass0IH r82 = (AnonymousClass0IH) r8;
        C08720bD r4 = this.A01;
        Calendar A012 = AnonymousClass0YR.A01(r4.A05.A05);
        A012.add(2, i);
        C10940fT r5 = new C10940fT(A012);
        TextView textView = r82.A00;
        String str = r5.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, r5.A05.getTimeInMillis(), 8228);
            r5.A00 = str;
        }
        textView.setText(str);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) r82.A01.findViewById(R.id.month_grid);
        if (materialCalendarGridView.A00() == null || !r5.equals(materialCalendarGridView.A00().A02)) {
            new C03350Ef(r4, r5);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.A00();
        throw AnonymousClass001.A0A("iterator");
    }

    public C03820Hy(Context context, C08720bD r5, C16090oX r6) {
        int i;
        C10940fT r0 = r5.A05;
        C10940fT r2 = r5.A04;
        C10940fT r1 = r5.A00;
        Calendar calendar = r0.A05;
        Calendar calendar2 = r1.A05;
        if (calendar.compareTo(calendar2) > 0) {
            throw AnonymousClass001.A08("firstPage cannot be after currentPage");
        } else if (calendar2.compareTo(r2.A05) <= 0) {
            int dimensionPixelSize = C03350Ef.A03 * context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (C014506h.A03(context, 16843277)) {
                i = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            } else {
                i = 0;
            }
            this.A00 = dimensionPixelSize + i;
            this.A01 = r5;
            this.A02 = r6;
            A0B(true);
        } else {
            throw AnonymousClass001.A08("currentPage cannot be after lastPage");
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
        if (C014506h.A03(viewGroup.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new AnonymousClass0D2(-1, this.A00));
            z = true;
        }
        return new AnonymousClass0IH(linearLayout, z);
    }
}
