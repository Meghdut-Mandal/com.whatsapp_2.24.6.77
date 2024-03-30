package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.6X7  reason: invalid class name */
public abstract class AnonymousClass6X7 {
    public static final int A00(C161637nE r2) {
        int i = 1;
        if (r2 instanceof C161567n7) {
            i = 3;
        }
        if (r2 instanceof C161627nD) {
            i |= 4;
        }
        if (r2 instanceof C161617nC) {
            i |= 8;
        }
        if (r2 instanceof C161607nB) {
            i |= 32;
        }
        if (r2 instanceof C161577n8) {
            i |= 256;
        }
        if (r2 instanceof C161587n9) {
            return i | 128;
        }
        return i;
    }

    public static final int A01(C137856gq r2) {
        int i = r2.A01;
        if (i != 0) {
            return i;
        }
        int i2 = 1;
        if (r2 instanceof C161777nS) {
            i2 = 3;
        }
        if (r2 instanceof C161817nW) {
            i2 |= 4;
        }
        if (r2 instanceof C161837nY) {
            i2 |= 8;
        }
        if (r2 instanceof C161847nZ) {
            i2 |= 16;
        }
        if (r2 instanceof C161807nV) {
            i2 |= 32;
        }
        if (r2 instanceof C161797nU) {
            i2 |= 64;
        }
        if (r2 instanceof C161827nX) {
            i2 |= 128;
        }
        if (r2 instanceof C161767nR) {
            i2 |= 256;
        }
        if (r2 instanceof C94214hq) {
            i2 |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        if (r2 instanceof C161747nP) {
            i2 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (r2 instanceof C161737nO) {
            i2 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        if (r2 instanceof C161757nQ) {
            i2 |= DefaultCrypto.BUFFER_SIZE;
        }
        if (r2 instanceof C161727nN) {
            i2 |= 16384;
        }
        if (r2 instanceof C17500rW) {
            i2 |= 32768;
        }
        if (r2 instanceof C161857na) {
            return i2 | 262144;
        }
        return i2;
    }

    public static final int A02(C137856gq r3) {
        if (!(r3 instanceof C94114hf)) {
            return A01(r3);
        }
        C94114hf r32 = (C94114hf) r3;
        int i = r32.A01;
        for (C137856gq r1 = r32.A00; r1 != null; r1 = r1.A02) {
            i |= A02(r1);
        }
        return i;
    }

    public static final void A03(C137856gq r2) {
        if (r2.A08) {
            A05(r2, -1, 1);
            return;
        }
        throw AnonymousClass001.A09("autoInvalidateInsertedNode called on unattached node");
    }

    public static final void A04(C137856gq r2) {
        if (r2.A08) {
            A05(r2, -1, 0);
            return;
        }
        throw AnonymousClass001.A09("autoInvalidateUpdatedNode called on unattached node");
    }

    public static final void A05(C137856gq r3, int i, int i2) {
        if (r3 instanceof C94114hf) {
            C94114hf r2 = (C94114hf) r3;
            int i3 = r2.A01;
            A06(r3, i3 & i, i2);
            int i4 = (~i3) & i;
            for (C137856gq r0 = r2.A00; r0 != null; r0 = r0.A02) {
                A05(r0, i4, i2);
            }
            return;
        }
        A06(r3, i & r3.A01, i2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0127 A[EDGE_INSN: B:96:0x0127->B:87:0x0127 ?: BREAK  , SYNTHETIC] */
    public static final void A06(X.C137856gq r8, int r9, int r10) {
        /*
            if (r10 != 0) goto L_0x000f
            boolean r0 = r8 instanceof X.C94354i4
            if (r0 != 0) goto L_0x000e
            boolean r0 = r8 instanceof X.C94344i3
            if (r0 != 0) goto L_0x000e
            boolean r0 = r8 instanceof X.C94254hu
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            r3 = 2
            r0 = r9 & 2
            if (r0 == 0) goto L_0x0032
            boolean r0 = r8 instanceof X.C161777nS
            if (r0 == 0) goto L_0x0032
            X.AnonymousClass6VZ.A06(r8)
            if (r10 != r3) goto L_0x0032
            X.4iy r2 = X.C137856gq.A06(r8)
            r0 = 1
            r2.A0C = r0
            X.00S r0 = r2.A0H
            r0.invoke()
            X.7ls r0 = r2.A07
            if (r0 == 0) goto L_0x0032
            r1 = 0
            r0 = 0
            r2.A0a(r1, r0)
        L_0x0032:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8 instanceof X.C161767nR
            if (r0 == 0) goto L_0x003e
            X.AnonymousClass6VZ.A06(r8)
        L_0x003e:
            r0 = 4
            r0 = r0 & r9
            if (r0 == 0) goto L_0x004c
            boolean r0 = r8 instanceof X.C161817nW
            if (r0 == 0) goto L_0x004c
            r0 = r8
            X.7nW r0 = (X.C161817nW) r0
            X.C109225Wt.A00(r0)
        L_0x004c:
            r0 = 8
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0058
            boolean r0 = r8 instanceof X.C161837nY
            if (r0 == 0) goto L_0x0058
            X.AnonymousClass6VZ.A05(r8)
        L_0x0058:
            r0 = 64
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0072
            boolean r0 = r8 instanceof X.C161797nU
            if (r0 == 0) goto L_0x0072
            X.6gp r0 = X.AnonymousClass6VZ.A02(r8)
            X.6Et r2 = r0.A0P
            X.4ih r0 = r2.A0G
            r1 = 1
            r0.A0H = r1
            X.4ig r0 = r2.A04
            if (r0 == 0) goto L_0x0072
            r0.A0A = r1
        L_0x0072:
            r0 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0080
            boolean r0 = r8 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0080
            if (r10 != r3) goto L_0x010f
            r8.A0A()
        L_0x0080:
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0127
            boolean r0 = r8 instanceof X.C161747nP
            if (r0 == 0) goto L_0x0127
            r2 = r8
            X.7nP r2 = (X.C161747nP) r2
            X.6g1 r1 = X.C137366g1.A01
            r0 = 0
            X.C137366g1.A00 = r0
            r2.B1I(r1)
            java.lang.Boolean r0 = X.C137366g1.A00
            if (r0 == 0) goto L_0x0127
            if (r10 != r3) goto L_0x011c
            r7 = 1024(0x400, float:1.435E-42)
            X.6gq r2 = (X.C137856gq) r2
            X.6gq r6 = r2.A03
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0136
            X.76e r5 = X.C1506776e.A01()
            X.6gq r0 = r6.A02
            if (r0 == 0) goto L_0x00bd
            r5.A0D(r0)
        L_0x00af:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0127
            r4 = 1
            X.6gq r6 = X.C1506776e.A03(r5, r0)
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 != 0) goto L_0x00c3
        L_0x00bd:
            X.AnonymousClass6VZ.A04(r5, r6)
            goto L_0x00af
        L_0x00c1:
            if (r6 == 0) goto L_0x00af
        L_0x00c3:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x010c
            r3 = 0
        L_0x00c9:
            boolean r0 = r6 instanceof X.C94214hq
            if (r0 == 0) goto L_0x00df
            X.6fz r0 = X.AnonymousClass6VZ.A01(r6)
            X.6Kt r1 = r0.A04
            java.util.Set r0 = r1.A02
            X.C130356Kt.A00(r1, r6, r0)
        L_0x00d8:
            X.6gq r6 = X.AnonymousClass6VZ.A00(r3)
        L_0x00dc:
            if (r6 == 0) goto L_0x00af
            goto L_0x00c9
        L_0x00df:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r6 instanceof X.C94114hf
            if (r0 == 0) goto L_0x00d8
            r0 = r6
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x00ee:
            if (r2 == 0) goto L_0x0109
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00fa
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x00fd
            r6 = r2
        L_0x00fa:
            X.6gq r2 = r2.A02
            goto L_0x00ee
        L_0x00fd:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r6 = X.C90524aI.A0D(r3, r6)
            r3.A0D(r2)
            goto L_0x00fa
        L_0x0109:
            if (r1 != r4) goto L_0x00d8
            goto L_0x00dc
        L_0x010c:
            X.6gq r6 = r6.A02
            goto L_0x00c1
        L_0x010f:
            X.6fz r0 = X.AnonymousClass6VZ.A01(r8)
            X.6Kt r1 = r0.A04
            java.util.Set r0 = r1.A02
            X.C130356Kt.A00(r1, r8, r0)
            goto L_0x0080
        L_0x011c:
            X.6fz r0 = X.AnonymousClass6VZ.A01(r2)
            X.6Kt r1 = r0.A04
            java.util.Set r0 = r1.A01
            X.C130356Kt.A00(r1, r2, r0)
        L_0x0127:
            r0 = 4096(0x1000, float:5.74E-42)
            r9 = r9 & r0
            if (r9 == 0) goto L_0x000e
            boolean r0 = r8 instanceof X.C161737nO
            if (r0 == 0) goto L_0x000e
            X.7nO r8 = (X.C161737nO) r8
            X.AnonymousClass6QT.A01(r8)
            return
        L_0x0136:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X7.A06(X.6gq, int, int):void");
    }
}
