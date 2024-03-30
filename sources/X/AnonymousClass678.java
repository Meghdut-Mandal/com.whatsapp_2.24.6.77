package X;

import android.net.Uri;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.678  reason: invalid class name */
public abstract class AnonymousClass678 {
    public final Uri A00;
    public final List A01;
    public final List A02;
    @Deprecated
    public final List A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass678)) {
            return false;
        }
        AnonymousClass678 r4 = (AnonymousClass678) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A02.equals(r4.A02);
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A00) * 31 * 31 * 31) + this.A01.hashCode()) * 31 * 31) + this.A02.hashCode()) * 31;
    }

    public AnonymousClass678(Uri uri, List list, List list2) {
        this.A00 = uri;
        this.A01 = list;
        this.A02 = list2;
        LinkedList A0l = C90524aI.A0l();
        if (0 < list2.size()) {
            list2.get(0);
            throw AnonymousClass001.A0A("buildUpon");
        } else {
            this.A03 = C36441kJ.A15(A0l);
        }
    }
}
