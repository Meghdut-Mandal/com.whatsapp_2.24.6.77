package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0YY  reason: invalid class name */
public class AnonymousClass0YY {
    public C16100oY A00;
    public boolean A01;
    public boolean A02;
    public final Map A03 = AnonymousClass001.A0J();
    public final Set A04 = new HashSet();

    public static void A00(AnonymousClass0YY r3) {
        C16100oY r2 = r3.A00;
        if (r2 != null) {
            new HashSet(r3.A04);
            ChipGroup chipGroup = ((AnonymousClass0f1) r2).A00;
            C16080oW r1 = chipGroup.A01;
            if (r1 != null) {
                chipGroup.A03.A03(chipGroup);
                ChipGroup chipGroup2 = ((C10710ez) r1).A01;
                if (chipGroup2.A03.A02) {
                    chipGroup2.getCheckedChipId();
                    throw AnonymousClass001.A0A("onCheckedChanged");
                }
            }
        }
    }

    public ArrayList A03(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.A04);
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C17470rT) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                AnonymousClass000.A1F(A0I, childAt.getId());
            }
        }
        return A0I;
    }

    public static boolean A01(AnonymousClass0YY r5, C17470rT r6) {
        int i;
        int id = r6.getId();
        Set set = r5.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            return false;
        }
        Map map = r5.A03;
        if (!r5.A02 || set.isEmpty()) {
            i = -1;
        } else {
            i = AnonymousClass000.A0I(set.iterator().next());
        }
        C17470rT r0 = (C17470rT) map.get(Integer.valueOf(i));
        if (r0 != null) {
            A02(r5, r0, false);
        }
        boolean add = set.add(valueOf);
        if (!r6.isChecked()) {
            r6.setChecked(true);
        }
        return add;
    }

    public static boolean A02(AnonymousClass0YY r4, C17470rT r5, boolean z) {
        int id = r5.getId();
        Set set = r4.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            if (!z || set.size() != 1 || !set.contains(valueOf)) {
                boolean remove = set.remove(valueOf);
                if (r5.isChecked()) {
                    r5.setChecked(false);
                }
                return remove;
            }
            r5.setChecked(true);
        }
        return false;
    }
}
