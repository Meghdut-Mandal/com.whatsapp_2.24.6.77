package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass0FM;
import X.AnonymousClass13E;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1P5;
import X.AnonymousClass1Pp;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass2XH;
import X.AnonymousClass5B8;
import X.AnonymousClass6LW;
import X.AnonymousClass6O1;
import X.AnonymousClass7eQ;
import X.C03570Gk;
import X.C100954wJ;
import X.C114635hZ;
import X.C124515yJ;
import X.C1261362r;
import X.C130516Lj;
import X.C133586Zc;
import X.C134976bv;
import X.C134996bx;
import X.C135466ck;
import X.C139266jV;
import X.C162807pB;
import X.C162837pE;
import X.C165447tR;
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
import X.C27761Ps;
import X.C36381kD;
import X.C64813Pn;
import X.C64953Qc;
import X.C92794ej;
import X.C97634q1;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker extends C100954wJ {
    public float A00;
    public float A01;
    public Bundle A02;
    public C139266jV A03;
    public C114635hZ A04;
    public C114635hZ A05;
    public C97634q1 A06;
    public C237019m A07;
    public C20050ww A08;
    public AnonymousClass1X4 A09;
    public AnonymousClass1Pp A0A;
    public AnonymousClass185 A0B;
    public C235618y A0C;
    public C27761Ps A0D;
    public C64953Qc A0E;
    public C19630wG A0F;
    public C20830yE A0G;
    public C220412q A0H;
    public C1261362r A0I;
    public AnonymousClass6O1 A0J;
    public AnonymousClass1XN A0K;
    public EmojiSearchProvider A0L;
    public C21010yW A0M;
    public AnonymousClass13E A0N;
    public AnonymousClass5B8 A0O;
    public C133586Zc A0P;
    public AnonymousClass1P5 A0Q;
    public AnonymousClass2XH A0R;
    public WhatsAppLibLoader A0S;
    public C19890wg A0T;
    public AnonymousClass1A1 A0U;
    public C20380xT A0V;
    public C64813Pn A0W;
    public boolean A0X;
    public C114635hZ A0Y;
    public final AnonymousClass7eQ A0Z = new C165447tR(this, 3);

    public static void A01(C134976bv r3, LocationPicker locationPicker) {
        C18740tg.A06(locationPicker.A03);
        C97634q1 r0 = locationPicker.A06;
        if (r0 == null) {
            C130516Lj r2 = new C130516Lj();
            r2.A01 = r3;
            r2.A00 = locationPicker.A0Y;
            C139266jV r1 = locationPicker.A03;
            C97634q1 r02 = new C97634q1(r1, r2);
            r1.A0B(r02);
            r02.A0D = r1;
            locationPicker.A06 = r02;
            return;
        }
        r0.A0A(r3);
        locationPicker.A06.A05(true);
    }

    public void onBackPressed() {
        C133586Zc r2 = this.A0P;
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
        AnonymousClass6LW r1 = new AnonymousClass6LW(this.A08, this.A0M, this.A0N);
        C19630wG r30 = this.A0F;
        C19970wo r57 = this.A07;
        C20810yC r41 = this.A0D;
        AnonymousClass17Y r56 = this.A05;
        AnonymousClass1N2 r51 = this.A0C;
        C19700wN r55 = this.A03;
        C19730wQ r54 = this.A02;
        C19770wU r52 = this.A04;
        C220412q r34 = this.A0H;
        C20050ww r53 = this.A08;
        AnonymousClass1H2 r29 = this.A0C;
        AnonymousClass1X4 r27 = this.A09;
        AnonymousClass1XN r26 = this.A0K;
        AnonymousClass13E r24 = this.A0N;
        C24801Dv r22 = this.A01;
        AnonymousClass2XH r21 = this.A0R;
        AnonymousClass1Pp r23 = this.A0A;
        C20380xT r20 = this.A0V;
        C21060yb r28 = this.A08;
        C18820ts r19 = this.A00;
        C1261362r r18 = this.A0I;
        AnonymousClass1A1 r17 = this.A0U;
        EmojiSearchProvider emojiSearchProvider = this.A0L;
        AnonymousClass185 r14 = this.A0B;
        C20830yE r13 = this.A0G;
        C19420v0 r12 = this.A09;
        C237019m r11 = this.A07;
        AnonymousClass1P5 r10 = this.A0Q;
        C19890wg r9 = this.A0T;
        C27761Ps r8 = this.A0D;
        AnonymousClass6O1 r7 = this.A0J;
        AnonymousClass1N0 r6 = this.A0B;
        AnonymousClass1A1 r49 = r17;
        C20380xT r50 = r20;
        C162837pE r15 = new C162837pE(r22, r55, r11, r56, r54, r53, r27, r23, r14, this.A0C, r8, this.A0E, r28, r57, r30, r13, r12, r19, r34, r6, r18, r7, r26, r29, emojiSearchProvider, r41, r24, this, r10, r21, r1, this.A0S, r9, r49, r50, r51, r52);
        this.A0P = r15;
        r15.A0T(bundle2, this);
        C135466ck.A00(this.A0P.A0A, this, 3);
        this.A0R.A04(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red);
        this.A04 = C114635hZ.A00(decodeResource);
        this.A05 = C114635hZ.A00(decodeResource2);
        this.A0Y = C114635hZ.A00(this.A0P.A00);
        C124515yJ r4 = new C124515yJ();
        r4.A00 = 1;
        r4.A08 = true;
        r4.A05 = false;
        r4.A04 = "whatsapp_location_picker";
        this.A0O = new C162807pB(this, r4, this, 1);
        ((ViewGroup) C03570Gk.A0B(this, R.id.map_holder)).addView(this.A0O);
        this.A0O.A0F(bundle2);
        this.A02 = bundle2;
        if (this.A03 == null) {
            this.A03 = this.A0O.A0J(this.A0Z);
        }
        this.A0P.A0K = (ImageView) C03570Gk.A0B(this, R.id.my_location);
        C135466ck.A00(this.A0P.A0K, this, 4);
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A0J2 = this.A0P.A0J(i);
        if (A0J2 == null) {
            return super.onCreateDialog(i);
        }
        return A0J2;
    }

    public void onDestroy() {
        double d = C92794ej.A0n;
        this.A0P.A0K();
        if (this.A03 != null) {
            SharedPreferences.Editor A0G2 = C36381kD.A0G(this.A0T, C19430v1.A0A);
            C134996bx A022 = this.A03.A02();
            C134976bv r4 = A022.A03;
            A0G2.putFloat("share_location_lat", (float) r4.A00);
            A0G2.putFloat("share_location_lon", (float) r4.A01);
            A0G2.putFloat("share_location_zoom", A022.A02);
            A0G2.apply();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0P.A0Z(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        double d = C92794ej.A0n;
        AnonymousClass5B8 r0 = this.A0O;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        C133586Zc r1 = this.A0P;
        r1.A0f = r1.A18.A05();
        r1.A0z.A05(r1);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0P.A0i) {
            menu.findItem(R.id.menuitem_search).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0G.A05()) {
                findItem = menu.findItem(R.id.menuitem_search);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C139266jV r0 = this.A03;
        if (r0 != null) {
            C134996bx A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C134976bv r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0O.A02);
        }
        this.A0O.A0G(bundle);
        this.A0P.A0S(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0P.A0X.A01();
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_refresh).setShowAsAction(1);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0O.A0C();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0P.A0Q(intent);
    }

    public void onResume() {
        C139266jV r1;
        super.onResume();
        if (this.A0G.A05() != this.A0P.A0f) {
            invalidateOptionsMenu();
            if (this.A0G.A05() && (r1 = this.A03) != null && !this.A0P.A0i) {
                r1.A0D(true);
            }
        }
        double d = C92794ej.A0n;
        this.A0O.A0K();
        if (this.A03 == null) {
            this.A03 = this.A0O.A0J(this.A0Z);
        }
        this.A0P.A0L();
    }
}
