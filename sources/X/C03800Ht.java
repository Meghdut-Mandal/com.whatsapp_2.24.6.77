package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.0Ht  reason: invalid class name and case insensitive filesystem */
public class C03800Ht extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MaterialCalendar A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03800Ht(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.A01 = materialCalendar;
        this.A00 = i2;
    }

    public void A1k(AnonymousClass0C4 r6, int[] iArr) {
        int height;
        int i = this.A00;
        MaterialCalendar materialCalendar = this.A01;
        RecyclerView recyclerView = materialCalendar.A04;
        if (i == 0) {
            iArr[0] = recyclerView.getWidth();
            height = materialCalendar.A04.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            height = materialCalendar.A04.getHeight();
        }
        iArr[1] = height;
    }

    public void A1G(AnonymousClass0C4 r4, RecyclerView recyclerView, int i) {
        C18170sj r0 = new C18170sj(recyclerView.getContext(), this, 2);
        r0.A00 = i;
        A0g(r0);
    }
}
