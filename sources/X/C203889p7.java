package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.text.Format;
import java.util.Calendar;

/* renamed from: X.9p7  reason: invalid class name and case insensitive filesystem */
public class C203889p7 implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C203889p7(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str;
        if (this.A03 != 0) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = (IndiaUpiInternationalActivationActivity) this.A00;
            AnonymousClass00C.A0D(datePicker, 3);
            C165597tg.A13((TextView) this.A01, (Format) this.A02, IndiaUpiInternationalActivationActivity.A0z(datePicker));
            WDSButton wDSButton = indiaUpiInternationalActivationActivity.A09;
            if (wDSButton == null) {
                throw C36331k8.A0d("buttonView");
            }
            TextInputLayout textInputLayout = indiaUpiInternationalActivationActivity.A03;
            if (textInputLayout == null) {
                throw C36331k8.A0d("endDateInputLayout");
            }
            long j = indiaUpiInternationalActivationActivity.A00;
            DatePicker datePicker2 = indiaUpiInternationalActivationActivity.A01;
            if (datePicker2 == null) {
                throw C36331k8.A0d("endDatePicker");
            }
            long A0z = IndiaUpiInternationalActivationActivity.A0z(datePicker2);
            if (AnonymousClass6XI.A00(A0z, j) <= 0) {
                str = indiaUpiInternationalActivationActivity.getString(R.string.f12nameremoved);
            } else if (AnonymousClass6XI.A00(A0z, j) > 89) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                DateFormat dateInstance = DateFormat.getDateInstance(2, C36401kF.A0x(indiaUpiInternationalActivationActivity.A00));
                instance.add(5, 90);
                long timeInMillis = instance.getTimeInMillis();
                str = C36391kE.A0v(indiaUpiInternationalActivationActivity, dateInstance.format(Long.valueOf(timeInMillis)), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            } else {
                str = null;
            }
            textInputLayout.setError(str);
            TextInputLayout textInputLayout2 = indiaUpiInternationalActivationActivity.A04;
            if (textInputLayout2 == null) {
                throw C36331k8.A0d("startDateInputLayout");
            }
            CharSequence error = textInputLayout2.getError();
            boolean z = false;
            if (error == null || error.length() == 0) {
                TextInputLayout textInputLayout3 = indiaUpiInternationalActivationActivity.A03;
                if (textInputLayout3 == null) {
                    throw C36331k8.A0d("endDateInputLayout");
                }
                CharSequence error2 = textInputLayout3.getError();
                if (error2 == null || error2.length() == 0) {
                    z = true;
                }
            }
            wDSButton.setEnabled(z);
            return;
        }
        C165597tg.A13((TextView) this.A01, (Format) this.A02, IndiaUpiPauseMandateActivity.A0z(datePicker));
        IndiaUpiPauseMandateActivity.A11((IndiaUpiPauseMandateActivity) this.A00);
    }
}
