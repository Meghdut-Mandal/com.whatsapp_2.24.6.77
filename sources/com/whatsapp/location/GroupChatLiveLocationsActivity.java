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
import X.AnonymousClass5B8;
import X.AnonymousClass6N8;
import X.AnonymousClass6OA;
import X.AnonymousClass7eQ;
import X.C03570Gk;
import X.C124515yJ;
import X.C1264964g;
import X.C128446Ch;
import X.C134976bv;
import X.C134996bx;
import X.C135076c5;
import X.C135466ck;
import X.C139266jV;
import X.C142466ov;
import X.C158997ia;
import X.C162807pB;
import X.C162827pD;
import X.C163027pX;
import X.C163197po;
import X.C163877qu;
import X.C164757sK;
import X.C165447tR;
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
import X.C92794ej;
import X.C97634q1;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity extends AnonymousClass155 {
    public float A00;
    public int A01;
    public Bundle A02;
    public ImageView A03;
    public C158997ia A04;
    public C139266jV A05;
    public C237019m A06;
    public AnonymousClass1LI A07;
    public AnonymousClass19J A08;
    public AnonymousClass1ND A09;
    public C24361Cd A0A;
    public AnonymousClass1Pp A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass16I A0D;
    public AnonymousClass171 A0E;
    public C27731Pn A0F;
    public C27761Ps A0G;
    public C20830yE A0H;
    public AnonymousClass1A5 A0I;
    public AnonymousClass17X A0J;
    public AnonymousClass16J A0K;
    public C233117z A0L;
    public AnonymousClass5B8 A0M;
    public C142466ov A0N;
    public AnonymousClass1P5 A0O;
    public AnonymousClass2XH A0P;
    public AnonymousClass1PA A0Q;
    public C19890wg A0R;
    public Map A0S;
    public Set A0T;
    public boolean A0U;
    public final AnonymousClass7eQ A0V;
    public volatile boolean A0W;
    public volatile boolean A0X;

    public static float A01(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C139266jV r0 = groupChatLiveLocationsActivity.A05;
        C18740tg.A06(r0);
        C128446Ch A062 = r0.A0R.A06();
        Location location = new Location("");
        C134976bv r2 = A062.A02;
        location.setLatitude(r2.A00);
        location.setLongitude(r2.A01);
        Location location2 = new Location("");
        C134976bv r22 = A062.A03;
        location2.setLatitude(r22.A00);
        location2.setLongitude(r22.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float A002 = (float) (((double) C134996bx.A00(groupChatLiveLocationsActivity.A05)) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (A002 > 16.0f) {
            return 16.0f;
        }
        return A002;
    }

    private void A0F(AnonymousClass6OA r16, boolean z) {
        C1264964g r2;
        C18740tg.A06(this.A05);
        C135076c5 A002 = r16.A00();
        C134976bv A003 = A002.A00();
        int width = this.A0M.getWidth();
        int height = this.A0M.getHeight();
        LatLngBounds latLngBounds = new LatLngBounds(C134976bv.A03(A002.A01), C134976bv.A03(A002.A00));
        LatLng latLng = latLngBounds.A00;
        double A004 = C142466ov.A00(latLng.A00);
        LatLng latLng2 = latLngBounds.A01;
        double A005 = (A004 - C142466ov.A00(latLng2.A00)) / 3.141592653589793d;
        double d = latLng.A01 - latLng2.A01;
        if (d < 0.0d) {
            d += 360.0d;
        }
        float min = (float) Math.min(Math.log((((double) height) / 256.0d) / A005) / 0.6931471805599453d, Math.log((((double) width) / 256.0d) / (d / 360.0d)) / 0.6931471805599453d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = dimensionPixelSize * 2;
        if (this.A0M.getHeight() > i && this.A0M.getWidth() > i) {
            if (z) {
                this.A0W = true;
                int i2 = (min > 21.0f ? 1 : (min == 21.0f ? 0 : -1));
                C139266jV r3 = this.A05;
                if (i2 > 0) {
                    r2 = C1264964g.A00(A003, 19.0f);
                } else {
                    r2 = new C1264964g();
                    r2.A07 = A002;
                    r2.A05 = dimensionPixelSize;
                }
                r3.A0A(r2, this.A04, 1500);
                return;
            }
            this.A05.A09(C1264964g.A00(A003, Math.min(19.0f, min)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(com.whatsapp.location.GroupChatLiveLocationsActivity r15) {
        /*
            X.6jV r2 = r15.A05
            if (r2 == 0) goto L_0x0194
            X.6ov r1 = r15.A0N
            X.3Kq r0 = r1.A0P
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x016d
            X.3Kq r0 = r1.A0O
            if (r0 != 0) goto L_0x016d
            X.0yE r0 = r15.A0H
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.6jV r0 = r15.A05
            r0.A0D(r8)
        L_0x001d:
            X.5B8 r0 = r15.A0M
            int r1 = r0.getWidth()
            X.5B8 r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0194
            if (r0 == 0) goto L_0x0194
            java.util.Set r3 = r15.A0T
            java.util.ArrayList r14 = X.C36441kJ.A15(r3)
            r3.clear()
            X.6jV r0 = r15.A05
            X.6WY r7 = r0.A0R
            X.6ov r1 = r15.A0N
            r0.A02()
            X.6Nv r0 = new X.6Nv
            r0.<init>((X.AnonymousClass6WY) r7)
            r1.A0X(r0)
            X.6ov r0 = r15.A0N
            java.util.List r0 = r0.A18
            java.util.Iterator r13 = r0.iterator()
        L_0x004f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r6 = r13.next()
            X.6N8 r6 = (X.AnonymousClass6N8) r6
            java.util.Map r11 = r15.A0S
            java.lang.String r10 = r6.A03
            java.lang.Object r5 = r11.get(r10)
            X.4q1 r5 = (X.C97634q1) r5
            com.google.android.gms.maps.model.LatLng r0 = r6.A00()
            X.6bv r2 = X.C134976bv.A02(r0)
            if (r5 == 0) goto L_0x00fa
            java.lang.Object r9 = r5.A0F
            boolean r0 = r9 instanceof X.AnonymousClass6N8
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x007c
            r5.A05(r8)
        L_0x007c:
            r5.A0A(r2)
            X.6N8 r9 = (X.AnonymousClass6N8) r9
            int r1 = r9.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x008d
            int r1 = r9.A01
            int r0 = r6.A01
            if (r1 == r0) goto L_0x00a5
        L_0x008d:
            X.6ov r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A0G(r6)
            X.5hZ r0 = X.C114635hZ.A00(r0)
            r5.A09(r0)
            X.6ov r0 = r15.A0N
            java.lang.String r0 = r0.A0M(r6)
            r5.A0G = r0
            X.C97634q1.A01(r5)
        L_0x00a5:
            int r0 = r6.A00
            if (r0 != r8) goto L_0x00ed
            r1 = 1120403456(0x42c80000, float:100.0)
        L_0x00ab:
            X.6jV r0 = r5.A07
            r0.A0C(r5)
            r5.A02 = r1
            r0.A0B(r5)
            r5.A0F = r6
            android.graphics.Point r2 = r7.A04(r2)
            X.3Kq r1 = r6.A02
            X.6ov r0 = r15.A0N
            X.3Kq r0 = r0.A0Q
            if (r1 == r0) goto L_0x00e1
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x00e9
            int r1 = r2.x
            if (r1 < 0) goto L_0x00e9
            X.5B8 r0 = r15.A0M
            int r0 = r0.getWidth()
            if (r1 > r0) goto L_0x00e9
            int r1 = r2.y
            if (r1 < 0) goto L_0x00e9
            X.5B8 r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x00e9
        L_0x00e1:
            r5.A08()
        L_0x00e4:
            r3.add(r5)
            goto L_0x004f
        L_0x00e9:
            r5.A07()
            goto L_0x00e4
        L_0x00ed:
            java.util.List r0 = r6.A04
            int r0 = r0.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r8) goto L_0x00ab
            r1 = 1112014848(0x42480000, float:50.0)
            goto L_0x00ab
        L_0x00fa:
            X.6jV r0 = r15.A05
            X.C18740tg.A06(r0)
            com.google.android.gms.maps.model.LatLng r0 = r6.A00()
            X.6bv r5 = X.C134976bv.A02(r0)
            X.6ov r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A0G(r6)
            X.6Lj r9 = new X.6Lj
            r9.<init>()
            X.5hZ r0 = X.C114635hZ.A00(r0)
            r9.A00 = r0
            X.6ov r0 = r15.A0N
            java.lang.String r0 = r0.A0M(r6)
            r9.A03 = r0
            r12 = 1063172178(0x3f5eb852, float:0.87)
            r1 = 1056964608(0x3f000000, float:0.5)
            float[] r0 = r9.A06
            r0[r4] = r1
            r0[r8] = r12
            X.0wQ r12 = r15.A02
            X.3Kq r0 = r6.A02
            com.whatsapp.jid.UserJid r1 = r0.A06
            boolean r0 = r12.A0M(r1)
            if (r0 == 0) goto L_0x0160
            X.0yC r1 = r15.A0D
            r0 = 3088(0xc10, float:4.327E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2131890319(0x7f12108f, float:1.9415326E38)
            if (r1 == 0) goto L_0x0147
            r0 = 2131890251(0x7f12104b, float:1.9415189E38)
        L_0x0147:
            java.lang.String r0 = r15.getString(r0)
        L_0x014b:
            r9.A03 = r0
            X.6jV r0 = r15.A05
            r9.A01 = r5
            X.4q1 r5 = new X.4q1
            r5.<init>(r0, r9)
            r0.A0B(r5)
            r5.A0D = r0
            r11.put(r10, r5)
            goto L_0x00a5
        L_0x0160:
            X.16D r0 = r15.A0C
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r15.A0E
            java.lang.String r0 = r0.A0H(r1)
            goto L_0x014b
        L_0x016d:
            r2.A0D(r4)
            goto L_0x001d
        L_0x0172:
            java.util.Iterator r2 = r14.iterator()
        L_0x0176:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r1 = r2.next()
            X.4q1 r1 = (X.C97634q1) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0176
            java.lang.Object r0 = r1.A0F
            if (r0 == 0) goto L_0x0176
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0176
            r1.A05(r4)
            goto L_0x0176
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A0G(com.whatsapp.location.GroupChatLiveLocationsActivity):void");
    }

    public static void A0H(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, List list, boolean z) {
        C18740tg.A06(groupChatLiveLocationsActivity.A05);
        if (list.size() != 1) {
            AnonymousClass6OA r5 = new AnonymousClass6OA();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C63593Kq r0 = (C63593Kq) it.next();
                r5.A01(C134976bv.A00(r0.A00, r0.A01));
            }
            groupChatLiveLocationsActivity.A0F(r5, z);
        } else if (z) {
            groupChatLiveLocationsActivity.A0W = true;
            groupChatLiveLocationsActivity.A05.A08(C1264964g.A00(C134976bv.A00(((C63593Kq) list.get(0)).A00, ((C63593Kq) list.get(0)).A01), 16.0f));
        } else {
            groupChatLiveLocationsActivity.A05.A09(C1264964g.A00(C134976bv.A00(((C63593Kq) list.get(0)).A00, ((C63593Kq) list.get(0)).A01), 16.0f));
        }
    }

    public static void A0I(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, boolean z) {
        if (groupChatLiveLocationsActivity.A05 != null && !groupChatLiveLocationsActivity.A0N.A0W) {
            Set set = groupChatLiveLocationsActivity.A0T;
            if (set.isEmpty()) {
                return;
            }
            if (groupChatLiveLocationsActivity.A0M.getWidth() <= 0 || groupChatLiveLocationsActivity.A0M.getHeight() <= 0) {
                C164757sK.A00(groupChatLiveLocationsActivity.A0M.getViewTreeObserver(), groupChatLiveLocationsActivity, 9);
            } else if (!z || !groupChatLiveLocationsActivity.A0W) {
                ArrayList A15 = C36441kJ.A15(set);
                C18740tg.A06(groupChatLiveLocationsActivity.A05);
                if (groupChatLiveLocationsActivity.A0N.A0I() != null) {
                    LatLng A0I2 = groupChatLiveLocationsActivity.A0N.A0I();
                    Collections.sort(A15, new C163877qu(A0I2.A00, A0I2.A01, 0));
                }
                AnonymousClass6OA r6 = new AnonymousClass6OA();
                AnonymousClass6OA r7 = new AnonymousClass6OA();
                int i = 0;
                while (i < A15.size()) {
                    C97634q1 r8 = (C97634q1) A15.get(i);
                    r7.A01(r8.A0E);
                    C135076c5 A002 = r7.A00();
                    if (!C142466ov.A0F(new LatLngBounds(C134976bv.A03(A002.A01), C134976bv.A03(A002.A00)))) {
                        break;
                    }
                    r6.A01(r8.A0E);
                    i++;
                }
                if (i == 1) {
                    A0H(groupChatLiveLocationsActivity, ((AnonymousClass6N8) ((C97634q1) A15.get(0)).A0F).A04, z);
                } else {
                    groupChatLiveLocationsActivity.A0F(r6, z);
                }
            } else {
                groupChatLiveLocationsActivity.A0X = true;
            }
        }
    }

    public void A2F() {
        if (!this.A0U) {
            this.A0U = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C90464aC.A0y(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A09 = C36391kE.A0Y(A0B2);
            this.A0F = C36351kA.A0T(A0B2);
            this.A0P = C36411kG.A0m(A0B2);
            this.A0B = C36361kB.A0V(A0B2);
            this.A0C = C36341k9.A0R(A0B2);
            this.A0E = C36341k9.A0S(A0B2);
            this.A0D = C36351kA.A0S(A0B2);
            this.A0K = (AnonymousClass16J) A0B2.A57.get();
            this.A08 = C90514aH.A0Z(A0B2);
            this.A0A = (C24361Cd) A0B2.A1j.get();
            this.A0H = C36351kA.A0X(A0B2);
            this.A06 = C90484aE.A0T(A0B2);
            this.A0O = C36411kG.A0l(A0B2);
            this.A0J = C36351kA.A0b(A0B2);
            this.A0R = C36351kA.A0m(A0B2);
            this.A0I = C36371kC.A0X(A0B2);
            this.A0G = C90504aG.A0M(A0B2);
            this.A0L = (C233117z) A0B2.A3w.get();
            this.A07 = C36361kB.A0S(A0B2);
            this.A0Q = (AnonymousClass1PA) A0B2.A4X.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0N.A0Z(i, i2)) {
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
        C27731Pn r19 = this.A0F;
        AnonymousClass2XH r18 = this.A0P;
        AnonymousClass1Pp r17 = this.A0B;
        AnonymousClass171 r15 = this.A0E;
        C18820ts r12 = this.A00;
        AnonymousClass16I r11 = this.A0D;
        AnonymousClass16J r10 = this.A0K;
        AnonymousClass19J r9 = this.A08;
        C24361Cd r8 = this.A0A;
        C20830yE r7 = this.A0H;
        C237019m r6 = this.A06;
        AnonymousClass1P5 r5 = this.A0O;
        C27761Ps r4 = this.A0G;
        C233117z r3 = this.A0L;
        C24801Dv r16 = r20;
        C237019m r172 = r6;
        AnonymousClass17Y r182 = r38;
        C19730wQ r192 = r21;
        AnonymousClass19J r202 = r9;
        C24361Cd r212 = r8;
        this.A0N = new C162827pD(r16, r172, r182, r192, r202, r212, r17, this.A0C, r11, r15, r19, r4, r28, r7, r12, r10, r3, r5, r18, this.A0Q, this, 0);
        getSupportActionBar().A0U(true);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1A5 r2 = this.A0I;
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        C18740tg.A06(A0F2);
        AnonymousClass141 A012 = r2.A01(A0F2);
        getSupportActionBar().A0Q(AnonymousClass3UG.A05(this, this.A0C, this.A0E.A0H(A012)));
        this.A0N.A0U(this, bundle2);
        this.A0P.A04(this);
        C124515yJ r22 = new C124515yJ();
        r22.A00 = 1;
        r22.A08 = true;
        r22.A05 = true;
        r22.A04 = "whatsapp_group_chat";
        this.A0M = new C162807pB(this, r22, this, 0);
        ((ViewGroup) C03570Gk.A0B(this, R.id.map_holder)).addView(this.A0M);
        this.A0M.A0F(bundle2);
        ImageView imageView = (ImageView) C03570Gk.A0B(this, R.id.my_location);
        this.A03 = imageView;
        C135466ck.A00(imageView, this, 0);
        this.A02 = bundle2;
        A07();
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A0H2 = this.A0N.A0H(i);
        if (A0H2 == null) {
            return super.onCreateDialog(i);
        }
        return A0H2;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18740tg.A06(this.A05);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C139266jV r0 = this.A05;
        if (r0 != null) {
            C134996bx A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C134976bv r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0M.A02);
        }
        this.A0M.A0G(bundle);
        this.A0N.A0V(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity(int i) {
        this.A0U = false;
        C163027pX.A00(this, 30);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0H.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07() {
        /*
            r3 = this;
            X.C18740tg.A01()
            X.6jV r0 = r3.A05
            if (r0 != 0) goto L_0x0011
            X.5B8 r1 = r3.A0M
            X.7eQ r0 = r3.A0V
            X.6jV r0 = r1.A0J(r0)
            r3.A05 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A03
            X.6ov r0 = r3.A0N
            X.3Kq r0 = r0.A0O
            if (r0 != 0) goto L_0x0022
            X.0yE r0 = r3.A0H
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A07():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        menu.removeGroup(R.id.map_setting);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        double d = C92794ej.A0n;
        this.A0N.A0P();
        if (this.A05 != null) {
            SharedPreferences.Editor A0G2 = C36381kD.A0G(this.A0R, C19430v1.A0A);
            C134996bx A022 = this.A05.A02();
            C134976bv r4 = A022.A03;
            A0G2.putFloat("live_location_lat", (float) r4.A00);
            A0G2.putFloat("live_location_lng", (float) r4.A01);
            A0G2.putFloat("live_location_zoom", A022.A02);
            A0G2.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A0C();
    }

    public void onPause() {
        super.onPause();
        double d = C92794ej.A0n;
        AnonymousClass5B8 r0 = this.A0M;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        this.A0N.A0Q();
    }

    public void onResume() {
        super.onResume();
        double d = C92794ej.A0n;
        this.A0M.A0K();
        this.A0N.A0R();
        A07();
    }

    public GroupChatLiveLocationsActivity() {
        this(0);
        this.A0T = C36441kJ.A16();
        this.A0S = AnonymousClass001.A0J();
        this.A01 = 0;
        this.A0V = new C165447tR(this, 2);
        this.A00 = -1.0f;
        this.A0X = false;
        this.A04 = new C163197po(this, 2);
    }
}
