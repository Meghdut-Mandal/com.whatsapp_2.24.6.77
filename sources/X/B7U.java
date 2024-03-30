package X;

import android.text.Editable;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public class B7U extends C66803Xj {
    public Object A00;
    public final int A01;

    public B7U(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(editable, 0);
                BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = ((BrazilPaymentMethodAddPixBottomSheet) this.A00).A05;
                if (brazilAddPixKeyViewModel == null) {
                    throw C36331k8.A0d("brazilAddPixKeyViewModel");
                }
                brazilAddPixKeyViewModel.A0T(editable.toString());
                return;
            case 1:
                AnonymousClass00C.A0D(editable, 0);
                BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = ((BrazilPaymentMethodAddPixBottomSheet) this.A00).A05;
                if (brazilAddPixKeyViewModel2 == null) {
                    throw C36331k8.A0d("brazilAddPixKeyViewModel");
                }
                brazilAddPixKeyViewModel2.A0S(editable.toString());
                return;
            case 2:
                IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                indiaUpiSendPaymentToVpaFragment.A02.setVisibility(4);
                indiaUpiSendPaymentToVpaFragment.A0O.setEnabled(AnonymousClass000.A1R(editable.toString().length()));
                EditText editText = indiaUpiSendPaymentToVpaFragment.A00;
                C012005e.A0F(AnonymousClass00F.A04(editText.getContext(), C224514j.A00(indiaUpiSendPaymentToVpaFragment.A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)), editText);
                return;
            case 5:
                AnonymousClass00C.A0D(editable, 0);
                boolean A07 = AnonymousClass098.A07(editable.toString(), "0", false);
                IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A00;
                if (A07) {
                    LinearLayout linearLayout = indiaUpiCreateCustomNumberActivity.A00;
                    if (linearLayout == null) {
                        throw C36331k8.A0d("customNumberBulletRulesContainer");
                    }
                    linearLayout.setVisibility(8);
                    TextInputLayout textInputLayout = indiaUpiCreateCustomNumberActivity.A01;
                    if (textInputLayout == null) {
                        throw C36331k8.A0d("enterCustomNumberTextInputLayout");
                    }
                    textInputLayout.setError(indiaUpiCreateCustomNumberActivity.getString(R.string.f12nameremoved));
                    WaEditText waEditText = indiaUpiCreateCustomNumberActivity.A03;
                    if (waEditText == null) {
                        throw C36331k8.A0d("customNumberEditText");
                    }
                    waEditText.requestFocus();
                    return;
                }
                TextInputLayout textInputLayout2 = indiaUpiCreateCustomNumberActivity.A01;
                if (textInputLayout2 == null) {
                    throw C36331k8.A0d("enterCustomNumberTextInputLayout");
                }
                textInputLayout2.setErrorEnabled(false);
                LinearLayout linearLayout2 = indiaUpiCreateCustomNumberActivity.A00;
                if (linearLayout2 == null) {
                    throw C36331k8.A0d("customNumberBulletRulesContainer");
                }
                linearLayout2.setVisibility(0);
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A01) {
            case 3:
                AnonymousClass00C.A0D(charSequence, 0);
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
                confirmDateOfBirthBottomSheetFragment.A1b(ConfirmDateOfBirthBottomSheetFragment.A00(confirmDateOfBirthBottomSheetFragment, charSequence.toString()));
                return;
            case 4:
                AnonymousClass00C.A0D(charSequence, 0);
                ((ConfirmLegalNameBottomSheetFragment) this.A00).A1c(AnonymousClass000.A1R(charSequence.length()));
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
