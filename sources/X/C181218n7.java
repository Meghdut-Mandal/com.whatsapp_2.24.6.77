package X;

/* renamed from: X.8n7  reason: invalid class name and case insensitive filesystem */
public final class C181218n7 extends AnonymousClass2bI {
    public int A00;

    public synchronized String A0b() {
        return String.valueOf(this.A00);
    }

    public synchronized void A16(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=");
            C36351kA.A1P(str, A0u, e);
            this.A00 = 0;
        }
        return;
    }

    public C181218n7(C64933Qa r2, long j) {
        super(r2, 60, j);
    }
}
