package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;

/* renamed from: X.5VW  reason: invalid class name */
public class AnonymousClass5VW implements AnonymousClass05T {
    public Object A00;
    public final int A01;

    public AnonymousClass5VW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYP(String str, Bundle bundle) {
        AnonymousClass00T r3;
        int i;
        switch (this.A01) {
            case 0:
                AudioChatBottomSheetDialog audioChatBottomSheetDialog = (AudioChatBottomSheetDialog) this.A00;
                MaxHeightLinearLayout maxHeightLinearLayout = audioChatBottomSheetDialog.A08;
                if (maxHeightLinearLayout != null) {
                    maxHeightLinearLayout.postDelayed(new C1501574e(audioChatBottomSheetDialog, 20), 150);
                    return;
                }
                return;
            case 1:
                ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) this.A00;
                if ("single_selection_dialog_result".equals(str)) {
                    boolean A1Q = AnonymousClass000.A1Q(bundle.getInt("selectedIndex"));
                    scheduleCallFragment.A0H = A1Q;
                    WaImageView waImageView = scheduleCallFragment.A06;
                    int i2 = R.drawable.vec_action_voice_call;
                    if (A1Q) {
                        i2 = R.drawable.vec_action_video_call;
                    }
                    waImageView.setImageResource(i2);
                    WaTextView waTextView = scheduleCallFragment.A07;
                    boolean z = scheduleCallFragment.A0H;
                    int i3 = R.string.f12nameremoved;
                    if (z) {
                        i3 = R.string.f12nameremoved;
                    }
                    waTextView.setText(i3);
                    return;
                }
                return;
            default:
                PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = (PrivacyDisclosureContainerActivity) this.A00;
                AnonymousClass00C.A0D(bundle, 2);
                String string = bundle.getString("result", (String) null);
                AnonymousClass00C.A08(string);
                switch (C52002oj.valueOf(string).ordinal()) {
                    case 0:
                        r3 = privacyDisclosureContainerActivity.A02;
                        ((PrivacyDisclosureContainerViewModel) r3.getValue()).A00++;
                        i = 5;
                        break;
                    case 1:
                        r3 = privacyDisclosureContainerActivity.A02;
                        ((PrivacyDisclosureContainerViewModel) r3.getValue()).A00++;
                        i = 155;
                        break;
                    case 2:
                        ((PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A02.getValue()).A0S(165);
                        break;
                    case 3:
                        r3 = privacyDisclosureContainerActivity.A02;
                        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r3.getValue();
                        privacyDisclosureContainerViewModel.A00--;
                        i = 145;
                        break;
                    case 4:
                        r3 = privacyDisclosureContainerActivity.A02;
                        ((PrivacyDisclosureContainerViewModel) r3.getValue()).A00++;
                        i = 160;
                        break;
                    case 5:
                        r3 = privacyDisclosureContainerActivity.A02;
                        ((PrivacyDisclosureContainerViewModel) r3.getValue()).A00++;
                        i = 162;
                        break;
                    case 6:
                        break;
                    default:
                        return;
                }
                if (!PrivacyDisclosureContainerActivity.A0F(privacyDisclosureContainerActivity)) {
                    ((PrivacyDisclosureContainerViewModel) r3.getValue()).A0S(i);
                    privacyDisclosureContainerActivity.finish();
                    return;
                }
                return;
        }
    }
}
