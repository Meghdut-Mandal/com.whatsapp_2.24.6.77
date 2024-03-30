package X;

import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.3QK  reason: invalid class name */
public class AnonymousClass3QK {
    public int A00;
    public final long A01;
    public final GroupJid A02;
    public final Integer A03;
    public final String A04;

    public AnonymousClass3QK(GroupJid groupJid, String str, int i, long j) {
        this(groupJid, (Integer) null, str, i, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3QK r7 = (AnonymousClass3QK) obj;
            if (!(this.A01 == r7.A01 && this.A02.equals(r7.A02) && this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A03 == r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A04;
        C36361kB.A1W(objArr, this.A01);
        C36341k9.A1T(objArr, this.A00);
        return AnonymousClass000.A0M(this.A03, objArr, 4);
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass3QK) it.next()).A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Subgroup{groupJid=");
        A0u.append(this.A02);
        A0u.append(", subject='");
        A0u.append(this.A04);
        A0u.append('\'');
        A0u.append(", subjectTime=");
        A0u.append(this.A01);
        A0u.append(", groupType=");
        A0u.append(this.A00);
        A0u.append(", groupMembershipApprovalState=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }

    public AnonymousClass3QK(GroupJid groupJid, Integer num, String str, int i, long j) {
        this.A02 = groupJid;
        this.A04 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = num;
    }
}
