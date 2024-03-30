package X;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: X.11p  reason: invalid class name */
public class AnonymousClass11p extends BasicPermission {
    public final String actions;
    public final int permissionMask;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass11p)) {
                return false;
            }
            AnonymousClass11p r4 = (AnonymousClass11p) obj;
            if (this.permissionMask != r4.permissionMask || !getName().equals(r4.getName())) {
                return false;
            }
        }
        return true;
    }

    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof AnonymousClass11p) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.permissionMask;
        int i2 = ((AnonymousClass11p) permission).permissionMask;
        return (i & i2) == i2;
    }

    public AnonymousClass11p(String str) {
        super("SC", str);
        this.actions = str;
        StringTokenizer stringTokenizer = new StringTokenizer(AnonymousClass11q.A00(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.permissionMask = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }
}
