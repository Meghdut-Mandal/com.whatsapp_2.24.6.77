package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4vr  reason: invalid class name and case insensitive filesystem */
public abstract class C100834vr extends C101024wi implements C225014r {
    public Intent A00;
    public AnonymousClass17Y A01;
    public Integer A02;
    public boolean A03 = true;
    public boolean A04;
    public int A05;
    public int A06;
    public long A07;
    public ProgressDialog A08;
    @Deprecated
    public String A09;
    public WaPreferenceFragment A0A;
    public final C20010ws A0B = new C144566sS(this);

    public void Bnv() {
        this.A08 = null;
        AnonymousClass3SJ.A00(this, 501);
    }

    public void onCreate(Bundle bundle) {
        this.A04 = false;
        AnonymousClass1JZ.A08(getWindow(), this.A00);
        getTheme().applyStyle(R.style.f13nameremoved, true);
        getLayoutInflater().setFactory2(new C135356cZ(A23()));
        A23().A0N(bundle);
        super.onCreate(bundle);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft += view.getPaddingLeft();
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        C18820ts r0 = this.A00;
        r0.A09.add(this.A0B);
    }

    public void BO5(int i) {
        this.A05 = i;
        AnonymousClass3SJ.A01(this, 500);
    }

    @Deprecated
    public void BO6(String str) {
        this.A09 = str;
        AnonymousClass3SJ.A01(this, 500);
    }

    public void BO7(String str, String str2) {
        throw AnonymousClass001.A09("Unsupported operation");
    }

    public void BO9(Object[] objArr, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        AnonymousClass3SJ.A01(this, 500);
    }

    public void Btn(DialogFragment dialogFragment, String str) {
        if (!AnonymousClass3SJ.A04(this)) {
            C65443Sb.A04(dialogFragment, getSupportFragmentManager(), "BrazilPaymentIncomeCollectionBottomSheet");
        }
    }

    public void Bu2(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        AnonymousClass3SJ.A01(this, 501);
    }

    public void Bwu(String str) {
        ProgressDialog progressDialog = this.A08;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A03 || SystemClock.elapsedRealtime() - this.A07 > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (this.A03) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A00.A0O();
        super.onConfigurationChanged(configuration);
        A23().A0M(configuration);
    }

    public Dialog onCreateDialog(int i) {
        String str;
        if (i == 500) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            if (TextUtils.isEmpty(this.A09)) {
                str = getString(this.A05);
            } else {
                str = this.A09;
            }
            A002.A0p(str);
            C163297py.A01(A002, this, 0, R.string.f12nameremoved);
            int i2 = this.A06;
            if (i2 != 0) {
                A002.A0L(i2);
            }
            return A002.create();
        } else if (i != 501) {
            Dialog A1a = this.A0A.A1a(i);
            if (A1a == null) {
                return super.onCreateDialog(i);
            }
            return A1a;
        } else {
            ProgressDialog progressDialog = new ProgressDialog(this);
            int i3 = this.A06;
            if (i3 != 0) {
                progressDialog.setTitle(i3);
            }
            C36391kE.A17(progressDialog, this, this.A05);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A08 = progressDialog;
            return progressDialog;
        }
    }

    public void onPause() {
        this.A01.A08(this);
        super.onPause();
        this.A03 = false;
        this.A07 = SystemClock.elapsedRealtime();
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        String str;
        if (i != 500) {
            super.onPrepareDialog(i, dialog);
            return;
        }
        AnonymousClass0FM r4 = (AnonymousClass0FM) dialog;
        if (TextUtils.isEmpty(this.A09)) {
            str = getString(this.A05);
        } else {
            str = this.A09;
        }
        AnonymousClass0YZ r0 = r4.A00;
        r0.A0R = str;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public boolean BLh() {
        return AnonymousClass3SJ.A04(this);
    }

    public void Btl(DialogFragment dialogFragment, String str) {
        if (!AnonymousClass3SJ.A04(this)) {
            C65443Sb.A03(dialogFragment, getSupportFragmentManager(), str);
        }
    }

    public void Btm(DialogFragment dialogFragment) {
        if (!AnonymousClass3SJ.A04(this)) {
            C65443Sb.A01(dialogFragment, getSupportFragmentManager());
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A23().A0P(view, layoutParams);
    }

    public void onDestroy() {
        super.onDestroy();
        A23().A0J();
        C18820ts r0 = this.A00;
        r0.A09.remove(this.A0B);
        this.A00 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AnonymousClass02U.A0A((AnonymousClass02U) A23());
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass02U r0 = (AnonymousClass02U) A23();
        AnonymousClass02U.A0B(r0);
        AnonymousClass07B r1 = r0.A0C;
        if (r1 != null) {
            r1.A0Y(true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A09 = bundle.getString("dialogToastMessage");
        this.A05 = bundle.getInt("dialogToastMessageId", 0);
        this.A06 = bundle.getInt("dialogToastTitleId", 0);
    }

    public void onResume() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass000.A0k(this));
        C36321k7.A1a(A0u, ".onResume");
        if (this.A04) {
            this.A04 = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A01.A0A(this);
        this.A03 = true;
        Intent intent = this.A00;
        if (intent != null) {
            Integer num = this.A02;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A00 = null;
            this.A02 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass000.A0k(this));
        C36321k7.A1a(A0u, ".onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A09);
        bundle.putInt("dialogToastMessageId", this.A05);
        bundle.putInt("dialogToastTitleId", this.A06);
    }

    public void onStop() {
        super.onStop();
        A23().A0K();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A23().A0S(charSequence);
    }

    public void setContentView(int i) {
        Toolbar toolbar = (Toolbar) C36361kB.A0E(getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
        toolbar.setTitle(getTitle());
        toolbar.setElevation(AnonymousClass1RH.A00(this));
        boolean A1X = C36401kF.A1X(this.A00);
        int i2 = R.drawable.abc_ic_ab_back_material;
        if (A1X) {
            i2 = R.drawable.ic_back_rtl;
        }
        toolbar.setNavigationIcon(i2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        FrameLayout frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView((View) linearLayout);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new C66923Xv(this, 11));
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A23().A0R(toolbar);
        if (toolbar != null && C222013h.A05) {
            AnonymousClass1RA.A00(getWindow(), toolbar);
        }
    }

    public void BO8(C22908AyK ayK, Object[] objArr, int i, int i2, int i3) {
        BO9(objArr, i, i2);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A23().A0Q(view, layoutParams);
    }

    public void setContentView(View view) {
        A23().A0O(view);
    }
}
