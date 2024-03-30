package com.whatsapp.calling.controls.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass0QD;
import X.AnonymousClass1PZ;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass6EE;
import X.AnonymousClass6OZ;
import X.AnonymousClass6YM;
import X.AnonymousClass711;
import X.AnonymousClass72j;
import X.AnonymousClass74U;
import X.AnonymousClass74X;
import X.AnonymousClass74Y;
import X.AnonymousClass7OF;
import X.C000800j;
import X.C011304x;
import X.C012005e;
import X.C023509x;
import X.C05250Oz;
import X.C1029552r;
import X.C1029652s;
import X.C107985Rs;
import X.C125355zm;
import X.C135456cj;
import X.C144076ra;
import X.C144086rb;
import X.C144096rc;
import X.C144106rd;
import X.C144196rn;
import X.C148816zT;
import X.C1501574e;
import X.C16250or;
import X.C16260os;
import X.C163647qX;
import X.C164677sC;
import X.C18700tb;
import X.C27851Qb;
import X.C27861Qc;
import X.C33311f5;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90504aG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.calling.wds.CallingMediaWDSButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class CallControlCard extends ConstraintLayout implements C18700tb {
    public C144196rn A00;
    public AnonymousClass1PZ A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final View A04;
    public final CallingMediaWDSButton A05;
    public final CallingMediaWDSButton A06;
    public final CallingMediaWDSButton A07;
    public final CallingMediaWDSButton A08;
    public final WDSButton A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setupOnAttach$lambda$1(CallControlCard callControlCard, View view) {
        AnonymousClass6YM r0;
        AnonymousClass00C.A0D(callControlCard, 0);
        C144196rn callControlStateHolder = callControlCard.getCallControlStateHolder();
        AnonymousClass6OZ r02 = callControlStateHolder.A00;
        if (r02 != null && !r02.A0N && (r0 = callControlStateHolder.A01) != null) {
            C148816zT.A02(r0.A2E, 47);
        }
    }

    public static final void setupOnAttach$lambda$2(CallControlCard callControlCard, View view) {
        AnonymousClass00C.A0D(callControlCard, 0);
        AnonymousClass6YM r2 = callControlCard.getCallControlStateHolder().A01;
        if (r2 != null) {
            AnonymousClass6YM.A0A(r2, (CallInfo) null, (String) null, 1);
        }
        callControlCard.getUserJourneyLogger().A01(C36371kC.A0o(), 24, 16);
    }

    public static final void setupOnAttach$lambda$3(CallControlCard callControlCard, View view) {
        AnonymousClass00C.A0D(callControlCard, 0);
        AnonymousClass6YM r1 = callControlCard.getCallControlStateHolder().A01;
        if (r1 != null) {
            C90504aG.A17(new C1501574e(r1), r1);
        }
        callControlCard.getUserJourneyLogger().A01(C36371kC.A0o(), C36371kC.A00(callControlCard.A08.isSelected() ? 1 : 0), 16);
    }

    public static final void setupOnAttach$lambda$4(CallControlCard callControlCard, View view) {
        AnonymousClass6EE r0;
        AnonymousClass6YM r02;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Runnable runnable;
        AnonymousClass00C.A0D(callControlCard, 0);
        C144196rn callControlStateHolder = callControlCard.getCallControlStateHolder();
        AnonymousClass6OZ r2 = callControlStateHolder.A00;
        if (r2 != null) {
            CallState callState = r2.A09;
            AnonymousClass00C.A07(callState);
            if ((callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) && !r2.A0F && (r0 = r2.A05) != null) {
                int i = r0.A06;
                if (AnonymousClass000.A1S(i, 6)) {
                    callControlStateHolder.A05.A06();
                    AnonymousClass6YM r03 = callControlStateHolder.A01;
                    if (r03 != null) {
                        scheduledThreadPoolExecutor = r03.A1E;
                        runnable = AnonymousClass74Y.A00;
                    }
                } else if (i == 0) {
                    if (C36341k9.A0E(callControlStateHolder.A06).getInt("switch_to_video_call_confirmation_dialog_count", 0) < 5) {
                        callControlStateHolder.A07.A0D(C107985Rs.CALL_UPGRADE_CONFIRMATION);
                    } else {
                        C144196rn.A00(callControlStateHolder);
                    }
                } else if (i == 1) {
                    AnonymousClass711 r1 = callControlStateHolder.A05;
                    UserJid A0S = r1.A03.A0S();
                    if (A0S != null) {
                        AnonymousClass711.A02(r1, A0S);
                    }
                    AnonymousClass6YM r04 = callControlStateHolder.A01;
                    if (r04 != null) {
                        scheduledThreadPoolExecutor = r04.A1E;
                        runnable = AnonymousClass74X.A00;
                    }
                } else if (i == 3 && (r02 = callControlStateHolder.A01) != null) {
                    r02.A0Q(0);
                }
                scheduledThreadPoolExecutor.execute(runnable);
            }
        }
        int i2 = 28;
        if (callControlCard.A06.isSelected()) {
            i2 = 29;
        }
        callControlCard.getUserJourneyLogger().A01(C36371kC.A0o(), i2, 16);
    }

    public static final void setupOnAttach$lambda$5(CallControlCard callControlCard, View view) {
        AnonymousClass00C.A0D(callControlCard, 0);
        AnonymousClass6YM r0 = callControlCard.getCallControlStateHolder().A01;
        if (r0 != null) {
            r0.A0Q(0);
        }
    }

    public static final void setupOnAttach$lambda$8(CallControlCard callControlCard, WDSButtonGroup wDSButtonGroup) {
        AnonymousClass00C.A0D(callControlCard, 0);
        C135456cj.A01(C012005e.A02(callControlCard, R.id.decline_upgrade_button), callControlCard, 4);
        C135456cj.A01(C012005e.A02(callControlCard, R.id.accept_upgrade_button), callControlCard, 1);
    }

    public static final void setupOnAttach$lambda$8$lambda$6(CallControlCard callControlCard, View view) {
        AnonymousClass00C.A0D(callControlCard, 0);
        AnonymousClass6YM r0 = callControlCard.getCallControlStateHolder().A01;
        if (r0 != null) {
            r0.A1E.execute(new AnonymousClass72j(0, 2));
        }
    }

    public static final void setupOnAttach$lambda$8$lambda$7(CallControlCard callControlCard, View view) {
        AnonymousClass00C.A0D(callControlCard, 0);
        AnonymousClass6YM r0 = callControlCard.getCallControlStateHolder().A01;
        if (r0 != null) {
            C90464aC.A14(r0);
            r0.A1E.execute(AnonymousClass74U.A00);
        }
    }

    public final void setCallControlStateHolder(C144196rn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setUserJourneyLogger(AnonymousClass1PZ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public static final void A00(CallControlCard callControlCard) {
        C135456cj.A01(callControlCard.A05, callControlCard, 2);
        C135456cj.A01(callControlCard.A09, callControlCard, 3);
        C135456cj.A01(callControlCard.A08, callControlCard, 5);
        C135456cj.A01(callControlCard.A06, callControlCard, 7);
        callControlCard.getHeaderButtonStubHolder().A05(new C135456cj(callControlCard, 6));
        C164677sC.A00(callControlCard.getAcceptDeclineGroupStubHolder(), callControlCard, 1);
        AnonymousClass012 A002 = AnonymousClass0QD.A00(callControlCard);
        if (A002 != null) {
            C36331k8.A1T(new CallControlCard$setupOnAttach$7(A002, callControlCard, (C023509x) null), C33311f5.A00(A002));
        }
    }

    public static final void A01(CallControlCard callControlCard, C125355zm r6) {
        C16260os r2;
        boolean z = r6 instanceof C1029652s;
        if (z) {
            C1029652s r4 = (C1029652s) r6;
            A02(r4.A00, callControlCard.A05);
            A02(r4.A03, callControlCard.A07);
            A02(r4.A04, callControlCard.A08);
            A02(r4.A01, callControlCard.A06);
            A02(r4.A02, callControlCard.A09);
            callControlCard.getAcceptDeclineGroupStubHolder().A03(8);
        } else if (r6 instanceof C1029552r) {
            callControlCard.A04.setVisibility(8);
            View A012 = callControlCard.getAcceptDeclineGroupStubHolder().A01();
            AnonymousClass00C.A08(A012);
            A012.setVisibility(0);
        }
        if (z) {
            r2 = ((C1029652s) r6).A05;
        } else {
            r2 = ((C1029552r) r6).A01;
        }
        if (r2 instanceof C144106rd) {
            callControlCard.getHeaderTextStubHolder().A03(8);
            callControlCard.getHeaderButtonStubHolder().A03(8);
        } else if (r2 instanceof C144096rc) {
            callControlCard.getHeaderTextStubHolder().A03(0);
            callControlCard.getHeaderButtonStubHolder().A03(0);
            C144096rc r22 = (C144096rc) r2;
            ((TextView) callControlCard.getHeaderTextStubHolder().A01()).setText(C90474aD.A0V(callControlCard, r22.A01));
            C16250or r1 = r22.A00;
            View A013 = callControlCard.getHeaderButtonStubHolder().A01();
            AnonymousClass00C.A08(A013);
            A02(r1, (WDSButton) A013);
        }
    }

    public static final void A02(C16250or r1, WDSButton wDSButton) {
        if (r1 instanceof C144076ra) {
            wDSButton.setVisibility(8);
        } else if (r1 instanceof C144086rb) {
            wDSButton.setVisibility(0);
            C144086rb r12 = (C144086rb) r1;
            wDSButton.setSelected(r12.A01);
            wDSButton.setEnabled(r12.A00);
        }
    }

    private final AnonymousClass1RJ getAcceptDeclineGroupStubHolder() {
        return (AnonymousClass1RJ) this.A0A.getValue();
    }

    private final AnonymousClass1RJ getHeaderButtonStubHolder() {
        return (AnonymousClass1RJ) this.A0B.getValue();
    }

    private final AnonymousClass1RJ getHeaderTextStubHolder() {
        return (AnonymousClass1RJ) this.A0C.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C144196rn getCallControlStateHolder() {
        C144196rn r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callControlStateHolder");
    }

    public final AnonymousClass1PZ getUserJourneyLogger() {
        AnonymousClass1PZ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userJourneyLogger");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A03) {
            this.A03 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A00 = (C144196rn) r1.A0L.A0H.get();
            this.A01 = (AnonymousClass1PZ) r1.A0M.A1L.get();
        }
        C000800j r12 = C000800j.NONE;
        this.A0C = AnonymousClass7OF.A00(this, r12, R.id.header_text_stub);
        this.A0B = AnonymousClass7OF.A00(this, r12, R.id.header_button_stub);
        this.A0A = AnonymousClass7OF.A00(this, r12, R.id.accept_decline_button_group_stub);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A09 = (WDSButton) C36361kB.A0G(this, R.id.end_call_button);
        this.A05 = (CallingMediaWDSButton) C36361kB.A0G(this, R.id.audio_route_button);
        this.A07 = (CallingMediaWDSButton) C36361kB.A0G(this, R.id.more_button);
        this.A08 = (CallingMediaWDSButton) C36361kB.A0G(this, R.id.mute_button);
        this.A06 = (CallingMediaWDSButton) C36361kB.A0G(this, R.id.camera_button);
        this.A04 = C36361kB.A0G(this, R.id.in_call_controls_group);
        if (C011304x.A02(this)) {
            A00(this);
        } else {
            C163647qX.A00(this, 3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallControlCard(Context context, AttributeSet attributeSet, int i, int i2, int i3, C05250Oz r9) {
        this(context, C36381kD.A0I(attributeSet, i3), C36391kE.A01(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }
}
