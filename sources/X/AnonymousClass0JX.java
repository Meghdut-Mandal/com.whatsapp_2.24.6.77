package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0JX  reason: invalid class name */
public final class AnonymousClass0JX extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new AnonymousClass0E7(Looper.getMainLooper());
    public final C000000a A01;
    public final C02610Bd A02;
    public final C07720Za A03;
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public volatile boolean A05;

    public final void onStart() {
        this.A05 = true;
        if (!this.A01.isEmpty()) {
            this.A03.A07(this);
        }
    }

    public final void onStop() {
        this.A05 = false;
        C07720Za r2 = this.A03;
        synchronized (C07720Za.A0I) {
            if (r2.A01 == this) {
                r2.A01 = null;
                r2.A0A.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r4 = r7.A04
            java.lang.Object r5 = r4.get()
            X.0Sf r5 = (X.C06080Sf) r5
            r0 = 1
            if (r8 == r0) goto L_0x002a
            r0 = 2
            if (r8 != r0) goto L_0x0054
            X.0Bd r2 = r7.A02
            android.app.Activity r1 = r7.getActivity()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A02(r1, r0)
            if (r2 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x0029
            X.0L0 r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L_0x0056
            if (r2 != r0) goto L_0x0056
        L_0x0029:
            return
        L_0x002a:
            r0 = -1
            if (r9 == r0) goto L_0x0059
            if (r9 != 0) goto L_0x0054
            if (r5 == 0) goto L_0x0029
            r3 = 13
            if (r10 == 0) goto L_0x003b
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r10.getIntExtra(r0, r3)
        L_0x003b:
            r2 = 0
            X.0L0 r0 = r5.A01
            java.lang.String r1 = r0.toString()
            r0 = 1
            X.0L0 r6 = new X.0L0
            r6.<init>(r2, r1, r0, r3)
        L_0x0048:
            int r1 = r5.A00
            r0 = 0
            r4.set(r0)
            X.0Za r0 = r7.A03
            r0.A06(r6, r1)
            return
        L_0x0054:
            if (r5 == 0) goto L_0x0029
        L_0x0056:
            X.0L0 r6 = r5.A01
            goto L_0x0048
        L_0x0059:
            r0 = 0
            r4.set(r0)
            X.0Za r0 = r7.A03
            android.os.Handler r1 = r0.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JX.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        AnonymousClass0L0 r3 = new AnonymousClass0L0(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A04;
        C06080Sf r0 = (C06080Sf) atomicReference.get();
        if (r0 == null) {
            i = -1;
        } else {
            i = r0.A00;
        }
        atomicReference.set((Object) null);
        this.A03.A06(r3, i);
    }

    public final void onCreate(Bundle bundle) {
        C06080Sf r0;
        if (bundle != null) {
            AtomicReference atomicReference = this.A04;
            if (bundle.getBoolean("resolving_error", false)) {
                r0 = new C06080Sf(new AnonymousClass0L0(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                r0 = null;
            }
            atomicReference.set(r0);
        }
    }

    public final void onResume() {
        if (!this.A01.isEmpty()) {
            this.A03.A07(this);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C06080Sf r2 = (C06080Sf) this.A04.get();
        if (r2 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r2.A00);
            AnonymousClass0L0 r22 = r2.A01;
            bundle.putInt("failed_status", r22.A01);
            bundle.putParcelable("failed_resolution", r22.A02);
        }
    }

    public AnonymousClass0JX(C02610Bd r3, C07720Za r4, C17270r0 r5) {
        super(r5);
        this.A02 = r3;
        this.A01 = new C000000a(0);
        this.A03 = r4;
        this.mLifecycleFragment.B0J(this, "ConnectionlessLifecycleHelper");
    }
}
