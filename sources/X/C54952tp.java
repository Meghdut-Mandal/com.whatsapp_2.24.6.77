package X;

import android.app.TimePickerDialog;
import android.widget.Button;
import android.widget.TimePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreateOrEditFragment;
import java.util.Calendar;

/* renamed from: X.2tp  reason: invalid class name and case insensitive filesystem */
public class C54952tp implements TimePickerDialog.OnTimeSetListener {
    public Object A00;
    public final int A01;

    public C54952tp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Button button;
        if (this.A01 != 0) {
            EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A00;
            ((Calendar) C36381kD.A0p(eventCreateOrEditFragment.A0Y)).set(11, i);
            AnonymousClass00T r3 = eventCreateOrEditFragment.A0Y;
            ((Calendar) C36381kD.A0p(r3)).set(12, i2);
            WaEditText waEditText = eventCreateOrEditFragment.A05;
            if (waEditText != null) {
                C18820ts r1 = eventCreateOrEditFragment.A0B;
                if (r1 != null) {
                    waEditText.setText(AnonymousClass3UM.A03(r1, (Calendar) C36381kD.A0p(r3)));
                    return;
                }
                throw C36321k7.A09();
            }
            return;
        }
        AnonymousClass2KO r32 = (AnonymousClass2KO) this.A00;
        Calendar calendar = r32.A02;
        if (calendar == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        calendar.set(11, i);
        Calendar calendar2 = r32.A02;
        if (calendar2 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        calendar2.set(12, i2);
        Calendar calendar3 = r32.A02;
        if (calendar3 == null) {
            throw C36331k8.A0d("pendingReminderDateTime");
        }
        r32.A03 = calendar3;
        AnonymousClass0FM r0 = r32.A00;
        if (r0 != null && (button = r0.A00.A0H) != null) {
            button.setEnabled(true);
        }
    }
}
