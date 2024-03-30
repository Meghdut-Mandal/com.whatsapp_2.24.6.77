package com.whatsapp.location;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass19J;
import X.AnonymousClass1A5;
import X.AnonymousClass1LI;
import X.AnonymousClass1ND;
import X.AnonymousClass1P5;
import X.AnonymousClass1PA;
import X.AnonymousClass1Pp;
import X.AnonymousClass2XH;
import X.AnonymousClass3UG;
import X.AnonymousClass5B9;
import X.AnonymousClass67D;
import X.AnonymousClass68Y;
import X.AnonymousClass6II;
import X.AnonymousClass6N8;
import X.AnonymousClass6UP;
import X.AnonymousClass7f7;
import X.C03570Gk;
import X.C129116Fg;
import X.C129186Fs;
import X.C135466ck;
import X.C142466ov;
import X.C1503074t;
import X.C159117iq;
import X.C162817pC;
import X.C162827pD;
import X.C163027pX;
import X.C163207pp;
import X.C163877qu;
import X.C164757sK;
import X.C165457tS;
import X.C17240qx;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19430v1;
import X.C19730wQ;
import X.C19890wg;
import X.C19970wo;
import X.C20830yE;
import X.C233117z;
import X.C237019m;
import X.C24361Cd;
import X.C24801Dv;
import X.C27731Pn;
import X.C27761Ps;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C63593Kq;
import X.C90464aC;
import X.C90484aE;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import X.C98844s7;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity2 extends AnonymousClass155 {
    public float A00;
    public int A01;
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public C159117iq A05;
    public C129186Fs A06;
    public C237019m A07;
    public AnonymousClass1LI A08;
    public AnonymousClass19J A09;
    public AnonymousClass1ND A0A;
    public C24361Cd A0B;
    public AnonymousClass1Pp A0C;
    public AnonymousClass16D A0D;
    public AnonymousClass16I A0E;
    public AnonymousClass171 A0F;
    public C27731Pn A0G;
    public C27761Ps A0H;
    public C20830yE A0I;
    public AnonymousClass1A5 A0J;
    public AnonymousClass17X A0K;
    public AnonymousClass16J A0L;
    public C233117z A0M;
    public AnonymousClass5B9 A0N;
    public C142466ov A0O;
    public AnonymousClass1P5 A0P;
    public AnonymousClass2XH A0Q;
    public AnonymousClass1PA A0R;
    public C19890wg A0S;
    public Map A0T;
    public Set A0U;
    public boolean A0V;
    public final AnonymousClass7f7 A0W;
    public volatile boolean A0X;
    public volatile boolean A0Y;

    public static float A01(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C129186Fs r0 = groupChatLiveLocationsActivity2.A06;
        C18740tg.A06(r0);
        C98844s7 A022 = r0.A00().A02();
        Location location = new Location("");
        LatLng latLng = A022.A02;
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        Location location2 = new Location("");
        LatLng latLng2 = A022.A03;
        location2.setLatitude(latLng2.A00);
        location2.setLongitude(latLng2.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float log = (float) (((double) groupChatLiveLocationsActivity2.A06.A02().A02) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    private void A0F(AnonymousClass67D r6, boolean z) {
        C18740tg.A06(this.A06);
        LatLngBounds A002 = r6.A00();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = dimensionPixelSize * 2;
        if (this.A0N.getHeight() > i && this.A0N.getWidth() > i) {
            if (!z) {
                this.A06.A05();
                this.A06.A0A(AnonymousClass6UP.A03(A002, dimensionPixelSize));
                this.A0N.postDelayed(new C1503074t((Object) this, 0), 500);
            } else if (!this.A0X) {
                this.A0X = true;
                this.A06.A05();
                this.A06.A0B(AnonymousClass6UP.A03(A002, dimensionPixelSize), this.A05);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(com.whatsapp.location.GroupChatLiveLocationsActivity2 r12) {
        /*
            X.6Fs r2 = r12.A06
            if (r2 == 0) goto L_0x0147
            X.6ov r1 = r12.A0O
            X.3Kq r0 = r1.A0P
            r4 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0116
            X.3Kq r0 = r1.A0O
            if (r0 != 0) goto L_0x0116
            X.0yE r0 = r12.A0I
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.6Fs r0 = r12.A06
            r0.A0L(r6)
        L_0x001d:
            X.5B9 r0 = r12.A0N
            int r1 = r0.getWidth()
            X.5B9 r0 = r12.A0N
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            java.util.Set r3 = r12.A0U
            java.util.ArrayList r11 = X.C36441kJ.A15(r3)
            r3.clear()
            X.6Fs r0 = r12.A06
            X.68Y r2 = r0.A00()
            X.6ov r1 = r12.A0O
            X.6Fs r0 = r12.A06
            r0.A02()
            X.6Nv r0 = new X.6Nv
            r0.<init>((X.AnonymousClass68Y) r2)
            r1.A0X(r0)
            X.6ov r0 = r12.A0O
            java.util.List r0 = r0.A18
            java.util.Iterator r10 = r0.iterator()
        L_0x0053:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r5 = r10.next()
            X.6N8 r5 = (X.AnonymousClass6N8) r5
            java.util.Map r9 = r12.A0T
            java.lang.String r8 = r5.A03
            java.lang.Object r2 = r9.get(r8)
            X.6Fg r2 = (X.C129116Fg) r2
            com.google.android.gms.maps.model.LatLng r1 = r5.A00()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r7 = r2.A01()
            boolean r0 = r7 instanceof X.AnonymousClass6N8
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r2.A09()
            if (r0 != 0) goto L_0x0080
            r2.A08(r6)
        L_0x0080:
            r2.A05(r1)
            X.6N8 r7 = (X.AnonymousClass6N8) r7
            int r1 = r7.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0091
            int r1 = r7.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x00a7
        L_0x0091:
            X.6ov r0 = r12.A0O
            android.graphics.Bitmap r1 = r0.A0G(r5)
            X.6ov r0 = r12.A0O
            java.lang.String r0 = r0.A0M(r5)
            r2.A07(r0)
            X.5iI r0 = X.C112965ek.A00(r1)
            r2.A04(r0)
        L_0x00a7:
            int r0 = r5.A00
            if (r0 != r6) goto L_0x00ae
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x00ba
        L_0x00ae:
            java.util.List r0 = r5.A04
            int r0 = r0.size()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r6) goto L_0x00ba
            r8 = 1112014848(0x42480000, float:50.0)
        L_0x00ba:
            X.7me r7 = r2.A00     // Catch:{ RemoteException -> 0x011b }
            X.6a2 r7 = (X.C133816a2) r7     // Catch:{ RemoteException -> 0x011b }
            android.os.Parcel r1 = X.C133816a2.A00(r7)     // Catch:{ RemoteException -> 0x011b }
            r1.writeFloat(r8)     // Catch:{ RemoteException -> 0x011b }
            r0 = 27
            r7.A03(r0, r1)     // Catch:{ RemoteException -> 0x011b }
            r2.A06(r5)
            X.3Kq r1 = r5.A02
            X.6ov r0 = r12.A0O
            X.3Kq r0 = r0.A0Q
            if (r1 != r0) goto L_0x00dd
            r2.A03()
        L_0x00d8:
            r3.add(r2)
            goto L_0x0053
        L_0x00dd:
            r2.A02()
            goto L_0x00d8
        L_0x00e1:
            com.google.android.gms.maps.model.LatLng r7 = r5.A00()
            X.6ov r0 = r12.A0O
            android.graphics.Bitmap r0 = r0.A0G(r5)
            X.4sB r2 = new X.4sB
            r2.<init>()
            X.5iI r0 = X.C112965ek.A00(r0)
            r2.A07 = r0
            X.6ov r0 = r12.A0O
            java.lang.String r0 = r0.A0M(r5)
            r2.A09 = r0
            r1 = 1063172178(0x3f5eb852, float:0.87)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A00 = r0
            r2.A01 = r1
            X.6Fs r0 = r12.A06
            X.C18740tg.A06(r0)
            r2.A08 = r7
            X.6Fg r2 = r0.A03(r2)
            r9.put(r8, r2)
            goto L_0x00a7
        L_0x0116:
            r2.A0L(r4)
            goto L_0x001d
        L_0x011b:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x0121:
            java.util.Iterator r2 = r11.iterator()
        L_0x0125:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r1 = r2.next()
            X.6Fg r1 = (X.C129116Fg) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0125
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x0125
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x0125
            r1.A08(r4)
            goto L_0x0125
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A0G(com.whatsapp.location.GroupChatLiveLocationsActivity2):void");
    }

    public static void A0H(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, List list, boolean z) {
        C18740tg.A06(groupChatLiveLocationsActivity2.A06);
        if (list.size() != 1) {
            AnonymousClass67D r5 = new AnonymousClass67D();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C63593Kq r0 = (C63593Kq) it.next();
                r5.A01(C90524aI.A0F(r0.A00, r0.A01));
            }
            groupChatLiveLocationsActivity2.A0F(r5, z);
        } else if (!z) {
            groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass6UP.A02(C90524aI.A0F(((C63593Kq) list.get(0)).A00, ((C63593Kq) list.get(0)).A01), 16.0f));
        } else if (!groupChatLiveLocationsActivity2.A0X) {
            groupChatLiveLocationsActivity2.A0X = true;
            groupChatLiveLocationsActivity2.A06.A0B(AnonymousClass6UP.A02(C90524aI.A0F(((C63593Kq) list.get(0)).A00, ((C63593Kq) list.get(0)).A01), 16.0f), groupChatLiveLocationsActivity2.A05);
        }
    }

    public static void A0I(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        if (groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0O.A0W) {
            Set set = groupChatLiveLocationsActivity2.A0U;
            if (set.isEmpty()) {
                return;
            }
            if (groupChatLiveLocationsActivity2.A0N.getWidth() <= 0 || groupChatLiveLocationsActivity2.A0N.getHeight() <= 0) {
                C164757sK.A00(groupChatLiveLocationsActivity2.A0N.getViewTreeObserver(), groupChatLiveLocationsActivity2, 10);
            } else if (!z || !groupChatLiveLocationsActivity2.A0X) {
                ArrayList A15 = C36441kJ.A15(set);
                C18740tg.A06(groupChatLiveLocationsActivity2.A06);
                if (!A15.isEmpty()) {
                    LatLng A0I2 = groupChatLiveLocationsActivity2.A0O.A0I();
                    if (A0I2 != null) {
                        Collections.sort(A15, new C163877qu(A0I2.A00, A0I2.A01, 1));
                    }
                    AnonymousClass67D r7 = new AnonymousClass67D();
                    AnonymousClass67D r6 = new AnonymousClass67D();
                    r6.A01(((C129116Fg) A15.get(0)).A00());
                    r7.A01(((C129116Fg) A15.get(0)).A00());
                    int i = 1;
                    while (i < A15.size()) {
                        C129116Fg r1 = (C129116Fg) A15.get(i);
                        r6.A01(r1.A00());
                        if (!C142466ov.A0F(r6.A00())) {
                            break;
                        }
                        r7.A01(r1.A00());
                        i++;
                    }
                    if (i == 1) {
                        Object A012 = ((C129116Fg) A15.get(0)).A01();
                        C18740tg.A06(A012);
                        A0H(groupChatLiveLocationsActivity2, ((AnonymousClass6N8) A012).A04, z);
                        return;
                    }
                    groupChatLiveLocationsActivity2.A0F(r7, z);
                }
            } else {
                groupChatLiveLocationsActivity2.A0Y = true;
            }
        }
    }

    public static boolean A0J(LatLng latLng, GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        C129186Fs r0 = groupChatLiveLocationsActivity2.A06;
        C18740tg.A06(r0);
        AnonymousClass68Y A002 = r0.A00();
        if (A002.A02().A04.A00(latLng)) {
            return false;
        }
        if (latLng.A00 >= A002.A02().A04.A01.A00) {
            return true;
        }
        Point A003 = A002.A00(A002.A02().A04.A01);
        A003.offset(0, groupChatLiveLocationsActivity2.A0O.A00);
        return !new LatLngBounds(A002.A01(A003), A002.A02().A04.A00).A00(latLng);
    }

    public void A2F() {
        if (!this.A0V) {
            this.A0V = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C90464aC.A0y(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A0A = C36391kE.A0Y(A0B2);
            this.A0G = C36351kA.A0T(A0B2);
            this.A0Q = C36411kG.A0m(A0B2);
            this.A0C = C36361kB.A0V(A0B2);
            this.A0D = C36341k9.A0R(A0B2);
            this.A0F = C36341k9.A0S(A0B2);
            this.A0E = C36351kA.A0S(A0B2);
            this.A0L = (AnonymousClass16J) A0B2.A57.get();
            this.A0B = (C24361Cd) A0B2.A1j.get();
            this.A0I = C36351kA.A0X(A0B2);
            this.A07 = C90484aE.A0T(A0B2);
            this.A0P = C36411kG.A0l(A0B2);
            this.A0K = C36351kA.A0b(A0B2);
            this.A0S = C36351kA.A0m(A0B2);
            this.A0J = C36371kC.A0X(A0B2);
            this.A0H = C90504aG.A0M(A0B2);
            this.A0M = (C233117z) A0B2.A3w.get();
            this.A08 = C36361kB.A0S(A0B2);
            this.A0R = (AnonymousClass1PA) A0B2.A4X.get();
            this.A09 = C90514aH.A0Z(A0B2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0O.A0Z(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C19970wo r28 = this.A07;
        AnonymousClass17Y r38 = this.A05;
        C19730wQ r21 = this.A02;
        C24801Dv r20 = this.A01;
        C27731Pn r19 = this.A0G;
        AnonymousClass2XH r18 = this.A0Q;
        AnonymousClass1Pp r17 = this.A0C;
        AnonymousClass171 r15 = this.A0F;
        C18820ts r12 = this.A00;
        AnonymousClass16I r11 = this.A0E;
        AnonymousClass16J r10 = this.A0L;
        AnonymousClass19J r9 = this.A09;
        C24361Cd r8 = this.A0B;
        C20830yE r7 = this.A0I;
        C237019m r6 = this.A07;
        AnonymousClass1P5 r5 = this.A0P;
        C27761Ps r4 = this.A0H;
        C233117z r3 = this.A0M;
        C24801Dv r16 = r20;
        C237019m r172 = r6;
        AnonymousClass17Y r182 = r38;
        C19730wQ r192 = r21;
        AnonymousClass19J r202 = r9;
        C24361Cd r212 = r8;
        this.A0O = new C162827pD(r16, r172, r182, r192, r202, r212, r17, this.A0D, r11, r15, r19, r4, r28, r7, r12, r10, r3, r5, r18, this.A0R, this, 1);
        getSupportActionBar().A0U(true);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1A5 r2 = this.A0J;
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        C18740tg.A06(A0F2);
        AnonymousClass141 A012 = r2.A01(A0F2);
        getSupportActionBar().A0Q(AnonymousClass3UG.A05(this, this.A0C, this.A0F.A0H(A012)));
        this.A0O.A0U(this, bundle2);
        AnonymousClass6II.A00(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A03 = C36381kD.A0j();
        googleMapOptions.A06 = true;
        googleMapOptions.A04 = true;
        googleMapOptions.A08 = true;
        googleMapOptions.A07 = true;
        this.A0N = new C162817pC(this, googleMapOptions, this, 1);
        ((ViewGroup) C03570Gk.A0B(this, R.id.map_holder)).addView(this.A0N);
        this.A0N.A05(bundle2);
        ImageView imageView = (ImageView) C03570Gk.A0B(this, R.id.my_location);
        this.A04 = imageView;
        C135466ck.A00(imageView, this, 1);
        this.A02 = bundle2;
        A07();
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A0H2 = this.A0O.A0H(i);
        if (A0H2 == null) {
            return super.onCreateDialog(i);
        }
        return A0H2;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putBoolean;
        C129186Fs r0;
        int i;
        if (this.A06 != null) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.map_type_normal) {
                this.A06.A07(1);
                putBoolean = C36381kD.A0G(this.A0S, C19430v1.A0A).putInt("live_location_map_type", 1);
            } else {
                if (itemId == R.id.map_type_satellite) {
                    r0 = this.A06;
                    i = 4;
                } else if (itemId == R.id.map_type_terrain) {
                    r0 = this.A06;
                    i = 3;
                } else if (itemId == R.id.map_traffic) {
                    boolean z = !this.A06.A0N();
                    this.A06.A0M(z);
                    this.A03.setChecked(z);
                    putBoolean = C36381kD.A0G(this.A0S, C19430v1.A0A).putBoolean("live_location_show_traffic", z);
                } else if (itemId == 16908332) {
                    finish();
                    return true;
                }
                r0.A07(i);
                putBoolean = C36381kD.A0G(this.A0S, C19430v1.A0A).putInt("live_location_map_type", i);
            }
            putBoolean.apply();
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C129186Fs r0 = this.A06;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0N.A03);
        }
        this.A0N.A06(bundle);
        this.A0O.A0V(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity2(int i) {
        this.A0V = false;
        C163027pX.A00(this, 31);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0I.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07() {
        /*
            r3 = this;
            X.C18740tg.A01()
            X.6Fs r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            X.5B9 r1 = r3.A0N
            X.7f7 r0 = r3.A0W
            X.6Fs r0 = r1.A08(r0)
            r3.A06 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A04
            X.6ov r0 = r3.A0O
            X.3Kq r0 = r0.A0O
            if (r0 != 0) goto L_0x0022
            X.0yE r0 = r3.A0I
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A07():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C129186Fs r0;
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.map_traffic);
        this.A03 = findItem;
        if (findItem == null || (r0 = this.A06) == null) {
            return true;
        }
        findItem.setChecked(r0.A0N());
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0N.A02();
        this.A0O.A0P();
        if (this.A06 != null) {
            SharedPreferences.Editor A0G2 = C36381kD.A0G(this.A0S, C19430v1.A0A);
            CameraPosition A022 = this.A06.A02();
            LatLng latLng = A022.A03;
            A0G2.putFloat("live_location_lat", (float) latLng.A00);
            A0G2.putFloat("live_location_lng", (float) latLng.A01);
            A0G2.putFloat("live_location_zoom", A022.A02);
            A0G2.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        C17240qx r0 = this.A0N.A00.A01;
        if (r0 != null) {
            r0.onLowMemory();
        }
    }

    public void onPause() {
        super.onPause();
        this.A0N.A03();
        AnonymousClass5B9 r0 = this.A0N;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0O.A0Q();
    }

    public void onResume() {
        super.onResume();
        this.A0N.A04();
        this.A0N.A09();
        this.A0O.A0R();
        A07();
    }

    public GroupChatLiveLocationsActivity2() {
        this(0);
        this.A0U = C36441kJ.A16();
        this.A0T = AnonymousClass001.A0J();
        this.A01 = 0;
        this.A00 = -1.0f;
        this.A0Y = false;
        this.A05 = new C163207pp(this, 1);
        this.A0W = new C165457tS(this, 2);
    }
}
