package X;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.3V1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V1 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass2KO A01;

    public /* synthetic */ AnonymousClass3V1(Activity activity, AnonymousClass2KO r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        AnonymousClass2KO r3 = this.A01;
        Activity activity = this.A00;
        Calendar calendar = r3.A02;
        if (calendar == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        calendar.set(1, i);
        Calendar calendar2 = r3.A02;
        if (calendar2 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        calendar2.set(2, i2);
        Calendar calendar3 = r3.A02;
        if (calendar3 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        calendar3.set(5, i3);
        C54952tp r5 = new C54952tp(r3, 0);
        Calendar calendar4 = r3.A02;
        if (calendar4 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        int i4 = calendar4.get(11);
        Calendar calendar5 = r3.A02;
        if (calendar5 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        new TimePickerDialog(activity, r5, i4, calendar5.get(12), false).show();
    }
}
