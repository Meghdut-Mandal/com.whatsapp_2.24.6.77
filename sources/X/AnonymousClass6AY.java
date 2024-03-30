package X;

import android.graphics.Bitmap;

/* renamed from: X.6AY  reason: invalid class name */
public final class AnonymousClass6AY {
    public final Bitmap A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AY) {
                AnonymousClass6AY r5 = (AnonymousClass6AY) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A09(this.A01);
    }

    public AnonymousClass6AY(Bitmap bitmap, String str) {
        this.A00 = bitmap;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarProfilePhotoPoseViewData(bitmapPose=");
        A0u.append(this.A00);
        A0u.append(", emojis=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
