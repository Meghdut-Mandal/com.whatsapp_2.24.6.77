package X;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6gr  reason: invalid class name and case insensitive filesystem */
public final class C137866gr implements C160967ls {
    public static final C009003v A0D = AnonymousClass7ZU.A00;
    public int A00;
    public long A01 = C112365dm.A00;
    public C158827iI A02;
    public AnonymousClass00S A03;
    public C006302t A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AndroidComposeView A08;
    public final C161097m9 A09;
    public final AnonymousClass6VB A0A;
    public final C114355h5 A0B = new C114355h5();
    public final C1273067t A0C = new C1273067t(A0D);

    public void Boo(AnonymousClass00S r3, C006302t r4) {
        A00(false);
        this.A06 = false;
        this.A05 = false;
        this.A01 = C112365dm.A00;
        this.A04 = r4;
        this.A03 = r3;
    }

    private final void A00(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            this.A08.A0H(this, z);
        }
    }

    public void B69(C161047m3 r11) {
        Canvas canvas = C112335dj.A00;
        AnonymousClass00C.A0E(r11, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        Canvas canvas2 = ((C137386g3) r11).A00;
        boolean z = false;
        if (canvas2.isHardwareAccelerated()) {
            Bwe();
            C161097m9 r3 = this.A09;
            if (r3.BBS() > 0.0f) {
                z = true;
            }
            this.A05 = z;
            if (z) {
                r11.B6R();
            }
            r3.B68(canvas2);
            if (this.A05) {
                r11.B5U();
                return;
            }
            return;
        }
        C161097m9 r32 = this.A09;
        float BDV = (float) r32.BDV();
        float BIP = (float) r32.BIP();
        float BGq = (float) r32.BGq();
        float B8u = (float) r32.B8u();
        if (r32.B8b() < 1.0f) {
            C158827iI r2 = this.A02;
            if (r2 == null) {
                r2 = new C137416g6();
                this.A02 = r2;
            }
            r2.Bq5(r32.B8b());
            canvas2.saveLayer(BDV, BIP, BGq, B8u, ((C137416g6) r2).A01);
        } else {
            r11.BpF();
        }
        r11.Bw6(BDV, BIP);
        r11.B3L(this.A0C.A01(r32));
        if (r32.B9m() || r32.B9l()) {
            this.A0A.A04(r11);
        }
        C006302t r0 = this.A04;
        if (r0 != null) {
            r0.invoke(r11);
        }
        r11.Boi();
        A00(false);
    }

    public void BP2(AnonymousClass675 r3, boolean z) {
        float[] fArr;
        C1273067t r1 = this.A0C;
        C161097m9 r0 = this.A09;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                r3.A01 = 0.0f;
                r3.A03 = 0.0f;
                r3.A02 = 0.0f;
                r3.A00 = 0.0f;
                return;
            }
        } else {
            fArr = r1.A01(r0);
        }
        AnonymousClass6VX.A01(r3, fArr);
    }

    public long BP3(long j, boolean z) {
        float[] fArr;
        C1273067t r1 = this.A0C;
        C161097m9 r0 = this.A09;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                return C133206Xf.A01;
            }
        } else {
            fArr = r1.A01(r0);
        }
        return AnonymousClass6VX.A00(fArr, j);
    }

    public void BPx(long j) {
        C161097m9 r4 = this.A09;
        int BDV = r4.BDV();
        int BIP = r4.BIP();
        int A082 = C90494aF.A08(j);
        int A032 = C90474aD.A03(j);
        if (BDV != A082 || BIP != A032) {
            if (BDV != A082) {
                r4.BQS(A082 - BDV);
            }
            if (BIP != A032) {
                r4.BQV(A032 - BIP);
            }
            int i = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.A08;
            if (i >= 26) {
                AnonymousClass5XE.A00(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            C1273067t r1 = this.A0C;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwe() {
        /*
            r4 = this;
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x000c
            X.7m9 r0 = r4.A09
            boolean r0 = r0.BCH()
            if (r0 != 0) goto L_0x002e
        L_0x000c:
            X.7m9 r3 = r4.A09
            boolean r0 = r3.B9m()
            if (r0 == 0) goto L_0x002f
            X.6VB r1 = r4.A0A
            boolean r0 = r1.A08
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002f
            X.AnonymousClass6VB.A00(r1)
            X.7mK r2 = r1.A05
        L_0x0021:
            X.02t r1 = r4.A04
            if (r1 == 0) goto L_0x002a
            X.5h5 r0 = r4.A0B
            r3.Bn0(r0, r2, r1)
        L_0x002a:
            r0 = 0
            r4.A00(r0)
        L_0x002e:
            return
        L_0x002f:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137866gr.Bwe():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        if (r14.A09 == X.C112355dl.A00) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if (r14.A09 != X.C112355dl.A00) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if ((!r13.A0A.A08) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwi(X.C137396g4 r14, X.C161937ni r15, X.AnonymousClass5RW r16) {
        /*
            r13 = this;
            int r4 = r14.A05
            int r0 = r13.A00
            r4 = r4 | r0
            r6 = r4 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x000d
            long r0 = r14.A08
            r13.A01 = r0
        L_0x000d:
            X.7m9 r3 = r13.A09
            boolean r0 = r3.B9m()
            r2 = 0
            if (r0 == 0) goto L_0x001f
            X.6VB r0 = r13.A0A
            boolean r0 = r0.A08
            r0 = r0 ^ 1
            r5 = 1
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0029
            float r0 = r14.A02
            r3.Bs6(r0)
        L_0x0029:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0032
            float r0 = r14.A03
            r3.Bs7(r0)
        L_0x0032:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x003b
            float r0 = r14.A00
            r3.Bq5(r0)
        L_0x003b:
            r0 = r4 & 8
            if (r0 == 0) goto L_0x0043
            r0 = 0
            r3.Bsa(r0)
        L_0x0043:
            r0 = r4 & 16
            if (r0 == 0) goto L_0x004b
            r0 = 0
            r3.Bsb(r0)
        L_0x004b:
            r0 = r4 & 32
            if (r0 == 0) goto L_0x0054
            float r0 = r14.A04
            r3.Bqo(r0)
        L_0x0054:
            r0 = r4 & 64
            if (r0 == 0) goto L_0x0067
            long r0 = r14.A06
            X.4iQ r7 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r7, r0)
            int r0 = X.C90514aH.A0D(r0)
            r3.Bq8(r0)
        L_0x0067:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x007a
            long r0 = r14.A07
            X.4iQ r7 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r7, r0)
            int r0 = X.C90514aH.A0D(r0)
            r3.BsI(r0)
        L_0x007a:
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0082
            r0 = 0
            r3.Bs5(r0)
        L_0x0082:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x008a
            r0 = 0
            r3.Bs3(r0)
        L_0x008a:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0092
            r0 = 0
            r3.Bs4(r0)
        L_0x0092:
            r0 = r4 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x009b
            float r0 = r14.A01
            r3.BqO(r0)
        L_0x009b:
            if (r6 == 0) goto L_0x00bd
            long r0 = r13.A01
            long r6 = X.C112365dm.A00
            float r1 = X.C90464aC.A01(r0)
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r3.BrZ(r1)
            long r0 = r13.A01
            float r1 = X.C90464aC.A00(r0)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r3.Bra(r1)
        L_0x00bd:
            boolean r0 = r14.A0B
            if (r0 == 0) goto L_0x00c8
            X.7dt r1 = r14.A09
            X.7dt r0 = X.C112355dl.A00
            r12 = 1
            if (r1 != r0) goto L_0x00c9
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00df
            r3.BqT(r12)
            boolean r0 = r14.A0B
            if (r0 == 0) goto L_0x00db
            X.7dt r6 = r14.A09
            X.7dt r1 = X.C112355dl.A00
            r0 = 1
            if (r6 == r1) goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r3.BqS(r0)
        L_0x00df:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x00e8
            r0 = 0
            r3.Brv(r0)
        L_0x00e8:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x00f1
            r3.BqX(r2)
        L_0x00f1:
            X.6VB r6 = r13.A0A
            X.7dt r7 = r14.A09
            float r10 = r14.A00
            float r11 = r14.A04
            r8 = r15
            r9 = r16
            boolean r1 = r6.A06(r7, r8, r9, r10, r11, r12)
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x010b
            android.graphics.Outline r0 = r6.A03()
            r3.BrQ(r0)
        L_0x010b:
            if (r12 == 0) goto L_0x0114
            boolean r0 = r6.A08
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0114
            r2 = 1
        L_0x0114:
            if (r5 != r2) goto L_0x011a
            if (r2 == 0) goto L_0x0141
            if (r1 == 0) goto L_0x0141
        L_0x011a:
            r13.invalidate()
        L_0x011d:
            boolean r0 = r13.A05
            if (r0 != 0) goto L_0x0131
            float r1 = r3.BBS()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0131
            X.00S r0 = r13.A03
            if (r0 == 0) goto L_0x0131
            r0.invoke()
        L_0x0131:
            r0 = r4 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x013c
            X.67t r1 = r13.A0C
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x013c:
            int r0 = r14.A05
            r13.A00 = r0
            return
        L_0x0141:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            androidx.compose.ui.platform.AndroidComposeView r0 = r13.A08
            if (r2 < r1) goto L_0x014d
            X.AnonymousClass5XE.A00(r0)
            goto L_0x011d
        L_0x014d:
            r0.invalidate()
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137866gr.Bwi(X.6g4, X.7ni, X.5RW):void");
    }

    public void destroy() {
        C161097m9 r1 = this.A09;
        if (r1.BCH()) {
            r1.B5W();
        }
        this.A04 = null;
        this.A03 = null;
        this.A06 = true;
        A00(false);
        AndroidComposeView androidComposeView = this.A08;
        androidComposeView.A07 = true;
        androidComposeView.A0I(this);
    }

    public void invalidate() {
        if (!this.A07 && !this.A06) {
            this.A08.invalidate();
            A00(true);
        }
    }

    public C137866gr(AndroidComposeView androidComposeView, AnonymousClass00S r4, C006302t r5) {
        C161097m9 r1;
        this.A08 = androidComposeView;
        this.A04 = r5;
        this.A03 = r4;
        this.A0A = new AnonymousClass6VB(androidComposeView.A04);
        if (Build.VERSION.SDK_INT >= 29) {
            r1 = new C137946gz(androidComposeView);
        } else {
            r1 = new C137956h0(androidComposeView);
        }
        C161097m9 r12 = r1;
        r12.Bqz(true);
        r12.BqS(false);
        this.A09 = r12;
    }

    public boolean BLx(long j) {
        float A002 = C133206Xf.A00(j);
        float A012 = C133206Xf.A01(j);
        C161097m9 r3 = this.A09;
        if (r3.B9l()) {
            if (0.0f > A002 || A002 >= ((float) r3.getWidth()) || 0.0f > A012 || A012 >= ((float) r3.getHeight())) {
                return false;
            }
        } else if (r3.B9m()) {
            return this.A0A.A05(j);
        }
        return true;
    }

    public void Boc(long j) {
        int A082 = C90494aF.A08(j);
        int A032 = C90474aD.A03(j);
        C161097m9 r6 = this.A09;
        long j2 = this.A01;
        long j3 = C112365dm.A00;
        float f = (float) A082;
        r6.BrZ(C90464aC.A01(j2) * f);
        float f2 = (float) A032;
        r6.Bra(C90464aC.A00(this.A01) * f2);
        if (r6.Brf(r6.BDV(), r6.BIP(), r6.BDV() + A082, r6.BIP() + A032)) {
            AnonymousClass6VB r5 = this.A0A;
            long A0B2 = C90464aC.A0B(f, f2);
            long j4 = AnonymousClass6X0.A02;
            if (r5.A03 != A0B2) {
                r5.A03 = A0B2;
                r5.A06 = true;
            }
            r6.BrQ(r5.A03());
            invalidate();
            C1273067t r1 = this.A0C;
            r1.A00 = true;
            r1.A01 = true;
        }
    }
}
