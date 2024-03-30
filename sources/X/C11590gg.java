package X;

import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.0gg  reason: invalid class name and case insensitive filesystem */
public class C11590gg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MaterialCalendar A01;

    public C11590gg(MaterialCalendar materialCalendar, int i) {
        this.A01 = materialCalendar;
        this.A00 = i;
    }

    public void run() {
        this.A01.A04.A0i(this.A00);
    }
}
