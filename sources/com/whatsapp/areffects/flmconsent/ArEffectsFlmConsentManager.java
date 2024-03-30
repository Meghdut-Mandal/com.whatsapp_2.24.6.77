package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass00T;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.AnonymousClass17Z;
import X.AnonymousClass9H7;
import X.AnonymousClass9H8;
import X.AnonymousClass9H9;
import X.C023509x;
import X.C188448zb;
import X.C20810yC;
import X.C36331k8;
import X.C36371kC;
import android.content.SharedPreferences;

public final class ArEffectsFlmConsentManager {
    public Boolean A00;
    public final AnonymousClass9H7 A01;
    public final AnonymousClass9H8 A02;
    public final AnonymousClass9H9 A03;
    public final AnonymousClass17Z A04;
    public final C20810yC A05;

    public ArEffectsFlmConsentManager(AnonymousClass9H7 r2, AnonymousClass9H8 r3, AnonymousClass9H9 r4, AnonymousClass17Z r5, C20810yC r6) {
        C36331k8.A1G(r6, 1, r5);
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C21924Acy
            if (r0 == 0) goto L_0x0063
            r7 = r9
            X.Acy r7 = (X.C21924Acy) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r2 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r0 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r0) goto L_0x006e
            java.lang.Object r8 = r7.L$0
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r8 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r8
            X.AnonymousClass0AN.A00(r2)
        L_0x0024:
            X.95x r2 = (X.C1898695x) r2
            boolean r0 = r2 instanceof X.AnonymousClass8UT
            if (r0 == 0) goto L_0x0033
            X.8UT r2 = (X.AnonymousClass8UT) r2
            java.lang.Boolean r0 = r2.A00
        L_0x002e:
            r8.A00 = r0
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0033:
            boolean r0 = r2 instanceof X.AnonymousClass8US
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "ArEffectsFlmConsentManager/refreshConsentResultForUSConsentType Error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x002e
        L_0x003e:
            X.AnonymousClass0AN.A00(r2)
            X.9H8 r5 = r8.A02
            r7.L$0 = r8
            r7.label = r0
            X.19A r0 = r5.A00
            java.lang.String r4 = r0.A09()
            r0 = 9
            X.8vG r3 = new X.8vG
            r3.<init>((java.lang.String) r4, (int) r0)
            X.02l r2 = r5.A01
            r1 = 0
            com.whatsapp.areffects.flmconsent.protocol.GetFlmConsentResultProtocol$sendRequest$2 r0 = new com.whatsapp.areffects.flmconsent.protocol.GetFlmConsentResultProtocol$sendRequest$2
            r0.<init>(r5, r3, r4, r1)
            java.lang.Object r2 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r2 != r6) goto L_0x0024
            return r6
        L_0x0063:
            X.Acy r7 = new X.Acy
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x0069:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager.A00(com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager, X.09x):java.lang.Object");
    }

    public final C188448zb A01() {
        int A07 = this.A05.A07(3221);
        for (C188448zb r1 : C188448zb.A00) {
            if (r1.abPropsValue == A07) {
                return r1;
            }
        }
        return C188448zb.DISABLED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Boolean r10, X.C023509x r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C21935AdE
            if (r0 == 0) goto L_0x00e7
            r6 = r11
            X.AdE r6 = (X.C21935AdE) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r3 = r6.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 == r0) goto L_0x004c
            if (r1 != r2) goto L_0x00ee
            java.lang.Object r10 = r6.L$1
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r5 = r6.L$0
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r5 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r5
            X.AnonymousClass0AN.A00(r3)
        L_0x002b:
            X.95y r3 = (X.C1898795y) r3
            X.8UV r0 = X.AnonymousClass8UV.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 != 0) goto L_0x0092
            boolean r0 = r3 instanceof X.AnonymousClass8UU
            if (r0 == 0) goto L_0x0061
            X.8UU r3 = (X.AnonymousClass8UU) r3
            int r2 = r3.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error when setting FLM consent: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x004c:
            java.lang.Object r10 = r6.L$1
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r5 = r6.L$0
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r5 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r5
            X.AnonymousClass0AN.A00(r3)
            goto L_0x0075
        L_0x0058:
            X.AnonymousClass0AN.A00(r3)
            if (r10 != 0) goto L_0x0064
            java.lang.Boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0064
        L_0x0061:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0064:
            java.lang.Boolean r0 = r9.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            if (r0 != 0) goto L_0x0061
            X.8zb r1 = r9.A01()
            X.8zb r0 = X.C188448zb.DISABLED
            if (r1 == r0) goto L_0x0061
            r5 = r9
        L_0x0075:
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.8zb r1 = r5.A01()
            X.8zb r0 = X.C188448zb.US
            if (r1 == r0) goto L_0x00a2
            X.9H7 r0 = r5.A01
            java.lang.String r2 = "pref_flm_consent_result"
            X.00T r0 = r0.A01
            if (r10 != 0) goto L_0x0095
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r0)
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
        L_0x008f:
            r0.apply()
        L_0x0092:
            r5.A00 = r10
            goto L_0x0061
        L_0x0095:
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            boolean r0 = r10.booleanValue()
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r2, r0)
            goto L_0x008f
        L_0x00a2:
            X.9H9 r4 = r5.A03
            r6.L$0 = r5
            r6.L$1 = r10
            r6.label = r2
            X.19A r0 = r4.A00
            java.lang.String r3 = r0.A09()
            if (r10 != 0) goto L_0x00cd
            r0 = 0
        L_0x00b4:
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            X.8vG r8 = new X.8vG
            r8.<init>((java.lang.String) r3, (java.lang.Long) r2)
            X.02l r2 = r4.A01
            r1 = 0
            com.whatsapp.areffects.flmconsent.protocol.SetFlmConsentResultProtocol$sendRequest$2 r0 = new com.whatsapp.areffects.flmconsent.protocol.SetFlmConsentResultProtocol$sendRequest$2
            r0.<init>(r4, r8, r3, r1)
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r3 != r7) goto L_0x002b
            return r7
        L_0x00cd:
            java.lang.Boolean r0 = X.C36371kC.A0m()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00da
            r0 = 1
            goto L_0x00b4
        L_0x00da:
            java.lang.Boolean r0 = X.C36381kD.A0j()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f3
            r0 = 2
            goto L_0x00b4
        L_0x00e7:
            X.AdE r6 = new X.AdE
            r6.<init>(r9, r11)
            goto L_0x0012
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00f3:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager.A02(java.lang.Boolean, X.09x):java.lang.Object");
    }

    public final Object A03(C023509x r4) {
        Boolean valueOf;
        Object A002;
        int ordinal = A01().ordinal();
        if (ordinal == 1 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            AnonymousClass00T r2 = this.A01.A01;
            if (!((SharedPreferences) r2.getValue()).contains("pref_flm_consent_result")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(C36371kC.A1U((SharedPreferences) r2.getValue(), "pref_flm_consent_result"));
            }
            this.A00 = valueOf;
        } else if (ordinal == 2 && (A002 = A00(this, r4)) == AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return A002;
        }
        return AnonymousClass0AJ.A00;
    }
}
