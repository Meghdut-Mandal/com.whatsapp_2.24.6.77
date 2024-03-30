package X;

/* renamed from: X.7tF  reason: invalid class name and case insensitive filesystem */
public class C165327tF implements AnonymousClass7eQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165327tF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02f2, code lost:
        if (r1.isProviderEnabled("gps") == false) goto L_0x02f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BaR(X.C139266jV r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A02
            r3 = r18
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x025b;
                case 2: goto L_0x0229;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r1.A01
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167326(0x7f07085e, float:1.7948922E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r1 * 2
            r3.A07(r0, r1, r1)
            X.62T r1 = new X.62T
            r1.<init>()
            X.6bv r0 = X.C134976bv.A02(r2)
            r1.A02 = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r1.A01 = r0
            X.6bx r0 = r1.A00()
            X.64g r0 = X.AnonymousClass6GS.A00(r0)
            r3.A09(r0)
        L_0x003b:
            return
        L_0x003c:
            java.lang.Object r9 = r1.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r9 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r9
            java.lang.Object r7 = r1.A01
            android.os.Bundle r7 = (android.os.Bundle) r7
            r9.A03 = r3
            if (r18 == 0) goto L_0x0059
            boolean r0 = com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity.A01(r9)
            r3.A0D(r0)
            X.63E r1 = r3.A0S
            if (r1 == 0) goto L_0x0059
            r0 = 0
            r1.A01 = r0
            r1.A00()
        L_0x0059:
            X.AnonymousClass00C.A0B(r3)
            X.5w6 r2 = r9.A08
            if (r2 == 0) goto L_0x030e
            X.60l r1 = new X.60l
            r1.<init>(r9)
            X.6To r0 = new X.6To
            r0.<init>(r3, r1, r2)
            r9.A09 = r0
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_search_filters"
            android.os.Bundle r8 = r1.getBundleExtra(r0)
            X.C18740tg.A06(r8)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_map_view_config"
            android.os.Parcelable r11 = r1.getParcelableExtra(r0)
            X.C18740tg.A06(r11)
            X.6bz r11 = (X.C135016bz) r11
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_search_location"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C18740tg.A06(r0)
            X.6QG r12 = X.AnonymousClass6QG.A01(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_csvm_config"
            java.lang.String r15 = r1.getStringExtra(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_map_business_marker_data"
            java.util.ArrayList r16 = r1.getParcelableArrayListExtra(r0)
            X.C18740tg.A06(r16)
            X.AnonymousClass00C.A08(r16)
            X.AnonymousClass00C.A0B(r8)
            X.AnonymousClass00C.A0B(r11)
            X.C18740tg.A06(r12)
            X.AnonymousClass00C.A08(r12)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "arg_parent_category"
            android.os.Parcelable r14 = r1.getParcelableExtra(r0)
            X.C18740tg.A06(r14)
            X.AnonymousClass00C.A08(r14)
            X.6bw r14 = (X.C134986bw) r14
            X.6To r13 = r9.A09
            java.lang.String r5 = "businessMarkerManager"
            if (r13 != 0) goto L_0x00dc
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x00dc:
            X.5jM r10 = r9.A04
            if (r10 == 0) goto L_0x0307
            X.4kc r6 = new X.4kc
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.04H r1 = new X.04H
            r1.<init>(r6, r9)
            java.lang.Class<X.4kp> r0 = X.C95404kp.class
            X.04R r1 = r1.A00(r0)
            X.4kp r1 = (X.C95404kp) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r9.A06 = r1
            X.4kp r0 = r9.A3i()
            X.00s r1 = r0.A0G
            X.7S7 r0 = new X.7S7
            r0.<init>(r9)
            r3 = 11
            X.C165157sy.A00(r9, r1, r0, r3)
            X.4kp r0 = r9.A3i()
            X.08S r2 = r0.A0F
            X.7S8 r1 = new X.7S8
            r1.<init>(r9)
            r0 = 13
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r0 = r9.A3i()
            X.1Rs r2 = r0.A0V
            X.7S9 r1 = new X.7S9
            r1.<init>(r9)
            r0 = 16
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r0 = r9.A3i()
            X.08S r2 = r0.A0E
            X.7XZ r1 = X.AnonymousClass7XZ.A00
            r0 = 12
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r0 = r9.A3i()
            X.1Rs r2 = r0.A0W
            X.7SA r1 = new X.7SA
            r1.<init>(r9)
            r0 = 17
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r0 = r9.A3i()
            X.1Rs r2 = r0.A0U
            X.7SB r1 = new X.7SB
            r1.<init>(r9)
            r0 = 14
            X.C165157sy.A00(r9, r2, r1, r0)
            X.6To r0 = r9.A09
            if (r0 != 0) goto L_0x015e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x015e:
            X.00s r2 = r0.A07
            X.7SC r1 = new X.7SC
            r1.<init>(r9)
            r0 = 10
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r0 = r9.A3i()
            X.1Rs r2 = r0.A0T
            X.7SD r1 = new X.7SD
            r1.<init>(r9)
            r0 = 15
            X.C165157sy.A00(r9, r2, r1, r0)
            X.4kp r4 = r9.A3i()
            if (r7 != 0) goto L_0x01fa
            X.1QW r1 = r4.A0S
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x01bd
            X.0yC r1 = r1.A03
            r0 = 4488(0x1188, float:6.289E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01bd
            java.util.ArrayList r0 = r4.A0A
            java.util.List r1 = X.C163907qx.A00(r0, r3)
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r3 = X.C007103b.A0L(r1)
            X.6sA r3 = (X.C144426sA) r3
            X.6To r2 = r4.A08
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.6Xe r0 = r2.A0B
            java.util.Map r0 = r0.A05
            java.lang.Object r1 = r0.get(r3)
            X.4q5 r1 = (X.C97674q5) r1
            if (r1 == 0) goto L_0x01bd
            X.60l r0 = r2.A09
            if (r0 == 0) goto L_0x01bd
            r0.A00(r3, r1)
        L_0x01bd:
            X.01N r1 = r9.A06
            com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r9.A04
            if (r0 == 0) goto L_0x0300
            r1.A04(r0)
            com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener r0 = r9.A04
            if (r0 == 0) goto L_0x02f9
            X.00s r2 = r0.A00
            X.7SE r1 = new X.7SE
            r1.<init>(r9)
            r0 = 18
            X.C165157sy.A00(r9, r2, r1, r0)
            X.6jV r3 = r9.A03
            if (r3 == 0) goto L_0x01ec
            r2 = 0
            X.7qG r1 = new X.7qG
            r1.<init>(r9, r2)
            java.util.ArrayList r0 = r3.A0V
            r0.add(r1)
            X.7qH r0 = new X.7qH
            r0.<init>(r9, r2)
            r3.A0C = r0
        L_0x01ec:
            X.6jV r0 = r9.A03
            if (r0 == 0) goto L_0x003b
            X.4ej r1 = r0.A0Q
            X.6jX r0 = new X.6jX
            r0.<init>(r9)
            r1.A0S = r0
            return
        L_0x01fa:
            X.6To r2 = r9.A09
            if (r2 != 0) goto L_0x0203
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0203:
            X.6sA r1 = r4.A07
            if (r1 == 0) goto L_0x020a
            r0 = 0
            r1.A09 = r0
        L_0x020a:
            r4.A08 = r2
            X.00s r0 = r2.A07
            r4.A02 = r0
            r2.A02()
            X.6QG r1 = r4.A05
            java.util.ArrayList r0 = r4.A0A
            r2.A04(r1, r0)
            X.6sA r1 = r4.A07
            if (r1 == 0) goto L_0x01bd
            r0 = 1
            r1.A09 = r0
            r0 = 0
            r2.A05(r1, r0)
            r2.A03()
            goto L_0x01bd
        L_0x0229:
            java.lang.Object r6 = r1.A00
            X.5B8 r6 = (X.AnonymousClass5B8) r6
            java.lang.Object r5 = r1.A01
            android.content.Context r5 = (android.content.Context) r5
            X.4py r4 = r6.A07
            if (r4 != 0) goto L_0x0253
            X.5Tx r2 = r6.A08
            X.6LS r1 = r6.A0B
            if (r1 != 0) goto L_0x0242
            X.6LS r1 = new X.6LS
            r1.<init>(r5, r6)
            r6.A0B = r1
        L_0x0242:
            r0 = 2131232597(0x7f080755, float:1.8081308E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r5, r0)
            java.util.Objects.requireNonNull(r0)
            X.4py r4 = new X.4py
            r4.<init>(r0, r3, r2, r1)
            r6.A07 = r4
        L_0x0253:
            r3.A0B(r4)
            r0 = 1
            r4.A05(r0)
            return
        L_0x025b:
            java.lang.Object r4 = r1.A00
            X.5FH r4 = (X.AnonymousClass5FH) r4
            java.lang.Object r5 = r1.A01
            X.5E6 r5 = (X.AnonymousClass5E6) r5
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r3.A05()
            X.6QG r0 = r5.A01
            r4.A00 = r0
            X.6To r0 = r4.A02
            if (r0 != 0) goto L_0x027a
            X.5w6 r2 = r4.A08
            r1 = 0
            X.6To r0 = new X.6To
            r0.<init>(r3, r1, r2)
            r4.A02 = r0
        L_0x027a:
            X.6bz r0 = r5.A00
            float r0 = r0.A01
            X.6bx r0 = X.AnonymousClass5FH.A00(r4, r0)
            X.64g r0 = X.AnonymousClass6GS.A00(r0)
            r3.A09(r0)
            X.6To r0 = r4.A02
            if (r0 == 0) goto L_0x0290
            r0.A02()
        L_0x0290:
            X.6To r2 = r4.A02
            if (r2 == 0) goto L_0x029b
            X.6QG r1 = r4.A00
            java.util.List r0 = r5.A02
            r2.A04(r1, r0)
        L_0x029b:
            X.6To r1 = r4.A02
            if (r1 == 0) goto L_0x02a4
            java.util.List r0 = r5.A02
            r1.A06(r0)
        L_0x02a4:
            X.6To r1 = r4.A02
            if (r1 == 0) goto L_0x02c1
            X.08g r5 = r5.A04
            int r0 = r1.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            float r0 = X.C134996bx.A00(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.BKt(r2, r1, r0)
        L_0x02c1:
            android.view.View r0 = r4.A06
            android.app.Activity r1 = X.C36361kB.A06(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.AnonymousClass00C.A0E(r1, r0)
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.location.LocationManager"
            X.AnonymousClass00C.A0E(r1, r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            X.6Eo r0 = r4.A07
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02f4
            X.0yE r0 = r4.A04
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x02f4
            java.lang.String r0 = "gps"
            boolean r1 = r1.isProviderEnabled(r0)
            r0 = 1
            if (r1 != 0) goto L_0x02f5
        L_0x02f4:
            r0 = 0
        L_0x02f5:
            r3.A0D(r0)
            return
        L_0x02f9:
            java.lang.String r0 = "locationUpdateListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0300:
            java.lang.String r0 = "locationUpdateListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0307:
            java.lang.String r0 = "viewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x030e:
            java.lang.String r0 = "directoryImageLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165327tF.BaR(X.6jV):void");
    }
}
