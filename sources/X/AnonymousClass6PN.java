package X;

import java.io.File;

/* renamed from: X.6PN  reason: invalid class name */
public final class AnonymousClass6PN {
    public final long A00;
    public final File A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass6PN(String str) {
        this((File) null, (Long) null, str, 0, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PN) {
                AnonymousClass6PN r8 = (AnonymousClass6PN) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || this.A04 != r8.A04 || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36321k7.A00(this.A00, (C36421kH.A04(this.A03) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupProducerResult(name=");
        A0u.append(this.A03);
        A0u.append(", success=");
        A0u.append(this.A04);
        A0u.append(", totalSizeInBytes=");
        A0u.append(this.A00);
        A0u.append(", mediaSizeInBytes=");
        A0u.append(this.A02);
        A0u.append(", file=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public AnonymousClass6PN(File file, Long l, String str, long j, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A00 = j;
        this.A02 = l;
        this.A01 = file;
    }
}
