package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.12o  reason: invalid class name and case insensitive filesystem */
public final class C220212o implements AnonymousClass12J {
    public final C219712j A00;
    public final AnonymousClass12O A01;

    public C220212o(C219712j r2, AnonymousClass12O r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    private final ArrayList A00(C223313w r5) {
        C219712j r3 = this.A00;
        ArrayList A03 = AnonymousClass03T.A03(Long.valueOf(r3.A07(r5)));
        PhoneUserJid A0A = this.A01.A0A(r5);
        if (A0A != null) {
            A03.add(Long.valueOf(r3.A07(A0A)));
        }
        return A03;
    }

    private final ArrayList A01(PhoneUserJid phoneUserJid) {
        C219712j r4 = this.A00;
        ArrayList A03 = AnonymousClass03T.A03(Long.valueOf(r4.A07(phoneUserJid)));
        for (Jid A07 : this.A01.A0F(phoneUserJid)) {
            A03.add(Long.valueOf(r4.A07(A07)));
        }
        return A03;
    }

    public List BDF(AnonymousClass11F r9) {
        List singletonList;
        AnonymousClass00C.A0D(r9, 0);
        if (r9 instanceof C223313w) {
            singletonList = A00((C223313w) r9);
        } else if (r9 instanceof PhoneUserJid) {
            singletonList = A01((PhoneUserJid) r9);
        } else {
            singletonList = Collections.singletonList(Long.valueOf(this.A00.A07(r9)));
            AnonymousClass00C.A08(singletonList);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : singletonList) {
            if (((Number) next).longValue() >= 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List BDG(AnonymousClass11F r9) {
        List singletonList;
        AnonymousClass00C.A0D(r9, 0);
        if (r9 instanceof C223313w) {
            singletonList = C007103b.A0W(A00((C223313w) r9));
        } else if (r9 instanceof PhoneUserJid) {
            singletonList = A01((PhoneUserJid) r9);
        } else {
            singletonList = Collections.singletonList(Long.valueOf(this.A00.A07(r9)));
            AnonymousClass00C.A08(singletonList);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : singletonList) {
            if (((Number) next).longValue() >= 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List BDH(AnonymousClass11F r6) {
        Object[] objArr;
        if (r6 instanceof C223313w) {
            objArr = new UserJid[2];
            objArr[0] = this.A01.A0A((C223313w) r6);
        } else if (r6 instanceof PhoneUserJid) {
            objArr = new UserJid[2];
            objArr[0] = r6;
            r6 = this.A01.A09((PhoneUserJid) r6);
        } else {
            List singletonList = Collections.singletonList(r6);
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        objArr[1] = r6;
        return AnonymousClass02R.A0C(objArr);
    }
}
