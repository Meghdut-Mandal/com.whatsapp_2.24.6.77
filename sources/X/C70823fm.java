package X;

import android.os.Bundle;
import com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1;
import com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3fm  reason: invalid class name and case insensitive filesystem */
public final class C70823fm implements AnonymousClass4Q2 {
    public final C225314u A00;
    public final C43632Je A01;

    public boolean B73(AnonymousClass4Q1 r7, Collection collection, int i) {
        AnonymousClass00C.A0D(collection, 1);
        if (i == 32) {
            AnonymousClass2D4 r5 = this.A01.A00;
            AnonymousClass3T1 A0S = C36421kH.A0S(collection);
            C225314u r4 = this.A00;
            AnonymousClass00C.A0D(A0S, 0);
            AnonymousClass1CF r1 = r5.A02;
            C64933Qa r2 = A0S.A1J;
            if (r1.A02(r2.A00)) {
                r5.A01.A02.A01(11);
                String str = r2.A01;
                AnonymousClass00C.A07(str);
                SupportNegativeFeedbackBottomSheet supportNegativeFeedbackBottomSheet = new SupportNegativeFeedbackBottomSheet();
                Bundle A07 = AnonymousClass001.A07();
                A07.putString("message_id", str);
                supportNegativeFeedbackBottomSheet.A17(A07);
                r4.Btm(supportNegativeFeedbackBottomSheet);
                return true;
            }
            r5.A00.A02(r4, A0S, C85674Hz.A00);
            return true;
        } else if (i != 33) {
            return false;
        } else {
            AnonymousClass2D5 r42 = this.A01.A01;
            AnonymousClass3T1 A0S2 = C36421kH.A0S(collection);
            C225314u r52 = this.A00;
            AnonymousClass00C.A0D(A0S2, 0);
            AnonymousClass1CF r12 = r42.A02;
            C64933Qa r22 = A0S2.A1J;
            if (r12.A02(r22.A00)) {
                C65263Rj r43 = r42.A01;
                r43.A02.A01(10);
                String str2 = r22.A01;
                AnonymousClass00C.A07(str2);
                if (!r43.A00.A09()) {
                    Log.i("SupportMessageFeedbackUtils/sendPositiveFeedback/no-connectivity");
                    C65263Rj.A00(r52);
                    return true;
                }
                C36331k8.A1T(new SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(r52, r43, str2, (C023509x) null), r43.A05);
                return true;
            }
            r42.A00.A01(r52, A0S2);
            return true;
        }
    }

    public C70823fm(C225314u r1, C43632Je r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
