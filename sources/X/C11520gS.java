package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
public class C11520gS implements Runnable {
    public final /* synthetic */ AnonymousClass0ZB A00;
    public final /* synthetic */ AnonymousClass0I4 A01;

    public C11520gS(AnonymousClass0ZB r1, AnonymousClass0I4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0I4 r4 = this.A01;
        RecyclerView recyclerView = r4.A0I;
        if (recyclerView != null && recyclerView.A0V) {
            AnonymousClass0ZB r1 = this.A00;
            if (!r1.A04 && r1.A0C.A04() != -1) {
                C02800By r0 = recyclerView.A0H;
                if (r0 == null || !r0.A0D()) {
                    List list = r4.A0K;
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        if (((AnonymousClass0ZB) list.get(i)).A05) {
                            i++;
                        }
                    }
                    return;
                }
                r4.A0I.post(this);
            }
        }
    }
}
