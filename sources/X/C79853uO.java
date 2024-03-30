package X;

/* renamed from: X.3uO  reason: invalid class name and case insensitive filesystem */
public final class C79853uO implements C16540pP {
    public AnonymousClass3JN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C79853uO) && AnonymousClass00C.A0J(this.A00, ((C79853uO) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C79853uO(AnonymousClass3JN r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushPSANotificationContext(notificationInfo=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C79853uO() {
        this((AnonymousClass3JN) null);
    }
}
