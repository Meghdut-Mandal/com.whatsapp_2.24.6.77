package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5Nf  reason: invalid class name and case insensitive filesystem */
public class C107255Nf extends AnonymousClass72O {
    public final UserJid A00;
    public volatile int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C107255Nf r7 = (C107255Nf) obj;
                if (!(this.A00.equals(r7.A00) && A02() == r7.A02() && this.A01 == r7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C107255Nf(UserJid userJid, int i, long j) {
        super(j);
        this.A00 = userJid;
        this.A01 = i;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, (((int) A02()) + 31) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLogParticipant[rowId=");
        A0u.append(A02());
        A0u.append(", jid=");
        A0u.append(this.A00);
        A0u.append(", callResult=");
        A0u.append(this.A01);
        return C90474aD.A0g(A0u);
    }
}
