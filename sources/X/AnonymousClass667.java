package X;

import android.net.Uri;

/* renamed from: X.667  reason: invalid class name */
public final class AnonymousClass667 {
    public final Uri A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                AnonymousClass667 r5 = (AnonymousClass667) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass667(boolean z, Uri uri) {
        this.A00 = uri;
        this.A01 = z;
    }
}
