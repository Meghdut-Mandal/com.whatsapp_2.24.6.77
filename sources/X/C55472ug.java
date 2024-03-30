package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreateOrEditFragment;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: X.2ug  reason: invalid class name and case insensitive filesystem */
public class C55472ug implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public final int A01;

    public C55472ug(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.A01;
        Object obj = this.A00;
        if (i4 != 0) {
            EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) obj;
            ((Calendar) C36381kD.A0p(eventCreateOrEditFragment.A0Y)).set(i, i2, i3);
            C18820ts r0 = eventCreateOrEditFragment.A0B;
            if (r0 != null) {
                String format = DateFormat.getDateInstance(2, C36401kF.A0x(r0)).format(((Calendar) C36381kD.A0p(eventCreateOrEditFragment.A0Y)).getTime());
                WaEditText waEditText = eventCreateOrEditFragment.A03;
                if (waEditText != null) {
                    waEditText.setText(format);
                    return;
                }
                return;
            }
            throw C36321k7.A09();
        }
        C70803fk r2 = (C70803fk) obj;
        r2.A5S.Boy(new C21705AWz(r2, i, i2, i3));
    }
}
