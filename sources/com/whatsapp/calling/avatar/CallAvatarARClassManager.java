package com.whatsapp.calling.avatar;

import X.AnonymousClass040;
import X.C023509x;
import X.C1258761r;
import X.C19710wO;
import X.C19970wo;
import X.C36321k7;
import X.C36331k8;
import com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository;
import java.util.concurrent.TimeUnit;

public final class CallAvatarARClassManager implements C19710wO {
    public static final long A05 = TimeUnit.DAYS.toMillis(7);
    public int A00;
    public final C1258761r A01;
    public final PersonalizedAvatarRepository A02;
    public final C19970wo A03;
    public final AnonymousClass040 A04;

    public String BIB() {
        return "CallAvatarARClassManager";
    }

    public /* synthetic */ void BRL() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C023509x r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.AnonymousClass7AZ
            if (r0 == 0) goto L_0x0026
            r5 = r10
            X.7AZ r5 = (X.AnonymousClass7AZ) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r8 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r8) goto L_0x002c
            java.lang.Object r1 = r5.L$1
            com.whatsapp.calling.avatar.CallAvatarARClassManager r1 = (com.whatsapp.calling.avatar.CallAvatarARClassManager) r1
            java.lang.Object r5 = r5.L$0
            com.whatsapp.calling.avatar.CallAvatarARClassManager r5 = (com.whatsapp.calling.avatar.CallAvatarARClassManager) r5
            goto L_0x0081
        L_0x0026:
            X.7AZ r5 = new X.7AZ
            r5.<init>(r9, r10)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0031:
            X.AnonymousClass0AN.A00(r2)
            X.61r r0 = r9.A01
            X.00T r7 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r7)
            java.lang.String r0 = "pref_last_ar_class_refresh_time"
            long r1 = X.C36341k9.A0B(r1, r0)
            X.0wo r0 = r9.A03
            long r3 = X.C19970wo.A00(r0)
            long r3 = r3 - r1
            long r1 = A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r7)
            java.lang.String r0 = "pref_ar_class"
            int r2 = X.C36371kC.A01(r1, r0)
            r9.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass AR class retrieved from cache: "
            X.C36321k7.A1T(r0, r1, r2)
        L_0x0064:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0067:
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r3 = r9.A02     // Catch:{ 5UX -> 0x00b7 }
            r5.L$0 = r9     // Catch:{ 5UX -> 0x00b7 }
            r5.L$1 = r9     // Catch:{ 5UX -> 0x00b7 }
            r5.label = r8     // Catch:{ 5UX -> 0x00b7 }
            X.02l r2 = r3.A03     // Catch:{ 5UX -> 0x00b7 }
            r1 = 0
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2 r0 = new com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2     // Catch:{ 5UX -> 0x00b7 }
            r0.<init>(r3, r1)     // Catch:{ 5UX -> 0x00b7 }
            java.lang.Object r2 = X.AnonymousClass0A2.A00(r5, r2, r0)     // Catch:{ 5UX -> 0x00b7 }
            if (r2 != r6) goto L_0x007e
            goto L_0x00be
        L_0x007e:
            r5 = r9
            r1 = r9
            goto L_0x0084
        L_0x0081:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ 5UX -> 0x00b7 }
        L_0x0084:
            int r0 = X.AnonymousClass000.A0I(r2)     // Catch:{ 5UX -> 0x00b7 }
            r1.A00 = r0     // Catch:{ 5UX -> 0x00b7 }
            X.61r r0 = r5.A01     // Catch:{ 5UX -> 0x00b7 }
            int r2 = r5.A00     // Catch:{ 5UX -> 0x00b7 }
            X.00T r4 = r0.A01     // Catch:{ 5UX -> 0x00b7 }
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r4)     // Catch:{ 5UX -> 0x00b7 }
            java.lang.String r0 = "pref_ar_class"
            X.C36341k9.A0v(r1, r0, r2)     // Catch:{ 5UX -> 0x00b7 }
            X.0wo r0 = r5.A03     // Catch:{ 5UX -> 0x00b7 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ 5UX -> 0x00b7 }
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r4)     // Catch:{ 5UX -> 0x00b7 }
            java.lang.String r0 = "pref_last_ar_class_refresh_time"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ 5UX -> 0x00b7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UX -> 0x00b7 }
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass AR class re-fetched: "
            r1.append(r0)     // Catch:{ 5UX -> 0x00b7 }
            int r0 = r5.A00     // Catch:{ 5UX -> 0x00b7 }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ 5UX -> 0x00b7 }
            goto L_0x0064
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass Failed to fetch AR class"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0064
        L_0x00be:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.CallAvatarARClassManager.A00(X.09x):java.lang.Object");
    }

    public void BRM() {
        C36331k8.A1T(new CallAvatarARClassManager$onAsyncInitUserRegisteredAndDbReady$1(this, (C023509x) null), this.A04);
    }

    public CallAvatarARClassManager(C1258761r r1, PersonalizedAvatarRepository personalizedAvatarRepository, C19970wo r3, AnonymousClass040 r4) {
        C36321k7.A11(r3, r4, r1);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = personalizedAvatarRepository;
    }
}
