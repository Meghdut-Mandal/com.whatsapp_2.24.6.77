package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;
import java.util.List;

/* renamed from: X.4kV  reason: invalid class name and case insensitive filesystem */
public final class C95284kV extends AnonymousClass07T {
    public final List A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95284kV(AnonymousClass01z r2, List list) {
        super(r2, 0);
        AnonymousClass00C.A0D(list, 2);
        this.A00 = list;
    }

    public CharSequence A0F(int i) {
        return (CharSequence) this.A00.get(i);
    }

    public int A0H() {
        return this.A00.size();
    }

    public AnonymousClass02E A0M(int i) {
        CategorizedUserProblemsFragment categorizedUserProblemsFragment = new CategorizedUserProblemsFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("index", i);
        categorizedUserProblemsFragment.A17(A07);
        return categorizedUserProblemsFragment;
    }
}
