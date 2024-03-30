package X;

import android.widget.RadioGroup;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.VideoQualitySettingsBottomSheetFragment;
import java.util.SortedMap;

/* renamed from: X.6dn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136116dn implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ MediaQualitySettingsBottomSheetFragment A00;

    public /* synthetic */ C136116dn(MediaQualitySettingsBottomSheetFragment mediaQualitySettingsBottomSheetFragment) {
        this.A00 = mediaQualitySettingsBottomSheetFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        SortedMap sortedMap;
        MediaQualitySettingsBottomSheetFragment mediaQualitySettingsBottomSheetFragment = this.A00;
        if (mediaQualitySettingsBottomSheetFragment instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) mediaQualitySettingsBottomSheetFragment).A02;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) mediaQualitySettingsBottomSheetFragment).A03;
        }
        AnonymousClass6AO r0 = (AnonymousClass6AO) C36371kC.A0r(sortedMap, i);
        if (r0 != null) {
            mediaQualitySettingsBottomSheetFragment.A00 = r0.A00;
        }
        C20810yC r1 = mediaQualitySettingsBottomSheetFragment.A04;
        if (r1 == null) {
            throw C36321k7.A07();
        } else if (r1.A0E(4244)) {
            C158427gu r12 = mediaQualitySettingsBottomSheetFragment.A07;
            if (r12 != null) {
                r12.BaZ(Integer.valueOf(mediaQualitySettingsBottomSheetFragment.A00));
            }
            mediaQualitySettingsBottomSheetFragment.A1b();
        } else {
            C158427gu r3 = mediaQualitySettingsBottomSheetFragment.A07;
            if (r3 != null) {
                Integer valueOf = Integer.valueOf(mediaQualitySettingsBottomSheetFragment.A00);
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r3;
                if (valueOf != null && valueOf.intValue() == 3 && mediaComposerActivity.A0D.A0E(3307)) {
                    mediaComposerActivity.A04.Boz(mediaComposerActivity.A1T, "data_warning_runnable_tag");
                }
            }
        }
    }
}
