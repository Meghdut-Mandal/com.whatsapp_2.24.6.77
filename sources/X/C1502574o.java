package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.74o  reason: invalid class name and case insensitive filesystem */
public class C1502574o implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C1502574o(Object obj, Object obj2, Object obj3, int i, long j, boolean z) {
        this.A05 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A04 = z;
        this.A03 = obj3;
    }

    public final void run() {
        TextView textView;
        Number number;
        boolean z;
        long j;
        AnonymousClass2IS r0;
        int intValue;
        switch (this.A05) {
            case 0:
                r0 = (AnonymousClass2IS) this.A01;
                textView = (TextView) this.A02;
                j = this.A00;
                z = this.A04;
                number = (Number) this.A03;
                break;
            case 1:
                r0 = (AnonymousClass2IS) this.A01;
                textView = (TextView) this.A02;
                number = (Number) this.A03;
                j = this.A00;
                z = this.A04;
                break;
            default:
                long j2 = this.A00;
                C104665Ar.A00((C158497hb) this.A03, (C104665Ar) this.A01, (C135066c4) this.A02, j2);
                return;
        }
        Context context = r0.getContext();
        String A0E = C66013Ui.A0E(r0.A0E, j);
        if (number == null) {
            if (z) {
                intValue = R.string.f12nameremoved;
            }
            textView.setText(A0E);
        }
        intValue = number.intValue();
        A0E = C36351kA.A0w(context, A0E, 1, intValue);
        textView.setText(A0E);
    }

    public C1502574o(C158497hb r2, C104665Ar r3, C135066c4 r4, long j) {
        this.A05 = 2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = true;
        this.A00 = j;
        this.A03 = r2;
    }
}
