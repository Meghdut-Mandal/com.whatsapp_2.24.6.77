package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.2iR  reason: invalid class name and case insensitive filesystem */
public class C49022iR extends C132446Tt {
    public final /* synthetic */ C34621hN A00;

    public C49022iR(C34621hN r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A09;
        AnonymousClass3KV r8;
        Cursor A092;
        int i;
        C26211Jh r10 = this.A00.A0J;
        AnonymousClass12P r9 = r10.A04;
        AnonymousClass1M0 A04 = r9.get();
        try {
            C224114e r82 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            C36401kF.A1T(A1R, 0, System.currentTimeMillis() - 900000);
            A09 = r82.A09("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC  LIMIT 1", "ScheduledCallsStore/GET_NEAREST_UPCOMING_CALL", A1R);
            if (!A09.moveToFirst()) {
                r8 = null;
            } else {
                r8 = C26211Jh.A00(A09, r10);
            }
            A09.close();
            A04.close();
            AnonymousClass1M0 A042 = r9.get();
            try {
                C224114e r7 = A042.A02;
                String[] A1R2 = C36441kJ.A1R();
                C36421kH.A1Q(A1R2, System.currentTimeMillis() - 900000);
                A092 = r7.A09("SELECT COUNT(*) as count FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/GET_NUM_UPCOMING_CALLS", A1R2);
                if (A092.moveToNext()) {
                    i = C36351kA.A03(A092, "count");
                    A092.close();
                    A042.close();
                } else {
                    A092.close();
                    A042.close();
                    i = 0;
                }
                return C36341k9.A0I(r8, i);
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

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C34621hN r3 = this.A00;
        r3.A05 = null;
        Object obj2 = pair.first;
        if (obj2 != null || C36381kD.A03(pair) <= 0) {
            AnonymousClass3KV r2 = (AnonymousClass3KV) obj2;
            int A03 = C36381kD.A03(pair);
            C34751ha r0 = r3.A07;
            if (r0 != null) {
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                callsHistoryFragmentV2ViewModel.A00 = A03;
                CallsHistoryFragmentV2ViewModel.A06(callsHistoryFragmentV2ViewModel, r2);
                CallsHistoryFragmentV2ViewModel.A05(callsHistoryFragmentV2ViewModel);
                return;
            }
            return;
        }
        Log.w("CallsHistoryDataSource/RefreshScheduledCallsTask/onPostExecute mismatch between data");
    }
}
