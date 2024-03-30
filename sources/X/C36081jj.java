package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jj  reason: invalid class name and case insensitive filesystem */
public class C36081jj implements AnonymousClass1NK {
    public Object A00;
    public final int A01;

    public C36081jj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BSa(C107265Nh r16) {
        C107015Mf r1;
        if (1 - this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onCallEnded");
            C34621hN r2 = (C34621hN) this.A00;
            if (r2.A07 != null) {
                C135006by r12 = null;
                try {
                    r12 = C34681hT.A04(r2.A0B);
                } catch (UnsatisfiedLinkError e) {
                    Log.e((Throwable) e);
                }
                C107265Nh r11 = r16;
                if (AnonymousClass6TP.A00(r2.A0A, r12, r11)) {
                    if (!r11.A0M() && (r1 = r2.A03) != null) {
                        r1.A0D(true);
                    }
                    C34751ha r13 = r2.A07;
                    Log.i("CallsHistoryViewModel/onCallEnded");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r13.A00;
                    if (!callsHistoryFragmentV2ViewModel.A0H) {
                        Log.i("CallsHistoryViewModel/onCallEnded fully refresh the call history as the call items might be outdated");
                        callsHistoryFragmentV2ViewModel.A0I = true;
                        callsHistoryFragmentV2ViewModel.A0M.A01();
                        return;
                    }
                    C106995Md r0 = callsHistoryFragmentV2ViewModel.A06;
                    if (r0 != null) {
                        r0.A0D(true);
                    }
                    C34771hc r14 = callsHistoryFragmentV2ViewModel.A0O;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0n;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0m;
                    ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0k;
                    C19970wo r6 = callsHistoryFragmentV2ViewModel.A0Z;
                    C20810yC r8 = callsHistoryFragmentV2ViewModel.A0f;
                    AnonymousClass1C6 r10 = callsHistoryFragmentV2ViewModel.A0h;
                    AnonymousClass16D r4 = callsHistoryFragmentV2ViewModel.A0X;
                    AnonymousClass171 r5 = callsHistoryFragmentV2ViewModel.A0Y;
                    C20350xQ r9 = callsHistoryFragmentV2ViewModel.A0g;
                    C106995Md r02 = new C106995Md(r14, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r4, r5, r6, callsHistoryFragmentV2ViewModel.A0e, r8, r9, r10, r11, arrayList, linkedHashMap, lock);
                    callsHistoryFragmentV2ViewModel.A06 = r02;
                    C18670tX.A00(callsHistoryFragmentV2ViewModel, r02);
                }
            }
        }
    }

    public /* synthetic */ void BSi(C107265Nh r2, boolean z) {
        if (1 - this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onCallMissed");
        }
    }

    public void BSl(C107265Nh r8) {
        if (this.A01 == 0) {
            HomeActivity homeActivity = (HomeActivity) this.A00;
            ((AnonymousClass1V6) homeActivity.A1f.get()).A04();
            AnonymousClass3UR.A03(homeActivity.A01, (AnonymousClass1V6) homeActivity.A1f.get());
            ArrayList A0C = r8.A0C();
            boolean z = true;
            boolean z2 = false;
            if (r8.A08 == 2) {
                z2 = true;
            }
            boolean z3 = false;
            if (A0C.size() == 0) {
                z3 = true;
            }
            if (A0C.size() <= 2) {
                z = false;
            }
            HomeActivity.A13(homeActivity, new AnonymousClass6BK(z2, z3, z));
        }
    }

    public /* synthetic */ void BSm(AnonymousClass11F r2, CallState callState, String str) {
        if (2 - this.A01 == 0) {
            ConversationsFragment.A0M((ConversationsFragment) this.A00, r2);
        }
    }

    public void Bgj() {
        if (this.A01 == 0) {
            HomeActivity homeActivity = (HomeActivity) this.A00;
            AnonymousClass3UR.A03(homeActivity.A01, (AnonymousClass1V6) homeActivity.A1f.get());
        }
    }

    public /* synthetic */ void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
