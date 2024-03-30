package X;

import android.view.View;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import java.util.List;

/* renamed from: X.7Sd  reason: invalid class name and case insensitive filesystem */
public final class C154427Sd extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154427Sd(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        super(1);
        this.this$0 = expressionsKeyboardSearchBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        WaEditText waEditText;
        C95314kY r0;
        AnonymousClass02E r1;
        MaterialButtonToggleGroup materialButtonToggleGroup;
        int i;
        Integer valueOf;
        int intValue;
        ViewFlipper viewFlipper;
        C110615ax r8 = (C110615ax) obj;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof AnonymousClass55E) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = this.this$0;
            AnonymousClass55E r82 = (AnonymousClass55E) r8;
            ViewFlipper viewFlipper2 = expressionsKeyboardSearchBottomSheet.A04;
            if (viewFlipper2 != null) {
                view = viewFlipper2.getCurrentView();
            } else {
                view = null;
            }
            if (!AnonymousClass00C.A0J(view, expressionsKeyboardSearchBottomSheet.A00)) {
                ViewFlipper viewFlipper3 = expressionsKeyboardSearchBottomSheet.A04;
                if (!(viewFlipper3 == null || (valueOf = Integer.valueOf(viewFlipper3.indexOfChild(expressionsKeyboardSearchBottomSheet.A00))) == null || (intValue = valueOf.intValue()) == -1 || (viewFlipper = expressionsKeyboardSearchBottomSheet.A04) == null)) {
                    viewFlipper.setDisplayedChild(intValue);
                }
                C36331k8.A0y(expressionsKeyboardSearchBottomSheet.A01);
            }
            List list = r82.A03;
            C95314kY r12 = expressionsKeyboardSearchBottomSheet.A0H;
            if (r12 != null && !AnonymousClass00C.A0J(list, r12.A04)) {
                MaterialButton materialButton = expressionsKeyboardSearchBottomSheet.A07;
                if (materialButton != null) {
                    materialButton.setVisibility(C36351kA.A00(list.contains(AnonymousClass55N.A00) ? 1 : 0));
                }
                MaterialButton materialButton2 = expressionsKeyboardSearchBottomSheet.A08;
                if (materialButton2 != null) {
                    materialButton2.setVisibility(C36351kA.A00(list.contains(AnonymousClass55O.A00) ? 1 : 0));
                }
                MaterialButton materialButton3 = expressionsKeyboardSearchBottomSheet.A06;
                if (materialButton3 != null) {
                    materialButton3.setVisibility(C36351kA.A00(list.contains(AnonymousClass55M.A00) ? 1 : 0));
                }
                MaterialButton materialButton4 = expressionsKeyboardSearchBottomSheet.A09;
                if (materialButton4 != null) {
                    materialButton4.setVisibility(C36351kA.A00(list.contains(AnonymousClass55P.A00) ? 1 : 0));
                }
                r12.A04 = list;
                r12.A09();
            }
            C119575q5 r4 = r82.A02;
            int i2 = r82.A00;
            if (i2 >= 0 && (r0 = expressionsKeyboardSearchBottomSheet.A0H) != null && i2 < r0.A04.size()) {
                C95314kY r02 = expressionsKeyboardSearchBottomSheet.A0H;
                AnonymousClass7gZ r5 = null;
                if (r02 != null) {
                    r1 = (AnonymousClass02E) r02.A01.get(i2);
                } else {
                    r1 = null;
                }
                if ((r1 instanceof AnonymousClass7gZ) && (r5 = (AnonymousClass7gZ) r1) != null) {
                    r5.Br5(true);
                }
                AnonymousClass7gZ r13 = expressionsKeyboardSearchBottomSheet.A0F;
                if (r13 != null && !r13.equals(r5)) {
                    r13.Br5(false);
                }
                expressionsKeyboardSearchBottomSheet.A0F = r5;
                ViewPager viewPager = expressionsKeyboardSearchBottomSheet.A05;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i2);
                }
                if (AnonymousClass00C.A0J(r4, AnonymousClass55N.A00)) {
                    materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = R.id.emojis;
                    }
                } else if (AnonymousClass00C.A0J(r4, AnonymousClass55O.A00)) {
                    materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = R.id.gifs;
                    }
                } else if (AnonymousClass00C.A0J(r4, AnonymousClass55M.A00)) {
                    materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = R.id.avatar_stickers;
                    }
                } else if (AnonymousClass00C.A0J(r4, AnonymousClass55P.A00) && (materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A0A) != null) {
                    i = R.id.stickers;
                }
                MaterialButtonToggleGroup.A01(materialButtonToggleGroup, i, true);
            }
            ExpressionsKeyboardSearchBottomSheet.A03(r82.A01, expressionsKeyboardSearchBottomSheet, r4);
            if (r82.A04 && (waEditText = expressionsKeyboardSearchBottomSheet.A0B) != null) {
                waEditText.requestFocus();
                waEditText.A0C(false);
                String str = expressionsKeyboardSearchBottomSheet.A0Q;
                if (str != null) {
                    expressionsKeyboardSearchBottomSheet.A0R = true;
                    WaEditText waEditText2 = expressionsKeyboardSearchBottomSheet.A0B;
                    if (waEditText2 != null) {
                        waEditText2.setText(str);
                    }
                    waEditText.selectAll();
                    expressionsKeyboardSearchBottomSheet.A0Q = null;
                }
            }
        } else if (r8 instanceof AnonymousClass55D) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet2 = this.this$0;
            AnonymousClass55D r83 = (AnonymousClass55D) r8;
            ExpressionsKeyboardSearchBottomSheet.A03(r83.A00, expressionsKeyboardSearchBottomSheet2, r83.A01);
            boolean A1R = AnonymousClass000.A1R(r83.A02.length());
            View view2 = expressionsKeyboardSearchBottomSheet2.A01;
            if (view2 != null) {
                view2.setVisibility(C36381kD.A09(A1R));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
