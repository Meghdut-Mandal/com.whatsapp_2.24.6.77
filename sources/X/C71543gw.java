package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3gw  reason: invalid class name and case insensitive filesystem */
public class C71543gw implements C159417jK {
    public final C19970wo A00;
    public final C26211Jh A01;
    public final C591632w A02;
    public final AnonymousClass005 A03;

    public void BV1() {
        Cursor A09;
        C26211Jh r3 = this.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(1);
        C36351kA.A1V(strArr, 1, 0);
        strArr[2] = String.valueOf(System.currentTimeMillis() - 900000);
        AnonymousClass12P r5 = r3.A04;
        AnonymousClass1M0 A04 = r5.get();
        try {
            A09 = A04.A02.A09(" SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = ?  AND scheduled_timestamp > ?  AND scheduled_timestamp <= ? ", "ScheduledCallsStoreSELECT_UPCOMING_SCHEDULED_CALLS_IN_TIMERANGE", strArr);
            while (A09.moveToNext()) {
                AnonymousClass3KV A002 = C26211Jh.A00(A09, r3);
                if (A002 != null) {
                    A0I.add(A002);
                }
            }
            A09.close();
            A04.close();
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                long j = ((AnonymousClass3KV) it.next()).A02;
                C36391kE.A1W(A0I2, j);
                ((C31021b9) this.A03.get()).A00(j);
            }
            if (A0I2.size() > 0) {
                C591632w r2 = this.A02;
                C44722Op r1 = new C44722Op();
                r1.A00 = Long.valueOf((long) A0I2.size());
                r2.A00.Bly(r1);
            }
            int size = A0I2.size();
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                strArr2[i] = String.valueOf(A0I2.get(i));
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1O("creation_message_row_id IN ", A0u, size);
            String obj = A0u.toString();
            AnonymousClass1M0 A05 = r5.A05();
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("is_upcoming", false);
                if (A05.A02.A01(contentValues, "scheduled_calls", obj, "ScheduledCallsStore/UPDATE_LIST_OF_SCHEDULED_CALLS_IS_UPCOMING_TO_FALSE", strArr2) == 0) {
                    Log.w("ScheduledCallsStore/updateListOfScheduledCallsIsUpcomingToFalse (by row ID) failed to update");
                }
                A05.close();
                r3.A01.A01(new C35691j6(r3, 36), 67);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A04.close();
            throw th;
        }
        throw th;
    }

    public C71543gw(C19970wo r1, C26211Jh r2, C591632w r3, AnonymousClass005 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
