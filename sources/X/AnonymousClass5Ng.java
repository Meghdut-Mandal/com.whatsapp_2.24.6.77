package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.5Ng  reason: invalid class name */
public class AnonymousClass5Ng extends AnonymousClass72O {
    public final String A00;
    public final boolean A01;
    public volatile GroupJid A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5Ng r7 = (AnonymousClass5Ng) obj;
            if (!r7.A00.equals(this.A00) || r7.A02() != A02() || r7.A01 != this.A01 || !C1901797e.A00(r7.A02, this.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        C36421kH.A1P(objArr, this.A00);
        objArr[2] = Boolean.valueOf(this.A01);
        return AnonymousClass000.A0M(this.A02, objArr, 3);
    }

    public AnonymousClass5Ng(GroupJid groupJid, String str, long j, boolean z) {
        super(j);
        this.A00 = str;
        this.A01 = z;
        this.A02 = groupJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("JoinableCallLog[callId=");
        A0u.append(this.A00);
        A0u.append(", callLogRowId=");
        A0u.append(A02());
        A0u.append(", videoCall=");
        A0u.append(this.A01);
        A0u.append(", groupJid=");
        A0u.append(this.A02);
        return C90474aD.A0g(A0u);
    }
}
