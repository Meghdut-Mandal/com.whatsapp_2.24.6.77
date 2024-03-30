package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass029;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0CZ;
import X.AnonymousClass759;
import X.AnonymousClass7e6;
import X.AnonymousClass9BI;
import X.AnonymousClass9XO;
import X.C168137zl;
import X.C22762AvX;
import X.C22763AvY;
import X.C22850Awz;
import X.C23133B6o;
import X.C36321k7;
import X.C36361kB;
import X.C96364nD;
import X.C97104oR;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public abstract class PreferenceFragmentCompat extends AnonymousClass02E implements AnonymousClass7e6, C22850Awz, C22762AvX, C22763AvY {
    public Handler A00 = new C23133B6o(this);
    public AnonymousClass9XO A01;
    public RecyclerView A02;
    public boolean A03;
    public boolean A04;
    public int A05 = R.layout.f9nameremoved;
    public final C96364nD A06 = new C96364nD(this);
    public final Runnable A07 = new AnonymousClass759((Object) this, 11);

    public abstract void A1Y(String str, Bundle bundle);

    public void A1J() {
        Handler handler = this.A00;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A03) {
            this.A02.setAdapter((AnonymousClass0CZ) null);
            PreferenceScreen preferenceScreen = this.A01.A06;
            if (preferenceScreen != null) {
                preferenceScreen.A08();
            }
        }
        this.A02 = null;
        super.A1J();
    }

    public void A1R(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A01.A06;
        if (preferenceScreen != null) {
            Bundle A072 = AnonymousClass001.A07();
            preferenceScreen.A0B(A072);
            bundle.putBundle("android:preferences", A072);
        }
    }

    public void A1S(Bundle bundle, View view) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.A01.A06) == null)) {
            preferenceScreen2.A0A(bundle2);
        }
        if (this.A03 && (preferenceScreen = this.A01.A06) != null) {
            this.A02.setAdapter(new C168137zl(preferenceScreen));
            preferenceScreen.A07();
        }
        this.A04 = true;
    }

    public Preference B7M(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        AnonymousClass9XO r0 = this.A01;
        if (r0 == null || (preferenceScreen = r0.A06) == null) {
            return null;
        }
        return preferenceScreen.A0S(charSequence);
    }

    public boolean BdI(Preference preference) {
        String str = preference.A0I;
        if (str == null) {
            return false;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        AnonymousClass01z supportFragmentManager = A0i().getSupportFragmentManager();
        Bundle bundle = preference.A08;
        if (bundle == null) {
            bundle = AnonymousClass001.A07();
            preference.A08 = bundle;
        }
        AnonymousClass029 A0O = supportFragmentManager.A0O();
        A0i().getClassLoader();
        AnonymousClass02E A002 = A0O.A00(str);
        A002.A17(bundle);
        A002.A0y(this, 0);
        AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
        r1.A0B(A002, ((View) this.A0F.getParent()).getId());
        r1.A0J((String) null);
        r1.A01();
        return true;
    }

    public void A1B() {
        super.A1B();
        AnonymousClass9XO r1 = this.A01;
        r1.A05 = null;
        r1.A03 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        int i;
        TypedArray obtainStyledAttributes = A1D().obtainStyledAttributes((AttributeSet) null, AnonymousClass9BI.A07, R.attr.f4nameremoved, 0);
        this.A05 = obtainStyledAttributes.getResourceId(0, this.A05);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A1D());
        View inflate = cloneInContext.inflate(this.A05, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!A1D().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) C36361kB.A0E(cloneInContext, viewGroup2, R.layout.f9nameremoved);
                A1D();
                C36321k7.A0Q(recyclerView);
                recyclerView.setAccessibilityDelegateCompat(new C97104oR(recyclerView));
            }
            this.A02 = recyclerView;
            C96364nD r2 = this.A06;
            recyclerView.A0t(r2);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            r2.A00 = i;
            r2.A01 = drawable;
            PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
            preferenceFragmentCompat.A02.A0b();
            if (dimensionPixelSize != -1) {
                r2.A00 = dimensionPixelSize;
                preferenceFragmentCompat.A02.A0b();
            }
            r2.A02 = z;
            if (this.A02.getParent() == null) {
                viewGroup2.addView(this.A02);
            }
            this.A00.post(this.A07);
            return inflate;
        }
        throw AnonymousClass001.A09("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void A1M() {
        super.A1M();
        AnonymousClass9XO r0 = this.A01;
        r0.A05 = this;
        r0.A03 = this;
    }

    public void A1Q(Bundle bundle) {
        String str;
        super.A1Q(bundle);
        TypedValue typedValue = new TypedValue();
        A0h().getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.f13nameremoved;
        }
        A0h().getTheme().applyStyle(i, false);
        AnonymousClass9XO r0 = new AnonymousClass9XO(A1D());
        this.A01 = r0;
        r0.A04 = this;
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            str = bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        A1Y(str, bundle);
    }
}
