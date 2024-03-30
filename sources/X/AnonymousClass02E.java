package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.02E  reason: invalid class name */
public class AnonymousClass02E implements AnonymousClass012, AnonymousClass015, AnonymousClass016, AnonymousClass017, AnonymousClass018, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final Object A0p = new Object();
    public AnonymousClass04G A00;
    public Boolean A01;
    public Runnable A02 = new C021309a(this);
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = -1;
    public int A09;
    public Bundle A0A;
    public Bundle A0B;
    public Bundle A0C;
    public SparseArray A0D;
    public LayoutInflater A0E;
    public View A0F;
    public ViewGroup A0G;
    public C023009r A0H;
    public AnonymousClass02E A0I;
    public AnonymousClass02E A0J;
    public C004401y A0K;
    public AnonymousClass01z A0L = new AnonymousClass020();
    public AnonymousClass01z A0M;
    public C02380Ab A0N;
    public AnonymousClass01P A0O = AnonymousClass01P.RESUMED;
    public AnonymousClass01N A0P;
    public C001700s A0Q = new C001700s();
    public AnonymousClass01T A0R;
    public Boolean A0S = null;
    public String A0T;
    public String A0U;
    public String A0V = null;
    public String A0W = UUID.randomUUID().toString();
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g = true;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l = true;
    public final ArrayList A0m = new ArrayList();
    public final AtomicInteger A0n = new AtomicInteger();
    public final C021409b A0o = new C021509c(this);

    public Animation A0e(int i, int i2, boolean z) {
        return null;
    }

    @Deprecated
    public void A0s(int i, String[] strArr, int[] iArr) {
    }

    public void A18(boolean z) {
    }

    public void A19() {
        this.A0Y = true;
    }

    public void A1A(Bundle bundle) {
        this.A0Y = true;
    }

    public void A1B() {
        this.A0Y = true;
    }

    public void A1C(Intent intent) {
        C004401y r0 = this.A0K;
        if (r0 != null) {
            C05290Pd.A00(r0.A01, intent, (Bundle) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public void A1F(Activity activity) {
        this.A0Y = true;
    }

    public void A1H() {
        this.A0Y = true;
    }

    @Deprecated
    public void A1I() {
    }

    public void A1J() {
        this.A0Y = true;
    }

    public void A1K() {
        this.A0Y = true;
    }

    public void A1L() {
        this.A0Y = true;
    }

    public void A1M() {
        this.A0Y = true;
    }

    @Deprecated
    public void A1N(int i, int i2, Intent intent) {
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
    }

    public void A1O(Context context) {
        this.A0Y = true;
        C004401y r0 = this.A0K;
        if (r0 != null) {
            Activity activity = r0.A00;
            this.A0Y = false;
            A1F(activity);
        }
    }

    @Deprecated
    public void A1P(Bundle bundle) {
        this.A0Y = true;
    }

    public void A1Q(Bundle bundle) {
        this.A0Y = true;
        A0v(bundle);
        AnonymousClass01z r2 = this.A0L;
        if (r2.A00 < 1) {
            r2.A0I = false;
            r2.A0J = false;
            r2.A09.A01 = false;
            AnonymousClass01z.A09(r2, 1);
        }
    }

    public void A1R(Bundle bundle) {
    }

    public void A1S(Bundle bundle, View view) {
    }

    @Deprecated
    public void A1T(Menu menu) {
    }

    @Deprecated
    public void A1U(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A1W(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public boolean A1X(MenuItem menuItem) {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A0Y = true;
    }

    public void onLowMemory() {
        this.A0Y = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        A0t(intent, i, (Bundle) null);
    }

    private int A00() {
        AnonymousClass02E r0;
        AnonymousClass01P r1 = this.A0O;
        if (r1 == AnonymousClass01P.INITIALIZED || (r0 = this.A0I) == null) {
            return r1.ordinal();
        }
        return Math.min(r1.ordinal(), r0.A00());
    }

    public static C023009r A01(AnonymousClass02E r1) {
        C023009r r0 = r1.A0H;
        if (r0 != null) {
            return r0;
        }
        C023009r r02 = new C023009r();
        r1.A0H = r02;
        return r02;
    }

    public static AnonymousClass02E A02(AnonymousClass02E r4, boolean z) {
        String str;
        if (z) {
            C022009h r0 = C022009h.A01;
            C03670Hg r3 = new C03670Hg(r4);
            C022009h.A03(r3);
            C022109i A002 = C022009h.A00(r4);
            if (A002.A01.contains(C022409l.DETECT_TARGET_FRAGMENT_USAGE) && C022009h.A04(A002, r4.getClass(), r3.getClass())) {
                C022009h.A02(A002, r3);
            }
        }
        AnonymousClass02E r02 = r4.A0J;
        if (r02 != null) {
            return r02;
        }
        AnonymousClass01z r03 = r4.A0M;
        if (r03 == null || (str = r4.A0V) == null) {
            return null;
        }
        return r03.A0T.A00(str);
    }

    private void A03() {
        this.A0P = new AnonymousClass01N(this);
        this.A0R = new AnonymousClass01T(this);
        this.A00 = null;
        ArrayList arrayList = this.A0m;
        C021409b r1 = this.A0o;
        if (arrayList.contains(r1)) {
            return;
        }
        if (this.A08 >= 0) {
            r1.A00();
        } else {
            arrayList.add(r1);
        }
    }

    public static void A04(MaterialCalendar materialCalendar, int i, int i2) {
        materialCalendar.A03.setVisibility(i);
        materialCalendar.A00.setVisibility(i2);
        materialCalendar.A02.setVisibility(i2);
        materialCalendar.A01.setVisibility(i2);
    }

    public final Bundle A0b() {
        Bundle bundle = this.A0A;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final LayoutInflater A0c() {
        LayoutInflater layoutInflater = this.A0E;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater A1E = A1E((Bundle) null);
        this.A0E = A1E;
        return A1E;
    }

    public final View A0d() {
        View view = this.A0F;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass02E A0f() {
        AnonymousClass02E r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        Context A1D = A1D();
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        if (A1D == null) {
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        sb.append(this);
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(A1D());
        throw new IllegalStateException(sb.toString());
    }

    public AnonymousClass02E A0g(String str) {
        if (str.equals(this.A0W)) {
            return this;
        }
        return this.A0L.A0T.A01(str);
    }

    public final AnonymousClass01I A0h() {
        C004401y r0 = this.A0K;
        if (r0 == null) {
            return null;
        }
        return (AnonymousClass01I) r0.A00;
    }

    public C004201w A0j() {
        return new C023209t(this);
    }

    public final AnonymousClass01z A0k() {
        if (this.A0K != null) {
            return this.A0L;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass01z A0l() {
        AnonymousClass01z r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public C02380Ab A0m() {
        C02380Ab r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void A0q() {
        ViewGroup viewGroup;
        if (this.A0H != null && A01(this).A0E) {
            if (this.A0K == null) {
                A01(this).A0E = false;
            } else if (Looper.myLooper() != this.A0K.A02.getLooper()) {
                this.A0K.A02.postAtFrontOfQueue(new C11230fw(this));
            } else {
                C023009r r1 = this.A0H;
                if (r1 != null) {
                    r1.A0E = false;
                }
                if (this.A0F != null && (viewGroup = this.A0G) != null && this.A0M != null) {
                    AnonymousClass0BU A002 = AnonymousClass0BU.A00(viewGroup);
                    A002.A06();
                    this.A0K.A02.post(new C11470gM(this, A002));
                }
            }
        }
    }

    public void A0r(int i, int i2, int i3, int i4) {
        if (this.A0H != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            A01(this).A01 = i;
            A01(this).A02 = i2;
            A01(this).A04 = i3;
            A01(this).A05 = i4;
        }
    }

    @Deprecated
    public void A0t(Intent intent, int i, Bundle bundle) {
        if (this.A0K != null) {
            AnonymousClass01z A0l2 = A0l();
            if (A0l2.A03 != null) {
                A0l2.A0B.addLast(new C08750bG(this.A0W, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                A0l2.A03.A01((AnonymousClass0YW) null, intent);
                return;
            }
            C004401y r1 = A0l2.A07;
            if (i == -1) {
                C05290Pd.A00(r1.A01, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void A0v(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.A0L.A0Z(parcelable);
            AnonymousClass01z r2 = this.A0L;
            r2.A0I = false;
            r2.A0J = false;
            r2.A09.A01 = false;
            AnonymousClass01z.A09(r2, 1);
        }
    }

    public void A0w(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0L.A0U();
        this.A0h = true;
        this.A0N = new C02380Ab(this, BJ7());
        View A1G = A1G(bundle, layoutInflater, viewGroup);
        this.A0F = A1G;
        C02380Ab r0 = this.A0N;
        if (A1G != null) {
            r0.A00();
            this.A0F.setTag(R.id.view_tree_lifecycle_owner, this.A0N);
            this.A0F.setTag(R.id.view_tree_view_model_store_owner, this.A0N);
            View view = this.A0F;
            C02380Ab r1 = this.A0N;
            AnonymousClass00C.A0D(view, 0);
            view.setTag(R.id.view_tree_saved_state_registry_owner, r1);
            this.A0Q.A0D(this.A0N);
        } else if (r0.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.A0N = null;
        }
    }

    public void A0x(C08740bF r3) {
        Bundle bundle;
        if (this.A0M == null) {
            if (r3 == null || (bundle = r3.A00) == null) {
                bundle = null;
            }
            this.A0B = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    @Deprecated
    public void A0y(AnonymousClass02E r5, int i) {
        AnonymousClass01z r0;
        if (r5 != null) {
            C022009h r02 = C022009h.A01;
            C03680Hh r3 = new C03680Hh(this, r5, i);
            C022009h.A03(r3);
            C022109i A002 = C022009h.A00(this);
            if (A002.A01.contains(C022409l.DETECT_TARGET_FRAGMENT_USAGE) && C022009h.A04(A002, getClass(), r3.getClass())) {
                C022009h.A02(A002, r3);
            }
        }
        AnonymousClass01z r1 = this.A0M;
        if (r5 != null) {
            r0 = r5.A0M;
        } else {
            r0 = null;
        }
        if (r1 == null || r0 == null || r1 == r0) {
            AnonymousClass02E r12 = r5;
            while (r12 != null) {
                if (!r12.equals(this)) {
                    r12 = A02(r12, false);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(r5);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (r5 == null) {
                this.A0V = null;
                this.A0J = null;
            } else if (this.A0M == null || r5.A0M == null) {
                this.A0V = null;
                this.A0J = r5;
            } else {
                this.A0V = r5.A0W;
                this.A0J = null;
            }
            this.A09 = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(r5);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public void A10(boolean z) {
        if (this.A0c != z) {
            this.A0c = z;
            if (A12() && !A13()) {
                this.A0K.A04.invalidateOptionsMenu();
            }
        }
    }

    public void A11(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
            if (this.A0c && A12() && !A13()) {
                this.A0K.A04.invalidateOptionsMenu();
            }
        }
    }

    public final boolean A12() {
        if (this.A0K == null || !this.A0X) {
            return false;
        }
        return true;
    }

    public final boolean A13() {
        AnonymousClass02E r0;
        if (this.A0d) {
            return true;
        }
        if (this.A0M == null || (r0 = this.A0I) == null || !r0.A13()) {
            return false;
        }
        return true;
    }

    public final boolean A14() {
        AnonymousClass02E r0;
        if (!this.A0g) {
            return false;
        }
        if (this.A0M == null || (r0 = this.A0I) == null || r0.A14()) {
            return true;
        }
        return false;
    }

    public boolean A16(MenuItem menuItem) {
        if (this.A0d) {
            return false;
        }
        if (A1W(menuItem)) {
            return true;
        }
        return this.A0L.A0u(menuItem);
    }

    public void A17(Bundle bundle) {
        AnonymousClass01z r0 = this.A0M;
        if (r0 == null || !r0.A0r()) {
            this.A0A = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Context A1D() {
        C004401y r0 = this.A0K;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public LayoutInflater A1E(Bundle bundle) {
        C004401y r0 = this.A0K;
        if (r0 != null) {
            AnonymousClass01I r1 = r0.A04;
            LayoutInflater cloneInContext = r1.getLayoutInflater().cloneInContext(r1);
            cloneInContext.setFactory2(this.A0L.A0R);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.A06;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r6 != false) goto L_0x005c;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1V(boolean r6) {
        /*
            r5 = this;
            X.09h r0 = X.C022009h.A01
            X.09k r3 = new X.09k
            r3.<init>(r5, r6)
            X.C022009h.A03(r3)
            X.09i r2 = X.C022009h.A00(r5)
            java.util.Set r1 = r2.A01
            X.09l r0 = X.C022409l.DETECT_SET_USER_VISIBLE_HINT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r3.getClass()
            boolean r0 = X.C022009h.A04(r2, r1, r0)
            if (r0 == 0) goto L_0x0029
            X.C022009h.A02(r2, r3)
        L_0x0029:
            boolean r0 = r5.A0l
            r4 = 5
            if (r0 != 0) goto L_0x0053
            if (r6 == 0) goto L_0x0053
            int r0 = r5.A08
            if (r0 >= r4) goto L_0x0053
            X.01z r3 = r5.A0M
            if (r3 == 0) goto L_0x0053
            boolean r0 = r5.A12()
            if (r0 == 0) goto L_0x0053
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x0053
            X.09q r2 = r3.A0Q(r5)
            X.02E r1 = r2.A02
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x006a
            r0 = 1
            r3.A0G = r0
        L_0x0053:
            r5.A0l = r6
            int r0 = r5.A08
            if (r0 >= r4) goto L_0x005c
            r0 = 1
            if (r6 == 0) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r5.A0Z = r0
            android.os.Bundle r0 = r5.A0B
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A01 = r0
        L_0x0069:
            return
        L_0x006a:
            r0 = 0
            r1.A0Z = r0
            r2.A04()
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02E.A1V(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (X.AnonymousClass01z.A0E(3) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not find Application instance from Context ");
        r1.append(A0a().getApplicationContext());
        r1.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass04G BAw() {
        /*
            r3 = this;
            X.01z r0 = r3.A0M
            if (r0 == 0) goto L_0x0059
            X.04G r1 = r3.A00
            if (r1 != 0) goto L_0x0051
            r2 = 0
            android.content.Context r0 = r3.A0a()
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0011:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x0052
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L_0x0048
        L_0x001e:
            r0 = 3
            boolean r0 = X.AnonymousClass01z.A0E(r0)
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r3.A0a()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0048:
            android.os.Bundle r0 = r3.A0A
            X.08W r1 = new X.08W
            r1.<init>(r2, r0, r3)
            r3.A00 = r1
        L_0x0051:
            return r1
        L_0x0052:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0011
        L_0x0059:
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02E.BAw():X.04G");
    }

    public final AnonymousClass01U BGx() {
        return this.A0R.A01;
    }

    public AnonymousClass04J BJ7() {
        AnonymousClass01z r2 = this.A0M;
        if (r2 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (A00() != 1) {
            HashMap hashMap = r2.A09.A04;
            AnonymousClass04J r1 = (AnonymousClass04J) hashMap.get(this.A0W);
            if (r1 != null) {
                return r1;
            }
            AnonymousClass04J r12 = new AnonymousClass04J();
            hashMap.put(this.A0W, r12);
            return r12;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final C009904e BnD(C009604b r8, AnonymousClass04Z r9) {
        AnonymousClass0AU r4 = new AnonymousClass0AU(this);
        if (this.A08 <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            AnonymousClass0AV r1 = new AnonymousClass0AV(r8, r9, r4, this, atomicReference);
            if (this.A08 >= 0) {
                r1.A00();
            } else {
                this.A0m.add(r1);
            }
            return new AnonymousClass0AY(r9, this, atomicReference);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.A0W);
        int i = this.A07;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.A0U;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    public AnonymousClass02E() {
        A03();
    }

    public final Context A0a() {
        Context A1D = A1D();
        if (A1D != null) {
            return A1D;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass01I A0i() {
        AnonymousClass01I A0h2 = A0h();
        if (A0h2 != null) {
            return A0h2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final String A0n(int i) {
        return A0a().getResources().getString(i);
    }

    public final String A0o(int i, Object... objArr) {
        return A0a().getResources().getString(i, objArr);
    }

    public void A0p() {
        A03();
        this.A0T = this.A0W;
        this.A0W = UUID.randomUUID().toString();
        this.A0X = false;
        this.A0i = false;
        this.A0b = false;
        this.A0e = false;
        this.A0j = false;
        this.A04 = 0;
        this.A0M = null;
        this.A0L = new AnonymousClass020();
        this.A0K = null;
        this.A07 = 0;
        this.A05 = 0;
        this.A0U = null;
        this.A0d = false;
        this.A0a = false;
    }

    public void A0u(Bundle bundle) {
        A1R(bundle);
        this.A0R.A02(bundle);
        bundle.putParcelable("android:support:fragments", this.A0L.A0J());
    }

    public void A0z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A07));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A05));
        printWriter.print(" mTag=");
        printWriter.println(this.A0U);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.A08);
        printWriter.print(" mWho=");
        printWriter.print(this.A0W);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A04);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0X);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A0i);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A0b);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0e);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A0d);
        printWriter.print(" mDetached=");
        printWriter.print(this.A0a);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A0g);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.A0c);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A0k);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.A0l);
        if (this.A0M != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A0M);
        }
        if (this.A0K != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A0K);
        }
        if (this.A0I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A0I);
        }
        if (this.A0A != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.A0A);
        }
        if (this.A0B != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.A0B);
        }
        if (this.A0D != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.A0D);
        }
        if (this.A0C != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.A0C);
        }
        AnonymousClass02E A022 = A02(this, false);
        if (A022 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A022);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A09);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C023009r r0 = this.A0H;
        if (r0 == null) {
            z = false;
        } else {
            z = r0.A0F;
        }
        printWriter.println(z);
        C023009r r02 = this.A0H;
        if (!(r02 == null || r02.A01 == 0)) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C023009r r03 = this.A0H;
            if (r03 == null) {
                i4 = 0;
            } else {
                i4 = r03.A01;
            }
            printWriter.println(i4);
        }
        C023009r r04 = this.A0H;
        if (!(r04 == null || r04.A02 == 0)) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C023009r r05 = this.A0H;
            if (r05 == null) {
                i3 = 0;
            } else {
                i3 = r05.A02;
            }
            printWriter.println(i3);
        }
        C023009r r06 = this.A0H;
        if (!(r06 == null || r06.A04 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C023009r r07 = this.A0H;
            if (r07 == null) {
                i2 = 0;
            } else {
                i2 = r07.A04;
            }
            printWriter.println(i2);
        }
        C023009r r08 = this.A0H;
        if (!(r08 == null || r08.A05 == 0)) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C023009r r09 = this.A0H;
            if (r09 == null) {
                i = 0;
            } else {
                i = r09.A05;
            }
            printWriter.println(i);
        }
        if (this.A0G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.A0G);
        }
        if (this.A0F != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.A0F);
        }
        if (A1D() != null) {
            C07540Ye.A00(this).A04(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.A0L);
        sb.append(":");
        printWriter.println(sb.toString());
        AnonymousClass01z r2 = this.A0L;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        r2.A0p(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public final boolean A15() {
        View view;
        if (!A12() || A13() || (view = this.A0F) == null || view.getWindowToken() == null || this.A0F.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.AnonymousClass01z.A0E(3) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not find Application instance from Context ");
        r1.append(A0a().getApplicationContext());
        r1.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass04K BAv() {
        /*
            r4 = this;
            android.content.Context r0 = r4.A0a()
            android.content.Context r2 = r0.getApplicationContext()
        L_0x0008:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0067
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L_0x0060
            if (r2 != 0) goto L_0x003c
        L_0x0012:
            r0 = 3
            boolean r0 = X.AnonymousClass01z.A0E(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find Application instance from Context "
            r1.append(r0)
            android.content.Context r0 = r4.A0a()
            android.content.Context r0 = r0.getApplicationContext()
            r1.append(r0)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x003c:
            X.04L r3 = new X.04L
            r3.<init>()
            if (r2 == 0) goto L_0x004a
            X.01n r1 = X.AnonymousClass04O.A02
            java.util.Map r0 = r3.A00
            r0.put(r1, r2)
        L_0x004a:
            X.01n r0 = X.C003301m.A01
            java.util.Map r2 = r3.A00
            r2.put(r0, r4)
            X.01n r0 = X.C003301m.A02
            r2.put(r0, r4)
            android.os.Bundle r1 = r4.A0A
            if (r1 == 0) goto L_0x005f
            X.01n r0 = X.C003301m.A00
            r2.put(r0, r1)
        L_0x005f:
            return r3
        L_0x0060:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0008
        L_0x0067:
            r2 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02E.BAv():X.04K");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A0i().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public AnonymousClass01M getLifecycle() {
        return this.A0P;
    }
}
