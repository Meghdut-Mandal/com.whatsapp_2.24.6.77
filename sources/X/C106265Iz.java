package X;

import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.5Iz  reason: invalid class name and case insensitive filesystem */
public final class C106265Iz extends AnonymousClass3T1 implements AnonymousClass4RU {
    public AnonymousClass1HQ A00;
    public final C63503Kh A01;

    public void A0n(int i) {
        super.A0n(6);
    }

    public boolean A1P() {
        return false;
    }

    public AnonymousClass3T1 B32(C64933Qa r4) {
        AnonymousClass00C.A0D(r4, 0);
        return new C106265Iz(this, r4, this.A0I);
    }

    public C106265Iz(AnonymousClass1HQ r3, C64933Qa r4, C107265Nh r5) {
        this(r4, r5.A01);
        UserJid userJid;
        this.A01.A01(r5);
        this.A00 = r3;
        C135006by r1 = r5.A04;
        if (r1.A03) {
            DeviceJid deviceJid = r5.A02;
            if (deviceJid != null) {
                userJid = deviceJid.userJid;
            } else {
                return;
            }
        } else {
            userJid = r1.A01;
        }
        A0q(userJid);
    }

    public final boolean A1X() {
        C107265Nh r1 = (C107265Nh) this.A01.A00;
        if (r1 == null || r1.A0D != null || !r1.A0M()) {
            return false;
        }
        return true;
    }

    public final boolean A1Y() {
        C107265Nh r1 = (C107265Nh) this.A01.A00;
        if (r1 == null || !r1.A04.A03 || r1.A07 != 7) {
            return false;
        }
        return true;
    }

    public final boolean A1Z() {
        C107265Nh r0 = (C107265Nh) this.A01.A00;
        if (r0 == null || r0.A0D == null) {
            return false;
        }
        return true;
    }

    public final boolean A1b() {
        C107265Nh r0;
        AnonymousClass1HQ r1;
        String str;
        Object obj;
        C63503Kh r4 = this.A01;
        C107265Nh r02 = (C107265Nh) r4.A00;
        Boolean bool = null;
        if (r02 != null) {
            bool = Boolean.valueOf(r02.A0M());
        }
        if (C36371kC.A1X(bool, true)) {
            C107265Nh r03 = (C107265Nh) r4.A00;
            if (r03 == null || r03.A0F == null) {
                return false;
            }
            return true;
        } else if (!C36371kC.A1X(bool, false) || (r0 = (C107265Nh) r4.A00) == null || r0.A07 != 0 || (r1 = this.A00) == null || (str = this.A1J.A01) == null || (obj = r1.A00.get(C34681hT.A08(str))) == null || obj == CallState.NONE || obj == CallState.LINK || obj == CallState.PRECALLING) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean A1d() {
        AnonymousClass1HQ r1;
        String str;
        CallState callState;
        int ordinal;
        C107265Nh r0 = (C107265Nh) this.A01.A00;
        if (r0 == null || ((r0.A07 != 0 && !A1c()) || (r1 = this.A00) == null || (str = this.A1J.A01) == null || (callState = (CallState) r1.A00.get(C34681hT.A08(str))) == null || ((ordinal = callState.ordinal()) != 1 && ordinal != 2 && ordinal != 3))) {
            return false;
        }
        return true;
    }

    public final boolean A1e() {
        C107265Nh r0;
        C63503Kh r1 = this.A01;
        C107265Nh r02 = (C107265Nh) r1.A00;
        if (r02 == null || r02.A0D == null || (r0 = (C107265Nh) r1.A00) == null || r0.A08 != 2) {
            return false;
        }
        return true;
    }

    public final boolean A1a() {
        C107265Nh r0;
        if (A1b() || (r0 = (C107265Nh) this.A01.A00) == null) {
            return false;
        }
        int i = r0.A07;
        if (Integer.valueOf(i) == null) {
            return false;
        }
        if (i != 2 && i != 4 && i != 1 && i != 0 && i != 3) {
            return false;
        }
        if (A1c() || !A1e()) {
            return true;
        }
        return false;
    }

    public final boolean A1c() {
        C107265Nh r0;
        if (!A1e() || (r0 = (C107265Nh) this.A01.A00) == null) {
            return false;
        }
        C107265Nh.A01(r0);
        if (r0.A0A == 0) {
            return true;
        }
        return false;
    }

    public C106265Iz(C64933Qa r2, long j) {
        super(r2, 90, j);
        this.A01 = A0U(R.id.lazy_field_call_log);
        A0n(6);
    }

    public C106265Iz(C106265Iz r9, C64933Qa r10, long j) {
        super(r9, r10, j, true);
        C63503Kh A0U = A0U(R.id.lazy_field_call_log);
        this.A01 = A0U;
        Object obj = r9.A01.A00;
        if (obj != null) {
            A0U.A01(obj);
        }
        this.A00 = r9.A00;
    }
}
