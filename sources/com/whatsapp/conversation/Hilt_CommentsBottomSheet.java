package com.whatsapp.conversation;

import X.AnonymousClass1N0;
import X.C18800tq;
import X.C18830tt;
import X.C24291Bw;
import X.C25141Fd;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C57402yB;
import X.C58192zT;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentsBottomSheet extends WDSBottomSheetDialogFragment {
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
            CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this;
            C32581dr r5 = (C32581dr) C36391kE.A0U(this);
            C18800tq r3 = r5.A1K;
            C18830tt r4 = r3.A00;
            C36361kB.A1E(r4, commentsBottomSheet);
            commentsBottomSheet.A09 = C36351kA.A0V(r3);
            commentsBottomSheet.A0H = C36341k9.A0V(r3);
            commentsBottomSheet.A02 = C36351kA.A0M(r3);
            commentsBottomSheet.A0L = C36351kA.A0p(r4);
            commentsBottomSheet.A03 = C36351kA.A0N(r3);
            commentsBottomSheet.A0M = C36341k9.A0Z(r3);
            commentsBottomSheet.A0G = C36351kA.A0e(r3);
            commentsBottomSheet.A05 = C36351kA.A0T(r3);
            commentsBottomSheet.A04 = C36341k9.A0R(r3);
            commentsBottomSheet.A08 = C36351kA.A0U(r3);
            commentsBottomSheet.A0B = C36341k9.A0T(r3);
            commentsBottomSheet.A0D = C36371kC.A0Z(r3);
            commentsBottomSheet.A0I = C36361kB.A0a(r3);
            commentsBottomSheet.A0E = C36411kG.A0d(r3);
            commentsBottomSheet.A0K = r3.AIv();
            commentsBottomSheet.A0O = C25141Fd.A00();
            commentsBottomSheet.A0P = C24291Bw.A00();
            commentsBottomSheet.A06 = C36361kB.A0X(r4);
            C27111My r1 = r5.A1I;
            commentsBottomSheet.A00 = (C57402yB) r1.A5K.get();
            commentsBottomSheet.A0J = C36351kA.A0m(r3);
            commentsBottomSheet.A0N = r1.A3Z();
            commentsBottomSheet.A0C = C36371kC.A0X(r3);
            commentsBottomSheet.A01 = (C58192zT) r5.A0a.get();
            commentsBottomSheet.A0F = (AnonymousClass1N0) r4.A3P.get();
            commentsBottomSheet.A0A = C36351kA.A0Y(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.Hilt_CommentsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
