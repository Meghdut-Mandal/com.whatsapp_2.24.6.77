package X;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.78s  reason: invalid class name and case insensitive filesystem */
public class C1512278s extends Permission {
    public final Set actions;

    public boolean equals(Object obj) {
        return (obj instanceof C1512278s) && this.actions.equals(((C1512278s) obj).actions);
    }

    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof C1512278s)) {
            return false;
        }
        C1512278s r4 = (C1512278s) permission;
        return getName().equals(r4.getName()) || this.actions.containsAll(r4.actions);
    }

    public C1512278s(String str) {
        super(str);
        HashSet A16 = C36441kJ.A16();
        this.actions = A16;
        A16.add(str);
    }
}
