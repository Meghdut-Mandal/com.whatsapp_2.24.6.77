package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;

/* renamed from: X.7sr  reason: invalid class name and case insensitive filesystem */
public class C165087sr implements AnonymousClass00P, C006302t {
    public Object A00;
    public final int A01;

    public C165087sr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
                businessDirectoryContextualSearchViewModel.A0b.A0C(obj);
                C36341k9.A17(businessDirectoryContextualSearchViewModel.A0d, 3);
                ArrayList A04 = BusinessDirectoryContextualSearchViewModel.A04(businessDirectoryContextualSearchViewModel);
                A04.add(new AnonymousClass5EM(1));
                businessDirectoryContextualSearchViewModel.A0F.A0C(A04);
                C142616pA r2 = businessDirectoryContextualSearchViewModel.A0L;
                Integer A002 = C129006Eo.A00(businessDirectoryContextualSearchViewModel);
                AnonymousClass593 A003 = AnonymousClass593.A00(70);
                A003.A09 = A002;
                C142616pA.A01(r2, A003);
                break;
            case 1:
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("BweMLModelManager/fetchBweModels/Failed to fetch BWE ml model: ");
                C36321k7.A1Z(A0u, C90484aE.A0k(obj));
                break;
            case 2:
                C36321k7.A1Q("BweMLModelManager/fetchBweModels/Successfully fetch BWE ml Model: ", (String) obj, AnonymousClass000.A0u());
                break;
            case 3:
                C133586Zc r3 = (C133586Zc) this.A00;
                r3.A0c = false;
                C133586Zc.A05(r3.A0I(), r3, (String) obj, Math.max(r3.A0H(), 50000), true);
                break;
            case 4:
                ((AI9) this.A00).A00 = Long.valueOf(C19970wo.A00((C19970wo) obj));
                return null;
            case 5:
                RegisterName registerName = (RegisterName) this.A00;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C36321k7.A1a(A0u2, C90494aF.A0c(obj, "RegisterName//maybeCreatePasskey/result: ", A0u2));
                if (obj == C108285Sx.PASSKEY_CREATED) {
                    i = 18;
                } else {
                    if (!(obj == C108285Sx.INELIGIBLE || obj == C108285Sx.ALREADY_HAS_PASSKEY || obj == C108285Sx.ERROR_BEFORE_USER_INTERACTION || obj == C108285Sx.USER_CANCELED)) {
                        if (obj == C108285Sx.ERROR_AFTER_USER_INTERACTION || obj == C108285Sx.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION) {
                            i = 19;
                        } else {
                            Log.e("RegisterName//maybeCreatePasskey/non exhaustive");
                        }
                    }
                    registerName.A0I.A0C(false);
                    return null;
                }
                registerName.runOnUiThread(new C81143wX((Object) registerName, i));
                registerName.A0I.A0C(false);
                return null;
            case 6:
                ((C96154ms) this.A00).A0P.A0k((C134826bf) obj);
                return null;
            case 7:
                ((SearchViewModel) this.A00).A0i((AnonymousClass11F) obj);
                return null;
            case 8:
                ((SearchViewModel) this.A00).A0l((C134826bf) obj);
                return null;
            case 9:
                ((AnonymousClass6YP) this.A00).A1B.set(((Number) obj).intValue());
                return null;
            case 10:
                C225314u r22 = (C225314u) this.A00;
                C1498172w.A01(r22.A05, r22, obj, 18);
                break;
            default:
                return ((VoipActivityV2) this.A00).A3r((AnonymousClass00S) obj);
        }
        return AnonymousClass0AJ.A00;
    }
}
