package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.14u  reason: invalid class name and case insensitive filesystem */
public class C225314u extends AnonymousClass14q implements C225014r, C225114s, C225214t {
    public static final long A0P = 500;
    public static final String A0Q = "screenshot.jpg";
    public View A00;
    public ViewGroup A01;
    public Toolbar A02;
    public C19700wN A03;
    public C20690y0 A04;
    public AnonymousClass17Y A05;
    public C21100yf A06;
    public C19600wD A07;
    public C21060yb A08;
    public C19420v0 A09;
    public C19900wh A0A;
    public AnonymousClass1N0 A0B;
    public AnonymousClass1H2 A0C;
    public C20810yC A0D;
    public boolean A0E = true;
    public int A0F;
    public long A0G;
    public Intent A0H;
    public View A0I;
    public ViewGroup A0J;
    public AnonymousClass1MH A0K;
    public Integer A0L;
    public boolean A0M;
    public final AnonymousClass15V A0N = new AnonymousClass15V(this);
    public final List A0O = new ArrayList();

    public void A2o() {
    }

    public /* synthetic */ void A2v() {
        AnonymousClass1QS.A00(this);
    }

    public /* synthetic */ void A2w() {
    }

    public void A2x(int i) {
    }

    public /* synthetic */ void A2z(Context context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list, AnonymousClass00S r14, AnonymousClass00S r15) {
        int i;
        AnonymousClass00C.A0D(context, 1);
        if (str == null) {
            if (num2 == null) {
                str = null;
            } else if (list == null || list.isEmpty()) {
                str = context.getString(num2.intValue());
            } else {
                str = context.getString(num2.intValue(), new Object[]{list});
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (num != null) {
            alertDialog$Builder.A0L(num.intValue());
        }
        if (str != null) {
            alertDialog$Builder.A0Z(str);
        }
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = R.string.f12nameremoved;
        }
        alertDialog$Builder.setPositiveButton(i, new AnonymousClass4XK(r14, 0));
        if (num4 != null) {
            alertDialog$Builder.setNegativeButton(num4.intValue(), new AnonymousClass4XK(r15, 1));
        }
        AnonymousClass0FM create = alertDialog$Builder.create();
        AnonymousClass00C.A08(create);
        if (num5 != null) {
            int intValue = num5.intValue();
            Button button = create.A00.A0F;
            if (button != null) {
                button.setTextColor(intValue);
            }
        }
        create.show();
    }

    public void A31(Intent intent) {
        A33(intent, false);
    }

    public /* synthetic */ void A3C(Integer num, Integer num2, Integer num3, List list) {
        AnonymousClass1QS.A01(this, num, num2, num3, list);
    }

    public /* synthetic */ void BQ6(String str) {
    }

    public /* synthetic */ void Bln(String str) {
    }

    public void BuO(Intent intent, int i) {
        A32(intent, i, false);
    }

    private AnonymousClass1MH A0O() {
        return (AnonymousClass1MH) new AnonymousClass04H(new AnonymousClass1MG(this), this).A00(AnonymousClass1MH.class);
    }

    private void A0Q() {
        Intent intent = this.A0H;
        if (intent != null) {
            Integer num = this.A0L;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0M) {
                finish();
            }
            this.A0H = null;
            this.A0L = null;
            this.A0M = false;
        }
    }

    public static /* synthetic */ void A0W(Bitmap bitmap, File file) {
        StringBuilder sb;
        String str;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return;
        } catch (FileNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "File not found: ";
            sb.append(str);
            sb.append(e.getMessage());
            Log.e(sb.toString());
            return;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "IOException: ";
            sb.append(str);
            sb.append(e.getMessage());
            Log.e(sb.toString());
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private boolean A0h() {
        C18800tq r4 = (C18800tq) C18810tr.A00(this, C18800tq.class);
        Resources.Theme theme = getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        if (!(typedValue.type == 18 && typedValue.data == 0)) {
            r4.Azp();
            if (!C222013h.A0C) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A22(AnonymousClass02E r3) {
        this.A0O.add(new WeakReference(r3));
    }

    public void A2C(boolean z) {
        AnonymousClass07B supportActionBar;
        if (z || this.A0I != null) {
            int i = 0;
            if (this.A0I == null) {
                View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
                View findViewById = inflate.findViewById(R.id.progress_bar);
                this.A0I = findViewById;
                if (!(findViewById == null || (supportActionBar = getSupportActionBar()) == null)) {
                    supportActionBar.A0V(true);
                    supportActionBar.A0O(inflate, new C013405v(-2, -2, 21));
                }
            }
            View view = this.A0I;
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public List A2m() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : this.A0O) {
            AnonymousClass02E r1 = (AnonymousClass02E) reference.get();
            if (r1 != null && r1.A12()) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public void A32(Intent intent, int i, boolean z) {
        if (!this.A0E) {
            this.A0H = intent;
            this.A0L = Integer.valueOf(i);
            this.A0M = z;
            return;
        }
        startActivityForResult(intent, i);
        if (z) {
            finish();
        }
    }

    public void A33(Intent intent, boolean z) {
        boolean z2;
        if (!this.A0E) {
            this.A0H = intent;
            z2 = false;
        } else {
            startActivity(intent);
            z2 = true;
        }
        if (!z) {
            return;
        }
        if (z2) {
            finish();
        } else {
            this.A0M = true;
        }
    }

    public void A34(Configuration configuration) {
        this.A0K.A0S(configuration);
    }

    public void A3E(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.f7nameremoved));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0P(AnonymousClass3UG.A03(this, textPaint, this.A0C, str));
    }

    public void A3F(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.f7nameremoved));
        setTitle(AnonymousClass3UG.A03(this, textPaint, this.A0C, str));
    }

    public boolean A3I() {
        if (this.A07.A09()) {
            return false;
        }
        boolean A022 = C19600wD.A02(this);
        int i = R.string.f12nameremoved;
        if (A022) {
            i = R.string.f12nameremoved;
        }
        BO5(i);
        return true;
    }

    public boolean A3J(int i) {
        if (this.A07.A09()) {
            return false;
        }
        BO5(i);
        return true;
    }

    public void Bih(AnonymousClass0V9 r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            C011504z.A06(toolbar, 0);
        }
    }

    public void Bii(AnonymousClass0V9 r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            C011504z.A06(toolbar, 4);
        }
    }

    public void Bnv() {
        AnonymousClass15V r1 = this.A0N;
        AnonymousClass15V.A02 = false;
        if (!AnonymousClass3SJ.A04(r1.A01)) {
            ProgressDialogFragment progressDialogFragment = r1.A00;
            if (progressDialogFragment != null) {
                progressDialogFragment.A1c();
            }
            r1.A00 = null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A0E || SystemClock.elapsedRealtime() - this.A0G > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0E) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        this.A0F = C002300y.A00;
        AnonymousClass1JZ.A08(getWindow(), this.A00);
        AnonymousClass1MH A0O2 = A0O();
        this.A0K = A0O2;
        A0O2.A00 = getResources().getConfiguration().uiMode & 48;
        this.A0K.A01.A08(this, new C36201jv(this, 0));
        boolean A0h = A0h();
        if (A0h) {
            getTheme().applyStyle(R.style.f13nameremoved, true);
        }
        super.onCreate(bundle);
        if (C18820ts.A00(this.A00).A06) {
            Resources.Theme theme = getTheme();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.f4nameremoved, typedValue, true);
            if (typedValue.type == 1) {
                i = typedValue.data;
            } else {
                i = R.style.f13nameremoved;
            }
            theme.applyStyle(i, true);
        }
        if (A0h) {
            A2u();
        }
        AnonymousClass1QS.A00(this);
    }

    public void onDestroy() {
        AnonymousClass15V r1 = this.A0N;
        ProgressDialogFragment progressDialogFragment = r1.A00;
        if (progressDialogFragment != null) {
            progressDialogFragment.A1c();
        }
        r1.A00 = null;
        this.A0H = null;
        this.A0M = false;
        super.onDestroy();
    }

    public void onPause() {
        this.A05.A08(this);
        super.onPause();
        this.A0E = false;
        this.A0G = SystemClock.elapsedRealtime();
    }

    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            C012005e.A0S(view, 8);
        }
        if (this.A01 != null) {
            this.A0J.addView(view, -1, -1);
            view = this.A01;
        }
        this.A00 = view;
        super.setContentView(view);
    }

    public C225314u(int i) {
        super(i);
    }

    public static C225314u A0N(Context context) {
        Activity A002 = C18860tw.A00(context);
        if (A002 instanceof C225314u) {
            return (C225314u) A002;
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    private void A0R(int i) {
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(i, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, AnonymousClass1MJ.A00);
        try {
            float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
            obtainStyledAttributes.recycle();
            toolbar.setElevation(dimension);
            AnonymousClass02U r3 = (AnonymousClass02U) A23();
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            boolean z = true;
            if (!r3.A0W && !r3.A0A.hasFeature(9)) {
                z = false;
            }
            if (z) {
                this.A01 = new FrameLayout(this);
                FrameLayout frameLayout = new FrameLayout(this);
                this.A0J = frameLayout;
                this.A01.addView(frameLayout, -1, -1);
            } else {
                LinearLayout linearLayout = new LinearLayout(this);
                this.A01 = linearLayout;
                this.A0J = linearLayout;
                linearLayout.setOrientation(1);
            }
            this.A01.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            setSupportActionBar(toolbar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void A0S(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < j2) {
            SystemClock.sleep(j2 - elapsedRealtime);
        }
    }

    public Uri A2j() {
        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        File A022 = C20690y0.A02(this.A04.A0E(), A0Q);
        this.A04.Bp1(new C35621iz(A022, createBitmap, 1));
        return AnonymousClass6YY.A01(this, A022);
    }

    public Window A2k(String str) {
        Dialog dialog;
        AnonymousClass02E A0N2 = getSupportFragmentManager().A0N(str);
        if (!(A0N2 instanceof DialogFragment) || (dialog = ((DialogFragment) A0N2).A02) == null) {
            return null;
        }
        return dialog.getWindow();
    }

    public DialogFragment A2l(Class cls) {
        if (BLh()) {
            return null;
        }
        AnonymousClass02E A0N2 = getSupportFragmentManager().A0N(cls.getName());
        if (A0N2 instanceof DialogFragment) {
            return (DialogFragment) A0N2;
        }
        return null;
    }

    public void A2n() {
    }

    public void A2p() {
    }

    public void A2q() {
    }

    public void A2r() {
    }

    public void A2s() {
    }

    public void A2t() {
        View view;
        if (!isFinishing() && (view = this.A00) != null) {
            view.postDelayed(new C35641j1((Object) this, 7), 300);
        }
    }

    public void A2u() {
        A0R(R.layout.f9nameremoved);
    }

    public void A2y(int i, int i2) {
        View view;
        if (!BLh()) {
            this.A0N.A00(0, i);
            if (!isFinishing() && (view = this.A00) != null) {
                view.postDelayed(new C35641j1((Object) this, 7), (long) i2);
            }
        }
    }

    public void A30(DialogInterface.OnKeyListener onKeyListener, int i, int i2) {
        if (!BLh()) {
            AnonymousClass15V r1 = this.A0N;
            if (r1.A00 == null) {
                ProgressDialogFragment A032 = ProgressDialogFragment.A03(i, i2);
                r1.A00 = A032;
                A032.A00 = onKeyListener;
                A032.A1f(r1.A01.getSupportFragmentManager(), AnonymousClass15V.A03);
            }
            AnonymousClass15V.A02 = true;
        }
    }

    @Deprecated
    public void A35(C22908AyK ayK, int i, int i2, int i3) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            B82 b82 = new B82(ayK, 1);
            A032.A03 = i3;
            A032.A06 = b82;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    public void A36(C22908AyK ayK, int i, int i2, int i3) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i);
            A032.A00 = i;
            AnonymousClass3VS r0 = AnonymousClass3VS.A00;
            A032.A03 = i2;
            A032.A06 = r0;
            B82 b82 = new B82(ayK, 9);
            A032.A04 = i3;
            A032.A07 = b82;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void A37(C22908AyK ayK, int i, int i2, int i3, int i4) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            B82 b82 = new B82(ayK, 2);
            A032.A03 = i3;
            A032.A06 = b82;
            AnonymousClass3VR r0 = AnonymousClass3VR.A00;
            A032.A04 = i4;
            A032.A07 = r0;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void A38(C22908AyK ayK, C22908AyK ayK2, int i, int i2, int i3) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i);
            A032.A00 = i;
            B82 b82 = new B82(ayK, 5);
            A032.A03 = i2;
            A032.A06 = b82;
            B82 b822 = new B82(ayK2, 6);
            A032.A04 = i3;
            A032.A07 = b822;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void A39(C22908AyK ayK, C22908AyK ayK2, int i, int i2, int i3, int i4) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            B82 b82 = new B82(ayK, 3);
            A032.A03 = i3;
            A032.A06 = b82;
            B82 b822 = new B82(ayK2, 4);
            A032.A04 = i4;
            A032.A07 = b822;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    public void A3A(C22908AyK ayK, C22908AyK ayK2, int i, int i2, int i3, int i4) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            B82 b82 = new B82(ayK, 8);
            A032.A03 = i3;
            A032.A06 = b82;
            B82 b822 = new B82(ayK2, 7);
            A032.A04 = i4;
            A032.A07 = b822;
            Btl(A032.A02(), (String) null);
        }
    }

    public /* synthetic */ void A3B(Integer num) {
        if (num.intValue() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append(" ActivityLifecycleCallbacks: Recreating");
            Log.i(sb.toString());
            recreate();
        }
    }

    public void A3D(String str) {
        if (!BLh()) {
            AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
            AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
            AnonymousClass02E A0N2 = supportFragmentManager.A0N(str);
            if (A0N2 != null) {
                r1.A08(A0N2);
                r1.A02();
            }
        }
    }

    public void A3G(String str) {
        if (!BLh()) {
            this.A0N.A01((String) null, str);
        }
    }

    public void A3H(String str, String str2) {
        if (!BLh()) {
            this.A0N.A01(str, str2);
        }
    }

    public AnonymousClass01z BI2() {
        return super.getSupportFragmentManager();
    }

    public boolean BLh() {
        return AnonymousClass3SJ.A04(this);
    }

    @Deprecated
    public void BO5(int i) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], i);
            A032.A00 = i;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void BO6(String str) {
        if (!BLh()) {
            AnonymousClass3P9 r0 = new AnonymousClass3P9();
            r0.A08 = str;
            r0.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void BO7(String str, String str2) {
        if (!BLh()) {
            AnonymousClass3P9 r0 = new AnonymousClass3P9();
            r0.A08 = str2;
            r0.A09 = str;
            r0.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void BO8(C22908AyK ayK, Object[] objArr, int i, int i2, int i3) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(objArr, i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            B82 b82 = new B82(ayK, 0);
            A032.A03 = i3;
            A032.A06 = b82;
            AnonymousClass3VQ r1 = AnonymousClass3VQ.A00;
            A032.A04 = R.string.f12nameremoved;
            A032.A07 = r1;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    @Deprecated
    public void BO9(Object[] objArr, int i, int i2) {
        if (!BLh()) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(objArr, i2);
            A032.A05 = i;
            A032.A0B = new Object[0];
            A032.A00 = i2;
            A032.A02().A1f(getSupportFragmentManager(), (String) null);
        }
    }

    public void Btl(DialogFragment dialogFragment, String str) {
        if (!BLh()) {
            C65443Sb.A03(dialogFragment, getSupportFragmentManager(), str);
        }
    }

    public void Btm(DialogFragment dialogFragment) {
        if (!BLh()) {
            C65443Sb.A01(dialogFragment, getSupportFragmentManager());
        }
    }

    public void Btn(DialogFragment dialogFragment, String str) {
        if (!BLh()) {
            C65443Sb.A04(dialogFragment, getSupportFragmentManager(), str);
        }
    }

    public /* synthetic */ void Btr(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, List list) {
        int i;
        AnonymousClass01z BI2 = BI2();
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = R.string.f12nameremoved;
        }
        AnonymousClass5ZU.A00(BI2, num, num2, num4, num5, str, str2, list, i);
    }

    public void Bu1(int i) {
        if (!BLh()) {
            Bu2(0, i);
        }
    }

    public void Bu2(int i, int i2) {
        if (!BLh()) {
            this.A0N.A00(i, i2);
        }
    }

    public AnonymousClass0V9 But(C021809f r4) {
        AnonymousClass0V9 But = super.But(r4);
        if (But != null) {
            But.A06();
        }
        View findViewById = findViewById(R.id.action_mode_close_button);
        if (findViewById != null) {
            C012005e.A0V(findViewById, new C39201rV(this));
        }
        return But;
    }

    public void Bwu(String str) {
        StringBuilder sb;
        String str2;
        if (!BLh()) {
            ProgressDialogFragment progressDialogFragment = this.A0N.A00;
            if (progressDialogFragment == null) {
                sb = new StringBuilder();
                str2 = "dialogtoast/update-progress-message/progress-spinner-not-shown \"";
            } else {
                Dialog dialog = progressDialogFragment.A02;
                if (dialog == null) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/null-dialog/ \"";
                } else if (!(dialog instanceof ProgressDialog)) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"";
                } else {
                    ((AlertDialog) dialog).setMessage(str);
                    return;
                }
            }
            sb.append(str2);
            sb.append(str);
            sb.append("\"");
            Log.w(sb.toString());
        }
    }

    public C20810yC getAbProps() {
        return this.A0D;
    }

    public View getContentView() {
        return this.A00;
    }

    public C19700wN getCrashLogs() {
        return this.A03;
    }

    public AnonymousClass1H2 getEmojiLoader() {
        return this.A0C;
    }

    public AnonymousClass17Y getGlobalUI() {
        return this.A05;
    }

    public C21100yf getServerProps() {
        return this.A06;
    }

    public C21060yb getSystemServices() {
        return this.A08;
    }

    public C19420v0 getWaSharedPreferences() {
        return this.A09;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A34(configuration);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onRestart() {
        super.onRestart();
        if (C002300y.A00 != this.A0F) {
            recreate();
        }
    }

    public void onResume() {
        super.onResume();
        this.A05.A0A(this);
        this.A0E = true;
        A0Q();
    }

    public void onStart() {
        super.onStart();
        this.A0K.A0S(getResources().getConfiguration());
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.A02 = toolbar;
    }

    public C225314u() {
    }

    public void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null, false));
    }
}
