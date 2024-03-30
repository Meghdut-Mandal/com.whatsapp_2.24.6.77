package X;

import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.9PM  reason: invalid class name */
public final class AnonymousClass9PM {
    public final String A00;

    public AnonymousClass9PM(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(DateFormat.getDateTimeInstance().format(new Date()));
        A0u.append(": ");
        return AnonymousClass000.A0q(this.A00, A0u);
    }
}
