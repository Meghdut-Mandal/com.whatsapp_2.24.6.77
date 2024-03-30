package X;

import android.content.Context;
import android.net.Uri;
import java.io.Closeable;

/* renamed from: X.3nR  reason: invalid class name and case insensitive filesystem */
public class C75563nR implements C87994Qz {
    public final Context A00;
    public final Uri A01;

    public Closeable B3M(C37001le r3) {
        r3.setDataSource(this.A00, this.A01);
        return null;
    }

    public C75563nR(Context context, Uri uri) {
        this.A00 = context;
        this.A01 = uri;
    }
}
