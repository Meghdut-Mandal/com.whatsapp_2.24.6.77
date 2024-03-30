package X;

import android.os.Looper;
import android.util.LruCache;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.9gf  reason: invalid class name and case insensitive filesystem */
public class C200129gf {
    public AnonymousClass9D7 A00;
    public Looper A01;
    public final C201699k8 A02;
    public final List A03;
    public final List A04;
    public final UUID A05;
    public final C191019Bg A06;
    public final AnonymousClass9MN A07;
    public final int[] A08;
    public volatile C166067uy A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == r13) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B28 A01(android.os.Looper r13, X.C21709AXg r14) {
        /*
            r12 = this;
            r6 = r12
            android.os.Looper r1 = r12.A01
            r2 = 0
            r4 = r13
            if (r1 == 0) goto L_0x000a
            r0 = 0
            if (r1 != r13) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C200319h9.A02(r0)
            java.util.List r1 = r12.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0023
            r12.A01 = r13
            X.7uy r0 = r12.A09
            if (r0 != 0) goto L_0x0023
            X.7uy r0 = new X.7uy
            r0.<init>(r13, r12)
            r12.A09 = r0
        L_0x0023:
            java.util.UUID r10 = r12.A05
            X.9uV r0 = A00(r14, r10, r2)
            if (r0 != 0) goto L_0x0055
            X.91T r2 = new X.91T
            r2.<init>(r10)
            X.9Bg r0 = r12.A06
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0048:
            r0 = 6003(0x1773, float:8.412E-42)
            X.8xZ r1 = new X.8xZ
            r1.<init>(r0, r2)
            X.9zN r0 = new X.9zN
            r0.<init>(r1)
            return r0
        L_0x0055:
            byte[] r11 = r0.A04
            java.lang.String r9 = r0.A02
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r3 >= r0) goto L_0x0079
            java.util.UUID r0 = X.AnonymousClass9B7.A00
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "audio/mp4"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            java.lang.String r9 = "cenc"
        L_0x0079:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0087
            java.lang.Object r3 = r1.get(r2)
            X.9zO r3 = (X.C209059zO) r3
            if (r3 != 0) goto L_0x0095
        L_0x0087:
            X.9k8 r7 = r12.A02
            X.9MN r8 = r12.A07
            X.9Bg r5 = r12.A06
            X.9zO r3 = new X.9zO
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.add(r3)
        L_0x0095:
            int r0 = r3.A00
            r1 = 1
            int r0 = r0 + 1
            r3.A00 = r0
            if (r0 != r1) goto L_0x00ab
            int r0 = r3.A01
            if (r0 == r1) goto L_0x00ab
            boolean r0 = X.C209059zO.A04(r3, r1)
            if (r0 == 0) goto L_0x00ab
            X.C209059zO.A03(r3, r1)
        L_0x00ab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200129gf.A01(android.os.Looper, X.AXg):X.B28");
    }

    public static C207069uV A00(C21709AXg aXg, UUID uuid, boolean z) {
        int i;
        C192899Iz A002;
        int i2 = aXg.A01;
        ArrayList A14 = C36441kJ.A14(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C207069uV r1 = aXg.A03[i3];
            if ((r1.A00(uuid) || (AnonymousClass9B7.A00.equals(uuid) && r1.A00(AnonymousClass9B7.A01))) && (r1.A04 != null || z)) {
                A14.add(r1);
            }
        }
        if (A14.isEmpty()) {
            return null;
        }
        if (AnonymousClass9B7.A04.equals(uuid)) {
            for (int i4 = 0; i4 < A14.size(); i4++) {
                C207069uV r3 = (C207069uV) A14.get(i4);
                if (r3.A04 == null || (A002 = C1893493i.A00(r3.A04)) == null) {
                    i = -1;
                } else {
                    i = A002.A00;
                }
                if (Util.A00 < 23) {
                    if (i == 0) {
                        return r3;
                    }
                } else if (i == 1) {
                    return r3;
                }
            }
        }
        return (C207069uV) A14.get(0);
    }

    public void A02(C209059zO r5) {
        List list = this.A03;
        list.add(r5);
        if (list.size() == 1) {
            r5.A04.obtainMessage(0, 1, 0, r5.A0C.A02()).sendToTarget();
        }
    }

    public void A03(B28 b28) {
        if (!(b28 instanceof C209049zN)) {
            C209059zO r4 = (C209059zO) b28;
            int i = r4.A00 - 1;
            r4.A00 = i;
            if (i == 0) {
                r4.A01 = 0;
                r4.A09.removeCallbacksAndMessages((Object) null);
                r4.A04.removeCallbacksAndMessages((Object) null);
                r4.A04 = null;
                r4.A02.quit();
                r4.A02 = null;
                r4.A03 = null;
                r4.A05 = null;
                byte[] bArr = r4.A07;
                if (bArr != null) {
                    r4.A0C.A08(bArr);
                    r4.A07 = null;
                }
                this.A04.remove(r4);
                List list = this.A03;
                if (list.size() > 1 && C36391kE.A0t(list) == r4) {
                    C209059zO r1 = (C209059zO) list.get(1);
                    r1.A04.obtainMessage(0, 1, 0, r1.A0C.A02()).sendToTarget();
                }
                list.remove(r4);
            }
            if (this.A00 != null) {
                C200779iD A002 = C200779iD.A00();
                synchronized (A002) {
                    LruCache lruCache = A002.A00;
                    if (lruCache != null) {
                        Iterator A10 = AnonymousClass000.A10(lruCache.snapshot());
                        while (true) {
                            if (!A10.hasNext()) {
                                break;
                            }
                            C207069uV r12 = (C207069uV) A10.next();
                            if (A002.A00.get(r12) == b28) {
                                if (r12 != null) {
                                    A002.A00.remove(r12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C200129gf(C201699k8 r3, AnonymousClass9MN r4, UUID uuid, int[] iArr) {
        Objects.requireNonNull(uuid);
        Objects.requireNonNull(r3);
        if (!AnonymousClass9B7.A01.equals(uuid)) {
            this.A05 = uuid;
            this.A02 = r3;
            this.A07 = r4;
            this.A06 = new C191019Bg();
            this.A08 = iArr;
            this.A04 = AnonymousClass001.A0I();
            this.A03 = AnonymousClass001.A0I();
            r3.A06(new C191029Bh(this));
            return;
        }
        throw AnonymousClass001.A08(String.valueOf("Use C.CLEARKEY_UUID instead"));
    }
}
