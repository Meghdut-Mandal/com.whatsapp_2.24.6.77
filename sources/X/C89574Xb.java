package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.4Xb  reason: invalid class name and case insensitive filesystem */
public class C89574Xb implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public C89574Xb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnFocusChangeListener(new C89574Xb(obj, i));
    }

    public void onFocusChange(View view, boolean z) {
        int i;
        TextView textView;
        BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet;
        int i2;
        switch (this.A01) {
            case 0:
                if (z) {
                    AnonymousClass2Es r1 = (AnonymousClass2Es) this.A00;
                    if (view.equals(r1.A08)) {
                        i = 1;
                    } else if (view.equals(r1.A07)) {
                        i = 0;
                    } else {
                        return;
                    }
                    r1.A00 = i;
                    return;
                }
                return;
            case 1:
                C65043Qm r2 = (C65043Qm) this.A00;
                if (!z && (textView = r2.A03) != null && textView.getVisibility() == 0 && !(r2 instanceof AnonymousClass2Fl)) {
                    AnonymousClass2Fm r22 = (AnonymousClass2Fm) r2;
                    r22.A02.setVisibility(8);
                    r22.A03.setError((CharSequence) null);
                    return;
                }
                return;
            case 2:
                AnonymousClass2Fm r12 = (AnonymousClass2Fm) this.A00;
                r12.A07.A00();
                r12.A04.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                return;
            case 3:
                ConversationSearchViewModel conversationSearchViewModel = ((ConversationSearchFragment) this.A00).A02;
                if (conversationSearchViewModel != null) {
                    C36341k9.A18(conversationSearchViewModel.A02, z);
                    return;
                }
                return;
            case 4:
                AnonymousClass4YO r0 = (AnonymousClass4YO) this.A00;
                if (z) {
                    C70803fk.A1Y((C70803fk) r0.A00);
                    return;
                }
                return;
            case 5:
                AnonymousClass24a r02 = (AnonymousClass24a) this.A00;
                if (z) {
                    C39831tt r13 = r02.A05;
                    r13.A07.BOp(C203049nB.A00(), C36361kB.A0i(), 116, r13.A0T(), (String) null);
                    return;
                }
                return;
            case 6:
                brazilPaymentMethodAddPixBottomSheet = (BrazilPaymentMethodAddPixBottomSheet) this.A00;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = brazilPaymentMethodAddPixBottomSheet.A05;
                    String str = null;
                    if (brazilAddPixKeyViewModel == null) {
                        throw C36331k8.A0d("brazilAddPixKeyViewModel");
                    }
                    AnonymousClass9WG r03 = (AnonymousClass9WG) brazilAddPixKeyViewModel.A01.A04();
                    if (r03 != null) {
                        str = r03.A00;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        i2 = 192;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                brazilPaymentMethodAddPixBottomSheet = (BrazilPaymentMethodAddPixBottomSheet) this.A00;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = brazilPaymentMethodAddPixBottomSheet.A05;
                    String str2 = null;
                    if (brazilAddPixKeyViewModel2 == null) {
                        throw C36331k8.A0d("brazilAddPixKeyViewModel");
                    }
                    AnonymousClass9WG r04 = (AnonymousClass9WG) brazilAddPixKeyViewModel2.A01.A04();
                    if (r04 != null) {
                        str2 = r04.A02;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        i2 = 191;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                RegisterName registerName = (RegisterName) this.A00;
                if (z) {
                    throw C36411kG.A0u(registerName.A0A);
                }
                return;
            case 9:
                WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) this.A00;
                if (z) {
                    wDSConversationSearchView.A02();
                    return;
                }
                return;
            default:
                WDSSearchView wDSSearchView = (WDSSearchView) this.A00;
                if (z) {
                    wDSSearchView.A01();
                    return;
                }
                return;
        }
        BrazilPaymentMethodAddPixBottomSheet.A03(brazilPaymentMethodAddPixBottomSheet, Integer.valueOf(i2), (String) null, 2);
    }
}
