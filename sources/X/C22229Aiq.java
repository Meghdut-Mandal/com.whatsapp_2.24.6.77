package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Aiq  reason: case insensitive filesystem */
public final class C22229Aiq extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22229Aiq(AnonymousClass8AF r2, C20958A0r a0r) {
        super(0);
        this.this$0 = r2;
        this.$obj = a0r;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        C195999Xe A06;
        AnonymousClass9QJ r2;
        C17960sM r0;
        char c;
        AnonymousClass8AF r7 = this.this$0;
        r7.A00 = null;
        C20958A0r a0r = this.$obj;
        boolean z = false;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r4 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r32 = r7.A01;
            AnonymousClass9QJ r22 = r32.A0B;
            C17960sM[] r1 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r22, r32, r4, r1, 3)) {
                this.this$0.A03.set(0);
                r3 = this.this$0.A01;
                if (r3.A0J.intValue() == 2) {
                    r2 = r3.A09;
                    c = 4;
                } else {
                    r2 = r3.A0G;
                    c = 11;
                }
                r0 = r1[c];
            }
            return Boolean.valueOf(z);
        }
        if (a0r instanceof AnonymousClass8AY) {
            AtomicInteger atomicInteger = r7.A03;
            if (atomicInteger.incrementAndGet() < 3) {
                r3 = r7.A01;
                r2 = r3.A0B;
                r0 = AnonymousClass84B.A0S[3];
            } else {
                AnonymousClass9AO.A01.A06("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER] Reached 3 connection attempts!", (Throwable) null);
                atomicInteger.set(0);
                r3 = r7.A01;
                if (r3.A0J.intValue() == 2) {
                    A06 = AnonymousClass9QJ.A00(r3.A0C, r3, AnonymousClass84B.A0S, 9);
                } else {
                    A06 = AnonymousClass9QJ.A00(r3.A08, r3, AnonymousClass84B.A0S, 2);
                }
            }
        } else if ((a0r instanceof AnonymousClass8AK) || (a0r instanceof AnonymousClass8AS)) {
            r7.A03.set(0);
            r3 = this.this$0.A01;
            A06 = r3.A06();
        } else {
            r7.A03.set(0);
            return Boolean.valueOf(z);
        }
        r3.A00.A03 = A06;
        z = true;
        return Boolean.valueOf(z);
        A06 = r2.A02(r3, r0);
        r3.A00.A03 = A06;
        z = true;
        return Boolean.valueOf(z);
    }
}
