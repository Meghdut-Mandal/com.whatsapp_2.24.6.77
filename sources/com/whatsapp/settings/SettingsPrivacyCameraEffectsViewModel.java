package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass04R;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4UN;
import X.C005502l;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C109325Xd;
import X.C1258761r;
import X.C132016Ru;
import X.C188448zb;
import X.C28201Rs;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C61693Db;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class SettingsPrivacyCameraEffectsViewModel extends AnonymousClass04R implements AnonymousClass4UN {
    public C007403e A00;
    public boolean A01;
    public final ArEffectsFlmConsentManager A02;
    public final C1258761r A03;
    public final C132016Ru A04;
    public final C34831hi A05 = C36441kJ.A0s(true);
    public final C34831hi A06 = C36441kJ.A0s(C36381kD.A0j());
    public final C28201Rs A07 = C36441kJ.A0t();
    public final C28201Rs A08 = C36441kJ.A0t();
    public final C005502l A09;
    public final C61693Db A0A;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                ArEffectsFlmConsentManager arEffectsFlmConsentManager = SettingsPrivacyCameraEffectsViewModel.this.A02;
                this.label = 1;
                if (arEffectsFlmConsentManager.A03(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            SettingsPrivacyCameraEffectsViewModel.A01(SettingsPrivacyCameraEffectsViewModel.this);
            return AnonymousClass0AJ.A00;
        }
    }

    public SettingsPrivacyCameraEffectsViewModel(ArEffectsFlmConsentManager arEffectsFlmConsentManager, C61693Db r5, C1258761r r6, C132016Ru r7, C005502l r8) {
        C36321k7.A17(arEffectsFlmConsentManager, r6, r8, 3);
        this.A04 = r7;
        this.A0A = r5;
        this.A02 = arEffectsFlmConsentManager;
        this.A03 = r6;
        this.A09 = r8;
        C36331k8.A1T(new AnonymousClass1((C023509x) null), C109325Xd.A00(this));
    }

    public static final void A01(SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel) {
        C36341k9.A18(settingsPrivacyCameraEffectsViewModel.A05, settingsPrivacyCameraEffectsViewModel.A0A.A00());
        C36341k9.A18(settingsPrivacyCameraEffectsViewModel.A06, C36341k9.A1Z(settingsPrivacyCameraEffectsViewModel.A02.A00));
    }

    public C188448zb BBy() {
        return this.A02.A01();
    }

    public void BY9(AnonymousClass00S r4, AnonymousClass00S r5) {
        if (AnonymousClass000.A1X(C36401kF.A0m(this.A06))) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFlmConsentBottomSheetPrimaryButtonClicked isSwitchChecked is expected to be false but is true");
        }
        if (C36341k9.A1Z(this.A02.A00)) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFlmConsentBottomSheetPrimaryButtonClicked Camera effects on calls are already enabled");
            r4.invoke();
            return;
        }
        this.A00 = C36391kE.A12(new SettingsPrivacyCameraEffectsViewModel$onFlmConsentBottomSheetPrimaryButtonClicked$1(this, (C023509x) null, r4, r5), C109325Xd.A00(this));
    }

    public void BYA(AnonymousClass00S r4, AnonymousClass00S r5) {
        if (AnonymousClass000.A1X(C36401kF.A0m(this.A06))) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFlmConsentBottomSheetSecondaryButtonClicked isSwitchChecked is expected to be false but is true");
        }
        if (C36341k9.A1Z(this.A02.A00)) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFlmConsentBottomSheetSecondaryButtonClicked Camera effects on calls are already enabled");
        }
        this.A00 = C36391kE.A12(new SettingsPrivacyCameraEffectsViewModel$onFlmConsentBottomSheetSecondaryButtonClicked$1(this, (C023509x) null, r4, r5), C109325Xd.A00(this));
    }

    public void BY8() {
        C36331k8.A1T(new SettingsPrivacyCameraEffectsViewModel$onFlmConsentBottomSheetDismissed$1(this, (C023509x) null), C109325Xd.A00(this));
    }
}
