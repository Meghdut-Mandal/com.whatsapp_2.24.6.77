package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9SM  reason: invalid class name */
public final class AnonymousClass9SM {
    public Uri A00;
    public String A01;
    public AnonymousClass93a A02 = new AnonymousClass93a();
    public AnonymousClass9GC A03 = new AnonymousClass9GC();
    public AnonymousClass93b A04 = new AnonymousClass93b();
    public List A05 = Collections.emptyList();
    public List A06 = Collections.emptyList();

    public C199539fU A00() {
        C97594px r3 = null;
        Uri uri = this.A00;
        if (uri != null) {
            r3 = new C97594px(uri, this.A05, this.A06);
        }
        AnonymousClass7c0 r0 = C199539fU.A07;
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        return new C199539fU(new AnonymousClass82H(), new C199199et(), r3, C199229ew.A01, str);
    }
}
