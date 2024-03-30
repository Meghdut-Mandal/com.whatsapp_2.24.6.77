package X;

import java.util.List;

/* renamed from: X.6D8  reason: invalid class name */
public final class AnonymousClass6D8 {
    public final List A00;
    public final int A01;
    public final int A02;
    public final C108245St A03;
    public final C107855Rd A04;
    public final String A05;

    public AnonymousClass6D8(C108245St r2, C107855Rd r3, String str, List list, int i, int i2) {
        C36421kH.A1J(r2, 2, r3);
        this.A00 = list;
        this.A03 = r2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = r3;
        this.A05 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D8) {
                AnonymousClass6D8 r5 = (AnonymousClass6D8) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && AnonymousClass00C.A0J(this.A05, r5.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A00);
        return C90504aG.A0B(this.A05, C36351kA.A05(this.A04, (((C36351kA.A05(this.A03, A0A) + this.A01) * 31) + this.A02) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARDGetModelMetadataEntity(models=");
        A0u.append(this.A00);
        A0u.append(", entryPoint=");
        A0u.append(this.A03);
        A0u.append(", assetCount=");
        A0u.append(this.A01);
        A0u.append(", modelCount=");
        A0u.append(this.A02);
        A0u.append(", status=");
        A0u.append(this.A04);
        A0u.append(", statusDetails=");
        return C36321k7.A0E(this.A05, A0u);
    }
}
