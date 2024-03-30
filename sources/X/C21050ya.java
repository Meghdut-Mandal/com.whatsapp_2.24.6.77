package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.0ya  reason: invalid class name and case insensitive filesystem */
public final class C21050ya {
    public ContentResolver A00;
    public final C21040yZ A01;

    public C21050ya(C21040yZ r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public int A01(Uri uri, String str, String[] strArr) {
        AnonymousClass00C.A0D(uri, 0);
        return A00(this).delete(uri, str, strArr);
    }

    public Cursor A02(Uri uri) {
        AnonymousClass00C.A0D(uri, 0);
        ContentResolver A002 = A00(this);
        this.A01.A00(C51822oR.QUERY, uri.getAuthority());
        return A002.query(uri, (String[]) null, (Bundle) null, (CancellationSignal) null);
    }

    public Cursor A03(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AnonymousClass00C.A0D(uri, 0);
        ContentResolver A002 = A00(this);
        this.A01.A00(C51822oR.QUERY, uri.getAuthority());
        return A002.query(uri, strArr, str, strArr2, str2);
    }

    public Bundle A04(Uri uri, Bundle bundle, String str) {
        AnonymousClass00C.A0D(uri, 0);
        return A00(this).call(uri, str, (String) null, bundle);
    }

    public ParcelFileDescriptor A05(Uri uri, String str) {
        AnonymousClass00C.A0D(uri, 0);
        ContentResolver A002 = A00(this);
        this.A01.A00(C51822oR.FILE, uri.getAuthority());
        return A002.openFileDescriptor(uri, str);
    }

    public InputStream A06(Uri uri) {
        AnonymousClass00C.A0D(uri, 0);
        ContentResolver A002 = A00(this);
        this.A01.A00(C51822oR.STREAM, uri.getAuthority());
        return A002.openInputStream(uri);
    }

    public OutputStream A07(Uri uri) {
        AnonymousClass00C.A0D(uri, 0);
        ContentResolver A002 = A00(this);
        this.A01.A00(C51822oR.STREAM, uri.getAuthority());
        return A002.openOutputStream(uri);
    }

    public static final ContentResolver A00(C21050ya r0) {
        ContentResolver contentResolver = r0.A00;
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new C82223yM();
    }
}
