package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.78x  reason: invalid class name and case insensitive filesystem */
public final class C1512778x extends GregorianCalendar implements AnonymousClass4O4 {
    public int bucketCount;
    public final Context context;
    public final int id;
    public final C18820ts whatsAppLocale;

    public String toString() {
        String string;
        C18820ts r2;
        Locale locale;
        int i;
        int i2 = this.id;
        if (i2 != 1) {
            if (i2 == 2) {
                r2 = this.whatsAppLocale;
                locale = C36401kF.A0x(r2);
                i = 233;
            } else if (i2 != 3) {
                C18820ts r4 = this.whatsAppLocale;
                long timeInMillis = getTimeInMillis();
                if (i2 != 4) {
                    string = C36361kB.A0o(r4.A0A(177), C36401kF.A0x(r4), timeInMillis);
                } else {
                    Calendar instance = Calendar.getInstance(C36401kF.A0x(r4));
                    instance.setTimeInMillis(timeInMillis);
                    string = AnonymousClass6Rb.A00(r4)[instance.get(2)];
                }
            } else {
                r2 = this.whatsAppLocale;
                locale = C36401kF.A0x(r2);
                i = 232;
            }
            string = C20040wv.A0A(locale, r2.A0A(i));
        } else {
            string = this.context.getString(R.string.f12nameremoved);
        }
        AnonymousClass00C.A08(string);
        return string;
    }

    public C1512778x(Context context2, C18820ts r3, C1512778x r4) {
        C36321k7.A0x(context2, r3);
        this.id = r4.id;
        this.context = context2;
        this.bucketCount = r4.bucketCount;
        setTime(r4.getTime());
        this.whatsAppLocale = r3;
    }

    public /* bridge */ /* synthetic */ C1512778x A00() {
        super.clone();
        return new C1512778x(this.context, this.whatsAppLocale, this);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        super.clone();
        return new C1512778x(this.context, this.whatsAppLocale, this);
    }

    public C1512778x(Context context2, C18820ts r3, Calendar calendar, int i) {
        this.id = i;
        this.context = context2;
        setTime(calendar.getTime());
        this.whatsAppLocale = r3;
    }
}
