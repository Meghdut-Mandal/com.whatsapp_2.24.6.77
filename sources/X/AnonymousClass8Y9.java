package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Y9  reason: invalid class name */
public final class AnonymousClass8Y9 extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final C220412q A01;
    public final AnonymousClass1FV A02;
    public final C20810yC A03;

    public C201669k5 A0A(C202599mH r13, String str, boolean z) {
        C223313w r8;
        AnonymousClass00C.A0D(r13, 2);
        AnonymousClass8SS r3 = r13.A03;
        if (r3 == null) {
            return null;
        }
        String[] strArr = r13.A06;
        if (!AnonymousClass00C.A0J(C165617ti.A0a(strArr), "shareOwnPn") || strArr.length != 2 || !AnonymousClass00C.A0J(r13.A01, C176028bS.A01)) {
            return null;
        }
        UserJid A022 = UserJid.Companion.A02(strArr[1]);
        if (!(A022 instanceof C223313w) || (r8 = (C223313w) A022) == null) {
            return null;
        }
        return new C176028bS(r13.A02, r8, str, r3.timestamp_);
    }

    public String A0B() {
        return "regular";
    }

    public String A0C() {
        return "shareOwnPn";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A05(r2);
    }

    public List A0D(boolean z) {
        Set A0G = this.A01.A0G();
        AnonymousClass00C.A08(A0G);
        C12810ih A022 = C15060md.A02(C22520Ao2.A00, new C18650tV(A0G, 0));
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return C15060md.A00(new C12790if(new C22379Alg(this), C15060md.A02(new C22378Alf(this), A022)));
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176028bS r32 = (C176028bS) r3;
        AnonymousClass00C.A0D(r32, 0);
        this.A02.A08(r32.A00);
        A06(r32);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C176028bS r62 = (C176028bS) r6;
        AnonymousClass00C.A0D(r62, 0);
        if (r7 == null) {
            this.A02.A08(r62.A00);
        } else if (r7.A04 < r62.A04) {
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A03.A0E(3070);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y9(C19970wo r1, C220412q r2, AnonymousClass1FV r3, AnonymousClass1AC r4, C20810yC r5) {
        super(r4);
        C36321k7.A1B(r4, r1, r5, r2, r3);
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
