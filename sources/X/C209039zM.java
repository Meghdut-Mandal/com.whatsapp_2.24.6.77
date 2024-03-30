package X;

import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;

/* renamed from: X.9zM  reason: invalid class name and case insensitive filesystem */
public abstract class C209039zM implements B27 {
    public int A00;
    public int A01;
    public int A02;
    public C1890491w A03;
    public boolean A04;
    public boolean A05;
    public AnonymousClass82Z A06;
    public final Object A07 = C36441kJ.A11();
    public final ArrayDeque A08 = new ArrayDeque();
    public final ArrayDeque A09 = new ArrayDeque();
    public final AnonymousClass82Z[] A0A;
    public final AnonymousClass82X[] A0B;
    public final Thread A0C;

    public C1890491w A01(AnonymousClass82Z r8, AnonymousClass82X r9, boolean z) {
        C1688382f r2 = (C1688382f) this;
        AnonymousClass82Y r82 = (AnonymousClass82Y) r8;
        C1688282d r92 = (C1688282d) r9;
        try {
            ByteBuffer byteBuffer = r82.A01;
            Objects.requireNonNull(byteBuffer);
            B2l A062 = r2.A06(byteBuffer.array(), byteBuffer.limit(), z);
            long j = r82.A00;
            long j2 = r82.A00;
            r92.A01 = j;
            r92.A01 = A062;
            if (j2 == Long.MAX_VALUE) {
                j2 = j;
            }
            r92.A00 = j2;
            r92.A00 = (~Integer.MIN_VALUE) & r92.A00;
            return null;
        } catch (C1688082a e) {
            return e;
        }
    }

    public final AnonymousClass82Z A02() {
        AnonymousClass82Z r0;
        synchronized (this.A07) {
            C1890491w r02 = this.A03;
            if (r02 == null) {
                C200319h9.A02(AnonymousClass000.A1W(this.A06));
                int i = this.A00;
                if (i == 0) {
                    r0 = null;
                } else {
                    AnonymousClass82Z[] r03 = this.A0A;
                    int i2 = i - 1;
                    this.A00 = i2;
                    r0 = r03[i2];
                }
                this.A06 = r0;
            } else {
                throw r02;
            }
        }
        return r0;
    }

    public final AnonymousClass82X A03() {
        AnonymousClass82X r0;
        synchronized (this.A07) {
            C1890491w r02 = this.A03;
            if (r02 == null) {
                ArrayDeque arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    r0 = null;
                } else {
                    r0 = (AnonymousClass82X) arrayDeque.removeFirst();
                }
            } else {
                throw r02;
            }
        }
        return r0;
    }

    public final void A04(AnonymousClass82Z r3) {
        Object obj = this.A07;
        synchronized (obj) {
            C1890491w r0 = this.A03;
            if (r0 == null) {
                C200319h9.A01(C36361kB.A1a(r3, this.A06));
                ArrayDeque arrayDeque = this.A08;
                arrayDeque.addLast(r3);
                if (!arrayDeque.isEmpty() && this.A01 > 0) {
                    obj.notify();
                }
                this.A06 = null;
            } else {
                throw r0;
            }
        }
    }

    public void A05(AnonymousClass82X r5) {
        Object obj = this.A07;
        synchronized (obj) {
            r5.clear();
            AnonymousClass82X[] r2 = this.A0B;
            int i = this.A01;
            this.A01 = i + 1;
            r2[i] = r5;
            if (!this.A08.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
        }
    }

    public void flush() {
        synchronized (this.A07) {
            this.A04 = true;
            this.A02 = 0;
            AnonymousClass82Z r3 = this.A06;
            if (r3 != null) {
                r3.clear();
                AnonymousClass82Z[] r2 = this.A0A;
                int i = this.A00;
                this.A00 = i + 1;
                r2[i] = r3;
                this.A06 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.A08;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                AnonymousClass82Z r32 = (AnonymousClass82Z) arrayDeque.removeFirst();
                r32.clear();
                AnonymousClass82Z[] r22 = this.A0A;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                r22[i2] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.A09;
                if (!arrayDeque2.isEmpty()) {
                    ((AnonymousClass82X) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    public void release() {
        Object obj = this.A07;
        synchronized (obj) {
            this.A05 = true;
            obj.notify();
        }
        try {
            this.A0C.join();
        } catch (InterruptedException unused) {
            C90484aE.A0z();
        }
    }

    public C209039zM(AnonymousClass82Z[] r6, AnonymousClass82X[] r7) {
        AnonymousClass82X simpleOutputBuffer;
        AnonymousClass82Z r1;
        this.A0A = r6;
        this.A00 = r6.length;
        for (int i = 0; i < this.A00; i++) {
            AnonymousClass82Z[] r2 = this.A0A;
            if (this instanceof C1688382f) {
                r1 = new AnonymousClass82Y();
            } else {
                r1 = new AnonymousClass82Z(2);
            }
            r2[i] = r1;
        }
        this.A0B = r7;
        int length = r7.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this instanceof C1688382f) {
                simpleOutputBuffer = new C1688282d((C1688382f) this);
            } else {
                simpleOutputBuffer = new SimpleOutputBuffer(this);
            }
            r7[i2] = simpleOutputBuffer;
        }
        C21837AbF abF = new C21837AbF(this);
        this.A0C = abF;
        abF.start();
    }
}
