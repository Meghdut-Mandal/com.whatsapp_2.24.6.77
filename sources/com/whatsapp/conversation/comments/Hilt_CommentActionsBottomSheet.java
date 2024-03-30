package com.whatsapp.conversation.comments;

import X.AnonymousClass17V;
import X.AnonymousClass1AW;
import X.AnonymousClass1EO;
import X.AnonymousClass3O0;
import X.C18800tq;
import X.C18830tt;
import X.C24291Bw;
import X.C25141Fd;
import X.C25791Hr;
import X.C28371Sj;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentActionsBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            CommentActionsBottomSheet commentActionsBottomSheet = (CommentActionsBottomSheet) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r3 = r2.A00;
            C36361kB.A1E(r3, commentActionsBottomSheet);
            commentActionsBottomSheet.A0E = C36351kA.A0V(r2);
            commentActionsBottomSheet.A0N = C36341k9.A0V(r2);
            commentActionsBottomSheet.A01 = C36351kA.A0M(r2);
            commentActionsBottomSheet.A0S = (C28371Sj) r2.A4r.get();
            commentActionsBottomSheet.A06 = C36351kA.A0N(r2);
            commentActionsBottomSheet.A0Z = C36341k9.A0Z(r2);
            commentActionsBottomSheet.A0H = C36351kA.A0a(r2);
            commentActionsBottomSheet.A0O = C36351kA.A0g(r2);
            commentActionsBottomSheet.A0M = C36351kA.A0e(r2);
            commentActionsBottomSheet.A07 = C36361kB.A0T(r2);
            commentActionsBottomSheet.A0D = C36351kA.A0U(r2);
            commentActionsBottomSheet.A09 = C36341k9.A0R(r2);
            commentActionsBottomSheet.A0L = C36431kI.A0b(r2);
            commentActionsBottomSheet.A0B = C36341k9.A0S(r2);
            commentActionsBottomSheet.A0G = C36341k9.A0T(r2);
            commentActionsBottomSheet.A0Y = C36351kA.A0n(r2);
            commentActionsBottomSheet.A0J = C36411kG.A0d(r2);
            commentActionsBottomSheet.A0C = C36401kF.A0U(r2);
            commentActionsBottomSheet.A0Q = C36381kD.A0d(r2);
            commentActionsBottomSheet.A08 = (C25791Hr) r2.A0s.get();
            commentActionsBottomSheet.A0R = C36361kB.A0b(r2);
            commentActionsBottomSheet.A0P = (AnonymousClass17V) r2.Aea.get();
            commentActionsBottomSheet.A0A = C36371kC.A0U(r2);
            commentActionsBottomSheet.A0F = C36351kA.A0Y(r2);
            commentActionsBottomSheet.A00 = C36381kD.A0Q(r2.A0y);
            commentActionsBottomSheet.A0K = C36381kD.A0a(r2);
            commentActionsBottomSheet.A0a = C25141Fd.A00();
            commentActionsBottomSheet.A0b = C24291Bw.A00();
            commentActionsBottomSheet.A0I = C36351kA.A0b(r2);
            commentActionsBottomSheet.A0U = C36351kA.A0m(r2);
            commentActionsBottomSheet.A0T = (AnonymousClass3O0) r3.A9s.get();
            commentActionsBottomSheet.A0W = (AnonymousClass1AW) r2.A4H.get();
            commentActionsBottomSheet.A0X = (AnonymousClass1EO) r2.A4I.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A03()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.comments.Hilt_CommentActionsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
