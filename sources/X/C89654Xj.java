package X;

import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dmsetting.ChangeDMSettingActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import java.util.ArrayList;

/* renamed from: X.4Xj  reason: invalid class name and case insensitive filesystem */
public class C89654Xj implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public C89654Xj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        View view;
        switch (this.A01) {
            case 0:
                ChangeDMSettingActivity changeDMSettingActivity = (ChangeDMSettingActivity) this.A00;
                int A0I = AnonymousClass000.A0I(C012005e.A02(radioGroup, i).getTag());
                changeDMSettingActivity.A03 = A0I;
                ChangeDMSettingActivity.A07(changeDMSettingActivity, A0I);
                return;
            case 1:
                ((ChangeEphemeralSettingActivity) this.A00).A01 = AnonymousClass000.A0I(C012005e.A02(radioGroup, i).getTag());
                return;
            case 2:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                AnonymousClass01I A0h = dialogFragment.A0h();
                if (A0h instanceof AnonymousClass4QY) {
                    ((AnonymousClass4QY) A0h).BWX(AnonymousClass000.A0I(C012005e.A02(radioGroup, i).getTag()));
                }
                dialogFragment.A1b();
                return;
            case 3:
                ((ChangeExpiringGroupsSettingActivity) this.A00).A01 = AnonymousClass000.A0I(C012005e.A02(radioGroup, i).getTag());
                return;
            case 4:
                view = (View) this.A00;
                ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
                break;
            default:
                view = (View) this.A00;
                break;
        }
        view.setEnabled(true);
    }
}
