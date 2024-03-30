package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2Go  reason: invalid class name */
public final class AnonymousClass2Go extends C63183Jb {
    public String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Go(String str, List list) {
        super(R.string.f12nameremoved, list, true);
        AnonymousClass00C.A0D(list, 2);
        this.A00 = str;
    }

    public String A01(AnonymousClass27v r5) {
        String str = this.A00;
        if (str != null) {
            return C36351kA.A0x(r5, str, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        }
        return C36361kB.A0m(r5, this.A00);
    }
}
