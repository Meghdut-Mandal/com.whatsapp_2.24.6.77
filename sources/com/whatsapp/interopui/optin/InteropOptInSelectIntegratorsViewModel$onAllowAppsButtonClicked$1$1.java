package com.whatsapp.interopui.optin;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1", f = "InteropOptInSelectIntegratorsViewModel.kt", i = {0, 1, 2}, l = {66, 68, 80}, m = "invokeSuspend", n = {"startTimeMillis", "optInResult", "optInResult"}, s = {"J$0", "L$0", "L$0"})
public final class InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $it;
    public final /* synthetic */ List $selectedIntegratorIds;
    public long J$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ InteropOptInSelectIntegratorsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1(InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel, List list, List list2, C023509x r5) {
        super(2, r5);
        this.this$0 = interopOptInSelectIntegratorsViewModel;
        this.$selectedIntegratorIds = list;
        this.$it = list2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1(this.this$0, this.$selectedIntegratorIds, this.$it, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r9 = 3
            r8 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r3) goto L_0x004c
            if (r0 == r8) goto L_0x0024
            if (r0 != r9) goto L_0x0177
            java.lang.Object r1 = r10.L$0
            X.2tN r1 = (X.C54702tN) r1
            X.AnonymousClass0AN.A00(r11)
        L_0x0016:
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r10.this$0
            X.00s r2 = r0.A07
            X.2Wz r1 = (X.AnonymousClass2Wz) r1
            long r0 = r1.A00
            X.C51772oM.A00(r2, r0)
        L_0x0021:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0024:
            java.lang.Object r0 = r10.L$0
            X.2tN r0 = (X.C54702tN) r0
            X.AnonymousClass0AN.A00(r11)
            goto L_0x006e
        L_0x002c:
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r10.this$0
            long r1 = java.lang.System.currentTimeMillis()
            X.1eG r7 = r0.A09
            java.util.List r6 = r10.$selectedIntegratorIds
            r10.J$0 = r1
            r10.label = r3
            X.02l r4 = r7.A05
            r3 = 0
            com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2
            r0.<init>(r7, r6, r3)
            java.lang.Object r11 = X.AnonymousClass0A2.A00(r10, r4, r0)
            if (r11 != r5) goto L_0x0051
            return r5
        L_0x004c:
            long r1 = r10.J$0
            X.AnonymousClass0AN.A00(r11)
        L_0x0051:
            X.2tN r11 = (X.C54702tN) r11
            boolean r0 = r11 instanceof X.AnonymousClass2X0
            if (r0 == 0) goto L_0x015a
            r10.L$0 = r11
            r10.label = r8
            long r3 = X.C36441kJ.A0A(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006d
            long r1 = r1 - r3
            java.lang.Object r0 = X.C07330Xf.A00(r10, r1)
            if (r0 != r5) goto L_0x006d
            return r5
        L_0x006d:
            r0 = r11
        L_0x006e:
            X.2X0 r0 = (X.AnonymousClass2X0) r0
            java.util.List r6 = r0.A00
            boolean r1 = r6.isEmpty()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r10.this$0
            X.00s r3 = r0.A07
            if (r1 == 0) goto L_0x00a7
            X.2oM r2 = X.C51772oM.FINISH
        L_0x007e:
            r1 = 0
            X.3JA r0 = new X.3JA
            r0.<init>(r2, r1, r1)
            r3.A0C(r0)
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r4 = r10.this$0
            java.util.List r1 = r10.$it
            X.AnonymousClass00C.A07(r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00aa
            r1.next()
            java.lang.String r1 = "integratorInfo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            X.2oM r2 = X.C51772oM.ERROR
            goto L_0x007e
        L_0x00aa:
            java.util.ArrayList r2 = X.C36351kA.A0z(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x00b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r1.next()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.first
            int r0 = X.AnonymousClass000.A0I(r0)
            X.AnonymousClass000.A1F(r2, r0)
            goto L_0x00b2
        L_0x00c8:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e1
            r1.next()
            java.lang.String r1 = "integratorInfo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.util.ArrayList r2 = X.C36351kA.A0z(r3)
            java.util.Iterator r1 = r3.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fa
            r1.next()
            java.lang.String r1 = "integratorInfo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            X.1eL r0 = r4.A0A
            X.00T r0 = r0.A01
            android.content.SharedPreferences$Editor r3 = X.C36351kA.A0A(r0)
            java.util.ArrayList r5 = X.C36351kA.A0z(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x010a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0126
            java.lang.Object r2 = r4.next()
            X.3Xd r2 = (X.C66743Xd) r2
            int r0 = r2.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.A03
            X.011 r0 = X.C36441kJ.A19(r1, r0)
            r5.add(r0)
            goto L_0x010a
        L_0x0126:
            java.util.Map r2 = X.C000400e.A09(r5)
            java.util.Collection r0 = r2.values()
            java.util.Set r1 = X.C007103b.A0f(r0)
            java.lang.String r0 = "optedInIntegratorNames"
            r3.putStringSet(r0, r1)
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r2)
        L_0x013b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0155
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.putString(r1, r0)
            goto L_0x013b
        L_0x0155:
            r3.apply()
            goto L_0x0021
        L_0x015a:
            boolean r0 = r11 instanceof X.AnonymousClass2Wz
            if (r0 == 0) goto L_0x0021
            r10.L$0 = r11
            r10.label = r9
            long r3 = X.C36441kJ.A0A(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0174
            long r1 = r1 - r3
            java.lang.Object r0 = X.C07330Xf.A00(r10, r1)
            if (r0 != r5) goto L_0x0174
            return r5
        L_0x0174:
            r1 = r11
            goto L_0x0016
        L_0x0177:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
