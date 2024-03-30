package com.whatsapp.glasses;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass02R;
import X.AnonymousClass3Y2;
import X.AnonymousClass6BU;
import X.AnonymousClass7hB;
import X.C108405Tj;
import X.C108415Tk;
import X.C1275668u;
import X.C19630wG;
import X.C224514j;
import X.C36341k9;
import X.C36391kE;
import X.C38911qR;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SUPBottomSheetView extends Hilt_SUPBottomSheetView implements AnonymousClass7hB {
    public int A00;
    public C38911qR A01;
    public AnonymousClass00S A02;
    public final C108415Tk A03 = C108415Tk.SG_NUX_GLASSES_IMAGE_ANIMATION;
    public final Map A04 = C36391kE.A11(C108415Tk.SG_NUX_GLASSES_IMAGE, Integer.valueOf(R.id.sup_nux_glasses));
    public final Set A05;
    public final AtomicBoolean A06;
    public final C19630wG A07;
    public final C1275668u A08;
    public final C108405Tj A09 = C108405Tj.SG_NUX_GLASSES_IMAGE_ANIMATION;
    public final List A0A;

    public SUPBottomSheetView(C19630wG r8) {
        this.A07 = r8;
        C108415Tk[] r1 = {C108415Tk.SG_NUX_ROW_LOCK_ICON, C108415Tk.SG_NUX_ROW_LIGHT_BULB_ICON, C108415Tk.SG_NUX_ROW_IMAGE_ICON};
        AnonymousClass00C.A0D(r1, 0);
        this.A05 = AnonymousClass02R.A0E(r1);
        AnonymousClass6BU[] r4 = new AnonymousClass6BU[3];
        r4[0] = new AnonymousClass6BU(R.string.f12nameremoved, Integer.valueOf(R.string.f12nameremoved));
        r4[1] = new AnonymousClass6BU(R.string.f12nameremoved, Integer.valueOf(R.string.f12nameremoved));
        this.A0A = C36341k9.A0m(new AnonymousClass6BU(R.string.f12nameremoved, Integer.valueOf(R.string.f12nameremoved)), r4, 2);
        this.A08 = new C1275668u(Integer.valueOf(R.color.f6nameremoved));
        this.A06 = new AtomicBoolean(false);
    }

    public void Biz(int i) {
        C38911qR r0;
        if (i == 3) {
            this.A00--;
        } else {
            Log.e("SUPBottomSheetView Network resource download failure!");
        }
        if (this.A00 <= 0 && this.A06.get() && (r0 = this.A01) != null) {
            A03(r0);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass00S r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.C38911qR r10) {
        /*
            r9 = this;
            X.6T7 r5 = X.AnonymousClass6T7.A00
            java.util.Map r0 = r9.A04
            X.0wG r8 = r9.A07
            r5.A02(r10, r8, r0)
            java.util.Set r0 = r9.A05
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x0010:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.next()
            int r2 = r3 + 1
            if (r3 >= 0) goto L_0x0023
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x0023:
            X.5Tk r0 = (X.C108415Tk) r0
            java.lang.String r0 = r0.id
            android.graphics.Bitmap r1 = r5.A01(r8, r0)
            java.util.List r0 = r9.A0A
            java.lang.Object r0 = X.C007103b.A0P(r0, r3)
            X.6BU r0 = (X.AnonymousClass6BU) r0
            if (r0 == 0) goto L_0x0037
            r0.A00 = r1
        L_0x0037:
            r3 = r2
            goto L_0x0010
        L_0x0039:
            X.5Tj r7 = r9.A09
            java.lang.String r0 = r7.fileName
            boolean r6 = X.C36331k8.A1a(r0, r8)
            r5 = 0
            java.io.FileInputStream r4 = X.AnonymousClass6XA.A02(r8, r0)     // Catch:{ IOException -> 0x0075, IllegalStateException -> 0x0079 }
            if (r4 == 0) goto L_0x007f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x006e }
            int r1 = r4.read()     // Catch:{ all -> 0x006e }
        L_0x0050:
            r0 = -1
            if (r1 == r0) goto L_0x005c
            char r0 = (char) r1     // Catch:{ all -> 0x006e }
            r2.append(r0)     // Catch:{ all -> 0x006e }
            int r1 = r4.read()     // Catch:{ all -> 0x006e }
            goto L_0x0050
        L_0x005c:
            int r0 = r2.length()     // Catch:{ all -> 0x006e }
            if (r0 <= r6) goto L_0x006a
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x006e }
            r4.close()     // Catch:{ IOException -> 0x0075, IllegalStateException -> 0x0079 }
            goto L_0x0080
        L_0x006a:
            r4.close()     // Catch:{ IOException -> 0x0075, IllegalStateException -> 0x0079 }
            goto L_0x007f
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x0075, IllegalStateException -> 0x0079 }
            throw r0     // Catch:{ IOException -> 0x0075, IllegalStateException -> 0x0079 }
        L_0x0075:
            r1 = move-exception
            java.lang.String r0 = "sup:ResourceDownloaderUtil Network resource readFileAsString IOException failure!"
            goto L_0x007c
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "sup:ResourceDownloaderUtil Network resource readFileAsString IllegalStateException failure!"
        L_0x007c:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x007f:
            r3 = r5
        L_0x0080:
            java.lang.String r2 = r7.fileName
            X.AnonymousClass00C.A0D(r2, r6)
            com.airbnb.lottie.LottieAnimationView r1 = r10.A04
            r0 = 0
            r1.setVisibility(r0)
            if (r3 == 0) goto L_0x0090
            r1.setAnimationFromJson(r3, r2)
        L_0x0090:
            X.4mX r0 = r10.A00
            if (r0 == 0) goto L_0x0097
            r0.A06()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.glasses.SUPBottomSheetView.A03(X.1qR):void");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A0a = A0a();
        C38911qR r3 = new C38911qR(A0a, this.A08, this.A0A);
        this.A01 = r3;
        r3.A05.setOnClickListener(new AnonymousClass3Y2(this, 20));
        if (this.A00 <= 0 && this.A06.get()) {
            A03(r3);
        }
        C36341k9.A0q(A0a, r3, C224514j.A00(A0a, R.attr.f4nameremoved, R.color.f6nameremoved));
        return r3;
    }
}
