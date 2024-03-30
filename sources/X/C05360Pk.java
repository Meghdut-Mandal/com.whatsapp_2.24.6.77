package X;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: X.0Pk  reason: invalid class name and case insensitive filesystem */
public abstract class C05360Pk {
    public static ParcelFileDescriptor A00(ContentResolver contentResolver, Uri uri) {
        return contentResolver.openFileDescriptor(uri, "r", (CancellationSignal) null);
    }
}
