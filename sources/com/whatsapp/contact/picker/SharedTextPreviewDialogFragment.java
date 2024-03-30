package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1DU;
import X.AnonymousClass1EM;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1XN;
import X.AnonymousClass1YL;
import X.AnonymousClass22t;
import X.AnonymousClass2g7;
import X.AnonymousClass3J6;
import X.AnonymousClass3UG;
import X.AnonymousClass4ZV;
import X.AnonymousClass4ZX;
import X.AnonymousClass6O1;
import X.AnonymousClass751;
import X.C1261362r;
import X.C145166tS;
import X.C18740tg;
import X.C18750th;
import X.C18820ts;
import X.C19420v0;
import X.C19700wN;
import X.C19770wU;
import X.C19890wg;
import X.C20050ww;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C24801Dv;
import X.C29561Xc;
import X.C29731Xt;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C48912iG;
import X.C54212sa;
import X.C55752v8;
import X.C601536r;
import X.C63983Me;
import X.C64033Mj;
import X.C66943Xx;
import X.C70293ev;
import X.C80273v8;
import X.C88314Sf;
import X.C89234Vt;
import X.C89604Xe;
import X.C89634Xh;
import X.C90104Zc;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;
import java.util.regex.Pattern;

public class SharedTextPreviewDialogFragment extends Hilt_SharedTextPreviewDialogFragment {
    public C24801Dv A00;
    public C19700wN A01;
    public C20050ww A02;
    public C145166tS A03;
    public SharedTextPreviewScrollView A04;
    public C19420v0 A05;
    public AnonymousClass22t A06;
    public AnonymousClass1N0 A07;
    public C1261362r A08;
    public AnonymousClass6O1 A09;
    public AnonymousClass1XN A0A;
    public AnonymousClass1H2 A0B;
    public EmojiSearchProvider A0C;
    public C21010yW A0D;
    public AnonymousClass1DU A0E;
    public AnonymousClass1YL A0F;
    public MentionableEntry A0G;
    public C19890wg A0H;
    public C29561Xc A0I;
    public C29731Xt A0J;
    public AnonymousClass1EM A0K;
    public AnonymousClass1N2 A0L;
    public C19770wU A0M;
    public Runnable A0N = null;
    public String A0O;
    public String A0P;
    public boolean A0Q = false;
    public boolean A0R;
    public boolean A0S = true;
    public View A0T;
    public ImageButton A0U;
    public String A0V;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y = false;
    public final Handler A0Z = C36341k9.A0H();
    public final C88314Sf A0a = new C89604Xe(this, 0);

    public static SharedTextPreviewDialogFragment A03(String str, List list, boolean z, boolean z2, boolean z3) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
        BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putStringArrayList("jids", AnonymousClass143.A07(list));
        baseSharedPreviewDialogFragment.A17(A072);
        Bundle A0b = baseSharedPreviewDialogFragment.A0b();
        A0b.putString("message", str);
        A0b.putBoolean("has_text_from_url", z);
        A0b.putBoolean("fb_share_wa_redirect", z2);
        A0b.putBoolean("disable_post_send_intent", z3);
        sharedTextPreviewDialogFragment.A17(A0b);
        return sharedTextPreviewDialogFragment;
    }

    public static void A05(Editable editable, SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment, boolean z) {
        String A032 = sharedTextPreviewDialogFragment.A0E.A03(editable.toString());
        sharedTextPreviewDialogFragment.A0P = A032;
        if (A032 == null || A032.equals(sharedTextPreviewDialogFragment.A0O)) {
            A06((C145166tS) null, sharedTextPreviewDialogFragment);
            return;
        }
        sharedTextPreviewDialogFragment.A0O = null;
        C145166tS r0 = sharedTextPreviewDialogFragment.A03;
        if (r0 == null || !TextUtils.equals(r0.A0Z, A032)) {
            A06(C64033Mj.A00(A032), sharedTextPreviewDialogFragment);
            if (sharedTextPreviewDialogFragment.A03 == null) {
                Runnable runnable = sharedTextPreviewDialogFragment.A0N;
                if (runnable != null) {
                    sharedTextPreviewDialogFragment.A0Z.removeCallbacks(runnable);
                    sharedTextPreviewDialogFragment.A0N = null;
                }
                if (z) {
                    AnonymousClass17Y r2 = sharedTextPreviewDialogFragment.A05;
                    C19770wU r8 = sharedTextPreviewDialogFragment.A0M;
                    C63983Me.A00(r2, new C145166tS(sharedTextPreviewDialogFragment.A02, sharedTextPreviewDialogFragment.A0E, A032), sharedTextPreviewDialogFragment.A01, sharedTextPreviewDialogFragment.A02, sharedTextPreviewDialogFragment.A0D, new AnonymousClass4ZX(sharedTextPreviewDialogFragment, 0), r8, A032, false);
                    return;
                }
                AnonymousClass751 r3 = new AnonymousClass751(40, A032, sharedTextPreviewDialogFragment);
                sharedTextPreviewDialogFragment.A0N = r3;
                sharedTextPreviewDialogFragment.A0Z.postDelayed(r3, 700);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r5) {
        /*
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r5.A09
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getVisibility()
            r1 = 2131168330(0x7f070c4a, float:1.7950959E38)
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            r1 = 2131168331(0x7f070c4b, float:1.795096E38)
        L_0x0010:
            X.01I r0 = r5.A0i()
            int r3 = X.C36361kB.A02(r0, r1)
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r0 = r0.getPaddingBottom()
            if (r0 == r3) goto L_0x0035
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r4 = r5.A04
            int r2 = r4.getPaddingLeft()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r1 = r0.getPaddingTop()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r0 = r0.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
        L_0x0035:
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A0T
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A03
            r0.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            r0 = r2[r0]
            int r1 = r1 - r0
            if (r1 >= r3) goto L_0x0051
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
        L_0x0051:
            android.widget.ImageButton r0 = r5.A0U
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0)
            r2.bottomMargin = r3
            r0 = 9
            r2.addRule(r0)
            r1 = 8
            r0 = 2131434446(0x7f0b1bce, float:1.8490706E38)
            r2.addRule(r1, r0)
            android.widget.ImageButton r0 = r5.A0U
            r0.setLayoutParams(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A07(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment):void");
    }

    public static void A08(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        ViewGroup viewGroup;
        if (sharedTextPreviewDialogFragment.A09 != null && (viewGroup = sharedTextPreviewDialogFragment.A02) != null && viewGroup.getVisibility() == 0 && !sharedTextPreviewDialogFragment.A0Q) {
            sharedTextPreviewDialogFragment.A0Q = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C36441kJ.A02(sharedTextPreviewDialogFragment.A02));
            translateAnimation.setDuration(150);
            C89234Vt.A00(translateAnimation, sharedTextPreviewDialogFragment, 3);
            sharedTextPreviewDialogFragment.A09.startAnimation(translateAnimation);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        boolean z;
        String replaceFirst;
        super.A1G(bundle, layoutInflater, viewGroup);
        int i = 0;
        this.A0D.addView(C36381kD.A0J(this).inflate(R.layout.f9nameremoved, (ViewGroup) null, false));
        this.A04 = (SharedTextPreviewScrollView) this.A0D.findViewById(R.id.subject_layout);
        this.A0G = (MentionableEntry) this.A0D.findViewById(R.id.mentionable_entry);
        this.A0T = this.A0D.findViewById(R.id.stub);
        C18820ts r0 = this.A01;
        MentionableEntry mentionableEntry = this.A0G;
        if (C36401kF.A1X(r0)) {
            C36341k9.A0z(mentionableEntry, 2, mentionableEntry.getPaddingTop());
        } else {
            C36381kD.A19(mentionableEntry, mentionableEntry.getPaddingLeft(), 2);
        }
        this.A0G.addTextChangedListener(new AnonymousClass2g7(this));
        this.A0G.setInputType(131073);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A00.findViewById(R.id.emoji_edit_text_layout);
        ImageButton imageButton = (ImageButton) this.A0D.findViewById(R.id.emoji_btn);
        this.A0U = imageButton;
        AnonymousClass01I A0h = A0h();
        C20810yC r20 = this.A02;
        AnonymousClass1N2 r19 = this.A0L;
        C19700wN r18 = this.A01;
        AnonymousClass1H2 r17 = this.A0B;
        AnonymousClass1XN r15 = this.A0A;
        C21060yb r14 = this.A08;
        C18820ts r13 = this.A01;
        C1261362r r7 = this.A08;
        EmojiSearchProvider emojiSearchProvider = this.A0C;
        C19420v0 r5 = this.A05;
        C19890wg r4 = this.A0H;
        MentionableEntry mentionableEntry2 = this.A0G;
        Integer A0W2 = C36421kH.A0W();
        List list = this.A0A;
        if (list == null || list.isEmpty()) {
            num = null;
        } else if (list.size() == 1) {
            num = C54212sa.A00((AnonymousClass11F) list.get(0));
        } else {
            num = C36401kF.A0h();
        }
        AnonymousClass1N2 r31 = r19;
        ImageButton imageButton2 = imageButton;
        AnonymousClass22t r152 = new AnonymousClass22t(A0h, imageButton2, r18, keyboardPopupLayout, mentionableEntry2, r14, r5, r13, r7, this.A09, r15, r17, emojiSearchProvider, r20, r4, r31, A0W2, num);
        this.A06 = r152;
        AnonymousClass3J6 r42 = new AnonymousClass3J6(A0h(), r152, this.A0F);
        AnonymousClass3J6.A00(r42, this, 0);
        AnonymousClass22t r3 = this.A06;
        r3.A0H(this.A0a);
        r3.A0F = new C80273v8(this, r42, 21);
        String A032 = this.A0E.A03(this.A0V);
        if (A032 == null || (replaceFirst = this.A0V.replaceFirst(Pattern.quote(A032), "")) == null || !replaceFirst.trim().isEmpty()) {
            z = true;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("\n\n");
            this.A0V = AnonymousClass000.A0q(this.A0V, A0u);
            z = false;
        }
        A1k();
        this.A0G.setText(AnonymousClass3UG.A05(A0h(), this.A0B, this.A0V));
        A05(this.A0G.getText(), this, true);
        this.A0G.requestFocus();
        Window window = this.A02.getWindow();
        C18740tg.A06(window);
        window.setSoftInputMode(5);
        MentionableEntry mentionableEntry3 = this.A0G;
        if (z) {
            i = C36381kD.A06(mentionableEntry3);
        }
        mentionableEntry3.setSelection(i);
        SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A04;
        sharedTextPreviewScrollView.A00 = new C70293ev(this);
        Boolean bool = C18750th.A03;
        C90104Zc.A00(sharedTextPreviewScrollView.getViewTreeObserver(), this, 12);
        C89634Xh.A00(this.A04.getViewTreeObserver(), this, 3);
        this.A04.setOverScrollMode(2);
        C66943Xx.A00(this.A0B, this, 46);
        this.A02.setOnKeyListener(new AnonymousClass4ZV(this, 2));
        A07(this);
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r0.getVisibility() != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A1l() {
        /*
            r7 = this;
            com.whatsapp.mentions.MentionableEntry r0 = r7.A0G
            java.lang.String r6 = X.C36331k8.A0f(r0)
            int r0 = r6.length()
            r4 = 0
            if (r0 != 0) goto L_0x0016
            X.17Y r1 = r7.A05
            r0 = 2131891595(0x7f12158b, float:1.9417914E38)
            r1.A06(r0, r4)
        L_0x0015:
            return
        L_0x0016:
            android.os.Bundle r5 = X.AnonymousClass001.A07()
            boolean r1 = r7.A0X
            java.lang.String r0 = "has_text_from_url"
            r5.putBoolean(r0, r1)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r7.A09
            if (r0 == 0) goto L_0x002c
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.String r0 = "load_preview"
            r5.putBoolean(r0, r1)
            boolean r1 = r7.A0Y
            java.lang.String r0 = "fb_share_wa_redirect"
            r5.putBoolean(r0, r1)
            boolean r1 = r7.A0W
            java.lang.String r0 = "disable_post_send_intent"
            r5.putBoolean(r0, r1)
            java.util.List r1 = r7.A0A
            X.1Xc r0 = r7.A0I
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x006a
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x004e
            X.1Xt r3 = r7.A0J
            r2 = 0
            java.lang.Integer r1 = X.C36431kI.A12()
            java.lang.Integer r0 = X.C36361kB.A0j()
            r3.A0A(r2, r1, r0)
        L_0x006a:
            X.4Pg r1 = r7.A0E
            java.util.List r0 = r7.A0A
            r1.Bpx(r5, r6, r0)
            r7.A1b()
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x0015
            X.01I r0 = r7.A0h()
            r0.finish()
            X.01I r1 = r7.A0h()
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r1.overridePendingTransition(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A1l():void");
    }

    public static void A06(C145166tS r10, SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        TranslateAnimation translateAnimation;
        View view;
        C601536r r0;
        if (sharedTextPreviewDialogFragment.A0h() != null) {
            if (r10 != null) {
                if (!TextUtils.equals(sharedTextPreviewDialogFragment.A0P, r10.A0Z)) {
                    return;
                }
                if (r10.A0I()) {
                    sharedTextPreviewDialogFragment.A03 = r10;
                    if (sharedTextPreviewDialogFragment.A09 == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(sharedTextPreviewDialogFragment.A0i());
                        sharedTextPreviewDialogFragment.A09 = webPagePreviewView;
                        webPagePreviewView.setForeground((Drawable) null);
                        sharedTextPreviewDialogFragment.A09.setMinimumHeight(C36341k9.A0G(sharedTextPreviewDialogFragment).getDimensionPixelSize(R.dimen.f7nameremoved));
                        sharedTextPreviewDialogFragment.A09.setImageContentBackgroundResource(0);
                        sharedTextPreviewDialogFragment.A09.setImageContentEnabled(false);
                        sharedTextPreviewDialogFragment.A02.addView(sharedTextPreviewDialogFragment.A09);
                        sharedTextPreviewDialogFragment.A09.A0F();
                        sharedTextPreviewDialogFragment.A09.setImageProgressBarVisibility(false);
                        sharedTextPreviewDialogFragment.A09.setImageContentMinimumHeight(C36341k9.A0G(sharedTextPreviewDialogFragment).getDimensionPixelSize(R.dimen.f7nameremoved));
                        sharedTextPreviewDialogFragment.A09.setImageCancelClickListener(new C48912iG(sharedTextPreviewDialogFragment, 24));
                        C145166tS r02 = sharedTextPreviewDialogFragment.A03;
                        if (!(r02 == null || (r0 = r02.A05) == null)) {
                            String str = r0.A01;
                            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                sharedTextPreviewDialogFragment.A09.setImageContentEnabled(true);
                            }
                        }
                        sharedTextPreviewDialogFragment.A09.setImageContentClickListener(new C48912iG(sharedTextPreviewDialogFragment, 25));
                    }
                    A07(sharedTextPreviewDialogFragment);
                    if (!(sharedTextPreviewDialogFragment.A02.getVisibility() == 0 || sharedTextPreviewDialogFragment.A09 == null || sharedTextPreviewDialogFragment.A0Q)) {
                        sharedTextPreviewDialogFragment.A0Q = true;
                        int[] iArr = {0, 0};
                        sharedTextPreviewDialogFragment.A0G.getLocationOnScreen(iArr);
                        int A042 = C36431kI.A04(sharedTextPreviewDialogFragment.A0G, iArr[1]);
                        int[] iArr2 = {0, 0};
                        sharedTextPreviewDialogFragment.A00.findViewById(R.id.recipients_container).getLocationOnScreen(iArr2);
                        int i = iArr2[1];
                        int A052 = AnonymousClass000.A05(A042, i);
                        int dimensionPixelSize = C36341k9.A0G(sharedTextPreviewDialogFragment).getDimensionPixelSize(R.dimen.f7nameremoved) - C36341k9.A0G(sharedTextPreviewDialogFragment).getDimensionPixelSize(R.dimen.f7nameremoved);
                        if (A052 > dimensionPixelSize || (i == 0 && A042 == 0)) {
                            sharedTextPreviewDialogFragment.A1k();
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, C36441kJ.A02(sharedTextPreviewDialogFragment.A02), 0.0f);
                            translateAnimation.setDuration(150);
                            translateAnimation.setDuration(150);
                            sharedTextPreviewDialogFragment.A02.setVisibility(0);
                            sharedTextPreviewDialogFragment.A01.setVisibility(0);
                            view = sharedTextPreviewDialogFragment.A09;
                        } else {
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-dimensionPixelSize));
                            translateAnimation.setDuration(150);
                            C89234Vt.A00(translateAnimation, sharedTextPreviewDialogFragment, 2);
                            view = sharedTextPreviewDialogFragment.A04;
                        }
                        view.startAnimation(translateAnimation);
                        sharedTextPreviewDialogFragment.A0Q = false;
                    }
                    sharedTextPreviewDialogFragment.A0G.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = sharedTextPreviewDialogFragment.A09;
                    C18740tg.A04(webPagePreviewView2);
                    webPagePreviewView2.A0M(r10, (List) null, false, sharedTextPreviewDialogFragment.A0K.A01());
                    return;
                }
            }
            sharedTextPreviewDialogFragment.A03 = null;
            A08(sharedTextPreviewDialogFragment);
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 27 && i2 == -1) {
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                this.A00.A06(A0h(), AnonymousClass190.A03(A0h));
                A0h().finish();
            }
            A1b();
        }
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A06.isShowing()) {
                this.A06.dismiss();
            }
            C36431kI.A0N(this).setSoftInputMode(2);
        }
        return super.A1X(menuItem);
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        String string = A0b.getString("message");
        C18740tg.A07(string, "null message");
        this.A0V = string;
        boolean z = A0b.getBoolean("has_text_from_url");
        C18740tg.A07(Boolean.valueOf(z), "null hasTextFromUrl");
        this.A0X = z;
        this.A0Y = A0b.getBoolean("fb_share_wa_redirect");
        this.A0W = A0b.getBoolean("disable_post_send_intent");
        this.A0R = C55752v8.A00(this.A02);
        return super.A1a(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            A0h.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}
