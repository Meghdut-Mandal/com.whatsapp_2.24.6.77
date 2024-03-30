package X;

/* renamed from: X.5DJ  reason: invalid class name */
public final class AnonymousClass5DJ extends C108645Ui {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5DJ) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5DJ) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5DJ(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeliveryError(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
