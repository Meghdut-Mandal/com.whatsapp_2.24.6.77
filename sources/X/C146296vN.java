package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6vN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146296vN implements C87914Qr {
    public final /* synthetic */ AnonymousClass1VD A00;

    public /* synthetic */ C146296vN(AnonymousClass1VD r1) {
        this.A00 = r1;
    }

    public final void B72(Set set) {
        AnonymousClass1VD r3 = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r3.A01.A04(AnonymousClass001.A0C(it));
        }
        AnonymousClass1VF r1 = r3.A03;
        r1.A00.A00.revokeUriPermission(Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
    }
}
