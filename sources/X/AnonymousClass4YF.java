package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4YF  reason: invalid class name */
public class AnonymousClass4YF implements AnonymousClass1NK {
    public Object A00;
    public final int A01;

    public /* synthetic */ void BSm(AnonymousClass11F r1, CallState callState, String str) {
    }

    public AnonymousClass4YF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BSa(C107265Nh r2) {
        switch (this.A01) {
            case 1:
                AnonymousClass2HP.A02((AnonymousClass2HP) this.A00);
                return;
            case 2:
                ((C70803fk) this.A00).A2l.invalidateOptionsMenu();
                return;
            case 3:
                C36371kC.A1O((GroupCallButtonController) this.A00);
                return;
            case 5:
                AnonymousClass3QZ.A01((QuickContactActivity) this.A00);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BSi(C107265Nh r1, boolean z) {
    }

    public /* synthetic */ void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        if (1 - this.A01 == 0) {
            AnonymousClass2HP r2 = (AnonymousClass2HP) this.A00;
            WDSButton wDSButton = r2.A0A;
            if (wDSButton != null) {
                wDSButton.setEnabled(false);
            }
            AnonymousClass2HP.A03(r2);
        }
    }

    public void BSl(C107265Nh r4) {
        switch (this.A01) {
            case 0:
                Log.i("voipnotallowedactivity/onCallStarted finish this activity");
                C36411kG.A1N(this.A00);
                return;
            case 1:
                AnonymousClass2HP.A02((AnonymousClass2HP) this.A00);
                return;
            case 2:
                C70803fk r2 = (C70803fk) this.A00;
                C70803fk.A0n(r2);
                if (r2.A3n.A0E(6989)) {
                    C70803fk.A0b(AnonymousClass1Q8.A00(r4), r2);
                    return;
                }
                return;
            case 3:
                C36371kC.A1O((GroupCallButtonController) this.A00);
                return;
            case 4:
                return;
            default:
                AnonymousClass3QZ.A01((QuickContactActivity) this.A00);
                return;
        }
    }

    public /* synthetic */ void Bgj() {
        switch (this.A01) {
            case 2:
                AnonymousClass4V6 r0 = ((C70803fk) this.A00).A2l;
                AnonymousClass3UR.A03(r0.getContentView(), r0.getMessageAudioPlayerProvider());
                return;
            case 4:
                Log.i("ptvcameraui/onShowingIncomingCallUI");
                AnonymousClass3UB r1 = (AnonymousClass3UB) this.A00;
                LiteCameraView liteCameraView = r1.A04;
                if ((liteCameraView != null && liteCameraView.BMx()) || C36351kA.A1W(r1.A0l)) {
                    AnonymousClass3UB.A06(r1, false, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
