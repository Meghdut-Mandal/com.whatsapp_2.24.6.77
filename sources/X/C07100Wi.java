package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.0Wi  reason: invalid class name and case insensitive filesystem */
public final class C07100Wi {
    public static final Map A07 = new AnonymousClass008();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = new Object();
    public final List A04 = AnonymousClass001.A0I();
    public final Runnable A05;
    public volatile Map A06;

    public C07100Wi(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C03120Dg r1 = new C03120Dg(this);
        this.A01 = r1;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A05 = runnable;
        contentResolver.registerContentObserver(uri, false, r1);
    }
}
