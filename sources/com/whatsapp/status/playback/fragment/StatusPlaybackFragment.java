package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass3LC;
import X.C36321k7;
import X.C36381kD;
import X.C47592fB;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.whatsapp.jid.UserJid;

public abstract class StatusPlaybackFragment extends Hilt_StatusPlaybackFragment {
    public boolean A00;
    public final Rect A01 = AnonymousClass001.A06();

    public String A1Z() {
        UserJid userJid = ((StatusPlaybackContactFragment) this).A0R;
        if (userJid != null) {
            return userJid.getRawString();
        }
        throw C36381kD.A0k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r4.A0r != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1a() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            X.00v r0 = r4.A0w
            java.util.LinkedHashMap r0 = r0.A06()
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r0)
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r2 = r3.next()
            X.3LC r2 = (X.AnonymousClass3LC) r2
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0022
            boolean r1 = r4.A0r
            r0 = 0
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r2.A02 = r0
            X.2fB r2 = (X.C47592fB) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x002f
            r2.A0G()
            goto L_0x000d
        L_0x002f:
            r2.A0H()
            goto L_0x000d
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackFragment.A1a():void");
    }

    public void A1b() {
        this.A00 = true;
        C36321k7.A1K(this, "StatusPlaybackFragment/onViewActive ", AnonymousClass000.A0u());
    }

    public void A1c() {
        this.A00 = false;
        C36321k7.A1K(this, "StatusPlaybackFragment/onViewInactive ", AnonymousClass000.A0u());
    }

    public void A1d(int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A0n == null) {
            statusPlaybackContactFragment.A01 = i;
            return;
        }
        AnonymousClass3LC A05 = StatusPlaybackContactFragment.A05(statusPlaybackContactFragment);
        if (A05 != null && (!A05.A05)) {
            C47592fB r1 = (C47592fB) A05;
            r1.A05 = true;
            r1.A0M(i, r1.A07);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        C36321k7.A1K(this, "StatusPlaybackFragment/onConfigurationChanged ", AnonymousClass000.A0u());
    }

    public void A1e(Rect rect) {
        this.A01.set(rect);
    }

    public void A1H() {
        super.A1H();
        C36321k7.A1K(this, "StatusPlaybackFragment/onDestroy ", AnonymousClass000.A0u());
    }

    public void A1K() {
        super.A1K();
        C36321k7.A1K(this, "StatusPlaybackFragment/onPause ", AnonymousClass000.A0u());
    }

    public void A1L() {
        super.A1L();
        C36321k7.A1K(this, "StatusPlaybackFragment/onResume ", AnonymousClass000.A0u());
    }
}
