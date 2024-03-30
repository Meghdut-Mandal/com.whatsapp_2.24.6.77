package X;

/* renamed from: X.16L  reason: invalid class name */
public class AnonymousClass16L {
    public static final int A0D = ((int) (C19430v1.A00 / 8192));
    public final AnonymousClass16M A00;
    public final Object A01 = new Object();
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final Object A05 = new Object();
    public final Object A06 = new Object();
    public volatile AnonymousClass1SZ A07;
    public volatile AnonymousClass1SZ A08;
    public volatile AnonymousClass1SZ A09;
    public volatile AnonymousClass1SZ A0A;
    public volatile AnonymousClass1SZ A0B;
    public volatile AnonymousClass1SZ A0C;

    public AnonymousClass1SZ A00() {
        if (this.A08 == null) {
            synchronized (this.A02) {
                if (this.A08 == null) {
                    this.A08 = this.A00.A00("composerThumbCache", A0D);
                }
            }
        }
        return this.A08;
    }

    public AnonymousClass1SZ A01() {
        if (this.A09 == null) {
            synchronized (this.A03) {
                if (this.A09 == null) {
                    this.A09 = this.A00.A00("contactsThumbCache", A0D);
                }
            }
        }
        return this.A09;
    }

    public AnonymousClass1SZ A02() {
        if (this.A0A == null) {
            synchronized (this.A04) {
                if (this.A0A == null) {
                    this.A0A = this.A00.A00("mediaThumbCache", A0D);
                }
            }
        }
        return this.A0A;
    }

    public AnonymousClass1SZ A03() {
        if (this.A0B == null) {
            synchronized (this.A05) {
                if (this.A0B == null) {
                    this.A0B = this.A00.A00("stickerFrameCache", A0D / 2);
                }
            }
        }
        return this.A0B;
    }

    public AnonymousClass1SZ A04() {
        if (this.A0C == null) {
            synchronized (this.A06) {
                if (this.A0C == null) {
                    this.A0C = this.A00.A00("stickerTrayIconCache", A0D / 2);
                }
            }
        }
        return this.A0C;
    }

    public AnonymousClass16L(AnonymousClass16M r2) {
        this.A00 = r2;
    }
}
