package X;

import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.660  reason: invalid class name */
public abstract class AnonymousClass660 {
    public final ThreadLocal A00 = new C1511178h(this);

    public Object A00() {
        Locale locale;
        String str;
        switch (((C162967pR) this).A00) {
            case 0:
                locale = Locale.US;
                str = "yyyy-MM-dd HH:mm:ss.SSSZ";
                break;
            case 3:
                locale = Locale.US;
                str = "MMM dd, yyyy";
                break;
            case 4:
                locale = Locale.US;
                str = "yyyy-MM-dd";
                break;
            default:
                return new GregorianCalendar();
        }
        return new SimpleDateFormat(str, locale);
    }

    public synchronized Object A01() {
        Object obj;
        ThreadLocal threadLocal = this.A00;
        obj = ((WeakReference) threadLocal.get()).get();
        if (obj == null) {
            obj = A00();
            threadLocal.set(AnonymousClass001.A0F(obj));
        }
        return obj;
    }
}
