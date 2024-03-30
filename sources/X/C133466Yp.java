package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;

/* renamed from: X.6Yp  reason: invalid class name and case insensitive filesystem */
public class C133466Yp implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ ScheduleCallFragment A00;

    public C133466Yp(ScheduleCallFragment scheduleCallFragment) {
        this.A00 = scheduleCallFragment;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        ScheduleCallFragment scheduleCallFragment = this.A00;
        scheduleCallFragment.A0F.set(11, i);
        scheduleCallFragment.A0F.set(12, i2);
        scheduleCallFragment.A04.setText(AnonymousClass3UM.A03(scheduleCallFragment.A0B, scheduleCallFragment.A0F));
    }
}
