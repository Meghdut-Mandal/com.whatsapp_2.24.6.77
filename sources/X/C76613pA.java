package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3pA  reason: invalid class name and case insensitive filesystem */
public final class C76613pA implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GetGroupInfoProtocolHelper A01;
    public final /* synthetic */ AnonymousClass0AP A02;

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass0AP r1 = this.A02;
        C52802qC r0 = new C52802qC(str);
        AnonymousClass00C.A0D(r0, 0);
        C36351kA.A1T(r0, r1);
    }

    public void BiM(C203399nx r6, String str) {
        AnonymousClass00C.A0D(r6, 1);
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.A01;
        AnonymousClass0AP r3 = this.A02;
        AnonymousClass3MD.A01(getGroupInfoProtocolHelper.A00, (C20350xQ) getGroupInfoProtocolHelper.A06.get(), new AnonymousClass3S5((String) null, this.A00), r6);
        r3.resumeWith(new AnonymousClass0AK(r6));
    }

    public C76613pA(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, AnonymousClass0AP r2, int i) {
        this.A01 = getGroupInfoProtocolHelper;
        this.A02 = r2;
        this.A00 = i;
    }

    public void BWw(C203399nx r4, String str) {
        Throwable A0A;
        C36321k7.A0w(str, r4);
        List A0j = r4.A0j("error");
        AnonymousClass00C.A08(A0j);
        Iterator it = A0j.iterator();
        while (true) {
            if (!it.hasNext()) {
                A0A = AnonymousClass001.A0A("Expected to get an error code but none was found");
                break;
            }
            String A0x = C36391kE.A0x(C36431kI.A0s(it), "code");
            if (A0x != null) {
                A0A = new C52862qI(str, Integer.parseInt(A0x));
                break;
            }
        }
        C36351kA.A1T(A0A, this.A02);
    }
}
