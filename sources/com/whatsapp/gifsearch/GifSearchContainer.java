package com.whatsapp.gifsearch;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0UE;
import X.AnonymousClass1GZ;
import X.AnonymousClass1N2;
import X.AnonymousClass2MC;
import X.AnonymousClass2NV;
import X.AnonymousClass2UU;
import X.AnonymousClass3J6;
import X.AnonymousClass3L7;
import X.AnonymousClass3Y2;
import X.AnonymousClass4O7;
import X.AnonymousClass4WJ;
import X.AnonymousClass67Z;
import X.C012005e;
import X.C02910Cj;
import X.C18820ts;
import X.C19420v0;
import X.C19890wg;
import X.C21010yW;
import X.C21060yb;
import X.C33541fX;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C38411om;
import X.C48742hy;
import X.C66803Xj;
import X.C80243v5;
import X.C87794Qe;
import X.C89124Vi;
import X.C89144Vk;
import X.C89384Wi;
import X.C96174mu;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class GifSearchContainer extends C38411om {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public WaEditText A06;
    public C21060yb A07;
    public C19420v0 A08;
    public C18820ts A09;
    public AnonymousClass3J6 A0A;
    public C21010yW A0B;
    public AnonymousClass1GZ A0C;
    public C96174mu A0D;
    public AnonymousClass4O7 A0E;
    public AnonymousClass3L7 A0F;
    public C87794Qe A0G;
    public C19890wg A0H;
    public AnonymousClass1N2 A0I;
    public CharSequence A0J;
    public String A0K;
    public RecyclerView A0L;
    public boolean A0M;
    public final Runnable A0N = C80243v5.A00(this, 34);
    public final C02910Cj A0O = new C89124Vi(this);
    public final AnonymousClass0UE A0P = new C89144Vk(this, 4);
    public final C66803Xj A0Q = new AnonymousClass4WJ(this, 10);
    public final C33541fX A0R = C48742hy.A00(this, 40);
    public final C33541fX A0S = C48742hy.A00(this, 41);
    public final C33541fX A0T = C48742hy.A00(this, 42);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setupSearchContainer$lambda$4$lambda$2(GifSearchContainer gifSearchContainer, View view) {
        AnonymousClass00C.A0D(gifSearchContainer, 0);
        RecyclerView recyclerView = gifSearchContainer.A0L;
        if (recyclerView != null) {
            recyclerView.A0e();
        }
    }

    public final void setGifCache(AnonymousClass1GZ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setImeUtils(AnonymousClass1N2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0I = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0H = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setWamRuntime(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public static final void A00(GifSearchContainer gifSearchContainer, CharSequence charSequence) {
        String str;
        if (gifSearchContainer.A0F != null) {
            int A042 = C36411kG.A04(gifSearchContainer.A03);
            View view = gifSearchContainer.A04;
            if (view != null) {
                view.setVisibility(A042);
            }
            View view2 = gifSearchContainer.A02;
            boolean z = false;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            AnonymousClass67Z r2 = null;
            AnonymousClass3L7 r1 = gifSearchContainer.A0F;
            if (z) {
                if (r1 != null) {
                    r2 = r1.A02();
                }
            } else if (r1 != null) {
                AnonymousClass00C.A0D(charSequence, 0);
                r2 = r1.A06(charSequence, false);
            }
            C96174mu r0 = gifSearchContainer.A0D;
            if (r0 != null) {
                r0.A0L(r2);
            }
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            gifSearchContainer.A0K = str;
        }
    }

    public final void A02(Activity activity, AnonymousClass2MC r6, AnonymousClass3L7 r7, C87794Qe r8) {
        this.A0F = r7;
        this.A0G = r8;
        this.A0A = r6;
        setupViews(activity);
        setVisibility(0);
        int A042 = C36411kG.A04(this.A02);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(A042);
        }
        View view2 = this.A04;
        if (view2 != null) {
            view2.setVisibility(A042);
        }
        View view3 = this.A02;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        AnonymousClass3L7 r3 = this.A0F;
        if (r3 != null) {
            C96174mu r1 = this.A0D;
            if (r1 != null) {
                r1.A0L(r3.A02());
            }
            C21010yW wamRuntime = getWamRuntime();
            AnonymousClass2NV r12 = new AnonymousClass2NV();
            r12.A00 = Integer.valueOf(r3.A04());
            wamRuntime.Bly(r12);
        }
        this.A0K = "";
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            waEditText.setText("");
            waEditText.requestFocus();
            waEditText.A0C(false);
        }
    }

    public final AnonymousClass1GZ getGifCache() {
        AnonymousClass1GZ r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("gifCache");
    }

    public final AnonymousClass1N2 getImeUtils() {
        AnonymousClass1N2 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("imeUtils");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public final C21010yW getWamRuntime() {
        C21010yW r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("wamRuntime");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void setupRecyclerView(ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(viewGroup, R.id.search_result);
        this.A0L = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0v(this.A0P);
            recyclerView.A0t(this.A0O);
            AnonymousClass1GZ gifCache = getGifCache();
            AnonymousClass2UU r2 = new AnonymousClass2UU(getSystemServices(), getWamRuntime(), gifCache, this, this.A0G, getSharedPreferencesFactory());
            this.A0D = r2;
            recyclerView.setAdapter(r2);
        }
    }

    private final void setupSearchContainer(ViewGroup viewGroup) {
        String str;
        this.A03 = C012005e.A02(viewGroup, R.id.no_results);
        this.A04 = C012005e.A02(viewGroup, R.id.retry_panel);
        this.A05 = C012005e.A02(viewGroup, R.id.search_container);
        WaEditText waEditText = (WaEditText) C012005e.A02(viewGroup, R.id.search_bar);
        this.A06 = waEditText;
        if (waEditText != null) {
            waEditText.addTextChangedListener(this.A0Q);
            AnonymousClass3Y2.A00(waEditText, this, 18);
            Resources resources = waEditText.getResources();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass3L7 r0 = this.A0F;
            if (r0 != null) {
                str = r0.A07();
            } else {
                str = null;
            }
            waEditText.setHint(C36411kG.A0w(resources, str, A0L2, 0, R.string.f12nameremoved));
            C89384Wi.A00(waEditText, this, 4);
        }
        View A022 = C012005e.A02(viewGroup, R.id.clear_search_btn);
        this.A01 = A022;
        if (A022 != null) {
            A022.setOnClickListener(this.A0S);
        }
        this.A02 = C012005e.A02(viewGroup, R.id.progress_container);
        ImageView A0L3 = C36341k9.A0L(viewGroup, R.id.back);
        A0L3.setOnClickListener(this.A0R);
        C36321k7.A0L(getContext(), A0L3, getWhatsAppLocale(), R.drawable.ic_back);
        C012005e.A02(viewGroup, R.id.retry_button).setOnClickListener(this.A0T);
    }

    private final void setupViews(Activity activity) {
        if (getChildCount() <= 0) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.f9nameremoved, this, false);
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            setupRecyclerView(viewGroup);
            setupSearchContainer(viewGroup);
            View view = this.A05;
            if (view != null) {
                viewGroup.removeView(view);
                if (this.A00 == 48) {
                    viewGroup.addView(this.A05, 0);
                } else {
                    viewGroup.addView(this.A05, viewGroup.getChildCount());
                }
            }
            addView(viewGroup);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredHeight() != i4 - i2) {
            if (!this.A0M) {
                post(C80243v5.A00(this, 33));
            }
            this.A0M = !this.A0M;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        SharedPreferences A0E2;
        String str;
        if (!isInEditMode()) {
            int size = View.MeasureSpec.getSize(i2);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                getImeUtils();
                if (!AnonymousClass1N2.A00(this)) {
                    C19420v0 waSharedPreferences = getWaSharedPreferences();
                    int i3 = C36431kI.A0H(this).orientation;
                    if (i3 == 1) {
                        A0E2 = C36341k9.A0E(waSharedPreferences);
                        str = "keyboard_height_portrait";
                    } else if (i3 == 2) {
                        A0E2 = C36341k9.A0E(waSharedPreferences);
                        str = "keyboard_height_landscape";
                    }
                    int A012 = C36371kC.A01(A0E2, str);
                    if (A012 > 0) {
                        if (size > A012) {
                            size = A012;
                        }
                        i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setOnActionListener(AnonymousClass4O7 r1) {
        this.A0E = r1;
    }

    public final void setSearchContainerGravity(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }
}
