package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

/* renamed from: X.7sG  reason: invalid class name and case insensitive filesystem */
public class C164717sG implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public C164717sG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        AnonymousClass01I A0h;
        AnonymousClass6X3 r0;
        switch (this.A01) {
            case 0:
                AnonymousClass6C8 r1 = (AnonymousClass6C8) this.A00;
                if (i != 4) {
                    return true;
                }
                r1.A00("on_press_back");
                dialogInterface.dismiss();
                return true;
            case 1:
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                RelativeLayout relativeLayout = flowsWebBottomSheetContainer.A01;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0G;
                    if (waFlowsViewModel == null) {
                        throw C36331k8.A0d("waFlowsViewModel");
                    }
                    C36341k9.A19(waFlowsViewModel.A00, true);
                    return true;
                }
                flowsWebBottomSheetContainer.A0i().finish();
                return true;
            case 2:
                Activity activity = (Activity) this.A00;
                if (i != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                activity.finish();
                return true;
            case 3:
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A00;
                if (i == 4 && keyEvent.getAction() == 1) {
                    CallInfo A05 = VoipCallControlBottomSheetV2.A05(voipCallControlBottomSheetV2);
                    if (A05 == null || (!Voip.A0A(A05.callState) && !voipCallControlBottomSheetV2.A0N.A01)) {
                        BottomSheetViewModel bottomSheetViewModel = voipCallControlBottomSheetV2.A0N;
                        if (((bottomSheetViewModel == null || !C36351kA.A1W(bottomSheetViewModel.A0A)) && ((r0 = voipCallControlBottomSheetV2.A0L) == null || r0.A07())) || (A0h = voipCallControlBottomSheetV2.A0h()) == null) {
                            VoipCallControlBottomSheetV2.A08(voipCallControlBottomSheetV2);
                            return true;
                        }
                        A0h.onBackPressed();
                        return true;
                    }
                    VoipCallControlBottomSheetV2.A0B(voipCallControlBottomSheetV2, 1);
                    return true;
                }
                AnonymousClass01I A0h2 = voipCallControlBottomSheetV2.A0h();
                if (A0h2 == null || !(A0h2 instanceof AnonymousClass01L)) {
                    return false;
                }
                return ((AnonymousClass01L) A0h2).dispatchKeyEvent(keyEvent);
            default:
                FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = (FcsBottomSheetBaseContainer) this.A00;
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                FcsBottomSheetBaseContainer.A05(fcsBottomSheetBaseContainer);
                return true;
        }
    }
}
