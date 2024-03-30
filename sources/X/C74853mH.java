package X;

import android.database.ContentObserver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3mH  reason: invalid class name and case insensitive filesystem */
public class C74853mH implements C88924Uo {
    public int A00 = 0;
    public C36691l9 A01;
    public final AnonymousClass1DF A02;
    public final AnonymousClass11F A03;
    public final AnonymousClass1A1 A04;
    public final Map A05 = AnonymousClass001.A0J();
    public final C20810yC A06;
    public final AnonymousClass1SV A07;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C74833mF A00(X.C74853mH r4, int r5) {
        /*
            r3 = 0
            monitor-enter(r4)     // Catch:{ IllegalStateException -> 0x0032 }
            X.1l9 r0 = r4.A01     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isClosed()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            X.1l9 r0 = r4.A01     // Catch:{ all -> 0x002f }
            boolean r0 = r0.moveToPosition(r5)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            X.1l9 r0 = r4.A01     // Catch:{ all -> 0x002f }
            X.2bU r1 = r0.A02()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            X.1SV r0 = r4.A07     // Catch:{ all -> 0x002f }
            X.3mF r2 = X.C63923Ly.A00(r1, r0)     // Catch:{ all -> 0x002f }
            java.util.Map r1 = r4.A05     // Catch:{ all -> 0x002f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x002f }
            r1.put(r0, r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002d:
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            return r3
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ IllegalStateException -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            java.lang.String r0 = "MediaGalleryList/error"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74853mH.A00(X.3mH, int):X.3mF");
    }

    public /* bridge */ /* synthetic */ AnonymousClass4V2 BDy(int i) {
        C74833mF r1 = (C74833mF) C36371kC.A0r(this.A05, i);
        if (this.A01 == null || r1 != null || C224714l.A02()) {
            return r1;
        }
        return A00(this, i);
    }

    public void BoI() {
        Cursor A022;
        C36691l9 r5 = this.A01;
        if (r5 != null) {
            if (this instanceof AnonymousClass2Tv) {
                AnonymousClass2Tv r4 = (AnonymousClass2Tv) this;
                int i = r4.A00;
                int i2 = r4.A01;
                A022 = AnonymousClass1V2.A02(r4.A02, r4.A03, i, i2);
            } else {
                AnonymousClass11F r1 = this.A03;
                C18740tg.A06(r1);
                A022 = this.A02.A02(r1);
            }
            r5.A01.close();
            r5.A01 = A022;
            r5.A00 = -1;
            r5.moveToPosition(-1);
        }
        this.A05.clear();
        this.A00 = 0;
    }

    public void close() {
        C36691l9 r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
    }

    public int getCount() {
        C36691l9 r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount() - this.A00;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        C36691l9 r0 = this.A01;
        if (r0 != null) {
            r0.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        C36691l9 r0 = this.A01;
        if (r0 != null) {
            r0.unregisterContentObserver(contentObserver);
        }
    }

    public C74853mH(AnonymousClass1DF r2, C20810yC r3, AnonymousClass11F r4, AnonymousClass1A1 r5, AnonymousClass1SV r6) {
        this.A06 = r3;
        this.A04 = r5;
        this.A02 = r2;
        this.A07 = r6;
        this.A03 = r4;
    }

    public HashMap B90() {
        return AnonymousClass001.A0J();
    }

    public /* bridge */ /* synthetic */ AnonymousClass4V2 BmQ(int i) {
        C18740tg.A00();
        try {
            return A00(this, i);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MediaGalleryList/processMediaAt/position = ");
            A0u.append(i);
            C36321k7.A1J(e, " ; e = ", A0u);
            return null;
        }
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(getCount());
    }
}
