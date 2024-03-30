package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2iQ  reason: invalid class name and case insensitive filesystem */
public class C49012iQ extends C132446Tt {
    public final /* synthetic */ C34621hN A00;

    public C49012iQ(C34621hN r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.1hN r0 = r7.A00
            X.1hP r0 = r0.A0K
            X.1hQ r4 = r0.A00
            r1 = 4
            r3 = 0
            java.lang.String[] r6 = X.C36441kJ.A1R()     // Catch:{ all -> 0x003e }
            r0 = 0
            X.C36431kI.A1O(r6, r1, r0)     // Catch:{ all -> 0x003e }
            X.12P r0 = r4.A02     // Catch:{ all -> 0x003e }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x003e }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "SELECT _id, jid_row_id, favorite_type, sort_order FROM favorite ORDER BY sort_order ASC LIMIT ?"
            java.lang.String r0 = "FavoriteStore/FAVORITE_GET_ALL_FAVORITES_WITH_LIMIT"
            android.database.Cursor r2 = r2.A09(r1, r0, r6)     // Catch:{ all -> 0x0037 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0030 }
            java.util.ArrayList r0 = X.C34651hQ.A01(r2, r4)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002c
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x002c:
            r5.close()     // Catch:{ all -> 0x003e }
            return r0
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r2 = r0.exception
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "FavoriteStore/getAllFavoritesWithLimit failed to retrieve all favorites"
            com.whatsapp.util.Log.e(r0, r2)
            X.0wN r1 = r4.A00
            java.lang.String r0 = "FavoriteStore/getAllFavoritesWithLimit"
            r1.A0D(r0, r3, r2)
        L_0x0054:
            X.09w r0 = X.C023409w.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49012iQ.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        C34621hN r2 = this.A00;
        r2.A04 = null;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("CallsHistoryDataSource/RefreshFavoritesTask/onPostExecute retrieved ", A0u, list);
        C36321k7.A1a(A0u, " favorites");
        C34751ha r1 = r2.A07;
        if (r1 != null) {
            Log.i("CallsHistoryViewModel/onOngoingCallLogUpdated");
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
            callsHistoryFragmentV2ViewModel.A0F = list;
            CallsHistoryFragmentV2ViewModel.A05(callsHistoryFragmentV2ViewModel);
        }
    }
}
