package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Mh  reason: invalid class name and case insensitive filesystem */
public final class C86794Mh extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C44072La $newsletterInfo;
    public final /* synthetic */ AnonymousClass00S $successCallback;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86794Mh(C44072La r2, UpdatesFragment updatesFragment, AnonymousClass00S r4) {
        super(1);
        this.this$0 = updatesFragment;
        this.$newsletterInfo = r2;
        this.$successCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        UpdatesViewModel updatesViewModel = this.this$0.A0c;
        if (updatesViewModel != null) {
            C44072La r6 = this.$newsletterInfo;
            AnonymousClass00S r5 = this.$successCallback;
            AnonymousClass00C.A0D(r6, 0);
            AnonymousClass11F A06 = r6.A06();
            AnonymousClass00C.A08(A06);
            C001700s r8 = updatesViewModel.A0U;
            List A0w = C36401kF.A0w(r8);
            if (A0w != null) {
                Iterator it = A0w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (AnonymousClass00C.A0J(((AnonymousClass3JI) obj2).A02.A06(), A06)) {
                        break;
                    }
                }
                AnonymousClass3JI r4 = (AnonymousClass3JI) obj2;
                if (r4 != null) {
                    r4.A01 = true;
                    AnonymousClass3R7.A00(r8);
                    if (r6.A0N()) {
                        List list = updatesViewModel.A0l;
                        AnonymousClass11F A062 = r6.A06();
                        AnonymousClass00C.A08(A062);
                        list.add(0, A062);
                    }
                    updatesViewModel.A0a.A00(r6, C52512pY.RECOMMENDED_NEWSLETTERS, (Long) null, new C86854Mn(r6, r4, updatesViewModel, r5));
                }
            }
            UpdatesViewModel.A06(updatesViewModel);
        }
        return AnonymousClass0AJ.A00;
    }
}
