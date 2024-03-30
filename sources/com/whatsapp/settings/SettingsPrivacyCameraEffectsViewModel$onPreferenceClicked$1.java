package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C132016Ru;
import X.C36341k9;
import X.C36381kD;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {0}, l = {95}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SettingsPrivacyCameraEffectsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                C132016Ru.A00(SettingsPrivacyCameraEffectsViewModel.this.A04, C132016Ru.A02);
                C132016Ru.A00(SettingsPrivacyCameraEffectsViewModel.this.A04, C132016Ru.A01);
                SettingsPrivacyCameraEffectsViewModel.this.A03.A00();
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1(SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = settingsPrivacyCameraEffectsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 = new SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1(this.this$0, r4);
        settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1.L$0 = obj;
        return settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass040 r4;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r4 = (AnonymousClass040) this.L$0;
            SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel = this.this$0;
            settingsPrivacyCameraEffectsViewModel.A01 = true;
            try {
                ArEffectsFlmConsentManager arEffectsFlmConsentManager = settingsPrivacyCameraEffectsViewModel.A02;
                this.L$0 = r4;
                this.label = 1;
                if (arEffectsFlmConsentManager.A02(false, this) == r3) {
                    return r3;
                }
            } catch (IOException unused) {
                SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel2 = this.this$0;
                settingsPrivacyCameraEffectsViewModel2.A01 = false;
                settingsPrivacyCameraEffectsViewModel2.A08.A0D((Object) null);
            }
        } else if (i == 1) {
            r4 = (AnonymousClass040) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        final SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel3 = this.this$0;
        C36381kD.A1R(settingsPrivacyCameraEffectsViewModel3.A09, new AnonymousClass1((C023509x) null), r4);
        SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel4 = this.this$0;
        settingsPrivacyCameraEffectsViewModel4.A01 = false;
        C36341k9.A18(settingsPrivacyCameraEffectsViewModel4.A06, false);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
