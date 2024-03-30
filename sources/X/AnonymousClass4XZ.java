package X;

import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.SingleSelectionDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4XZ  reason: invalid class name */
public class AnonymousClass4XZ implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onLongClick(View view) {
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                if (homeActivity.A03 != 200) {
                    return false;
                }
                int ordinal = homeActivity.A0z.ordinal();
                ArrayList A14 = C36441kJ.A14(r3);
                for (C226315e r0 : C226315e.values()) {
                    A14.add(homeActivity.getString(r0.title));
                }
                String[] A1b = C36431kI.A1b(A14);
                SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
                singleSelectionDialogFragment.A17(SingleSelectionDialogFragment.A05(A1b, -24, ordinal, R.string.f12nameremoved));
                homeActivity.Btm(singleSelectionDialogFragment);
                return true;
            case 1:
                HomeActivity homeActivity2 = (HomeActivity) this.A00;
                if (homeActivity2.A1A != null) {
                    ((C129036Er) homeActivity2.A1I.get()).A03(homeActivity2.A1A);
                }
                homeActivity2.Btm(C53222qy.A00((String) null, 8));
                return true;
            default:
                AnonymousClass3K3 r2 = (AnonymousClass3K3) this.A00;
                List list = AnonymousClass0D3.A0I;
                return AnonymousClass000.A1X(r2.A03.invoke(r2.A01));
        }
    }
}
