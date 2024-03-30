package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.ArrayList;

/* renamed from: X.4LU  reason: invalid class name */
public final class AnonymousClass4LU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LU(UpdatesAdapter updatesAdapter) {
        super(1);
        this.this$0 = updatesAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        ViewTreeObserver viewTreeObserver;
        AnonymousClass0CP layoutManager;
        int i;
        boolean A1X = AnonymousClass000.A1X(obj);
        UpdatesFragment updatesFragment = (UpdatesFragment) this.this$0.A0M;
        UpdatesViewModel updatesViewModel = updatesFragment.A0c;
        if (A1X) {
            if (updatesViewModel != null) {
                updatesViewModel.A0D = true;
                AnonymousClass08S r1 = updatesViewModel.A0Q;
                AnonymousClass3S7 r0 = (AnonymousClass3S7) r1.A04();
                if (r0 != null) {
                    r0.A01 = true;
                }
                AnonymousClass3R7.A00(r1);
            }
            ObservableRecyclerView observableRecyclerView = updatesFragment.A0E;
            if (observableRecyclerView == null || (layoutManager = observableRecyclerView.getLayoutManager()) == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass001.A0I();
                int A0L = layoutManager.A0L();
                for (int i2 = 0; i2 < A0L; i2++) {
                    View A0R = layoutManager.A0R(i2);
                    if (A0R != null) {
                        Object tag = A0R.getTag();
                        if ((tag instanceof C48022gZ) && ((C48022gZ) tag).A01.A03() == 0) {
                            arrayList.add(A0R);
                            UpdatesViewModel updatesViewModel2 = updatesFragment.A0c;
                            if (updatesViewModel2 == null) {
                                continue;
                            } else {
                                AnonymousClass3S7 r02 = (AnonymousClass3S7) updatesViewModel2.A0Q.A04();
                                if (r02 != null) {
                                    i = r02.A06.size();
                                } else {
                                    i = 0;
                                }
                                if (i == arrayList.size()) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            ObservableRecyclerView observableRecyclerView2 = updatesFragment.A0E;
            if (!(observableRecyclerView2 == null || (viewTreeObserver = observableRecyclerView2.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnPreDrawListener(new C90004Ys(updatesFragment, arrayList, 4));
            }
        } else if (updatesViewModel != null) {
            updatesViewModel.A0D = false;
            AnonymousClass08S r12 = updatesViewModel.A0Q;
            AnonymousClass3S7 r03 = (AnonymousClass3S7) r12.A04();
            if (r03 != null) {
                r03.A01 = false;
            }
            AnonymousClass3R7.A00(r12);
        }
        return AnonymousClass0AJ.A00;
    }
}
