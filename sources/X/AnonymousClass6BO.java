package X;

import android.widget.ImageView;

/* renamed from: X.6BO  reason: invalid class name */
public final class AnonymousClass6BO {
    public final ImageView A00;
    public final C1275468s A01;
    public final C129196Ft A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BO) {
                AnonymousClass6BO r5 = (AnonymousClass6BO) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36391kE.A0A(this.A02)));
    }

    public AnonymousClass6BO(ImageView imageView, C1275468s r2, C129196Ft r3) {
        this.A02 = r3;
        this.A00 = imageView;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeLoadingTask(shape=");
        A0u.append(this.A02);
        A0u.append(", imageView=");
        A0u.append(this.A00);
        A0u.append(", tag=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
