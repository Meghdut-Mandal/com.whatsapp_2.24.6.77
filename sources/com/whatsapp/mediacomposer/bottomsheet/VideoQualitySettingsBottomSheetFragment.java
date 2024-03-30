package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass1GJ;
import X.AnonymousClass3TF;
import X.AnonymousClass6AO;
import X.AnonymousClass6AP;
import X.AnonymousClass7MR;
import X.AnonymousClass7MS;
import X.C000400e;
import X.C158427gu;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C90484aE;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class VideoQualitySettingsBottomSheetFragment extends Hilt_VideoQualitySettingsBottomSheetFragment {
    public AnonymousClass1GJ A00;
    public final Map A01;
    public final SortedMap A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new AnonymousClass7MR(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7MS(this));

    public VideoQualitySettingsBottomSheetFragment(C158427gu r7, Integer num, Map map) {
        super(r7, C90484aE.A0B(num));
        this.A01 = map;
        AnonymousClass011[] r4 = new AnonymousClass011[2];
        C36341k9.A1J(Integer.valueOf(R.id.media_quality_default), new AnonymousClass6AO(0, R.string.f12nameremoved), r4, 0);
        C36341k9.A1J(Integer.valueOf(R.id.media_quality_hd), new AnonymousClass6AO(3, R.string.f12nameremoved), r4, 1);
        TreeMap treeMap = new TreeMap();
        C000400e.A0E(treeMap, r4);
        this.A02 = treeMap;
    }

    public void A1S(Bundle bundle, View view) {
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        if (C36331k8.A1b(this.A08)) {
            A1m();
            return;
        }
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Number number = (Number) A11.getKey();
            Map map = this.A01;
            AnonymousClass6AP r0 = (AnonymousClass6AP) C36371kC.A0r(map, ((AnonymousClass6AO) A11.getValue()).A00);
            if (r0 == null) {
                Object A0r = C36371kC.A0r(map, 0);
                if (A0r != null) {
                    r0 = (AnonymousClass6AP) A0r;
                } else {
                    throw C36381kD.A0l();
                }
            }
            AnonymousClass011 r8 = r0.A01;
            long j = r0.A00;
            View view2 = this.A0F;
            if (!(view2 == null || (radioButtonWithSubtitle = (RadioButtonWithSubtitle) view2.findViewById(C36411kG.A07(number))) == null)) {
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = r8.second;
                String A0q = C36401kF.A0q(this, r8.first, A0M, 1, R.string.f12nameremoved);
                C18820ts r02 = this.A03;
                if (r02 != null) {
                    String A022 = AnonymousClass3TF.A02(r02, j);
                    if (A0q == null || A022 == null) {
                        radioButtonWithSubtitle.setSubTitle(A022);
                    } else {
                        radioButtonWithSubtitle.setSubTitle(C36401kF.A0q(this, A022, C36411kG.A1b(A0q), 1, R.string.f12nameremoved));
                    }
                } else {
                    throw C36321k7.A09();
                }
            }
        }
    }
}
