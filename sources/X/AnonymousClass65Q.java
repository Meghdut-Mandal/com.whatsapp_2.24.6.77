package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.65Q  reason: invalid class name */
public final class AnonymousClass65Q {
    public final C20690y0 A00;
    public final C24461Cn A01;
    public final C24431Ck A02;
    public final C33121ek A03;
    public final C1273267v A04;
    public final C131096Ns A05;
    public final C33131el A06;
    public final C133226Xi A07;
    public final AnonymousClass179 A08;
    public final C24341Cb A09;
    public final C19970wo A0A;
    public final C19630wG A0B;
    public final C20830yE A0C;
    public final C19420v0 A0D;
    public final C20810yC A0E;
    public final C21010yW A0F;
    public final AnonymousClass58P A0G;
    public final AnonymousClass19A A0H;
    public final String A0I;
    public final List A0J;
    public final Map A0K = C90524aI.A0s();
    public final AtomicBoolean A0L = new AtomicBoolean(true);
    public final AtomicLong A0M = new AtomicLong(0);
    public final AtomicLong A0N = new AtomicLong(0);
    public final AtomicLong A0O = new AtomicLong(0);
    public final AtomicLong A0P = new AtomicLong(0);
    public final AtomicLong A0Q = new AtomicLong(0);
    public final AtomicLong A0R = new AtomicLong(0);

    public AnonymousClass65Q(C20690y0 r12, C24461Cn r13, C24431Ck r14, C33121ek r15, C1273267v r16, C131096Ns r17, C33131el r18, C133226Xi r19, AnonymousClass179 r20, C24341Cb r21, C19970wo r22, C19630wG r23, C20830yE r24, C19420v0 r25, C20810yC r26, C21010yW r27, AnonymousClass58P r28, AnonymousClass19A r29, String str, List list) {
        List list2 = list;
        C19970wo r5 = r22;
        C36421kH.A1J(r5, 2, list2);
        C21010yW r4 = r27;
        AnonymousClass19A r2 = r29;
        AnonymousClass179 r7 = r20;
        C33131el r8 = r18;
        C36321k7.A1C(r4, r12, r7, r2, r8);
        C24341Cb r6 = r21;
        AnonymousClass00C.A0D(r6, 14);
        C131096Ns r9 = r17;
        C90494aF.A12(r9, r15, r13, 15);
        AnonymousClass58P r10 = r28;
        AnonymousClass00C.A0D(r10, 20);
        this.A0I = str;
        this.A0A = r5;
        this.A0E = r26;
        this.A0B = r23;
        this.A0J = list2;
        this.A0F = r4;
        this.A00 = r12;
        this.A08 = r7;
        this.A0H = r2;
        this.A06 = r8;
        this.A07 = r19;
        this.A02 = r14;
        this.A04 = r16;
        this.A09 = r6;
        this.A05 = r9;
        this.A0C = r24;
        this.A0D = r25;
        this.A03 = r15;
        this.A01 = r13;
        this.A0G = r10;
    }

    public final void A00() {
        if (this.A0D.A0c() != null) {
            AnonymousClass58P r4 = this.A0G;
            AtomicLong atomicLong = this.A0O;
            r4.A04 = Long.valueOf(atomicLong.get());
            Double valueOf = Double.valueOf(((double) atomicLong.get()) / ((double) this.A0Q.get()));
            r4.A00 = valueOf;
            r4.A01 = valueOf;
            r4.A06 = r4.A04;
            r4.A07 = Long.valueOf(this.A0N.get() / 1048576);
            C36321k7.A1K(r4, "gdrive/encrypted-re-upload/", AnonymousClass000.A0u());
            this.A0F.Bly(r4);
        }
        Iterator A0s = C36361kB.A0s(this.A03);
        while (A0s.hasNext()) {
            ((C33151eo) A0s.next()).BWS();
        }
    }
}
