package X;

/* renamed from: X.295  reason: invalid class name */
public final class AnonymousClass295 extends C53262r2 {
    public final C53242r0 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass295) {
                AnonymousClass295 r5 = (AnonymousClass295) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, ((((C36341k9.A01(this.A03 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31);
    }

    public AnonymousClass295(C53242r0 r1, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarDetails(isDeleting=");
        A0u.append(this.A03);
        A0u.append(", deleteError=");
        A0u.append(this.A01);
        A0u.append(", isBottomSheetDraggable=");
        A0u.append(this.A02);
        A0u.append(", avatarPreviewBitmapState=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public AnonymousClass295() {
        this(AnonymousClass28y.A00, false, false, false);
    }
}
