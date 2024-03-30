package X;

import android.content.Context;
import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.7pM  reason: invalid class name and case insensitive filesystem */
public class C162917pM extends C66803Xj {
    public Object A00;
    public final int A01;

    public C162917pM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass3EH r1;
        Editable text;
        String obj;
        String A0n;
        Editable editable2 = editable;
        switch (this.A01) {
            case 2:
                if (editable != null) {
                    SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A00;
                    String obj2 = editable.toString();
                    WaEditText waEditText = searchFunStickersBottomSheet.A09;
                    if (waEditText != null) {
                        if (obj2.length() > 0) {
                            A0n = "";
                        } else {
                            A0n = searchFunStickersBottomSheet.A0n(R.string.f12nameremoved);
                        }
                        waEditText.setHint(A0n);
                    }
                    WaImageButton waImageButton = searchFunStickersBottomSheet.A0A;
                    if (waImageButton != null) {
                        int i = 0;
                        if (obj2 == null || obj2.length() == 0) {
                            i = 8;
                        }
                        waImageButton.setVisibility(i);
                    }
                    if (SearchFunStickersBottomSheet.A0F(obj2)) {
                        String str = searchFunStickersBottomSheet.A0S;
                        if (str != null) {
                            String str2 = null;
                            String A0y = C36371kC.A0y(str);
                            WaEditText waEditText2 = searchFunStickersBottomSheet.A09;
                            if (!(waEditText2 == null || (text = waEditText2.getText()) == null || (obj = text.toString()) == null)) {
                                str2 = C36371kC.A0y(obj);
                            }
                            if (AnonymousClass00C.A0J(A0y, str2)) {
                                return;
                            }
                        }
                        SearchFunStickersBottomSheet.A0D(searchFunStickersBottomSheet, true);
                        return;
                    }
                    C90484aE.A0X(searchFunStickersBottomSheet).A0T(false);
                    return;
                }
                return;
            case 3:
                C144326s0 r12 = (C144326s0) this.A00;
                Context context = r12.A0H;
                AnonymousClass1H2 r7 = r12.A0K;
                C21060yb r6 = r12.A0I;
                C19890wg r8 = r12.A0M;
                MentionableEntry mentionableEntry = r12.A0B;
                C18740tg.A04(mentionableEntry);
                AnonymousClass6YV.A0F(context, editable2, mentionableEntry.getPaint(), r6, r7, r8, R.color.f6nameremoved, r12.A0G);
                return;
            case 4:
                PaymentView paymentView = (PaymentView) this.A00;
                if (paymentView.A12.A01() && (r1 = paymentView.A14) != null && paymentView.A0f.A02) {
                    r1.A00(editable.toString());
                    return;
                }
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(charSequence, 0);
                ((C006302t) this.A00).invoke(charSequence);
                return;
            case 1:
                ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = (ExpressionsKeyboardSearchBottomSheet) this.A00;
                C90514aH.A0b(expressionsKeyboardSearchBottomSheet).A0T(String.valueOf(charSequence), expressionsKeyboardSearchBottomSheet.A0R);
                expressionsKeyboardSearchBottomSheet.A0R = false;
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
