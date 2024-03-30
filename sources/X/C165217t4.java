package X;

import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.search.SearchFragment;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.7t4  reason: invalid class name and case insensitive filesystem */
public class C165217t4 implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165217t4(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTH(Object obj) {
        Object obj2;
        switch (this.A02) {
            case 0:
                CallGridViewModel.A0H(((C105545Fb) this.A01).A05(), (CallGridViewModel) this.A00, false);
                return;
            case 1:
                C96154ms r5 = (C96154ms) this.A01;
                HashSet A0k = C90524aI.A0k(((SearchFragment) this.A00).A1i.A0T());
                r5.A02 = (Map) obj;
                int i = 0;
                while (true) {
                    C1512578v r1 = r5.A0O;
                    if (i < r1.size()) {
                        C132056Ry r2 = (C132056Ry) r1.get(i);
                        int i2 = r2.A00;
                        if (i2 == 3) {
                            Object obj3 = r2.A01;
                            if (obj3 instanceof AnonymousClass141) {
                                obj2 = ((AnonymousClass141) obj3).A0H;
                            } else {
                                i++;
                            }
                        } else {
                            if (i2 == 2) {
                                obj2 = r2.A01;
                                if (!(obj2 instanceof PhoneUserJid)) {
                                }
                            }
                            i++;
                        }
                        if (obj2 != null && A0k.contains(obj2)) {
                            r5.A07(i);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                C95474lE r3 = (C95474lE) this.A00;
                C001600r r22 = (C001600r) this.A01;
                C122855vX r7 = (C122855vX) obj;
                if (r7.A00 != 5) {
                    r3.A0U(r7);
                    return;
                } else {
                    r22.A0D(r7);
                    return;
                }
        }
    }
}
