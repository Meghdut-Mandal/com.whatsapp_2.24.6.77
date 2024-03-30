package X;

import android.database.ContentObserver;
import android.util.SparseArray;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.6wE  reason: invalid class name and case insensitive filesystem */
public class C146826wE implements C88934Up {
    public int A00;
    public int A01;
    public C36691l9 A02;
    public C36691l9 A03;
    public AnonymousClass5MV A04;
    public AnonymousClass5MV A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public AnonymousClass5MZ A09;
    public final ContentObserver A0A = new C91014bJ(this);
    public final SparseArray A0B;
    public final AnonymousClass1DF A0C;
    public final C20810yC A0D;
    public final AnonymousClass11F A0E;
    public final MediaViewBaseFragment A0F;
    public final AnonymousClass2bU A0G;
    public final AnonymousClass1A1 A0H;
    public final C19770wU A0I;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2bU BE2(int r13) {
        /*
            r12 = this;
            r6 = r12
            int r0 = r12.A00
            int r13 = r13 - r0
            android.util.SparseArray r0 = r12.A0B
            java.lang.Object r4 = r0.get(r13)
            X.2bU r4 = (X.AnonymousClass2bU) r4
            if (r4 != 0) goto L_0x0025
            java.lang.String r3 = " pos:"
            r4 = 0
            if (r13 >= 0) goto L_0x0086
            X.1l9 r5 = r12.A02
            if (r5 == 0) goto L_0x0025
            int r1 = -r13
            int r2 = r1 + -1
            int r1 = r5.getCount()
            if (r2 < r1) goto L_0x0026
            X.1l9 r0 = r12.A02
        L_0x0022:
            r0.getCount()
        L_0x0025:
            return r4
        L_0x0026:
            X.1l9 r1 = r12.A02
            boolean r1 = r1.moveToPosition(r2)
            if (r1 == 0) goto L_0x0025
            boolean r1 = r12.A07
            if (r1 != 0) goto L_0x0083
            X.5MV r1 = r12.A04
            if (r1 != 0) goto L_0x0083
            X.1l9 r1 = r12.A02
            int r2 = r1.getPosition()
            X.1l9 r1 = r12.A02
            int r1 = r1.getCount()
            int r1 = r1 / 2
            if (r2 <= r1) goto L_0x0083
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "MediaMessagesNavigator/navigator/ start upgrade head cursor count:"
            r2.append(r1)
            X.1l9 r1 = r12.A02
            int r1 = r1.getCount()
            r2.append(r1)
            r2.append(r3)
            X.1l9 r1 = r12.A02
            int r1 = r1.getPosition()
            X.C36321k7.A1Y(r2, r1)
            X.0yC r4 = r12.A0D
            X.1A1 r7 = r12.A0H
            X.1DF r3 = r12.A0C
            X.11F r5 = r12.A0E
            X.2bU r1 = r12.A0G
            long r9 = r1.A1N
            r11 = 1
            X.1l9 r1 = r12.A02
            int r8 = r1.getPosition()
            X.5MV r2 = new X.5MV
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            r12.A04 = r2
            X.0wU r1 = r12.A0I
            X.C36391kE.A1Q(r2, r1)
        L_0x0083:
            X.1l9 r1 = r12.A02
            goto L_0x00fe
        L_0x0086:
            if (r13 != 0) goto L_0x0090
            X.2bU r4 = r12.A0G
        L_0x008a:
            if (r4 == 0) goto L_0x0025
            r0.put(r13, r4)
            return r4
        L_0x0090:
            X.1l9 r1 = r12.A03
            if (r1 == 0) goto L_0x0025
            int r2 = r13 + -1
            int r1 = r1.getCount()
            if (r2 < r1) goto L_0x009f
            X.1l9 r0 = r12.A03
            goto L_0x0022
        L_0x009f:
            X.1l9 r1 = r12.A03
            boolean r1 = r1.moveToPosition(r2)
            if (r1 == 0) goto L_0x0025
            boolean r1 = r12.A08
            if (r1 != 0) goto L_0x00fc
            X.5MV r1 = r12.A05
            if (r1 != 0) goto L_0x00fc
            X.1l9 r1 = r12.A03
            int r2 = r1.getPosition()
            X.1l9 r1 = r12.A03
            int r1 = r1.getCount()
            int r1 = r1 / 2
            if (r2 <= r1) goto L_0x00fc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "MediaMessagesNavigator/navigator/ start upgrade tail cursor count:"
            r2.append(r1)
            X.1l9 r1 = r12.A03
            int r1 = r1.getCount()
            r2.append(r1)
            r2.append(r3)
            X.1l9 r1 = r12.A03
            int r1 = r1.getPosition()
            X.C36321k7.A1Y(r2, r1)
            X.0yC r4 = r12.A0D
            X.1A1 r7 = r12.A0H
            X.1DF r3 = r12.A0C
            X.11F r5 = r12.A0E
            X.2bU r1 = r12.A0G
            long r9 = r1.A1N
            X.1l9 r1 = r12.A03
            int r8 = r1.getPosition()
            r11 = 0
            X.5MV r2 = new X.5MV
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            r12.A05 = r2
            X.0wU r1 = r12.A0I
            X.C36391kE.A1Q(r2, r1)
        L_0x00fc:
            X.1l9 r1 = r12.A03
        L_0x00fe:
            X.2bU r4 = r1.A01()
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146826wE.BE2(int):X.2bU");
    }

    public int BG5(C64933Qa r5) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A0B;
            if (i >= sparseArray.size()) {
                return -2;
            }
            int keyAt = sparseArray.keyAt(i);
            if (r5.equals(((AnonymousClass3T1) sparseArray.get(keyAt)).A1J)) {
                return this.A00 + keyAt;
            }
            i++;
        }
    }

    public void BbL() {
    }

    public void BuW() {
        C20810yC r3 = this.A0D;
        AnonymousClass11F r4 = this.A0E;
        AnonymousClass2bU r6 = this.A0G;
        AnonymousClass1A1 r7 = this.A0H;
        AnonymousClass5MZ r1 = new AnonymousClass5MZ(this.A0C, r3, r4, this, r6, r7);
        this.A09 = r1;
        C36331k8.A1F(r1, this.A0I);
    }

    public void Bwc(int i) {
    }

    public void Bv6() {
        AnonymousClass5MZ r0 = this.A09;
        if (r0 != null && !C36431kI.A1Y(r0)) {
            this.A09.A0D(true);
        }
    }

    public int getCount() {
        return this.A00 + 1 + this.A01;
    }

    public C146826wE(AnonymousClass1DF r3, C20810yC r4, AnonymousClass11F r5, MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass2bU r7, AnonymousClass1A1 r8, C19770wU r9) {
        SparseArray sparseArray = new SparseArray();
        this.A0B = sparseArray;
        this.A0D = r4;
        this.A0F = mediaViewBaseFragment;
        this.A0G = r7;
        this.A0I = r9;
        this.A0E = r5;
        this.A0H = r8;
        this.A0C = r3;
        sparseArray.put(0, r7);
    }

    public void close() {
        Bv6();
        C36691l9 r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
        this.A02 = null;
        C36691l9 r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
        this.A03 = null;
        AnonymousClass5MV r03 = this.A04;
        if (r03 != null) {
            r03.A0D(true);
        }
        this.A04 = null;
        AnonymousClass5MV r04 = this.A05;
        if (r04 != null) {
            r04.A0D(true);
        }
        this.A05 = null;
        this.A07 = false;
        this.A08 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B.clear();
    }

    public void Bqj(Runnable runnable) {
        this.A06 = runnable;
    }
}
