package X;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;

/* renamed from: X.6mm  reason: invalid class name and case insensitive filesystem */
public class C141166mm implements AnonymousClass7ez {
    public AnonymousClass7ez A00;

    public AnonymousClass65N B78(Uri uri) {
        Trace.beginSection("DefaultVideoMetadataExtractor.extract");
        AnonymousClass65N B78 = this.A00.B78(uri);
        Trace.endSection();
        return B78;
    }

    public C141166mm(Context context) {
        this.A00 = new C141176mn(context, false);
    }
}
