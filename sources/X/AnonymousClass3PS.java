package X;

import java.security.MessageDigest;

/* renamed from: X.3PS  reason: invalid class name */
public class AnonymousClass3PS {
    public int A00;
    public long A01 = -1;
    public String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3PS)) {
            return false;
        }
        AnonymousClass3PS r7 = (AnonymousClass3PS) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && C1901797e.A00(this.A02, r7.A02) && C1901797e.A00(this.A03, r7.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        AnonymousClass000.A1K(objArr, this.A00);
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(Long.valueOf(this.A01), objArr, 3);
    }

    public AnonymousClass3PS(String str) {
        this.A03 = str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(C19430v1.A0D));
            this.A02 = C36441kJ.A13(instance.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AnonymousClass3PS(String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
    }
}
