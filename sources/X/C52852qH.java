package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2qH  reason: invalid class name and case insensitive filesystem */
public final class C52852qH extends Exception {
    public static final long serialVersionUID = 3026362227162912146L;
    public final String message;
    public final List throwables;

    public C52852qH(List list) {
        this.throwables = Collections.unmodifiableList(C36441kJ.A15(list));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(list.size());
        A0u.append(" exceptions occurred: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.append(((Throwable) it.next()).getMessage());
            A0u.append(";");
        }
        this.message = A0u.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
