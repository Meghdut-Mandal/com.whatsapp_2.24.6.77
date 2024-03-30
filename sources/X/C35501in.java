package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.1in  reason: invalid class name and case insensitive filesystem */
public class C35501in implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C35501in(Object obj, Object obj2, String str, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A00 = j;
    }

    public final void run() {
        long longValue;
        if (this.A04 != 0) {
            C26211Jh r3 = (C26211Jh) this.A01;
            AnonymousClass11F r1 = (AnonymousClass11F) this.A02;
            String str = this.A03;
            long j = this.A00;
            AnonymousClass1M0 A05 = r3.A04.A05();
            try {
                long A08 = r3.A02.A08(r1);
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("call_log_row_id", Long.valueOf(j));
                if (A05.A02.A01(contentValues, "scheduled_calls", "key_chat_row_id = ? AND key_id = ?", "ScheduledCallsStore/UPDATE_CALL_LOG_ROW_ID_BY_KEY_ID_AND_CHAT", new String[]{String.valueOf(A08), str}) == 0) {
                    Log.w("ScheduledCallsStore/updateCallLogRowId (by key_id and chat) failed to update");
                }
                A05.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) this.A02;
            String str2 = this.A03;
            long j2 = this.A00;
            ((AnonymousClass1NM) this.A01).A07();
            String string = sharedPreferences.getString(str2, "");
            AnonymousClass00C.A0D(string, 1);
            String[] strArr = (String[]) AnonymousClass099.A0K(string, String.valueOf(','), 0).toArray(new String[0]);
            Long A042 = C202339lc.A04(strArr, 0);
            long j3 = 0;
            if (A042 == null) {
                longValue = 0;
            } else {
                longValue = A042.longValue();
            }
            Long A043 = C202339lc.A04(strArr, 1);
            if (A043 != null) {
                j3 = A043.longValue();
            }
            sharedPreferences.edit().putString(str2, AnonymousClass02R.A09(",", "", "", new Long[]{Long.valueOf(longValue), Long.valueOf(j3 + j2)})).apply();
        }
    }
}
