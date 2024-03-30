package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ACx  reason: case insensitive filesystem */
public final class C21215ACx implements B14 {
    public final C19730wQ A00;
    public final AnonymousClass1FE A01;

    public void Bd3(AnonymousClass6CO r4, AnonymousClass8NK r5, AnonymousClass3T1 r6) {
        DeviceJid A002;
        C36331k8.A1I(r6, r5);
        if (r6.A1I()) {
            byte[] bArr = r6.A1b;
            AnonymousClass8I5 A012 = C21674AUx.A01(bArr, 0, bArr.length);
            AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r5);
            A0J.bitField1_ |= 4;
            A0J.messageSecret_ = A012;
            if (r6.A1J.A02 && (A002 = this.A01.A00(r6)) != null) {
                UserJid userJid = A002.userJid;
                if (!this.A00.A0M(userJid)) {
                    String A03 = AnonymousClass143.A03(userJid);
                    if (!AnonymousClass14B.A0F(A03)) {
                        AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r5);
                        A03.getClass();
                        A0I.bitField1_ |= 16;
                        A0I.originalSelfAuthorUserJidString_ = A03;
                    }
                }
            }
        }
    }

    public C21215ACx(C19730wQ r1, AnonymousClass1FE r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bd4(C1275768v r2, AnonymousClass8SU r3, AnonymousClass3T1 r4) {
        C36321k7.A0w(r3, r4);
        if ((r3.bitField1_ & 4) != 0) {
            r4.A1b = r3.messageSecret_.A06();
        }
    }
}
