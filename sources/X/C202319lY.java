package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9lY  reason: invalid class name and case insensitive filesystem */
public class C202319lY {
    public static final int[] A0S;
    public static final int[] A0T = {101, 102, 103, 104};
    public static final int[] A0U = {11, 12, 608};
    public static final int[] A0V = {401, 402, 403, 404, 410, 411, 413, 601, 602, 603, 425};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass16U A07;
    @Deprecated
    public AnonymousClass16X A08;
    public C207119ua A09;
    public C175708av A0A;
    public C135106c9 A0B;
    public AnonymousClass11F A0C;
    public UserJid A0D;
    public UserJid A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public byte[] A0R;

    public synchronized AnonymousClass16U A03() {
        return this.A07;
    }

    public synchronized C207119ua A04() {
        C207119ua r0;
        C175708av r1 = this.A0A;
        if (r1 == null || !(r1 instanceof C175928bI)) {
            r0 = null;
        } else {
            r0 = ((C175928bI) r1).A06;
        }
        return r0;
    }

    public synchronized C135106c9 A05() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r2 == 10) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Boolean A06() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0025 }
            r1 = 1
            if (r2 == r1) goto L_0x001f
            r0 = 100
            if (r2 == r0) goto L_0x001f
            r0 = 20
            if (r2 == r0) goto L_0x001f
            r0 = 2
            if (r2 == r0) goto L_0x001a
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x001a
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x0023
        L_0x001a:
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A06():java.lang.Boolean");
    }

    public synchronized void A07(long j, String str, int i, String str2, String str3) {
        synchronized (this) {
            this.A02 = i;
            if (j >= 0) {
                this.A06 = j;
                this.A0O = true;
                this.A0H = str;
                this.A0J = str2;
                this.A0F = str3;
            } else {
                throw AnonymousClass001.A08(C36381kD.A0z("PAY: PaymentTransaction update called with invalid timestamp: ", AnonymousClass000.A0u(), j));
            }
        }
    }

    public synchronized void A08(C207259uo r2, C175708av r3) {
        C175708av r0 = this.A0A;
        if (r0 == null) {
            this.A0A = r3;
            r0 = r3;
        }
        r0.A02 = r2;
    }

    public synchronized void A09(C175708av r3, int i) {
        if (i > 0) {
            C175708av r1 = this.A0A;
            if (r1 == null) {
                this.A0A = r3;
                r1 = r3;
            }
            if (!(r1 instanceof C175938bJ)) {
                if (r1 instanceof C175918bH) {
                    ((C175918bH) r1).A00 = i;
                } else if (r1 instanceof C175928bI) {
                    ((C175928bI) r1).A00 = i;
                }
            }
        }
    }

    public synchronized void A0A(C175708av r4, long j) {
        if (j > 0) {
            C175708av r1 = this.A0A;
            if (r1 == null) {
                this.A0A = r4;
                r1 = r4;
            }
            if (r1 instanceof C175938bJ) {
                ((C175938bJ) r1).A00 = j;
            } else if (r1 instanceof C175918bH) {
                ((C175918bH) r1).A02 = j;
            } else if (r1 instanceof C175928bI) {
                ((C175928bI) r1).A04 = j;
            } else {
                ((C175908bG) r1).A00 = j;
            }
        }
    }

    public synchronized void A0B(C202319lY r10) {
        synchronized (this) {
            if (!TextUtils.isEmpty(r10.A0K)) {
                A0D(r10.A0K);
            }
            this.A05 = r10.A05;
            this.A0E = r10.A0E;
            this.A0D = r10.A0D;
            this.A08 = r10.A08;
            this.A0I = r10.A0I;
            this.A03 = r10.A03;
            this.A0G = r10.A0G;
            this.A07 = r10.A07;
            this.A04 = r10.A04;
            this.A0R = r10.A0R;
            this.A0L = r10.A0L;
            this.A0Q = r10.A0Q;
            this.A0C = r10.A0C;
            this.A0M = r10.A0M;
            this.A0A = r10.A0A;
            this.A0B = r10.A0B;
            A07(this.A06, this.A0H, this.A02, this.A0J, this.A0F);
        }
    }

    public synchronized void A0C(C135106c9 r2) {
        this.A0B = r2;
    }

    public synchronized void A0D(String str) {
        C18740tg.A05(str);
        this.A0K = str;
        this.A0O = true;
    }

    public synchronized void A0E(List list) {
        if (list != null) {
            if (list.size() > 0) {
                this.A0N = C36441kJ.A15(list);
            }
        }
    }

    public synchronized void A0F(boolean z) {
        this.A0O = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0036, code lost:
        if (r1 != 200) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0068, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0G() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r1 = r7.A03     // Catch:{ all -> 0x0069 }
            r6 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0008
            goto L_0x0018
        L_0x0008:
            int[] r4 = A0V     // Catch:{ all -> 0x0069 }
            r3 = 11
            r2 = 0
        L_0x000d:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x000d
        L_0x0018:
            r0 = 2
            if (r1 == r0) goto L_0x0058
            r0 = 3
            if (r1 == r0) goto L_0x0067
            r0 = 6
            if (r1 == r0) goto L_0x0049
            r0 = 7
            if (r1 == r0) goto L_0x0058
            r0 = 8
            if (r1 == r0) goto L_0x003a
            r0 = 10
            if (r1 == r0) goto L_0x003a
            r0 = 20
            if (r1 == r0) goto L_0x003a
            r0 = 100
            if (r1 == r0) goto L_0x0008
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0058
        L_0x0038:
            monitor-exit(r7)
            return r6
        L_0x003a:
            int[] r4 = A0U     // Catch:{ all -> 0x0069 }
            r3 = 3
            r2 = 0
        L_0x003e:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x003e
        L_0x0049:
            int[] r4 = A0S     // Catch:{ all -> 0x0069 }
            r3 = 2
            r2 = 0
        L_0x004d:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x004d
        L_0x0058:
            int[] r4 = A0T     // Catch:{ all -> 0x0069 }
            r3 = 4
            r2 = 0
        L_0x005c:
            r1 = r4[r2]     // Catch:{ all -> 0x0069 }
            int r0 = r7.A02     // Catch:{ all -> 0x0069 }
            if (r1 == r0) goto L_0x0038
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0067
            goto L_0x005c
        L_0x0067:
            monitor-exit(r7)
            return r5
        L_0x0069:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0G():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.8av r0 = r2.A0A     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.A0T()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0H():boolean");
    }

    public synchronized boolean A0I() {
        boolean z;
        int i;
        if (this.A03 == 10 && ((i = this.A02) == 12 || i == 19)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean A0J() {
        boolean z;
        int i;
        if (!A0K() || !((i = this.A02) == 12 || i == 19 || i == 20)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r2 == 30) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0K() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0019 }
            X.9nz r0 = X.C203419nz.$redex_init_class     // Catch:{ all -> 0x0019 }
            r0 = 20
            if (r2 == r0) goto L_0x0016
            r0 = 40
            if (r2 == r0) goto L_0x0016
            r0 = 10
            if (r2 == r0) goto L_0x0016
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r3)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0K():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r3.A03 == 30) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0L() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A02     // Catch:{ all -> 0x001d }
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 604(0x25c, float:8.46E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 703(0x2bf, float:9.85E-43)
            if (r1 == r0) goto L_0x001a
            int r2 = r3.A03     // Catch:{ all -> 0x001d }
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0L():boolean");
    }

    public synchronized boolean A0M() {
        return C203419nz.A08(this.A0G, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (android.text.TextUtils.isEmpty(r1.A0O) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0F) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.16X r0 = r2.A08     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            X.8av r1 = r2.A0A     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1 instanceof X.C175928bI     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003d
            X.8bI r1 = (X.C175928bI) r1     // Catch:{ all -> 0x0040 }
            boolean r0 = r1.A0X     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r1.A0Q     // Catch:{ all -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = r1.A0O     // Catch:{ all -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003b
        L_0x0023:
            java.lang.String r1 = r1.A0T     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "FULL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003d
            boolean r0 = r2.A0G()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r2.A0F     // Catch:{ all -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            monitor-exit(r2)
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0N():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0081, code lost:
        if ((!X.C1901797e.A00(r11.A0G, r15.A0G)) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0085, code lost:
        if (r7 != r8) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        if (r0 <= r2) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0O(X.C175708av r15, int r16, long r17) {
        /*
            r14 = this;
            monitor-enter(r14)
            long r4 = r14.A06     // Catch:{ all -> 0x008e }
            X.8av r11 = r14.A0A     // Catch:{ all -> 0x008e }
            r13 = 0
            if (r11 == 0) goto L_0x000d
            int r10 = r11.A07()     // Catch:{ all -> 0x008e }
            goto L_0x000e
        L_0x000d:
            r10 = 0
        L_0x000e:
            if (r15 == 0) goto L_0x0015
            int r9 = r15.A07()     // Catch:{ all -> 0x008e }
            goto L_0x0016
        L_0x0015:
            r9 = 0
        L_0x0016:
            r8 = 0
            if (r15 == 0) goto L_0x0027
            boolean r0 = r15 instanceof X.C175928bI     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0027
            r0 = r15
            X.8bI r0 = (X.C175928bI) r0     // Catch:{ all -> 0x008e }
            X.9uh r0 = r0.A0H     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0028
            java.lang.String r7 = r0.A02     // Catch:{ all -> 0x008e }
            goto L_0x0029
        L_0x0027:
            r0 = r8
        L_0x0028:
            r7 = r8
        L_0x0029:
            r2 = 0
            if (r0 == 0) goto L_0x0030
            long r0 = r0.A01     // Catch:{ all -> 0x008e }
            goto L_0x0032
        L_0x0030:
            r0 = 0
        L_0x0032:
            if (r11 == 0) goto L_0x0043
            boolean r6 = r11 instanceof X.C175928bI     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0043
            r6 = r11
            X.8bI r6 = (X.C175928bI) r6     // Catch:{ all -> 0x008e }
            X.9uh r6 = r6.A0H     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0043
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x008e }
            long r2 = r6.A01     // Catch:{ all -> 0x008e }
        L_0x0043:
            int r6 = r14.A03     // Catch:{ all -> 0x008e }
            r12 = 5
            if (r6 == r12) goto L_0x004c
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r6 != r12) goto L_0x0050
        L_0x004c:
            r12 = r16
            if (r6 != r12) goto L_0x008b
        L_0x0050:
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x008b
            if (r6 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005a
            if (r10 == 0) goto L_0x008b
        L_0x005a:
            if (r9 > r10) goto L_0x008b
        L_0x005c:
            if (r11 == 0) goto L_0x0083
            boolean r6 = r11 instanceof X.C175928bI     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x006f
            r4 = r11
            X.8bI r4 = (X.C175928bI) r4     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r4.A0T     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "MISSING_FIELD_NOT_PARTIAL"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x008b
        L_0x006f:
            if (r6 == 0) goto L_0x0083
            X.8bI r11 = (X.C175928bI) r11     // Catch:{ all -> 0x008e }
            X.8bI r15 = (X.C175928bI) r15     // Catch:{ all -> 0x008e }
            if (r15 == 0) goto L_0x0083
            X.9jw r5 = r11.A0G     // Catch:{ all -> 0x008e }
            X.9jw r4 = r15.A0G     // Catch:{ all -> 0x008e }
            boolean r4 = X.C1901797e.A00(r5, r4)     // Catch:{ all -> 0x008e }
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x008b
        L_0x0083:
            if (r7 == 0) goto L_0x0087
            if (r7 != r8) goto L_0x008b
        L_0x0087:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x008c
        L_0x008b:
            r13 = 1
        L_0x008c:
            monitor-exit(r14)
            return r13
        L_0x008e:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0O(X.8av, int, long):boolean");
    }

    public synchronized boolean A0P(C202319lY r5) {
        return A0O(r5.A0A, r5.A03, r5.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r3.equals(r2.A0D) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Q(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0E     // Catch:{ all -> 0x0012 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0D     // Catch:{ all -> 0x0012 }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.A0Q(com.whatsapp.jid.UserJid):boolean");
    }

    public synchronized String toString() {
        StringBuilder A0u;
        A0u = AnonymousClass000.A0u();
        A0u.append("id: ");
        A0u.append(this.A0K);
        A0u.append(" key_remote_id: ");
        A0u.append(this.A0C);
        A0u.append(" key_from_me: ");
        A0u.append(this.A0Q);
        A0u.append(" key_id: ");
        A0u.append(this.A0L);
        A0u.append(" status: ");
        A0u.append(this.A02);
        A0u.append(" type: ");
        A0u.append(this.A03);
        A0u.append(" updateTs: ");
        A0u.append(this.A06);
        A0u.append(" initTs: ");
        A0u.append(this.A05);
        A0u.append(" error_code: ");
        A0u.append(this.A0J);
        A0u.append(" sender: ");
        A0u.append(this.A0E);
        A0u.append(" receiver: ");
        A0u.append(this.A0D);
        A0u.append(" credential_id: ");
        A0u.append(this.A0H);
        A0u.append(" methods: ");
        A0u.append(this.A0N);
        A0u.append(" reqMsgKeyId: ");
        A0u.append(this.A0M);
        A0u.append(" metadata: ");
        A0u.append(this.A0A);
        A0u.append(" country: ");
        A0u.append(this.A0G);
        A0u.append(" version: ");
        A0u.append(this.A04);
        A0u.append(" interop: ");
        A0u.append(this.A0P);
        A0u.append(" background: ");
        A0u.append(this.A0B);
        A0u.append(" purchase_initiator: ");
        return C36381kD.A10(A0u, this.A00);
    }

    static {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 702;
        A1O[1] = 701;
        A0S = A1O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r2 == 40) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C202319lY(X.AnonymousClass16U r12, X.AnonymousClass16X r13, com.whatsapp.jid.UserJid r14, com.whatsapp.jid.UserJid r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r11 = this;
            r3 = r17
            r4 = r11
            r11.<init>()
            r0 = 1
            r11.A0O = r0
            r2 = r23
            if (r23 != 0) goto L_0x000e
            r0 = 0
        L_0x000e:
            X.C18740tg.A0C(r0)
            r11.A03 = r2
            r11.A0E = r14
            r11.A0D = r15
            r0 = r16
            r11.A0I = r0
            r11.A08 = r13
            r0 = r28
            r11.A05 = r0
            r0 = r22
            r11.A0G = r0
            r0 = r25
            r11.A04 = r0
            r0 = r26
            r11.A01 = r0
            r11.A07 = r12
            r0 = r27
            r11.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x004d
            r3 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0050
            r0 = 10
            if (r2 == r0) goto L_0x004d
            r0 = 20
            if (r2 == r0) goto L_0x004d
            r0 = 40
            if (r2 != r0) goto L_0x0050
        L_0x004d:
            r11.A0D(r3)
        L_0x0050:
            r7 = r18
            r9 = r19
            r10 = r20
            r8 = r24
            r5 = r30
            r4.A07(r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202319lY.<init>(X.16U, X.16X, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, long, long):void");
    }

    public static C175928bI A00(C202319lY r0) {
        C175708av r02 = r0.A0A;
        C18740tg.A06(r02);
        return (C175928bI) r02;
    }

    public static void A01(Intent intent, C202319lY r4, AnonymousClass11F r5) {
        AnonymousClass3UJ.A00(intent, new C64933Qa(r5, r4.A0L, r4.A0Q));
        intent.putExtra("extra_transaction_id", r4.A0K);
    }

    public static boolean A02(C202319lY r1) {
        if (r1 == null) {
            return false;
        }
        int i = r1.A02;
        if (i == 405 || i == 106 || i == 604) {
            return true;
        }
        return false;
    }

    public C202319lY(String str, int i, int i2, int i3, long j) {
        this.A03 = i;
        this.A05 = j;
        this.A0G = str;
        this.A04 = i2;
        this.A01 = i3;
        this.A0I = "XXX";
        this.A07 = AnonymousClass16W.A06;
    }
}
