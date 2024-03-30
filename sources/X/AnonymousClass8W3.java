package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8W3  reason: invalid class name */
public final class AnonymousClass8W3 extends C177058d8 {
    public final C195189Sv A00;
    public final AnonymousClass9XP A01;
    public final C23027B0x A02;
    public final AnonymousClass8V8 A03;
    public final C19600wD A04;
    public final C20810yC A05;
    public final AnonymousClass3L6 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8W3(C194309Pd r10, C198409dV r11, C193349Lc r12, C603237k r13, C195189Sv r14, AnonymousClass9XP r15, C23027B0x b0x, AnonymousClass8V8 r17, C19600wD r18, C20810yC r19, AnonymousClass3L6 r20, AnonymousClass9IN r21, C19770wU r22) {
        super(r10, r11, r12, r13, r21, r22, 5);
        C36331k8.A1G(r11, 1, r10);
        AnonymousClass00C.A0D(r13, 5);
        this.A06 = r20;
        this.A04 = r18;
        this.A01 = r15;
        this.A02 = b0x;
        this.A00 = r14;
        this.A03 = r17;
        this.A05 = r19;
    }

    public static final void A00(AnonymousClass8W3 r1) {
        if (r1.A01.A05 == null) {
            r1.A06.A01("view_collection_details_tag");
        }
    }

    public void BVl(UserJid userJid) {
        Log.e("GetSingleCollectionGraphQLService/sendRequest/direct-connection-error");
        this.A02.BXK(this.A01, 422);
    }

    public void BVm(UserJid userJid) {
        Log.i("GetSingleCollectionGraphQLService/onDirectConnectionSucceeded/retry-request");
        A06();
    }

    public void BVL(IOException iOException) {
        A00(this);
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onDeliveryFailure");
        AnonymousClass9XP r3 = this.A01;
        if (!A08(r3.A04, -1, false)) {
            this.A02.BXK(r3, -1);
        }
    }

    public void BWk(Exception exc) {
        A00(this);
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onError");
        AnonymousClass9XP r2 = this.A01;
        if (!A08(r2.A04, 0, false)) {
            this.A02.BXK(r2, 0);
        }
    }
}
