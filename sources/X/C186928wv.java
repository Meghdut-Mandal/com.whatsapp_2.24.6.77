package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.8wv  reason: invalid class name and case insensitive filesystem */
public abstract class C186928wv extends C180898mb {
    public final C238019x A00;
    public final C220412q A01;
    public final C230817c A02;
    public final C181758nz A03;

    public static int A08(C186928wv r0, AnonymousClass147 r1, AnonymousClass2cS r2, Set set) {
        r2.A01 = r0.A02.A02(r1);
        Set set2 = r2.A03;
        set2.clear();
        set2.addAll(set);
        int size = set.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    public static void A09(AnonymousClass8SU r1, AnonymousClass3T1 r2) {
        r2.A0q(UserJid.Companion.A02(r1.participant_));
    }

    public C186928wv(C19700wN r1, C220412q r2, C230817c r3, C181758nz r4, C238019x r5) {
        super(r1);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r5;
    }
}
