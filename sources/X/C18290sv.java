package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.0sv  reason: invalid class name and case insensitive filesystem */
public class C18290sv implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C18290sv(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        MaterialCalendar materialCalendar;
        int A1V;
        switch (this.A02) {
            case 0:
                ((AnonymousClass0V9) this.A01).A05();
                return;
            case 1:
                materialCalendar = (MaterialCalendar) this.A00;
                A1V = ((LinearLayoutManager) materialCalendar.A04.getLayoutManager()).A1V() - 1;
                if (A1V < 0) {
                    return;
                }
                break;
            default:
                materialCalendar = (MaterialCalendar) this.A00;
                A1V = ((LinearLayoutManager) materialCalendar.A04.getLayoutManager()).A1T() + 1;
                if (A1V >= materialCalendar.A04.A0G.A0J()) {
                    return;
                }
                break;
        }
        Calendar A012 = AnonymousClass0YR.A01(((C03820Hy) this.A01).A01.A05.A05);
        A012.add(2, A1V);
        materialCalendar.A1Y(new C10940fT(A012));
    }
}
