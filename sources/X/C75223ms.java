package X;

import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;
import com.whatsapp.util.Log;

/* renamed from: X.3ms  reason: invalid class name and case insensitive filesystem */
public final class C75223ms implements AnonymousClass4U6 {
    public final /* synthetic */ AnonymousClass147 A00;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper A01;
    public final /* synthetic */ AnonymousClass0AP A02;

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        Log.w("groupinfo/setgroupdescription/delivery failure");
        AnonymousClass0AP r1 = this.A02;
        C52802qC r0 = new C52802qC(str);
        AnonymousClass00C.A0D(r0, 0);
        C36351kA.A1T(r0, r1);
    }

    public void BWp(String str, int i) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass0AP r1 = this.A02;
        C52862qI r0 = new C52862qI(str, i);
        AnonymousClass00C.A0D(r0, 0);
        C36351kA.A1T(r0, r1);
    }

    public C75223ms(AnonymousClass147 r1, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, AnonymousClass0AP r3) {
        this.A02 = r3;
        this.A01 = setGroupDescriptionProtocolHelper;
        this.A00 = r1;
    }

    public void onSuccess() {
        this.A01.A02.A04(this.A00, false);
        this.A02.resumeWith(new AnonymousClass0AK(AnonymousClass0AJ.A00));
    }
}
