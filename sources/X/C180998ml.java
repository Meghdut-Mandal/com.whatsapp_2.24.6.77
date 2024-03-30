package X;

import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.8ml  reason: invalid class name and case insensitive filesystem */
public class C180998ml extends C181018mn {
    public AnonymousClass8NW A00;
    public boolean A01 = false;

    public C180998ml(C64933Qa r2, long j) {
        super(r2, 38, j);
    }

    public HashMap A1Z() {
        C195589Va r0;
        AnonymousClass8NW r02 = this.A00;
        C18740tg.A06(r02);
        HashMap A0J = AnonymousClass001.A0J();
        for (C172708Ow r2 : r02.keys_) {
            C172288Ng r1 = r2.keyId_;
            if (r1 == null) {
                r1 = C172288Ng.DEFAULT_INSTANCE;
            }
            if ((r1.bitField0_ & 1) != 0) {
                C201539jo r6 = new C201539jo(r1.keyId_.A06());
                if ((r2.bitField0_ & 2) != 0) {
                    C172928Ps r22 = r2.keyData_;
                    if (r22 == null) {
                        r22 = C172928Ps.DEFAULT_INSTANCE;
                    }
                    int i = r22.bitField0_;
                    if ((i & 4) != 0 || (i & 2) != 0 || (i & 1) != 0) {
                        AnonymousClass8QY r03 = r22.fingerprint_;
                        if (r03 == null) {
                            r03 = AnonymousClass8QY.DEFAULT_INSTANCE;
                        }
                        C200039gT A002 = C200039gT.A00(r03);
                        if (A002 != null) {
                            r0 = new C195589Va(new AnonymousClass9W7(A002, r22.keyData_.A06(), r22.timestamp_), r6);
                        }
                    }
                    throw new AnonymousClass198(57, (String) null);
                }
                r0 = null;
                Pair A0Q = C36441kJ.A0Q(r6, r0);
                A0J.put(A0Q.first, A0Q.second);
            } else {
                throw new AnonymousClass198(53, (String) null);
            }
        }
        return A0J;
    }
}
