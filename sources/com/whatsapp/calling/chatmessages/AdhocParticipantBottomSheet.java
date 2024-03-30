package com.whatsapp.calling.chatmessages;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass13J;
import X.AnonymousClass3UD;
import X.AnonymousClass3UE;
import X.AnonymousClass4NO;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C107265Nh;
import X.C18800tq;
import X.C19610wE;
import X.C20810yC;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C40421vW;
import X.C58132zN;
import X.C831048c;
import X.C831148d;
import X.C831248e;
import X.C84884Ey;
import X.C84894Ez;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.MaxHeightLinearLayout;

public class AdhocParticipantBottomSheet extends Hilt_AdhocParticipantBottomSheet {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public C24801Dv A03;
    public C58132zN A04;
    public TextEmojiLabel A05;
    public C40421vW A06;
    public C20810yC A07;
    public AnonymousClass13J A08;
    public MaxHeightLinearLayout A09;
    public final AnonymousClass00T A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (X.C34681hT.A0R(r0, false) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r5, android.view.View r6) {
        /*
            r4 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r6, r3)
            super.A1S(r5, r6)
            X.00j r1 = X.C000800j.NONE
            X.4Ex r0 = new X.4Ex
            r0.<init>(r4)
            X.00T r1 = X.C001400p.A00(r1, r0)
            java.lang.String r0 = "is_from_call_log"
            X.00T r2 = X.AnonymousClass3TE.A03(r4, r0, r3)
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x003c
            X.0yC r1 = r4.A07
            if (r1 == 0) goto L_0x0072
            X.13J r0 = r4.A08
            if (r0 == 0) goto L_0x006b
            boolean r0 = X.C34681hT.A0K(r1)
            if (r0 == 0) goto L_0x003c
            boolean r0 = X.C36331k8.A1b(r2)
            if (r0 == 0) goto L_0x005a
            X.0yC r0 = r4.A07
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.C34681hT.A0R(r0, r3)
            if (r0 != 0) goto L_0x005a
        L_0x003c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            boolean r0 = r4 instanceof com.whatsapp.calling.callconfirmationsheet.ui.AdhocCallConfirmationSheet
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "AdhocCallConfirmationSheet"
        L_0x0046:
            r1.append(r0)
            java.lang.String r0 = " onViewCreated callLogKey is null or abprops not enabled"
            X.C36321k7.A1Z(r1, r0)
            r4.A1c()
            return
        L_0x0052:
            java.lang.String r0 = "AdhocParticipantBottomSheet"
            goto L_0x0046
        L_0x0055:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x005a:
            r4.A1m(r6)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.C36411kG.A0T(r4)
            r1 = 0
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1 r0 = new com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1
            r0.<init>(r4, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x006b:
            java.lang.String r0 = "systemFeatures"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0072:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1m(View view) {
        this.A09 = (MaxHeightLinearLayout) view;
        A05();
        C58132zN r0 = this.A04;
        if (r0 != null) {
            AnonymousClass4NO r4 = new AnonymousClass4NO(this);
            C18800tq r1 = r0.A00.A02;
            this.A06 = new C40421vW(C19610wE.A00(r1.AfJ), C36361kB.A0V(r1), C36351kA.A0T(r1), r4);
            RecyclerView A0c = C36441kJ.A0c(view, R.id.adhoc_recycler_view);
            C40421vW r02 = this.A06;
            if (r02 == null) {
                throw C36331k8.A0Y();
            }
            A0c.setAdapter(r02);
            this.A01 = C36391kE.A0O(view, R.id.start_audio_call_button);
            this.A02 = C36391kE.A0O(view, R.id.start_video_call_button);
            this.A00 = C36391kE.A0O(view, R.id.title);
            this.A05 = C36401kF.A0O(view, R.id.description);
            TextView textView = this.A01;
            if (textView != null) {
                C36361kB.A17(textView, this, 48);
            }
            TextView textView2 = this.A02;
            if (textView2 != null) {
                C36361kB.A17(textView2, this, 49);
                return;
            }
            return;
        }
        throw C36331k8.A0d("adapterFactory");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A05();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        int i;
        Integer valueOf;
        int intValue;
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = (AdhocParticipantBottomSheetViewModel) this.A0A.getValue();
        if (!adhocParticipantBottomSheetViewModel.A01) {
            C107265Nh r0 = adhocParticipantBottomSheetViewModel.A00;
            if (r0 == null || (valueOf = Integer.valueOf(r0.A07)) == null || !((intValue = valueOf.intValue()) == 2 || intValue == 4 || intValue == 1 || intValue == 0)) {
                i = 8;
            } else {
                i = 7;
            }
            adhocParticipantBottomSheetViewModel.A06.A00.Bly(AnonymousClass3UD.A03((String) null, i, adhocParticipantBottomSheetViewModel.A02, adhocParticipantBottomSheetViewModel.A01));
        }
    }

    public AdhocParticipantBottomSheet() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C831148d(new C831048c(this)));
        C019308f A1A = C36441kJ.A1A(AdhocParticipantBottomSheetViewModel.class);
        this.A0A = C36441kJ.A0a(new C831248e(A002), new C84894Ez(this, A002), new C84884Ey(A002), A1A);
    }

    private final void A05() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            float f = 0.85f;
            if (C36341k9.A04(A0a()) == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A09;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) AnonymousClass3UE.A00(A0h)) * f));
            }
        }
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A09 = null;
    }
}
