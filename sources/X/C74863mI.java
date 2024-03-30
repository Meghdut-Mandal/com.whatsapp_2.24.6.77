package X;

import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.3mI  reason: invalid class name and case insensitive filesystem */
public abstract class C74863mI implements C88924Uo {
    public Cursor A00;
    public boolean A01;
    public boolean A02;
    public final Uri A03;
    public final C20810yC A04;
    public final C21050ya A05;
    public final String A06;
    public final int A07;
    public final C002000v A08;
    public final AnonymousClass1A2 A09;

    private final Cursor A00() {
        Cursor cursor;
        synchronized (this) {
            cursor = this.A00;
            if (cursor != null && this.A01) {
                if (this.A04.A0E(6538)) {
                    this.A00 = A02();
                } else {
                    Cursor cursor2 = this.A00;
                    if (cursor2 != null) {
                        cursor2.requery();
                    }
                }
                this.A01 = false;
                cursor = this.A00;
            }
        }
        return cursor;
    }

    private final AnonymousClass4V2 A01(int i) {
        AnonymousClass4V2 r1;
        AnonymousClass4V2 A042;
        synchronized (this) {
            Cursor A002 = A00();
            r1 = null;
            if (A002 != null && A002.moveToPosition(i) && !A002.isClosed() && (A042 = A04(A002)) != null) {
                this.A08.A08(Integer.valueOf(i), A042);
                r1 = A042;
            }
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 != 81) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4V2 A04(android.database.Cursor r11) {
        /*
            r10 = this;
            r3 = 1
            java.lang.String r1 = r11.getString(r3)
            r4 = 0
            if (r1 == 0) goto L_0x0025
            r0 = 2
            long r6 = r11.getLong(r0)
            r0 = 5
            int r2 = r11.getInt(r0)
            java.io.File r5 = new java.io.File
            r5.<init>(r1)
            if (r2 == r3) goto L_0x003a
            r0 = 3
            r1 = 6
            if (r2 == r0) goto L_0x0030
            r0 = 13
            if (r2 == r0) goto L_0x0026
            r0 = 81
            if (r2 == r0) goto L_0x0030
        L_0x0025:
            return r4
        L_0x0026:
            long r8 = r11.getLong(r1)
            X.2Td r3 = new X.2Td
            r3.<init>(r4, r5, r6, r8)
            return r3
        L_0x0030:
            long r8 = r11.getLong(r1)
            X.2Te r3 = new X.2Te
            r3.<init>(r4, r5, r6, r8)
            return r3
        L_0x003a:
            X.2Ta r0 = new X.2Ta
            r0.<init>(r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74863mI.A04(android.database.Cursor):X.4V2");
    }

    public Cursor A02() {
        return this.A05.A03(this.A03, C56552wT.A00, (String) null, (String[]) null, A05());
    }

    public final Uri A03(long j) {
        try {
            Uri uri = this.A03;
            if (ContentUris.parseId(uri) == j) {
                return uri;
            }
            Log.e("MediaList/id mismatch");
            return uri;
        } catch (NumberFormatException unused) {
            Uri withAppendedId = ContentUris.withAppendedId(this.A03, j);
            AnonymousClass00C.A0B(withAppendedId);
            return withAppendedId;
        }
    }

    public final String A05() {
        String str;
        if (this.A07 == 1) {
            str = " ASC";
        } else {
            str = " DESC";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end");
        A0u.append(str);
        return AnonymousClass000.A0p(", _id", str, A0u);
    }

    public AnonymousClass4V2 BDy(int i) {
        AnonymousClass4V2 r1 = (AnonymousClass4V2) this.A08.A04(Integer.valueOf(i));
        if (r1 != null || C224714l.A02()) {
            return r1;
        }
        return A01(i);
    }

    public void BoI() {
        Cursor cursor;
        if ((this instanceof AnonymousClass2UH) && this.A00 != null) {
            if (!this.A04.A0E(6538) && (cursor = this.A00) != null) {
                cursor.deactivate();
            }
            this.A01 = true;
        }
    }

    public void close() {
        Cursor cursor;
        try {
            if (this.A00 != null) {
                if (!this.A04.A0E(6538) && (cursor = this.A00) != null) {
                    cursor.deactivate();
                }
                this.A01 = true;
            }
        } catch (IllegalStateException e) {
            Log.e("MediaList/exception while deactivating cursor", e);
        }
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.close();
        }
        this.A00 = null;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass2UH) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass2UH) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }

    public C74863mI(Uri uri, C21060yb r4, C20810yC r5, AnonymousClass1A2 r6, String str, int i, boolean z) {
        this.A04 = r5;
        this.A09 = r6;
        C002000v r1 = new C002000v(512);
        this.A08 = r1;
        C21050ya A0z = C36431kI.A0z(r4);
        AnonymousClass00C.A08(A0z);
        this.A05 = A0z;
        this.A07 = i;
        this.A03 = uri;
        this.A06 = str;
        this.A02 = z;
        Cursor A022 = A02();
        this.A00 = A022;
        if (A022 == null) {
            Log.w("MediaList/createCursor returns null");
        }
        r1.A07(0);
    }

    public AnonymousClass4V2 BmQ(int i) {
        C18740tg.A00();
        try {
            return A01(i);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MediaGalleryList/processMediaAt/position = ");
            A0u.append(i);
            C36321k7.A1J(e, " ; e = ", A0u);
            return null;
        }
    }

    public int getCount() {
        int count;
        Cursor A002 = A00();
        if (A002 == null) {
            return 0;
        }
        synchronized (this) {
            count = A002.getCount();
        }
        return count;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(getCount());
    }
}
