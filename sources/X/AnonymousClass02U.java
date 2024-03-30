package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.02U  reason: invalid class name */
public class AnonymousClass02U extends C002300y implements AnonymousClass02T, LayoutInflater.Factory2 {
    public static final boolean A0m = (!"robolectric".equals(Build.FINGERPRINT));
    public static final AnonymousClass007 A0n = new AnonymousClass007(0);
    public static final int[] A0o = {16842836};
    public boolean A00;
    public boolean A01;
    public int A02;
    public int A03 = -100;
    public int A04;
    public Rect A05;
    public Rect A06;
    public MenuInflater A07;
    public View A08;
    public ViewGroup A09;
    public Window A0A;
    public PopupWindow A0B;
    public AnonymousClass07B A0C;
    public C010304i A0D;
    public C06740Uw A0E;
    public C06740Uw A0F;
    public C011404y A0G;
    public C09390cI A0H;
    public AnonymousClass0V9 A0I;
    public ActionBarContextView A0J;
    public C17260qz A0K;
    public AnonymousClass0V7 A0L = null;
    public CharSequence A0M;
    public Runnable A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C011404y[] A0a;
    public TextView A0b;
    public C09380cH A0c;
    public AnonymousClass05W A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final Context A0i;
    public final AnonymousClass01J A0j;
    public final Object A0k;
    public final Runnable A0l = new AnonymousClass02V(this);

    public static Configuration A02(Context context, Configuration configuration, int i) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public Context A0E(Context context) {
        this.A0Q = true;
        int i = this.A03;
        if (i == -100) {
            i = C002300y.A00;
        }
        int A0U2 = A0U(context, i);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(A02(context, (Configuration) null, A0U2));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C004602b) {
            try {
                ((C004602b) context).A01(A02(context, (Configuration) null, A0U2));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0m) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    AnonymousClass0P9.A00(configuration3, configuration4, configuration);
                } else if (!C014106d.A01(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    AnonymousClass0PA.A00(configuration3, configuration4, configuration);
                }
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        }
        Configuration A022 = A02(context, configuration, A0U2);
        C004602b r3 = new C004602b(context, (int) R.style.f13nameremoved);
        r3.A01(A022);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = r3.getTheme();
                int i38 = Build.VERSION.SDK_INT;
                if (i38 >= 29) {
                    C05340Pi.A00(theme);
                } else if (i38 >= 23) {
                    AnonymousClass0W3.A00(theme);
                    return r3;
                }
            }
        } catch (NullPointerException unused3) {
        }
        return r3;
    }

    public void A0K() {
        this.A0Y = false;
        A0B(this);
        AnonymousClass07B r0 = this.A0C;
        if (r0 != null) {
            r0.A0Y(false);
        }
    }

    public void A0N(Bundle bundle) {
        this.A0Q = true;
        A0C(this, false);
        A06();
        Object obj = this.A0k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = AnonymousClass050.A01(activity.getComponentName(), activity);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AnonymousClass07B r0 = this.A0C;
                if (r0 == null) {
                    this.A0f = true;
                } else {
                    r0.A0T(true);
                }
            }
            synchronized (C002300y.A02) {
                C002300y.A01(this);
                C002300y.A01.add(new WeakReference(this));
            }
        }
        this.A0R = true;
    }

    public void A0W(int i) {
        C011404y A0V2 = A0V(i);
        if (A0V2.A0A != null) {
            Bundle bundle = new Bundle();
            A0V2.A0A.A0A(bundle);
            if (bundle.size() > 0) {
                A0V2.A02 = bundle;
            }
            C016307a r0 = A0V2.A0A;
            r0.A07();
            r0.clear();
        }
        A0V2.A0F = true;
        A0V2.A0E = true;
        if ((i == 108 || i == 0) && this.A0K != null) {
            C011404y A0V3 = A0V(0);
            A0V3.A0D = false;
            A0D((KeyEvent) null, A0V3, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup A03() {
        /*
            r9 = this;
            android.content.Context r4 = r9.A0i
            int[] r0 = X.AnonymousClass1MJ.A09
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r0)
            r0 = 117(0x75, float:1.64E-43)
            r1 = 117(0x75, float:1.64E-43)
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x01c6
            r0 = 126(0x7e, float:1.77E-43)
            r6 = 0
            boolean r0 = r2.getBoolean(r0, r6)
            r3 = 1
            if (r0 == 0) goto L_0x010a
            r9.A0T(r3)
        L_0x001f:
            r0 = 118(0x76, float:1.65E-43)
            boolean r1 = r2.getBoolean(r0, r6)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L_0x002c
            r9.A0T(r0)
        L_0x002c:
            r0 = 119(0x77, float:1.67E-43)
            boolean r0 = r2.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0039
            r0 = 10
            r9.A0T(r0)
        L_0x0039:
            boolean r0 = r2.getBoolean(r6, r6)
            r9.A0U = r0
            r2.recycle()
            r9.A06()
            android.view.Window r0 = r9.A0A
            r0.getDecorView()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            boolean r0 = r9.A01
            r5 = 0
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x0085
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
            android.view.View r4 = r2.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r9.A0W = r6
            r9.A00 = r6
        L_0x0064:
            if (r4 == 0) goto L_0x0180
        L_0x0066:
            X.0tJ r0 = new X.0tJ
            r0.<init>(r9, r6)
            X.C011004s.A07(r4, r0)
            X.0qz r0 = r9.A0K
            if (r0 != 0) goto L_0x007d
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A0b = r0
        L_0x007d:
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            java.lang.String r8 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r7 = "ViewUtils"
            goto L_0x0117
        L_0x0085:
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0180
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r1.resolveAttribute(r0, r2, r3)
            int r1 = r2.resourceId
            if (r1 == 0) goto L_0x00f6
            X.02b r0 = new X.02b
            r0.<init>((android.content.Context) r4, (int) r1)
        L_0x00a1:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131623959(0x7f0e0017, float:1.8875084E38)
            android.view.View r4 = r1.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 2131429424(0x7f0b0830, float:1.848052E38)
            android.view.View r1 = r4.findViewById(r0)
            X.0qz r1 = (X.C17260qz) r1
            r9.A0K = r1
            android.view.Window r0 = r9.A0A
            android.view.Window$Callback r0 = r0.getCallback()
            r1.setWindowCallback(r0)
            boolean r0 = r9.A0W
            if (r0 == 0) goto L_0x00d0
            X.0qz r0 = r9.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            r0.setOverlayMode(r3)
        L_0x00d0:
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x00e2
            X.0qz r0 = r9.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
        L_0x00e2:
            boolean r0 = r9.A0g
            if (r0 == 0) goto L_0x0066
            X.0qz r0 = r9.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
            goto L_0x0066
        L_0x00f6:
            r0 = r4
            goto L_0x00a1
        L_0x00f8:
            boolean r1 = r9.A0X
            r0 = 2131623957(0x7f0e0015, float:1.887508E38)
            if (r1 == 0) goto L_0x0102
            r0 = 2131623958(0x7f0e0016, float:1.8875082E38)
        L_0x0102:
            android.view.View r4 = r2.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0064
        L_0x010a:
            boolean r0 = r2.getBoolean(r1, r6)
            if (r0 == 0) goto L_0x001f
            r0 = 108(0x6c, float:1.51E-43)
            r9.A0T(r0)
            goto L_0x001f
        L_0x0117:
            java.lang.Class r2 = r4.getClass()     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            java.lang.String r1 = "makeOptionalFitsSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            boolean r0 = r1.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            if (r0 != 0) goto L_0x012c
            r1.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
        L_0x012c:
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            r1.invoke(r4, r0)     // Catch:{ NoSuchMethodException -> 0x0137, IllegalAccessException | InvocationTargetException -> 0x0132 }
            goto L_0x013c
        L_0x0132:
            r0 = move-exception
            android.util.Log.d(r7, r8, r0)
            goto L_0x013c
        L_0x0137:
            java.lang.String r0 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r7, r0)
        L_0x013c:
            r0 = 2131427471(0x7f0b008f, float:1.847656E38)
            android.view.View r3 = r4.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r0 = r9.A0A
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0173
        L_0x0152:
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x0163
            android.view.View r0 = r1.getChildAt(r6)
            r1.removeViewAt(r6)
            r3.addView(r0)
            goto L_0x0152
        L_0x0163:
            r0 = -1
            r1.setId(r0)
            r3.setId(r2)
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0173
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setForeground(r5)
        L_0x0173:
            android.view.Window r0 = r9.A0A
            r0.setContentView(r4)
            X.04w r0 = new X.04w
            r0.<init>(r9)
            r3.A00 = r0
            return r4
        L_0x0180:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.append(r0)
            boolean r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = ", windowActionBarOverlay: "
            r1.append(r0)
            boolean r0 = r9.A0W
            r1.append(r0)
            java.lang.String r0 = ", android:windowIsFloating: "
            r1.append(r0)
            boolean r0 = r9.A0U
            r1.append(r0)
            java.lang.String r0 = ", windowActionModeOverlay: "
            r1.append(r0)
            boolean r0 = r9.A0X
            r1.append(r0)
            java.lang.String r0 = ", windowNoTitle: "
            r1.append(r0)
            boolean r0 = r9.A01
            r1.append(r0)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x01c6:
            r2.recycle()
            java.lang.String r0 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A03():android.view.ViewGroup");
    }

    private C06740Uw A04(Context context) {
        C06740Uw r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0T7 r2 = AnonymousClass0T7.A03;
        if (r2 == null) {
            Context applicationContext = context.getApplicationContext();
            r2 = new AnonymousClass0T7(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            AnonymousClass0T7.A03 = r2;
        }
        AnonymousClass0FK r02 = new AnonymousClass0FK(this, r2);
        this.A0F = r02;
        return r02;
    }

    private void A05() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.A09.findViewById(16908290);
        View decorView = this.A0A.getDecorView();
        contentFrameLayout.A07.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (C011304x.A03(contentFrameLayout)) {
            contentFrameLayout.requestLayout();
        }
        TypedArray obtainStyledAttributes = this.A0i.obtainStyledAttributes(AnonymousClass1MJ.A09);
        obtainStyledAttributes.getValue(124, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(125, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(122)) {
            obtainStyledAttributes.getValue(122, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(123)) {
            obtainStyledAttributes.getValue(123, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(120)) {
            obtainStyledAttributes.getValue(120, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(121)) {
            obtainStyledAttributes.getValue(121, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void A06() {
        if (this.A0A == null) {
            Object obj = this.A0k;
            if (obj instanceof Activity) {
                A09(((Activity) obj).getWindow());
            }
        }
        if (this.A0A == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void A07() {
        if (this.A0Z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r0.getCount() > 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        if (r0 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0133, code lost:
        if (r0.width != -1) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(android.view.KeyEvent r13, X.C011404y r14) {
        /*
            r12 = this;
            boolean r0 = r14.A0C
            if (r0 != 0) goto L_0x001f
            boolean r0 = r12.A0T
            if (r0 != 0) goto L_0x001f
            int r2 = r14.A03
            r7 = 0
            r3 = 1
            if (r2 != 0) goto L_0x0020
            android.content.Context r0 = r12.A0i
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 4
            if (r1 != r0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            android.view.Window r0 = r12.A0A
            android.view.Window$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L_0x0034
            X.07a r0 = r14.A0A
            boolean r0 = r1.onMenuOpened(r2, r0)
            if (r0 != 0) goto L_0x0034
            r12.A0X(r14, r3)
            return
        L_0x0034:
            android.content.Context r5 = r12.A0i
            java.lang.String r0 = "window"
            java.lang.Object r2 = r5.getSystemService(r0)
            android.view.ViewManager r2 = (android.view.ViewManager) r2
            if (r2 == 0) goto L_0x001f
            boolean r0 = A0D(r13, r14, r12)
            if (r0 == 0) goto L_0x001f
            android.view.ViewGroup r4 = r14.A08
            r1 = -1
            r6 = -2
            if (r4 == 0) goto L_0x0137
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x0126
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x005b
            android.view.ViewGroup r0 = r14.A08
            r0.removeAllViews()
        L_0x005b:
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L_0x00cf
            r14.A07 = r0
        L_0x0061:
            android.view.View r0 = r14.A06
            if (r0 != 0) goto L_0x0078
            X.0cN r1 = r14.A09
            X.0Ed r0 = r1.A04
            if (r0 != 0) goto L_0x0072
            X.0Ed r0 = new X.0Ed
            r0.<init>(r1)
            r1.A04 = r0
        L_0x0072:
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0157
        L_0x0078:
            android.view.View r0 = r14.A07
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            if (r4 != 0) goto L_0x0085
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r6, r6)
        L_0x0085:
            int r1 = r14.A00
            android.view.ViewGroup r0 = r14.A08
            r0.setBackgroundResource(r1)
            android.view.View r0 = r14.A07
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r14.A07
            r1.removeView(r0)
        L_0x009d:
            android.view.ViewGroup r1 = r14.A08
            android.view.View r0 = r14.A07
            r1.addView(r0, r4)
            android.view.View r0 = r14.A07
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x00b1
            android.view.View r0 = r14.A07
            r0.requestFocus()
        L_0x00b1:
            r5 = -2
        L_0x00b2:
            r14.A0B = r7
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r0 = r14.A04
            r4.gravity = r0
            int r0 = r14.A01
            r4.windowAnimations = r0
            android.view.ViewGroup r0 = r14.A08
            r2.addView(r0, r4)
            r14.A0C = r3
            return
        L_0x00cf:
            X.07a r0 = r14.A0A
            if (r0 == 0) goto L_0x0157
            X.0cI r1 = r12.A0H
            if (r1 != 0) goto L_0x00de
            X.0cI r1 = new X.0cI
            r1.<init>(r12)
            r12.A0H = r1
        L_0x00de:
            X.0cN r0 = r14.A09
            if (r0 != 0) goto L_0x00f4
            android.content.Context r0 = r14.A05
            X.0cN r4 = new X.0cN
            r4.<init>(r0)
            r14.A09 = r4
            r4.A05 = r1
            X.07a r1 = r14.A0A
            android.content.Context r0 = r1.A0N
            r1.A08(r0, r4)
        L_0x00f4:
            X.0cN r5 = r14.A09
            android.view.ViewGroup r4 = r14.A08
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A03
            if (r0 != 0) goto L_0x011e
            android.view.LayoutInflater r1 = r5.A02
            r0 = 2131623949(0x7f0e000d, float:1.8875064E38)
            android.view.View r0 = r1.inflate(r0, r4, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = (androidx.appcompat.view.menu.ExpandedMenuView) r0
            r5.A03 = r0
            X.0Ed r1 = r5.A04
            if (r1 != 0) goto L_0x0114
            X.0Ed r1 = new X.0Ed
            r1.<init>(r5)
            r5.A04 = r1
        L_0x0114:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A03
            r0.setAdapter(r1)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A03
            r0.setOnItemClickListener(r5)
        L_0x011e:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A03
            r14.A07 = r0
            if (r0 == 0) goto L_0x0157
            goto L_0x0061
        L_0x0126:
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.width
            r5 = -1
            if (r0 == r1) goto L_0x00b2
            goto L_0x00b1
        L_0x0137:
            A0B(r12)
            X.07B r0 = r12.A0C
            if (r0 == 0) goto L_0x0144
            android.content.Context r0 = r0.A0A()
            if (r0 != 0) goto L_0x0145
        L_0x0144:
            r0 = r5
        L_0x0145:
            r14.A00(r0)
            android.content.Context r1 = r14.A05
            X.0Fr r0 = new X.0Fr
            r0.<init>(r1, r12)
            r14.A08 = r0
            r0 = 81
            r14.A04 = r0
            goto L_0x005b
        L_0x0157:
            r14.A0E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A08(android.view.KeyEvent, X.04y):void");
    }

    private void A09(Window window) {
        if (this.A0A == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C010304i)) {
                C010304i r0 = new C010304i(callback, this);
                this.A0D = r0;
                window.setCallback(r0);
                Context context = this.A0i;
                C010404j r1 = new C010404j(context, context.obtainStyledAttributes((AttributeSet) null, A0o));
                Drawable A032 = r1.A03(0);
                if (A032 != null) {
                    window.setBackgroundDrawable(A032);
                }
                r1.A02.recycle();
                this.A0A = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public static void A0A(AnonymousClass02U r3) {
        CharSequence charSequence;
        if (!r3.A0Z) {
            r3.A09 = r3.A03();
            Object obj = r3.A0k;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = r3.A0M;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C17260qz r0 = r3.A0K;
                if (r0 != null) {
                    r0.setWindowTitle(charSequence);
                } else {
                    AnonymousClass07B r02 = r3.A0C;
                    if (r02 != null) {
                        r02.A0R(charSequence);
                    } else {
                        TextView textView = r3.A0b;
                        if (textView != null) {
                            textView.setText(charSequence);
                        }
                    }
                }
            }
            r3.A05();
            r3.A0Z = true;
            C011404y A0V2 = r3.A0V(0);
            if (!r3.A0T && A0V2.A0A == null) {
                r3.A02 = (1 << C65953Uc.A03) | r3.A02;
                if (!r3.A0S) {
                    C011504z.A07(r3.A0A.getDecorView(), r3.A0l);
                    r3.A0S = true;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass02U r11, boolean r12) {
        /*
            boolean r0 = r11.A0T
            if (r0 != 0) goto L_0x013b
            int r8 = r11.A03
            r0 = -100
            if (r8 != r0) goto L_0x000c
            int r8 = X.C002300y.A00
        L_0x000c:
            android.content.Context r7 = r11.A0i
            int r0 = r11.A0U(r7, r8)
            r6 = 0
            android.content.res.Configuration r5 = A02(r7, r6, r0)
            boolean r0 = r11.A0P
            r4 = 1
            if (r0 != 0) goto L_0x005d
            java.lang.Object r10 = r11.A0k
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005d
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            r3 = 0
            if (r9 == 0) goto L_0x0061
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0053 }
            r0 = 29
            if (r1 < r0) goto L_0x0032
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0039
        L_0x0032:
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L_0x0039
            r2 = 786432(0xc0000, float:1.102026E-39)
        L_0x0039:
            java.lang.Class r1 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0053 }
            r0.<init>(r7, r1)     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.ActivityInfo r0 = r9.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x0053 }
            r1 = r0 & 512(0x200, float:7.175E-43)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r11.A0O = r0     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x005d
        L_0x0053:
            r2 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Exception while getting ActivityInfo"
            android.util.Log.d(r1, r0, r2)
            r11.A0O = r3
        L_0x005d:
            r11.A0P = r4
            boolean r3 = r11.A0O
        L_0x0061:
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r9 = r0 & 48
            int r0 = r5.uiMode
            r1 = r0 & 48
            if (r9 == r1) goto L_0x00d6
            if (r12 == 0) goto L_0x00d6
            if (r3 != 0) goto L_0x00d6
            boolean r0 = r11.A0Q
            if (r0 == 0) goto L_0x00d6
            boolean r0 = A0m
            if (r0 != 0) goto L_0x0083
            boolean r0 = r11.A0R
            if (r0 == 0) goto L_0x00d6
        L_0x0083:
            java.lang.Object r2 = r11.A0k
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00d6
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isChild()
            if (r0 != 0) goto L_0x00d6
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00c4
            r2.recreate()
        L_0x009a:
            if (r8 != 0) goto L_0x00ab
            X.0Uw r0 = r11.A04(r7)
            r0.A02()
        L_0x00a3:
            X.0Uw r0 = r11.A0E
            if (r0 == 0) goto L_0x013b
            r0.A03()
            return
        L_0x00ab:
            X.0Uw r0 = r11.A0F
            if (r0 == 0) goto L_0x00b2
            r0.A03()
        L_0x00b2:
            r0 = 3
            if (r8 != r0) goto L_0x00a3
            X.0Uw r0 = r11.A0E
            if (r0 != 0) goto L_0x00c0
            X.0FJ r0 = new X.0FJ
            r0.<init>(r7, r11)
            r11.A0E = r0
        L_0x00c0:
            r0.A02()
            return
        L_0x00c4:
            android.os.Looper r0 = r2.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.0fs r0 = new X.0fs
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x009a
        L_0x00d6:
            if (r9 == r1) goto L_0x009a
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.Configuration r0 = r2.getConfiguration()
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>(r0)
            android.content.res.Configuration r0 = r2.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r1 = r1 | r0
            r5.uiMode = r1
            r2.updateConfiguration(r5, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x00fc
            X.AnonymousClass0YT.A00(r2)
        L_0x00fc:
            int r0 = r11.A04
            if (r0 == 0) goto L_0x0110
            r7.setTheme(r0)
            r0 = 23
            if (r1 < r0) goto L_0x0110
            android.content.res.Resources$Theme r1 = r7.getTheme()
            int r0 = r11.A04
            r1.applyStyle(r0, r4)
        L_0x0110:
            if (r3 == 0) goto L_0x009a
            java.lang.Object r2 = r11.A0k
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x009a
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2 instanceof X.AnonymousClass012
            if (r0 == 0) goto L_0x0136
            r0 = r2
            X.012 r0 = (X.AnonymousClass012) r0
            X.01M r0 = r0.getLifecycle()
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.STARTED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x009a
        L_0x0131:
            r2.onConfigurationChanged(r5)
            goto L_0x009a
        L_0x0136:
            boolean r0 = r11.A0Y
            if (r0 == 0) goto L_0x009a
            goto L_0x0131
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A0C(X.02U, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r7 == 108) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r12.A0F != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0103, code lost:
        if (r6 != null) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(android.view.KeyEvent r11, X.C011404y r12, X.AnonymousClass02U r13) {
        /*
            boolean r0 = r13.A0T
            r2 = 0
            if (r0 != 0) goto L_0x0086
            boolean r0 = r12.A0D
            r3 = 1
            if (r0 != 0) goto L_0x015d
            X.04y r0 = r13.A0G
            if (r0 == 0) goto L_0x0013
            if (r0 == r12) goto L_0x0013
            r13.A0X(r0, r2)
        L_0x0013:
            android.view.Window r0 = r13.A0A
            android.view.Window$Callback r5 = r0.getCallback()
            if (r5 == 0) goto L_0x0023
            int r0 = r12.A03
            android.view.View r0 = r5.onCreatePanelView(r0)
            r12.A06 = r0
        L_0x0023:
            int r7 = r12.A03
            if (r7 == 0) goto L_0x002c
            r0 = 108(0x6c, float:1.51E-43)
            r10 = 0
            if (r7 != r0) goto L_0x003c
        L_0x002c:
            r10 = 1
            X.0qz r0 = r13.A0K
            if (r0 == 0) goto L_0x003c
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            r0.A0C = r3
        L_0x003c:
            android.view.View r0 = r12.A06
            if (r0 != 0) goto L_0x0154
            if (r10 == 0) goto L_0x0048
            X.07B r0 = r13.A0C
            boolean r0 = r0 instanceof X.AnonymousClass07E
            if (r0 != 0) goto L_0x0154
        L_0x0048:
            X.07a r6 = r12.A0A
            r4 = 0
            if (r6 == 0) goto L_0x0087
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x010f
        L_0x0051:
            if (r10 == 0) goto L_0x0065
            X.0qz r1 = r13.A0K
            if (r1 == 0) goto L_0x0065
            X.0cH r0 = r13.A0c
            if (r0 != 0) goto L_0x0062
            X.0cH r0 = new X.0cH
            r0.<init>(r13)
            r13.A0c = r0
        L_0x0062:
            r1.setMenu(r6, r0)
        L_0x0065:
            X.07a r0 = r12.A0A
            r0.A07()
            boolean r0 = r5.onCreatePanelMenu(r7, r0)
            if (r0 != 0) goto L_0x010d
            X.07a r1 = r12.A0A
            if (r4 == r1) goto L_0x007b
            X.0cN r0 = r12.A09
            r1.A0D(r0)
            r12.A0A = r4
        L_0x007b:
            if (r10 == 0) goto L_0x0086
            X.0qz r1 = r13.A0K
            if (r1 == 0) goto L_0x0086
            X.0cH r0 = r13.A0c
            r1.setMenu(r4, r0)
        L_0x0086:
            return r2
        L_0x0087:
            android.content.Context r8 = r13.A0i
            if (r7 == 0) goto L_0x008f
            r0 = 108(0x6c, float:1.51E-43)
            if (r7 != r0) goto L_0x00e0
        L_0x008f:
            X.0qz r0 = r13.A0K
            if (r0 == 0) goto L_0x00e0
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r1.resolveAttribute(r0, r9, r3)
            r6 = 0
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0106
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r6.resolveAttribute(r0, r9, r3)
        L_0x00bd:
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0103
            if (r6 != 0) goto L_0x00ce
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
        L_0x00ce:
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
        L_0x00d3:
            X.02b r1 = new X.02b
            r1.<init>((android.content.Context) r8, (int) r2)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r6)
            r8 = r1
        L_0x00e0:
            X.07a r6 = new X.07a
            r6.<init>(r8)
            r6.A0C(r13)
            X.07a r1 = r12.A0A
            if (r6 == r1) goto L_0x00fe
            if (r1 == 0) goto L_0x00f3
            X.0cN r0 = r12.A09
            r1.A0D(r0)
        L_0x00f3:
            r12.A0A = r6
            X.0cN r1 = r12.A09
            if (r1 == 0) goto L_0x00fe
            android.content.Context r0 = r6.A0N
            r6.A08(r0, r1)
        L_0x00fe:
            X.07a r6 = r12.A0A
            if (r6 != 0) goto L_0x0051
            return r2
        L_0x0103:
            if (r6 == 0) goto L_0x00e0
            goto L_0x00d3
        L_0x0106:
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r1.resolveAttribute(r0, r9, r3)
            goto L_0x00bd
        L_0x010d:
            r12.A0F = r2
        L_0x010f:
            X.07a r1 = r12.A0A
            r1.A07()
            android.os.Bundle r0 = r12.A02
            if (r0 == 0) goto L_0x011d
            r1.A09(r0)
            r12.A02 = r4
        L_0x011d:
            android.view.View r1 = r12.A06
            X.07a r0 = r12.A0A
            boolean r0 = r5.onPreparePanel(r2, r1, r0)
            if (r0 != 0) goto L_0x0138
            if (r10 == 0) goto L_0x0132
            X.0qz r1 = r13.A0K
            if (r1 == 0) goto L_0x0132
            X.0cH r0 = r13.A0c
            r1.setMenu(r4, r0)
        L_0x0132:
            X.07a r0 = r12.A0A
            r0.A06()
            return r2
        L_0x0138:
            if (r11 == 0) goto L_0x015b
            int r0 = r11.getDeviceId()
        L_0x013e:
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r0 = r0.getKeyboardType()
            r1 = 0
            if (r0 == r3) goto L_0x014a
            r1 = 1
        L_0x014a:
            X.07a r0 = r12.A0A
            r0.setQwertyMode(r1)
            X.07a r0 = r12.A0A
            r0.A06()
        L_0x0154:
            r12.A0D = r3
            r12.A0B = r2
            r13.A0G = r12
            return r3
        L_0x015b:
            r0 = -1
            goto L_0x013e
        L_0x015d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A0D(android.view.KeyEvent, X.04y, X.02U):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0181, code lost:
        if (r4 == null) goto L_0x01a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0F(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r10 = this;
            X.05W r6 = r10.A0d
            r3 = 0
            if (r6 != 0) goto L_0x001c
            android.content.Context r1 = r10.A0i
            int[] r0 = X.AnonymousClass1MJ.A09
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r4 = r1.getString(r0)
            if (r4 != 0) goto L_0x0108
            X.05W r6 = new X.05W
            r6.<init>()
            r10.A0d = r6
        L_0x001c:
            android.content.Context r7 = X.AnonymousClass05W.A00(r13, r14)
            int r0 = r12.hashCode()
            switch(r0) {
                case -1946472170: goto L_0x00fa;
                case -1455429095: goto L_0x00eb;
                case -1346021293: goto L_0x00dc;
                case -938935918: goto L_0x00ce;
                case -937446323: goto L_0x00bf;
                case -658531749: goto L_0x00b0;
                case -339785223: goto L_0x00a1;
                case 776382189: goto L_0x0093;
                case 799298502: goto L_0x0084;
                case 1125864064: goto L_0x0075;
                case 1413872058: goto L_0x0067;
                case 1601505219: goto L_0x0059;
                case 1666676343: goto L_0x004a;
                case 2001146706: goto L_0x003c;
                default: goto L_0x0027;
            }
        L_0x0027:
            r4 = 0
            if (r13 == r7) goto L_0x01a8
            java.lang.String r0 = "view"
            boolean r0 = r12.equals(r0)
            r9 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "class"
            java.lang.String r12 = r14.getAttributeValue(r4, r0)
        L_0x0039:
            r8 = 1
            goto L_0x0143
        L_0x003c:
            java.lang.String r0 = "Button"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.06r r4 = r6.A03(r7, r14)
            goto L_0x0183
        L_0x004a:
            java.lang.String r0 = "EditText"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.074 r4 = new X.074
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x0059:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            androidx.appcompat.widget.AppCompatCheckBox r4 = r6.A04(r7, r14)
            goto L_0x0183
        L_0x0067:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.0Ec r4 = r6.A02(r7, r14)
            goto L_0x0183
        L_0x0075:
            java.lang.String r0 = "ImageView"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            androidx.appcompat.widget.AppCompatImageView r4 = new androidx.appcompat.widget.AppCompatImageView
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x0084:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.0FE r4 = new X.0FE
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x0093:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            androidx.appcompat.widget.AppCompatRadioButton r4 = r6.A05(r7, r14)
            goto L_0x0183
        L_0x00a1:
            java.lang.String r0 = "Spinner"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            androidx.appcompat.widget.AppCompatSpinner r4 = new androidx.appcompat.widget.AppCompatSpinner
            r4.<init>((android.content.Context) r7, (android.util.AttributeSet) r14)
            goto L_0x0183
        L_0x00b0:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            androidx.appcompat.widget.AppCompatSeekBar r4 = new androidx.appcompat.widget.AppCompatSeekBar
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x00bf:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.07N r4 = new X.07N
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x00ce:
            java.lang.String r0 = "TextView"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.07P r4 = r6.A06(r7, r14)
            goto L_0x0183
        L_0x00dc:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.0F8 r4 = new X.0F8
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x00eb:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.0Ei r4 = new X.0Ei
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x00fa:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.0FB r4 = new X.0FB
            r4.<init>(r7, r14)
            goto L_0x0183
        L_0x0108:
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x011e }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x011e }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ all -> 0x011e }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x011e }
            java.lang.Object r6 = r1.newInstance(r0)     // Catch:{ all -> 0x011e }
            X.05W r6 = (X.AnonymousClass05W) r6     // Catch:{ all -> 0x011e }
            r10.A0d = r6     // Catch:{ all -> 0x011e }
            goto L_0x001c
        L_0x011e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to instantiate custom view inflater "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ". Falling back to default."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AppCompatDelegate"
            android.util.Log.i(r0, r1, r2)
            X.05W r6 = new X.05W
            r6.<init>()
            r10.A0d = r6
            goto L_0x001c
        L_0x0143:
            java.lang.Object[] r5 = r6.A00     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            r5[r3] = r7     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            r5[r8] = r14     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            r1 = -1
            r0 = 46
            int r0 = r12.indexOf(r0)     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            if (r1 != r0) goto L_0x0163
            r2 = 0
        L_0x0153:
            java.lang.String[] r1 = X.AnonymousClass05W.A02     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            r0 = 3
            if (r2 >= r0) goto L_0x017c
            r0 = r1[r2]     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            android.view.View r4 = X.AnonymousClass05W.A01(r7, r6, r12, r0)     // Catch:{ Exception -> 0x0174, all -> 0x016c }
            if (r4 != 0) goto L_0x0167
            int r2 = r2 + 1
            goto L_0x0153
        L_0x0163:
            android.view.View r4 = X.AnonymousClass05W.A01(r7, r6, r12, r4)     // Catch:{ Exception -> 0x0174, all -> 0x016c }
        L_0x0167:
            r5[r3] = r9
            r5[r8] = r9
            goto L_0x0181
        L_0x016c:
            r1 = move-exception
            java.lang.Object[] r0 = r6.A00
            r0[r3] = r9
            r0[r8] = r9
            throw r1
        L_0x0174:
            java.lang.Object[] r0 = r6.A00
            r0[r3] = r9
            r0[r8] = r9
            r4 = r9
            goto L_0x0181
        L_0x017c:
            r5[r3] = r9
            r5[r8] = r9
            r4 = r9
        L_0x0181:
            if (r4 == 0) goto L_0x01a8
        L_0x0183:
            android.content.Context r1 = r4.getContext()
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x01a8
            boolean r0 = X.AnonymousClass05u.A00(r4)
            if (r0 == 0) goto L_0x01a8
            int[] r0 = X.AnonymousClass05W.A01
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r14, r0)
            java.lang.String r1 = r2.getString(r3)
            if (r1 == 0) goto L_0x01a5
            X.0bj r0 = new X.0bj
            r0.<init>(r4, r1)
            r4.setOnClickListener(r0)
        L_0x01a5:
            r2.recycle()
        L_0x01a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A0F(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        if (r1 == false) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0V9 A0G(X.C021809f r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0191
            X.0V9 r0 = r10.A0I
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            X.0cB r6 = new X.0cB
            r6.<init>(r10, r11)
            A0B(r10)
            X.07B r0 = r10.A0C
            if (r0 == 0) goto L_0x0024
            X.0V9 r1 = r0.A0C(r6)
            r10.A0I = r1
            if (r1 == 0) goto L_0x0024
            X.01J r0 = r10.A0j
            if (r0 == 0) goto L_0x0024
            r0.Bii(r1)
        L_0x0024:
            X.0V9 r0 = r10.A0I
            if (r0 != 0) goto L_0x0139
            X.0V7 r0 = r10.A0L
            if (r0 == 0) goto L_0x002f
            r0.A00()
        L_0x002f:
            X.0V9 r0 = r10.A0I
            if (r0 == 0) goto L_0x0036
            r0.A05()
        L_0x0036:
            X.01J r2 = r10.A0j
            r5 = 0
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r3 = 0
            r8 = 1
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r10.A0U
            if (r0 == 0) goto L_0x0165
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.Context r9 = r10.A0i
            android.content.res.Resources$Theme r4 = r9.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r4.resolveAttribute(r0, r7, r8)
            int r0 = r7.resourceId
            if (r0 == 0) goto L_0x0162
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Resources$Theme r1 = r0.newTheme()
            r1.setTo(r4)
            int r0 = r7.resourceId
            r1.applyStyle(r0, r8)
            X.02b r4 = new X.02b
            r4.<init>((android.content.Context) r9, (int) r3)
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r0.setTo(r1)
        L_0x0074:
            androidx.appcompat.widget.ActionBarContextView r0 = new androidx.appcompat.widget.ActionBarContextView
            r0.<init>(r4, r5)
            r10.A0J = r0
            r0 = 2130968612(0x7f040024, float:1.7545883E38)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r1.<init>(r4, r5, r0)
            r10.A0B = r1
            r0 = 2
            X.AnonymousClass0W8.A00(r1, r0)
            android.widget.PopupWindow r1 = r10.A0B
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r1.setContentView(r0)
            android.widget.PopupWindow r1 = r10.A0B
            r0 = -1
            r1.setWidth(r0)
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r0 = 2130968591(0x7f04000f, float:1.754584E38)
            r1.resolveAttribute(r0, r7, r8)
            int r1 = r7.data
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r0.A00 = r1
            android.widget.PopupWindow r1 = r10.A0B
            r0 = -2
            r1.setHeight(r0)
            X.0fd r0 = new X.0fd
            r0.<init>(r10)
            r10.A0N = r0
        L_0x00bf:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            if (r0 == 0) goto L_0x012c
            X.0V7 r0 = r10.A0L
            if (r0 == 0) goto L_0x00ca
            r0.A00()
        L_0x00ca:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r0.A04()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            X.0FV r4 = new X.0FV
            r4.<init>(r1, r6, r0)
            X.07a r1 = r4.A00
            X.09f r0 = r6.A00
            boolean r0 = r0.BUq(r1, r4)
            if (r0 == 0) goto L_0x015f
            r4.A06()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r0.A05(r4)
            r10.A0I = r4
            boolean r0 = r10.A0Z
            if (r0 == 0) goto L_0x00ff
            android.view.ViewGroup r0 = r10.A09
            if (r0 == 0) goto L_0x00ff
            boolean r1 = X.C011304x.A03(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0J
            if (r0 == 0) goto L_0x013a
            r0 = 0
            r1.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            X.0V7 r1 = X.C012005e.A07(r0)
            r1.A02(r4)
            r10.A0L = r1
            X.0sg r0 = new X.0sg
            r0.<init>(r10, r3)
            r1.A09(r0)
        L_0x011d:
            android.widget.PopupWindow r0 = r10.A0B
            if (r0 == 0) goto L_0x012c
            android.view.Window r0 = r10.A0A
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r10.A0N
            r1.post(r0)
        L_0x012c:
            X.0V9 r0 = r10.A0I
            if (r0 == 0) goto L_0x0135
            if (r2 == 0) goto L_0x0135
            r2.Bii(r0)
        L_0x0135:
            X.0V9 r0 = r10.A0I
            r10.A0I = r0
        L_0x0139:
            return r0
        L_0x013a:
            r1.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0J
            r0 = 32
            r1.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x011d
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0J
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass09G.A00(r0)
            goto L_0x011d
        L_0x015f:
            r10.A0I = r5
            goto L_0x012c
        L_0x0162:
            r4 = r9
            goto L_0x0074
        L_0x0165:
            android.view.ViewGroup r1 = r10.A09
            r0 = 2131427509(0x7f0b00b5, float:1.8476636E38)
            android.view.View r1 = r1.findViewById(r0)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto L_0x00bf
            A0B(r10)
            X.07B r0 = r10.A0C
            if (r0 == 0) goto L_0x017f
            android.content.Context r0 = r0.A0A()
            if (r0 != 0) goto L_0x0181
        L_0x017f:
            android.content.Context r0 = r10.A0i
        L_0x0181:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.A00 = r0
            android.view.View r0 = r1.A00()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r10.A0J = r0
            goto L_0x00bf
        L_0x0191:
            java.lang.String r1 = "ActionMode callback can not be null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A0G(X.09f):X.0V9");
    }

    public void A0H() {
        LayoutInflater from = LayoutInflater.from(this.A0i);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof AnonymousClass02U)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void A0J() {
        Object obj = this.A0k;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (C002300y.A02) {
                C002300y.A01(this);
            }
        }
        if (this.A0S) {
            this.A0A.getDecorView().removeCallbacks(this.A0l);
        }
        this.A0Y = false;
        this.A0T = true;
        if (this.A03 == -100 || !z || !((Activity) obj).isChangingConfigurations()) {
            A0n.remove(obj.getClass().getName());
        } else {
            A0n.put(obj.getClass().getName(), Integer.valueOf(this.A03));
        }
        AnonymousClass07B r0 = this.A0C;
        if (r0 != null) {
            r0.A03();
        }
        C06740Uw r02 = this.A0F;
        if (r02 != null) {
            r02.A03();
        }
        C06740Uw r03 = this.A0E;
        if (r03 != null) {
            r03.A03();
        }
    }

    public void A0M(Configuration configuration) {
        if (this.A00 && this.A0Z) {
            A0B(this);
            AnonymousClass07B r0 = this.A0C;
            if (r0 != null) {
                r0.A0J(configuration);
            }
        }
        AnonymousClass02W A012 = AnonymousClass02W.A01();
        Context context = this.A0i;
        synchronized (A012) {
            AnonymousClass02X r1 = A012.A00;
            synchronized (r1) {
                C000700i r02 = (C000700i) r1.A06.get(context);
                if (r02 != null) {
                    r02.A07();
                }
            }
        }
        A0C(this, false);
    }

    public void A0R(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        Object obj = this.A0k;
        if (obj instanceof Activity) {
            A0B(this);
            AnonymousClass07B r1 = this.A0C;
            if (!(r1 instanceof AnonymousClass07D)) {
                this.A07 = null;
                if (r1 != null) {
                    r1.A03();
                }
                if (toolbar != null) {
                    AnonymousClass07E r0 = new AnonymousClass07E(this.A0D, toolbar, ((Activity) obj).getTitle());
                    this.A0C = r0;
                    window = this.A0A;
                    callback = r0.A02;
                } else {
                    this.A0C = null;
                    window = this.A0A;
                    callback = this.A0D;
                }
                window.setCallback(callback);
                A0I();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void A0S(CharSequence charSequence) {
        this.A0M = charSequence;
        C17260qz r0 = this.A0K;
        if (r0 != null) {
            r0.setWindowTitle(charSequence);
            return;
        }
        AnonymousClass07B r02 = this.A0C;
        if (r02 != null) {
            r02.A0R(charSequence);
            return;
        }
        TextView textView = this.A0b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean A0T(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = C65953Uc.A03;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.A01 && i == 108) {
            return false;
        }
        if (this.A00 && i == 1) {
            this.A00 = false;
        } else if (i != 1) {
            if (i == 2) {
                A07();
                this.A0h = true;
                return true;
            } else if (i == 5) {
                A07();
                this.A0g = true;
                return true;
            } else if (i == 10) {
                A07();
                this.A0X = true;
                return true;
            } else if (i == 108) {
                A07();
                this.A00 = true;
                return true;
            } else if (i != 109) {
                return this.A0A.requestFeature(i);
            } else {
                A07();
                this.A0W = true;
                return true;
            }
        }
        A07();
        this.A01 = true;
        return true;
    }

    public int A0U(Context context, int i) {
        C06740Uw A042;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (!(i == 1 || i == 2)) {
                        if (i == 3) {
                            A042 = this.A0E;
                            if (A042 == null) {
                                A042 = new AnonymousClass0FJ(context, this);
                                this.A0E = A042;
                            }
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    A042 = A04(context);
                }
                return A042.A00();
            }
            return i;
        }
        return -1;
    }

    public C011404y A0V(int i) {
        C011404y[] r3 = this.A0a;
        if (r3 == null || r3.length <= i) {
            C011404y[] r2 = new C011404y[(i + 1)];
            if (r3 != null) {
                System.arraycopy(r3, 0, r2, 0, r3.length);
            }
            this.A0a = r2;
            r3 = r2;
        }
        C011404y r0 = r3[i];
        if (r0 != null) {
            return r0;
        }
        C011404y r02 = new C011404y(i);
        r3[i] = r02;
        return r02;
    }

    public void A0X(C011404y r5, boolean z) {
        ViewGroup viewGroup;
        C17260qz r0;
        if (!z || r5.A03 != 0 || (r0 = this.A0K) == null || !r0.BMZ()) {
            ViewManager viewManager = (ViewManager) this.A0i.getSystemService("window");
            if (!(viewManager == null || !r5.A0C || (viewGroup = r5.A08) == null)) {
                viewManager.removeView(viewGroup);
                if (z) {
                    int i = r5.A03;
                    C016307a r1 = r5.A0A;
                    if (r5.A0C && !this.A0T) {
                        this.A0D.A00.onPanelClosed(i, r1);
                    }
                }
            }
            r5.A0D = false;
            r5.A0B = false;
            r5.A0C = false;
            r5.A07 = null;
            r5.A0E = true;
            if (this.A0G == r5) {
                this.A0G = null;
                return;
            }
            return;
        }
        A0Y(r5.A0A);
    }

    public void A0Y(C016307a r3) {
        if (!this.A0e) {
            this.A0e = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A0K;
            actionBarOverlayLayout.A03();
            actionBarOverlayLayout.A03.B5c();
            Window.Callback callback = this.A0A.getCallback();
            if (callback != null && !this.A0T) {
                callback.onPanelClosed(C65953Uc.A03, r3);
            }
            this.A0e = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Z(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r1 = r6.A0k
            boolean r0 = r1 instanceof X.AnonymousClass013
            r4 = 1
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof X.AnonymousClass0DT
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.A0A
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.C012005e.A0f(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            int r1 = r7.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x002d
            X.04i r0 = r6.A0D
            android.view.Window$Callback r0 = r0.A00
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r4
        L_0x002d:
            int r5 = r7.getKeyCode()
            int r1 = r7.getAction()
            r0 = 4
            if (r1 != 0) goto L_0x0053
            r2 = 1
            r1 = 0
            if (r5 == r0) goto L_0x013c
            r0 = 82
            if (r5 != r0) goto L_0x0147
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0051
            X.04y r1 = r6.A0V(r1)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0051
            A0D(r7, r1, r6)
        L_0x0051:
            r0 = 1
            return r0
        L_0x0053:
            r3 = 0
            if (r5 == r0) goto L_0x0111
            r0 = 82
            if (r5 != r0) goto L_0x0147
            X.0V9 r0 = r6.A0I
            if (r0 != 0) goto L_0x0051
            X.04y r2 = r6.A0V(r3)
            X.0qz r0 = r6.A0K
            if (r0 == 0) goto L_0x00e6
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00e6
            androidx.appcompat.widget.ActionMenuView r0 = r1.A09
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00e6
            android.content.Context r0 = r6.A0i
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 != 0) goto L_0x00e6
            X.0qz r0 = r6.A0K
            boolean r0 = r0.BMZ()
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x0051
            boolean r0 = A0D(r7, r2, r6)
            if (r0 == 0) goto L_0x0051
            X.0qz r0 = r6.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A09
            if (r0 == 0) goto L_0x0051
            X.0cP r0 = r0.A04
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A03()
        L_0x00b6:
            if (r0 == 0) goto L_0x0051
        L_0x00b8:
            android.content.Context r0 = r6.A0i
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L_0x0108
            r0.playSoundEffect(r3)
            goto L_0x0051
        L_0x00cc:
            X.0qz r0 = r6.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A09
            if (r0 == 0) goto L_0x0051
            X.0cP r0 = r0.A04
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A01()
            goto L_0x00b6
        L_0x00e6:
            boolean r1 = r2.A0C
            if (r1 != 0) goto L_0x0102
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0051
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x00fe
            r2.A0D = r3
            boolean r0 = A0D(r7, r2, r6)
            if (r0 == 0) goto L_0x0051
        L_0x00fe:
            r6.A08(r7, r2)
            goto L_0x00b8
        L_0x0102:
            r6.A0X(r2, r4)
            if (r1 == 0) goto L_0x0051
            goto L_0x00b8
        L_0x0108:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r1, r0)
            goto L_0x0051
        L_0x0111:
            boolean r2 = r6.A0V
            r6.A0V = r3
            X.04y r1 = r6.A0V(r3)
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0124
            if (r2 != 0) goto L_0x0051
            r6.A0X(r1, r4)
            goto L_0x0051
        L_0x0124:
            X.0V9 r0 = r6.A0I
            if (r0 == 0) goto L_0x012d
            r0.A05()
            goto L_0x0051
        L_0x012d:
            A0B(r6)
            X.07B r0 = r6.A0C
            if (r0 == 0) goto L_0x0147
            boolean r0 = r0.A0Z()
            if (r0 == 0) goto L_0x0147
            goto L_0x0051
        L_0x013c:
            int r0 = r7.getFlags()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0145
            r2 = 0
        L_0x0145:
            r6.A0V = r2
        L_0x0147:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.A0Z(android.view.KeyEvent):boolean");
    }

    public boolean Baq(MenuItem menuItem, C016307a r9) {
        Window.Callback callback = this.A0A.getCallback();
        if (callback == null || this.A0T) {
            return false;
        }
        C016307a A012 = r9.A01();
        C011404y[] r4 = this.A0a;
        if (r4 == null) {
            return false;
        }
        for (C011404y r1 : r4) {
            if (r1 != null && r1.A0A == A012) {
                return callback.onMenuItemSelected(r1.A03, menuItem);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r1.A02() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bar(X.C016307a r7) {
        /*
            r6 = this;
            X.0qz r0 = r6.A0K
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x00d0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00d0
            androidx.appcompat.widget.ActionMenuView r0 = r1.A09
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00d0
            android.content.Context r0 = r6.A0i
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x004a
            X.0qz r0 = r6.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A09
            if (r0 == 0) goto L_0x00d0
            X.0cP r1 = r0.A04
            if (r1 == 0) goto L_0x00d0
            X.0gG r0 = r1.A0D
            if (r0 != 0) goto L_0x004a
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00d0
        L_0x004a:
            android.view.Window r0 = r6.A0A
            android.view.Window$Callback r4 = r0.getCallback()
            X.0qz r0 = r6.A0K
            boolean r0 = r0.BMZ()
            r3 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto L_0x0080
            X.0qz r0 = r6.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A09
            if (r0 == 0) goto L_0x0072
            X.0cP r0 = r0.A04
            if (r0 == 0) goto L_0x0072
            r0.A01()
        L_0x0072:
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x007f
            X.04y r0 = r6.A0V(r5)
            X.07a r0 = r0.A0A
            r4.onPanelClosed(r3, r0)
        L_0x007f:
            return
        L_0x0080:
            if (r4 == 0) goto L_0x007f
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x007f
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x009e
            int r0 = r6.A02
            r0 = r0 & 1
            if (r0 == 0) goto L_0x009e
            android.view.Window r0 = r6.A0A
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r6.A0l
            r1.removeCallbacks(r0)
            r0.run()
        L_0x009e:
            X.04y r2 = r6.A0V(r5)
            X.07a r1 = r2.A0A
            if (r1 == 0) goto L_0x007f
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x007f
            android.view.View r0 = r2.A06
            boolean r0 = r4.onPreparePanel(r5, r0, r1)
            if (r0 == 0) goto L_0x007f
            X.07a r0 = r2.A0A
            r4.onMenuOpened(r3, r0)
            X.0qz r0 = r6.A0K
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A03()
            X.07I r0 = r0.A03
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A09
            if (r0 == 0) goto L_0x007f
            X.0cP r0 = r0.A04
            if (r0 == 0) goto L_0x007f
            r0.A03()
            return
        L_0x00d0:
            X.04y r1 = r6.A0V(r5)
            r1.A0E = r2
            r6.A0X(r1, r5)
            r0 = 0
            r6.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02U.Bar(X.07a):void");
    }

    public AnonymousClass02U(Context context, Window window, AnonymousClass01J r6, Object obj) {
        this.A0i = context;
        this.A0j = r6;
        this.A0k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AnonymousClass01L)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        AnonymousClass01L r4 = (AnonymousClass01L) context;
                        if (r4 != null) {
                            this.A03 = ((AnonymousClass02U) r4.A23()).A03;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A03 == -100) {
            AnonymousClass007 r2 = A0n;
            String name = obj.getClass().getName();
            Number number = (Number) r2.get(name);
            if (number != null) {
                this.A03 = number.intValue();
                r2.remove(name);
            }
        }
        if (window != null) {
            A09(window);
        }
        AnonymousClass02W.A02();
    }

    public static void A0B(AnonymousClass02U r3) {
        AnonymousClass07D r1;
        A0A(r3);
        if (r3.A00 && r3.A0C == null) {
            Object obj = r3.A0k;
            if (obj instanceof Activity) {
                r1 = new AnonymousClass07D((Activity) obj, r3.A0W);
            } else if (obj instanceof Dialog) {
                r1 = new AnonymousClass07D((Dialog) obj);
            } else {
                return;
            }
            r3.A0C = r1;
            r1.A0T(r3.A0f);
        }
    }

    public void A0I() {
        A0B(this);
        AnonymousClass07B r0 = this.A0C;
        if (r0 == null || !r0.A05()) {
            this.A02 = (1 << 0) | this.A02;
            if (!this.A0S) {
                C011504z.A07(this.A0A.getDecorView(), this.A0l);
                this.A0S = true;
            }
        }
    }

    public void A0L(int i) {
        A0A(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0i).inflate(i, viewGroup);
        this.A0D.A00.onContentChanged();
    }

    public void A0O(View view) {
        A0A(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A0D.A00.onContentChanged();
    }

    public void A0P(View view, ViewGroup.LayoutParams layoutParams) {
        A0A(this);
        ((ViewGroup) this.A09.findViewById(16908290)).addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public void A0Q(View view, ViewGroup.LayoutParams layoutParams) {
        A0A(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A0F(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
