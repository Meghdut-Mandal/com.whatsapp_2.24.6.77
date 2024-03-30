package X;

/* renamed from: X.0Ie  reason: invalid class name and case insensitive filesystem */
public abstract class C03870Ie extends AnonymousClass0BZ {
    public int A00;
    public int A01 = 0;
    public String A02;
    public AnonymousClass0YU[] A03 = null;

    public C03870Ie(C03870Ie r7) {
        AnonymousClass0YU[] r4;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        AnonymousClass0YU[] r5 = r7.A03;
        if (r5 == null) {
            r4 = null;
        } else {
            int length = r5.length;
            r4 = new AnonymousClass0YU[length];
            for (int i = 0; i < length; i++) {
                r4[i] = new AnonymousClass0YU(r5[i]);
            }
        }
        this.A03 = r4;
    }

    public boolean A03() {
        return false;
    }

    public void setPathData(AnonymousClass0YU[] r6) {
        AnonymousClass0YU[] r4;
        AnonymousClass0YU[] r42 = this.A03;
        if (!AnonymousClass0YJ.A01(r42, r6)) {
            if (r6 == null) {
                r4 = null;
            } else {
                int length = r6.length;
                r4 = new AnonymousClass0YU[length];
                for (int i = 0; i < length; i++) {
                    r4[i] = new AnonymousClass0YU(r6[i]);
                }
            }
            this.A03 = r4;
            return;
        }
        for (int i2 = 0; i2 < r6.length; i2++) {
            r42[i2].A00 = r6[i2].A00;
            for (int i3 = 0; i3 < r6[i2].A01.length; i3++) {
                r42[i2].A01[i3] = r6[i2].A01[i3];
            }
        }
    }

    public AnonymousClass0YU[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public C03870Ie() {
    }
}
