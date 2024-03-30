package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.9gT  reason: invalid class name and case insensitive filesystem */
public class C200039gT {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200039gT)) {
            return false;
        }
        C200039gT r4 = (C200039gT) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public static C200039gT A00(AnonymousClass8QY r3) {
        int i = r3.bitField0_;
        if ((i & 1) == 0 || (i & 2) == 0 || r3.deviceIndexes_.size() == 0) {
            return null;
        }
        return new C200039gT(C90524aI.A0k(r3.deviceIndexes_), r3.rawId_, r3.currentIndex_);
    }

    public AnonymousClass8QY A01() {
        AnonymousClass8NN A0p = AnonymousClass8QY.DEFAULT_INSTANCE.A0p();
        int i = this.A01;
        AnonymousClass8QY r1 = (AnonymousClass8QY) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.rawId_ = i;
        int i2 = this.A00;
        AnonymousClass8QY r12 = (AnonymousClass8QY) C90524aI.A0H(A0p);
        r12.bitField0_ |= 2;
        r12.currentIndex_ = i2;
        Set set = this.A02;
        AnonymousClass8QY r2 = (AnonymousClass8QY) C90524aI.A0H(A0p);
        B62 b62 = r2.deviceIndexes_;
        boolean z = ((C21886AcE) b62).A00;
        AnonymousClass8I0 r13 = b62;
        if (!z) {
            AnonymousClass8I0 A09 = C170918Hz.A09(b62);
            r2.deviceIndexes_ = A09;
            r13 = A09;
        }
        C21071A7i.A0O(set, r13);
        return (AnonymousClass8QY) A0p.A0R();
    }

    public C200039gT(Set set, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A01);
        AnonymousClass000.A1K(A1Q, this.A00);
        return C90484aE.A0D(this.A02, A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdKeyFingerprint{");
        A0u.append("rawId=");
        A0u.append(this.A01);
        A0u.append(", currentIndex=");
        A0u.append(this.A00);
        A0u.append(", deviceIndexes=");
        return C90464aC.A0X(this.A02, A0u);
    }
}
