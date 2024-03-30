package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.4LS  reason: invalid class name */
public final class AnonymousClass4LS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LS(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3EL r10 = (AnonymousClass3EL) obj;
        AnonymousClass00C.A0D(r10, 0);
        UpdatesFragment updatesFragment = this.this$0;
        AnonymousClass3EK r7 = r10.A02;
        Set set = r7.A00;
        if (!(!set.isEmpty())) {
            List list = r10.A03;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (Object next : list) {
                C64933Qa r0 = ((AnonymousClass3T1) next).A1J;
                AnonymousClass00C.A07(r0);
                linkedHashMap.put(r0, next);
            }
            list.size();
            Set<Object> set2 = r7.A02;
            for (Object obj2 : set2) {
                AnonymousClass3T1 r2 = (AnonymousClass3T1) linkedHashMap.get(obj2);
                if (r2 != null) {
                    ((C34901hp) updatesFragment.A1g().get()).A05(updatesFragment.A0a(), r2);
                }
            }
            if (set2.isEmpty() && set.isEmpty()) {
                for (Object obj3 : r7.A03) {
                    AnonymousClass3T1 r22 = (AnonymousClass3T1) linkedHashMap.get(obj3);
                    if (r22 != null) {
                        ((C34901hp) updatesFragment.A1g().get()).A06(updatesFragment.A0a(), r22, updatesFragment);
                    }
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
