package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.5DC  reason: invalid class name */
public final class AnonymousClass5DC extends C108625Ug {
    public final NoSuchAlgorithmException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5DC) && AnonymousClass00C.A0J(this.throwable, ((AnonymousClass5DC) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass5DC(NoSuchAlgorithmException noSuchAlgorithmException) {
        this.throwable = noSuchAlgorithmException;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModelHashAlgorithmError(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
