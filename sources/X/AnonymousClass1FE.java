package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.1FE  reason: invalid class name */
public class AnonymousClass1FE {
    public final C19730wQ A00;
    public final AnonymousClass12P A01;
    public final C219712j A02;

    public AnonymousClass1FE(C19730wQ r1, C219712j r2, AnonymousClass12P r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public DeviceJid A00(AnonymousClass3T1 r9) {
        Cursor A09;
        r9.A0f();
        DeviceJid deviceJid = null;
        if (r9.A1N == -1) {
            return null;
        }
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT author_device_jid FROM message_details WHERE message_row_id = ?", "GET_MESSAGE_AUTHOR_SQL", new String[]{Long.toString(r9.A1N)});
            if (A09.moveToLast()) {
                Jid A092 = this.A02.A09(A09.getLong(A09.getColumnIndexOrThrow("author_device_jid")));
                if (A092 instanceof DeviceJid) {
                    deviceJid = DeviceJid.of(A092);
                }
            }
            A09.close();
            A04.close();
            return deviceJid;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
