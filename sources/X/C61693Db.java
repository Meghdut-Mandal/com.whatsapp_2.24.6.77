package X;

import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;

/* renamed from: X.3Db  reason: invalid class name and case insensitive filesystem */
public final class C61693Db {
    public final C20810yC A00;
    public final C19730wQ A01;
    public final ArEffectsFlmConsentManager A02;

    public final boolean A00() {
        ArEffectsFlmConsentManager arEffectsFlmConsentManager = this.A02;
        if ((arEffectsFlmConsentManager.A01() == C188448zb.DOGFOODING || arEffectsFlmConsentManager.A01() == C188448zb.US) && !this.A01.A0L() && this.A00.A0E(1756)) {
            return true;
        }
        return false;
    }

    public C61693Db(C19730wQ r1, ArEffectsFlmConsentManager arEffectsFlmConsentManager, C20810yC r3) {
        C36321k7.A11(r3, r1, arEffectsFlmConsentManager);
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = arEffectsFlmConsentManager;
    }
}
