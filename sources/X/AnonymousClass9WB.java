package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9WB  reason: invalid class name */
public final class AnonymousClass9WB {
    public final long A00;
    public final C203399nx A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WB) {
                AnonymousClass9WB r8 = (AnonymousClass9WB) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A00, C36391kE.A0A(this.A01)) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass9WB(C203399nx r1, Long l, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OutgoingAckReceipt(tag=");
        C203399nx r1 = this.A01;
        A0u.append(r1.A00);
        A0u.append(", id=");
        A0u.append(C36391kE.A0x(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        A0u.append(", loggableStanzaId=");
        A0u.append(this.A00);
        A0u.append(" rowId=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
