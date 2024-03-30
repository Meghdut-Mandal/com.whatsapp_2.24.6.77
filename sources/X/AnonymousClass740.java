package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.740  reason: invalid class name */
public class AnonymousClass740 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07;

    public AnonymousClass740(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, boolean z) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = z;
    }

    public final void run() {
        C202319lY r5;
        if (this.A07 != 0) {
            C167747yk r4 = (C167747yk) this.A00;
            UserJid userJid = (UserJid) this.A01;
            boolean z = this.A06;
            C207059uU r7 = (C207059uU) this.A02;
            C206289t2 r2 = (C206289t2) this.A03;
            C188008yt r8 = (C188008yt) this.A04;
            List list = (List) this.A05;
            C64933Qa r1 = r4.A0A;
            if (r1 != null) {
                AnonymousClass2bZ r9 = (AnonymousClass2bZ) r4.A07.A02.A03(r1);
                C001700s r12 = r4.A03;
                C198489de r42 = r4.A08;
                Boolean valueOf = Boolean.valueOf(z);
                if (r2 != null) {
                    r5 = r2.A00;
                } else {
                    r5 = null;
                }
                r12.A0C(r42.A00(r5, userJid, r7, r8, r9, valueOf, list, 0));
                return;
            }
            return;
        }
        C65623Sv r13 = (C65623Sv) this.A00;
        C52772q9 r3 = (C52772q9) this.A01;
        C608439o r22 = (C608439o) this.A02;
        AnonymousClass8RP r43 = (AnonymousClass8RP) this.A03;
        C172888Po r52 = (C172888Po) this.A04;
        C172898Pp r6 = (C172898Pp) this.A05;
        boolean z2 = this.A06;
        C76833pW r0 = r13.A01;
        if (r0 == null || !r0.A03) {
            Log.i("CompanionDeviceQrHandler/request aborted, stopping");
        } else {
            C65623Sv.A02(r13, r22, r3, r43, r52, r6, z2);
        }
    }
}
