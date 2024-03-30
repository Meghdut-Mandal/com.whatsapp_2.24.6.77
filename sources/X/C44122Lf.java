package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2Lf  reason: invalid class name and case insensitive filesystem */
public class C44122Lf extends AnonymousClass141 {
    public static String A02;
    public final C19630wG A00;
    public final C20010ws A01;

    public long A0I() {
        return -2;
    }

    public boolean A0N() {
        return true;
    }

    public boolean A0O() {
        return true;
    }

    public C44122Lf(C19630wG r4, C18820ts r5) {
        super(C177638e7.A00);
        C71093gD r2 = C71093gD.A00;
        this.A01 = r2;
        this.A00 = r4;
        this.A08 = 3;
        this.A0A = -2;
        r5.A09.add(r2);
    }

    public String A0J() {
        Context context = this.A00.A00;
        String str = A02;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.f12nameremoved);
        A02 = string;
        return string;
    }

    public void A0M(String str) {
        C18740tg.A0D(false, "Setting verified name for ServerContact not allowed");
    }

    public static String A02(Context context, int i) {
        Object[] A0L = AnonymousClass001.A0L();
        String str = A02;
        if (str == null) {
            str = context.getString(R.string.f12nameremoved);
            A02 = str;
        }
        return C36381kD.A0r(context, str, A0L, i);
    }

    public String A0K() {
        return A0J();
    }

    public void A0L(long j) {
        C36341k9.A1M("Attempting to set the id of the server contact to=", AnonymousClass000.A0u(), j);
    }
}
