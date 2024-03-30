package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6W7  reason: invalid class name */
public final class AnonymousClass6W7 {
    public final AnonymousClass12O A00;
    public final C19730wQ A01;
    public final AnonymousClass17Z A02;

    public boolean A04(UserJid userJid) {
        PhoneUserJid A0n;
        if (userJid instanceof PhoneUserJid) {
            String str = userJid.user;
            if (str == null || !str.startsWith(String.valueOf(91))) {
                return false;
            }
            return true;
        }
        if (userJid instanceof C223313w) {
            A0n = this.A00.A0A((C223313w) userJid);
            if (A0n == null) {
                return true;
            }
        } else if ((userJid instanceof C223613z) || (userJid instanceof C177648e8)) {
            A0n = C36441kJ.A0n(this.A01);
        }
        return A04(A0n);
        return false;
    }

    public static int A00(AnonymousClass3L0 r1) {
        if (r1 == null) {
            return 1;
        }
        if (r1.A01()) {
            return 3;
        }
        if (!r1.A02()) {
            return 1;
        }
        return 2;
    }

    public static SpannableString A01(Context context, C134726bV r3, C132386Tk r4, C18820ts r5, BigDecimal bigDecimal, Date date) {
        if (bigDecimal == null || r4 == null) {
            return C36441kJ.A0O(context.getString(R.string.f12nameremoved));
        }
        String A03 = r4.A03(r5, bigDecimal, true);
        if (r3 == null || !r3.A00(date)) {
            return C36441kJ.A0O(A03);
        }
        return A02(A03, r4.A03(r5, r3.A00, true));
    }

    public AnonymousClass6W7(C19730wQ r1, AnonymousClass17Z r2, AnonymousClass12O r3) {
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }

    public static SpannableString A02(String str, String str2) {
        SpannableString A0O = C36441kJ.A0O(AnonymousClass000.A0p("  ", str, AnonymousClass000.A0v(str2)));
        A0O.setSpan(new StrikethroughSpan(), str2.length() + 1, A0O.length(), 33);
        return A0O;
    }

    public static boolean A03(Locale locale) {
        String upperCase = locale.getCountry().toUpperCase();
        String country = Locale.UK.getCountry();
        String country2 = Locale.US.getCountry();
        if (upperCase.equalsIgnoreCase(country) || upperCase.equalsIgnoreCase(country2)) {
            return true;
        }
        return false;
    }
}
