package X;

import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;

/* renamed from: X.74k  reason: invalid class name and case insensitive filesystem */
public class C1502174k implements Runnable {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C1502174k(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, boolean z) {
        this.A03 = 0;
        this.A01 = imageQualitySettingsBottomSheetFragment;
        this.A02 = z;
        this.A00 = R.string.f12nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00be, code lost:
        if (r8 != 2) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0165;
                case 1: goto L_0x0103;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.6ma r1 = (X.C141046ma) r1
            int r8 = r10.A00
            boolean r7 = r10.A02
            r6 = 1
            r5 = 0
            if (r8 != r6) goto L_0x0017
            X.5NR r0 = r1.A00
            r0.A0O = r5
            r0.A0B = r5
        L_0x0017:
            X.5NR r4 = r1.A00
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0078
            X.4SO r0 = r4.A08
            if (r0 == 0) goto L_0x0024
            r0.Bcs(r7, r8)
        L_0x0024:
            r3 = 3
            if (r8 != r3) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x0038
            r4.A0P = r5
            X.5NI r1 = r4.A0D
            if (r1 == 0) goto L_0x0038
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A09(r0)
        L_0x0038:
            X.6FG r2 = r4.A0A
            if (r2 == 0) goto L_0x0050
            boolean r0 = r2 instanceof X.AnonymousClass5NL
            if (r0 == 0) goto L_0x008c
            X.5NL r2 = (X.AnonymousClass5NL) r2
            if (r8 != r3) goto L_0x00b8
            if (r7 == 0) goto L_0x00c0
            X.6Ea r0 = r2.A0A
            r0.A00()
            X.6Ea r0 = r2.A0B
            r0.A02()
        L_0x0050:
            if (r8 != r3) goto L_0x0079
            if (r7 == 0) goto L_0x0079
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x0061
            r4.A0N = r6
            X.4SN r0 = r4.A07
            if (r0 == 0) goto L_0x0061
            r0.BhC(r4)
        L_0x0061:
            r4.A0M = r5
        L_0x0063:
            boolean r2 = r4.A0E
            r1 = 2
            boolean r0 = X.AnonymousClass000.A1S(r8, r1)
            if (r2 == r0) goto L_0x0078
            if (r8 == r1) goto L_0x006f
            r6 = 0
        L_0x006f:
            r4.A0E = r6
            X.4SK r0 = r4.A04
            if (r0 == 0) goto L_0x0078
            r0.BSJ(r4, r6)
        L_0x0078:
            return
        L_0x0079:
            r4.A0B = r5
            r0 = 4
            if (r8 != r0) goto L_0x0061
            boolean r0 = r4.A0M
            if (r0 != 0) goto L_0x0063
            r4.A0M = r6
            X.4SL r0 = r4.A05
            if (r0 == 0) goto L_0x0063
            r0.BU7(r4)
            goto L_0x0063
        L_0x008c:
            X.5NM r2 = (X.AnonymousClass5NM) r2
            if (r8 != r3) goto L_0x00c6
            X.6Ea r1 = r2.A0B
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x009b
            r1.A00()
            r2.A06 = r6
        L_0x009b:
            X.6Ea r0 = r2.A0D
            if (r7 == 0) goto L_0x00ac
            r0.A02()
            X.6Ea r0 = r2.A0C
            r0.A00()
            r2.A00 = r6
        L_0x00a9:
            X.6Ea r0 = r2.A0A
            goto L_0x00c2
        L_0x00ac:
            r0.A00()
            X.6Ea r0 = r2.A0C
            r0.A02()
            r0 = 2
            r2.A00 = r0
            goto L_0x00a9
        L_0x00b8:
            if (r8 == r6) goto L_0x00c0
            r0 = 4
            if (r8 == r0) goto L_0x00c0
            r0 = 2
            if (r8 != r0) goto L_0x0050
        L_0x00c0:
            X.6Ea r0 = r2.A0B
        L_0x00c2:
            r0.A00()
            goto L_0x0050
        L_0x00c6:
            r0 = 4
            if (r8 != r0) goto L_0x00dd
            X.6Ea r0 = r2.A0D
            r0.A00()
            X.6Ea r0 = r2.A0A
            r0.A00()
            X.6Ea r0 = r2.A0C
            r0.A00()
            r0 = 5
        L_0x00d9:
            r2.A00 = r0
            goto L_0x0050
        L_0x00dd:
            r0 = 2
            if (r8 != r0) goto L_0x0050
            X.6Ea r0 = r2.A0D
            r0.A00()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00fc
            X.6Ea r1 = r2.A0A
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00fc
            if (r7 == 0) goto L_0x00fc
            r1.A02()
            monitor-enter(r2)
            int r0 = r2.A01     // Catch:{ all -> 0x0162 }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)
        L_0x00fc:
            X.6Ea r0 = r2.A0C
            r0.A00()
            r0 = 3
            goto L_0x00d9
        L_0x0103:
            java.lang.Object r0 = r10.A01
            X.6mb r0 = (X.C141056mb) r0
            int r3 = r10.A00
            X.5NU r2 = r0.A00
            r2.A00 = r3
            r0 = 3
            if (r3 != r0) goto L_0x0118
            X.6D2 r0 = r2.A01
            if (r0 == 0) goto L_0x0078
            r0.A00()
            return
        L_0x0118:
            X.5NI r1 = r2.A02
            if (r1 == 0) goto L_0x014b
            r0 = 4
            if (r3 != r0) goto L_0x014b
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x012a
            X.5NI r0 = r2.A02
            r0.A03()
        L_0x012a:
            X.6D2 r0 = r2.A01
            if (r0 == 0) goto L_0x0131
            r0.A00()
        L_0x0131:
            X.9ps r0 = r2.A00
            if (r0 == 0) goto L_0x0078
            r0.A0B()
            X.9ps r2 = r2.A00
            X.5i1 r1 = new X.5i1
            r1.<init>()
            r0 = 0
            r1.A00 = r0
            X.60G r0 = new X.60G
            r0.<init>(r1)
            r2.A0J(r0)
            return
        L_0x014b:
            r0 = 2
            X.6D2 r1 = r2.A01
            if (r3 != r0) goto L_0x015c
            if (r1 == 0) goto L_0x0078
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r2.A03
            r1.A02(r0)
            return
        L_0x015c:
            if (r1 == 0) goto L_0x0078
            r1.A00()
            return
        L_0x0162:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0165:
            java.lang.Object r3 = r10.A01
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r3 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r3
            boolean r8 = r10.A02
            r9 = 0
            X.1D1 r4 = r3.A05
            if (r4 == 0) goto L_0x0197
            X.6QO r0 = r3.A02
            android.net.Uri r6 = r0.A0J
            android.graphics.Rect r5 = r0.A04()
            int[] r7 = X.C36441kJ.A1O()
            r7 = {3, 0} // fill-array
            java.util.HashMap r2 = r4.A01(r5, r6, r7, r8, r9)
            X.17Y r1 = r3.A02
            if (r1 == 0) goto L_0x0190
            X.3wq r0 = new X.3wq
            r0.<init>((com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r3, (java.util.Map) r2)
            r1.A0H(r0)
            return
        L_0x0190:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0197:
            java.lang.String r0 = "imageQuality"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019e:
            r1.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502174k.run():void");
    }

    public C1502174k(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }
}
