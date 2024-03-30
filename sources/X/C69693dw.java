package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3dw  reason: invalid class name and case insensitive filesystem */
public final class C69693dw implements C34841hj {
    public final UserJid A00;
    public final List A01;
    public final int A02;

    public int BD8() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69693dw) {
                C69693dw r5 = (C69693dw) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + this.A02) * 31) + AnonymousClass000.A0H(this.A01);
    }

    public C69693dw(UserJid userJid, int i, List list) {
        this.A00 = userJid;
        this.A02 = i;
        this.A01 = list;
    }

    public /* synthetic */ AnonymousClass72P B9E() {
        return null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass11F BDC() {
        return this.A00;
    }

    public int BH3() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallsHistoryContactItem(userJid=");
        A0u.append(this.A00);
        A0u.append(", resultPosition=");
        A0u.append(this.A02);
        A0u.append(", terms=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
