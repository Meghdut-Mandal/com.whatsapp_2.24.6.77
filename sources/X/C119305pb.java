package X;

import android.os.Bundle;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.ArrayList;

/* renamed from: X.5pb  reason: invalid class name and case insensitive filesystem */
public class C119305pb {
    public final ArrayList A00;
    public final ArrayList A01;

    public static FilterBottomSheetDialogFragment A00(C88434Sr r4, C119305pb r5) {
        FilterBottomSheetDialogFragment filterBottomSheetDialogFragment = new FilterBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arg-categories", r5.A00);
        bundle.putParcelableArrayList("arg-selected-categories", r5.A01);
        filterBottomSheetDialogFragment.A17(bundle);
        filterBottomSheetDialogFragment.A02 = r4;
        return filterBottomSheetDialogFragment;
    }

    public C119305pb(ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = arrayList;
        this.A01 = arrayList2;
    }
}
