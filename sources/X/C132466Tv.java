package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.6Tv  reason: invalid class name and case insensitive filesystem */
public class C132466Tv {
    public static final C18950u5 A08 = new C18950u5(1, 10);
    public long A00 = -1;
    public final C1042458v A01;
    public final C1042658x A02;
    public final HashSet A03 = C36441kJ.A16();
    public final HashSet A04 = C36441kJ.A16();
    public final long A05;
    public final C20810yC A06;
    public final C21010yW A07;

    public static /* synthetic */ String A00(Iterable iterable) {
        Objects.requireNonNull(", ", "delimiter");
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                A0u.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                A0u.append(", ");
            }
        }
        return A0u.toString();
    }

    public void A01() {
        this.A02.A0P = C90504aG.A0h(SystemClock.uptimeMillis(), this.A05);
        this.A00 = SystemClock.uptimeMillis();
    }

    public void A02() {
        long j = this.A00;
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        C18740tg.A0C(z);
        C1042458v r3 = this.A01;
        r3.A02 = false;
        C1042658x r4 = this.A02;
        r4.A03 = false;
        Long A0h = C90504aG.A0h(SystemClock.uptimeMillis(), j);
        r4.A0b = A0h;
        r3.A0A = A0h;
        r4.A0a = C90504aG.A0h(SystemClock.uptimeMillis(), this.A05);
        r3.A0O = r4.A0P;
        r4.A0d = A00(this.A04);
        r4.A0c = A00(this.A03);
        C20810yC r2 = this.A06;
        if (r2.A0E(7758)) {
            this.A07.Blx(r4, A08);
        }
        if (!r2.A0E(7759)) {
            this.A07.Blx(r3, A08);
        }
    }

    public void A03() {
        long j = this.A00;
        boolean z = true;
        if (j <= 0) {
            z = false;
        }
        C18740tg.A0C(z);
        C1042658x r3 = this.A02;
        Long A0h = C90504aG.A0h(SystemClock.uptimeMillis(), j);
        r3.A0b = A0h;
        C1042458v r2 = this.A01;
        r2.A0A = A0h;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mediatranscodequeue/srcLength");
        A0u.append(r3.A0U);
        A0u.append(" destinationSize=");
        A0u.append(r3.A0J);
        A0u.append(" compressionRate=");
        A0u.append(((float) r3.A0J.longValue()) / ((float) r3.A0U.longValue()));
        A0u.append(" duration=");
        A0u.append(r3.A0b);
        A0u.append(" width=");
        A0u.append(r3.A0K);
        A0u.append(" height=");
        A0u.append(r3.A0I);
        A0u.append(" isProgressiveJpeg=");
        A0u.append(r3.A00);
        A0u.append(" firstScanLength=");
        A0u.append(r3.A0L);
        A0u.append(" thumbnailLength=");
        C36321k7.A1N(r3.A0Z, A0u);
        r2.A02 = true;
        r3.A03 = true;
        r3.A0a = C90504aG.A0h(SystemClock.uptimeMillis(), this.A05);
        r2.A0O = r3.A0P;
        r3.A0d = A00(this.A04);
        r3.A0c = A00(this.A03);
        C20810yC r1 = this.A06;
        if (r1.A0E(7758)) {
            this.A07.Bly(r3);
        }
        if (!r1.A0E(7759)) {
            this.A07.Bly(r2);
        }
    }

    public void A04(int i) {
        C1042658x r1;
        this.A01.A0P = C36441kJ.A0y(i);
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i == 3) {
                r1 = this.A02;
                i2 = 2;
                r1.A08 = Integer.valueOf(i2);
            } else if (i != 13) {
                return;
            }
        }
        r1 = this.A02;
        r1.A08 = Integer.valueOf(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r5 != 4) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(int r5) {
        /*
            r4 = this;
            X.58x r3 = r4.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A0C = r0
            r2 = 1
            if (r5 == r2) goto L_0x0014
            r1 = 2
            if (r5 == r1) goto L_0x0020
            r0 = 3
            if (r5 == r0) goto L_0x001b
            r0 = 4
            if (r5 == r0) goto L_0x0020
        L_0x0014:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0018:
            r3.A09 = r0
            return
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132466Tv.A05(int):void");
    }

    public void A06(int i, int i2) {
        C1042458v r0 = this.A01;
        Long A0y = C36441kJ.A0y(i);
        r0.A09 = A0y;
        Long A0y2 = C36441kJ.A0y(i2);
        r0.A07 = A0y2;
        C1042658x r02 = this.A02;
        r02.A0K = A0y;
        r02.A0I = A0y2;
    }

    public void A07(long j) {
        C1042458v r0 = this.A01;
        Long valueOf = Long.valueOf(j);
        r0.A08 = valueOf;
        this.A02.A0J = valueOf;
    }

    public void A08(long j) {
        C1042458v r0 = this.A01;
        Long valueOf = Long.valueOf(j);
        r0.A0K = valueOf;
        this.A02.A0U = valueOf;
    }

    public void A09(C1273567y r7) {
        C1042458v r5 = this.A01;
        Long A0y = C36441kJ.A0y(r7.A02);
        r5.A0L = A0y;
        Long A0y2 = C36441kJ.A0y(r7.A00);
        r5.A0J = A0y2;
        r5.A0H = C36441kJ.A0y(r7.A01() / 1000);
        Long valueOf = Long.valueOf(C36391kE.A0B(r7.A03));
        r5.A0I = valueOf;
        C1042658x r1 = this.A02;
        r1.A0V = A0y;
        r1.A0T = A0y2;
        r1.A0Q = C36441kJ.A0y(r7.A01() / 1000);
        r1.A0R = valueOf;
    }

    public void A0C(boolean z) {
        C1042458v r0 = this.A01;
        Boolean valueOf = Boolean.valueOf(z);
        r0.A03 = valueOf;
        this.A02.A00 = valueOf;
    }

    public void A0D(boolean z) {
        this.A02.A04 = Boolean.valueOf(z);
    }

    public C132466Tv(C20810yC r3, C21010yW r4, Integer num, int i) {
        this.A07 = r4;
        this.A06 = r3;
        this.A01 = new C1042458v();
        C1042658x r1 = new C1042658x();
        this.A02 = r1;
        r1.A0E = C36441kJ.A0y(i);
        if (num != null) {
            r1.A0D = num;
        }
        this.A05 = SystemClock.uptimeMillis();
    }

    public void A0A(String str) {
        int length = str.length();
        C1042458v r0 = this.A01;
        if (length > 10000) {
            str = C90514aH.A0z(str, SearchActionVerificationClientService.NOTIFICATION_ID);
        }
        r0.A0Q = str;
    }

    public void A0B(String str) {
        int length = str.length();
        C1042658x r0 = this.A02;
        if (length > 10000) {
            str = C90514aH.A0z(str, SearchActionVerificationClientService.NOTIFICATION_ID);
        }
        r0.A0f = str;
    }
}
