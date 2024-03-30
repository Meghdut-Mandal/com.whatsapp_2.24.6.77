package X;

import java.io.IOException;
import java.util.List;

public class A1C implements B5W {
    public List A00 = AnonymousClass001.A0I();
    public final AnonymousClass9CD A01 = new AnonymousClass9CD(this);
    public final boolean A02;

    public void BSX(C202189lD r3, Object obj, int i, boolean z) {
        if (this.A02) {
            for (B2E BSX : this.A00) {
                BSX.BSX(r3, obj, i, z);
            }
            return;
        }
        synchronized (this) {
            for (B5W BSX2 : this.A00) {
                BSX2.BSX(r3, obj, i, z);
            }
        }
    }

    public void BY4(C188528zj r11, long j, long j2, long j3) {
        for (B5W BY4 : this.A00) {
            BY4.BY4(r11, j, j2, j3);
        }
    }

    public void BY5(long j, long j2) {
        for (B5W BY5 : this.A00) {
            BY5.BY5(j, j2);
        }
    }

    public void BZB(C188528zj r3) {
        for (B5W BZB : this.A00) {
            BZB.BZB(r3);
        }
    }

    public void BZC() {
        for (B5W BZC : this.A00) {
            BZC.BZC();
        }
    }

    public void BjU() {
        for (B5W BjU : this.A00) {
            BjU.BjU();
        }
    }

    public void BjV(C202189lD r3, Object obj, boolean z) {
        if (this.A02) {
            for (B2E BjV : this.A00) {
                BjV.BjV(r3, obj, z);
            }
            return;
        }
        synchronized (this) {
            for (B5W BjV2 : this.A00) {
                BjV2.BjV(r3, obj, z);
            }
        }
    }

    public void BjW(IOException iOException) {
        if (this.A02) {
            for (B5W BjW : this.A00) {
                BjW.BjW(iOException);
            }
            return;
        }
        synchronized (this) {
            for (B5W BjW2 : this.A00) {
                BjW2.BjW(iOException);
            }
        }
    }

    public void BjX(String str, Object obj) {
        for (C22862AxE BjX : this.A00) {
            BjX.BjX(str, obj);
        }
    }

    public void BjY(C202189lD r3, C188528zj r4) {
        for (B5W BjY : this.A00) {
            BjY.BjY(r3, r4);
        }
    }

    public void BjZ(C202189lD r3, Object obj, boolean z, boolean z2) {
        if (this.A02) {
            for (B2E BjZ : this.A00) {
                BjZ.BjZ(r3, obj, z, z2);
            }
            return;
        }
        synchronized (this) {
            for (B5W BjZ2 : this.A00) {
                BjZ2.BjZ(r3, obj, z, z2);
            }
        }
    }

    public void Bqc(long j) {
        for (B5W Bqc : this.A00) {
            Bqc.Bqc(j);
        }
    }

    public A1C(boolean z) {
        this.A02 = z;
    }
}
