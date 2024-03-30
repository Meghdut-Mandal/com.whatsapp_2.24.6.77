package X;

import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Ls  reason: invalid class name and case insensitive filesystem */
public class C106885Ls extends C132446Tt {
    public final /* synthetic */ CallGridViewModel A00;

    public C106885Ls(CallGridViewModel callGridViewModel) {
        this.A00 = callGridViewModel;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!C36431kI.A1Y(this) && bool.booleanValue()) {
            CallGridViewModel callGridViewModel = this.A00;
            LinkedHashMap linkedHashMap = callGridViewModel.A0z;
            Iterator A10 = C36371kC.A10(linkedHashMap);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                AnonymousClass6NY r2 = new AnonymousClass6NY((C129066Eu) A11.getValue());
                r2.A07 = CallGridViewModel.A07(callGridViewModel, (UserJid) A11.getKey(), ((C129066Eu) A11.getValue()).A0J);
                linkedHashMap.put(A11.getKey(), r2.A00());
            }
            CallGridViewModel.A0J(callGridViewModel);
        }
    }
}
