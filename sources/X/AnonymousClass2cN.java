package X;

/* renamed from: X.2cN  reason: invalid class name */
public class AnonymousClass2cN extends AnonymousClass2bI {
    public long A00;
    public long A01;
    public String A02 = "";

    public AnonymousClass2cN(C64933Qa r2, long j) {
        super(r2, 117, j);
    }

    public void A16(String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (i == 0) {
                this.A01 = Long.parseLong(str2);
            } else if (i == 1) {
                this.A00 = Long.parseLong(str2);
            } else if (i != 2) {
                C36321k7.A1S("FMessageSystemScheduledCallStart/setData index out of bounds: ", AnonymousClass000.A0u(), i);
                return;
            } else {
                this.A02 = str2;
            }
        }
    }
}
