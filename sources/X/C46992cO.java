package X;

/* renamed from: X.2cO  reason: invalid class name and case insensitive filesystem */
public final class C46992cO extends AnonymousClass2bI {
    public int A00;
    public String A01;
    public boolean A02;

    public C46992cO(C64933Qa r2, long j) {
        super(r2, 70, j);
    }

    public void A16(String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (i == 0) {
                this.A01 = str2;
            } else if (i != 1) {
                C36321k7.A1S("FMessageSystemLinkedGroupCallStart/setData index out of bounds: ", AnonymousClass000.A0u(), i);
                return;
            } else {
                this.A00 = Integer.parseInt(str2);
            }
        }
    }
}
