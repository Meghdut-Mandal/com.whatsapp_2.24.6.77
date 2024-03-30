package X;

import java.math.BigInteger;

/* renamed from: X.Afi  reason: case insensitive filesystem */
public final class C22035Afi extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AUo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22035Afi(AUo aUo) {
        super(0);
        this.this$0 = aUo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return BigInteger.valueOf((long) this.this$0.A00).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A01)).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A02));
    }
}
