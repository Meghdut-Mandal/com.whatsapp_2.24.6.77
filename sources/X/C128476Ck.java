package X;

import java.util.List;

/* renamed from: X.6Ck  reason: invalid class name and case insensitive filesystem */
public final class C128476Ck {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128476Ck) {
                C128476Ck r5 = (C128476Ck) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A04, C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36351kA.A05(this.A01, C36391kE.A0A(this.A00)))) * 31);
    }

    public C128476Ck(List list, List list2, List list3, List list4, List list5) {
        C36321k7.A18(list, list2, list3, list4);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARDClientCapabilityMetadata(bytecodeVersion=");
        A0u.append(this.A00);
        A0u.append(", cachedModelAssets=");
        A0u.append(this.A01);
        A0u.append(", cachedModelMetadatas=");
        A0u.append(this.A02);
        A0u.append(", operators=");
        A0u.append(this.A03);
        A0u.append(", operatorsHash=");
        A0u.append((String) null);
        A0u.append(", supportedCompressions=");
        A0u.append(this.A04);
        A0u.append(", vulkanVersion=");
        return C36321k7.A0E((String) null, A0u);
    }
}
