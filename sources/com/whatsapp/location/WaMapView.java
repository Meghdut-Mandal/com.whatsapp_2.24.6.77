package com.whatsapp.location;

import X.AnonymousClass2XH;
import X.C114635hZ;
import X.C115075iI;
import X.C139256jU;
import X.C141476nJ;
import X.C165417tO;
import X.C46902br;
import X.C46912bs;
import X.C63593Kq;
import X.C90524aI;
import X.C92744eX;
import X.C92794ej;
import X.C92904ey;
import X.C98864s9;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;

public class WaMapView extends C92904ey {
    public static C114635hZ A02;
    public static C115075iI A03;
    public C92794ej A00;
    public C92744eX A01;

    public void setupGoogleMap(C92744eX r7, LatLng latLng, C98864s9 r9) {
        r7.A07(new C165417tO(r7, latLng, r9, this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.A00 != 0.0d) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.google.android.gms.maps.model.LatLng r9, X.C98864s9 r10, X.AnonymousClass2XH r11) {
        /*
            r8 = this;
            double r0 = r9.A01
            r4 = 0
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            double r2 = r9.A00
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r5 == 0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r8.setVisibility(r4)
            if (r2 == 0) goto L_0x0124
            android.content.Context r2 = r8.getContext()
            boolean r2 = r11.A05(r2)
            if (r2 == 0) goto L_0x00ce
            X.4eX r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r8 instanceof X.AnonymousClass5BG     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.maps.GoogleMapOptions r2 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0 = 1
            r2.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A03 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A04 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.AnonymousClass6II.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.4eX r1 = new X.4eX     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1.<init>(r0, r2)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
        L_0x0052:
            r8.A01 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            boolean r0 = r11.A00     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            if (r0 != 0) goto L_0x007c
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1 = 2
            X.7r9 r0 = new X.7r9     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0.<init>(r11, r8, r1)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r2.addOnPreDrawListener(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
        L_0x0065:
            X.4eX r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0 = 4
            r1.setVisibility(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.4eX r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0 = -1
            r8.addView(r1, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
        L_0x0071:
            X.4eX r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.6nK r0 = new X.6nK     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0.<init>(r9, r10, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1.A07(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            goto L_0x00c8
        L_0x007c:
            r0 = 0
            r1.A05(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.4eX r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0.A04()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            goto L_0x0065
        L_0x0086:
            com.google.android.gms.maps.GoogleMapOptions r3 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.67C r1 = new X.67C     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1.A03 = r9     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r0 = 1097859072(0x41700000, float:15.0)
            r1.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            com.google.android.gms.maps.model.CameraPosition r2 = r1.A00()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1 = 1
            r3.A00 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A03 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A04 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A01 = r2     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r3.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.AnonymousClass6II.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            X.4eX r1 = new X.4eX     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            r1.<init>(r0, r3)     // Catch:{ IncompatibleClassChangeError -> 0x00c9 }
            goto L_0x0052
        L_0x00c8:
            return
        L_0x00c9:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
            return
        L_0x00ce:
            X.4ej r2 = r8.A00
            if (r2 != 0) goto L_0x0119
            X.62T r5 = new X.62T
            r5.<init>()
            double r2 = r9.A00
            X.6bv r0 = X.C134976bv.A00(r2, r0)
            r5.A02 = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r5.A01 = r0
            X.6bx r1 = r5.A00()
            X.5yJ r2 = new X.5yJ
            r2.<init>()
            r0 = 1
            r2.A00 = r0
            r2.A08 = r4
            r2.A05 = r4
            r2.A07 = r4
            r2.A02 = r1
            java.lang.String r0 = "whatsapp_consumer"
            r2.A04 = r0
            android.content.Context r0 = r8.getContext()
            r11.A04(r0)
            double r0 = X.C92794ej.A0n
            android.content.Context r0 = r8.getContext()
            X.5B8 r1 = new X.5B8
            r1.<init>(r0, r2)
            r8.A00 = r1
            r0 = 0
            r1.A0F(r0)
            X.4ej r1 = r8.A00
            r0 = -1
            r8.addView(r1, r0, r0)
        L_0x0119:
            X.4ej r2 = r8.A00
            r1 = 3
            X.7tF r0 = new X.7tF
            r0.<init>(r9, r8, r1)
            r2.A0H(r0)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.WaMapView.A01(com.google.android.gms.maps.model.LatLng, X.4s9, X.2XH):void");
    }

    public void A02(AnonymousClass2XH r5, C46902br r6, boolean z) {
        double d;
        double d2;
        C98864s9 A002;
        C63593Kq r2;
        if (z || (r2 = r6.A02) == null) {
            d = r6.A00;
            d2 = r6.A01;
        } else {
            d = r2.A00;
            d2 = r2.A01;
        }
        LatLng A0F = C90524aI.A0F(d, d2);
        if (z) {
            A002 = null;
        } else {
            A002 = C98864s9.A00(getContext(), R.raw.expired_map_style_json);
        }
        A01(A0F, A002, r5);
    }

    public void A03(AnonymousClass2XH r5, C46912bs r6) {
        LatLng A0F = C90524aI.A0F(r6.A00, r6.A01);
        A01(A0F, (C98864s9) null, r5);
        A00(A0F);
    }

    public void A00(LatLng latLng) {
        String string = getContext().getString(R.string.f12nameremoved);
        C92744eX r1 = this.A01;
        if (r1 != null) {
            r1.A07(new C141476nJ(latLng, string));
            return;
        }
        C92794ej r12 = this.A00;
        if (r12 != null) {
            r12.A0H(new C139256jU(latLng, string));
        }
    }

    public C92794ej getFacebookMapView() {
        return this.A00;
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMapView(Context context) {
        super(context);
    }
}
