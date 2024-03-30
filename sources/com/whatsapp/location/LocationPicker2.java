package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass0FM;
import X.AnonymousClass13E;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1GZ;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1P5;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V7;
import X.AnonymousClass1V9;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass2XH;
import X.AnonymousClass3HF;
import X.AnonymousClass3MR;
import X.AnonymousClass3UF;
import X.AnonymousClass3UR;
import X.AnonymousClass5B9;
import X.AnonymousClass6II;
import X.AnonymousClass6LW;
import X.AnonymousClass6O1;
import X.AnonymousClass7f7;
import X.C012005e;
import X.C03570Gk;
import X.C100944wI;
import X.C112965ek;
import X.C115075iI;
import X.C117345m7;
import X.C1261362r;
import X.C129116Fg;
import X.C129186Fs;
import X.C133586Zc;
import X.C135466ck;
import X.C162817pC;
import X.C162837pE;
import X.C165457tS;
import X.C17240qx;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C19430v1;
import X.C19630wG;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20050ww;
import X.C20380xT;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21060yb;
import X.C220412q;
import X.C235618y;
import X.C237019m;
import X.C24801Dv;
import X.C27731Pn;
import X.C27761Ps;
import X.C36381kD;
import X.C64813Pn;
import X.C64953Qc;
import X.C98884sB;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker2 extends C100944wI {
    public Bundle A00;
    public View A01;
    public C129186Fs A02;
    public C115075iI A03;
    public C115075iI A04;
    public C129116Fg A05;
    public C237019m A06;
    public C20050ww A07;
    public AnonymousClass1X4 A08;
    public AnonymousClass1Pp A09;
    public AnonymousClass16D A0A;
    public AnonymousClass185 A0B;
    public AnonymousClass171 A0C;
    public C235618y A0D;
    public AnonymousClass1RY A0E;
    public C27731Pn A0F;
    public C27761Ps A0G;
    public C64953Qc A0H;
    public AnonymousClass3HF A0I;
    public AnonymousClass1V6 A0J;
    public C19630wG A0K;
    public C20830yE A0L;
    public C220412q A0M;
    public C1261362r A0N;
    public AnonymousClass6O1 A0O;
    public AnonymousClass1XN A0P;
    public EmojiSearchProvider A0Q;
    public C21010yW A0R;
    public AnonymousClass1GZ A0S;
    public AnonymousClass13E A0T;
    public C117345m7 A0U;
    public AnonymousClass5B9 A0V;
    public C133586Zc A0W;
    public AnonymousClass1P5 A0X;
    public AnonymousClass2XH A0Y;
    public WhatsAppLibLoader A0Z;
    public C19890wg A0a;
    public AnonymousClass1A1 A0b;
    public C20380xT A0c;
    public C64813Pn A0d;
    public AnonymousClass005 A0e;
    public AnonymousClass005 A0f;
    public boolean A0g;
    public C115075iI A0h;
    public BottomSheetBehavior A0i;
    public final AnonymousClass7f7 A0j = new C165457tS(this, 3);

    public static void A01(LatLng latLng, LocationPicker2 locationPicker2) {
        C129186Fs r2 = locationPicker2.A02;
        C18740tg.A06(r2);
        C129116Fg r0 = locationPicker2.A05;
        if (r0 == null) {
            C98884sB r1 = new C98884sB();
            r1.A08 = latLng;
            r1.A07 = locationPicker2.A0h;
            locationPicker2.A05 = r2.A03(r1);
            return;
        }
        r0.A05(latLng);
        locationPicker2.A05.A08(true);
    }

    public void onBackPressed() {
        this.A0e.get();
        C133586Zc r2 = this.A0W;
        if (AnonymousClass000.A1Q(r2.A0X.A07.getVisibility())) {
            r2.A0X.A02(true);
            return;
        }
        r2.A0T.A05.dismiss();
        if (r2.A0i) {
            C133586Zc.A08(r2);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.f12nameremoved);
        AnonymousClass6LW r1 = new AnonymousClass6LW(this.A07, this.A0R, this.A0T);
        C19630wG r30 = this.A0K;
        C19970wo r57 = this.A07;
        C20810yC r41 = this.A0D;
        AnonymousClass17Y r56 = this.A05;
        AnonymousClass1N2 r51 = this.A0C;
        C19700wN r55 = this.A03;
        C19730wQ r54 = this.A02;
        C19770wU r52 = this.A04;
        C220412q r34 = this.A0M;
        C20050ww r53 = this.A07;
        AnonymousClass1H2 r29 = this.A0C;
        AnonymousClass1X4 r27 = this.A08;
        AnonymousClass1XN r26 = this.A0P;
        AnonymousClass13E r24 = this.A0T;
        C24801Dv r22 = this.A01;
        AnonymousClass2XH r21 = this.A0Y;
        AnonymousClass1Pp r23 = this.A09;
        C20380xT r20 = this.A0c;
        C21060yb r28 = this.A08;
        C18820ts r19 = this.A00;
        C1261362r r18 = this.A0N;
        AnonymousClass1A1 r17 = this.A0b;
        EmojiSearchProvider emojiSearchProvider = this.A0Q;
        AnonymousClass185 r14 = this.A0B;
        C20830yE r13 = this.A0L;
        C19420v0 r12 = this.A09;
        C237019m r11 = this.A06;
        AnonymousClass1P5 r10 = this.A0X;
        C19890wg r9 = this.A0a;
        C27761Ps r8 = this.A0G;
        AnonymousClass6O1 r7 = this.A0O;
        AnonymousClass1N0 r6 = this.A0B;
        AnonymousClass1A1 r49 = r17;
        C20380xT r50 = r20;
        C162837pE r15 = new C162837pE(r22, r55, r11, r56, r54, r53, r27, r23, r14, this.A0D, r8, this.A0H, r28, r57, r30, r13, r12, r19, r34, r6, r18, r7, r26, r29, emojiSearchProvider, r41, r24, this, r10, r21, r1, this.A0Z, r9, r49, r50, r51, r52);
        this.A0W = r15;
        r15.A0T(bundle2, this);
        C135466ck.A00(this.A0W.A0A, this, 5);
        AnonymousClass6II.A00(this);
        this.A03 = C112965ek.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green));
        this.A04 = C112965ek.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red));
        this.A0h = C112965ek.A00(this.A0W.A00);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        Boolean A0j2 = C36381kD.A0j();
        googleMapOptions.A0A = A0j2;
        googleMapOptions.A03 = A0j2;
        googleMapOptions.A06 = true;
        googleMapOptions.A04 = A0j2;
        googleMapOptions.A08 = true;
        googleMapOptions.A07 = true;
        this.A0V = new C162817pC(this, googleMapOptions, this, 2);
        ((ViewGroup) C03570Gk.A0B(this, R.id.map_holder)).addView(this.A0V);
        this.A0V.A05(bundle2);
        this.A00 = bundle2;
        if (this.A02 == null) {
            this.A02 = this.A0V.A08(this.A0j);
        }
        this.A0W.A0K = (ImageView) C03570Gk.A0B(this, R.id.my_location);
        C135466ck.A00(this.A0W.A0K, this, 6);
        boolean A002 = AnonymousClass3MR.A00(this.A0D);
        this.A0g = A002;
        if (A002) {
            View A022 = C012005e.A02(this.A00, R.id.main);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0i = bottomSheetBehavior;
            this.A0d.A02(A022, bottomSheetBehavior, this, this.A0C);
        }
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A0J2 = this.A0W.A0J(i);
        if (A0J2 == null) {
            return super.onCreateDialog(i);
        }
        return A0J2;
    }

    public void onDestroy() {
        this.A0V.A02();
        this.A0W.A0K();
        if (this.A02 != null) {
            SharedPreferences.Editor A0G2 = C36381kD.A0G(this.A0a, C19430v1.A0A);
            CameraPosition A022 = this.A02.A02();
            LatLng latLng = A022.A03;
            A0G2.putFloat("share_location_lat", (float) latLng.A00);
            A0G2.putFloat("share_location_lon", (float) latLng.A01);
            A0G2.putFloat("share_location_zoom", A022.A02);
            A0G2.apply();
        }
        AnonymousClass3UR.A02(this.A01, this.A0J);
        AnonymousClass1RY r0 = this.A0E;
        if (r0 != null) {
            r0.A02();
            this.A0E = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0W.A0Z(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        this.A0V.A03();
        AnonymousClass5B9 r0 = this.A0V;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        C133586Zc r1 = this.A0W;
        r1.A0f = r1.A18.A05();
        r1.A0z.A05(r1);
        AnonymousClass3UR.A07(this.A0J);
        ((AnonymousClass1V7) this.A0e.get()).A01(this.A00);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0W.A0i) {
            menu.findItem(R.id.menuitem_search).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0L.A05()) {
                findItem = menu.findItem(R.id.menuitem_search);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onResume() {
        C129186Fs r1;
        super.onResume();
        if (this.A0L.A05() != this.A0W.A0f) {
            invalidateOptionsMenu();
            if (this.A0L.A05() && (r1 = this.A02) != null && !this.A0W.A0i) {
                r1.A0L(true);
            }
        }
        this.A0V.A04();
        this.A0V.A09();
        if (this.A02 == null) {
            this.A02 = this.A0V.A08(this.A0j);
        }
        this.A0W.A0L();
        boolean z = ((AnonymousClass1V7) this.A0e.get()).A03;
        View view = this.A00;
        if (z) {
            C20810yC r15 = this.A0D;
            AnonymousClass17Y r13 = this.A05;
            C19730wQ r12 = this.A02;
            C19770wU r11 = this.A04;
            C27731Pn r10 = this.A0F;
            AnonymousClass16D r9 = this.A0A;
            AnonymousClass171 r8 = this.A0C;
            C18820ts r7 = this.A00;
            AnonymousClass3HF r6 = this.A0I;
            AnonymousClass1V6 r5 = this.A0J;
            AnonymousClass005 r4 = this.A0e;
            AnonymousClass005 r3 = this.A0f;
            View view2 = this.A01;
            AnonymousClass1RY r14 = this.A0E;
            C19420v0 r25 = this.A09;
            AnonymousClass1V6 r24 = r5;
            AnonymousClass3HF r23 = r6;
            C27731Pn r22 = r10;
            AnonymousClass1RY r21 = r14;
            AnonymousClass171 r20 = r8;
            AnonymousClass16D r19 = r9;
            C19730wQ r18 = r12;
            AnonymousClass17Y r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "location-picker-activity");
            this.A01 = (View) A002.first;
            this.A0E = (AnonymousClass1RY) A002.second;
        } else if (AnonymousClass1V9.A00(view)) {
            AnonymousClass3UR.A04(this.A00, this.A0J, this.A0e);
        }
        ((AnonymousClass1V7) this.A0e.get()).A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C129186Fs r0 = this.A02;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0V.A03);
        }
        this.A0V.A06(bundle);
        this.A0W.A0S(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0W.A0X.A01();
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_search);
        if (this.A0g) {
            icon.setIcon(R.drawable.ic_search_normal);
        }
        icon.setShowAsAction(2);
        MenuItem icon2 = menu.add(0, 1, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_refresh);
        if (this.A0g) {
            icon2.setIcon(AnonymousClass3UF.A04(this, C36381kD.A0H(this, R.drawable.ic_action_refresh_bottom_sheet), R.color.f6nameremoved));
        }
        icon2.setShowAsAction(1);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        C17240qx r0 = this.A0V.A00.A01;
        if (r0 != null) {
            r0.onLowMemory();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0W.A0Q(intent);
    }

    public void onStart() {
        super.onStart();
        if (this.A0g) {
            this.A0d.A03(this.A0i, this);
        }
    }
}
