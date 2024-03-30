package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Yh;
import X.AnonymousClass9XO;
import X.C013105r;
import X.C07650Ys;
import X.C135366ca;
import X.C165597tg;
import X.C168137zl;
import X.C22761AvW;
import X.C22847Aww;
import X.C22848Awx;
import X.C22849Awy;
import X.C36421kH;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Context A05;
    public Intent A06;
    public Drawable A07;
    public Bundle A08;
    public C22761AvW A09;
    public C22847Aww A0A;
    public C22848Awx A0B;
    public C22849Awy A0C;
    public PreferenceGroup A0D;
    public AnonymousClass9XO A0E;
    public CharSequence A0F;
    public Object A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public C135366ca A0V;
    public CharSequence A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d;

    public void A0C(Parcelable parcelable) {
        this.A0L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw AnonymousClass001.A08("Wrong state class -- expecting Preference State");
        }
    }

    @Deprecated
    public void A0E(C07650Ys r1) {
    }

    public static void A03(Preference preference) {
        AnonymousClass9XO r0;
        PreferenceScreen preferenceScreen;
        Preference A0S2;
        List list;
        String str = preference.A0H;
        if (str != null && (r0 = preference.A0E) != null && (preferenceScreen = r0.A06) != null && (A0S2 = preferenceScreen.A0S(str)) != null && (list = A0S2.A0K) != null) {
            list.remove(preference);
        }
    }

    public CharSequence A04() {
        C22849Awy awy = this.A0C;
        if (awy != null) {
            return awy.BmT(this);
        }
        return this.A0W;
    }

    public void A05() {
        C22761AvW avW = this.A09;
        if (avW != null) {
            C168137zl r1 = (C168137zl) avW;
            int indexOf = r1.A03.indexOf(this);
            if (indexOf != -1) {
                r1.A01.A04(this, indexOf, 1);
            }
        }
    }

    public void A06() {
        C22761AvW avW = this.A09;
        if (avW != null) {
            C168137zl r0 = (C168137zl) avW;
            Handler handler = r0.A00;
            Runnable runnable = r0.A01;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A07() {
        PreferenceScreen preferenceScreen;
        Preference A0S2;
        String str = this.A0H;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass9XO r0 = this.A0E;
            if (r0 == null || (preferenceScreen = r0.A06) == null || (A0S2 = preferenceScreen.A0S(str)) == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Dependency \"");
                A0u.append(str);
                A0u.append("\" not found for preference \"");
                A0u.append(this.A0J);
                A0u.append("\" (title: \"");
                A0u.append(this.A0F);
                throw AnonymousClass000.A0g("\"", A0u);
            }
            List list = A0S2.A0K;
            if (list == null) {
                list = AnonymousClass001.A0I();
                A0S2.A0K = list;
            }
            list.add(this);
            boolean A0P2 = A0S2.A0P();
            if (this.A0N == A0P2) {
                this.A0N = !A0P2;
                C165597tg.A17(this);
            }
        }
    }

    public void A08() {
        if (this instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) this;
            A03(preferenceGroup);
            preferenceGroup.A02 = false;
            List list = preferenceGroup.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).A08();
            }
            return;
        }
        A03(this);
    }

    public void A09(int i) {
        Drawable A012 = C013105r.A01(this.A05, i);
        if (this.A07 != A012) {
            this.A07 = A012;
            this.A00 = 0;
            A05();
        }
        this.A00 = i;
    }

    public void A0A(Bundle bundle) {
        Parcelable parcelable;
        if (C36421kH.A1a(this.A0J) && (parcelable = bundle.getParcelable(this.A0J)) != null) {
            this.A0L = false;
            A0C(parcelable);
            if (!this.A0L) {
                throw AnonymousClass001.A09("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.7z3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.7z3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.7z3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.7z3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.7z3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.7z3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0J
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r4.A0L = r0
            r2 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0031
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.7z7 r1 = new X.7z7
            r1.<init>((android.os.Parcelable) r3)
            boolean r0 = r2.A02
            r1.A00 = r0
        L_0x0024:
            r3 = r1
        L_0x0025:
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x00b8
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = r4.A0J
            r5.putParcelable(r0, r3)
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r4 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x0052
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.7z8 r1 = new X.7z8
            r1.<init>((android.os.Parcelable) r3)
            int r0 = r2.A05
            r1.A02 = r0
            int r0 = r2.A03
            r1.A01 = r0
            int r0 = r2.A02
            r1.A00 = r0
            goto L_0x0024
        L_0x0052:
            boolean r0 = r4 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0065
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r1 = android.view.AbsSavedState.EMPTY_STATE
            int r0 = r2.A00
            X.7z6 r3 = new X.7z6
            r3.<init>(r1, r0)
            goto L_0x0025
        L_0x0065:
            boolean r0 = r4 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x007e
            androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.7z5 r1 = new X.7z5
            r1.<init>((android.os.Parcelable) r3)
            java.util.Set r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x007e:
            boolean r0 = r4 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x0097
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.7z4 r1 = new X.7z4
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0097:
            boolean r0 = r4 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x00b1
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.7z3 r1 = new X.7z3
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x00b1:
            r0 = 1
            r4.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            goto L_0x0025
        L_0x00b8:
            java.lang.String r0 = "Derived class did not call super.onSaveInstanceState()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0B(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.AnonymousClass9XO r5) {
        /*
            r4 = this;
            r4.A0E = r5
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0015
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x0010 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r0
        L_0x0013:
            r4.A04 = r2
        L_0x0015:
            boolean r0 = r4.A0Q()
            if (r0 == 0) goto L_0x00d7
            X.9XO r0 = r4.A0E
            if (r0 == 0) goto L_0x00d4
            android.content.SharedPreferences r1 = r0.A01()
        L_0x0023:
            java.lang.String r0 = r4.A0J
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00d7
            r3 = 0
        L_0x002c:
            r2 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0053
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            if (r3 != 0) goto L_0x0039
            java.lang.Boolean r3 = X.C36381kD.A0j()
        L_0x0039:
            boolean r3 = X.AnonymousClass000.A1X(r3)
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x004f
            X.9XO r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            boolean r3 = r1.getBoolean(r0, r3)
        L_0x004f:
            r2.A0T(r3)
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r4 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x007a
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            if (r3 != 0) goto L_0x005f
            java.lang.Integer r3 = X.C36381kD.A0m()
        L_0x005f:
            int r3 = X.AnonymousClass000.A0I(r3)
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0075
            X.9XO r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            int r3 = r1.getInt(r0, r3)
        L_0x0075:
            r0 = 1
            androidx.preference.SeekBarPreference.A00(r2, r3, r0)
            return
        L_0x007a:
            boolean r0 = r4 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0098
            androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
            java.util.Set r3 = (java.util.Set) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0094
            X.9XO r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.util.Set r3 = r1.getStringSet(r0, r3)
        L_0x0094:
            r2.A0S(r3)
            return
        L_0x0098:
            boolean r0 = r4 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x00b6
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00b2
            X.9XO r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.lang.String r3 = r1.getString(r0, r3)
        L_0x00b2:
            r2.A0T(r3)
            return
        L_0x00b6:
            boolean r0 = r4 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x0052
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00d0
            X.9XO r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.lang.String r3 = r1.getString(r0, r3)
        L_0x00d0:
            r2.A0S(r3)
            return
        L_0x00d4:
            r1 = 0
            goto L_0x0023
        L_0x00d7:
            java.lang.Object r3 = r4.A0G
            if (r3 == 0) goto L_0x0052
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0F(X.9XO):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r0 != null) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass80G r9) {
        /*
            r8 = this;
            android.view.View r4 = r9.A0H
            android.view.View$OnClickListener r0 = r8.A0d
            r4.setOnClickListener(r0)
            r0 = 0
            r4.setId(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = 0
            r5 = 0
            r2 = 8
            if (r6 == 0) goto L_0x0106
            java.lang.CharSequence r1 = r8.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0103
            r6.setText(r1)
            r6.setVisibility(r5)
            int r0 = r6.getCurrentTextColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0067
            java.lang.CharSequence r1 = r8.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fe
            r6.setText(r1)
            r6.setVisibility(r5)
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x0054
            boolean r0 = r8.A0c
            r6.setSingleLine(r0)
        L_0x0054:
            boolean r0 = r8.A0T
            if (r0 != 0) goto L_0x0067
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x0067
            int r0 = r7.intValue()
            r6.setTextColor(r0)
        L_0x0067:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0092
            int r1 = r8.A00
            if (r1 != 0) goto L_0x007a
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x008b
        L_0x007a:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 != 0) goto L_0x0088
            android.content.Context r0 = r8.A05
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r0, r1)
            r8.A07 = r0
            if (r0 == 0) goto L_0x008b
        L_0x0088:
            r6.setImageDrawable(r0)
        L_0x008b:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00f3
            r6.setVisibility(r5)
        L_0x0092:
            r0 = 2131430839(0x7f0b0db7, float:1.848339E38)
            android.view.View r1 = r9.A0B(r0)
            if (r1 != 0) goto L_0x00a4
            r0 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.A0B(r0)
            if (r1 == 0) goto L_0x00ab
        L_0x00a4:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00ea
            r1.setVisibility(r5)
        L_0x00ab:
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r8.A0O()
            r8.A02(r4, r0)
        L_0x00b6:
            boolean r2 = r8.A0T
            r4.setFocusable(r2)
            r4.setClickable(r2)
            boolean r0 = r8.A0X
            r9.A00 = r0
            boolean r0 = r8.A0Y
            r9.A01 = r0
            boolean r1 = r8.A0M
            if (r1 == 0) goto L_0x00e3
            X.6ca r0 = r8.A0V
            if (r0 != 0) goto L_0x00d5
            X.6ca r0 = new X.6ca
            r0.<init>(r8)
            r8.A0V = r0
        L_0x00d5:
            r4.setOnCreateContextMenuListener(r0)
            r4.setLongClickable(r1)
            if (r1 == 0) goto L_0x00e2
            if (r2 != 0) goto L_0x00e2
            X.C011504z.A04(r3, r4)
        L_0x00e2:
            return
        L_0x00e3:
            r0 = r3
            goto L_0x00d5
        L_0x00e5:
            r0 = 1
            r8.A02(r4, r0)
            goto L_0x00b6
        L_0x00ea:
            boolean r0 = r8.A0P
            if (r0 == 0) goto L_0x00ef
            r2 = 4
        L_0x00ef:
            r1.setVisibility(r2)
            goto L_0x00ab
        L_0x00f3:
            boolean r1 = r8.A0P
            r0 = 8
            if (r1 == 0) goto L_0x00fa
            r0 = 4
        L_0x00fa:
            r6.setVisibility(r0)
            goto L_0x0092
        L_0x00fe:
            r6.setVisibility(r2)
            goto L_0x0067
        L_0x0103:
            r6.setVisibility(r2)
        L_0x0106:
            r7 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0G(X.80G):void");
    }

    public void A0H(CharSequence charSequence) {
        if (this.A0C != null) {
            throw AnonymousClass001.A09("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.A0W, charSequence)) {
            this.A0W = charSequence;
            A05();
        }
    }

    public void A0I(CharSequence charSequence) {
        CharSequence charSequence2 = this.A0F;
        if (charSequence == null) {
            if (charSequence2 == null) {
                return;
            }
        } else if (charSequence.equals(charSequence2)) {
            return;
        }
        this.A0F = charSequence;
        A05();
    }

    public void A0J(String str) {
        this.A0J = str;
        if (this.A0S && !C36421kH.A1a(str)) {
            if (!TextUtils.isEmpty(this.A0J)) {
                this.A0S = true;
                return;
            }
            throw AnonymousClass001.A09("Preference does not have a key assigned.");
        }
    }

    public void A0L(boolean z) {
        List list = this.A0K;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (preference.A0N == z) {
                    preference.A0N = !z;
                    C165597tg.A17(preference);
                }
            }
        }
    }

    public void A0M(boolean z) {
        if (this.A0Z != z) {
            this.A0Z = z;
            C165597tg.A17(this);
        }
    }

    public final void A0N(boolean z) {
        if (this.A0U != z) {
            this.A0U = z;
            C22761AvW avW = this.A09;
            if (avW != null) {
                C168137zl r0 = (C168137zl) avW;
                Handler handler = r0.A00;
                Runnable runnable = r0.A01;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
    }

    public boolean A0O() {
        if (!this.A0Z || !this.A0N || !this.A0Q) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        if (this instanceof TwoStatePreference) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) this;
            boolean z = twoStatePreference.A03;
            boolean z2 = twoStatePreference.A02;
            if (z) {
                if (z2) {
                    return true;
                }
            } else if (!z2) {
                return true;
            }
            if (!(!twoStatePreference.A0O())) {
                return false;
            }
            return true;
        } else if (!(this instanceof EditTextPreference)) {
            return !A0O();
        } else {
            EditTextPreference editTextPreference = (EditTextPreference) this;
            if (TextUtils.isEmpty(editTextPreference.A00) || (!editTextPreference.A0O())) {
                return true;
            }
            return false;
        }
    }

    public boolean A0Q() {
        if (this.A0E == null || !this.A0R || !C36421kH.A1a(this.A0J)) {
            return false;
        }
        return true;
    }

    public boolean A0R(Object obj) {
        C22847Aww aww = this.A0A;
        if (aww == null) {
            return true;
        }
        aww.BdG(this, obj);
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0F;
        CharSequence charSequence2 = preference.A0F;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0F.toString());
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16842894));
    }

    private void A02(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A02(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r1 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.View r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r7.A0T
            if (r0 == 0) goto L_0x0026
            r2 = r7
            boolean r0 = r7 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0040
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            boolean r0 = r2.A02
            r1 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A0R(r0)
            r2.A0T(r1)
        L_0x001f:
            X.Awx r0 = r7.A0B
            if (r0 == 0) goto L_0x0027
            r0.BdH(r7)
        L_0x0026:
            return
        L_0x0027:
            X.9XO r0 = r7.A0E
            if (r0 == 0) goto L_0x0036
            X.Awz r0 = r0.A05
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.BdI(r7)
            if (r0 == 0) goto L_0x0036
            return
        L_0x0036:
            android.content.Intent r1 = r7.A06
            if (r1 == 0) goto L_0x0026
            android.content.Context r0 = r7.A05
            r0.startActivity(r1)
            return
        L_0x0040:
            boolean r0 = r7 instanceof androidx.preference.PreferenceScreen
            if (r0 == 0) goto L_0x0054
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            android.content.Intent r0 = r2.A06
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r2.A0I
            if (r0 != 0) goto L_0x001f
            java.util.List r0 = r2.A01
            r0.size()
            goto L_0x001f
        L_0x0054:
            boolean r0 = r7 instanceof androidx.preference.DialogPreference
            if (r0 == 0) goto L_0x001f
            androidx.preference.DialogPreference r2 = (androidx.preference.DialogPreference) r2
            boolean r0 = r2 instanceof com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1
            if (r0 == 0) goto L_0x006d
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 r2 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1) r2
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r0 = r2.A01
            X.01I r1 = r0.A0h()
            if (r1 == 0) goto L_0x001f
        L_0x0068:
            r0 = 0
            X.AnonymousClass3SJ.A01(r1, r0)
            goto L_0x001f
        L_0x006d:
            boolean r0 = r2 instanceof X.C167817yy
            if (r0 == 0) goto L_0x0078
            X.7yy r2 = (X.C167817yy) r2
            com.whatsapp.settings.SettingsJidNotificationFragment r0 = r2.A01
            X.4vr r1 = r0.A00
            goto L_0x0068
        L_0x0078:
            boolean r0 = r2 instanceof androidx.preference.DropDownPreference
            if (r0 == 0) goto L_0x0084
            androidx.preference.DropDownPreference r2 = (androidx.preference.DropDownPreference) r2
            android.widget.Spinner r0 = r2.A00
            r0.performClick()
            goto L_0x001f
        L_0x0084:
            X.9XO r0 = r2.A0E
            X.AvX r6 = r0.A03
            if (r6 == 0) goto L_0x001f
            X.02E r6 = (X.AnonymousClass02E) r6
            r5 = 0
            X.01z r0 = r6.A0l()
            java.lang.String r4 = "androidx.preference.PreferenceFragment.DIALOG"
            X.02E r0 = r0.A0N(r4)
            if (r0 != 0) goto L_0x001f
            boolean r0 = r2 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x00be
            java.lang.String r3 = r2.A0J
            androidx.preference.EditTextPreferenceDialogFragmentCompat r2 = new androidx.preference.EditTextPreferenceDialogFragmentCompat
            r2.<init>()
        L_0x00a4:
            r0 = 1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r0)
            java.lang.String r0 = "key"
            r1.putString(r0, r3)
            r2.A17(r1)
            r2.A0y(r6, r5)
            X.01z r0 = r6.A0l()
            r2.A1f(r0, r4)
            goto L_0x001f
        L_0x00be:
            boolean r0 = r2 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x00ca
            java.lang.String r3 = r2.A0J
            androidx.preference.ListPreferenceDialogFragmentCompat r2 = new androidx.preference.ListPreferenceDialogFragmentCompat
            r2.<init>()
            goto L_0x00a4
        L_0x00ca:
            boolean r0 = r2 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x00d6
            java.lang.String r3 = r2.A0J
            androidx.preference.MultiSelectListPreferenceDialogFragmentCompat r2 = new androidx.preference.MultiSelectListPreferenceDialogFragmentCompat
            r2.<init>()
            goto L_0x00a4
        L_0x00d6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot display dialog for an unknown Preference type: "
            r1.append(r0)
            X.AnonymousClass000.A1C(r2, r1)
            java.lang.String r0 = ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0D(android.view.View):void");
    }

    public void A0K(String str) {
        if (A0Q()) {
            String str2 = null;
            if (A0Q()) {
                str2 = this.A0E.A01().getString(this.A0J, (String) null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor A002 = this.A0E.A00();
                A002.putString(this.A0J, str);
                if (!this.A0E.A08) {
                    A002.apply();
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        CharSequence charSequence = this.A0F;
        if (!TextUtils.isEmpty(charSequence)) {
            A0u.append(charSequence);
            A0u.append(' ');
        }
        CharSequence A042 = A04();
        if (!TextUtils.isEmpty(A042)) {
            A0u.append(A042);
            A0u.append(' ');
        }
        if (A0u.length() > 0) {
            A0u.setLength(A0u.length() - 1);
        }
        return A0u.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f9, code lost:
        if (r6.hasValue(11) != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            r8 = this;
            r8.<init>()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r8.A02 = r2
            r5 = 1
            r8.A0Z = r5
            r8.A0T = r5
            r8.A0R = r5
            r8.A0N = r5
            r8.A0Q = r5
            r8.A0U = r5
            r8.A0X = r5
            r8.A0Y = r5
            r8.A0c = r5
            r8.A0b = r5
            r0 = 2131625888(0x7f0e07a0, float:1.8878997E38)
            r8.A01 = r0
            r4 = 0
            X.3Xv r0 = new X.3Xv
            r0.<init>(r8, r4)
            r8.A0d = r0
            r8.A05 = r9
            int[] r0 = X.AnonymousClass9BI.A06
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r10, r0, r11, r12)
            r1 = 23
            int r0 = r6.getResourceId(r4, r4)
            int r0 = r6.getResourceId(r1, r0)
            r8.A00 = r0
            r1 = 26
            r0 = 6
            java.lang.String r0 = X.C165577te.A0j(r6, r1, r0)
            r8.A0J = r0
            r0 = 34
            r1 = 4
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0054
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0054:
            r8.A0F = r0
            r0 = 33
            r1 = 7
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0063:
            r8.A0W = r0
            r1 = 28
            r0 = 8
            int r0 = r6.getInt(r0, r2)
            int r0 = r6.getInt(r1, r0)
            r8.A02 = r0
            r1 = 22
            r0 = 13
            java.lang.String r0 = X.C165577te.A0j(r6, r1, r0)
            r8.A0I = r0
            r2 = 27
            r1 = 3
            r0 = 2131625888(0x7f0e07a0, float:1.8878997E38)
            int r0 = r6.getResourceId(r1, r0)
            int r0 = r6.getResourceId(r2, r0)
            r8.A01 = r0
            r1 = 35
            r0 = 9
            int r0 = r6.getResourceId(r0, r4)
            int r0 = r6.getResourceId(r1, r0)
            r8.A03 = r0
            r1 = 21
            r0 = 2
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Z = r0
            r1 = 30
            r0 = 5
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0T = r0
            r1 = 29
            boolean r0 = r6.getBoolean(r5, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0R = r0
            r1 = 19
            r0 = 10
            java.lang.String r0 = X.C165577te.A0j(r6, r1, r0)
            r8.A0H = r0
            boolean r0 = r8.A0T
            r1 = 16
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0X = r0
            boolean r0 = r8.A0T
            r1 = 17
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Y = r0
            r0 = 18
            r1 = 18
            boolean r0 = r6.hasValue(r0)
            if (r0 != 0) goto L_0x00fb
            r0 = 11
            r1 = 11
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x0109
        L_0x00fb:
            boolean r0 = r8 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0159
            boolean r0 = r6.getBoolean(r1, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0107:
            r8.A0G = r7
        L_0x0109:
            r1 = 31
            r0 = 12
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0b = r0
            r0 = 32
            boolean r0 = r6.hasValue(r0)
            r8.A0a = r0
            if (r0 == 0) goto L_0x012f
            r1 = 32
            r0 = 14
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0c = r0
        L_0x012f:
            r1 = 24
            r0 = 15
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0P = r0
            r1 = 25
            boolean r0 = r6.getBoolean(r1, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0U = r0
            r1 = 20
            boolean r0 = r6.getBoolean(r1, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0M = r0
            r6.recycle()
            return
        L_0x0159:
            boolean r0 = r8 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x0166
            int r0 = r6.getInt(r1, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0107
        L_0x0166:
            boolean r0 = r8 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0182
            java.lang.CharSequence[] r3 = r6.getTextArray(r1)
            java.util.HashSet r7 = X.C36441kJ.A16()
            int r2 = r3.length
            r1 = 0
        L_0x0174:
            if (r1 >= r2) goto L_0x0107
            r0 = r3[r1]
            java.lang.String r0 = r0.toString()
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x0174
        L_0x0182:
            boolean r0 = r8 instanceof androidx.preference.ListPreference
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8 instanceof androidx.preference.EditTextPreference
            if (r0 != 0) goto L_0x018d
            r7 = 0
            goto L_0x0107
        L_0x018d:
            java.lang.String r7 = r6.getString(r1)
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }
}
