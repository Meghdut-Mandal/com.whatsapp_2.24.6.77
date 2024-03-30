package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.9pD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203949pD implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ ConfirmDateOfBirthBottomSheetFragment A00;

    public /* synthetic */ C203949pD(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment) {
        this.A00 = confirmDateOfBirthBottomSheetFragment;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = this.A00;
        Calendar calendar = confirmDateOfBirthBottomSheetFragment.A0A;
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        C18820ts r0 = confirmDateOfBirthBottomSheetFragment.A05;
        if (r0 != null) {
            confirmDateOfBirthBottomSheetFragment.A1Z().setText(new SimpleDateFormat("dd/MM/yyyy", C36401kF.A0x(r0)).format(calendar.getTime()));
            return;
        }
        throw C36321k7.A09();
    }
}
