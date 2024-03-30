package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass6AO;
import X.AnonymousClass6QO;
import X.AnonymousClass7MO;
import X.AnonymousClass7MP;
import X.C000400e;
import X.C122595v6;
import X.C158427gu;
import X.C19700wN;
import X.C36341k9;
import X.C36431kI;
import X.C90484aE;
import com.whatsapp.R;
import java.util.SortedMap;
import java.util.TreeMap;

public final class ImageQualitySettingsBottomSheetFragment extends Hilt_ImageQualitySettingsBottomSheetFragment {
    public C19700wN A00;
    public C122595v6 A01;
    public final AnonymousClass6QO A02;
    public final SortedMap A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7MO(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass7MP(this));

    public ImageQualitySettingsBottomSheetFragment(AnonymousClass6QO r7, C158427gu r8, Integer num) {
        super(r8, C90484aE.A0B(num));
        this.A02 = r7;
        AnonymousClass011[] r4 = new AnonymousClass011[2];
        C36341k9.A1J(Integer.valueOf(R.id.media_quality_default), new AnonymousClass6AO(0, R.string.f12nameremoved), r4, 0);
        C36341k9.A1J(Integer.valueOf(R.id.media_quality_hd), new AnonymousClass6AO(3, R.string.f12nameremoved), r4, 1);
        TreeMap treeMap = new TreeMap();
        C000400e.A0E(treeMap, r4);
        this.A03 = treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r1 == 270) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.A1S(r5, r6)
            X.00T r0 = r4.A08
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x0013
            r4.A1m()
        L_0x0012:
            return
        L_0x0013:
            X.6QO r2 = r4.A02     // Catch:{ FileNotFoundException -> 0x0039 }
            int r1 = r2.A02()     // Catch:{ FileNotFoundException -> 0x0039 }
            r0 = 90
            if (r1 == r0) goto L_0x0026
            int r1 = r2.A02()     // Catch:{ FileNotFoundException -> 0x0039 }
            r0 = 270(0x10e, float:3.78E-43)
            r2 = 0
            if (r1 != r0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            X.0wU r1 = r4.A06     // Catch:{ FileNotFoundException -> 0x0039 }
            if (r1 == 0) goto L_0x0034
            X.74k r0 = new X.74k     // Catch:{ FileNotFoundException -> 0x0039 }
            r0.<init>(r4, r2)     // Catch:{ FileNotFoundException -> 0x0039 }
            r1.Boy(r0)     // Catch:{ FileNotFoundException -> 0x0039 }
            goto L_0x0048
        L_0x0034:
            java.lang.RuntimeException r0 = X.C36321k7.A08()     // Catch:{ FileNotFoundException -> 0x0039 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.0wN r3 = r4.A00
            if (r3 == 0) goto L_0x0068
            java.lang.String r2 = r0.getMessage()
            r1 = 1
            java.lang.String r0 = "ImageQualitySettingsBottomSheetFragment/getSubtitles/getTargetResolution/FileNotFoundException"
            r3.A0E(r0, r2, r1)
        L_0x0048:
            X.0yC r1 = r4.A04
            if (r1 == 0) goto L_0x0063
            r0 = 4039(0xfc7, float:5.66E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0012
            X.0wU r1 = r4.A06
            if (r1 == 0) goto L_0x005e
            r0 = 40
            X.C1503074t.A00(r1, r4, r0)
            return
        L_0x005e:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0063:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0068:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment.A1S(android.os.Bundle, android.view.View):void");
    }
}
