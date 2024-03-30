package X;

/* renamed from: X.53D  reason: invalid class name */
public final class AnonymousClass53D extends AnonymousClass66I {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53D) {
                AnonymousClass53D r5 = (AnonymousClass53D) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r2 == false) goto L_0x0005;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass53D(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0005
            r0 = 1
            if (r2 != 0) goto L_0x0006
        L_0x0005:
            r0 = 0
        L_0x0006:
            r1.<init>(r0, r4)
            r1.A01 = r2
            r1.A02 = r3
            r1.A03 = r4
            r0 = 2131895934(0x7f12267e, float:1.9426715E38)
            if (r4 == 0) goto L_0x0017
            r0 = 2131895933(0x7f12267d, float:1.9426713E38)
        L_0x0017:
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53D.<init>(boolean, boolean, boolean):void");
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BluetoothToggle(isCallActive=");
        A0u.append(this.A01);
        A0u.append(", isBluetoothAvailable=");
        A0u.append(this.A02);
        A0u.append(", isBluetoothSelected=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
