package X;

import android.util.SparseIntArray;
import java.util.List;

/* renamed from: X.6CJ  reason: invalid class name */
public final class AnonymousClass6CJ {
    public SparseIntArray A00 = null;
    public List A01 = null;
    public List A02 = null;
    public List A03 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CJ) {
                AnonymousClass6CJ r5 = (AnonymousClass6CJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchCombinedItem(mediaCounts=");
        A0u.append(this.A00);
        A0u.append(", smartFilters=");
        A0u.append(this.A03);
        A0u.append(", remoteEntityFilters=");
        A0u.append(this.A02);
        A0u.append(", businessCategoryList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
