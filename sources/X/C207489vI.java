package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

/* renamed from: X.9vI  reason: invalid class name and case insensitive filesystem */
public final class C207489vI implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ WaEditText A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ BrazilPaymentMethodAddPixBottomSheet A02;
    public final /* synthetic */ C10810fG A03;

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition;
        AnonymousClass9WG r0;
        C102374zt r7 = null;
        if (adapterView != null && (itemAtPosition = adapterView.getItemAtPosition(i)) != null && (itemAtPosition instanceof C195959Wy)) {
            C195959Wy r10 = (C195959Wy) itemAtPosition;
            String str = r10.A03;
            C10810fG r9 = this.A03;
            TextWatcher textWatcher = (TextWatcher) r9.element;
            if (textWatcher != null) {
                this.A01.removeTextChangedListener(textWatcher);
            }
            WaEditText waEditText = this.A01;
            Editable text = waEditText.getText();
            if (text != null) {
                text.clear();
            }
            waEditText.setInputType(r10.A00);
            int i2 = 0;
            waEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(r10.A01)});
            BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = this.A02;
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = brazilPaymentMethodAddPixBottomSheet.A05;
            if (brazilAddPixKeyViewModel == null) {
                throw C36331k8.A0d("brazilAddPixKeyViewModel");
            }
            C001700s r3 = brazilAddPixKeyViewModel.A01;
            AnonymousClass9WG r02 = (AnonymousClass9WG) r3.A04();
            if (r02 != null) {
                r0 = new AnonymousClass9WG(str, r02.A02, r02.A00);
            } else {
                r0 = null;
            }
            r3.A0D(r0);
            String str2 = r10.A02;
            if (str2 != null) {
                r7 = new C102374zt(waEditText, str2);
                waEditText.addTextChangedListener(r7);
            }
            r9.element = r7;
            WaEditText waEditText2 = this.A00;
            if (!"PHONE".equals(str)) {
                i2 = 8;
            }
            waEditText2.setVisibility(i2);
            BrazilPaymentMethodAddPixBottomSheet.A03(brazilPaymentMethodAddPixBottomSheet, 190, str, 2);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public C207489vI(WaEditText waEditText, WaEditText waEditText2, BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet, C10810fG r4) {
        this.A03 = r4;
        this.A01 = waEditText;
        this.A02 = brazilPaymentMethodAddPixBottomSheet;
        this.A00 = waEditText2;
    }
}
