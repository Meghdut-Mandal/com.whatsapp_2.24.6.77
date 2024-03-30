package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public final class C09660cj implements C17180qr {
    public final LocaleList A00;

    public Locale B85(int i) {
        return this.A00.get(0);
    }

    public boolean equals(Object obj) {
        return this.A00.equals(((C17180qr) obj).BDc());
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C09660cj(Object obj) {
        this.A00 = (LocaleList) obj;
    }

    public Object BDc() {
        return this.A00;
    }
}
