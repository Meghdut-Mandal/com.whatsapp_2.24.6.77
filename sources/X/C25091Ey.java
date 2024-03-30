package X;

import android.content.ContentValues;
import java.util.List;

/* renamed from: X.1Ey  reason: invalid class name and case insensitive filesystem */
public class C25091Ey {
    public final C19730wQ A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;

    public void A00(AnonymousClass3T1 r9) {
        C1495671s B1k;
        List<C80163ux> list = r9.A0w;
        if (list != null && !list.isEmpty()) {
            AnonymousClass1M0 A05 = this.A03.A05();
            try {
                B1k = A05.B1k();
                for (C80163ux r3 : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(r9.A1N));
                    contentValues.put("jid_row_id", Long.valueOf(this.A02.A07(r3.A00)));
                    contentValues.put("display_name", r3.A01);
                    A05.A02.A08("message_mentions", "INSERT_TABLE_MESSAGE_MENTIONS", contentValues, 4);
                }
                B1k.A00();
                B1k.close();
                A05.close();
                return;
            } catch (Throwable th) {
                try {
                    A05.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C25091Ey(C19730wQ r1, AnonymousClass163 r2, C219712j r3, AnonymousClass12P r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }
}
