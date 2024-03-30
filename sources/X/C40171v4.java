package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.1v4  reason: invalid class name and case insensitive filesystem */
public class C40171v4 extends C03760Hp {
    public static final String[] A04 = {"_id", "artist", "title", "_data", "duration", "_size"};
    public CancellationSignal A00;
    public Cursor A01;
    public final C21050ya A02;
    public final ArrayList A03;

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor query;
        synchronized (this) {
            if (!AnonymousClass000.A1V(this.A01)) {
                this.A00 = new CancellationSignal();
            } else {
                throw new AnonymousClass02S();
            }
        }
        try {
            ArrayList arrayList = this.A03;
            String[] strArr = new String[(arrayList.size() * 2)];
            StringBuilder A0u = AnonymousClass000.A0u();
            for (int i = 0; i < arrayList.size(); i++) {
                A0u.append(" AND ");
                A0u.append("(");
                A0u.append("title");
                A0u.append(" LIKE ?");
                A0u.append(" OR ");
                A0u.append("artist");
                A0u.append(" LIKE ?");
                A0u.append(")");
                int i2 = i * 2;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("%");
                strArr[i2] = AnonymousClass000.A0p(C36421kH.A0e(arrayList, i), "%", A0u2);
                strArr[i2 + 1] = AnonymousClass000.A0p(C36421kH.A0e(arrayList, i), "%", AnonymousClass000.A0v("%"));
            }
            C21050ya r2 = this.A02;
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = A04;
            String A0l = AnonymousClass000.A0l(A0u, "(is_music!=0 OR is_podcast!=0)", AnonymousClass000.A0u());
            CancellationSignal cancellationSignal = this.A00;
            AnonymousClass00C.A0D(uri, 0);
            ContentResolver A002 = C21050ya.A00(r2);
            r2.A01.A00(C51822oR.QUERY, uri.getAuthority());
            query = A002.query(uri, strArr2, A0l, strArr, "date_modified DESC", cancellationSignal);
            if (query != null) {
                query.getCount();
            }
            synchronized (this) {
                this.A00 = null;
            }
            return query;
        } catch (RuntimeException e) {
            query.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A08() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.A00;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    public void A03() {
        Cursor cursor = this.A01;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A01 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A01;
            this.A01 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C40171v4(Context context, C21050ya r3, ArrayList arrayList) {
        super(context);
        this.A02 = r3;
        if (arrayList == null) {
            this.A03 = AnonymousClass001.A0I();
        } else {
            this.A03 = arrayList;
        }
    }

    public void A01() {
        A00();
        Cursor cursor = this.A01;
        if (cursor != null && !cursor.isClosed()) {
            this.A01.close();
        }
        this.A01 = null;
    }

    public void A02() {
        A00();
    }
}
