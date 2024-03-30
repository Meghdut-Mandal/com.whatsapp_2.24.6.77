package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Objects;

/* renamed from: X.8bT  reason: invalid class name and case insensitive filesystem */
public final class C176038bT extends C201669k5 {
    public static final C199769fw A02 = C199769fw.A03;
    public final C223313w A00;
    public final PhoneUserJid A01;

    public C176038bT(C201539jo r10, C223313w r11, PhoneUserJid phoneUserJid, String str, long j) {
        super(A02, r10, str, "regular", 7, j, false);
        this.A00 = r11;
        this.A01 = phoneUserJid;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        if (A04 != null) {
            AnonymousClass8NN A0p = AnonymousClass8OJ.DEFAULT_INSTANCE.A0p();
            String A0K = AnonymousClass8NN.A0K(A0p, this.A01);
            AnonymousClass8OJ r1 = (AnonymousClass8OJ) A0p.A00;
            A0K.getClass();
            r1.bitField0_ |= 1;
            r1.pnJid_ = A0K;
            AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
            AnonymousClass8OJ r12 = (AnonymousClass8OJ) A0p.A0R();
            int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
            r12.getClass();
            A0H.pnForLidChatAction_ = r12;
            A0H.bitField0_ |= Integer.MIN_VALUE;
        } else {
            A04 = null;
        }
        Objects.requireNonNull(A04, "Super returned null builder");
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PnForLidChatMutation(lidUserJid=");
        A0u.append(this.A00);
        A0u.append(", phoneUserJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
