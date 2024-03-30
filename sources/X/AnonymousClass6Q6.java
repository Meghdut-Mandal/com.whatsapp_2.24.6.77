package X;

/* renamed from: X.6Q6  reason: invalid class name */
public class AnonymousClass6Q6 {
    public boolean A00;
    public boolean A01;
    public int[] A02;
    public byte[] A03;
    public final AnonymousClass2bU A04;
    public transient boolean A05;

    public synchronized void A01() {
        this.A02 = null;
        this.A03 = null;
        AnonymousClass2bU.A00(this.A04).A0R = false;
        this.A01 = true;
        this.A00 = true;
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        if (iArr != null) {
            this.A02 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            AnonymousClass2bU r1 = this.A04;
            if (!(r1.A1J.A00 instanceof C28981Uw) && (r1.A1i() || this.A02 != null)) {
                AnonymousClass2bU.A00(r1).A0R = true;
                this.A03 = bArr;
                this.A00 = true;
            }
        }
        AnonymousClass2bU.A00(this.A04).A0R = false;
        bArr = null;
        this.A03 = bArr;
        this.A00 = true;
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A01 = true;
    }

    public synchronized byte[] A05() {
        return this.A03;
    }

    public synchronized int[] A06() {
        return this.A02;
    }

    public boolean A04() {
        return AnonymousClass2bU.A00(this.A04).A0R;
    }

    public AnonymousClass6Q6(AnonymousClass2bU r1) {
        this.A04 = r1;
    }

    public static boolean A00(C25471Gl r2) {
        if (AnonymousClass6Y1.A08(r2) || r2 == C25471Gl.A0h || r2 == C25471Gl.A0D || r2 == C25471Gl.A0l || r2 == C25471Gl.A0J || r2 == C25471Gl.A0g || r2 == C25471Gl.A0b || r2 == C25471Gl.A0G || r2 == C25471Gl.A0I || r2 == C25471Gl.A0H || r2 == C25471Gl.A08 || r2 == C25471Gl.A0O || r2 == C25471Gl.A0P || r2 == C25471Gl.A09 || r2 == C25471Gl.A0T) {
            return true;
        }
        return false;
    }
}
