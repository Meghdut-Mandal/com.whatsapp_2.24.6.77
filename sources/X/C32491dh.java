package X;

import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1dh  reason: invalid class name and case insensitive filesystem */
public class C32491dh implements C021809f {
    public final /* synthetic */ CallsHistoryFragmentV2 A00;

    public C32491dh(CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        this.A00 = callsHistoryFragmentV2;
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r8) {
        if ((menu instanceof C016307a) && AnonymousClass1MI.A02(this.A00.A0W, (C21000yV) null, 4497)) {
            ((C016307a) menu).A0C = true;
        }
        menu.add(0, R.id.menuitem_calls_delete, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = this.A00;
        if (C20800yB.A01(C21000yV.A02, callsHistoryFragmentV2.A0W, 4023)) {
            menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f12nameremoved).setIcon(C54512t4.A00(callsHistoryFragmentV2, R.drawable.ic_settings_delete)).setShowAsAction(0);
        }
        return true;
    }

    public void BVS(AnonymousClass0V9 r7) {
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = this.A00;
        HashMap hashMap = callsHistoryFragmentV2.A13;
        if (!hashMap.isEmpty()) {
            for (C42631z8 A0D : hashMap.values()) {
                A0D.A0D(false, true, false);
            }
            hashMap.clear();
            C34591hI r1 = callsHistoryFragmentV2.A0E;
            Set keySet = hashMap.keySet();
            AnonymousClass00C.A0D(keySet, 0);
            r1.A09 = keySet;
            RecyclerView recyclerView = callsHistoryFragmentV2.A04;
            C18740tg.A04(recyclerView);
            recyclerView.A0h(0);
        }
        callsHistoryFragmentV2.A03 = null;
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r9) {
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = this.A00;
        if (!callsHistoryFragmentV2.A12()) {
            Log.w("CallsHistoryFragmentV2/onPrepareActionMode not attached to an activity");
            return false;
        }
        HashMap hashMap = callsHistoryFragmentV2.A13;
        if (hashMap.isEmpty()) {
            r9.A05();
            return true;
        }
        r9.A0B(String.format(C18820ts.A01(callsHistoryFragmentV2.A0R.A00), "%d", new Object[]{Integer.valueOf(hashMap.size())}));
        AnonymousClass01I A0i = callsHistoryFragmentV2.A0i();
        C24801Dv.A03(A0i.findViewById(R.id.action_mode_bar), A0i.getWindowManager());
        return true;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r15) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_calls_delete) {
            CallsHistoryFragmentV2 callsHistoryFragmentV2 = this.A00;
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = callsHistoryFragmentV2.A0F;
            HashMap hashMap = callsHistoryFragmentV2.A13;
            Set keySet = new HashMap(hashMap).keySet();
            C585830g r7 = new C585830g(callsHistoryFragmentV2ViewModel);
            Lock lock = callsHistoryFragmentV2ViewModel.A0n;
            AnonymousClass1HJ r8 = callsHistoryFragmentV2ViewModel.A0b;
            new C49652jT(callsHistoryFragmentV2ViewModel.A0M, r7, r8, callsHistoryFragmentV2ViewModel.A0k, callsHistoryFragmentV2ViewModel.A0m, keySet, lock).A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
            hashMap.clear();
            C34591hI r2 = callsHistoryFragmentV2.A0E;
            Set keySet2 = hashMap.keySet();
            AnonymousClass00C.A0D(keySet2, 0);
            r2.A09 = keySet2;
            AnonymousClass0V9 r0 = callsHistoryFragmentV2.A03;
            if (r0 == null) {
                return true;
            }
            r0.A05();
            return true;
        } else if (itemId != R.id.menuitem_clear_call_log) {
            return false;
        } else {
            new CallsHistoryClearCallLogDialogFragment().A1f(this.A00.A0l(), (String) null);
            return false;
        }
    }
}
