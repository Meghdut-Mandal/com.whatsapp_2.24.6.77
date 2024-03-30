package X;

import java.io.Serializable;

/* renamed from: X.72I  reason: invalid class name */
public class AnonymousClass72I implements Serializable {
    public static final long serialVersionUID = 0;
    public String name;
    public String sha1Hash;
    public String sha256Hash;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass72I)) {
            return false;
        }
        AnonymousClass72I r4 = (AnonymousClass72I) obj;
        String str = this.sha256Hash;
        String str2 = r4.sha256Hash;
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        String str3 = this.sha1Hash;
        String str4 = r4.sha1Hash;
        if (str3 == null || str4 == null || !str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.sha256Hash;
        if (str == null) {
            str = this.sha1Hash;
        }
        return str.hashCode();
    }

    public AnonymousClass72I(String str, String str2, String str3) {
        this.name = str;
        if (str2.length() == 27) {
            this.sha1Hash = str2;
            if (str3.length() == 43) {
                this.sha256Hash = str3;
                return;
            }
            throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
        }
        throw new SecurityException("Invalid SHA1 key hash - should be 160-bit.");
    }
}
