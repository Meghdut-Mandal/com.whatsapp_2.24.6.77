package X;

/* renamed from: X.3oi  reason: invalid class name and case insensitive filesystem */
public final class C76343oi implements AnonymousClass0p3 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76343oi) && AnonymousClass00C.A0J(this.A00, ((C76343oi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C76343oi(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReportDetailScreen(reportId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
