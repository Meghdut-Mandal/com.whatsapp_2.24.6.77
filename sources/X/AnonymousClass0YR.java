package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0YR  reason: invalid class name */
public abstract class AnonymousClass0YR {
    public static AtomicReference A00 = new AtomicReference();

    public static Calendar A02(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
            return instance;
        }
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }

    public static Calendar A00() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar A01(Calendar calendar) {
        Calendar A02 = A02(calendar);
        Calendar A022 = A02((Calendar) null);
        A022.set(A02.get(1), A02.get(2), A02.get(5));
        return A022;
    }
}
