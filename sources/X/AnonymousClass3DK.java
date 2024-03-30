package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DK  reason: invalid class name */
public final class AnonymousClass3DK {
    public final C20810yC A00;
    public final C20670xw A01;

    public final C62373Fx A00() {
        Cursor A09;
        C20670xw r5 = this.A01;
        int A07 = this.A00.A07(1657);
        AnonymousClass12P r0 = r5.A02;
        r0.A06();
        if (!r0.A08 || !r5.A03.A03()) {
            return new C62373Fx((List) null, false, false, false, false, false);
        }
        AnonymousClass1CR r6 = r5.A04;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1M0 A03 = r6.A0P().get();
        try {
            C224114e r10 = A03.A02;
            String[] strArr = new String[3];
            strArr[0] = String.valueOf(0);
            C36351kA.A1V(strArr, 1, System.currentTimeMillis());
            C36351kA.A1V(strArr, 2, -1);
            A09 = r10.A09("SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC", "GET_MUTED_CHAT_JID_WITH_END_TIME_SORTED", strArr);
            int columnIndex = A09.getColumnIndex("jid");
            int columnIndex2 = A09.getColumnIndex("mute_end");
            while (A09.moveToNext()) {
                AnonymousClass11F A0N = C36421kH.A0N(A09.getString(columnIndex));
                if (A0N instanceof GroupJid) {
                    A0I.add(new AnonymousClass3J4(A0N, C36361kB.A0k(A09, columnIndex2)));
                }
            }
            A09.close();
            A03.close();
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                AnonymousClass3J4 r3 = (AnonymousClass3J4) it.next();
                AnonymousClass11F r2 = r3.A01;
                if (r2 instanceof GroupJid) {
                    AnonymousClass17X r1 = r5.A01;
                    if (r1.A0C((GroupJid) r2)) {
                        if (r1.A07.A0A((AnonymousClass144) r2) >= A07) {
                            A0I2.add(r3);
                        }
                    }
                }
            }
            AnonymousClass3LI A0R = r6.A0R();
            AnonymousClass3LI A0Q = r6.A0Q();
            if (A0I2.isEmpty()) {
                A0I2 = null;
            }
            return new C62373Fx(A0I2, !new C007203c(r5.A00.A00).A01(), !A0Q.A0B(), A0Q.A02().A0H, !A0R.A0B(), A0R.A02().A0H);
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass3DK(C20810yC r1, C20670xw r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
