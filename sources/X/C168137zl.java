package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7zl  reason: invalid class name and case insensitive filesystem */
public class C168137zl extends AnonymousClass0CZ implements C22761AvW {
    public Handler A00;
    public Runnable A01 = new AnonymousClass759((Object) this, 13);
    public List A02;
    public List A03;
    public PreferenceGroup A04;
    public List A05;

    private void A01(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A01;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list2.get(i);
            list.add(preference);
            AnonymousClass9U1 r2 = new AnonymousClass9U1(preference);
            List list3 = this.A02;
            if (!list3.contains(r2)) {
                list3.add(r2);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    A01(preferenceGroup2, list);
                }
            }
            preference.A09 = this;
        }
    }

    public long A0E(int i) {
        if (!this.A00) {
            return -1;
        }
        Preference A0L = A0L(i);
        if (A0L instanceof C167887z9) {
            return ((C167887z9) A0L).A00;
        }
        return A0L.A04;
    }

    public int A0J() {
        return this.A03.size();
    }

    public Preference A0L(int i) {
        if (i < 0 || i >= this.A03.size()) {
            return null;
        }
        return (Preference) this.A03.get(i);
    }

    public void A0M() {
        for (Preference preference : this.A05) {
            preference.A09 = null;
        }
        ArrayList A0r = C36361kB.A0r(this.A05);
        this.A05 = A0r;
        PreferenceGroup preferenceGroup = this.A04;
        A01(preferenceGroup, A0r);
        this.A03 = A00(preferenceGroup);
        A06();
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        A0L(i).A0G((AnonymousClass80G) r2);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass9U1 r4 = (AnonymousClass9U1) this.A02.get(i);
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass9BI.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C013105r.A01(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View A0E = C36361kB.A0E(A0C, viewGroup, r4.A01);
        if (A0E.getBackground() == null) {
            C011504z.A04(drawable, A0E);
        }
        ViewGroup A0P = C36411kG.A0P(A0E, 16908312);
        if (A0P != null) {
            int i2 = r4.A02;
            if (i2 != 0) {
                A0C.inflate(i2, A0P);
            } else {
                A0P.setVisibility(8);
            }
        }
        return new AnonymousClass80G(A0E);
    }

    public C168137zl(PreferenceGroup preferenceGroup) {
        this.A04 = preferenceGroup;
        this.A00 = new Handler();
        this.A04.A09 = this;
        this.A05 = AnonymousClass001.A0I();
        this.A03 = AnonymousClass001.A0I();
        this.A02 = AnonymousClass001.A0I();
        A0B(true);
        A0M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A00(androidx.preference.PreferenceGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.List r9 = r11.A01
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x0010:
            if (r7 >= r8) goto L_0x006c
            java.lang.Object r2 = r9.get(r7)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x0030
            int r0 = r11.A00
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r0 == r3) goto L_0x0068
            r1 = 1
            if (r6 < r0) goto L_0x0068
            r5.add(r2)
        L_0x002a:
            boolean r0 = r2 instanceof androidx.preference.PreferenceGroup
            if (r0 != 0) goto L_0x0033
            int r6 = r6 + 1
        L_0x0030:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0033:
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            boolean r0 = r2 instanceof androidx.preference.PreferenceScreen
            if (r0 != 0) goto L_0x0030
            if (r1 == 0) goto L_0x0046
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0046
            java.lang.String r0 = "Nesting an expandable group inside of another expandable group is not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0046:
            java.util.ArrayList r0 = r10.A00(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            int r0 = r11.A00
            if (r0 == r3) goto L_0x0064
            if (r6 < r0) goto L_0x0064
            r5.add(r1)
        L_0x0061:
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0064:
            r4.add(r1)
            goto L_0x0061
        L_0x0068:
            r4.add(r2)
            goto L_0x002a
        L_0x006c:
            int r1 = r11.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0088
            if (r6 <= r1) goto L_0x0088
            android.content.Context r0 = r11.A05
            long r2 = r11.A04
            X.7z9 r1 = new X.7z9
            r1.<init>(r0, r5, r2)
            X.9xR r0 = new X.9xR
            r0.<init>(r11, r10)
            r1.A0B = r0
            r4.add(r1)
        L_0x0088:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168137zl.A00(androidx.preference.PreferenceGroup):java.util.ArrayList");
    }

    public int getItemViewType(int i) {
        AnonymousClass9U1 r3 = new AnonymousClass9U1(A0L(i));
        List list = this.A02;
        int indexOf = list.indexOf(r3);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = list.size();
        list.add(r3);
        return size;
    }
}
