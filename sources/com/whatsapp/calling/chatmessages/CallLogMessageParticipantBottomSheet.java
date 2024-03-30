package com.whatsapp.calling.chatmessages;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass13J;
import X.AnonymousClass4F0;
import X.AnonymousClass4F1;
import X.AnonymousClass4F2;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C019308f;
import X.C18800tq;
import X.C19610wE;
import X.C20810yC;
import X.C24801Dv;
import X.C34681hT;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C40431vX;
import X.C58142zO;
import X.C831648i;
import X.C831748j;
import X.C831848k;
import X.C85774Ij;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class CallLogMessageParticipantBottomSheet extends Hilt_CallLogMessageParticipantBottomSheet {
    public C24801Dv A00;
    public C58142zO A01;
    public C40431vX A02;
    public C20810yC A03;
    public AnonymousClass13J A04;
    public final AnonymousClass00T A05;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        if (C001400p.A00(C000800j.NONE, new AnonymousClass4F0(this)).getValue() != null) {
            C20810yC r1 = this.A03;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (this.A04 == null) {
                throw C36331k8.A0d("systemFeatures");
            } else if (C34681hT.A0K(r1)) {
                C58142zO r0 = this.A01;
                if (r0 != null) {
                    C85774Ij r4 = new C85774Ij(this);
                    C18800tq r12 = r0.A00.A02;
                    this.A02 = new C40431vX(C19610wE.A00(r12.AfJ), C36361kB.A0V(r12), C36351kA.A0T(r12), r4);
                    View A0L = C36381kD.A0L(view, R.id.recycler_view_stub);
                    AnonymousClass00C.A0E(A0L, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    RecyclerView recyclerView = (RecyclerView) A0L;
                    C40431vX r02 = this.A02;
                    if (r02 == null) {
                        throw C36331k8.A0d("participantAdapter");
                    }
                    recyclerView.setAdapter(r02);
                    C36441kJ.A0S(view, R.id.recycler_view_divider_stub).inflate();
                    C36341k9.A0q(A0a(), C012005e.A02(view, R.id.start_call_button), R.color.f6nameremoved);
                    return;
                }
                throw C36331k8.A0d("adapterFactory");
            }
        }
        Log.e("CallLogMessageParticipantBottomSheet/onViewCreated abprops not enabled");
        A1c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.A0A != 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r6) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onDismiss(r6)
            X.00T r0 = r5.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r4 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel) r4
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0056
            boolean r0 = r4.A04
            r3 = 1
            if (r0 == 0) goto L_0x0024
            X.5Nh r0 = r4.A00
            if (r0 == 0) goto L_0x0024
            X.C107265Nh.A01(r0)
            int r0 = r0.A0A
            r2 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            X.5Nh r0 = r4.A00
            if (r0 == 0) goto L_0x0057
            int r0 = r0.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            if (r1 == 0) goto L_0x0057
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x003f
            r0 = 4
            if (r1 == r0) goto L_0x003f
            if (r1 == r3) goto L_0x003f
            if (r1 != 0) goto L_0x0057
        L_0x003f:
            if (r2 != 0) goto L_0x0045
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0057
        L_0x0045:
            r3 = 7
        L_0x0046:
            r2 = 0
            boolean r1 = r4.A03
            boolean r0 = r4.A02
            X.2Qk r1 = X.AnonymousClass3UD.A03(r2, r3, r1, r0)
            X.6Mm r0 = r4.A08
            X.0yW r0 = r0.A00
            r0.Bly(r1)
        L_0x0056:
            return
        L_0x0057:
            r3 = 8
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet.onDismiss(android.content.DialogInterface):void");
    }

    public CallLogMessageParticipantBottomSheet() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C831748j(new C831648i(this)));
        C019308f A1A = C36441kJ.A1A(CallLogMessageParticipantBottomSheetViewModel.class);
        this.A05 = C36441kJ.A0a(new C831848k(A002), new AnonymousClass4F2(this, A002), new AnonymousClass4F1(A002), A1A);
    }
}
