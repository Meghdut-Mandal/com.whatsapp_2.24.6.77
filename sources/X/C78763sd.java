package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.3sd  reason: invalid class name and case insensitive filesystem */
public final class C78763sd implements C17820s5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmI(AnonymousClass3T1 r11, C52942qQ r12) {
        Cursor A09;
        AnonymousClass00C.A0D(r11, 0);
        if ((r11.A1R & 1) == 1) {
            C25091Ey r6 = (C25091Ey) this.A01.get();
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass1M0 A04 = r6.A03.get();
            try {
                C224114e r8 = A04.A02;
                String[] A1R = C36441kJ.A1R();
                C36401kF.A1T(A1R, 0, r11.A1N);
                A09 = r8.A09("SELECT jid_row_id, display_name FROM message_mentions WHERE message_row_id = ?", "GET_JIDS_FROM_MESSAGES_MENTIONED_TABLE_SQL", A1R);
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("display_name");
                while (A09.moveToNext()) {
                    long j = A09.getLong(columnIndexOrThrow);
                    String string = A09.getString(columnIndexOrThrow2);
                    Jid A092 = r6.A02.A09(j);
                    C222713q r0 = AnonymousClass11F.A00;
                    AnonymousClass11F A002 = C222713q.A00(A092);
                    if (A002 != null) {
                        A0I.add(new C80163ux(A002, string));
                    }
                }
                A09.close();
                A04.close();
                r11.A18(A0I);
                r11.A1A(AnonymousClass000.A1V(((AnonymousClass1HX) this.A00.get()).A01(r11.A0w)));
                if (r12 != null) {
                    throw C36321k7.A04(C78763sd.class);
                }
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
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

    public C78763sd(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
