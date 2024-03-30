package X;

/* renamed from: X.6DT  reason: invalid class name */
public final class AnonymousClass6DT {
    public long A00;
    public long A01;
    public String A02;
    public String A03 = null;
    public final String A04;
    public final String A05;
    public final long A06;

    public AnonymousClass6DT(String str, String str2, String str3, long j, long j2, long j3) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A06 = j2;
        this.A01 = j3;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DT) {
                AnonymousClass6DT r8 = (AnonymousClass6DT) obj;
                if (!AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || this.A06 != r8.A06 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36321k7.A00(this.A01, C36321k7.A00(this.A06, C36321k7.A00(this.A00, C36381kD.A08(this.A04, C36421kH.A04(this.A05))))) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NotificationUiData(notificationType=");
        A0u.append(this.A05);
        A0u.append(", from=");
        A0u.append(this.A04);
        A0u.append(", notificationCount=");
        A0u.append(this.A00);
        A0u.append(", timestampMs=");
        A0u.append(this.A06);
        A0u.append(", senderCount=");
        A0u.append(this.A01);
        A0u.append(", sender1=");
        A0u.append(this.A02);
        A0u.append(", sender2=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
