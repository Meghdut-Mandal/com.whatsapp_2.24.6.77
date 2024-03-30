package X;

import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$1;
import com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity;
import com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity$addLifecycleObserver$1$1;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2;

/* renamed from: X.7pd  reason: invalid class name and case insensitive filesystem */
public class C163087pd implements C004301x {
    public Object A00;
    public final int A01;

    public C163087pd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRR(AnonymousClass02E r4, AnonymousClass01z r5) {
        AnonymousClass01N r1;
        AnonymousClass00N waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                CsatSurveyBloksActivity csatSurveyBloksActivity = (CsatSurveyBloksActivity) obj;
                if ((r4 instanceof BkBottomSheetContainerFragment) && (r1 = r4.A0P) != null) {
                    waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1 = new CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(r4, csatSurveyBloksActivity);
                    break;
                } else {
                    return;
                }
            case 1:
                WaBloksBottomSheetActivity waBloksBottomSheetActivity = (WaBloksBottomSheetActivity) obj;
                if ((r4 instanceof BkBottomSheetContainerFragment) && (r1 = r4.A0P) != null) {
                    waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1 = new WaBloksBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$1(r4, waBloksBottomSheetActivity);
                    break;
                } else {
                    return;
                }
            case 2:
                WaBloksGenericBottomSheetActivity waBloksGenericBottomSheetActivity = (WaBloksGenericBottomSheetActivity) obj;
                if ((r4 instanceof BkBottomSheetContainerFragment) && (r1 = r4.A0P) != null) {
                    waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1 = new WaBloksGenericBottomSheetActivity$addLifecycleObserver$1$1(r4, waBloksGenericBottomSheetActivity);
                    break;
                } else {
                    return;
                }
            default:
                BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = (BloksCDSBottomSheetActivity) obj;
                if ((r4 instanceof BkCdsBottomSheetFragment) && (r1 = r4.A0P) != null) {
                    waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1 = new BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2(r4, bloksCDSBottomSheetActivity);
                    break;
                } else {
                    return;
                }
        }
        r1.A04(waBloksGenericBottomSheetActivity$addLifecycleObserver$1$1);
    }
}
