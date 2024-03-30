package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5YM  reason: invalid class name */
public class AnonymousClass5YM implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public AnonymousClass5YM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Object obj;
        Button button;
        int i;
        Dialog dialog;
        View findViewById;
        Window window;
        switch (this.A01) {
            case 0:
                Drawable drawable = (Drawable) this.A00;
                if (dialogInterface != null && (window = ((Dialog) dialogInterface).getWindow()) != null) {
                    window.setBackgroundDrawable(drawable);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    C111565cU.A00(valueAnimator, drawable, 0);
                    valueAnimator.setRepeatCount(0);
                    valueAnimator.setDuration(200);
                    float[] A0v = C90524aI.A0v();
                    // fill-array-data instruction
                    A0v[0] = 0;
                    A0v[1] = 1065353216;
                    valueAnimator.setFloatValues(A0v);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A00;
                if ((dialogInterface instanceof AnonymousClass0FL) && (dialog = (Dialog) dialogInterface) != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior.A02(findViewById).A0Z(searchFunStickersBottomSheet.A0U);
                    return;
                }
                return;
            case 2:
                ((C146806wC) this.A00).A0A();
                return;
            case 3:
                C146806wC r3 = (C146806wC) this.A00;
                C36341k9.A0q(r3.A0A.getContext(), r3.A05.findViewById(16908290).getRootView(), R.color.f6nameremoved);
                r3.A0V.A02();
                return;
            case 4:
                obj = this.A00;
                button = ((AnonymousClass0FM) dialogInterface).A00.A0H;
                i = 29;
                break;
            case 5:
                IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this.A00;
                C36371kC.A1F(((AnonymousClass0FM) dialogInterface).A00.A0H, indiaUpiMandatePaymentActivity, dialogInterface, 30);
                indiaUpiMandatePaymentActivity.A0S.BOn(C36381kD.A0m(), (Integer) null, "decline_mandate_dialogue", indiaUpiMandatePaymentActivity.A04, true);
                return;
            case 6:
                obj = this.A00;
                button = ((AnonymousClass0FM) dialogInterface).A00.A0H;
                i = 33;
                break;
            default:
                ((VoipCallControlBottomSheetV2) this.A00).A1i(dialogInterface);
                return;
        }
        C36371kC.A1F(button, obj, dialogInterface, i);
    }
}
