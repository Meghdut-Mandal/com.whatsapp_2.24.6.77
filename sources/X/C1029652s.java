package X;

/* renamed from: X.52s  reason: invalid class name and case insensitive filesystem */
public final class C1029652s extends C125355zm {
    public final C16250or A00;
    public final C16250or A01;
    public final C16250or A02;
    public final C16250or A03;
    public final C16250or A04;
    public final C16260os A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1029652s) {
                C1029652s r5 = (C1029652s) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A05, C36351kA.A05(this.A02, C36351kA.A05(this.A01, C36351kA.A05(this.A04, C36351kA.A05(this.A03, C36391kE.A0A(this.A00))))));
    }

    public C1029652s(C16250or r2, C16250or r3, C16250or r4, C16250or r5, C16250or r6, C16260os r7) {
        C36321k7.A18(r2, r3, r4, r5);
        AnonymousClass00C.A0D(r7, 6);
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r7;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InCallControlUiState(audioRouteButtonState=");
        A0u.append(this.A00);
        A0u.append(", moreButtonState=");
        A0u.append(this.A03);
        A0u.append(", muteButtonState=");
        A0u.append(this.A04);
        A0u.append(", cameraButtonState=");
        A0u.append(this.A01);
        A0u.append(", endCallButtonState=");
        A0u.append(this.A02);
        A0u.append(", headerState=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1029652s() {
        /*
            r7 = this;
            X.6ra r1 = X.C144076ra.A00
            X.6rd r6 = X.C144106rd.A00
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1029652s.<init>():void");
    }
}
