package X;

import java.util.List;

/* renamed from: X.55c  reason: invalid class name and case insensitive filesystem */
public final class C1033755c extends C110675b3 {
    public final Integer A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1033755c) {
                C1033755c r5 = (C1033755c) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, C36391kE.A0A(this.A02)) + 1231) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public C1033755c(Integer num, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiData(sections=");
        A0u.append(this.A02);
        A0u.append(", items=");
        A0u.append(this.A01);
        C90484aE.A1K(A0u, ", isFinalData=");
        A0u.append(", qplInstanceKey=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
