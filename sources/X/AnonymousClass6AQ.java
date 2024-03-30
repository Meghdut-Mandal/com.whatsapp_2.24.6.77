package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.6AQ  reason: invalid class name */
public final class AnonymousClass6AQ {
    public final PhotoView A00;
    public final AnonymousClass2bU A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AQ) {
                AnonymousClass6AQ r5 = (AnonymousClass6AQ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass6AQ(PhotoView photoView, AnonymousClass2bU r2) {
        this.A01 = r2;
        this.A00 = photoView;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessagePhotoItem(message=");
        A0u.append(this.A01);
        A0u.append(", photoView=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
