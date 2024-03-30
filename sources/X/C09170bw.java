package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.0bw  reason: invalid class name and case insensitive filesystem */
public class C09170bw implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ ChipGroup A01;

    public C09170bw(ChipGroup chipGroup) {
        this.A01 = chipGroup;
    }

    public void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(AnonymousClass04F.A00());
            }
            AnonymousClass0YY r3 = chipGroup.A03;
            Chip chip = (Chip) view2;
            r3.A03.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                AnonymousClass0YY.A01(r3, chip);
            }
            chip.A05 = new AnonymousClass0f2(r3);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            AnonymousClass0YY r3 = chipGroup.A03;
            Chip chip = (Chip) view2;
            chip.A05 = null;
            r3.A03.remove(Integer.valueOf(chip.getId()));
            r3.A04.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
