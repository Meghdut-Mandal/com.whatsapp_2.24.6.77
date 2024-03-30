package com.whatsapp.extensions.phoenix.webview;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass6NP;
import X.AnonymousClass6OE;
import X.AnonymousClass6PZ;
import X.C007103b;
import X.C19770wU;
import X.C20310xM;
import X.C20810yC;
import X.C236419g;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36411kG;
import X.C90504aG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class FcsExtensionsWebViewFragment extends Hilt_FcsExtensionsWebViewFragment {
    public static final Set A0A = C90504aG.A0w(new String[]{"string", "integer", "boolean", "number"});
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public AnonymousClass185 A02;
    public AnonymousClass6OE A03;
    public C20310xM A04;
    public C236419g A05;
    public AnonymousClass6PZ A06;
    public AnonymousClass6NP A07;
    public AnonymousClass1A1 A08;
    public C19770wU A09;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        AnonymousClass6PZ r0 = this.A06;
        if (r0 != null) {
            r0.A01((Boolean) null, C36411kG.A0t(), "WEBVIEW", (String) null, (String) null, (String) null);
            return super.A1G(bundle, layoutInflater, viewGroup);
        }
        throw C36331k8.A0d("wamFlowsScreenProgressReporter");
    }

    public static final void A00(FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment, String str) {
        C20810yC r1 = fcsExtensionsWebViewFragment.A01;
        if (r1 == null) {
            throw C36321k7.A07();
        } else if (r1.A0E(5910)) {
            AnonymousClass6OE r3 = fcsExtensionsWebViewFragment.A03;
            if (r3 != null) {
                AnonymousClass01I A0h = fcsExtensionsWebViewFragment.A0h();
                AnonymousClass185 r12 = fcsExtensionsWebViewFragment.A02;
                if (r12 != null) {
                    AnonymousClass6NP r0 = fcsExtensionsWebViewFragment.A07;
                    if (r0 != null) {
                        r3.A01(A0h, r12, r0, str);
                        return;
                    }
                    throw C36331k8.A0d("wamFlowsStructuredMessageInteractionReporter");
                }
                throw C36331k8.A0d("verifiedNameManager");
            }
            throw C36331k8.A0d("extensionsDataUtil");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(android.net.Uri r7, com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r8, java.util.HashMap r9, java.util.Map r10) {
        /*
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r10)
        L_0x0004:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0090
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r6)
            java.lang.String r4 = X.C90494aF.A0f(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            r5 = 0
            java.lang.String r3 = "phoenix-webview-payload-validation-error"
            if (r0 == 0) goto L_0x003b
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            r9.put(r4, r0)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = A03(r7, r8, r1, r2)
            if (r0 != 0) goto L_0x0004
        L_0x0037:
            A00(r8, r3)
            return r5
        L_0x003b:
            java.lang.String r1 = r7.getQueryParameter(r4)
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "integer"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r1 = X.AnonymousClass097.A03(r1)
        L_0x004d:
            if (r1 != 0) goto L_0x007f
            goto L_0x0037
        L_0x0050:
            java.lang.String r0 = "number"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x006b
            r2 = 0
            X.0fN r0 = X.AnonymousClass0RV.A00     // Catch:{ NumberFormatException -> 0x0069 }
            boolean r0 = r0.A03(r1)     // Catch:{ NumberFormatException -> 0x0069 }
            if (r0 == 0) goto L_0x0037
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0069 }
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0069 }
        L_0x0069:
            r1 = r2
            goto L_0x004d
        L_0x006b:
            java.lang.String r0 = "boolean"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0083
            java.lang.Boolean r1 = X.C36371kC.A0m()
        L_0x007f:
            r9.put(r4, r1)
            goto L_0x0004
        L_0x0083:
            java.lang.String r0 = "false"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x007f
        L_0x0090:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment.A03(android.net.Uri, com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment, java.util.HashMap, java.util.Map):boolean");
    }

    public static final boolean A05(FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment, Map map) {
        boolean A0j;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Object A0u = C36351kA.A0u(A0y);
            if (A0u instanceof Map) {
                A0j = A05(fcsExtensionsWebViewFragment, (Map) A0u);
                continue;
            } else {
                A0j = C007103b.A0j(A0A, A0u);
                continue;
            }
            if (!A0j) {
                return false;
            }
        }
        return true;
    }
}
