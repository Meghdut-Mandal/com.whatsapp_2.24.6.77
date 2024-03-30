package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass0EH;
import X.AnonymousClass0HG;
import X.AnonymousClass0HS;
import X.AnonymousClass0WX;
import X.C03320Ec;
import X.C03370Eh;
import X.C11160fp;
import X.C15610nh;
import X.C15620ni;
import X.C16980qW;
import X.C17020qa;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C16980qW {
    public static final AnonymousClass0WX A0o;
    public View.OnKeyListener A00;
    public SearchableInfo A01;
    public Bundle A02;
    public View.OnClickListener A03;
    public View.OnFocusChangeListener A04;
    public C15610nh A05;
    public C17020qa A06;
    public C03370Eh A07;
    public CharSequence A08;
    public CharSequence A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int[] A0E;
    public int[] A0F;
    public int A0G;
    public int A0H;
    public Rect A0I;
    public Rect A0J;
    public TextWatcher A0K;
    public C15620ni A0L;
    public AnonymousClass0EH A0M;
    public CharSequence A0N;
    public Runnable A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View A0X;
    public final View A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final ImageView A0b;
    public final ImageView A0c;
    public final SearchAutoComplete A0d;
    public final Runnable A0e;
    public final WeakHashMap A0f;
    public final View.OnClickListener A0g;
    public final View A0h;
    public final View A0i;
    public final AdapterView.OnItemClickListener A0j;
    public final AdapterView.OnItemSelectedListener A0k;
    public final ImageView A0l;
    public final TextView.OnEditorActionListener A0m;
    public final CharSequence A0n;

    public class SearchAutoComplete extends C03320Ec {
        public SearchView A00;
        public boolean A01;
        public int A02;
        public final Runnable A03;

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A00.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            AnonymousClass0WX r0 = SearchView.A0o;
            AnonymousClass0WX.A00();
            Method method = r0.A02;
            if (method != null) {
                try {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1N(objArr, 0, true);
                    method.invoke(this, objArr);
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            if (this.A02 <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.f4nameremoved);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int getSearchViewTextMinWidthDp() {
            /*
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r3 = r0.getConfiguration()
                int r2 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r0 = 960(0x3c0, float:1.345E-42)
                if (r2 < r0) goto L_0x001e
                r0 = 720(0x2d0, float:1.009E-42)
                if (r1 < r0) goto L_0x001b
                int r2 = r3.orientation
                r0 = 2
                r1 = 256(0x100, float:3.59E-43)
                if (r2 == r0) goto L_0x001d
            L_0x001b:
                r1 = 192(0xc0, float:2.69E-43)
            L_0x001d:
                return r1
            L_0x001e:
                r0 = 600(0x258, float:8.41E-43)
                r1 = 160(0xa0, float:2.24E-43)
                if (r2 < r0) goto L_0x001d
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.getSearchViewTextMinWidthDp():int");
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A01) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A00;
            SearchView.A04(searchView, searchView.A0K());
            searchView.post(searchView.A0e);
            if (searchView.A0d.hasFocus()) {
                searchView.A0C();
            }
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.A00.hasFocus() && getVisibility() == 0) {
                this.A01 = true;
                Context context = getContext();
                AnonymousClass0WX r0 = SearchView.A0o;
                if (AnonymousClass000.A0U(context).orientation == 2) {
                    A00();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A01 = true;
            }
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A02 = i;
        }

        public void setSearchView(SearchView searchView) {
            this.A00 = searchView;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new C11160fp(this);
            this.A02 = getThreshold();
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }
    }

    public void A0E() {
        A04(this, false);
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A03;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(int r10) {
        /*
            r9 = this;
            r4 = 0
            r7 = 0
            X.0Eh r0 = r9.A07
            android.database.Cursor r5 = r0.A02
            if (r5 == 0) goto L_0x00de
            boolean r0 = r5.moveToPosition(r10)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r8 = X.AnonymousClass0HG.A02(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r8 != 0) goto L_0x0024
            android.app.SearchableInfo r0 = r9.A01     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r8 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x00af }
            if (r8 != 0) goto L_0x0024
            java.lang.String r8 = "android.intent.action.SEARCH"
        L_0x0024:
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = X.AnonymousClass0HG.A02(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r1 != 0) goto L_0x0038
            android.app.SearchableInfo r0 = r9.A01     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x0057
        L_0x0038:
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r2 = X.AnonymousClass0HG.A02(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r2 == 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ RuntimeException -> 0x00af }
            if (r1 != 0) goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r6 = X.AnonymousClass0HG.A02(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r2 = X.AnonymousClass0HG.A02(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ RuntimeException -> 0x00af }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x00af }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x007b
        L_0x0076:
            android.net.Uri r7 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x0057
        L_0x007b:
            if (r7 == 0) goto L_0x0080
            r3.setData(r7)     // Catch:{ RuntimeException -> 0x00af }
        L_0x0080:
            java.lang.CharSequence r1 = r9.A09     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = "user_query"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x00af }
            if (r6 == 0) goto L_0x008e
            java.lang.String r0 = "query"
            r3.putExtra(r0, r6)     // Catch:{ RuntimeException -> 0x00af }
        L_0x008e:
            if (r2 == 0) goto L_0x0095
            java.lang.String r0 = "intent_extra_data_key"
            r3.putExtra(r0, r2)     // Catch:{ RuntimeException -> 0x00af }
        L_0x0095:
            android.os.Bundle r1 = r9.A02     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "app_data"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x00af }
        L_0x009e:
            android.app.SearchableInfo r0 = r9.A01     // Catch:{ RuntimeException -> 0x00af }
            android.content.ComponentName r0 = r0.getSearchActivity()     // Catch:{ RuntimeException -> 0x00af }
            r3.setComponent(r0)     // Catch:{ RuntimeException -> 0x00af }
            android.content.Context r0 = r9.getContext()     // Catch:{ RuntimeException -> 0x00ce }
            r0.startActivity(r3)     // Catch:{ RuntimeException -> 0x00ce }
            goto L_0x00de
        L_0x00af:
            r3 = move-exception
            int r2 = r5.getPosition()     // Catch:{ RuntimeException -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
            r2 = -1
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Search suggestions cursor at row "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " returned exception."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.w(r0, r1, r3)
            goto L_0x00de
        L_0x00ce:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed launch activity: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r3, r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.e(r0, r1, r2)
        L_0x00de:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r9.A0d
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A0L(int):boolean");
    }

    public void clearFocus() {
        this.A0P = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0P = false;
    }

    static {
        AnonymousClass0WX r0;
        if (Build.VERSION.SDK_INT < 29) {
            r0 = new AnonymousClass0WX();
        } else {
            r0 = null;
        }
        A0o = r0;
    }

    public static void A01(SearchView searchView) {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(searchView.A0d.getText());
        int i = 0;
        if (!z2 && (!searchView.A0A || searchView.A0Q)) {
            z = false;
        }
        ImageView imageView = searchView.A0Z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = View.ENABLED_STATE_SET;
            } else {
                iArr = View.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public static void A02(SearchView searchView) {
        int i;
        if ((searchView.A0C || searchView.A0D) && !searchView.A0K() && (searchView.A0a.getVisibility() == 0 || searchView.A0c.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        searchView.A0i.setVisibility(i);
    }

    public static void A03(SearchView searchView, boolean z) {
        int i;
        if (!searchView.A0C || searchView.A0K() || !searchView.hasFocus() || (!z && searchView.A0D)) {
            i = 8;
        } else {
            i = 0;
        }
        searchView.A0a.setVisibility(i);
    }

    public static void A04(SearchView searchView, boolean z) {
        searchView.A0R = z;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        boolean z2 = !TextUtils.isEmpty(searchView.A0d.getText());
        searchView.A0b.setVisibility(i2);
        A03(searchView, z2);
        View view = searchView.A0h;
        int i3 = 0;
        if (z) {
            i3 = 8;
        }
        view.setVisibility(i3);
        ImageView imageView = searchView.A0l;
        if (imageView.getDrawable() == null || searchView.A0A) {
            i = 8;
        }
        imageView.setVisibility(i);
        A01(searchView);
        boolean z3 = !z2;
        int i4 = 8;
        if (searchView.A0D && !searchView.A0K() && z3) {
            searchView.A0a.setVisibility(8);
            i4 = 0;
        }
        searchView.A0c.setVisibility(i4);
        A02(searchView);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void A0B() {
        int[] iArr;
        if (this.A0d.hasFocus()) {
            iArr = View.FOCUSED_STATE_SET;
        } else {
            iArr = View.EMPTY_STATE_SET;
        }
        Drawable background = this.A0Y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0i.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void A0C() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0d.refreshAutoCompleteResults();
            return;
        }
        AnonymousClass0WX r3 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0d;
        AnonymousClass0WX.A00();
        Method method = r3.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        AnonymousClass0WX.A00();
        Method method2 = r3.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void A0D() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A0A && this.A05 == null) {
            clearFocus();
            A04(this, true);
        }
    }

    public void A0F() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C17020qa r1 = this.A06;
            if (r1 == null || !r1.Be2(text.toString())) {
                if (this.A01 != null) {
                    A0J(text.toString());
                }
                searchAutoComplete.setImeVisibility(false);
                searchAutoComplete.dismissDropDown();
            }
        }
    }

    public void A0G(int i) {
        CharSequence B3g;
        Editable text = this.A0d.getText();
        Cursor cursor = this.A07.A02;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i) || (B3g = this.A07.B3g(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(B3g);
        }
    }

    public void A0I(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A09 = charSequence;
        }
    }

    public void A0J(String str) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("user_query", this.A09);
        if (str != null) {
            intent.putExtra("query", str);
        }
        Bundle bundle = this.A02;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A01.getSearchActivity());
        getContext().startActivity(intent);
    }

    public int getImeOptions() {
        return this.A0d.getImeOptions();
    }

    public int getInputType() {
        return this.A0d.getInputType();
    }

    public CharSequence getQuery() {
        return this.A0d.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0N;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A01;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.A0n;
        }
        return getContext().getText(this.A01.getHintId());
    }

    public void onActionViewCollapsed() {
        A0I("");
        clearFocus();
        A04(this, true);
        this.A0d.setImeOptions(this.A0G);
        this.A0Q = false;
    }

    public void onActionViewExpanded() {
        if (!this.A0Q) {
            this.A0Q = true;
            SearchAutoComplete searchAutoComplete = this.A0d;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A0G = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            A0E();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0e);
        post(this.A0O);
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0HS)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HS r2 = (AnonymousClass0HS) parcelable;
        super.onRestoreInstanceState(r2.A00);
        A04(this, r2.A00);
        requestLayout();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.A0P || !isFocusable()) {
            return false;
        }
        if (A0K()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.A0d.requestFocus(i, rect);
        if (requestFocus) {
            A04(this, false);
        }
        return requestFocus;
    }

    public void setIconified(boolean z) {
        if (z) {
            A0D();
        } else {
            A0E();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            A04(this, z);
            A00();
        }
    }

    public void setImeOptions(int i) {
        this.A0d.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0d.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A0H = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0N = charSequence;
        A00();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0B = z;
        C03370Eh r1 = this.A07;
        if (r1 instanceof AnonymousClass0HG) {
            AnonymousClass0HG r12 = (AnonymousClass0HG) r1;
            int i = 1;
            if (z) {
                i = 2;
            }
            r12.A02 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A01 = searchableInfo;
        if (searchableInfo != null) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.A01.getImeOptions());
            int inputType = this.A01.getInputType();
            int i = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.A01.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            C03370Eh r1 = this.A07;
            if (r1 != null) {
                r1.B2b((Cursor) null);
            }
            if (this.A01.getSuggestAuthority() != null) {
                AnonymousClass0HG r0 = new AnonymousClass0HG(this.A01, getContext(), this, this.A0f);
                this.A07 = r0;
                searchAutoComplete.setAdapter(r0);
                AnonymousClass0HG r12 = (AnonymousClass0HG) this.A07;
                if (this.A0B) {
                    i = 2;
                }
                r12.A02 = i;
            }
            A00();
        }
        SearchableInfo searchableInfo2 = this.A01;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A01.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A01.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                z = true;
            }
        }
        this.A0D = z;
        if (z) {
            this.A0d.setPrivateImeOptions("nm");
        }
        A04(this, A0K());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0C = z;
        A04(this, A0K());
    }

    public void setSuggestionsAdapter(C03370Eh r2) {
        this.A07 = r2;
        this.A0d.setAdapter(r2);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A00() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A0A && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            Rect rect = this.A0I;
            int[] iArr = this.A0E;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0F;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            Rect rect2 = this.A0J;
            rect2.set(rect.left, 0, rect.right, i4 - i2);
            AnonymousClass0EH r2 = this.A0M;
            if (r2 == null) {
                AnonymousClass0EH r0 = new AnonymousClass0EH(rect2, rect, searchAutoComplete);
                this.A0M = r0;
                setTouchDelegate(r0);
                return;
            }
            r2.A04.set(rect2);
            Rect rect3 = r2.A03;
            rect3.set(rect2);
            int i7 = -r2.A01;
            rect3.inset(i7, i7);
            r2.A02.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A0K()
            if (r0 != 0) goto L_0x0038
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x004e
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0020
            int r0 = r5.A0H
            if (r0 <= 0) goto L_0x0020
        L_0x001c:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0020:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L_0x003c
            if (r0 != 0) goto L_0x0030
            int r1 = r5.getPreferredHeight()
        L_0x0030:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L_0x0038:
            super.onMeasure(r6, r7)
            return
        L_0x003c:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L_0x0030
        L_0x0045:
            int r4 = r5.A0H
            if (r4 > 0) goto L_0x0020
            int r4 = r5.getPreferredWidth()
            goto L_0x0020
        L_0x004e:
            int r0 = r5.A0H
            if (r0 > 0) goto L_0x001c
            int r0 = r5.getPreferredWidth()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0HS r1 = new AnonymousClass0HS(super.onSaveInstanceState());
        r1.A00 = A0K();
        return r1;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.A0e);
    }

    public void A0H(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.A02 = bundle;
    }

    public void setOnCloseListener(C15610nh r1) {
        this.A05 = r1;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A04 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C17020qa r1) {
        this.A06 = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    public void setOnSuggestionListener(C15620ni r1) {
        this.A0L = r1;
    }

    public boolean A0K() {
        return this.A0R;
    }

    public int getMaxWidth() {
        return this.A0H;
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public C03370Eh getSuggestionsAdapter() {
        return this.A07;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r11 = r19
            r2 = r20
            r3 = r21
            r1 = r22
            r11.<init>(r2, r3, r1)
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r11.A0I = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r11.A0J = r0
            r4 = 2
            int[] r0 = new int[r4]
            r11.A0E = r0
            int[] r0 = new int[r4]
            r11.A0F = r0
            X.0fn r0 = new X.0fn
            r0.<init>(r11)
            r11.A0e = r0
            X.0fo r0 = new X.0fo
            r0.<init>(r11)
            r11.A0O = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r11.A0f = r0
            r10 = 1
            X.0t0 r12 = new X.0t0
            r12.<init>(r11, r10)
            r11.A0g = r12
            X.0bl r0 = new X.0bl
            r0.<init>(r11)
            r11.A00 = r0
            X.0cA r18 = new X.0cA
            r0 = r18
            r0.<init>(r11)
            r11.A0m = r0
            X.0c5 r13 = new X.0c5
            r13.<init>(r11)
            r11.A0j = r13
            X.0tT r9 = new X.0tT
            r9.<init>(r11, r10)
            r11.A0k = r9
            X.0bW r0 = new X.0bW
            r0.<init>(r11)
            r11.A0K = r0
            int[] r0 = X.AnonymousClass1MJ.A0J
            r8 = 0
            X.04j r14 = X.C010404j.A00(r2, r3, r0, r1, r8)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 17
            r0 = 2131623961(0x7f0e0019, float:1.8875088E38)
            android.content.res.TypedArray r7 = r14.A02
            int r0 = r7.getResourceId(r1, r0)
            r2.inflate(r0, r11, r10)
            r0 = 2131433672(0x7f0b18c8, float:1.8489136E38)
            android.view.View r6 = r11.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r6
            r11.A0d = r6
            r6.A00 = r11
            r0 = 2131433601(0x7f0b1881, float:1.8488992E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A0h = r0
            r0 = 2131433653(0x7f0b18b5, float:1.8489098E38)
            android.view.View r17 = r11.findViewById(r0)
            r0 = r17
            r11.A0Y = r0
            r0 = 2131434449(0x7f0b1bd1, float:1.8490712E38)
            android.view.View r16 = r11.findViewById(r0)
            r0 = r16
            r11.A0i = r0
            r0 = 2131433582(0x7f0b186e, float:1.8488954E38)
            android.view.View r15 = r11.findViewById(r0)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r11.A0b = r15
            r0 = 2131433610(0x7f0b188a, float:1.848901E38)
            android.view.View r5 = r11.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r11.A0a = r5
            r0 = 2131433591(0x7f0b1877, float:1.8488972E38)
            android.view.View r4 = r11.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r11.A0Z = r4
            r0 = 2131433693(0x7f0b18dd, float:1.8489179E38)
            android.view.View r3 = r11.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r11.A0c = r3
            r0 = 2131433625(0x7f0b1899, float:1.848904E38)
            android.view.View r2 = r11.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r11.A0l = r2
            r0 = 18
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r1 = r0
            r0 = r17
            X.C011504z.A04(r1, r0)
            r0 = 23
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r1 = r0
            r0 = r16
            X.C011504z.A04(r1, r0)
            r1 = 21
            android.graphics.drawable.Drawable r0 = r14.A02(r1)
            r15.setImageDrawable(r0)
            r0 = 13
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r5.setImageDrawable(r0)
            r0 = 10
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r4.setImageDrawable(r0)
            r0 = 26
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r3.setImageDrawable(r0)
            android.graphics.drawable.Drawable r0 = r14.A02(r1)
            r2.setImageDrawable(r0)
            r0 = 20
            android.graphics.drawable.Drawable r0 = r14.A02(r0)
            r11.A0W = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131896266(0x7f1227ca, float:1.9427388E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass08F.A00(r15, r0)
            r1 = 24
            r0 = 2131623960(0x7f0e0018, float:1.8875086E38)
            int r0 = r7.getResourceId(r1, r0)
            r11.A0T = r0
            r0 = 11
            int r0 = r7.getResourceId(r0, r8)
            r11.A0S = r0
            r15.setOnClickListener(r12)
            r4.setOnClickListener(r12)
            r5.setOnClickListener(r12)
            r3.setOnClickListener(r12)
            r6.setOnClickListener(r12)
            android.text.TextWatcher r0 = r11.A0K
            r6.addTextChangedListener(r0)
            r0 = r18
            r6.setOnEditorActionListener(r0)
            r6.setOnItemClickListener(r13)
            r6.setOnItemSelectedListener(r9)
            android.view.View$OnKeyListener r0 = r11.A00
            r6.setOnKeyListener(r0)
            X.0bk r0 = new X.0bk
            r0.<init>(r11)
            r6.setOnFocusChangeListener(r0)
            r0 = 16
            boolean r0 = r7.getBoolean(r0, r10)
            r11.setIconifiedByDefault(r0)
            r1 = -1
            r0 = 2
            int r0 = r7.getDimensionPixelSize(r0, r1)
            if (r0 == r1) goto L_0x018a
            r11.setMaxWidth(r0)
        L_0x018a:
            r0 = 12
            java.lang.CharSequence r0 = r7.getText(r0)
            r11.A0n = r0
            r0 = 19
            java.lang.CharSequence r0 = r7.getText(r0)
            r11.A0N = r0
            r0 = 6
            int r0 = r7.getInt(r0, r1)
            if (r0 == r1) goto L_0x01a4
            r11.setImeOptions(r0)
        L_0x01a4:
            r0 = 5
            int r0 = r7.getInt(r0, r1)
            if (r0 == r1) goto L_0x01ae
            r11.setInputType(r0)
        L_0x01ae:
            boolean r0 = r7.getBoolean(r10, r10)
            r11.setFocusable(r0)
            r7.recycle()
            java.lang.String r0 = "android.speech.action.WEB_SEARCH"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r11.A0V = r3
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r11.A0U = r0
            r0.addFlags(r2)
            int r0 = r6.getDropDownAnchor()
            android.view.View r1 = r11.findViewById(r0)
            r11.A0X = r1
            if (r1 == 0) goto L_0x01ed
            X.0sx r0 = new X.0sx
            r0.<init>(r11, r8)
            r1.addOnLayoutChangeListener(r0)
        L_0x01ed:
            boolean r0 = r11.A0A
            A04(r11, r0)
            r11.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }
}
