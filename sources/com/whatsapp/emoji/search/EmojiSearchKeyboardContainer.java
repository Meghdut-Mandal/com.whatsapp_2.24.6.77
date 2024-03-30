package com.whatsapp.emoji.search;

import X.AnonymousClass00C;
import X.AnonymousClass1H2;
import X.AnonymousClass1QZ;
import X.AnonymousClass1XN;
import X.AnonymousClass3ZE;
import X.AnonymousClass4QV;
import X.AnonymousClass4QX;
import X.AnonymousClass4W9;
import X.AnonymousClass4WL;
import X.AnonymousClass6O1;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19890wg;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C41121we;
import X.C48742hy;
import X.C55632uw;
import X.C89124Vi;
import X.C89534Wx;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.R;

public final class EmojiSearchKeyboardContainer extends FrameLayout implements C18700tb {
    public long A00;
    public Activity A01;
    public View A02;
    public View A03;
    public InterceptingEditText A04;
    public C18820ts A05;
    public AnonymousClass6O1 A06;
    public AnonymousClass1XN A07;
    public AnonymousClass1H2 A08;
    public C41121we A09;
    public EmojiSearchProvider A0A;
    public AnonymousClass4QX A0B;
    public C19890wg A0C;
    public AnonymousClass1QZ A0D;
    public String A0E;
    public RecyclerView A0F;
    public boolean A0G;
    public boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = 500;
    }

    public final void A03(Activity activity, AnonymousClass1XN r11, AnonymousClass4QV r12, AnonymousClass4QX r13) {
        boolean A1a = C36341k9.A1a(activity, r11);
        this.A01 = activity;
        this.A07 = r11;
        this.A0B = r13;
        if (!this.A0G) {
            this.A0G = A1a;
            activity.getLayoutInflater().inflate(R.layout.f9nameremoved, this, A1a);
            this.A03 = findViewById(R.id.no_results);
            this.A0F = C36441kJ.A0c(this, R.id.search_result);
            int A072 = C36391kE.A07(this);
            RecyclerView recyclerView = this.A0F;
            if (recyclerView != null) {
                recyclerView.A0t(new C89124Vi(A072, 2));
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1f(0);
            RecyclerView recyclerView2 = this.A0F;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            this.A02 = findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) findViewById(R.id.search_bar);
            this.A04 = interceptingEditText;
            if (interceptingEditText != null) {
                interceptingEditText.setHint(R.string.f12nameremoved);
            }
            View findViewById = findViewById(R.id.clear_search_btn);
            C48742hy.A01(findViewById, this, 33);
            setOnTouchListener(AnonymousClass3ZE.A00);
            InterceptingEditText interceptingEditText2 = this.A04;
            if (interceptingEditText2 != null) {
                interceptingEditText2.A00 = new C89534Wx(r12, 1);
                interceptingEditText2.addTextChangedListener(new AnonymousClass4WL(findViewById, this));
            }
            C48742hy.A01(findViewById(R.id.back), r12, 34);
            View findViewById2 = findViewById(R.id.back);
            AnonymousClass00C.A0E(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            C18820ts whatsAppLocale = getWhatsAppLocale();
            C36321k7.A0L(getContext(), (ImageView) findViewById2, whatsAppLocale, R.drawable.ic_emoji_search_back);
        }
        setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        C36331k8.A0y(this.A02);
        Activity activity2 = this.A01;
        if (activity2 == null) {
            throw C36331k8.A0d("activity");
        }
        AnonymousClass4W9 r3 = new AnonymousClass4W9(activity2, getWhatsAppLocale(), getEmojiLoader(), new C55632uw(this, 3), getSharedPreferencesFactory(), this, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1);
        this.A09 = r3;
        RecyclerView recyclerView3 = this.A0F;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(r3);
        }
        this.A0E = "";
        A00(this, "");
        InterceptingEditText interceptingEditText3 = this.A04;
        if (interceptingEditText3 != null) {
            interceptingEditText3.setText("");
            interceptingEditText3.requestFocus();
            interceptingEditText3.A0C(false);
        }
    }

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setEmojiSearchProvider(EmojiSearchProvider emojiSearchProvider) {
        AnonymousClass00C.A0D(emojiSearchProvider, 0);
        this.A0A = emojiSearchProvider;
    }

    public final void setExpressionUserJourneyLogger(AnonymousClass6O1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public void A01() {
        if (!this.A0H) {
            this.A0H = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A08 = C36351kA.A0e(A0W);
            this.A05 = C36341k9.A0T(A0W);
            C18830tt r1 = A0W.A00;
            this.A0A = C36351kA.A0f(r1);
            this.A0C = C36351kA.A0m(A0W);
            this.A06 = C36351kA.A0c(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final EmojiSearchProvider getEmojiSearchProvider() {
        EmojiSearchProvider emojiSearchProvider = this.A0A;
        if (emojiSearchProvider != null) {
            return emojiSearchProvider;
        }
        throw C36331k8.A0d("emojiSearchProvider");
    }

    public final AnonymousClass6O1 getExpressionUserJourneyLogger() {
        AnonymousClass6O1 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("expressionUserJourneyLogger");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public static final void A00(EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, String str) {
        if (emojiSearchKeyboardContainer.getEmojiSearchProvider().A02) {
            C36331k8.A0y(emojiSearchKeyboardContainer.A03);
            C36361kB.A14(emojiSearchKeyboardContainer.A02);
            C41121we r1 = emojiSearchKeyboardContainer.A09;
            if (r1 != null) {
                r1.A0L(emojiSearchKeyboardContainer.getEmojiSearchProvider().A02(str));
            }
            emojiSearchKeyboardContainer.A0E = str;
        }
    }

    public final void A02() {
        if (getVisibility() == 0) {
            setVisibility(8);
            InterceptingEditText interceptingEditText = this.A04;
            if (interceptingEditText != null) {
                interceptingEditText.A0B();
            }
        }
    }

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = 500;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = 500;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A00 = 500;
    }
}
