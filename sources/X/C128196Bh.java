package X;

import java.io.InputStream;

/* renamed from: X.6Bh  reason: invalid class name and case insensitive filesystem */
public final class C128196Bh {
    public final C46812bi A00;
    public final C159737jq A01;
    public final InputStream A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128196Bh) {
                C128196Bh r5 = (C128196Bh) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    public C128196Bh(C46812bi r1, C159737jq r2, InputStream inputStream) {
        this.A00 = r1;
        this.A02 = inputStream;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PttTranscriptionRequest(message=");
        A0u.append(this.A00);
        A0u.append(", input=");
        A0u.append(this.A02);
        A0u.append(", listener=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
