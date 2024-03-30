package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.4fy  reason: invalid class name and case insensitive filesystem */
public class C93154fy extends AnonymousClass0FM implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener {
    public DatePickerDialog.OnDateSetListener A00;
    public final DatePicker A01;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            cancel();
        } else if (i == -1 && this.A00 != null) {
            DatePicker datePicker = this.A01;
            datePicker.clearFocus();
            this.A00.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
    }

    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        this.A01.init(i, i2, i3, this);
    }

    public C93154fy(DatePickerDialog.OnDateSetListener onDateSetListener, Context context, Calendar calendar, int i, int i2, int i3, int i4) {
        super(context, i);
        DatePicker datePicker = new DatePicker(getContext());
        this.A01 = datePicker;
        AnonymousClass0YZ r1 = this.A00;
        r1.A0E = datePicker;
        r1.A07 = 0;
        A04(-1, context.getString(R.string.f12nameremoved), this);
        A04(-2, context.getString(R.string.f12nameremoved), this);
        if (calendar != null) {
            i2 = calendar.get(1);
            i3 = calendar.get(2);
            i4 = calendar.get(5);
        }
        datePicker.init(i2, i3, i4, this);
        this.A00 = onDateSetListener;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A01.init(bundle.getInt("year"), bundle.getInt("month"), bundle.getInt("day"), this);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        DatePicker datePicker = this.A01;
        onSaveInstanceState.putInt("year", datePicker.getYear());
        onSaveInstanceState.putInt("month", datePicker.getMonth());
        onSaveInstanceState.putInt("day", datePicker.getDayOfMonth());
        return onSaveInstanceState;
    }
}
