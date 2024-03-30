package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.0I1  reason: invalid class name */
public class AnonymousClass0I1 extends C02910Cj {
    public final Calendar A00 = AnonymousClass0YR.A02((Calendar) null);
    public final Calendar A01 = AnonymousClass0YR.A02((Calendar) null);
    public final /* synthetic */ MaterialCalendar A02;

    public AnonymousClass0I1(MaterialCalendar materialCalendar) {
        this.A02 = materialCalendar;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r3, RecyclerView recyclerView) {
        if ((recyclerView.A0G instanceof AnonymousClass0Hx) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw AnonymousClass001.A0A("getSelectedRanges");
        }
    }
}
