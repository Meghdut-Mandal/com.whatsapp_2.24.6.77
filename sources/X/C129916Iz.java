package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6Iz  reason: invalid class name and case insensitive filesystem */
public abstract class C129916Iz {
    public static Locale A00;
    public static Long A01 = C36411kG.A0t();
    public static final Map A02 = AnonymousClass001.A0J();

    static {
        Locale locale;
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i == availableLocales.length) {
                    break;
                } else if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                } else {
                    i++;
                }
            }
            A00 = locale;
        }
        locale = Locale.getDefault();
        A00 = locale;
    }

    public static Date A00(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = A02;
        synchronized (map) {
            Long l = (Long) map.get(locale);
            if (l == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                if (time == 0) {
                    l = A01;
                } else {
                    l = Long.valueOf(time);
                }
                map.put(locale, l);
            }
            if (l == A01) {
                return date;
            }
            Date date2 = new Date(date.getTime() - l.longValue());
            return date2;
        }
    }
}
