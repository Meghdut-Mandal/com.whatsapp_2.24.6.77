package X;

import java.util.List;

/* renamed from: X.6Ta  reason: invalid class name and case insensitive filesystem */
public final class C132306Ta {
    public final C101424xX A00;
    public final C101394xU A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132306Ta) {
                C132306Ta r5 = (C132306Ta) obj;
                if (this.A06 != r5.A06 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36341k9.A01(this.A06 ? 1 : 0) * 31)) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public C132306Ta(C101424xX r1, C101394xU r2, List list, List list2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewState(isSaving=");
        A0u.append(this.A06);
        A0u.append(", avatarPoses=");
        A0u.append(this.A03);
        A0u.append(", avatarBackgrounds=");
        A0u.append(this.A02);
        A0u.append(", selectedBackground=");
        A0u.append(this.A00);
        A0u.append(", selectedPose=");
        A0u.append(this.A01);
        A0u.append(", isLoading=");
        A0u.append(this.A05);
        A0u.append(", isError=");
        return C36321k7.A0H(A0u, this.A04);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C132306Ta() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            X.09w r3 = X.C023409w.A00
            r0 = r8
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132306Ta.<init>():void");
    }
}
