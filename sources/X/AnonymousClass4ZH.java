package X;

import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4ZH  reason: invalid class name */
public class AnonymousClass4ZH implements AnonymousClass08V {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4ZH(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object apply(Object obj) {
        int i = this.A02;
        Object obj2 = this.A00;
        if (i != 0) {
            return ((StatusesViewModel) obj2).A0S((UserJid) this.A01);
        }
        C225014r r1 = (C225014r) obj2;
        Object obj3 = this.A01;
        C595934n r10 = (C595934n) obj;
        r1.Bnv();
        Set singleton = Collections.singleton(obj3);
        int i2 = r10.A00;
        AnonymousClass147 r2 = r10.A01;
        int i3 = 0;
        if (r2 != null) {
            i3 = 2;
        }
        r1.Btl(ExitGroupsDialogFragment.A03(r2, (String) null, singleton, i2, i3, false, true), (String) null);
        return null;
    }
}
