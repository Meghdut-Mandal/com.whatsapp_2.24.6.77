package X;

import android.content.ComponentName;

/* renamed from: X.9V7  reason: invalid class name */
public final class AnonymousClass9V7 {
    public final ComponentName A00;

    public AnonymousClass9V7(ComponentName componentName) {
        AnonymousClass00C.A0D(componentName, 1);
        this.A00 = componentName;
        String packageName = componentName.getPackageName();
        AnonymousClass00C.A08(packageName);
        String className = componentName.getClassName();
        AnonymousClass00C.A08(className);
        int length = packageName.length();
        if (length > 0) {
            int length2 = className.length();
            if (length2 <= 0) {
                throw AnonymousClass001.A08("Activity class name must not be empty.");
            } else if (C90494aF.A1Z(packageName, "*") && AnonymousClass099.A0C(packageName, "*", 0, false) != length - 1) {
                throw AnonymousClass001.A08("Wildcard in package name is only allowed at the end.");
            } else if (C90494aF.A1Z(className, "*") && AnonymousClass099.A0C(className, "*", 0, false) != length2 - 1) {
                throw AnonymousClass001.A08("Wildcard in class name is only allowed at the end.");
            }
        } else {
            throw AnonymousClass001.A08("Package name must not be empty");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9V7) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass9V7) obj).A00));
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ActivityFilter(componentName=");
        A0u.append(this.A00);
        A0u.append(", intentAction=");
        return C36321k7.A0E((String) null, A0u);
    }
}
