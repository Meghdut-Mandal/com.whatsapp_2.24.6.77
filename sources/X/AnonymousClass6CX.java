package X;

import java.io.File;

/* renamed from: X.6CX  reason: invalid class name */
public final class AnonymousClass6CX {
    public final C46812bi A00;
    public final C159737jq A01;
    public final C158677ht A02;
    public final File A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CX) {
                AnonymousClass6CX r5 = (AnonymousClass6CX) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36391kE.A0A(this.A00))));
    }

    public AnonymousClass6CX(C46812bi r1, C159737jq r2, C158677ht r3, File file) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TranscriptionArgs(message=");
        A0u.append(this.A00);
        A0u.append(", inputFile=");
        A0u.append(this.A03);
        A0u.append(", transcriptionEngine=");
        A0u.append(this.A02);
        A0u.append(", listener=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
