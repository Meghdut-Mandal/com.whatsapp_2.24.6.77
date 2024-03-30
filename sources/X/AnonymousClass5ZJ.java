package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Format;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.5ZJ  reason: invalid class name */
public class AnonymousClass5ZJ implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass5ZJ(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.A02 != 0) {
            IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = (IndiaUpiDobPickerBottomSheet) this.A00;
            boolean A1U = C90484aE.A1U(datePicker);
            ((TextView) this.A01).setText(((Format) C36381kD.A0p(indiaUpiDobPickerBottomSheet.A03)).format(Long.valueOf(new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime())));
            WDSButton wDSButton = indiaUpiDobPickerBottomSheet.A02;
            if (wDSButton != null) {
                wDSButton.setEnabled(A1U);
                return;
            }
            return;
        }
        AnonymousClass6DI r2 = (AnonymousClass6DI) this.A00;
        Date A002 = C131826Qu.A00(i, i2, i3);
        AnonymousClass00C.A08(A002);
        long time = A002.getTime();
        AnonymousClass6BS r1 = new AnonymousClass6BS(String.valueOf(time), r2.A04, r2.A05);
        WaFlowsViewModel waFlowsViewModel = ((FlowsWebBottomSheetContainer) this.A01).A0G;
        if (waFlowsViewModel == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        waFlowsViewModel.A03.A0C(r1);
    }
}
