package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.4Vo  reason: invalid class name and case insensitive filesystem */
public class C89184Vo extends C06570Uc {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89184Vo(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A02(View view, float f) {
        if (this.A02 == 0) {
            View A022 = C012005e.A02(view, R.id.topHandle);
            if (((double) f) > 0.7d && f < 1.0f) {
                A022.setAlpha(1.0f - f);
            } else if (f == 1.0f) {
                A022.setAlpha(0.0f);
                A022.setVisibility(8);
            }
        }
    }

    public void A03(View view, int i) {
        if (this.A02 == 0) {
            DialogFragment dialogFragment = (DialogFragment) this.A00;
            Dialog dialog = dialogFragment.A02;
            View A022 = C012005e.A02(view, R.id.topHandle);
            if (i == 3) {
                ((BottomSheetBehavior) this.A01).A0h = true;
                if (dialog != null) {
                    AnonymousClass1RC.A02(C224514j.A00(dialog.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved), dialog);
                }
                C36391kE.A1C(C36341k9.A0G(dialogFragment), view, C224514j.A00(dialog.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                A022.setVisibility(8);
                return;
            }
            if (dialog != null) {
                AnonymousClass1RC.A02(R.color.f6nameremoved, dialog);
            }
            view.setBackground(C36381kD.A0H(view.getContext(), R.drawable.language_selector_bottomsheet_background));
            if (i != 4) {
                A022.setVisibility(0);
                if (i == 5) {
                    dialogFragment.A1b();
                }
            }
        } else if (i == 1 && !AnonymousClass000.A1X(((C50792la) this.A01).A00.invoke())) {
            ((BottomSheetBehavior) this.A00).A0W(3);
        }
    }
}
