package X;

import com.whatsapp.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.78w  reason: invalid class name and case insensitive filesystem */
public class C1512678w extends GregorianCalendar {
    public int count;
    public int id;
    public C18820ts whatsAppLocale;

    public C1512678w(C18820ts r2, Calendar calendar, int i) {
        this.whatsAppLocale = r2;
        this.id = i;
        setTime(calendar.getTime());
    }

    public String toString() {
        DateFormat A0C;
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A0B(R.string.f12nameremoved);
        }
        C18820ts r4 = this.whatsAppLocale;
        Locale A0x = C36401kF.A0x(r4);
        Calendar instance = Calendar.getInstance(A0x);
        instance.setTimeInMillis(timeInMillis);
        if (instance.get(1) == Calendar.getInstance(A0x).get(1)) {
            A0C = C20040wv.A0B(r4);
        } else {
            A0C = C20040wv.A0C(r4, 0);
        }
        return A0C.format(instance.getTime());
    }
}
