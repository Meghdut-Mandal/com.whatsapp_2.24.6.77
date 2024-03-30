package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9iS  reason: invalid class name and case insensitive filesystem */
public final class C200909iS {
    public static final ConcurrentHashMap A07 = C90524aI.A0s();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = C36441kJ.A11();
    public final Object A04 = C36441kJ.A11();
    public final List A05 = AnonymousClass001.A0I();
    public volatile Map A06;

    public C200909iS(ContentResolver contentResolver, Uri uri) {
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A01 = new C165697u0(this);
    }

    public static final HashMap A00(C200909iS r9) {
        Cursor query;
        try {
            HashMap A0J = AnonymousClass001.A0J();
            query = r9.A00.query(r9.A02, A08, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return A0J;
            }
            while (query.moveToNext()) {
                A0J.put(query.getString(0), query.getString(1));
            }
            query.close();
            return A0J;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
