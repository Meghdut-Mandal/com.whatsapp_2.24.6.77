package X;

import android.graphics.Bitmap;

/* renamed from: X.3Pl  reason: invalid class name and case insensitive filesystem */
public final class C64793Pl {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C64793Pl) && AnonymousClass00C.A0J(this.A00, ((C64793Pl) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C64793Pl(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(bitmap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C64793Pl() {
        this((Bitmap) null);
    }
}
