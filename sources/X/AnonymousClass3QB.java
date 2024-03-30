package X;

import com.whatsapp.location.PlaceInfo;

/* renamed from: X.3QB  reason: invalid class name */
public final class AnonymousClass3QB {
    public final AnonymousClass2bT A00;
    public final AnonymousClass2bT A01;
    public final C51542nz A02;
    public final PlaceInfo A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QB) {
                AnonymousClass3QB r5 = (AnonymousClass3QB) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, ((((AnonymousClass000.A0H(this.A03) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00)) * 31);
    }

    public AnonymousClass3QB(AnonymousClass2bT r1, AnonymousClass2bT r2, C51542nz r3, PlaceInfo placeInfo) {
        this.A03 = placeInfo;
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static PlaceInfo A00(AnonymousClass05K r0) {
        return ((AnonymousClass3QB) r0.getValue()).A03;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UIState(selectedPlace=");
        A0u.append(this.A03);
        A0u.append(", originalMessage=");
        A0u.append(this.A01);
        A0u.append(", editedMessage=");
        A0u.append(this.A00);
        A0u.append(", messageState=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public AnonymousClass3QB() {
        this((AnonymousClass2bT) null, (AnonymousClass2bT) null, C51542nz.ORIGINAL, (PlaceInfo) null);
    }
}
