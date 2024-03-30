package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1UQ  reason: invalid class name */
public abstract class AnonymousClass1UQ implements AnonymousClass1UP {
    public static final AtomicInteger A01 = new AtomicInteger(1);
    public final C21430zE A00;

    public void B7S(AnonymousClass66V r6, long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        String str = r6.A00;
        if (str != null) {
            this.A00.markerAnnotate(i, i2, "trigger_source_of_restart", str);
        }
        C21430zE r1 = this.A00;
        r1.markerEnd(i, i2, 111);
        r1.BPM(i, i2, r6.A01);
        if (str != null) {
            r1.markerAnnotate(i, i2, "trigger_source", str);
        }
    }

    public void flowAnnotate(long j, String str, double d) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, d);
    }

    public void flowEndCancel(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        C21430zE r1 = this.A00;
        r1.markerAnnotate(i, i2, "cancel_reason", str);
        r1.markerEnd(i, i2, 4);
    }

    public void flowEndFail(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (str == null) {
            str = "<NULL>";
        }
        C21430zE r1 = this.A00;
        r1.markerAnnotate(i, i2, "uf_has_error", true);
        if (str2 != null) {
            r1.markerPoint(i, i2, str, str2);
        } else {
            r1.markerPoint(i, i2, str);
        }
        r1.markerEnd(i, i2, 3);
    }

    public void flowEndSuccess(long j) {
        this.A00.markerEnd((int) j, (int) (j >>> 32), 2);
    }

    public void flowMarkError(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        C21430zE r1 = this.A00;
        r1.markerAnnotate(i, i2, "uf_has_error", true);
        if (str2 != null) {
            r1.markerPoint(i, i2, str, str2);
        } else {
            r1.markerPoint(i, i2, str);
        }
    }

    public void flowMarkPoint(long j, String str) {
        this.A00.markerPoint((int) j, (int) (j >>> 32), str);
    }

    public void flowCancelAtPoint(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        C21430zE r1 = this.A00;
        r1.markerAnnotate(i, i2, "cancel_reason", "user_cancelled");
        r1.BPH(i, i2, 4, str);
    }

    public AnonymousClass1UQ(C21430zE r1) {
        this.A00 = r1;
    }

    public void flowAnnotate(long j, String str, int i) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, i);
    }

    public void flowAnnotate(long j, String str, long j2) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, j2);
    }

    public void flowAnnotate(long j, String str, String str2) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, str2);
    }

    public void flowAnnotate(long j, String str, boolean z) {
        this.A00.markerAnnotate((int) j, (int) (j >>> 32), str, z);
    }
}
