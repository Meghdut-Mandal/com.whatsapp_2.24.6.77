package com.whatsapp.calling.views;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass3UE;
import X.C023509x;
import X.C107265Nh;
import X.C109325Xd;
import X.C135456cj;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet;
import com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet$initObservables$1;
import com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel;
import com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel$onStartClicked$1;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class LGCPreCallSheet extends WDSBottomSheetDialogFragment {
    public TextView A00;
    public TextEmojiLabel A01;
    public WDSButton A02;
    public MaxHeightLinearLayout A03;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A03 = (MaxHeightLinearLayout) view;
        A05();
        this.A02 = C36431kI.A0y(view, R.id.start_group_call_button);
        this.A00 = C36391kE.A0O(view, R.id.title);
        this.A01 = C36401kF.A0O(view, R.id.description);
        WDSButton wDSButton = this.A02;
        if (wDSButton != null) {
            wDSButton.setOnClickListener(new C135456cj(this, 34));
        }
        if (this instanceof CallLogMessageParticipantBottomSheet) {
            CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet = (CallLogMessageParticipantBottomSheet) this;
            C36331k8.A1T(new CallLogMessageParticipantBottomSheet$initObservables$1(callLogMessageParticipantBottomSheet, (C023509x) null), C36411kG.A0T(callLogMessageParticipantBottomSheet));
            return;
        }
        LGCCallConfirmationSheet lGCCallConfirmationSheet = (LGCCallConfirmationSheet) this;
        C36331k8.A1T(new LGCCallConfirmationSheet$initObservables$1(lGCCallConfirmationSheet, (C023509x) null), C36411kG.A0T(lGCCallConfirmationSheet));
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A05();
    }

    public void A1m(Context context) {
        if (this instanceof CallLogMessageParticipantBottomSheet) {
            CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = (CallLogMessageParticipantBottomSheetViewModel) ((CallLogMessageParticipantBottomSheet) this).A05.getValue();
            C107265Nh r4 = callLogMessageParticipantBottomSheetViewModel.A00;
            if (r4 != null) {
                callLogMessageParticipantBottomSheetViewModel.A02 = true;
                C36381kD.A1R(callLogMessageParticipantBottomSheetViewModel.A0J, new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(context, callLogMessageParticipantBottomSheetViewModel, r4, (C023509x) null), C109325Xd.A00(callLogMessageParticipantBottomSheetViewModel));
                return;
            }
            return;
        }
        LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel = (LGCCallConfirmationSheetViewModel) ((LGCCallConfirmationSheet) this).A01.getValue();
        C36381kD.A1R(lGCCallConfirmationSheetViewModel.A09, new LGCCallConfirmationSheetViewModel$onStartClicked$1(context, lGCCallConfirmationSheetViewModel, (C023509x) null), C109325Xd.A00(lGCCallConfirmationSheetViewModel));
    }

    public LGCPreCallSheet() {
        super(R.layout.f9nameremoved);
    }

    private final void A05() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            float f = 0.85f;
            if (C36341k9.A04(A0h) == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A03;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) AnonymousClass3UE.A00(A0h)) * f));
            }
        }
    }

    public void A1J() {
        super.A1J();
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
