package X;

import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.5Gk  reason: invalid class name */
public class AnonymousClass5Gk extends C1512678w {
    public String toString() {
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A0B(R.string.f12nameremoved);
        }
        C18820ts r4 = this.whatsAppLocale;
        return C36361kB.A0o(r4.A0A(178), C36401kF.A0x(r4), timeInMillis);
    }

    public AnonymousClass5Gk(C18820ts r1, Calendar calendar, int i) {
        super(r1, calendar, i);
    }
}
