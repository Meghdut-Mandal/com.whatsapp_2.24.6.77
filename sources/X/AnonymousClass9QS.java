package X;

/* renamed from: X.9QS  reason: invalid class name */
public class AnonymousClass9QS {
    public int A00;
    public final AUB A01;

    public void A00(C188168z9 r5) {
        int i;
        if (r5 != null) {
            AUB aub = this.A01;
            if (aub.useNetworkQuality) {
                int ordinal = r5.ordinal();
                if (ordinal == 4) {
                    i = aub.excellentValue;
                } else if (ordinal == 3) {
                    i = aub.goodValue;
                } else if (ordinal == 2) {
                    i = aub.moderateValue;
                } else if (ordinal == 1) {
                    i = aub.poorValue;
                } else if (ordinal != 0) {
                    i = aub.defaultValue;
                } else {
                    i = aub.degradedValue;
                }
                this.A00 = i;
            }
        }
    }

    public AnonymousClass9QS(AUB aub) {
        this.A01 = aub;
        this.A00 = aub.defaultValue;
    }
}
