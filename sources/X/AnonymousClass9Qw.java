package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.9Qw  reason: invalid class name */
public class AnonymousClass9Qw {
    public final /* synthetic */ AGJ A00;
    public final /* synthetic */ String A01;

    public AnonymousClass9Qw(AGJ agj, String str) {
        this.A00 = agj;
        this.A01 = str;
    }

    public void A00(C202059ky r8) {
        AnonymousClass0FM A002;
        AGJ agj = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = agj.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1p();
        } else {
            AnonymousClass155 r1 = agj.A00;
            if (r1 instanceof BrazilAccountRecoveryPinActivity) {
                r1.Bnv();
            }
        }
        int i = r8.A00;
        if (i != 1440) {
            if (i == 1448) {
                agj.A02.A0H.A02(r8, "FB", "PIN");
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1c();
            }
            AnonymousClass155 r2 = agj.A00;
            A002 = C202939my.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f12nameremoved));
        } else {
            int i2 = r8.A01;
            if (i2 == 0) {
                C202199lE r0 = agj.A02;
                AnonymousClass155 r5 = agj.A00;
                C202199lE.A00(r5, r0);
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1c();
                }
                boolean z = agj.A03;
                String string = r5.getString(R.string.f12nameremoved);
                String string2 = r5.getString(R.string.f12nameremoved);
                C204119pU r12 = new C204119pU(r5, z);
                C39001qm A003 = AnonymousClass3LW.A00(r5);
                A003.A0q(string);
                C39001qm.A0A(A003, string2);
                A002 = A003.create();
                A002.setOnDismissListener(r12);
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1r(i2, R.plurals.f10nameremoved);
                return;
            } else {
                AnonymousClass155 r52 = agj.A00;
                if (r52 instanceof BrazilAccountRecoveryPinActivity) {
                    BrazilAccountRecoveryPinActivity brazilAccountRecoveryPinActivity = (BrazilAccountRecoveryPinActivity) r52;
                    brazilAccountRecoveryPinActivity.A01.setErrorState(true);
                    brazilAccountRecoveryPinActivity.A01.A0E();
                    TextView textView = brazilAccountRecoveryPinActivity.A00;
                    Resources resources = brazilAccountRecoveryPinActivity.getResources();
                    Object[] objArr = new Object[1];
                    boolean A1b = C36361kB.A1b(objArr, i2);
                    textView.setText(resources.getQuantityString(R.plurals.f10nameremoved, i2, objArr));
                    TextView textView2 = brazilAccountRecoveryPinActivity.A00;
                    C36331k8.A0r(textView2.getContext(), textView2, R.color.f6nameremoved);
                    brazilAccountRecoveryPinActivity.A00.setVisibility(A1b ? 1 : 0);
                    return;
                }
                A002 = C202939my.A00(r52, (DialogInterface.OnDismissListener) null, r52.getString(R.string.f12nameremoved));
            }
        }
        A002.show();
    }
}
