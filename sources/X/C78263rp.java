package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3rp  reason: invalid class name and case insensitive filesystem */
public final class C78263rp implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78263rp(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r14) {
        Cursor A09;
        Cursor A092;
        ArrayList arrayList;
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass2bS r142 = (AnonymousClass2bS) r14;
        AnonymousClass12P r6 = ((C24911Eg) this.A00.get()).A01;
        AnonymousClass1M0 A04 = r6.get();
        try {
            C224114e r7 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            C36401kF.A1T(A1R, 0, r142.A1N);
            A09 = r7.A09("SELECT selectable_options_count, invalid_state, poll_logging_id FROM message_poll WHERE message_row_id = ?", "GET_MESSAGE_POLL_SQL", A1R);
            if (A09.moveToLast()) {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("selectable_options_count");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("invalid_state");
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("poll_logging_id");
                r142.A01 = A09.getInt(columnIndexOrThrow);
                r142.A00 = A09.getInt(columnIndexOrThrow2);
                r142.A02 = A09.getLong(columnIndexOrThrow3);
            }
            A09.close();
            A04.close();
            AnonymousClass1M0 A042 = r6.get();
            try {
                C224114e r4 = A042.A02;
                String[] A1R2 = C36441kJ.A1R();
                C36401kF.A1T(A1R2, 0, r142.A1N);
                A092 = r4.A09("SELECT _id, option_sha256, option_name, vote_total FROM message_poll_option WHERE message_row_id = ?", "GET_MESSAGE_POLL_OPTION_SQL", A1R2);
                if (!A092.moveToFirst()) {
                    arrayList = null;
                } else {
                    arrayList = AnonymousClass001.A0I();
                    int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow5 = A092.getColumnIndexOrThrow("option_name");
                    int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("option_sha256");
                    int columnIndexOrThrow7 = A092.getColumnIndexOrThrow("vote_total");
                    do {
                        long j = A092.getLong(columnIndexOrThrow4);
                        String string = A092.getString(columnIndexOrThrow5);
                        String string2 = A092.getString(columnIndexOrThrow6);
                        int i = A092.getInt(columnIndexOrThrow7);
                        AnonymousClass3PS r0 = new AnonymousClass3PS(string, string2);
                        r0.A01 = j;
                        r0.A00 = i;
                        arrayList.add(r0);
                    } while (A092.moveToNext());
                }
                A092.close();
                A042.close();
                if (arrayList != null) {
                    List list = r142.A05;
                    list.clear();
                    list.addAll(arrayList);
                    return;
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A04.close();
            throw th;
        }
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C24911Eg) this.A00.get()).A01((AnonymousClass2bS) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C24911Eg) this.A00.get()).A01((AnonymousClass2bS) r2);
    }
}
