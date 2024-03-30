package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass01I;
import X.AnonymousClass3NG;
import X.C012005e;
import X.C178818he;
import X.C178998ik;
import X.C207359uy;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public class IndiaUpiPaymentsValuePropsBottomSheetActivity extends C178998ik {

    public class BottomSheetValuePropsFragment extends WDSBottomSheetDialogFragment {
        public void A1k(AnonymousClass3NG r3) {
            r3.A00.A06 = false;
        }

        public void A19() {
            super.A19();
            AnonymousClass01I A0h = A0h();
            if (A0h instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
                ((C178818he) A0h).A49();
            }
            C36341k9.A15(this);
        }

        public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            AF7 af7;
            int i;
            String A47;
            String str;
            boolean A1S;
            String str2;
            String str3;
            int i2;
            View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
            View A02 = C012005e.A02(inflate, R.id.close);
            C178818he r2 = (C178818he) A0h();
            if (r2 != null) {
                C207359uy.A00(A02, this, 49);
                TextView A0O = C36391kE.A0O(inflate, R.id.title);
                View A022 = C012005e.A02(inflate, R.id.title_v2);
                View A023 = C012005e.A02(inflate, R.id.sub_title_v2);
                View A024 = C012005e.A02(inflate, R.id.main_value_props_img);
                TextView A0O2 = C36391kE.A0O(inflate, R.id.value_props_sub_title);
                View A025 = C012005e.A02(inflate, R.id.value_props_contact_img);
                TextSwitcher textSwitcher = (TextSwitcher) C012005e.A02(inflate, R.id.value_props_desc);
                TextView A0O3 = C36391kE.A0O(inflate, R.id.value_props_continue);
                int i3 = r2.A02;
                if (i3 == 2) {
                    A0O3.setText(R.string.f12nameremoved);
                    A025.setVisibility(8);
                    A0O2.setText(R.string.f12nameremoved);
                    textSwitcher.setText(A0n(R.string.f12nameremoved));
                    r2.A4B((Long) null);
                    if (r2.A0F != null) {
                        af7 = r2.A0S;
                        i = C36361kB.A0i();
                        i2 = 55;
                        str = r2.A02;
                        A1S = AnonymousClass000.A1S(r2.A02, 11);
                        str2 = r2.A0i;
                        str3 = r2.A0h;
                        A47 = "chat";
                    }
                    C36421kH.A13(A0O3, r2, 0);
                } else if (i3 == 14) {
                    C36361kB.A15(A025, A0O2, textSwitcher, 8);
                    C36391kE.A1K(A0O);
                    A0O3.setText(R.string.f12nameremoved);
                    C36361kB.A15(A022, A023, A024, 0);
                    af7 = r2.A0S;
                    i = 0;
                    A47 = r2.A47();
                    str = r2.A02;
                    A1S = AnonymousClass000.A1S(r2.A02, 11);
                    str2 = r2.A0i;
                    str3 = r2.A0h;
                    i2 = null;
                } else {
                    r2.A4A(textSwitcher);
                    if (r2.A02 == 11) {
                        A0O2.setText(R.string.f12nameremoved);
                        C36351kA.A1A(inflate, R.id.value_props_sub_title_2, 0);
                    }
                    C36421kH.A13(A0O3, r2, 0);
                }
                af7.A09(i, i2, A47, str, str2, str3, A1S);
                C36421kH.A13(A0O3, r2, 0);
            }
            return inflate;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Btm(new BottomSheetValuePropsFragment());
    }
}
