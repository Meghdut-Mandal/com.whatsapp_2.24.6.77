package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.6BJ  reason: invalid class name */
public final class AnonymousClass6BJ {
    public final long A00;
    public final GroupJid A01;
    public final String A02;

    public AnonymousClass6BJ(String str, GroupJid groupJid, long j) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = groupJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BJ) {
                AnonymousClass6BJ r8 = (AnonymousClass6BJ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A01, C36421kH.A04(this.A02)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScheduledCallReminderCommand(scheduledId=");
        A0u.append(this.A02);
        A0u.append(", groupJid=");
        A0u.append(this.A01);
        A0u.append(", scheduledTimestampSec=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
