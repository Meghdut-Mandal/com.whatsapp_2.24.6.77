package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Zc  reason: invalid class name and case insensitive filesystem */
public abstract class C133586Zc implements LocationListener {
    public Bitmap A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Location A05;
    public Handler A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public ImageView A0J;
    public ImageView A0K;
    public ListView A0L;
    public ProgressBar A0M;
    public ProgressBar A0N;
    public TextView A0O;
    public AnonymousClass01L A0P;
    public AnonymousClass733 A0Q;
    public C108135Sh A0R;
    public AnonymousClass11F A0S;
    public C124555yO A0T;
    public C1262062y A0U;
    public PlaceInfo A0V;
    public C135096c8 A0W;
    public WDSSearchBar A0X;
    public Runnable A0Y;
    public String A0Z;
    public String A0a;
    public Map A0b;
    public boolean A0c = true;
    public boolean A0d = false;
    public boolean A0e = false;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h = false;
    public boolean A0i;
    public boolean A0j = false;
    public int A0k = -1;
    public Handler A0l;
    public HandlerThread A0m;
    public View A0n;
    public View A0o;
    public View A0p;
    public View A0q;
    public View A0r;
    public AnonymousClass733 A0s;
    public AnonymousClass5MQ A0t;
    public C92674eM A0u;
    public AnonymousClass6CW A0v;
    public Runnable A0w;
    public boolean A0x = true;
    public final C24801Dv A0y;
    public final C237019m A0z;
    public final AnonymousClass17Y A10;
    public final AnonymousClass1X4 A11;
    public final AnonymousClass185 A12;
    public final C235618y A13;
    public final C64953Qc A14;
    public final C21060yb A15;
    public final C19970wo A16;
    public final C19630wG A17;
    public final C20830yE A18;
    public final C19420v0 A19;
    public final C20810yC A1A;
    public final AnonymousClass2XH A1B;
    public final PlaceInfo A1C = new PlaceInfo();
    public final AnonymousClass6LW A1D;
    public final AnonymousClass1A1 A1E;
    public final C20380xT A1F;
    public final C19700wN A1G;
    public final C19730wQ A1H;
    public final C20050ww A1I;
    public final AnonymousClass1Pp A1J;
    public final C27761Ps A1K;
    public final C18820ts A1L;
    public final C220412q A1M;
    public final AnonymousClass1N0 A1N;
    public final C1261362r A1O;
    public final AnonymousClass6O1 A1P;
    public final AnonymousClass1XN A1Q;
    public final AnonymousClass1H2 A1R;
    public final EmojiSearchProvider A1S;
    public final AnonymousClass13E A1T;
    public final AnonymousClass1P5 A1U;
    public final WhatsAppLibLoader A1V;
    public final C19890wg A1W;
    public final AnonymousClass1N2 A1X;
    public final C19770wU A1Y;

    public static void A05(Location location, C133586Zc r7, String str, int i, boolean z) {
        A06(location, r7, str, i, z, true);
    }

    public static void A08(C133586Zc r5) {
        r5.A0i = false;
        C108135Sh r2 = r5.A0R;
        C108135Sh r1 = C108135Sh.LIVE_LOCATION_MODE;
        AnonymousClass01L r0 = r5.A0P;
        if (r2 == r1) {
            r0.finish();
            return;
        }
        View currentFocus = r0.getCurrentFocus();
        if (currentFocus != null) {
            r5.A1X.A01(currentFocus);
        }
        if (r5.A07 != null) {
            r5.A0D.clearAnimation();
            if (r5.A0D.getVisibility() == 0) {
                r5.A0U((Float) null, false);
                C162427oZ r22 = new C162427oZ(r5, 2);
                r22.setDuration(350);
                C162657ow.A00(r22, r5, 3);
                r22.setInterpolator(new AccelerateInterpolator());
                r5.A0D.startAnimation(r22);
            } else {
                r5.A0D.setVisibility(8);
                A0D(r5, 0);
            }
            if (r5.A0U != null) {
                r5.A07.clearAnimation();
                int visibility = r5.A07.getVisibility();
                View view = r5.A07;
                if (visibility != 0) {
                    view.setVisibility(0);
                    r5.A0U((Float) null, false);
                    C1262062y r4 = r5.A0U;
                    C162657ow r3 = new C162657ow(r5, 4);
                    C162427oZ r23 = new C162427oZ(r4, 0);
                    r23.setAnimationListener(new C162647ov(r3, r4, 0));
                    r23.setDuration(400);
                    r23.setInterpolator(new AccelerateInterpolator());
                    r4.A01.startAnimation(r23);
                    return;
                }
                view.setVisibility(0);
                if (r5.A07.getHeight() == 0) {
                    r5.A07.getViewTreeObserver().addOnPreDrawListener(new C163987r5(r5, 3));
                    return;
                }
                r5.A0U.A00(C36441kJ.A02(r5.A07));
                A05(r5.A0I(), r5, (String) null, r5.A0H(), false);
                r5.A0V((Float) null, true);
                return;
            }
            return;
        }
        r5.A0U((Float) null, false);
        A05(r5.A0I(), r5, (String) null, r5.A0H(), false);
        r5.A0V((Float) null, true);
    }

    public int A0H() {
        C162837pE r1 = (C162837pE) this;
        if (r1.A02 != 0) {
            C117345m7 r0 = ((LocationPicker2) r1.A01).A0U;
            if (r0 == null) {
                return 0;
            }
            C129186Fs r2 = r0.A00;
            Location A0J2 = C90474aD.A0J(r2.A02().A03, "");
            C98844s7 A022 = r2.A00().A02();
            Location location = new Location("");
            LatLng latLng = A022.A02;
            double d = latLng.A00;
            LatLng latLng2 = A022.A03;
            location.setLatitude((d + latLng2.A00) / 2.0d);
            location.setLongitude((latLng.A01 + latLng2.A01) / 2.0d);
            A0J2.distanceTo(location);
            return 0;
        }
        Location A0I2 = r1.A0I();
        C139266jV r02 = ((LocationPicker) r1.A01).A03;
        if (r02 == null || A0I2 == null) {
            return 0;
        }
        C128446Ch A062 = r02.A0R.A06();
        Location location2 = new Location("");
        C134976bv r7 = A062.A02;
        double d2 = r7.A00;
        C134976bv r6 = A062.A03;
        location2.setLatitude((d2 + r6.A00) / 2.0d);
        location2.setLongitude((r7.A01 + r6.A01) / 2.0d);
        return (int) A0I2.distanceTo(location2);
    }

    public Location A0I() {
        C162837pE r0 = (C162837pE) this;
        int i = r0.A02;
        Object obj = r0.A01;
        if (i != 0) {
            C117345m7 r02 = ((LocationPicker2) obj).A0U;
            if (r02 != null) {
                return C90474aD.A0J(r02.A00.A02().A03, "");
            }
            return null;
        }
        C139266jV r03 = ((LocationPicker) obj).A03;
        if (r03 == null) {
            return null;
        }
        C134976bv r2 = r03.A02().A03;
        Location location = new Location("");
        location.setLatitude(r2.A00);
        location.setLongitude(r2.A01);
        return location;
    }

    public AnonymousClass0FM A0J(int i) {
        C163297py r2;
        C39001qm r1;
        int i2;
        int i3;
        int i4;
        Uri A032;
        int i5 = i;
        if (i5 != 2) {
            int i6 = 3;
            if (i5 != 3) {
                i6 = 4;
                if (i5 != 4) {
                    r2 = null;
                    if (i5 != 5) {
                        return null;
                    }
                    r1 = AnonymousClass3LW.A00(this.A0P);
                    r1.A0d(R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                }
            }
            View A0E2 = C36361kB.A0E(this.A0P.getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
            ImageView A0G2 = C36401kF.A0G(A0E2, R.id.header_logo);
            AnonymousClass01L r12 = this.A0P;
            if (i6 != 3) {
                i3 = R.string.f12nameremoved;
            } else {
                i3 = R.string.f12nameremoved;
            }
            C36331k8.A0q(r12, A0G2, i3);
            int i7 = R.drawable.nux_live_location;
            if (i6 != 3) {
                i7 = R.drawable.nux_location;
            }
            A0G2.setImageResource(i7);
            TextEmojiLabel A0P2 = C36401kF.A0P(A0E2, R.id.location_new_user_description);
            Context context = this.A17.A00;
            C20810yC r7 = this.A1A;
            AnonymousClass17Y r14 = this.A10;
            C24801Dv r13 = this.A0y;
            C21060yb r6 = this.A15;
            AnonymousClass01L r22 = this.A0P;
            if (i6 != 3) {
                i4 = R.string.f12nameremoved;
            } else {
                boolean A0E3 = r7.A0E(332);
                i4 = R.string.f12nameremoved;
                if (A0E3) {
                    i4 = R.string.f12nameremoved;
                }
            }
            String A0w2 = C36351kA.A0w(r22, "learn-more", 1, i4);
            boolean A0E4 = r7.A0E(332);
            C20380xT r122 = this.A1F;
            if (A0E4) {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https");
                builder.authority("faq.whatsapp.com");
                builder.appendPath("android");
                builder.appendPath("chats");
                builder.appendPath("how-to-use-location-features");
                C20380xT.A01(builder, r122);
                A032 = builder.build();
            } else {
                A032 = r122.A03("26000049");
            }
            AnonymousClass17Y r18 = r14;
            C24801Dv r17 = r13;
            AnonymousClass6YV.A0E(context, A032, r17, r18, A0P2, r6, r7, A0w2, "learn-more");
            C39001qm A002 = AnonymousClass3LW.A00(this.A0P);
            A002.A0j(A0E2);
            A002.A0r(true);
            A002.A0f(new C163527qL(this, i6, 2), R.string.f12nameremoved);
            A002.A0e(new C163317q0(this, 5));
            boolean A0E5 = r7.A0E(332);
            int i8 = R.string.f12nameremoved;
            if (A0E5) {
                i8 = R.string.f12nameremoved;
            }
            A002.A0h(new C163527qL(this, i6, 3), i8);
            return A002.create();
        }
        r2 = new C163297py(this, 29);
        r1 = AnonymousClass3LW.A00(this.A0P);
        r1.A0d(R.string.f12nameremoved);
        i2 = R.string.f12nameremoved;
        r1.A0c(i2);
        r1.A0r(true);
        r1.A0h(r2, R.string.f12nameremoved);
        return r1.create();
    }

    public void A0L() {
        if (this.A0R == C108135Sh.LIVE_LOCATION_MODE || this.A0i) {
            A0G(this, false);
        }
        this.A0z.A06(this, "location-picker-onresume", 0.0f, 3, 5000, 1000);
        A0V((Float) null, false);
    }

    public void A0M() {
        C162837pE r1 = (C162837pE) this;
        int i = r1.A02;
        Object obj = r1.A01;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            C129186Fs r12 = locationPicker2.A02;
            if (r12 != null) {
                locationPicker2.A05 = null;
                r12.A06();
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) obj;
        C139266jV r13 = locationPicker.A03;
        if (r13 != null) {
            locationPicker.A06 = null;
            r13.A05();
        }
    }

    public void A0N() {
        C135096c8 r0;
        C135096c8 r02;
        C162837pE r1 = (C162837pE) this;
        if (r1.A02 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) r1.A01;
            if (locationPicker2.A02 != null) {
                if (!r1.A0i && locationPicker2.A05 == null) {
                    r1.A0M();
                }
                if (!r1.A0i && (r02 = r1.A0W) != null) {
                    for (PlaceInfo placeInfo : r02.A0D) {
                        C98884sB r6 = new C98884sB();
                        r6.A08 = C90524aI.A0F(placeInfo.A01, placeInfo.A02);
                        if (!TextUtils.isEmpty(placeInfo.A06)) {
                            r6.A09 = placeInfo.A06;
                        }
                        if (!TextUtils.isEmpty(placeInfo.A09)) {
                            r6.A0A = placeInfo.A09;
                        }
                        r6.A07 = locationPicker2.A03;
                        r6.A00 = 0.5f;
                        r6.A01 = 0.5f;
                        C129116Fg A032 = locationPicker2.A02.A03(r6);
                        A032.A06(placeInfo);
                        placeInfo.A0D = A032;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) r1.A01;
        if (locationPicker.A03 != null) {
            if (!r1.A0i && locationPicker.A06 == null) {
                r1.A0M();
            }
            if (!r1.A0i && (r0 = r1.A0W) != null) {
                for (PlaceInfo placeInfo2 : r0.A0D) {
                    C130516Lj r4 = new C130516Lj();
                    r4.A01 = C134976bv.A00(placeInfo2.A01, placeInfo2.A02);
                    if (!TextUtils.isEmpty(placeInfo2.A06)) {
                        r4.A03 = placeInfo2.A06;
                    }
                    if (!TextUtils.isEmpty(placeInfo2.A09)) {
                        r4.A02 = placeInfo2.A09;
                    }
                    r4.A00 = locationPicker.A04;
                    float[] fArr = r4.A06;
                    fArr[0] = 0.5f;
                    fArr[1] = 0.5f;
                    C139266jV r12 = locationPicker.A03;
                    C97634q1 r03 = new C97634q1(r12, r4);
                    r12.A0B(r03);
                    r03.A0D = r12;
                    r03.A0F = placeInfo2;
                    placeInfo2.A0D = r03;
                }
            }
        }
    }

    public void A0O(double d, double d2) {
        C108135Sh r1;
        PlaceInfo placeInfo = this.A1C;
        double d3 = d;
        placeInfo.A01 = d;
        double d4 = d2;
        placeInfo.A02 = d2;
        placeInfo.A06 = null;
        placeInfo.A04 = null;
        if ((this.A0e && !this.A0h) || (((r1 = this.A0R) == C108135Sh.STICKER_MODE || r1 == C108135Sh.EVENT_MODE) && TextUtils.isEmpty(this.A0Z))) {
            if (this.A0V == null && (this.A0d || this.A0j)) {
                this.A08.setVisibility(0);
            }
            this.A06.removeCallbacks(this.A0s);
            AnonymousClass733 r12 = new AnonymousClass733(this, d3, d4, 0);
            this.A0s = r12;
            this.A06.post(r12);
        }
    }

    public void A0P(int i) {
        C162837pE r0 = (C162837pE) this;
        int i2 = r0.A02;
        Object obj = r0.A01;
        if (i2 != 0) {
            C129186Fs r1 = ((LocationPicker2) obj).A02;
            if (r1 != null) {
                r1.A08(0, 0, 0, i);
                return;
            }
            return;
        }
        C139266jV r12 = ((LocationPicker) obj).A03;
        if (r12 != null) {
            r12.A07(0, 0, i);
        }
    }

    public void A0R(Location location, Float f, int i, boolean z) {
        float floatValue;
        float floatValue2;
        C162837pE r4 = (C162837pE) this;
        if (r4.A02 != 0) {
            C117345m7 r0 = ((LocationPicker2) r4.A01).A0U;
            if (r0 != null) {
                Integer valueOf = Integer.valueOf(i);
                C159117iq r5 = (C159117iq) r4.A00;
                if (location != null) {
                    LatLng A0N2 = C90474aD.A0N(location);
                    C129186Fs r3 = r0.A00;
                    float f2 = r3.A02().A02;
                    if (f == null) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = f.floatValue();
                    }
                    float f3 = f2 + floatValue2;
                    if (valueOf != null) {
                        r3.A08(0, 0, 0, valueOf.intValue());
                    }
                    C115065iH A022 = AnonymousClass6UP.A02(A0N2, f3);
                    if (z) {
                        r3.A0C(A022, r5);
                    } else {
                        r3.A0A(A022);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) r4.A01;
            if (locationPicker.A03 != null && location != null) {
                C134976bv A012 = C134976bv.A01(location);
                float A002 = C134996bx.A00(locationPicker.A03);
                if (f == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = f.floatValue();
                }
                locationPicker.A03.A07(0, 0, i);
                C1264964g A003 = C1264964g.A00(A012, A002 + floatValue);
                C139266jV r2 = locationPicker.A03;
                if (z) {
                    r2.A0A(A003, (C158997ia) r4.A00, 400);
                } else {
                    r2.A09(A003);
                }
            }
        }
    }

    public void A0U(Float f, boolean z) {
        Object obj;
        PlaceInfo placeInfo;
        Object obj2;
        PlaceInfo placeInfo2;
        Object obj3;
        PlaceInfo placeInfo3;
        Object obj4;
        View view;
        int height;
        PlaceInfo placeInfo4;
        Object obj5;
        C162837pE r0 = (C162837pE) this;
        int i = r0.A02;
        Object obj6 = r0.A01;
        if (i != 0) {
            obj = ((LocationPicker2) obj6).A02;
        } else {
            obj = ((LocationPicker) obj6).A03;
        }
        if (obj != null) {
            if (this.A0i) {
                if (AnonymousClass000.A1Q(this.A0X.A07.getVisibility())) {
                    this.A0X.A02(true);
                }
                this.A0e = false;
                this.A0J.setVisibility(8);
                this.A0r.setVisibility(8);
            } else {
                C20830yE r3 = this.A18;
                if (r3.A05()) {
                    Boolean bool = C18750th.A01;
                    if (i != 0) {
                        LocationPicker2 locationPicker2 = (LocationPicker2) obj6;
                        if (locationPicker2.A02 != null && locationPicker2.A0L.A05()) {
                            locationPicker2.A02.A0L(true);
                        }
                    } else {
                        LocationPicker locationPicker = (LocationPicker) obj6;
                        if (locationPicker.A03 != null && locationPicker.A0G.A05()) {
                            locationPicker.A03.A0D(true);
                        }
                    }
                }
                A0M();
                A0N();
                this.A0J.setVisibility(0);
                if (this.A0e) {
                    this.A0J.setImageResource(R.drawable.btn_map_fullscreen_off);
                    C36331k8.A0q(this.A0P, this.A0J, R.string.f12nameremoved);
                    if (this.A0d) {
                        ImageView A0N2 = C36391kE.A0N(this.A0L, R.id.send_current_location_icon);
                        if (A0N2 != null) {
                            A0N2.setImageResource(R.drawable.ic_current_location);
                        }
                        TextView A0P2 = C36391kE.A0P(this.A0L, R.id.send_current_location_text);
                        if (A0P2 != null) {
                            A0P2.setText(R.string.f12nameremoved);
                        }
                    }
                    TextView A0Q2 = C36391kE.A0Q(this.A0P, R.id.location_picker_current_location_text);
                    C108135Sh r1 = this.A0R;
                    if ((r1 == C108135Sh.STICKER_MODE || r1 == C108135Sh.EVENT_MODE) && A0Q2 != null) {
                        A0Q2.setText(R.string.f12nameremoved);
                    }
                    if (i != 0) {
                        LocationPicker2 locationPicker22 = (LocationPicker2) obj6;
                        if (!(locationPicker22.A02 == null || (placeInfo4 = locationPicker22.A0W.A0V) == null || (obj5 = placeInfo4.A0D) == null)) {
                            C129116Fg r12 = (C129116Fg) obj5;
                            r12.A04(locationPicker22.A04);
                            r12.A03();
                        }
                    } else {
                        LocationPicker locationPicker3 = (LocationPicker) obj6;
                        if (!(locationPicker3.A03 == null || (placeInfo3 = locationPicker3.A0P.A0V) == null || (obj4 = placeInfo3.A0D) == null)) {
                            C97634q1 r13 = (C97634q1) obj4;
                            r13.A09(locationPicker3.A05);
                            r13.A08();
                        }
                    }
                    this.A0O.setVisibility(8);
                    View view2 = this.A07;
                    View view3 = this.A0r;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        this.A0L.setAdapter((ListAdapter) null);
                        this.A0L.setOnScrollListener((AbsListView.OnScrollListener) null);
                        if (this.A0d) {
                            height = C36431kI.A04(this.A0o, C36431kI.A04(this.A0L.findViewById(R.id.send_current_location_btn), this.A0L.findViewById(R.id.nearby_places_header).getHeight()));
                        } else {
                            height = this.A0n.getHeight();
                        }
                        C36411kG.A1A(this.A0q, height);
                        A0F(this, f, height, true);
                    } else {
                        view3.setVisibility(8);
                    }
                    PlaceInfo placeInfo5 = this.A0V;
                    if ((placeInfo5 == null || placeInfo5.A0D == null) && (!AnonymousClass000.A1Q(this.A0X.A07.getVisibility()) || !AnonymousClass1N2.A00(this.A0I))) {
                        this.A0B.setVisibility(0);
                        this.A0P.invalidateOptionsMenu();
                    }
                    view = this.A0B;
                    view.setVisibility(8);
                    this.A0P.invalidateOptionsMenu();
                }
                if (this.A0d) {
                    ImageView A0N3 = C36391kE.A0N(this.A0L, R.id.send_current_location_icon);
                    if (A0N3 != null) {
                        A0N3.setImageResource(R.drawable.btn_send_current_location);
                    }
                    TextView A0P3 = C36391kE.A0P(this.A0L, R.id.send_current_location_text);
                    if (A0P3 != null) {
                        A0P3.setText(R.string.f12nameremoved);
                    }
                    A0B(this);
                }
                TextView A0Q3 = C36391kE.A0Q(this.A0P, R.id.location_picker_current_location_text);
                C108135Sh r14 = this.A0R;
                if ((r14 == C108135Sh.STICKER_MODE || r14 == C108135Sh.EVENT_MODE) && A0Q3 != null) {
                    A0Q3.setText(R.string.f12nameremoved);
                }
                this.A0J.setImageResource(R.drawable.btn_map_fullscreen_on);
                C36331k8.A0q(this.A0P, this.A0J, R.string.f12nameremoved);
                if (i != 0) {
                    LocationPicker2 locationPicker23 = (LocationPicker2) obj6;
                    if (!(locationPicker23.A02 == null || (placeInfo2 = locationPicker23.A0W.A0V) == null || (obj3 = placeInfo2.A0D) == null)) {
                        C129116Fg r15 = (C129116Fg) obj3;
                        r15.A04(locationPicker23.A04);
                        r15.A02();
                    }
                } else {
                    LocationPicker locationPicker4 = (LocationPicker) obj6;
                    if (!(locationPicker4.A03 == null || (placeInfo = locationPicker4.A0P.A0V) == null || (obj2 = placeInfo.A0D) == null)) {
                        C97634q1 r16 = (C97634q1) obj2;
                        r16.A09(locationPicker4.A05);
                        r16.A07();
                    }
                }
                C36421kH.A0v(this.A0r, r3.A05() ? 1 : 0, 0, 8);
                A0A(this);
                if (this.A07 != null) {
                    int i2 = this.A04;
                    if (AnonymousClass1N2.A00(this.A0I)) {
                        i2 /= 2;
                    }
                    C36411kG.A1A(this.A0q, i2);
                    if (r3.A05()) {
                        A0F(this, f, i2, z);
                    }
                    this.A0L.setAdapter(this.A0u);
                    A04();
                }
            }
            this.A0B.setVisibility(8);
            view = this.A08;
            view.setVisibility(8);
            this.A0P.invalidateOptionsMenu();
        }
    }

    public void A0Y(boolean z) {
        C162837pE r4 = (C162837pE) this;
        int i = r4.A02;
        Object obj = r4.A01;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            if (locationPicker2.A02 != null) {
                if (locationPicker2.A05 == null) {
                    r4.A0M();
                }
                Location location = r4.A05;
                if (location != null) {
                    LatLng A0F2 = C90524aI.A0F(location.getLatitude(), r4.A05.getLongitude());
                    LocationPicker2.A01(A0F2, locationPicker2);
                    locationPicker2.A02.A0L(false);
                    AnonymousClass67C r1 = new AnonymousClass67C();
                    AnonymousClass006.A02(A0F2, "location must not be null.");
                    r1.A03 = A0F2;
                    r1.A00 = 15.0f;
                    r1.A01 = 0.0f;
                    r1.A02 = 0.0f;
                    CameraPosition A002 = r1.A00();
                    C129186Fs r2 = locationPicker2.A02;
                    C115065iH A003 = AnonymousClass6UP.A00(A002);
                    if (z) {
                        r2.A0C(A003, (C159117iq) r4.A00);
                    } else {
                        r2.A0A(A003);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) obj;
            if (locationPicker.A03 != null) {
                if (locationPicker.A06 == null) {
                    r4.A0M();
                }
                Location location2 = r4.A05;
                if (location2 != null) {
                    C134976bv A004 = C134976bv.A00(location2.getLatitude(), r4.A05.getLongitude());
                    LocationPicker.A01(A004, locationPicker);
                    locationPicker.A03.A0D(false);
                    AnonymousClass62T r12 = new AnonymousClass62T();
                    r12.A02 = A004;
                    r12.A01 = 15.0f;
                    r12.A00 = 0.0f;
                    C134996bx A005 = r12.A00();
                    C139266jV r3 = locationPicker.A03;
                    C1264964g A006 = AnonymousClass6GS.A00(A005);
                    if (z) {
                        r3.A0A(A006, (C158997ia) r4.A00, 400);
                    } else {
                        r3.A09(A006);
                    }
                }
            }
        }
    }

    public void onLocationChanged(Location location) {
        int i;
        if (AnonymousClass1P6.A01(location, this.A05)) {
            boolean z = true;
            if (location.hasAccuracy()) {
                i = Math.max(1, (int) location.getAccuracy());
            } else {
                i = -1;
            }
            if (i != this.A0k) {
                this.A0k = i;
            }
            A0B(this);
            C135096c8 r0 = this.A0W;
            if (r0 == null || r0.A00() == null || !this.A0c || location.getAccuracy() >= 200.0f || this.A0W.A00().distanceTo(location) <= 1000.0f) {
                z = false;
            } else {
                this.A0c = false;
            }
            this.A05 = location;
            if (this.A0R == C108135Sh.EVENT_MODE) {
                this.A06.removeCallbacks(this.A0Q);
                AnonymousClass733 r5 = new AnonymousClass733(this, this.A05.getLatitude(), this.A05.getLongitude(), 1);
                this.A0Q = r5;
                this.A06.post(r5);
            }
            if (this.A0W != null && !z) {
                return;
            }
            if ((location.getAccuracy() < 200.0f && location.getTime() + 60000 > System.currentTimeMillis()) || this.A0g) {
                this.A10.A0H(new AnonymousClass752(this, location, 24, z));
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static Address A00(C133586Zc r8, double d, double d2) {
        List<Address> list;
        try {
            list = new Geocoder(r8.A0P.getApplicationContext(), C36401kF.A0x(r8.A1L)).getFromLocation(d, d2, 1);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Address) C36391kE.A0t(list);
    }

    private PlaceInfo A01() {
        double d;
        PlaceInfo placeInfo = new PlaceInfo();
        if (this.A0e || TextUtils.isEmpty(this.A0a)) {
            PlaceInfo placeInfo2 = this.A1C;
            placeInfo.A04 = placeInfo2.A04;
            placeInfo.A01 = placeInfo2.A01;
            d = placeInfo2.A02;
        } else {
            placeInfo.A04 = this.A0a;
            placeInfo.A01 = this.A05.getLatitude();
            d = this.A05.getLongitude();
        }
        placeInfo.A02 = d;
        return placeInfo;
    }

    @Deprecated
    public static AnonymousClass3T1 A02(C133586Zc r0, long j) {
        return C36421kH.A0R(r0.A1E, j);
    }

    public static String A03(Address address, C133586Zc r4) {
        if (address == null) {
            return r4.A0P.getString(R.string.f12nameremoved);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
            if (i != 0) {
                C90504aG.A1M(A0u2);
            }
            A0u2.append(address.getAddressLine(i));
        }
        return A0u2.toString();
    }

    private void A04() {
        int indexOf;
        PlaceInfo placeInfo = this.A0V;
        if (placeInfo != null && (indexOf = this.A0W.A0D.indexOf(placeInfo)) >= 0) {
            A0C(this);
            ListView listView = this.A0L;
            listView.smoothScrollToPosition(indexOf + listView.getHeaderViewsCount());
        }
    }

    public static void A06(Location location, C133586Zc r3, String str, int i, boolean z, boolean z2) {
        ProgressBar progressBar;
        r3.A0l.removeCallbacks(r3.A0w);
        if (r3.A0e) {
            progressBar = r3.A0N;
        } else {
            progressBar = r3.A0M;
        }
        progressBar.setVisibility(0);
        r3.A0V = null;
        r3.A0M();
        r3.A0P.findViewById(R.id.places_empty).setVisibility(8);
        r3.A0O.setVisibility(8);
        r3.A0G.setVisibility(8);
        r3.A0W = new C135096c8();
        A0C(r3);
        AnonymousClass5MQ r1 = new AnonymousClass5MQ(location, r3, str, i, z, z2);
        r3.A0t = r1;
        C36331k8.A1F(r1, r3.A1Y);
    }

    public static void A07(C133586Zc r5) {
        C36341k9.A0y(r5.A0L.findViewById(R.id.location_description));
        boolean z = !r5.A0e;
        r5.A0e = z;
        float f = -0.5f;
        if (z) {
            f = 0.5f;
        }
        if (r5.A0R == C108135Sh.EVENT_MODE && !z) {
            A0B(r5);
        }
        r5.A0V(Float.valueOf(f), true);
    }

    public static void A09(C133586Zc r18) {
        Intent A0D2;
        PlaceInfo placeInfo;
        C133586Zc r5 = r18;
        C108135Sh r0 = r5.A0R;
        C108135Sh r3 = C108135Sh.EVENT_MODE;
        if (r0 == r3 || !r5.A1A.A0E(332) || !C36341k9.A0E(r5.A19).getBoolean("nearby_location_new_user", true)) {
            r5.A14.A03(8);
            C108135Sh r1 = r5.A0R;
            if (r1 == r3) {
                A0D2 = C36431kI.A0D();
                placeInfo = r5.A01();
                A0D2.putExtra("address", placeInfo.A04);
            } else if (r1 == C108135Sh.STICKER_MODE) {
                A0D2 = C36431kI.A0D();
                A0D2.putExtra("locations_string", r5.A0Z);
                placeInfo = r5.A1C;
            } else {
                Location location = r5.A05;
                AnonymousClass3T1 r6 = null;
                if (location != null && location.getAccuracy() > 200.0f) {
                    location = null;
                }
                long longExtra = r5.A0P.getIntent().getLongExtra("quoted_message_row_id", 0);
                AnonymousClass147 A002 = C65533Sl.A00(r5.A0P.getIntent(), "quoted_group_jid");
                if (longExtra > 0) {
                    r6 = C36421kH.A0R(r5.A1E, longExtra);
                } else if (A002 != null) {
                    r6 = C55162uB.A00(A002, (String) null, (String) null, C19970wo.A00(r5.A16));
                }
                AnonymousClass11F r8 = r5.A0S;
                if (r8 != null) {
                    AnonymousClass1X4 r32 = r5.A11;
                    C18740tg.A06(r8);
                    boolean booleanExtra = r5.A0P.getIntent().getBooleanExtra("has_number_from_url", false);
                    C64933Qa A0o2 = C36411kG.A0o(r8, r32.A11);
                    C19970wo r11 = r32.A0K;
                    C46912bs r02 = new C46912bs(A0o2, C19970wo.A00(r11));
                    if (location != null) {
                        r02.A00 = location.getLatitude();
                        r02.A01 = location.getLongitude();
                    }
                    r02.A0n(1);
                    r32.A14.A00(r02, r6);
                    if (booleanExtra) {
                        r02.A0j(4);
                    }
                    r32.A0T(r02);
                    C20310xM r13 = r32.A0X;
                    r13.A0m(r02, 2);
                    C19700wN r7 = r32.A00;
                    C20050ww r9 = r32.A06;
                    AnonymousClass16J r14 = r32.A0a;
                    AnonymousClass13E r2 = r32.A0n;
                    C50332ka r62 = new C50332ka(r7, r32.A01, r9, r32.A0I, r11, r32.A0M, r13, r14, r32.A0b, r2, r32.A0o, r02);
                    r62.A00 = 15;
                    C36391kE.A1Q(r62, r32.A1J);
                }
                AnonymousClass01L r33 = r5.A0P;
                Intent A0D3 = C36431kI.A0D();
                Map map = r5.A0b;
                if (map != null) {
                    A0D3.putExtra("carry_forward_extras", new HashMap(map));
                }
                r33.setResult(-1, A0D3);
                r5.A0P.finish();
                return;
            }
            A0D2.putExtra("longitude", placeInfo.A02);
            A0D2.putExtra("latitude", placeInfo.A01);
            r5.A0P.setResult(-1, A0D2);
            r5.A0P.finish();
            return;
        }
        r5.A0Y = new C1503074t((Object) r5, 10);
        AnonymousClass3SJ.A01(r5.A0P, 4);
    }

    public static void A0A(C133586Zc r5) {
        String str;
        C135096c8 r0 = r5.A0W;
        if (r0 == null || r0.A0D.isEmpty()) {
            str = null;
        } else {
            C135096c8 r2 = r5.A0W;
            if (r2.A0B == 3) {
                str = C36391kE.A0v(r5.A0P, "<a href='https://foursquare.com/'>foursquare</a>", AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            } else {
                str = r2.A03;
            }
        }
        r5.A0G.setVisibility(8);
        if (str == null || r5.A0e) {
            r5.A0O.setVisibility(8);
            return;
        }
        r5.A0O.setText(Html.fromHtml(str));
        r5.A0O.setVisibility(0);
    }

    public static void A0B(C133586Zc r8) {
        View findViewById;
        String A0L2;
        if (!r8.A0d) {
            findViewById = r8.A0P.findViewById(R.id.location_accuracy);
        } else if (!r8.A0e) {
            findViewById = r8.A0C.findViewById(R.id.location_description);
        } else {
            return;
        }
        TextView textView = (TextView) findViewById;
        if (textView != null) {
            C108135Sh r0 = r8.A0R;
            C108135Sh r3 = C108135Sh.EVENT_MODE;
            if (r0 == r3) {
                A0L2 = r8.A01().A04;
                if (!TextUtils.isEmpty(A0L2)) {
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
                return;
            }
            C108135Sh r1 = C108135Sh.STICKER_MODE;
            if (r0 != r1 || TextUtils.isEmpty(r8.A0Z)) {
                C108135Sh r02 = r8.A0R;
                if (!(r02 == r1 || r02 == r3 || r8.A0k <= 0)) {
                    textView.setVisibility(0);
                    C18820ts r5 = r8.A1L;
                    int i = r8.A0k;
                    Object[] A0L3 = AnonymousClass001.A0L();
                    AnonymousClass000.A1L(A0L3, i, 0);
                    A0L2 = r5.A0L(A0L3, R.plurals.f10nameremoved, (long) i);
                }
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            A0L2 = r8.A0Z;
            textView.setText(A0L2);
        }
    }

    public static void A0C(C133586Zc r2) {
        List list;
        C92674eM r1 = r2.A0u;
        C135096c8 r0 = r2.A0W;
        if (r0 != null) {
            list = r0.A0D;
        } else {
            list = null;
        }
        r1.A01 = list;
        r1.A00 = r2.A0V;
        r1.notifyDataSetChanged();
    }

    public static void A0D(C133586Zc r3, int i) {
        r3.A02 = i;
        int max = Math.max(r3.A01, i);
        r3.A0E.setPadding(0, 0, 0, max);
        r3.A0E.requestLayout();
        r3.A0P(max);
    }

    public static void A0E(C133586Zc r23, PlaceInfo placeInfo) {
        AnonymousClass01L r4;
        Intent A0D2;
        C133586Zc r3 = r23;
        C108135Sh r0 = r3.A0R;
        C108135Sh r5 = C108135Sh.EVENT_MODE;
        PlaceInfo placeInfo2 = placeInfo;
        if (r0 == r5 || !r3.A1A.A0E(332) || !C36341k9.A0E(r3.A19).getBoolean("nearby_location_new_user", true)) {
            C108135Sh r42 = r3.A0R;
            if (r42 == r5) {
                A0D2 = C36431kI.A0D();
                A0D2.putExtra("locations_string", placeInfo2.A06);
                A0D2.putExtra("longitude", placeInfo2.A02);
                A0D2.putExtra("latitude", placeInfo2.A01);
                A0D2.putExtra("address", placeInfo2.A04);
                A0D2.putExtra("vicinity", placeInfo2.A09);
            } else if (r42 == C108135Sh.STICKER_MODE) {
                A0D2 = C36431kI.A0D();
                A0D2.putExtra("locations_string", placeInfo2.A06);
                PlaceInfo placeInfo3 = r3.A1C;
                A0D2.putExtra("longitude", placeInfo3.A02);
                A0D2.putExtra("latitude", placeInfo3.A01);
            } else {
                long longExtra = r3.A0P.getIntent().getLongExtra("quoted_message_row_id", 0);
                AnonymousClass147 A002 = C65533Sl.A00(r3.A0P.getIntent(), "quoted_group_jid");
                AnonymousClass3T1 r43 = null;
                if (longExtra > 0) {
                    r43 = C36421kH.A0R(r3.A1E, longExtra);
                } else if (A002 != null) {
                    r43 = C55162uB.A00(A002, (String) null, (String) null, C19970wo.A00(r3.A16));
                }
                AnonymousClass11F r6 = r3.A0S;
                if (r6 != null) {
                    AnonymousClass1X4 r8 = r3.A11;
                    C18740tg.A06(r6);
                    boolean booleanExtra = r3.A0P.getIntent().getBooleanExtra("has_number_from_url", false);
                    C64933Qa A0o2 = C36411kG.A0o(r6, r8.A11);
                    C19970wo r62 = r8.A0K;
                    C46912bs r52 = new C46912bs(A0o2, C19970wo.A00(r62));
                    r52.A0n(1);
                    r52.A00 = placeInfo2.A01;
                    r52.A01 = placeInfo2.A02;
                    r52.A01 = placeInfo2.A06;
                    r52.A00 = placeInfo2.A04;
                    r52.A02 = placeInfo2.A08;
                    r8.A14.A00(r52, r43);
                    if (booleanExtra) {
                        r52.A0j(4);
                    }
                    r8.A0T(r52);
                    C20310xM r11 = r8.A0X;
                    r11.A0m(r52, 2);
                    C19770wU r10 = r8.A1J;
                    C19700wN r13 = r8.A00;
                    C20050ww r15 = r8.A06;
                    AnonymousClass16J r9 = r8.A0a;
                    AnonymousClass13E r7 = r8.A0n;
                    C20830yE r44 = r8.A0M;
                    C237019m r14 = r8.A01;
                    AnonymousClass1FN r1 = r8.A0b;
                    AnonymousClass1P5 r02 = r8.A0o;
                    C19970wo r17 = r62;
                    AnonymousClass1G5 r16 = r8.A0I;
                    C36391kE.A1Q(new C50332ka(r13, r14, r15, r16, r17, r44, r11, r9, r1, r7, r02, r52), r10);
                }
                r4 = r3.A0P;
                A0D2 = C36431kI.A0D();
                Map map = r3.A0b;
                if (map != null) {
                    A0D2.putExtra("carry_forward_extras", new HashMap(map));
                }
                r4.setResult(-1, A0D2);
                r3.A0P.finish();
                return;
            }
            r4 = r3.A0P;
            r4.setResult(-1, A0D2);
            r3.A0P.finish();
            return;
        }
        r3.A0Y = new C80293vA(r3, placeInfo2, 32);
        AnonymousClass3SJ.A01(r3.A0P, 4);
    }

    public static void A0F(C133586Zc r3, Float f, int i, boolean z) {
        r3.A07.clearAnimation();
        r3.A0R(r3.A0I(), f, i, z);
        C1262062y r4 = r3.A0U;
        if (r4 == null) {
            return;
        }
        if (z) {
            View view = r4.A01;
            C92534e8 r2 = new C92534e8(view, r4, i);
            r2.setDuration((long) ((int) (((float) i) / r4.A00.getDisplayMetrics().density)));
            view.startAnimation(r2);
            return;
        }
        View view2 = r4.A01;
        C36411kG.A1A(view2, i);
        view2.requestLayout();
        r4.A00((float) i);
    }

    public static void A0G(C133586Zc r6, boolean z) {
        AnonymousClass01L r1;
        int i;
        if (r6.A1H.A0L()) {
            r1 = r6.A0P;
            i = 5;
        } else if (C36341k9.A0E(r6.A19).getBoolean("live_location_is_new_user", true)) {
            r1 = r6.A0P;
            i = 3;
        } else {
            LocationManager A0C2 = r6.A15.A0C();
            if (A0C2 != null && !A0C2.isProviderEnabled("gps") && !A0C2.isProviderEnabled("network")) {
                r1 = r6.A0P;
                i = 2;
            } else if (!r6.A18.A05()) {
                r6.A0i = false;
                r6.A0V((Float) null, false);
                return;
            } else {
                r6.A0W = new C135096c8();
                r6.A0i = true;
                View view = r6.A07;
                if (view != null) {
                    if (r6.A0U != null) {
                        view.clearAnimation();
                        C1262062y r5 = r6.A0U;
                        if (z) {
                            View view2 = r5.A01;
                            if (view2.getVisibility() == 0) {
                                C162427oZ r2 = new C162427oZ(r5, 1);
                                C162657ow.A00(r2, r5, 2);
                                r2.setDuration(350);
                                r2.setInterpolator(new AccelerateInterpolator());
                                view2.startAnimation(r2);
                            }
                        }
                        r5.A01.setVisibility(8);
                        r5.A00(0.0f);
                    }
                    r6.A0D.clearAnimation();
                    if (!z || r6.A0D.getVisibility() == 0) {
                        r6.A0D.setVisibility(0);
                        int height = r6.A0D.getHeight();
                        View view3 = r6.A0D;
                        if (height == 0) {
                            view3.getViewTreeObserver().addOnPreDrawListener(new C163987r5(r6, 4));
                            return;
                        }
                        A0D(r6, view3.getHeight());
                        r6.A0Y(false);
                        r6.A0U((Float) null, false);
                        return;
                    }
                    r6.A0D.setVisibility(0);
                    r6.A0U((Float) null, false);
                    C162427oZ r22 = new C162427oZ(r6, 3);
                    r22.setDuration(400);
                    C162657ow.A00(r22, r6, 5);
                    r22.setInterpolator(new AccelerateInterpolator());
                    r6.A0D.startAnimation(r22);
                    return;
                }
                r6.A0Y(true);
                r6.A0V((Float) null, true);
                return;
            }
        }
        AnonymousClass3SJ.A01(r1, i);
    }

    public void A0K() {
        Handler handler = this.A0l;
        if (handler != null) {
            handler.removeCallbacks(this.A0w);
        }
        AnonymousClass5MQ r1 = this.A0t;
        if (r1 != null) {
            r1.A0D(true);
            this.A0t = null;
        }
        this.A0v.A02.A02(false);
        C124555yO r2 = this.A0T;
        r2.A01.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A02);
        r2.A07.A0F();
        this.A0m.quit();
        this.A14.A02(8);
    }

    public void A0S(Bundle bundle) {
        bundle.putParcelable("places", this.A0W);
        bundle.putBoolean("show_live_location_setting", this.A0i);
        bundle.putBoolean("fullscreen", this.A0e);
        bundle.putBoolean("zoom_to_user", this.A0x);
    }

    public void A0T(Bundle bundle, AnonymousClass01L r34) {
        UserJid A0l2;
        AnonymousClass11F r4;
        int i;
        LocationManager A0C2;
        AnonymousClass01L r2 = r34;
        this.A0P = r2;
        C20810yC r9 = this.A1A;
        boolean A002 = AnonymousClass3MR.A00(r9);
        Bitmap bitmap = null;
        LayoutInflater layoutInflater = r2.getLayoutInflater();
        int i2 = R.layout.f9nameremoved;
        if (A002) {
            i2 = R.layout.f9nameremoved;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null, false);
        TextView A0P2 = C36391kE.A0P(inflate, R.id.duration_15_min);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, 15, 0);
        C36341k9.A0s(r2, A0P2, objArr, R.string.f12nameremoved);
        TextView A0P3 = C36391kE.A0P(inflate, R.id.duration_60_min);
        Object[] objArr2 = new Object[1];
        AnonymousClass000.A1L(objArr2, 1, 0);
        C36341k9.A0s(r2, A0P3, objArr2, R.string.f12nameremoved);
        TextView A0P4 = C36391kE.A0P(inflate, R.id.duration_480_min);
        Object[] objArr3 = new Object[1];
        AnonymousClass000.A1L(objArr3, 8, 0);
        C36341k9.A0s(r2, A0P4, objArr3, R.string.f12nameremoved);
        r2.setContentView(inflate);
        if (!this.A1V.A04()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C19730wQ r10 = this.A1H;
            r10.A0G();
            if (r10.A00 != null) {
                Bundle bundle2 = bundle;
                if (bundle != null) {
                    this.A0W = (C135096c8) bundle2.getParcelable("places");
                    this.A0i = bundle2.getBoolean("show_live_location_setting", false);
                    bundle2.remove("places");
                    this.A0e = bundle2.getBoolean("fullscreen", false);
                    this.A0x = bundle2.getBoolean("zoom_to_user", false);
                }
                this.A0S = C36331k8.A0F(this.A0P);
                this.A0j = this.A0P.getIntent().getBooleanExtra("start_in_fullscreen_mode", false);
                Bundle A0H2 = C36371kC.A0H(this.A0P);
                if (A0H2 != null && (A0H2.getSerializable("carry_forward_extras") instanceof Map)) {
                    this.A0b = (Map) A0H2.getSerializable("carry_forward_extras");
                }
                AnonymousClass11F r42 = this.A0S;
                if (r42 == null) {
                    A0l2 = null;
                } else {
                    A0l2 = C36431kI.A0l(r42.getRawString());
                }
                AnonymousClass3U1 r11 = new AnonymousClass3U1(this.A12, this.A13, A0l2);
                boolean z = false;
                if ((!r9.A0E(1506) || A0l2 == null || !r11.A04()) && ((!(this.A0S instanceof UserJid) || !r9.A0E(5968) || (!r11.A05() && !r11.A07())) && ((!r9.A0E(2515) || !((i = r11.A03.hostStorage) == 2 || i == 1)) && ((!AnonymousClass143.A0I(this.A0S) || r9.A0E(2584)) && (r4 = this.A0S) != null && !(r4 instanceof C177618e5))))) {
                    z = true;
                }
                this.A0d = z;
                if (r2.getIntent() != null) {
                    this.A0R = C108135Sh.values()[r2.getIntent().getIntExtra("mode", 0)];
                }
                this.A0I = C03570Gk.A0B(r2, R.id.main);
                C135826dK r13 = new C135826dK(this);
                WDSSearchBar wDSSearchBar = (WDSSearchBar) r2.findViewById(R.id.wds_search_bar);
                this.A0X = wDSSearchBar;
                WDSSearchView wDSSearchView = wDSSearchBar.A07;
                wDSSearchView.setOnQueryTextSubmitListener(new C165087sr(this, 3));
                wDSSearchView.setTrailingButtonIcon(C50942mt.A00);
                this.A0X.addOnLayoutChangeListener(new C163657qY(r13, wDSSearchView, 3));
                AnonymousClass07B A0Q2 = C36431kI.A0Q(r2, this.A0X.A06);
                A0Q2.A0U(true);
                C108135Sh r112 = this.A0R;
                if (r112 == C108135Sh.STICKER_MODE || r112 == C108135Sh.EVENT_MODE) {
                    A0Q2.A0I(R.string.f12nameremoved);
                } else {
                    A0Q2.A0I(R.string.f12nameremoved);
                }
                if (r9.A0E(6260)) {
                    C64813Pn.A00(r2, A0Q2);
                }
                View findViewById = r2.findViewById(R.id.map_frame);
                this.A0F = findViewById;
                if (findViewById != null) {
                    C164757sK.A00(findViewById.getViewTreeObserver(), this, 12);
                }
                this.A0q = r2.findViewById(R.id.picker_list);
                this.A0r = r2.findViewById(R.id.places_holder);
                this.A0B = r2.findViewById(R.id.map_center);
                View findViewById2 = r2.findViewById(R.id.map_center_pin);
                this.A0A = findViewById2;
                C36331k8.A0q(r2, findViewById2, R.string.f12nameremoved);
                this.A09 = r2.findViewById(R.id.map_center_filler);
                View A0B2 = C03570Gk.A0B(r2, R.id.map_center_info);
                this.A08 = A0B2;
                C135466ck.A00(A0B2, this, 7);
                View findViewById3 = this.A0P.findViewById(R.id.send_my_location_btn);
                this.A0n = findViewById3;
                C135466ck.A00(findViewById3, this, 8);
                View findViewById4 = this.A0P.findViewById(R.id.live_location_btn);
                this.A0o = findViewById4;
                findViewById4.setVisibility(C36381kD.A00(r10.A0L() ? 1 : 0));
                C135466ck.A00(this.A0o, this, 9);
                View findViewById5 = this.A0o.findViewById(R.id.live_location_icon);
                if (C222013h.A07 && (findViewById5 instanceof ImageView)) {
                    ((ImageView) findViewById5).setImageResource(R.drawable.ic_inline_live_location_filled_wds);
                    int dimensionPixelSize = findViewById5.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    findViewById5.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
                ImageView imageView = (ImageView) C03570Gk.A0B(r2, R.id.full_screen);
                this.A0J = imageView;
                C135466ck.A00(imageView, this, 10);
                Handler A0H3 = C36341k9.A0H();
                this.A0l = A0H3;
                C1503074t r113 = new C1503074t((Object) this, 9);
                this.A0w = r113;
                if (this.A0W == null) {
                    A0H3.postDelayed(r113, 15000);
                }
                File A0w2 = C36441kJ.A0w(r2.getCacheDir(), "Places");
                if (!A0w2.mkdirs() && !A0w2.isDirectory()) {
                    Log.w("LocationPickerUI/create unable to create places directory");
                }
                AnonymousClass658 r114 = new AnonymousClass658(this.A10, this.A1I, this.A1T, A0w2, "location-picker");
                r114.A00 = this.A0P.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                this.A0v = r114.A01();
                this.A0K = C36411kG.A0Q(this.A0P, R.id.my_location);
                this.A0H = this.A0P.findViewById(R.id.permissions_request);
                this.A0p = this.A0P.findViewById(R.id.live_location_setting);
                ProgressBar progressBar = (ProgressBar) C03570Gk.A0B(r2, R.id.progressbar_small);
                this.A0M = progressBar;
                int i3 = 8;
                if (this.A0W == null) {
                    i3 = 0;
                }
                progressBar.setVisibility(i3);
                this.A0N = (ProgressBar) r2.findViewById(R.id.progressbar_map);
                View inflate2 = View.inflate(this.A0P, R.layout.f9nameremoved, (ViewGroup) null);
                TextView A0P5 = C36391kE.A0P(inflate2, R.id.location_picker_attributions_textview);
                this.A0O = A0P5;
                C36391kE.A1J(A0P5);
                View inflate3 = View.inflate(this.A0P, R.layout.f9nameremoved, (ViewGroup) null);
                View findViewById6 = inflate3.findViewById(R.id.location_picker_loading_progress);
                this.A0G = findViewById6;
                findViewById6.setVisibility(8);
                this.A0u = new C92674eM(r2, this.A0v);
                this.A0L = (ListView) this.A0P.findViewById(R.id.places_list);
                if (this.A0d) {
                    this.A0L.addHeaderView(this.A0P.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null), (Object) null, false);
                    View inflate4 = this.A0P.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
                    this.A0C = inflate4;
                    this.A0L.addHeaderView(inflate4, (Object) null, true);
                } else {
                    this.A0C = this.A0n;
                }
                this.A0L.setAdapter(this.A0u);
                this.A0L.setFooterDividersEnabled(true);
                this.A0L.addFooterView(inflate2, (Object) null, true);
                this.A0L.addFooterView(inflate3, (Object) null, false);
                A0A(this);
                A0C(this);
                this.A0L.setOnItemClickListener(new C136036df(r2, this));
                C67383Zp r5 = new C67383Zp();
                ((RadioGroup) this.A0P.findViewById(R.id.duration)).setOnCheckedChangeListener(r5);
                AnonymousClass01L r31 = this.A0P;
                AnonymousClass1N2 r30 = this.A1X;
                C19700wN r21 = this.A1G;
                AnonymousClass1H2 r20 = this.A1R;
                AnonymousClass1XN r17 = this.A1Q;
                C21060yb r18 = this.A15;
                C18820ts r115 = this.A1L;
                C1261362r r22 = this.A1O;
                EmojiSearchProvider emojiSearchProvider = this.A1S;
                C19890wg r15 = this.A1W;
                AnonymousClass6O1 r14 = this.A1P;
                AnonymousClass1N0 r132 = this.A1N;
                C19890wg r29 = r15;
                this.A0T = new C124555yO(r31, this.A0I, r21, r18, this.A19, r115, r132, r22, r14, r17, r20, emojiSearchProvider, r9, this.A0S, r29, r30);
                ImageView A0Q3 = C36411kG.A0Q(this.A0P, R.id.send);
                C36321k7.A0L(this.A0P, A0Q3, r115, R.drawable.input_send);
                C48902iF.A00(A0Q3, this, r5, 13);
                View inflate5 = View.inflate(this.A0P, R.layout.f9nameremoved, (ViewGroup) null);
                r10.A0G();
                AnonymousClass142 r102 = r10.A0E;
                if (r102 != null && (bitmap = this.A1K.A07(inflate5.getContext(), r102, C90494aF.A04(this.A0P), this.A0P.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true)) == null) {
                    AnonymousClass1Pp r8 = this.A1J;
                    bitmap = r8.A03(inflate5.getContext(), r8.A02(r102));
                }
                C36391kE.A0N(inflate5, R.id.contact_photo).setImageBitmap(bitmap);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                inflate5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = inflate5.getMeasuredWidth();
                int measuredHeight = inflate5.getMeasuredHeight();
                this.A00 = C90524aI.A09(measuredWidth, measuredHeight);
                inflate5.layout(0, 0, measuredWidth, measuredHeight);
                inflate5.draw(C90524aI.A0A(this.A00));
                this.A07 = r2.findViewById(R.id.bottom_sheet);
                this.A0E = r2.findViewById(R.id.map_center_frame);
                View view = this.A07;
                if (view != null) {
                    view.setVisibility(0);
                    this.A0U = new C1262062y(r2.getResources(), this.A07, new C117355m8(this));
                } else {
                    this.A0T.A07.setMaxLines(2);
                }
                View findViewById7 = r2.findViewById(R.id.live_location_sheet);
                this.A0D = findViewById7;
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                if (bundle == null && this.A18.A05() && (A0C2 = r18.A0C()) != null && !A0C2.isProviderEnabled("gps") && !A0C2.isProviderEnabled("network")) {
                    AnonymousClass3SJ.A01(this.A0P, 2);
                }
                HandlerThread handlerThread = new HandlerThread("GeoCode");
                this.A0m = handlerThread;
                handlerThread.start();
                this.A06 = C90514aH.A0M(this.A0m);
                C48902iF r43 = new C48902iF(this, r2, 14);
                C03570Gk.A0B(r2, R.id.button_open_permission_settings).setOnClickListener(r43);
                View findViewById8 = r2.findViewById(R.id.button_open_permission_settings_minimized);
                if (findViewById8 != null) {
                    findViewById8.setOnClickListener(r43);
                }
                if (this.A0j && bundle == null) {
                    A07(this);
                    return;
                }
                return;
            }
        }
        this.A0P.finish();
    }

    public void A0V(Float f, boolean z) {
        boolean A052 = this.A18.A05();
        LocationSharingService.A02(this.A17.A00, this.A1U);
        if (A052) {
            this.A0K.setVisibility(0);
            this.A0H.setVisibility(8);
            if (this.A0i) {
                this.A0n.setVisibility(8);
                this.A0r.setVisibility(8);
                this.A0o.setVisibility(8);
                if (this.A0D == null) {
                    this.A0p.setVisibility(0);
                }
            } else {
                this.A0r.setVisibility(0);
                boolean z2 = this.A0d;
                View view = this.A0o;
                if (z2) {
                    view.setVisibility(0);
                    this.A0n.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    this.A0n.setVisibility(0);
                }
                if (this.A0D == null) {
                    this.A0p.setVisibility(8);
                }
            }
            View findViewById = this.A0P.findViewById(R.id.permissions_request_minimized);
            if (findViewById != null) {
                findViewById.setVisibility(4);
                this.A03 = (int) (((double) this.A0F.getMeasuredHeight()) * 0.66d);
                ViewGroup.LayoutParams layoutParams = this.A0H.getLayoutParams();
                int i = this.A03;
                layoutParams.height = i;
                A0F(this, (Float) null, i, false);
            }
            A0U(f, z);
            return;
        }
        this.A0n.setVisibility(8);
        this.A0o.setVisibility(8);
        this.A0r.setVisibility(8);
        this.A0K.setVisibility(8);
        if (this.A0D == null) {
            this.A0p.setVisibility(8);
        }
        C19420v0 r0 = this.A19;
        r0.A1x(true);
        C36331k8.A0w(C19420v0.A00(r0), "nearby_location_new_user", true);
        View findViewById2 = this.A0P.findViewById(R.id.permissions_request_minimized);
        this.A0B.setVisibility(8);
        boolean z3 = this.A0e;
        ImageView imageView = this.A0J;
        if (z3) {
            imageView.setImageResource(R.drawable.btn_map_fullscreen_off);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                if (findViewById2.getMeasuredHeight() > 0) {
                    A0F(this, f, findViewById2.getMeasuredHeight(), z);
                } else {
                    findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new C164767sL(f, findViewById2, this, 2));
                }
            }
            this.A0H.setVisibility(8);
            return;
        }
        imageView.setImageResource(R.drawable.btn_map_fullscreen_on);
        this.A0H.setVisibility(0);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
            if (this.A03 > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.A0H.getLayoutParams();
                int i2 = this.A03;
                layoutParams2.height = i2;
                A0F(this, f, i2, z);
            }
        }
    }

    public void A0W(Object obj) {
        Iterator it = this.A0W.A0D.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A0D)) {
                this.A0V = placeInfo;
                break;
            }
        }
        A04();
    }

    public void A0X(String str, Object obj) {
        if (str != null) {
            for (PlaceInfo placeInfo : this.A0W.A0D) {
                if (obj.equals(placeInfo.A0D)) {
                    A0E(this, placeInfo);
                    return;
                }
            }
        }
    }

    public void A0Q(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            A05(A0I(), this, intent.getStringExtra("query"), Math.max(A0H(), 50000), true);
        }
    }

    public boolean A0Z(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search || itemId == R.id.menuitem_search) {
            this.A0P.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0c = false;
            A05(A0I(), this, (String) null, A0H(), false);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (this.A0i) {
                this.A0T.A05.dismiss();
                A08(this);
                return true;
            }
            this.A0P.finish();
            return true;
        }
    }

    public C133586Zc(C24801Dv r3, C19700wN r4, C237019m r5, AnonymousClass17Y r6, C19730wQ r7, C20050ww r8, AnonymousClass1X4 r9, AnonymousClass1Pp r10, AnonymousClass185 r11, C235618y r12, C27761Ps r13, C64953Qc r14, C21060yb r15, C19970wo r16, C19630wG r17, C20830yE r18, C19420v0 r19, C18820ts r20, C220412q r21, AnonymousClass1N0 r22, C1261362r r23, AnonymousClass6O1 r24, AnonymousClass1XN r25, AnonymousClass1H2 r26, EmojiSearchProvider emojiSearchProvider, C20810yC r28, AnonymousClass13E r29, AnonymousClass1P5 r30, AnonymousClass2XH r31, AnonymousClass6LW r32, WhatsAppLibLoader whatsAppLibLoader, C19890wg r34, AnonymousClass1A1 r35, C20380xT r36, AnonymousClass1N2 r37, C19770wU r38) {
        this.A17 = r17;
        this.A16 = r16;
        this.A1A = r28;
        this.A10 = r6;
        this.A1X = r37;
        this.A1G = r4;
        this.A1H = r7;
        this.A1Y = r38;
        this.A1M = r21;
        this.A1I = r8;
        this.A1R = r26;
        this.A11 = r9;
        this.A1Q = r25;
        this.A1T = r29;
        this.A0y = r3;
        this.A1B = r31;
        this.A1J = r10;
        this.A1F = r36;
        this.A15 = r15;
        this.A1L = r20;
        this.A1O = r23;
        this.A1E = r35;
        this.A13 = r12;
        this.A1D = r32;
        this.A1V = whatsAppLibLoader;
        this.A1S = emojiSearchProvider;
        this.A12 = r11;
        this.A18 = r18;
        this.A19 = r19;
        this.A0z = r5;
        this.A1U = r30;
        this.A1W = r34;
        this.A1K = r13;
        this.A1P = r24;
        this.A1N = r22;
        this.A14 = r14;
    }
}
