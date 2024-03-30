package com.whatsapp.textstatus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass15P;
import X.AnonymousClass1H2;
import X.AnonymousClass1N2;
import X.AnonymousClass1RJ;
import X.AnonymousClass1XN;
import X.AnonymousClass1YZ;
import X.AnonymousClass22t;
import X.AnonymousClass2gA;
import X.AnonymousClass33B;
import X.AnonymousClass33C;
import X.AnonymousClass3J6;
import X.AnonymousClass3UM;
import X.AnonymousClass4Z1;
import X.AnonymousClass6O1;
import X.AnonymousClass737;
import X.C10790fE;
import X.C1261362r;
import X.C1503274v;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19700wN;
import X.C19890wg;
import X.C20810yC;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C39321ri;
import X.C40691vx;
import X.C56492wN;
import X.C594934d;
import X.C63233Jg;
import X.C67103Yn;
import X.C81183wb;
import X.C81203wd;
import X.C88314Sf;
import X.C89374Wh;
import X.C89604Xe;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AddTextStatusActivity extends AnonymousClass155 implements AnonymousClass15P {
    public int A00;
    public WaEditText A01;
    public WaImageButton A02;
    public WaTextView A03;
    public C18820ts A04;
    public AnonymousClass22t A05;
    public C1261362r A06;
    public AnonymousClass6O1 A07;
    public AnonymousClass1XN A08;
    public EmojiSearchProvider A09;
    public AnonymousClass1YZ A0A;
    public C19890wg A0B;
    public C40691vx A0C;
    public WDSButton A0D;
    public String A0E;
    public boolean A0F;
    public String[] A0G;
    public WaTextView A0H;
    public boolean A0I;
    public final C88314Sf A0J;
    public final AnonymousClass33B A0K;
    public final AnonymousClass33C A0L;
    public final List A0M;
    public final TextWatcher A0N;

    public void Bgm(int i, int i2) {
        if (i == 1) {
            WaTextView waTextView = this.A03;
            if (waTextView == null) {
                throw C36331k8.A0d("timerValueView");
            }
            String[] strArr = this.A0G;
            if (strArr == null) {
                throw C36331k8.A0d("durationOptions");
            }
            waTextView.setText(strArr[i2]);
            this.A00 = i2;
        }
    }

    public static final void A01(Drawable drawable, AddTextStatusActivity addTextStatusActivity) {
        C81203wd.A00(addTextStatusActivity.A05, addTextStatusActivity, drawable, 37);
    }

    public static final void A07(AddTextStatusActivity addTextStatusActivity) {
        WaTextView waTextView = addTextStatusActivity.A0H;
        if (waTextView != null) {
            C36391kE.A1K(waTextView);
        }
        C36331k8.A0y(addTextStatusActivity.A0H);
    }

    public void A2F() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A08 = C36351kA.A0d(A0B2);
            this.A0A = (AnonymousClass1YZ) A0B2.ATq.get();
            this.A04 = C36341k9.A0T(A0B2);
            this.A06 = C36371kC.A0b(r1);
            this.A09 = C36351kA.A0f(r1);
            this.A0B = C36351kA.A0m(A0B2);
            this.A07 = C36351kA.A0c(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A01 = (WaEditText) C36361kB.A0H(this, R.id.add_text_status_entry_field);
        setTitle(R.string.f12nameremoved);
        Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.emoji_edit_text_toolbar);
        toolbar.setTitle((int) R.string.f12nameremoved);
        setSupportActionBar(toolbar);
        C36321k7.A0P(this);
        WaEditText waEditText = this.A01;
        if (waEditText == null) {
            throw C36331k8.A0d("textEntry");
        }
        AnonymousClass1H2 r8 = this.A0C;
        C21060yb r5 = this.A08;
        C18820ts r6 = this.A00;
        C19890wg r9 = this.A0B;
        if (r9 != null) {
            int i = 0;
            waEditText.addTextChangedListener(new AnonymousClass2gA(waEditText, C36391kE.A0Q(this, R.id.counter_tv), r5, r6, this.A0B, r8, r9, 60, 50, false, false, false));
            View findViewById = findViewById(R.id.suggestions_list);
            C10790fE r52 = new C10790fE();
            findViewById.setVisibility(8);
            this.A04.Bp1(new AnonymousClass737(this, r52, findViewById, 13));
            String quantityString = getResources().getQuantityString(R.plurals.f10nameremoved, 24, new Object[]{24});
            AnonymousClass00C.A08(quantityString);
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 3, 0);
            String quantityString2 = resources.getQuantityString(R.plurals.f10nameremoved, 3, objArr);
            AnonymousClass00C.A08(quantityString2);
            Resources resources2 = getResources();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, 1, 0);
            String quantityString3 = resources2.getQuantityString(R.plurals.f10nameremoved, 1, objArr2);
            AnonymousClass00C.A08(quantityString3);
            String A0B2 = C36321k7.A0B(getResources(), 2, 0, R.plurals.f10nameremoved);
            AnonymousClass00C.A08(A0B2);
            this.A0G = new String[]{quantityString, quantityString2, quantityString3, A0B2};
            findViewById(R.id.timer_container).setOnClickListener(new C67103Yn((Object) this, 38));
            WaTextView waTextView = (WaTextView) C36361kB.A0H(this, R.id.timer_value);
            this.A03 = waTextView;
            if (waTextView == null) {
                throw C36331k8.A0d("timerValueView");
            }
            String[] strArr = this.A0G;
            if (strArr == null) {
                throw C36331k8.A0d("durationOptions");
            }
            waTextView.setText(strArr[0]);
            this.A02 = (WaImageButton) C36361kB.A0H(this, R.id.add_text_status_emoji_btn);
            C20810yC r31 = this.A0D;
            AnonymousClass1N2 r17 = this.A0C;
            C19700wN r15 = this.A03;
            AnonymousClass1H2 r14 = this.A0C;
            AnonymousClass1XN r13 = this.A08;
            if (r13 != null) {
                C21060yb r12 = this.A08;
                C18820ts r11 = this.A00;
                C1261362r r10 = this.A06;
                if (r10 != null) {
                    EmojiSearchProvider emojiSearchProvider = this.A09;
                    if (emojiSearchProvider != null) {
                        C19420v0 r82 = this.A09;
                        C19890wg r7 = this.A0B;
                        if (r7 != null) {
                            View view = this.A00;
                            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.KeyboardPopupLayout");
                            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) view;
                            WaImageButton waImageButton = this.A02;
                            if (waImageButton == null) {
                                throw C36331k8.A0d("emojiButton");
                            }
                            WaEditText waEditText2 = this.A01;
                            if (waEditText2 == null) {
                                throw C36331k8.A0d("textEntry");
                            }
                            Integer A0o = C36371kC.A0o();
                            AnonymousClass6O1 r3 = this.A07;
                            if (r3 != null) {
                                AnonymousClass22t r172 = new AnonymousClass22t(this, waImageButton, r15, keyboardPopupLayout, waEditText2, r12, r82, r11, r10, r3, r13, r14, emojiSearchProvider, r31, r7, r17, 24, A0o);
                                this.A05 = r172;
                                r172.A09 = new C594934d(true, false);
                                EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) findViewById(R.id.emoji_search_container);
                                AnonymousClass22t r2 = this.A05;
                                if (r2 == null) {
                                    throw C36331k8.A0d("emojiPopup");
                                }
                                AnonymousClass3J6 r53 = new AnonymousClass3J6(this, r2, emojiSearchContainer);
                                r53.A00 = new AnonymousClass4Z1(r53, this, 1);
                                AnonymousClass22t r4 = this.A05;
                                if (r4 == null) {
                                    throw C36331k8.A0d("emojiPopup");
                                }
                                r4.A0H(this.A0J);
                                r4.A0F = new C81203wd(r53, this, 36);
                                C67103Yn.A00(findViewById(R.id.done_btn), this, 37);
                                AnonymousClass1YZ r22 = this.A0A;
                                if (r22 != null) {
                                    C63233Jg A002 = r22.A00();
                                    if (A002 != null) {
                                        String str = A002.A03;
                                        if (str != null) {
                                            WaEditText waEditText3 = this.A01;
                                            if (waEditText3 == null) {
                                                throw C36331k8.A0d("textEntry");
                                            }
                                            waEditText3.setText(str);
                                            WaEditText waEditText4 = this.A01;
                                            if (waEditText4 == null) {
                                                throw C36331k8.A0d("textEntry");
                                            }
                                            waEditText4.setSelection(str.length());
                                        }
                                        String str2 = A002.A02;
                                        if (str2 != null) {
                                            this.A04.Bp1(new C1503274v(30, str2, this));
                                        }
                                        long j = A002.A00;
                                        if (j != -1) {
                                            long millis = A002.A01 + TimeUnit.SECONDS.toMillis(j);
                                            AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.expiration);
                                            TextView textView = (TextView) C36391kE.A0L(A0r, 0);
                                            Object[] A0M2 = AnonymousClass001.A0M();
                                            C18820ts r142 = this.A04;
                                            if (r142 != null) {
                                                A0M2[0] = C36361kB.A0o(r142.A0A(170), C36401kF.A0x(r142), millis);
                                                C18820ts r42 = this.A04;
                                                if (r42 != null) {
                                                    A0M2[1] = AnonymousClass3UM.A00(r42, millis);
                                                    C36341k9.A0s(this, textView, A0M2, R.string.f12nameremoved);
                                                    this.A0H = (WaTextView) A0r.A01();
                                                    WaTextView waTextView2 = this.A03;
                                                    if (waTextView2 == null) {
                                                        throw C36331k8.A0d("timerValueView");
                                                    }
                                                    String[] strArr2 = this.A0G;
                                                    if (strArr2 == null) {
                                                        throw C36331k8.A0d("durationOptions");
                                                    }
                                                    long[] jArr = C56492wN.A00;
                                                    while (true) {
                                                        if (j != jArr[i]) {
                                                            i++;
                                                            if (i >= 4) {
                                                                i = -1;
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                    waTextView2.setText(strArr2[i]);
                                                } else {
                                                    throw C36331k8.A0d("whatsappLocale");
                                                }
                                            } else {
                                                throw C36331k8.A0d("whatsappLocale");
                                            }
                                        }
                                    }
                                    WaEditText waEditText5 = this.A01;
                                    if (waEditText5 == null) {
                                        throw C36331k8.A0d("textEntry");
                                    }
                                    waEditText5.addTextChangedListener(this.A0N);
                                    WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.add_text_status_clear_btn);
                                    this.A0D = wDSButton;
                                    if (wDSButton == null) {
                                        throw C36331k8.A0d("clearButton");
                                    }
                                    C67103Yn.A00(wDSButton, this, 39);
                                    WDSButton wDSButton2 = this.A0D;
                                    if (wDSButton2 == null) {
                                        throw C36331k8.A0d("clearButton");
                                    }
                                    wDSButton2.setEnabled(AnonymousClass000.A1V(A002));
                                    return;
                                }
                                throw C36331k8.A0d("myEvolvedAbout");
                            }
                            throw C36331k8.A0d("expressionUserJourneyLogger");
                        }
                        throw C36331k8.A0d("sharedPreferencesFactory");
                    }
                    throw C36331k8.A0d("emojiSearchProvider");
                }
                throw C36331k8.A0d("emojiTrayLogger");
            }
            throw C36331k8.A0d("recentEmojis");
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public AddTextStatusActivity(int i) {
        this.A0I = false;
        C89374Wh.A00(this, 12);
    }

    public void onStop() {
        super.onStop();
        AnonymousClass22t r0 = this.A05;
        if (r0 == null) {
            throw C36331k8.A0d("emojiPopup");
        }
        if (r0.isShowing()) {
            AnonymousClass22t r02 = this.A05;
            if (r02 == null) {
                throw C36331k8.A0d("emojiPopup");
            }
            r02.dismiss();
        }
        WaEditText waEditText = this.A01;
        if (waEditText == null) {
            throw C36331k8.A0d("textEntry");
        }
        waEditText.removeTextChangedListener(this.A0N);
        this.A04.Boy(C81183wb.A00(this, 18));
    }

    public AddTextStatusActivity() {
        this(0);
        this.A0M = AnonymousClass001.A0I();
        this.A0J = new C89604Xe(this, 13);
        this.A0L = new AnonymousClass33C(this);
        this.A0K = new AnonymousClass33B(this);
        this.A0N = new C39321ri(this, 3);
    }
}
