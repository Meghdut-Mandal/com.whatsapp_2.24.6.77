package com.whatsapp.status.audienceselector;

import X.AnonymousClass164;
import X.AnonymousClass16E;
import X.AnonymousClass3Bu;
import X.AnonymousClass3MU;
import X.AnonymousClass8TT;
import X.C144576sT;
import X.C20800yB;
import X.C21000yV;
import X.C29731Xt;
import java.util.Set;

public class StatusRecipientsActivity extends AnonymousClass8TT {
    public AnonymousClass3Bu A00;
    public AnonymousClass164 A01;
    public C144576sT A02;
    public AnonymousClass16E A03;
    public C29731Xt A04;

    public final boolean A3n() {
        if (!C20800yB.A01(C21000yV.A01, this.A0D, 2611) || !this.A0K || this.A0S.size() != this.A0J.size()) {
            return false;
        }
        this.A05.A0E("You cannot exclude everyone", 1);
        return true;
    }

    public void A3m() {
        super.A3m();
        if (!this.A0K) {
            Set set = this.A0S;
            if (set.size() == 0 && this.A0M.getVisibility() == 0) {
                AnonymousClass3MU.A01(this.A0M, false, true);
            } else if (set.size() != 0 && this.A0M.getVisibility() == 4) {
                AnonymousClass3MU.A01(this.A0M, true, true);
            }
        }
    }
}
