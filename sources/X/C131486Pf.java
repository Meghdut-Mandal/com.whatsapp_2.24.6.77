package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.6Pf  reason: invalid class name and case insensitive filesystem */
public class C131486Pf {
    public static final boolean A02 = C36371kC.A1T(Build.VERSION.SDK_INT, 24);
    public final DecimalFormat A00;
    public final AnonymousClass6L3 A01;

    public Number A00(String str) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C18740tg.A06(decimalFormat);
            return decimalFormat.parse(str);
        }
        AnonymousClass6L3 r0 = this.A01;
        C18740tg.A06(r0);
        return r0.A01.parse(str.replace(String.valueOf(r0.A00), ""));
    }

    public String A01() {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C18740tg.A06(decimalFormat);
            return decimalFormat.format(1.0d);
        }
        AnonymousClass6L3 r1 = this.A01;
        C18740tg.A06(r1);
        return AnonymousClass6L3.A00(r1, r1.A01.format(1.0d));
    }

    public String A02(BigDecimal bigDecimal) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C18740tg.A06(decimalFormat);
            return decimalFormat.format(bigDecimal);
        }
        AnonymousClass6L3 r1 = this.A01;
        C18740tg.A06(r1);
        return AnonymousClass6L3.A00(r1, r1.A01.format(bigDecimal));
    }

    public void A03(int i) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            C18740tg.A06(decimalFormat);
            decimalFormat.setMinimumFractionDigits(i);
            decimalFormat.setMaximumFractionDigits(i);
            return;
        }
        AnonymousClass6L3 r0 = this.A01;
        C18740tg.A06(r0);
        java.text.DecimalFormat decimalFormat2 = r0.A01;
        decimalFormat2.setMinimumFractionDigits(i);
        decimalFormat2.setMaximumFractionDigits(i);
    }

    public C131486Pf(String str, Locale locale) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new AnonymousClass6L3(str, locale);
        }
    }
}
