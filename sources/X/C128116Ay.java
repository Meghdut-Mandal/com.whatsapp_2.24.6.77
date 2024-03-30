package X;

import java.util.HashMap;

/* renamed from: X.6Ay  reason: invalid class name and case insensitive filesystem */
public class C128116Ay {
    public final int A00;
    public final int A01;
    public final C108365Tf A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C128116Ay r5 = (C128116Ay) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1K(objArr, this.A01);
        C36331k8.A1V(objArr, this.A00);
        Boolean A0j = C36381kD.A0j();
        objArr[3] = A0j;
        return AnonymousClass000.A0M(A0j, objArr, 4);
    }

    public C128116Ay(C108365Tf r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("codec", this.A02);
        A0J.put("profile", Integer.valueOf(this.A01));
        A0J.put("level", Integer.valueOf(this.A00));
        A0J.put("useBframe", C36381kD.A0j());
        return C131736Qi.A01(C128116Ay.class, A0J);
    }
}
