package X;

import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.group.ExitGroupsDialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4ZJ  reason: invalid class name */
public class AnonymousClass4ZJ implements AnonymousClass08V {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4ZJ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final Object apply(Object obj) {
        Set set;
        AnonymousClass01z r1;
        C595934n r10;
        if (this.A03 != 0) {
            Object obj2 = this.A01;
            r1 = (AnonymousClass01z) this.A02;
            r10 = (C595934n) obj;
            ((ProgressDialogFragment) this.A00).A1k();
            set = Collections.singleton(obj2);
        } else {
            set = (Set) this.A01;
            r1 = (AnonymousClass01z) this.A02;
            r10 = (C595934n) obj;
            ((ProgressDialogFragment) this.A00).A1k();
        }
        ExitGroupsDialogFragment.A03(r10.A01, (String) null, set, r10.A00, 1, false, true).A1i(r1, (String) null);
        return null;
    }
}
