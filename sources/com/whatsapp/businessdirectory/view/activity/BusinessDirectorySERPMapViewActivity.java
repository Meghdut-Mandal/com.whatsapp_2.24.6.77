package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass0CP;
import X.AnonymousClass0IK;
import X.AnonymousClass17Y;
import X.AnonymousClass1RC;
import X.AnonymousClass2XH;
import X.AnonymousClass3MZ;
import X.AnonymousClass3U9;
import X.AnonymousClass51F;
import X.AnonymousClass51G;
import X.AnonymousClass5B8;
import X.AnonymousClass5DR;
import X.AnonymousClass5DV;
import X.AnonymousClass6J8;
import X.AnonymousClass6QG;
import X.AnonymousClass6QK;
import X.AnonymousClass6V2;
import X.C02800By;
import X.C115735jM;
import X.C123195w6;
import X.C124515yJ;
import X.C132426To;
import X.C134976bv;
import X.C134986bw;
import X.C134996bx;
import X.C135016bz;
import X.C135436ch;
import X.C135976dZ;
import X.C139266jV;
import X.C142646pD;
import X.C163027pX;
import X.C165327tF;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C19770wU;
import X.C20830yE;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C88434Sr;
import X.C90464aC;
import X.C90484aE;
import X.C92794ej;
import X.C95404kp;
import X.C96394nG;
import X.C97674q5;
import android.app.ActionBar;
import android.content.Intent;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import java.util.Map;
import java.util.Set;

public final class BusinessDirectorySERPMapViewActivity extends AnonymousClass51F implements C88434Sr {
    public ImageView A00;
    public RecyclerView A01;
    public RecyclerView A02;
    public C139266jV A03;
    public C115735jM A04;
    public AnonymousClass6V2 A05;
    public AnonymousClass5DV A06;
    public AnonymousClass51G A07;
    public C123195w6 A08;
    public C132426To A09;
    public AnonymousClass5B8 A0A;
    public boolean A0B;
    public final AnonymousClass0IK A0C;

    public void BSI() {
    }

    public void BbF(Set set) {
        AnonymousClass00C.A0D(set, 0);
        C95404kp A3i = A3i();
        AnonymousClass6QK r0 = A3i.A0N;
        r0.A01 = set;
        A3i.A0J.A03((Boolean) null, A3i.A0L.A03(), r0.A06(), 75);
        C95404kp.A05(A3i);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        if (this.A06 != null) {
            C95404kp A3i = A3i();
            A3i.A0H.A03("arg_should_animate_on_gps_change", Boolean.valueOf(A3i.A0D));
        }
        AnonymousClass5B8 r0 = this.A0A;
        if (r0 == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        r0.A0G(bundle);
        super.onSaveInstanceState(bundle);
    }

    public static final boolean A01(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        Object systemService = businessDirectorySERPMapViewActivity.getSystemService("location");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        C20830yE r0 = businessDirectorySERPMapViewActivity.A07;
        if (r0 == null) {
            throw C36331k8.A0d("waPermissionsHelper");
        } else if (!r0.A05() || !locationManager.isProviderEnabled("gps")) {
            return false;
        } else {
            return true;
        }
    }

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C90464aC.A11(r3, this);
            C18830tt r2 = r3.A00;
            C90464aC.A0y(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A08 = C36411kG.A0m(r3);
            this.A07 = C36351kA.A0X(r3);
            this.A05 = C27111My.A0l(A0L);
            this.A03 = (AnonymousClass5DR) r2.A0c.get();
            C18820ts r7 = (C18820ts) r3.A9X.get();
            this.A04 = new DirectoryMapViewLocationUpdateListener(C90484aE.A0T(r3), (AnonymousClass17Y) r3.A3e.get(), (C19630wG) r3.A91.get(), r7, (C19770wU) r3.A9Y.get());
            this.A02 = (C142646pD) r2.A1S.get();
            this.A08 = C27111My.A0k(A0L);
            this.A05 = C27111My.A0Z(A0L);
            this.A06 = C27111My.A0d(A0L);
            this.A07 = C27111My.A0f(A0L);
            this.A04 = (C115735jM) A0L.A2J.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A06 != null) {
            if (i == 34) {
                if (i2 == -1) {
                    this.A0A = true;
                    AnonymousClass5DR r0 = this.A03;
                    if (r0 != null) {
                        r0.A02(true);
                        A3j(false);
                    } else {
                        throw C36331k8.A0d("businessDirectorySharedPrefs");
                    }
                } else if (i2 == 0) {
                    A3i();
                }
                C139266jV r1 = this.A03;
                if (r1 != null) {
                    r1.A0D(A01(this));
                }
            } else if (i == 35) {
                LocationManager A0C2 = this.A08.A0C();
                boolean z = false;
                if (A0C2 != null && (A0C2.isProviderEnabled("gps") || A0C2.isProviderEnabled("network"))) {
                    z = true;
                }
                C95404kp A3i = A3i();
                if (z) {
                    C36341k9.A16(A3i.A0W, 0);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.A06 != null) {
            C95404kp A3i = A3i();
            C132426To r3 = A3i.A08;
            AnonymousClass011 r1 = r3.A06;
            if (r1 == null || r1.first == null) {
                A3i.A0J.A08(A3i.A0L.A03(), C36361kB.A0j(), (Map) null, 11, 72, 1);
                C36341k9.A16(A3i.A0W, 9);
                return;
            }
            C97674q5 r0 = (C97674q5) r1.second;
            if (r0 != null) {
                r0.A08();
            }
            r3.A06 = null;
            C36341k9.A16(A3i.A0W, 12);
            A3i.A0J.A08(A3i.A0L.A03(), C36421kH.A0U(), (Map) null, 11, 72, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        float f;
        if (AnonymousClass3U9.A00) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300);
            changeBounds.setInterpolator(new C135976dZ());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C134986bw r0 = (C134986bw) getIntent().getParcelableExtra("arg_parent_category");
        String str2 = null;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        setTitle(str);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CharSequence title = getTitle();
        if (title != null) {
            str2 = title.toString();
        }
        C18740tg.A06(str2);
        AnonymousClass3MZ.A01(toolbar, this.A00, str2);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar actionBar2 = getActionBar();
        if (actionBar2 != null) {
            actionBar2.setDisplayShowHomeEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new C135436ch(this, 34));
        ImageView A0L = C36341k9.A0L(this.A00, R.id.my_location);
        C36361kB.A18(A0L, this, 35);
        this.A00 = A0L;
        AnonymousClass6QG A012 = AnonymousClass6QG.A01(getIntent().getStringExtra("arg_search_location"));
        if (A012 != null && AnonymousClass00C.A0J(A012.A08, "device") && A01(this)) {
            ImageView imageView = this.A00;
            if (imageView == null) {
                throw C36331k8.A0d("myLocationBtn");
            }
            imageView.setImageResource(R.drawable.icon_my_loc_active);
        }
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(this.A00, R.id.filter_bar_list);
        AnonymousClass51G r02 = this.A07;
        if (r02 != null) {
            recyclerView.setAdapter(r02);
            this.A01 = recyclerView;
            C36351kA.A1F(recyclerView, 1);
            this.A00 = (ViewGroup) C36361kB.A0G(this.A00, R.id.progress_bar_container);
            RecyclerView recyclerView2 = (RecyclerView) C36361kB.A0G(this.A00, R.id.business_list);
            AnonymousClass5DV r03 = this.A06;
            if (r03 != null) {
                recyclerView2.setAdapter(r03);
                this.A02 = recyclerView2;
                AnonymousClass0CP layoutManager = recyclerView2.getLayoutManager();
                AnonymousClass00C.A0E(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView recyclerView3 = this.A02;
                if (recyclerView3 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                recyclerView3.setClipToPadding(false);
                linearLayoutManager.A07 = true;
                RecyclerView recyclerView4 = this.A02;
                if (recyclerView4 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                recyclerView4.setItemAnimator((C02800By) null);
                AnonymousClass0IK r1 = this.A0C;
                RecyclerView recyclerView5 = this.A02;
                if (recyclerView5 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                r1.A07(recyclerView5);
                RecyclerView recyclerView6 = this.A02;
                if (recyclerView6 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                recyclerView6.A0v(new C96394nG(linearLayoutManager, this));
                CardView cardView = (CardView) C36361kB.A0G(this.A00, R.id.map_view_chip);
                this.A01 = cardView;
                if (cardView == null) {
                    throw C36331k8.A0d("mapViewChip");
                }
                C36361kB.A18(cardView, this, 38);
                AnonymousClass2XH r04 = this.A08;
                if (r04 != null) {
                    r04.A03(this);
                    C135016bz r05 = (C135016bz) getIntent().getParcelableExtra("arg_map_view_config");
                    if (r05 != null) {
                        f = r05.A01;
                    } else {
                        f = 16.0f;
                    }
                    AnonymousClass6QG A013 = AnonymousClass6QG.A01(getIntent().getStringExtra("arg_search_location"));
                    double d = C92794ej.A0n;
                    C18740tg.A06(A013);
                    AnonymousClass00C.A08(A013);
                    C124515yJ r4 = new C124515yJ();
                    r4.A00 = 8;
                    r4.A08 = true;
                    r4.A05 = false;
                    r4.A06 = AnonymousClass1RC.A0A(this);
                    r4.A04 = "whatsapp_smb_business_discovery";
                    Double d2 = A013.A03;
                    AnonymousClass00C.A0B(d2);
                    double doubleValue = d2.doubleValue();
                    Double d3 = A013.A04;
                    AnonymousClass00C.A0B(d3);
                    r4.A02 = new C134996bx(C134976bv.A00(doubleValue, d3.doubleValue()), f, 90.0f, 0.0f);
                    this.A0A = new AnonymousClass5B8(this, r4);
                    ViewGroup A0O = C36411kG.A0O(this.A00, R.id.map_view_holder);
                    AnonymousClass5B8 r06 = this.A0A;
                    if (r06 == null) {
                        throw C36331k8.A0d("facebookMapView");
                    }
                    r06.A0F(bundle);
                    AnonymousClass5B8 r07 = this.A0A;
                    if (r07 == null) {
                        throw C36331k8.A0d("facebookMapView");
                    }
                    A0O.addView(r07);
                    if (this.A03 == null) {
                        AnonymousClass5B8 r2 = this.A0A;
                        if (r2 == null) {
                            throw C36331k8.A0d("facebookMapView");
                        }
                        r2.A0J(new C165327tF(bundle, this, 0));
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("locationUtils");
            }
            throw C36331k8.A0d("horizontalBusinessListAdapter");
        }
        throw C36331k8.A0d("filterBarListAdapter");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null && menu.findItem(1) == null) {
            menu.add(0, 4, 1, getString(R.string.f12nameremoved));
            MenuItem icon = menu.add(0, 1, 0, getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search);
            AnonymousClass00C.A08(icon);
            icon.setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (this.A0A == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        double d = C92794ej.A0n;
        AnonymousClass6J8.A03 = null;
        AnonymousClass6J8.A00 = null;
        AnonymousClass6J8.A02 = null;
        AnonymousClass6J8.A04 = null;
        AnonymousClass6J8.A05 = null;
        AnonymousClass6J8.A06 = null;
        AnonymousClass6J8.A01 = null;
        super.onDestroy();
    }

    public BusinessDirectorySERPMapViewActivity(int i) {
        this.A0B = false;
        C163027pX.A00(this, 21);
    }

    public void onLowMemory() {
        super.onLowMemory();
        AnonymousClass5B8 r0 = this.A0A;
        if (r0 == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        r0.A0C();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 1) {
            C95404kp A3i = A3i();
            A3i.A0J.A08(A3i.A0L.A03(), 1, (Map) null, 11, 62, 1);
            Intent A0H = C36441kJ.A0H(this, BusinessDirectoryActivity.class);
            A0H.putExtra("arg_launch_consumer_home", true);
            A0H.setFlags(67108864);
            startActivity(A0H);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        AnonymousClass5B8 r2 = this.A0A;
        if (r2 == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        double d = C92794ej.A0n;
        SensorManager sensorManager = r2.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r2.A0D);
        }
    }

    public void onResume() {
        super.onResume();
        AnonymousClass5B8 r2 = this.A0A;
        if (r2 == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        double d = C92794ej.A0n;
        r2.A0K();
        C139266jV r1 = this.A03;
        if (r1 != null) {
            r1.A0D(A01(this));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0A == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        double d = C92794ej.A0n;
    }

    public void onStop() {
        super.onStop();
        if (this.A0A == null) {
            throw C36331k8.A0d("facebookMapView");
        }
        double d = C92794ej.A0n;
    }

    public BusinessDirectorySERPMapViewActivity() {
        this(0);
        this.A0C = new AnonymousClass0IK();
    }
}
