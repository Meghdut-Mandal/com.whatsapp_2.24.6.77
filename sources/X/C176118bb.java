package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8bb  reason: invalid class name and case insensitive filesystem */
public class C176118bb extends C201669k5 implements B67 {
    public final long A00;
    public final AnonymousClass11F A01;
    public final C64933Qa A02;
    public final boolean A03;

    public C176118bb(C201539jo r12, AnonymousClass11F r13, C64933Qa r14, String str, long j, long j2, boolean z, boolean z2) {
        super(C199769fw.A03, r12, str, "regular_high", 3, j, z2);
        this.A02 = r14;
        this.A01 = r13;
        this.A03 = z;
        this.A00 = j2;
    }

    public /* synthetic */ AnonymousClass11F getChatJid() {
        AnonymousClass11F r0 = this.A02.A00;
        C18740tg.A06(r0);
        return r0;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = AnonymousClass8PP.DEFAULT_INSTANCE.A0p();
        boolean z = this.A03;
        AnonymousClass8PP r1 = (AnonymousClass8PP) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.deleteMedia_ = z;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        AnonymousClass8PP r12 = (AnonymousClass8PP) C90524aI.A0H(A0p);
        r12.bitField0_ |= 2;
        r12.messageTimestamp_ = seconds;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8PP r13 = (AnonymousClass8PP) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0H.deleteMessageForMeAction_ = r13;
        A0H.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        return A04;
    }

    public C64933Qa BE4() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "DeleteMessageForMeMutation{rowId=", A0u);
        A0u.append(", key=");
        A0u.append(this.A02);
        A0u.append(", participant=");
        A0u.append(this.A01);
        A0u.append(", deleteMedia=");
        A0u.append(this.A03);
        C201669k5.A03(this, A0u);
        A0u.append(", messageTimestamp=");
        A0u.append(this.A00);
        A0u.append(", areDependenciesMissing=");
        A0u.append(A09());
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
