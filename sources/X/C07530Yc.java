package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0Yc  reason: invalid class name and case insensitive filesystem */
public final class C07530Yc {
    public static final C07530Yc A01 = A01(new Locale[0]);
    public final C17180qr A00;

    public static C07530Yc A00(LocaleList localeList) {
        return new C07530Yc(new C09660cj(localeList));
    }

    public static C07530Yc A01(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return A00(C05460Pu.A00(localeArr));
        }
        return new C07530Yc(new C09670ck(localeArr));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C07530Yc) || !this.A00.equals(((C07530Yc) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C07530Yc(C17180qr r1) {
        this.A00 = r1;
    }
}
