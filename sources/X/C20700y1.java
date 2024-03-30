package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0y1  reason: invalid class name and case insensitive filesystem */
public class C20700y1 implements AnonymousClass00M {
    public final Set A00 = new HashSet();
    public final Set A01;

    public boolean A00() {
        Set<C219512b> set;
        synchronized (this) {
            set = this.A00;
            if (set.size() == 0) {
                for (AnonymousClass18K BEj : this.A01) {
                    set.add(BEj.BEj());
                }
            }
        }
        for (C219512b r2 : set) {
            ThreadLocal threadLocal = r2.A01;
            if (threadLocal.get() != null) {
                Object obj = threadLocal.get();
                C18740tg.A06(obj);
                if (((Boolean) obj).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("TransactionLockManager/inTransactionOnCurrentThread/transaction is in progress ");
                    sb.append(r2.A00);
                    Log.w(sb.toString());
                    return true;
                }
            }
        }
        return false;
    }

    public C20700y1(Set set) {
        this.A01 = set;
    }
}
