package X;

/* renamed from: X.7TV  reason: invalid class name */
public final class AnonymousClass7TV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $secondsToTake;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TV(int i) {
        super(1);
        this.$secondsToTake = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16970qV r4 = (C16970qV) obj;
        AnonymousClass00C.A0D(r4, 0);
        int i = this.$secondsToTake;
        if (i < 0) {
            return r4;
        }
        int i2 = i * 48000 * 2;
        if (i2 < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Requested element count ");
            A0u.append(i2);
            throw AnonymousClass000.A0c(" is less than zero.", A0u);
        } else if (i2 == 0) {
            return C12850il.A00;
        } else {
            if (r4 instanceof C17970sN) {
                return ((C17970sN) r4).BvT(i2);
            }
            return new C12840ik(r4, i2);
        }
    }
}
