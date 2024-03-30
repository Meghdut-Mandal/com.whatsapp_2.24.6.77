package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.2tG  reason: invalid class name and case insensitive filesystem */
public class C54632tG implements AnonymousClass4T8 {
    public Object A00;
    public final int A01;

    public C54632tG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bl7(String str) {
        String str2;
        int i;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C70803fk r3 = (C70803fk) obj;
                int A02 = C70803fk.A02(r3);
                if (!r3.A3n.A0E(3403) || !r3.A6I) {
                    str2 = null;
                } else {
                    str2 = r3.A4B.getStringText();
                    A02 = 8;
                }
                ExpressionsKeyboardSearchBottomSheet A002 = r3.A3k.A00(str2, A02);
                r3.A3j = A002;
                A002.A0L = r3.A45;
                A002.A0Q = str;
                A002.A0N = r3.A78;
                A002.A0J = new C55042ty(r3, 0);
                A002.A0E = new C89984Yq(this, 0);
                AnonymousClass09Y r2 = new AnonymousClass09Y(C70803fk.A06(r3));
                r2.A0D(r3.A3j, "expressions_search_dialog_fragment");
                r2.A02();
                return;
            case 1:
                AnonymousClass3UT r32 = (AnonymousClass3UT) obj;
                C125375zo r22 = r32.A0O;
                if (r32 instanceof C44152Mc) {
                    i = 4;
                } else if (r32 instanceof AnonymousClass2Mb) {
                    i = 3;
                } else {
                    i = 7;
                }
                ExpressionsKeyboardSearchBottomSheet A003 = r22.A00((String) null, i);
                r32.A0B = A003;
                if (str != null) {
                    A003.A0Q = str;
                }
                A003.A0E = new C89984Yq(r32, 1);
                C87754Qa r0 = r32.A0C;
                if (r0 != null) {
                    r0.Bu5(A003);
                    return;
                }
                return;
            default:
                C74263lK r33 = (C74263lK) obj;
                r33.A07.Btl(r33.A0D.A00((String) null, 2), (String) null);
                return;
        }
    }

    public void BuT() {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        switch (this.A01) {
            case 0:
                C70803fk r2 = (C70803fk) this.A00;
                bottomSheetBehavior = r2.A0n;
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 3) {
                    r2.A6W = true;
                    break;
                } else {
                    C70803fk.A0u(r2);
                    return;
                }
                break;
            case 1:
                AnonymousClass3UT r22 = (AnonymousClass3UT) this.A00;
                bottomSheetBehavior = r22.A06;
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 3) {
                    r22.A0I = true;
                    break;
                } else {
                    AnonymousClass3UT.A03(r22);
                    return;
                }
            default:
                C74263lK r6 = (C74263lK) this.A00;
                if (r6.A03 != null && (bottomSheetBehavior2 = r6.A00) != null) {
                    bottomSheetBehavior2.A0d(true);
                    r6.A00.A0W(5);
                    r6.A03.A03(r6.A07, r6.A0B, new C89524Ww(this, 2), new C55632uw(this, 5));
                    InterceptingEditText interceptingEditText = r6.A03.A04;
                    if (interceptingEditText != null) {
                        C36421kH.A0r(interceptingEditText);
                        return;
                    }
                    return;
                }
                return;
        }
        bottomSheetBehavior.A0W(4);
    }
}
