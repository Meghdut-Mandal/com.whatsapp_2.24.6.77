package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.9P7  reason: invalid class name */
public class AnonymousClass9P7 {
    public final List A00 = AnonymousClass001.A0I();

    public void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C208289xz r1 = (C208289xz) list.get(size);
                if (r1 != null && !r1.A05) {
                    C203079nF.A03(path, ((AnonymousClass812) r1.A02).A0B() / 100.0f, ((AnonymousClass812) r1.A00).A0B() / 100.0f, ((AnonymousClass812) r1.A01).A0B() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
