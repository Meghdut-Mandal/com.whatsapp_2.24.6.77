package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1O4  reason: invalid class name */
public final class AnonymousClass1O4 {
    public final AnonymousClass16D A00;
    public final C20810yC A01;

    public AnonymousClass1O4(AnonymousClass16D r2, C20810yC r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass6PB A00() {
        Cursor A03;
        if (!C20800yB.A01(C21000yV.A02, this.A01, 5868)) {
            return new AnonymousClass6PB(new ArrayList(), new ArrayList(), new ArrayList());
        }
        C229516p r6 = this.A00.A05;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            AnonymousClass1M0 A032 = r6.A00.get();
            try {
                A03 = C229416o.A03(A032, AnonymousClass2x7.A09, "NATIVE_CONTACTS_NOT_SYNC_WITH_DEVICE", (String[]) null);
                A03.getCount();
                i = A03.getCount();
                while (A03.moveToNext()) {
                    arrayList.add(C53712rl.A00(A03));
                }
                A03.close();
                A032.close();
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C229516p.A0L(e, "contactmanagerdb/getSyncPendingNativeContacts/", i, arrayList.size());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        C229516p.A0F(r6, arrayList);
        arrayList.size();
        r5.A00();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r2 = (AnonymousClass141) it.next();
            if (r2.A0k) {
                arrayList4.add(r2);
            } else {
                int i2 = r2.A07;
                if (i2 == 1) {
                    arrayList2.add(r2);
                } else if (i2 == 2) {
                    arrayList3.add(r2);
                }
            }
        }
        return new AnonymousClass6PB(arrayList2, arrayList3, arrayList4);
        throw th;
    }
}
