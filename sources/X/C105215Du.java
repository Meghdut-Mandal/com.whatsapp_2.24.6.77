package X;

import java.util.Queue;

/* renamed from: X.5Du  reason: invalid class name and case insensitive filesystem */
public class C105215Du extends AnonymousClass5EQ {
    public final C159277j6 A00;
    public final Queue A01;

    public C105215Du(C159277j6 r2, Queue queue) {
        super(41);
        this.A01 = queue;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return C1901797e.A00(this.A01, ((C105215Du) obj).A01);
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, super.hashCode());
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A00, A1Q);
    }
}
