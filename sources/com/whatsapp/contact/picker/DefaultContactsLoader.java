package com.whatsapp.contact.picker;

import X.AnonymousClass4T0;
import X.C36321k7;
import com.whatsapp.community.DirectoryContactsLoader;

public final class DefaultContactsLoader implements AnonymousClass4T0 {
    public final DirectoryContactsLoader A00;
    public final DeviceContactsLoader A01;
    public final NonWaContactsLoader A02;
    public final RecentlyAcceptedInviteContactsLoader A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.Set] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BOK(X.AnonymousClass147 r10, X.C023509x r11, X.C005502l r12) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.AnonymousClass7B0
            if (r0 == 0) goto L_0x00ed
            r4 = r11
            X.7B0 r4 = (X.AnonymousClass7B0) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r8 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 4
            r6 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r1) goto L_0x0055
            if (r0 == r7) goto L_0x0087
            if (r0 == r6) goto L_0x00b9
            if (r0 != r3) goto L_0x00f4
            java.lang.Object r0 = r4.L$1
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r4.L$0
            X.AnonymousClass0AN.A00(r8)
        L_0x002f:
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
            return r2
        L_0x0035:
            X.AnonymousClass0AN.A00(r8)
            java.util.LinkedHashSet r0 = X.C36441kJ.A17()
            com.whatsapp.community.DirectoryContactsLoader r2 = r9.A00
            r4.L$0 = r9
            r4.L$1 = r10
            r4.L$2 = r12
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r1
            X.02m r1 = X.AnonymousClass19R.A01
            java.lang.Object r8 = r2.BOK(r10, r4, r1)
            if (r8 == r5) goto L_0x00f9
            r1 = r9
            r2 = r0
            goto L_0x006c
        L_0x0055:
            java.lang.Object r0 = r4.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r4.L$3
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r12 = r4.L$2
            X.02l r12 = (X.C005502l) r12
            java.lang.Object r10 = r4.L$1
            X.147 r10 = (X.AnonymousClass147) r10
            java.lang.Object r1 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.AnonymousClass0AN.A00(r8)
        L_0x006c:
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
            com.whatsapp.contact.picker.DeviceContactsLoader r0 = r1.A01
            r4.L$0 = r1
            r4.L$1 = r10
            r4.L$2 = r12
            r4.L$3 = r2
            r4.L$4 = r2
            r4.label = r7
            java.lang.Object r8 = r0.BOK(r10, r4, r12)
            if (r8 == r5) goto L_0x00f9
            r0 = r2
            goto L_0x009e
        L_0x0087:
            java.lang.Object r0 = r4.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r4.L$3
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r12 = r4.L$2
            X.02l r12 = (X.C005502l) r12
            java.lang.Object r10 = r4.L$1
            X.147 r10 = (X.AnonymousClass147) r10
            java.lang.Object r1 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.AnonymousClass0AN.A00(r8)
        L_0x009e:
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
            com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader r0 = r1.A03
            r4.L$0 = r1
            r4.L$1 = r10
            r4.L$2 = r12
            r4.L$3 = r2
            r4.L$4 = r2
            r4.label = r6
            java.lang.Object r8 = r0.BOK(r10, r4, r12)
            if (r8 == r5) goto L_0x00f9
            r0 = r2
            goto L_0x00d0
        L_0x00b9:
            java.lang.Object r0 = r4.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r4.L$3
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r12 = r4.L$2
            X.02l r12 = (X.C005502l) r12
            java.lang.Object r10 = r4.L$1
            X.147 r10 = (X.AnonymousClass147) r10
            java.lang.Object r1 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.AnonymousClass0AN.A00(r8)
        L_0x00d0:
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
            com.whatsapp.contact.picker.NonWaContactsLoader r1 = r1.A02
            r4.L$0 = r2
            r4.L$1 = r2
            r0 = 0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r3
            java.lang.Object r8 = r1.BOK(r10, r4, r12)
            if (r8 == r5) goto L_0x00f9
            r0 = r2
            goto L_0x002f
        L_0x00ed:
            X.7B0 r4 = new X.7B0
            r4.<init>(r9, r11)
            goto L_0x0012
        L_0x00f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00f9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.DefaultContactsLoader.BOK(X.147, X.09x, X.02l):java.lang.Object");
    }

    public DefaultContactsLoader(DirectoryContactsLoader directoryContactsLoader, DeviceContactsLoader deviceContactsLoader, NonWaContactsLoader nonWaContactsLoader, RecentlyAcceptedInviteContactsLoader recentlyAcceptedInviteContactsLoader) {
        C36321k7.A18(deviceContactsLoader, nonWaContactsLoader, recentlyAcceptedInviteContactsLoader, directoryContactsLoader);
        this.A01 = deviceContactsLoader;
        this.A02 = nonWaContactsLoader;
        this.A03 = recentlyAcceptedInviteContactsLoader;
        this.A00 = directoryContactsLoader;
    }

    public String BDM() {
        return "com.whatsapp.contact.picker.DefaultContactsLoader";
    }
}
