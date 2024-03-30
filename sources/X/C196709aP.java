package X;

import java.util.List;

/* renamed from: X.9aP  reason: invalid class name and case insensitive filesystem */
public abstract class C196709aP {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(AnonymousClass96W.A00(AnonymousClass99b.A00));
        A0z.append(" FROM ");
        C36381kD.A1O(A0z, "contacts");
        A00 = AnonymousClass000.A0q("jid = ?", A0z);
    }

    public static String A00(List list, long j, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!list.isEmpty() && !z) {
            A0u.append(" WHERE ");
            for (int i = 0; i < list.size(); i++) {
                String A0s = C36401kF.A0s(list, i);
                A0u.append("consumer_status");
                A0u.append(" & ");
                A0u.append(j);
                A0u.append(" = ");
                A0u.append(A0s);
                if (i < C36431kI.A07(list)) {
                    A0u.append(" OR ");
                }
            }
        }
        return A0u.toString();
    }
}
