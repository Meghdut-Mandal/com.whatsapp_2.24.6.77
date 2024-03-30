package X;

import java.util.List;

/* renamed from: X.03Z  reason: invalid class name */
public abstract class AnonymousClass03Z extends AnonymousClass03Y {
    public static final int A0F(List list, int i) {
        if (new C15020mZ(0, list.size() - 1).A02(i)) {
            return (list.size() - 1) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C15020mZ(0, list.size() - 1));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final int A0G(List list, int i) {
        if (new C15020mZ(0, list.size()).A02(i)) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C15020mZ(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
