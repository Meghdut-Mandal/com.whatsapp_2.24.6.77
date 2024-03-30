package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass0FM;
import X.AnonymousClass155;
import X.AnonymousClass1P5;
import X.AnonymousClass1QW;
import X.AnonymousClass3LW;
import X.AnonymousClass5B9;
import X.AnonymousClass5DR;
import X.AnonymousClass60b;
import X.AnonymousClass6QG;
import X.AnonymousClass7f7;
import X.AnonymousClass7g2;
import X.C1261662u;
import X.C1272067j;
import X.C129006Eo;
import X.C129186Fs;
import X.C129426Gw;
import X.C132296Sz;
import X.C132406Tm;
import X.C133566Za;
import X.C142606p9;
import X.C142616pA;
import X.C142646pD;
import X.C143536qi;
import X.C143546qj;
import X.C1503474x;
import X.C159287j7;
import X.C159327jB;
import X.C163027pX;
import X.C163297py;
import X.C164537ry;
import X.C165457tS;
import X.C17240qx;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20830yE;
import X.C237019m;
import X.C33751fs;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36411kG;
import X.C39001qm;
import X.C90464aC;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class DirectorySetLocationMapActivity extends AnonymousClass155 implements C159287j7 {
    public Bundle A00;
    public C129186Fs A01;
    public AnonymousClass60b A02;
    public C237019m A03;
    public C33771fu A04;
    public C142616pA A05;
    public C142646pD A06;
    public AnonymousClass5DR A07;
    public C129006Eo A08;
    public C132296Sz A09;
    public C133566Za A0A;
    public C33751fs A0B;
    public C20830yE A0C;
    public C18820ts A0D;
    public AnonymousClass5B9 A0E;
    public AnonymousClass1P5 A0F;
    public AnonymousClass1QW A0G;
    public C142606p9 A0H;
    public WhatsAppLibLoader A0I;
    public C1272067j A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AnonymousClass7f7 A0N;

    public static void A0F(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        Double d;
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = directorySetLocationMapActivity;
        C133566Za r3 = directorySetLocationMapActivity.A0A;
        Double d2 = r3.A09;
        if (d2 == null || (d = r3.A0A) == null) {
            directorySetLocationMapActivity.A01();
        } else {
            directorySetLocationMapActivity.A0J.A01(C90484aE.A0S(d, d2.doubleValue()), directorySetLocationMapActivity2, (C132406Tm) null, r3.A0C, "pin_on_map", 10.0f);
        }
    }

    public static void A0J(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = directorySetLocationMapActivity;
        if (RequestPermissionActivity.A0B.A0H(directorySetLocationMapActivity2, directorySetLocationMapActivity.A0C, R.string.f12nameremoved, R.string.f12nameremoved, 34)) {
            directorySetLocationMapActivity2.A0A.A01();
            View view = directorySetLocationMapActivity2.A0A.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            AnonymousClass5B9 r3 = directorySetLocationMapActivity2.A0E;
            int i = r3.A03;
            if (i != 0) {
                if (i == 1) {
                    r3.setLocationMode(0);
                    return;
                } else if (i != 2) {
                    return;
                }
            }
            r3.setLocationMode(1);
        }
    }

    public void A3j(C159327jB r8, Double d, Double d2) {
        C159327jB r5 = r8;
        if (!this.A07.A09()) {
            r8.BYT(-1, -1);
            return;
        }
        this.A04.Boy(new C1503474x((Object) d2, (Object) this, (Object) d, (Object) r5, 17));
    }

    public static void A0G(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        C129186Fs r0 = directorySetLocationMapActivity.A01;
        if (r0 != null && r0.A02() != null && directorySetLocationMapActivity.A01.A02().A03 != null) {
            LatLng latLng = directorySetLocationMapActivity.A01.A02().A03;
            C133566Za r2 = directorySetLocationMapActivity.A0A;
            r2.A09 = Double.valueOf(latLng.A00);
            r2.A0A = Double.valueOf(latLng.A01);
        }
    }

    public static void A0H(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        C133566Za r1 = directorySetLocationMapActivity.A0A;
        if (r1.A09 == null || r1.A0A == null) {
            directorySetLocationMapActivity.A01();
            return;
        }
        r1.A08 = null;
        r1.A06.setVisibility(0);
        C133566Za r0 = directorySetLocationMapActivity.A0A;
        directorySetLocationMapActivity.A3j(new C164537ry(directorySetLocationMapActivity, 0), r0.A09, r0.A0A);
    }

    public static void A0I(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        C129186Fs r0 = directorySetLocationMapActivity.A01;
        if (r0 != null) {
            r0.A0L(true);
            directorySetLocationMapActivity.A0A.A01();
            View view = directorySetLocationMapActivity.A0A.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            AnonymousClass5B9 r02 = directorySetLocationMapActivity.A0E;
            r02.A03 = 1;
            r02.A0A(1);
        }
    }

    public static boolean A0K(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        Double d;
        if (TextUtils.isEmpty(directorySetLocationMapActivity.A0A.A0C)) {
            C133566Za r0 = directorySetLocationMapActivity.A0A;
            Double d2 = r0.A09;
            if (d2 == null || (d = r0.A0A) == null) {
                directorySetLocationMapActivity.A01();
            } else {
                directorySetLocationMapActivity.A3j(new C164537ry(directorySetLocationMapActivity, 1), d2, d);
                return false;
            }
        }
        return true;
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C90464aC.A0y(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A04 = C36351kA.A0P(A0B2);
            this.A0D = C36341k9.A0T(A0B2);
            this.A0I = C90494aF.A0P(A0B2);
            this.A0C = C36351kA.A0X(A0B2);
            this.A03 = C90484aE.A0T(A0B2);
            this.A0B = C90504aG.A0N(r1);
            this.A0F = C36411kG.A0l(A0B2);
            this.A0G = C90494aF.A0N(r1);
            this.A05 = C90494aF.A0J(r1);
            this.A06 = (C142646pD) r1.A1S.get();
            this.A08 = (C129006Eo) r1.A3l.get();
            this.A07 = (AnonymousClass5DR) r1.A0c.get();
            this.A09 = (C132296Sz) r1.A6m.get();
            this.A0H = C90494aF.A0O(r1);
            this.A02 = (AnonymousClass60b) r1.A1f.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0161, code lost:
        r0 = r9.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A3i(X.C129186Fs r10) {
        /*
            r9 = this;
            X.6Fs r0 = r9.A01
            if (r0 != 0) goto L_0x01ca
            r9.A01 = r10
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap map is not available"
            X.C18740tg.A07(r10, r0)
            X.6Za r2 = r9.A0A
            android.view.View r1 = r2.A03
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerView is not available"
            X.C18740tg.A07(r1, r0)
            android.view.View r1 = r2.A01
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerFillerView is not available"
            X.C18740tg.A07(r1, r0)
            android.view.View r1 = r2.A02
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerPinView is not available"
            X.C18740tg.A07(r1, r0)
            r3 = 0
            r10.A0M(r3)
            X.6Fs r0 = r9.A01
            r0.A0K(r3)
            X.0yE r0 = r9.A0C
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0065
            X.6Za r0 = r9.A0A
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0065
            X.6Fs r1 = r9.A01
            r0 = 1
            r1.A0L(r0)
        L_0x003f:
            X.6Fs r0 = r9.A01
            X.60M r0 = r0.A01()
            r0.A00()
            X.6Fs r1 = r9.A01
            r7 = 0
            X.7qJ r0 = new X.7qJ
            r0.<init>(r9, r3)
            r1.A0H(r0)
            X.6Fs r1 = r9.A01
            X.6hP r0 = new X.6hP
            r0.<init>(r9, r3)
            r1.A0F(r0)
            X.6Fs r0 = r9.A01
            X.6nI r1 = new X.6nI
            r1.<init>(r9)
            goto L_0x007d
        L_0x0065:
            X.0yE r0 = r9.A0C
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x003f
            X.6Za r2 = r9.A0A
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x003f
            r1 = 1
            X.7pf r0 = new X.7pf
            r0.<init>(r9, r1)
            r2.A02(r0)
            goto L_0x003f
        L_0x007d:
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01c4 }
            X.4sa r0 = new X.4sa     // Catch:{ RemoteException -> 0x01c4 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01c4 }
            X.6a2 r2 = (X.C133816a2) r2     // Catch:{ RemoteException -> 0x01c4 }
            android.os.Parcel r1 = X.AnonymousClass6UO.A00(r0, r2)     // Catch:{ RemoteException -> 0x01c4 }
            r0 = 42
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x01c4 }
            X.6Fs r0 = r9.A01
            X.6nH r1 = new X.6nH
            r1.<init>(r9)
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01be }
            X.4sc r0 = new X.4sc     // Catch:{ RemoteException -> 0x01be }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01be }
            X.6a2 r2 = (X.C133816a2) r2     // Catch:{ RemoteException -> 0x01be }
            android.os.Parcel r1 = X.AnonymousClass6UO.A00(r0, r2)     // Catch:{ RemoteException -> 0x01be }
            r0 = 98
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x01be }
            X.6Fs r1 = r9.A01
            X.7sE r0 = new X.7sE
            r0.<init>(r9, r3)
            r1.A0E(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167325(0x7f07085d, float:1.794892E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.6Fs r0 = r9.A01
            r0.A08(r1, r1, r1, r1)
            android.os.Bundle r0 = r9.A00
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = "camera_zoom"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00fd
            android.os.Bundle r0 = r9.A00
            float r8 = r0.getFloat(r1)
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "camera_lat"
            double r4 = r1.getDouble(r0)
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "camera_lng"
            double r2 = r1.getDouble(r0)
            X.6Za r6 = r9.A0A
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "should_update_address"
            boolean r0 = r1.getBoolean(r0)
            r6.A0G = r0
            X.6Fs r1 = r9.A01
            com.google.android.gms.maps.model.LatLng r0 = X.C90524aI.A0F(r4, r2)
            X.5iH r0 = X.AnonymousClass6UP.A02(r0, r8)
            r1.A0A(r0)
        L_0x00fd:
            r0 = 0
            r9.A00 = r0
        L_0x0100:
            boolean r0 = X.AnonymousClass1RC.A0A(r9)
            if (r0 == 0) goto L_0x0112
            X.6Fs r1 = r9.A01
            r0 = 2132017188(0x7f140024, float:1.9672647E38)
            X.4s9 r0 = X.C98864s9.A00(r9, r0)
            r1.A0J(r0)
        L_0x0112:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "country_name"
            java.lang.String r3 = r1.getStringExtra(r0)
            if (r3 == 0) goto L_0x0182
            X.6Za r1 = r9.A0A
            r0 = 0
            r1.A08 = r0
            com.whatsapp.CircularProgressBar r0 = r1.A06
            r0.setVisibility(r7)
            X.0wU r2 = r9.A04
            r1 = 27
            X.751 r0 = new X.751
            r0.<init>(r1, r3, r9)
            r2.Boy(r0)
            return
        L_0x0135:
            X.6Za r1 = r9.A0A
            java.lang.Double r0 = r1.A09
            if (r0 == 0) goto L_0x0159
            java.lang.Double r2 = r1.A0A
            if (r2 == 0) goto L_0x0159
            java.lang.Float r3 = r1.A0B
            if (r3 == 0) goto L_0x0159
            double r0 = r0.doubleValue()
            com.google.android.gms.maps.model.LatLng r1 = X.C90484aE.A0S(r2, r0)
            X.6Fs r2 = r9.A01
            float r0 = r3.floatValue()
            X.5iH r0 = X.AnonymousClass6UP.A02(r1, r0)
        L_0x0155:
            r2.A0A(r0)
            goto L_0x0100
        L_0x0159:
            X.6Eo r0 = r9.A08
            X.6QG r2 = r0.A01()
            if (r2 != 0) goto L_0x016b
            X.6Sz r0 = r9.A09
            X.6QG r2 = r0.A00
            if (r2 != 0) goto L_0x016b
            X.6QG r2 = X.C132296Sz.A00(r0)
        L_0x016b:
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "city_default"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0100
            r1 = 1092616192(0x41200000, float:10.0)
            com.google.android.gms.maps.model.LatLng r0 = X.AnonymousClass6QG.A00(r2)
            X.6Fs r2 = r9.A01
            X.5iH r0 = X.AnonymousClass6UP.A02(r0, r1)
            goto L_0x0155
        L_0x0182:
            java.lang.String r0 = "latitude"
            r5 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r3 = r1.getDoubleExtra(r0, r5)
            java.lang.String r0 = "longitude"
            double r1 = r1.getDoubleExtra(r0, r5)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01ca
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01ca
            X.6Za r5 = r9.A0A
            r5.A0F = r7
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r5.A09 = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            r5.A0A = r0
            com.google.android.gms.maps.model.LatLng r2 = X.C90524aI.A0F(r3, r1)
            r0 = 1098907648(0x41800000, float:16.0)
            X.6Fs r1 = r9.A01
            X.C18740tg.A06(r1)
            X.5iH r0 = X.AnonymousClass6UP.A02(r2, r0)
            r1.A0A(r0)
            return
        L_0x01be:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x01c4:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A3i(X.6Fs):void");
    }

    public void BZ6(C1261662u r3, int i) {
        A07(new C163297py(this, 14), new C143546qj(this, r3), this, i);
    }

    public void BZ7(AnonymousClass6QG r6) {
        this.A0A.A08 = r6;
        try {
            this.A07.A01(r6);
            Bnv();
            setResult(-1);
            finish();
        } catch (Exception e) {
            C143536qi r3 = new C143536qi(this);
            Bnv();
            BO9(C90524aI.A0w(), R.string.f12nameremoved, R.string.f12nameremoved);
            r3.BOj();
            Log.e("DirectoryUserLocationPickerUI/onOptionsItemSelected Failed to store search location", e);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 34) {
            LocationSharingService.A02(getApplicationContext(), this.A0F);
            if (i2 == -1) {
                C133566Za r0 = this.A0A;
                r0.A0D = true;
                r0.A0J.A02(true);
                A0I(this);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r13 = r16
            r3 = r17
            super.onCreate(r3)
            r2 = 0
            if (r17 == 0) goto L_0x0012
            java.lang.String r0 = "zoom_to_user"
            boolean r0 = r3.getBoolean(r0, r2)
            r13.A0M = r0
        L_0x0012:
            X.60b r4 = r13.A02
            X.6pA r1 = r13.A05
            X.6p9 r0 = r13.A0H
            X.67j r0 = r4.A00(r0, r1)
            r13.A0J = r0
            X.0wQ r10 = r13.A02
            X.0yb r14 = r13.A08
            com.whatsapp.nativelibloader.WhatsAppLibLoader r15 = r13.A0I
            X.19m r9 = r13.A03
            X.6Eo r12 = r13.A08
            X.5DR r11 = r13.A07
            X.6Za r8 = new X.6Za
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r13.A0A = r8
            r8.A07 = r13
            r0 = 2131624832(0x7f0e0380, float:1.8876855E38)
            r13.setContentView((int) r0)
            r0 = 2131894082(0x7f121f42, float:1.9422959E38)
            r13.setTitle(r0)
            android.view.View r1 = r13.A00
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.07B r1 = X.C36431kI.A0Q(r13, r0)
            X.C18740tg.A06(r1)
            r0 = 1
            r1.A0V(r0)
            r1.A0U(r0)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r8.A0M
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "DirectoryUserLocationPickerUI/onCreate: aborting due to native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0065:
            r13.finish()
        L_0x0068:
            X.6Za r4 = r13.A0A
            android.view.View r1 = r13.A00
            r0 = 2131431857(0x7f0b11b1, float:1.8485455E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r1, r0)
            r4.A04 = r0
            X.AnonymousClass6II.A00(r13)
            com.google.android.gms.maps.GoogleMapOptions r4 = new com.google.android.gms.maps.GoogleMapOptions
            r4.<init>()
            r0 = 1
            r4.A00 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4.A0A = r1
            r4.A03 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A06 = r0
            r4.A04 = r1
            r4.A08 = r0
            r4.A07 = r0
            X.7pC r0 = new X.7pC
            r0.<init>(r13, r4, r13, r2)
            r13.A0E = r0
            android.view.View r1 = r13.A00
            r0 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.ViewGroup r1 = X.C36411kG.A0O(r1, r0)
            X.5B9 r0 = r13.A0E
            r1.addView(r0)
            X.5B9 r0 = r13.A0E
            r0.A05(r3)
            r13.A00 = r3
            X.6Fs r0 = r13.A01
            if (r0 != 0) goto L_0x00be
            X.5B9 r1 = r13.A0E
            X.7f7 r0 = r13.A0N
            X.6Fs r0 = r1.A08(r0)
            r13.A01 = r0
        L_0x00be:
            X.6Za r0 = r13.A0A
            android.widget.ImageView r1 = r0.A04
            r0 = 37
            X.C36361kB.A18(r1, r13, r0)
            X.6Za r0 = r13.A0A
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00d0
            r0.setVisibility(r2)
        L_0x00d0:
            X.6Za r3 = r13.A0A
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00e7
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.getHeight()
            android.view.animation.TranslateAnimation r1 = X.C90464aC.A0E(r0)
            android.view.View r0 = r3.A02
            r0.startAnimation(r1)
        L_0x00e7:
            X.6Za r0 = r13.A0A
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r2)
        L_0x00f0:
            return
        L_0x00f1:
            X.0wQ r0 = r8.A0I
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0065
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r5 = "ARG_LATITUDE"
            boolean r0 = r4.hasExtra(r5)
            if (r0 == 0) goto L_0x0124
            java.lang.String r7 = "ARG_LONGITUDE"
            boolean r0 = r4.hasExtra(r7)
            if (r0 == 0) goto L_0x0124
            r0 = 0
            double r5 = r4.getDoubleExtra(r5, r0)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r8.A09 = r5
            double r0 = r4.getDoubleExtra(r7, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r8.A0A = r0
        L_0x0124:
            r1 = 1098907648(0x41800000, float:16.0)
            java.lang.String r0 = "ARG_ZOOM_LEVEL"
            float r0 = r4.getFloatExtra(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.A0B = r0
            java.lang.String r1 = "ARG_FULL_ADDRESS"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r4.getStringExtra(r1)
            r8.A0C = r0
        L_0x0140:
            r0 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.View r0 = X.C03570Gk.A0B(r13, r0)
            com.whatsapp.CircularProgressBar r0 = (com.whatsapp.CircularProgressBar) r0
            r8.A06 = r0
            r0 = 2131430496(0x7f0b0c60, float:1.8482695E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r13, r0)
            r8.A05 = r0
            java.lang.String r0 = r8.A0C
            r8.A03(r0)
            X.6Eo r1 = r8.A0K
            boolean r0 = r1.A04()
            r8.A0D = r0
            boolean r0 = r1.A04()
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            r8.A0E = r0
            android.view.View r1 = r13.A00
            r0 = 2131431379(0x7f0b0fd3, float:1.8484486E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r8.A03 = r0
            r0 = 2131431385(0x7f0b0fd9, float:1.8484498E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A02 = r0
            r0 = 2131431382(0x7f0b0fd6, float:1.8484492E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A01 = r0
            android.view.View r1 = r13.A00
            r0 = 2131431857(0x7f0b11b1, float:1.8485455E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r1, r0)
            r8.A04 = r0
            X.155 r1 = r8.A07
            r0 = 2131435014(0x7f0b1e06, float:1.8491858E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.animation.LayoutTransition r1 = r0.getLayoutTransition()
            r0 = 4
            r1.enableTransitionType(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C133566Za r1 = this.A0A;
        if (i == 2) {
            C163297py r2 = new C163297py(r1, 17);
            C39001qm A002 = AnonymousClass3LW.A00(r1.A07);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0r(true);
            A002.A0h(r2, R.string.f12nameremoved);
            AnonymousClass0FM create = A002.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public void onDestroy() {
        this.A0E.A02();
        super.onDestroy();
    }

    public void onPause() {
        this.A0E.A03();
        AnonymousClass5B9 r0 = this.A0E;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0L = this.A0C.A05();
        C133566Za r1 = this.A0A;
        r1.A0H.A05(r1);
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.A01 != null) {
            bundle.putFloat("camera_zoom", this.A0A.A0B.floatValue());
            Double d = this.A0A.A09;
            if (d != null) {
                bundle.putDouble("camera_lat", d.doubleValue());
            }
            Double d2 = this.A0A.A0A;
            if (d2 != null) {
                bundle.putDouble("camera_lng", d2.doubleValue());
            }
            bundle.putBoolean("should_update_address", this.A0A.A0G);
            bundle.putInt("map_location_mode", this.A0E.A03);
        }
        bundle.putBoolean("zoom_to_user", this.A0M);
        this.A0E.A06(bundle);
        this.A0A.A03.setVisibility(0);
        super.onSaveInstanceState(bundle);
    }

    public DirectorySetLocationMapActivity(int i) {
        this.A0K = false;
        C163027pX.A00(this, 22);
    }

    private void A01() {
        Bnv();
        this.A0A.A06.setVisibility(8);
        this.A0A.A00();
    }

    public static void A07(DialogInterface.OnClickListener onClickListener, AnonymousClass7g2 r4, DirectorySetLocationMapActivity directorySetLocationMapActivity, int i) {
        directorySetLocationMapActivity.Bnv();
        if (i == -1) {
            directorySetLocationMapActivity.Bnv();
            C39001qm A002 = AnonymousClass3LW.A00(directorySetLocationMapActivity);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0h(onClickListener, R.string.f12nameremoved);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0b();
        } else if (i == 1 || i == 2 || i == 3) {
            directorySetLocationMapActivity.Bnv();
            directorySetLocationMapActivity.BO9(C90524aI.A0w(), R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i == 4) {
            C129426Gw.A00(directorySetLocationMapActivity, directorySetLocationMapActivity.A04, directorySetLocationMapActivity.A0B);
        } else {
            return;
        }
        r4.BOj();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, getString(R.string.f12nameremoved)).setShowAsAction(2);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        C17240qx r0 = this.A0E.A00.A01;
        if (r0 != null) {
            r0.onLowMemory();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        Bu1(R.string.f12nameremoved);
        if (!A0K(this)) {
            return true;
        }
        A0F(this);
        return true;
    }

    public void onResume() {
        C129186Fs r1;
        super.onResume();
        if (this.A0C.A05() != this.A0L && this.A0C.A05() && this.A0A.A0D && (r1 = this.A01) != null) {
            r1.A0L(true);
        }
        this.A0E.A04();
        this.A0E.A09();
        if (this.A01 == null) {
            this.A01 = this.A0E.A08(this.A0N);
        }
        C133566Za r12 = this.A0A;
        r12.A0H.A06(r12, "user-location-picker", 0.0f, 3, 5000, 1000);
    }

    public DirectorySetLocationMapActivity() {
        this(0);
        this.A0M = true;
        this.A0N = new C165457tS(this, 0);
    }
}
