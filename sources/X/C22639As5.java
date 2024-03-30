package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: X.As5  reason: case insensitive filesystem */
public class C22639As5 extends AnonymousClass120 implements C16580pk {
    public AnonymousClass121 A00;

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public String toString() {
        return A0A();
    }

    public static C22639As5 A00(Object obj) {
        if (obj == null || (obj instanceof C22639As5)) {
            return (C22639As5) obj;
        }
        if ((obj instanceof C22650AsG) || (obj instanceof C22655AsL)) {
            return new C22639As5((AnonymousClass121) obj);
        }
        throw C165567td.A0N(obj, "unknown object in factory: ", AnonymousClass000.A0u());
    }

    public String A0A() {
        String str;
        AnonymousClass121 r1 = this.A00;
        if (!(r1 instanceof C22650AsG)) {
            return ((C22655AsL) r1).A0H();
        }
        String A0H = ((C22650AsG) r1).A0H();
        char A002 = C165597tg.A00(A0H);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A002 < '5') {
            str = "20";
        } else {
            str = "19";
        }
        return AnonymousClass000.A0p(str, A0H, A0u);
    }

    public Date A0B() {
        StringBuilder A0u;
        String str;
        try {
            AnonymousClass121 r4 = this.A00;
            if (!(r4 instanceof C22650AsG)) {
                return ((C22655AsL) r4).A0I();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String A0H = ((C22650AsG) r4).A0H();
            if (C165597tg.A00(A0H) < '5') {
                A0u = AnonymousClass000.A0u();
                str = "20";
            } else {
                A0u = AnonymousClass000.A0u();
                str = "19";
            }
            return C129916Iz.A00(simpleDateFormat.parse(AnonymousClass000.A0p(str, A0H, A0u)));
        } catch (ParseException e) {
            throw AnonymousClass001.A09(C36331k8.A0i("invalid date string: ", AnonymousClass000.A0u(), e));
        }
    }

    public C22639As5(Date date, Locale locale) {
        AnonymousClass121 arH;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String A0p = AnonymousClass000.A0p(simpleDateFormat.format(date), "Z", AnonymousClass000.A0u());
        int parseInt = Integer.parseInt(A0p.substring(0, 4));
        if (parseInt < 1950 || parseInt > 2049) {
            arH = new C22589ArH(A0p);
        } else {
            arH = new C22682Asm(A0p.substring(2));
        }
        this.A00 = arH;
    }

    public C22639As5(AnonymousClass121 r2) {
        if ((r2 instanceof C22650AsG) || (r2 instanceof C22655AsL)) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass001.A08("unknown object passed to Time");
    }
}
