package X;

/* renamed from: X.3J5  reason: invalid class name */
public final class AnonymousClass3J5 {
    public final long A00;
    public final long A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J5) {
                AnonymousClass3J5 r8 = (AnonymousClass3J5) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && AnonymousClass00C.A0J(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A01, AnonymousClass000.A08(this.A00) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass3J5(Long l, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScheduledReminder(messageRowId=");
        A0u.append(this.A00);
        A0u.append(", scheduledTimestampMs=");
        A0u.append(this.A01);
        A0u.append(", chatRowId=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
