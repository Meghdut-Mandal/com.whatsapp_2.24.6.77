package X;

import android.view.ViewGroup;

/* renamed from: X.4mm  reason: invalid class name and case insensitive filesystem */
public class C96094mm extends AnonymousClass0CZ {
    public AnonymousClass0CZ A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = r2 << 32;
        r0 = (long) (r6 + (r8 - r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A00(X.C96094mm r7, int r8) {
        /*
            X.0CZ r7 = r7.A00
            X.7lT r7 = (X.C160717lT) r7
            int r3 = r7.BCL()
            r2 = 0
            r6 = 0
            r5 = 0
        L_0x000b:
            r4 = 32
            if (r2 >= r3) goto L_0x002b
            if (r5 != r8) goto L_0x001a
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0018:
            long r2 = r2 | r0
            return r2
        L_0x001a:
            int r5 = r5 + 1
            int r1 = r7.BAF(r2)
            int r0 = r5 + r1
            if (r0 <= r8) goto L_0x0026
            long r2 = (long) r2
            goto L_0x002e
        L_0x0026:
            int r6 = r6 + r1
            int r2 = r2 + 1
            r5 = r0
            goto L_0x000b
        L_0x002b:
            int r0 = r3 + -1
            long r2 = (long) r0
        L_0x002e:
            long r2 = r2 << r4
            int r8 = r8 - r5
            int r6 = r6 + r8
            long r0 = (long) r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96094mm.A00(X.4mm, int):long");
    }

    public int A0J() {
        AnonymousClass0CZ r0 = this.A00;
        return r0.A0J() + ((C160717lT) r0).BCL();
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == -1000) {
            return ((C160717lT) this.A00).BUs(viewGroup);
        }
        return this.A00.BUw(viewGroup, i);
    }

    public C96094mm(AnonymousClass0CZ r3) {
        this.A00 = r3;
        A0B(r3.A00);
        r3.BnA(new C162507oh(this, 2));
    }

    public long A0E(int i) {
        long A002 = A00(this, i);
        boolean A1Q = AnonymousClass000.A1Q(((A002 & 4294967295L) > 4294967295L ? 1 : ((A002 & 4294967295L) == 4294967295L ? 0 : -1)));
        AnonymousClass0CZ r1 = this.A00;
        if (A1Q) {
            return ((C160717lT) r1).BCM(C90494aF.A08(A002));
        }
        return r1.A0E(C90474aD.A03(A002));
    }

    public void BSE(AnonymousClass0D3 r8, int i) {
        long A002 = A00(this, i);
        boolean A1Q = AnonymousClass000.A1Q(((A002 & 4294967295L) > 4294967295L ? 1 : ((A002 & 4294967295L) == 4294967295L ? 0 : -1)));
        AnonymousClass0CZ r1 = this.A00;
        if (A1Q) {
            ((C160717lT) r1).BSC(r8, C90494aF.A08(A002));
        } else {
            r1.BSE(r8, C90474aD.A03(A002));
        }
    }

    public int getItemViewType(int i) {
        long A002 = A00(this, i);
        if (AnonymousClass000.A1Q(((A002 & 4294967295L) > 4294967295L ? 1 : ((A002 & 4294967295L) == 4294967295L ? 0 : -1)))) {
            return -1000;
        }
        return this.A00.getItemViewType(C90474aD.A03(A002));
    }
}
