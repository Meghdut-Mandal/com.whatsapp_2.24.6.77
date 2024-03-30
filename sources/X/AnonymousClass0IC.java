package X;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.0IC  reason: invalid class name */
public class AnonymousClass0IC extends AnonymousClass0UE {
    public final /* synthetic */ MaterialButton A00;
    public final /* synthetic */ MaterialCalendar A01;
    public final /* synthetic */ C03820Hy A02;

    public AnonymousClass0IC(MaterialButton materialButton, MaterialCalendar materialCalendar, C03820Hy r3) {
        this.A01 = materialCalendar;
        this.A02 = r3;
        this.A00 = materialButton;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.A00.getText());
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1V;
        MaterialCalendar materialCalendar = this.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) materialCalendar.A04.getLayoutManager();
        if (i < 0) {
            A1V = linearLayoutManager.A1T();
        } else {
            A1V = linearLayoutManager.A1V();
        }
        Calendar calendar = this.A02.A01.A05.A05;
        Calendar A012 = AnonymousClass0YR.A01(calendar);
        A012.add(2, A1V);
        materialCalendar.A07 = new C10940fT(A012);
        MaterialButton materialButton = this.A00;
        Calendar A013 = AnonymousClass0YR.A01(calendar);
        A013.add(2, A1V);
        C10940fT r1 = new C10940fT(A013);
        String str = r1.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, r1.A05.getTimeInMillis(), 8228);
        }
        materialButton.setText(str);
    }
}
