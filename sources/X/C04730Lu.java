package X;

import android.content.Context;
import java.util.Objects;

/* renamed from: X.0Lu  reason: invalid class name and case insensitive filesystem */
public final class C04730Lu extends AnonymousClass0QR {
    public final Context A00;
    public final C16900qH A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass0QR) {
                C04730Lu r5 = (C04730Lu) ((AnonymousClass0QR) obj);
                if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        String obj = this.A00.toString();
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlagsContext{context=");
        A0u.append(obj);
        A0u.append(", hermeticFileOverrides=");
        A0u.append(valueOf);
        return AnonymousClass000.A0q("}", A0u);
    }

    public C04730Lu(Context context, C16900qH r3) {
        Objects.requireNonNull(context, "Null context");
        this.A00 = context;
        this.A01 = r3;
    }
}
