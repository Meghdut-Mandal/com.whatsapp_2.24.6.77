package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.List;

/* renamed from: X.6C4  reason: invalid class name */
public final class AnonymousClass6C4 {
    public final int A00;
    public final VersionedCapability A01;
    public final List A02;
    public final List A03;

    public AnonymousClass6C4(VersionedCapability versionedCapability, List list, List list2, int i) {
        AnonymousClass00C.A0D(versionedCapability, 1);
        this.A01 = versionedCapability;
        this.A00 = i;
        this.A02 = list;
        this.A03 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C4) {
                AnonymousClass6C4 r5 = (AnonymousClass6C4) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36351kA.A05(this.A02, (C36391kE.A0A(this.A01) + this.A00) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeMLModelMetadata(name=");
        A0u.append(this.A01);
        A0u.append(", version=");
        A0u.append(this.A00);
        A0u.append(", assets=");
        A0u.append(this.A02);
        A0u.append(", properties=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
