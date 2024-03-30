package X;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* renamed from: X.4t0  reason: invalid class name and case insensitive filesystem */
public class C99274t0 extends C08900bV {
    public final /* synthetic */ ChipTextInputComboView A00;

    public C99274t0(ChipTextInputComboView chipTextInputComboView) {
        this.A00 = chipTextInputComboView;
    }

    public void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            ChipTextInputComboView chipTextInputComboView = this.A00;
            chipTextInputComboView.A03.setText(ChipTextInputComboView.A00(chipTextInputComboView, "00"));
            return;
        }
        ChipTextInputComboView chipTextInputComboView2 = this.A00;
        String A002 = ChipTextInputComboView.A00(chipTextInputComboView2, editable);
        Chip chip = chipTextInputComboView2.A03;
        if (TextUtils.isEmpty(A002)) {
            A002 = ChipTextInputComboView.A00(chipTextInputComboView2, "00");
        }
        chip.setText(A002);
    }
}
