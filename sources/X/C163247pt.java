package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onSearchInputFocusChanged$1;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.7pt  reason: invalid class name and case insensitive filesystem */
public class C163247pt implements View.OnFocusChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163247pt(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        Integer valueOf;
        String str;
        String trim;
        int i;
        switch (this.A02) {
            case 0:
                ExpressionsSearchViewModel A0b = C90514aH.A0b((ExpressionsKeyboardSearchBottomSheet) this.A00);
                String valueOf2 = String.valueOf(((EditText) this.A01).getText());
                AnonymousClass00C.A0D(valueOf2, 0);
                if (z) {
                    C36331k8.A1T(new ExpressionsSearchViewModel$onSearchInputFocusChanged$1(A0b, valueOf2, (C023509x) null), C109325Xd.A00(A0b));
                    return;
                }
                int indexOf = A0b.A04.indexOf(A0b.A03);
                if (A0b.A04.isEmpty()) {
                    valueOf = Integer.valueOf(indexOf);
                    str = "expression_search_input_focus_failed_expression_tabs_is_empty";
                } else if (indexOf < 0) {
                    valueOf = Integer.valueOf(indexOf);
                    str = "expression_search_input_focus_failed";
                } else {
                    C001700s r1 = A0b.A07;
                    C119575q5 r4 = A0b.A03;
                    r1.A0D(new AnonymousClass55E(A0b.A02, r4, A0b.A04, A0b.A04.indexOf(r4), false));
                    return;
                }
                ExpressionsSearchViewModel.A02(A0b, valueOf, str);
                return;
            case 1:
                PaymentView paymentView = (PaymentView) this.A00;
                AnonymousClass22Q r2 = (AnonymousClass22Q) this.A01;
                if (z) {
                    r2.setHint("");
                    if (PaymentView.A07(paymentView)) {
                        paymentView.A0h.A0B();
                        return;
                    }
                    return;
                }
                r2.setHint(paymentView.getContext().getString(R.string.f12nameremoved));
                return;
            case 2:
                AnonymousClass5HD r3 = (AnonymousClass5HD) this.A00;
                PollCreatorViewModel pollCreatorViewModel = (PollCreatorViewModel) this.A01;
                if (z) {
                    WaEditText waEditText = r3.A02;
                    waEditText.setSelection(C36381kD.A06(waEditText));
                    if (r3.A04() != -1) {
                        int A04 = r3.A04() - 2;
                        if (pollCreatorViewModel.A0S(A04) && A04 != pollCreatorViewModel.A00) {
                            C36341k9.A17(pollCreatorViewModel.A02, C36431kI.A07(pollCreatorViewModel.A0D));
                            pollCreatorViewModel.A00 = A04;
                            pollCreatorViewModel.A0B.A0C(C36441kJ.A11());
                            return;
                        }
                        return;
                    }
                    return;
                }
                pollCreatorViewModel.A0U(false);
                if ((view instanceof WaEditText) && r3.A04() != -1) {
                    EditText editText = (EditText) view;
                    if (editText.getText() == null) {
                        trim = "";
                    } else {
                        trim = C36361kB.A0n(editText).trim();
                    }
                    int A042 = r3.A04() - 2;
                    if (trim.length() > 0) {
                        pollCreatorViewModel.A0T(trim, A042);
                        return;
                    }
                    List list = pollCreatorViewModel.A0D;
                    if (list.size() > 2 && C36431kI.A07(list) != A042) {
                        list.remove(A042);
                        PollCreatorViewModel.A01(pollCreatorViewModel);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = (View) this.A01;
                WaTextView waTextView = ((AnonymousClass5HC) this.A00).A01;
                Resources A0F = C36341k9.A0F(view2);
                if (z) {
                    i = C36381kD.A01(view2.getContext());
                } else {
                    i = R.color.f6nameremoved;
                }
                C36351kA.A15(A0F, waTextView, i);
                return;
        }
    }
}
