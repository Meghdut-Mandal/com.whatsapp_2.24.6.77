package X;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ComponentActivity$4;
import androidx.activity.ComponentActivity$5;
import androidx.activity.ImmLeaksCleaner;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01G  reason: invalid class name */
public abstract class AnonymousClass01G extends AnonymousClass014 implements AnonymousClass012, AnonymousClass015, AnonymousClass016, AnonymousClass017, AnonymousClass018, AnonymousClass019, AnonymousClass01A, AnonymousClass01B, AnonymousClass01C, AnonymousClass01D, AnonymousClass01E, AnonymousClass01F {
    public static final String A0F = "android:support:activity-result";
    public int A00;
    public AnonymousClass04G A01;
    public AnonymousClass04J A02;
    public final AnonymousClass01Q A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass01W A05;
    public final AnonymousClass01N A06;
    public final AnonymousClass01T A07;
    public final AnonymousClass01S A08;
    public final CopyOnWriteArrayList A09;
    public final CopyOnWriteArrayList A0A;
    public final CopyOnWriteArrayList A0B;
    public final CopyOnWriteArrayList A0C;
    public final CopyOnWriteArrayList A0D;
    public final AtomicInteger A0E;

    public /* synthetic */ Bundle A1X() {
        Bundle bundle = new Bundle();
        AnonymousClass01X r4 = this.A04;
        Map map = r4.A03;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r4.A00));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) r4.A02.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", r4.A01);
        return bundle;
    }

    public final C009904e A1Y(AnonymousClass01X r3, C009604b r4, AnonymousClass04Z r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("activity_rq#");
        sb.append(this.A0E.getAndIncrement());
        return r3.A01(r4, r5, this, sb.toString());
    }

    public void A1Z() {
        if (this.A02 == null) {
            AnonymousClass04I r0 = (AnonymousClass04I) getLastNonConfigurationInstance();
            if (r0 != null) {
                this.A02 = r0.A00;
            }
            if (this.A02 == null) {
                this.A02 = new AnonymousClass04J();
            }
        }
    }

    public /* synthetic */ void A1d() {
        Bundle A002 = this.A07.A01.A00(A0F);
        if (A002 != null) {
            AnonymousClass01X r8 = this.A04;
            ArrayList<Integer> integerArrayList = A002.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = A002.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                r8.A00 = A002.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                r8.A01 = (Random) A002.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = r8.A02;
                bundle.putAll(A002.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    Map map = r8.A03;
                    if (map.containsKey(str)) {
                        Object remove = map.remove(str);
                        if (!bundle.containsKey(str)) {
                            r8.A05.remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i);
                    String str2 = stringArrayList.get(i);
                    r8.A05.put(num, str2);
                    map.put(str2, num);
                }
            }
        }
    }

    public final void A1e(C004101v r3) {
        AnonymousClass01Q r1 = this.A03;
        if (r1.A01 != null) {
            r3.BUZ(r1.A01);
        }
        r1.A00.add(r3);
    }

    public final void A1f(C004101v r2) {
        this.A03.A00.remove(r2);
    }

    public final void A1g(AnonymousClass026 r2) {
        this.A0B.add(r2);
    }

    public final void A1h(AnonymousClass026 r2) {
        this.A0B.remove(r2);
    }

    public void A1i(AnonymousClass027 r7, AnonymousClass01P r8, AnonymousClass012 r9) {
        AnonymousClass01S r5 = this.A08;
        AnonymousClass01M lifecycle = r9.getLifecycle();
        Map map = r5.A01;
        C06040Sb r2 = (C06040Sb) map.remove(r7);
        if (r2 != null) {
            r2.A01.A05(r2.A00);
            r2.A00 = null;
        }
        map.put(r7, new C06040Sb(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda1(r5, r7, r8)));
    }

    public void A1j(AnonymousClass027 r7, AnonymousClass012 r8) {
        AnonymousClass01S r5 = this.A08;
        r5.A02.add(r7);
        r5.A00.run();
        AnonymousClass01M lifecycle = r8.getLifecycle();
        Map map = r5.A01;
        C06040Sb r2 = (C06040Sb) map.remove(r7);
        if (r2 != null) {
            r2.A01.A05(r2.A00);
            r2.A00 = null;
        }
        map.put(r7, new C06040Sb(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda0(r5, r7)));
    }

    public void B0U(AnonymousClass027 r3) {
        AnonymousClass01S r1 = this.A08;
        r1.A02.add(r3);
        r1.A00.run();
    }

    public final void B0X(AnonymousClass026 r2) {
        this.A09.add(r2);
    }

    public final void B0Z(AnonymousClass026 r2) {
        this.A0A.add(r2);
    }

    public final void B0a(AnonymousClass026 r2) {
        this.A0C.add(r2);
    }

    public final void B0d(AnonymousClass026 r2) {
        this.A0D.add(r2);
    }

    public AnonymousClass04K BAv() {
        AnonymousClass04L r3 = new AnonymousClass04L();
        if (getApplication() != null) {
            r3.A00.put(AnonymousClass04O.A02, getApplication());
        }
        C003401n r0 = C003301m.A01;
        Map map = r3.A00;
        map.put(r0, this);
        map.put(C003301m.A02, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            map.put(C003301m.A00, getIntent().getExtras());
        }
        return r3;
    }

    public AnonymousClass04G BAw() {
        Bundle bundle;
        AnonymousClass04G r2 = this.A01;
        if (r2 != null) {
            return r2;
        }
        Application application = getApplication();
        if (getIntent() != null) {
            bundle = getIntent().getExtras();
        } else {
            bundle = null;
        }
        AnonymousClass08W r22 = new AnonymousClass08W(application, bundle, this);
        this.A01 = r22;
        return r22;
    }

    public final AnonymousClass01U BGx() {
        return this.A07.A01;
    }

    public final C009904e BnD(C009604b r2, AnonymousClass04Z r3) {
        return A1Y(this.A04, r2, r3);
    }

    public void Bno(AnonymousClass027 r2) {
        this.A08.A00(r2);
    }

    public final void Bnp(AnonymousClass026 r2) {
        this.A09.remove(r2);
    }

    public final void Bnq(AnonymousClass026 r2) {
        this.A0A.remove(r2);
    }

    public final void Bnr(AnonymousClass026 r2) {
        this.A0C.remove(r2);
    }

    public final void Bnu(AnonymousClass026 r2) {
        this.A0D.remove(r2);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A04.A06(intent, i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.A05.A00();
    }

    public void onCreate(Bundle bundle) {
        this.A07.A01(bundle);
        AnonymousClass01Q r0 = this.A03;
        r0.A01 = this;
        for (C004101v BUZ : r0.A00) {
            BUZ.BUZ(this);
        }
        super.onCreate(bundle);
        AnonymousClass05P.A00(this);
        int i = this.A00;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        AnonymousClass01S r0 = this.A08;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = r0.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass028) ((AnonymousClass027) it.next())).A00.A0t(menu, menuInflater);
        }
        return true;
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(new AnonymousClass0WF(configuration));
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass028) ((AnonymousClass027) it.next())).A00.A0a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(new AnonymousClass0WG(configuration));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass028) ((AnonymousClass027) it.next())).A00.A0s(menu);
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.A04.A06(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        AnonymousClass04I r0;
        AnonymousClass04J r1 = this.A02;
        if (r1 == null && ((r0 = (AnonymousClass04I) getLastNonConfigurationInstance()) == null || (r1 = r0.A00) == null)) {
            return null;
        }
        AnonymousClass04I r02 = new AnonymousClass04I();
        r02.A00 = r1;
        return r02;
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass01N r1 = this.A06;
        if (r1 != null) {
            r1.A07(AnonymousClass01P.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A07.A02(bundle);
    }

    public AnonymousClass01G(int i) {
        this();
        this.A00 = i;
    }

    private void A01() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        AnonymousClass00C.A0D(decorView, 0);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        AnonymousClass00C.A0D(decorView2, 0);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public AnonymousClass04J BJ7() {
        if (getApplication() != null) {
            A1Z();
            return this.A02;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A01();
        super.addContentView(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(configuration);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = this.A08.A02.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass028) ((AnonymousClass027) it.next())).A00.A0v(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(intent);
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(Integer.valueOf(i));
        }
    }

    public void reportFullyDrawn() {
        try {
            if (C05880Rk.A00()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A01();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void A1a() {
        getLastNonConfigurationInstance();
    }

    public void A1b() {
        invalidateOptionsMenu();
    }

    public void A1c() {
    }

    public final AnonymousClass01X B8F() {
        return this.A04;
    }

    public final AnonymousClass01W BEd() {
        return this.A05;
    }

    public AnonymousClass01M getLifecycle() {
        return this.A06;
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(new AnonymousClass0WF());
        }
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((AnonymousClass026) it.next()).accept(new AnonymousClass0WG());
        }
    }

    public void setContentView(int i) {
        A01();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public AnonymousClass01G() {
        this.A03 = new AnonymousClass01Q();
        this.A08 = new AnonymousClass01S(new AnonymousClass01R(this));
        this.A06 = new AnonymousClass01N(this);
        AnonymousClass01T r2 = new AnonymousClass01T(this);
        this.A07 = r2;
        this.A05 = new AnonymousClass01W(new AnonymousClass01V(this));
        this.A0E = new AtomicInteger();
        this.A04 = new AnonymousClass01X(this);
        this.A09 = new CopyOnWriteArrayList();
        this.A0D = new CopyOnWriteArrayList();
        this.A0B = new CopyOnWriteArrayList();
        this.A0A = new CopyOnWriteArrayList();
        this.A0C = new CopyOnWriteArrayList();
        AnonymousClass01N r1 = this.A06;
        if (r1 != null) {
            r1.A04(new ComponentActivity$3(this));
            this.A06.A04(new ComponentActivity$4(this));
            this.A06.A04(new ComponentActivity$5(this));
            r2.A00();
            C003301m.A01(this);
            if (Build.VERSION.SDK_INT <= 23) {
                this.A06.A04(new ImmLeaksCleaner(this));
            }
            this.A07.A01.A03(new C18640tU(this, 0), A0F);
            A1e(new C18280su(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void setContentView(View view) {
        A01();
        super.setContentView(view);
    }
}
