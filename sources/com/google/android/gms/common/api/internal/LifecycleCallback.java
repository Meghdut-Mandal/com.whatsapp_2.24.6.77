package com.google.android.gms.common.api.internal;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass0OP;
import X.C17270r0;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final C17270r0 mLifecycleFragment;

    public LifecycleCallback(C17270r0 r1) {
        this.mLifecycleFragment = r1;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static C17270r0 getChimeraLifecycleFragmentImpl(AnonymousClass0OP r0) {
        throw AnonymousClass001.A09("Method not available in SDK.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r3 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r0 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r3 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C17270r0 getFragment(android.app.Activity r5) {
        /*
            java.lang.String r0 = "Activity must not be null"
            X.AnonymousClass006.A02(r5, r0)
            boolean r0 = r5 instanceof X.AnonymousClass01I
            if (r0 == 0) goto L_0x0059
            X.01I r5 = (X.AnonymousClass01I) r5
            java.lang.String r4 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r2 = com.google.android.gms.common.api.internal.zzd.A03
            java.lang.Object r0 = r2.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r0.get()
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3
            if (r3 != 0) goto L_0x009c
        L_0x001f:
            X.02D r0 = r5.A04     // Catch:{ ClassCastException -> 0x0050 }
            X.01y r0 = r0.A00     // Catch:{ ClassCastException -> 0x0050 }
            X.01z r0 = r0.A03     // Catch:{ ClassCastException -> 0x0050 }
            X.02E r3 = r0.A0N(r4)     // Catch:{ ClassCastException -> 0x0050 }
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3     // Catch:{ ClassCastException -> 0x0050 }
            if (r3 == 0) goto L_0x0031
            boolean r0 = r3.A0i
            if (r0 == 0) goto L_0x0048
        L_0x0031:
            com.google.android.gms.common.api.internal.zzd r3 = new com.google.android.gms.common.api.internal.zzd
            r3.<init>()
            X.02D r0 = r5.A04
            X.01y r0 = r0.A00
            X.01z r0 = r0.A03
            X.09Y r1 = new X.09Y
            r1.<init>(r0)
            r1.A0D(r3, r4)
            r0 = 1
            r1.A00(r0)
        L_0x0048:
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r3)
            r2.put(r5, r0)
            return r3
        L_0x0050:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0059:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r2 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = X.AnonymousClass0DW.A03
            java.lang.Object r0 = r1.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x006f
            java.lang.Object r3 = r0.get()
            X.0DW r3 = (X.AnonymousClass0DW) r3
            if (r3 != 0) goto L_0x009c
        L_0x006f:
            android.app.FragmentManager r0 = r5.getFragmentManager()     // Catch:{ ClassCastException -> 0x009d }
            android.app.Fragment r3 = r0.findFragmentByTag(r2)     // Catch:{ ClassCastException -> 0x009d }
            X.0DW r3 = (X.AnonymousClass0DW) r3     // Catch:{ ClassCastException -> 0x009d }
            if (r3 == 0) goto L_0x0081
            boolean r0 = r3.isRemoving()
            if (r0 == 0) goto L_0x0095
        L_0x0081:
            X.0DW r3 = new X.0DW
            r3.<init>()
            android.app.FragmentManager r0 = r5.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r3, r2)
            r0.commitAllowingStateLoss()
        L_0x0095:
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r3)
            r1.put(r5, r0)
        L_0x009c:
            return r3
        L_0x009d:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x00a6:
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(android.app.Activity):X.0r0");
    }

    public Activity getActivity() {
        Activity BDW = this.mLifecycleFragment.BDW();
        AnonymousClass006.A01(BDW);
        return BDW;
    }

    public static C17270r0 getFragment(AnonymousClass0OP r0) {
        throw AnonymousClass001.A0A("zzd");
    }

    public static C17270r0 getFragment(ContextWrapper contextWrapper) {
        throw AnonymousClass001.A0D();
    }
}
