package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1O0  reason: invalid class name */
public final class AnonymousClass1O0 {
    public final C229516p A00;
    public final C230116v A01;

    public AnonymousClass1O0(C229516p r2, C230116v r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass6PA A00() {
        Cursor A03;
        if (!C20800yB.A01(C21000yV.A02, this.A01.A01, 3519)) {
            C023409w r1 = C023409w.A00;
            return new AnonymousClass6PA(r1, r1);
        }
        C229516p r6 = this.A00;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            AnonymousClass1M0 A032 = r6.A00.get();
            try {
                A03 = C229416o.A03(A032, AnonymousClass2x7.A03, "ALL_LID_CONTACTS", (String[]) null);
                A03.getCount();
                i = A03.getCount();
                while (A03.moveToNext()) {
                    arrayList.add(C53712rl.A00(A03));
                }
                A03.close();
                A032.close();
                C229516p.A0F(r6, arrayList);
                arrayList.size();
                r5.A00();
                AnonymousClass00C.A0D(arrayList, 0);
                C12810ih A02 = C15060md.A02(AnonymousClass4N7.A00, new C18650tV(arrayList, 0));
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C12380hx r2 = new C12380hx(A02);
                while (r2.hasNext()) {
                    Object next = r2.next();
                    if (((AnonymousClass141) next).A0n) {
                        arrayList2.add(next);
                    } else {
                        arrayList3.add(next);
                    }
                }
                return new AnonymousClass6PA(arrayList2, arrayList3);
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C229516p.A0L(e, "contactmanagerdb/getAllLidContacts/", i, arrayList.size());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
