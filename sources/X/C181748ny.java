package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8ny  reason: invalid class name and case insensitive filesystem */
public abstract class C181748ny extends C181758nz {
    public final List A00 = AnonymousClass001.A0I();

    public int A1a() {
        C195869Wj A1c = A1c(2);
        if (A1c != null) {
            return A1c.A01;
        }
        return 0;
    }

    public C195869Wj A1c(int i) {
        for (C195869Wj r1 : this.A00) {
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public void A1f(List list) {
        List list2 = this.A00;
        list2.clear();
        list2.addAll(list);
    }

    public C181748ny(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public GroupJid A1b(int i) {
        C195869Wj A1c = A1c(i);
        if (A1c != null) {
            return A1c.A02;
        }
        return null;
    }

    public String A1d(int i) {
        C195869Wj A1c = A1c(i);
        if (A1c != null) {
            return A1c.A03;
        }
        return null;
    }

    public ArrayList A1e(int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (C195869Wj r1 : this.A00) {
            if (r1.A00 == i) {
                A0I.add(r1);
            }
        }
        return A0I;
    }

    public C181748ny(C64933Qa r2, C207209uj r3, int i, long j) {
        super(r2, r3, i, j);
    }

    public C181748ny(AnonymousClass6X6 r2, C207209uj r3, int i, long j) {
        super(r2, r3, i, j);
    }
}
