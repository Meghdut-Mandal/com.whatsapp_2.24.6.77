package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.8dN  reason: invalid class name and case insensitive filesystem */
public class C177178dN extends C21197ACf {
    public final C19700wN A00;
    public final AnonymousClass179 A01;

    public AnonymousClass3T1 A00(C1275768v r4, AnonymousClass8SU r5, AnonymousClass3T1 r6) {
        AnonymousClass2bU r0;
        C36331k8.A1I(r6, r5);
        if (!(r6 instanceof AnonymousClass2bU) || (r0 = (AnonymousClass2bU) r6) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected message type: ");
            throw C165617ti.A0S(0, C36381kD.A10(A0u, r6.A1I));
        }
        C65013Qj r2 = r0.A01;
        if (!(r2 == null || (r5.bitField0_ & 67108864) == 0)) {
            AnonymousClass8OW r02 = r5.mediaData_;
            AnonymousClass8OW r1 = r02;
            if (r02 == null) {
                r02 = AnonymousClass8OW.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 1) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass8OW.DEFAULT_INSTANCE;
                }
                r2.A0I = C90524aI.A0S(r1.localPath_);
            }
        }
        return r6;
    }

    public void B22(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        AnonymousClass2bU r72;
        File file;
        AnonymousClass00C.A0D(r7, 0);
        C36321k7.A0x(r6, r5);
        if (!(r7 instanceof AnonymousClass2bU) || (r72 = (AnonymousClass2bU) r7) == null) {
            throw C165567td.A0K(0);
        }
        String str = r72.A03;
        if (str != null) {
            try {
                Base64.decode(str, 0);
            } catch (IllegalArgumentException unused) {
                this.A00.A0E("webquery/invalid hash", (String) null, false);
                r72.A03 = null;
            }
        }
        super.B22(r5, r6, r72);
        C65013Qj r0 = r72.A01;
        if (r0 != null && (file = r0.A0I) != null) {
            String A08 = this.A01.A08(file);
            AnonymousClass00C.A08(A08);
            AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8OW.DEFAULT_INSTANCE);
            AnonymousClass8OW r1 = (AnonymousClass8OW) A012.A00;
            r1.bitField0_ |= 1;
            r1.localPath_ = A08;
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r6);
            AnonymousClass8OW r12 = (AnonymousClass8OW) A012.A0R();
            int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r12.getClass();
            A0I.mediaData_ = r12;
            A0I.bitField0_ |= 67108864;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177178dN(C19700wN r1, AnonymousClass179 r2, C20520xh r3) {
        super(r3);
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
    }
}
