package X;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.9dn  reason: invalid class name and case insensitive filesystem */
public class C198569dn {
    public static final Pattern A01 = Pattern.compile("\\s*,\\s*");
    public final List A00;

    public C198569dn(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public String toString() {
        return C165567td.A0Y(C201749kK.A00(this.A00, ",", ""), C90484aE.A0p());
    }
}
