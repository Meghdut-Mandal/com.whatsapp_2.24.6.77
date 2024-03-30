package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.5WQ  reason: invalid class name */
public class AnonymousClass5WQ implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public final int A01;

    public AnonymousClass5WQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (this.A01 != 0) {
            ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) this.A00;
            scheduleCallFragment.A0F.set(i, i2, i3);
            scheduleCallFragment.A03.setText(DateFormat.getDateInstance(2, C36401kF.A0x(scheduleCallFragment.A0B)).format(scheduleCallFragment.A0F.getTime()));
            return;
        }
        Date A002 = C131826Qu.A00(i, i2, i3);
        ((C1259962d) this.A00).A00(new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(A002), i4, i5, i6, A002.getTime());
    }
}
