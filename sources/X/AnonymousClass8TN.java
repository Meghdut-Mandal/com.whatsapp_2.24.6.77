package X;

import java.util.List;

/* renamed from: X.8TN  reason: invalid class name */
public class AnonymousClass8TN extends C196179Ya {
    public final String A00;
    public final List A01;

    public AnonymousClass8TN(List list, char c) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = Character.toString(c);
            return;
        }
        throw C173738Sv.A00("Empty properties");
    }
}
