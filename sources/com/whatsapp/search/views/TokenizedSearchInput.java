package com.whatsapp.search.views;

import X.AnonymousClass000;
import X.AnonymousClass012;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1QZ;
import X.AnonymousClass688;
import X.AnonymousClass6HJ;
import X.C011705b;
import X.C018107s;
import X.C106335Jg;
import X.C111565cU;
import X.C117805mr;
import X.C123975xO;
import X.C134786bb;
import X.C134826bf;
import X.C18700tb;
import X.C18820ts;
import X.C1901797e;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C36331k8;
import X.C36351kA;
import X.C36441kJ;
import X.C81163wZ;
import X.C90524aI;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.text.FinalBackspaceAwareEntry;

public class TokenizedSearchInput extends LinearLayout implements C18700tb {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public View.OnKeyListener A03;
    public TextView.OnEditorActionListener A04;
    public C011705b A05;
    public AnonymousClass012 A06;
    public Chip A07;
    public AnonymousClass17Y A08;
    public AnonymousClass16D A09;
    public AnonymousClass171 A0A;
    public C21060yb A0B;
    public C18820ts A0C;
    public C20810yC A0D;
    public UserJid A0E;
    public C134826bf A0F;
    public SearchViewModel A0G;
    public C134786bb A0H;
    public AnonymousClass688 A0I;
    public C117805mr A0J;
    public AnonymousClass1QZ A0K;
    public Integer A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Runnable A0Q;
    public Runnable A0R;
    public final View.OnFocusChangeListener A0S;
    public final Chip A0T;
    public final Chip A0U;
    public final Chip A0V;
    public final WaImageButton A0W;
    public final WaImageView A0X;
    public final FinalBackspaceAwareEntry A0Y;
    public final View A0Z;

    public /* synthetic */ void A0E() {
        setFocus(1);
    }

    public /* synthetic */ void A0F() {
        setFocus(2);
    }

    public /* synthetic */ void A0G() {
        setFocus(3);
    }

    public /* synthetic */ void A0H() {
        setFocus(5);
    }

    public /* synthetic */ void A0I() {
        setFocus(0);
    }

    public static void A00(View view, TokenizedSearchInput tokenizedSearchInput) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0G;
        if (searchViewModel != null) {
            if (view == tokenizedSearchInput.A0V) {
                searchViewModel.A0h(0);
            } else if (view == tokenizedSearchInput.A0T) {
                searchViewModel.A0j((UserJid) null);
            } else if (view == tokenizedSearchInput.A0U) {
                searchViewModel.A0n((C134786bb) null);
            } else if (view == tokenizedSearchInput.A07) {
                searchViewModel.A0q(true);
                AnonymousClass688 r0 = tokenizedSearchInput.A0I;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
        tokenizedSearchInput.postDelayed(new C81163wZ((Object) tokenizedSearchInput, 8), 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3.A0F != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.search.views.TokenizedSearchInput r3) {
        /*
            com.whatsapp.WaImageView r2 = r3.A0X
            com.whatsapp.jid.UserJid r0 = r3.A0E
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Integer r0 = r3.A0L
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001f
            X.6bb r0 = r3.A0H
            if (r0 != 0) goto L_0x001f
            X.6bf r1 = r3.A0F
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            com.whatsapp.WaImageButton r1 = r3.A0W
            boolean r0 = r3.A0N
            r1.setEnabled(r0)
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0034
            A04(r3)
            return
        L_0x0034:
            java.lang.Runnable r0 = r3.A0R
            if (r0 == 0) goto L_0x003b
            r3.removeCallbacks(r0)
        L_0x003b:
            java.lang.Runnable r0 = r3.A0Q
            if (r0 == 0) goto L_0x0042
            r3.removeCallbacks(r0)
        L_0x0042:
            r0 = 7
            X.3wZ r2 = new X.3wZ
            r2.<init>((java.lang.Object) r3, (int) r0)
            r3.A0R = r2
            r0 = 50
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A03(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 == 8) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.whatsapp.search.views.TokenizedSearchInput r6) {
        /*
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            if (r0 == 0) goto L_0x003a
            int r0 = r6.A01
            com.whatsapp.WaImageButton r5 = r6.A0W
            if (r0 == 0) goto L_0x0060
            r0 = 2131232839(0x7f080847, float:1.8081799E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131894785(0x7f122201, float:1.9424385E38)
        L_0x0017:
            X.C36331k8.A0q(r1, r5, r0)
            int r4 = r5.getVisibility()
            boolean r0 = r6.A0N
            r3 = 4
            r2 = 8
            if (r0 == 0) goto L_0x0054
            r1 = 0
        L_0x0026:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0030
            r5.setVisibility(r1)
            A05(r6)
        L_0x0030:
            if (r4 != r2) goto L_0x003b
            if (r1 != r2) goto L_0x0045
        L_0x0034:
            r5.setVisibility(r1)
            A05(r6)
        L_0x003a:
            return
        L_0x003b:
            if (r4 == r2) goto L_0x0034
            if (r1 != r2) goto L_0x0034
            r5.setVisibility(r3)
            A05(r6)
        L_0x0045:
            r0 = 14
            X.3wm r2 = new X.3wm
            r2.<init>((java.lang.Object) r6, (int) r1, (int) r0)
            r6.A0Q = r2
            r0 = 50
            r6.postDelayed(r2, r0)
            return
        L_0x0054:
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            boolean r0 = r0.A0s()
            r1 = 8
            if (r0 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0026
        L_0x0060:
            r0 = 2131232837(0x7f080845, float:1.8081795E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131894784(0x7f122200, float:1.9424383E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A04(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3.A0F != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.whatsapp.search.views.TokenizedSearchInput r3) {
        /*
            com.whatsapp.jid.UserJid r0 = r3.A0E
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r3.A0L
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001d
            X.6bb r0 = r3.A0H
            if (r0 != 0) goto L_0x001d
            X.6bf r0 = r3.A0F
            r2 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            com.whatsapp.WaImageView r1 = r3.A0X
            r0 = 0
            if (r2 == 0) goto L_0x0024
            r0 = 4
        L_0x0024:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A05(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    public static void A06(TokenizedSearchInput tokenizedSearchInput) {
        FinalBackspaceAwareEntry finalBackspaceAwareEntry;
        String string;
        if (tokenizedSearchInput.A0E == null || tokenizedSearchInput.A0L.intValue() == 0) {
            finalBackspaceAwareEntry = tokenizedSearchInput.A0Y;
            string = tokenizedSearchInput.getContext().getString(R.string.f12nameremoved);
        } else {
            finalBackspaceAwareEntry = tokenizedSearchInput.A0Y;
            string = "";
        }
        finalBackspaceAwareEntry.setHint(string);
    }

    public static void A07(TokenizedSearchInput tokenizedSearchInput) {
        UserJid userJid = tokenizedSearchInput.A0E;
        Chip chip = tokenizedSearchInput.A0T;
        if (userJid == null) {
            chip.setVisibility(8);
        } else if (chip.getVisibility() == 8) {
            tokenizedSearchInput.A01(chip, C224514j.A00(tokenizedSearchInput.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        } else {
            boolean z = true;
            chip.setChipBackgroundColor(tokenizedSearchInput.A0D(AnonymousClass000.A1S(tokenizedSearchInput.A00, 2)));
            if (tokenizedSearchInput.A00 != 2) {
                z = false;
            }
            tokenizedSearchInput.A0K(chip, z);
        }
    }

    public static void A08(TokenizedSearchInput tokenizedSearchInput) {
        Chip chip = tokenizedSearchInput.A07;
        if (chip != null) {
            C134826bf r0 = tokenizedSearchInput.A0F;
            if (r0 == null) {
                chip.setVisibility(8);
                return;
            }
            tokenizedSearchInput.A02(chip, r0.A04, r0.A02, 5);
            AnonymousClass688 r1 = tokenizedSearchInput.A0I;
            if (r1 != null) {
                r1.A01(tokenizedSearchInput.A0M);
            }
        }
    }

    public static void A09(TokenizedSearchInput tokenizedSearchInput) {
        C134786bb r0 = tokenizedSearchInput.A0H;
        if (r0 == null) {
            tokenizedSearchInput.A0U.setVisibility(8);
        } else {
            tokenizedSearchInput.A02(tokenizedSearchInput.A0U, r0.A02, r0.A00, 3);
        }
    }

    public static void A0A(TokenizedSearchInput tokenizedSearchInput) {
        C20810yC r7 = tokenizedSearchInput.A0D;
        SparseArray A002 = AnonymousClass6HJ.A00(r7);
        int intValue = tokenizedSearchInput.A0L.intValue();
        C123975xO r2 = (C123975xO) A002.get(intValue);
        if (r2 == null || intValue == 98) {
            tokenizedSearchInput.A0V.setVisibility(8);
            return;
        }
        Chip chip = tokenizedSearchInput.A0V;
        C36331k8.A0r(tokenizedSearchInput.getContext(), chip, C224514j.A00(tokenizedSearchInput.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        chip.setText(r2.A05);
        AnonymousClass6HJ.A01(tokenizedSearchInput.getContext(), chip, r7, tokenizedSearchInput.A0L.intValue(), C224514j.A00(tokenizedSearchInput.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        boolean z = false;
        chip.setChipBackgroundColor(tokenizedSearchInput.A0D(AnonymousClass000.A1S(tokenizedSearchInput.A00, 1)));
        if (tokenizedSearchInput.A00 == 1) {
            z = true;
        }
        tokenizedSearchInput.A0K(chip, z);
        if (chip.getVisibility() == 8) {
            tokenizedSearchInput.A01(chip, C224514j.A00(tokenizedSearchInput.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
    }

    public static void A0C(TokenizedSearchInput tokenizedSearchInput, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            tokenizedSearchInput.setFocus(0);
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Y;
            finalBackspaceAwareEntry.requestFocus();
            finalBackspaceAwareEntry.A0C(false);
            return;
        }
        tokenizedSearchInput.setFocus(4);
        tokenizedSearchInput.A0Y.clearFocus();
        tokenizedSearchInput.A0Z.requestFocus();
        InputMethodManager A0N2 = tokenizedSearchInput.A0B.A0N();
        if (A0N2 != null) {
            A0N2.hideSoftInputFromWindow(tokenizedSearchInput.getWindowToken(), 2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4 != 4) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocus(int r4) {
        /*
            r3 = this;
            com.whatsapp.search.SearchViewModel r0 = r3.A0G
            if (r0 == 0) goto L_0x0038
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 != 0) goto L_0x0038
            r2 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 == r2) goto L_0x0039
            r0 = 2
            if (r4 == r0) goto L_0x0039
            r0 = 3
            if (r4 == r0) goto L_0x0039
            r0 = 5
            if (r4 == r0) goto L_0x0039
        L_0x0022:
            r0 = 4
            if (r4 == r0) goto L_0x002a
        L_0x0025:
            com.whatsapp.search.SearchViewModel r0 = r3.A0G
            r0.A0r(r2)
        L_0x002a:
            r3.A00 = r4
            A0A(r3)
            A07(r3)
            A09(r3)
            A08(r3)
        L_0x0038:
            return
        L_0x0039:
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0Y
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L_0x0022
        L_0x0043:
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0Y
            r0.setCursorVisible(r2)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.setFocus(int):void");
    }

    public /* synthetic */ void A0J() {
        SearchViewModel searchViewModel = this.A0G;
        if (searchViewModel != null) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A0Y;
            finalBackspaceAwareEntry.setSelection(searchViewModel.A0b().length());
            finalBackspaceAwareEntry.sendAccessibilityEvent(8);
            setFocus(0);
        }
    }

    public void A0K(Chip chip, boolean z) {
        Context context;
        float f;
        if (z) {
            chip.setChipStrokeColor(ColorStateList.valueOf(C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
            context = getContext();
            f = 1.0f;
        } else {
            chip.setChipStrokeColor((ColorStateList) null);
            context = getContext();
            f = 0.0f;
        }
        chip.setChipStrokeWidth(C90524aI.A01(context, f));
    }

    public void A0L(String str) {
        if (!C1901797e.A00(this.A0M, str)) {
            if (this.A00 != 0 && !TextUtils.isEmpty(str)) {
                setFocus(0);
            }
            this.A0M = str;
            AnonymousClass688 r1 = this.A0I;
            if (r1 == null) {
                return;
            }
            if (str != null && str.length() != 0) {
                r1.A00();
            } else if (r1.A0F.invoke() != null) {
                r1.A01(str);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0K;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00e4, code lost:
        if (r1 == false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TokenizedSearchInput(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x0036
            r0 = 1
            r5.A0O = r0
            java.lang.Object r0 = r5.generatedComponent()
            X.0tq r1 = X.C36391kE.A0W(r0)
            X.0yC r0 = X.C36341k9.A0V(r1)
            r5.A0D = r0
            X.17Y r0 = X.C36351kA.A0M(r1)
            r5.A08 = r0
            X.16D r0 = X.C36341k9.A0R(r1)
            r5.A09 = r0
            X.171 r0 = X.C36341k9.A0S(r1)
            r5.A0A = r0
            X.0ts r0 = X.C36341k9.A0T(r1)
            r5.A0C = r0
            X.0yb r0 = X.C36351kA.A0U(r1)
            r5.A0B = r0
        L_0x0036:
            r3 = 0
            r5.A0P = r3
            java.lang.String r0 = ""
            r5.A0M = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A0L = r0
            r5.A00 = r3
            r5.A01 = r3
            X.5mr r0 = new X.5mr
            r0.<init>(r5)
            r5.A0J = r0
            r1 = 3
            X.7pa r0 = new X.7pa
            r0.<init>(r5, r1)
            r5.A04 = r0
            X.6d3 r0 = new X.6d3
            r0.<init>(r5)
            r5.A03 = r0
            r1 = 40
            X.3Yq r0 = new X.3Yq
            r0.<init>((com.whatsapp.search.views.TokenizedSearchInput) r5, (int) r1)
            r5.A02 = r0
            r1 = 8
            X.7oc r0 = new X.7oc
            r0.<init>(r5, r1)
            r5.A05 = r0
            r1 = 7
            X.7q3 r0 = new X.7q3
            r0.<init>(r5, r1)
            r5.A0S = r0
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r6)
            r5.setOrientation(r3)
            r0 = 16
            r5.setGravity(r0)
            r1 = 2131626095(0x7f0e086f, float:1.8879417E38)
            r0 = 1
            r2.inflate(r1, r5, r0)
            r0 = 2131434918(0x7f0b1da6, float:1.8491663E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r5.A0V = r0
            r0 = 2131428793(0x7f0b05b9, float:1.847924E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r5.A0T = r0
            r0 = 2131434127(0x7f0b1a8f, float:1.849006E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r5.A0U = r0
            X.0yC r0 = r5.A0D
            X.6TR r4 = X.AnonymousClass6YD.A0P
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L_0x00c6
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r5.A07 = r0
        L_0x00c6:
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r3 = X.C012005e.A02(r5, r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            X.0yC r1 = r5.A0D
            r2 = 0
            X.AnonymousClass00C.A0D(r1, r2)
            boolean r0 = r4.A02(r1)
            if (r0 == 0) goto L_0x00e6
            r0 = 7618(0x1dc2, float:1.0675E-41)
            boolean r1 = r1.A0E(r0)
            r0 = 2131626098(0x7f0e0872, float:1.8879423E38)
            if (r1 != 0) goto L_0x00e9
        L_0x00e6:
            r0 = 2131626097(0x7f0e0871, float:1.887942E38)
        L_0x00e9:
            r3.setLayoutResource(r0)
            r3.inflate()
            X.0yC r1 = r5.A0D
            X.AnonymousClass00C.A0D(r1, r2)
            boolean r0 = r4.A02(r1)
            if (r0 == 0) goto L_0x0112
            r0 = 7618(0x1dc2, float:1.0675E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0112
            X.17Y r2 = r5.A08
            r0 = 9
            X.7sq r1 = new X.7sq
            r1.<init>(r5, r0)
            X.688 r0 = new X.688
            r0.<init>(r5, r2, r1)
            r5.A0I = r0
        L_0x0112:
            r0 = 2131433619(0x7f0b1893, float:1.8489029E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = (com.whatsapp.text.FinalBackspaceAwareEntry) r0
            r5.A0Y = r0
            r0 = 2131433590(0x7f0b1876, float:1.848897E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r5, r0)
            r5.A0X = r0
            r0 = 2131430356(0x7f0b0bd4, float:1.848241E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            r5.A0Z = r0
            r0 = 2131430610(0x7f0b0cd2, float:1.8482926E38)
            android.view.View r0 = X.C012005e.A02(r5, r0)
            com.whatsapp.WaImageButton r0 = (com.whatsapp.WaImageButton) r0
            r5.A0W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A01(Chip chip, int i) {
        int color = getResources().getColor(R.color.f6nameremoved);
        int color2 = getResources().getColor(i);
        int A052 = C018107s.A05(color, color2);
        if (this.A0P) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color2));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A052);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet A0C2 = C36441kJ.A0C();
        A0C2.play(ofFloat).with(ofFloat2).with(ofFloat3);
        A0C2.setDuration(100);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, A052, 0);
        AnonymousClass000.A1L(objArr, color2, 1);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        C111565cU.A00(ofObject, chip, 36);
        ofObject.setDuration(100);
        AnimatorSet A0C3 = C36441kJ.A0C();
        A0C3.play(ofObject).after(A0C2);
        A0C3.start();
    }

    private void A02(Chip chip, int i, int i2, int i3) {
        chip.setText(i);
        C36331k8.A0r(getContext(), chip, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C106335Jg.A01(getContext(), chip, i2, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        boolean z = true;
        chip.setChipBackgroundColor(A0D(AnonymousClass000.A1S(this.A00, i3)));
        if (this.A00 != i3) {
            z = false;
        }
        A0K(chip, z);
        if (chip.getVisibility() == 8) {
            A01(chip, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
    }

    public ColorStateList A0D(boolean z) {
        int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        int A023 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        if (!z) {
            A022 = A023;
        }
        return ColorStateList.valueOf(A022);
    }

    public WaImageView getClearButton() {
        return this.A0X;
    }

    public WaImageButton getGridToggle() {
        return this.A0W;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int max = Math.max(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), (int) Math.floor(((double) getWidth()) * 0.3d));
        this.A0V.setMaxWidth(max);
        this.A0T.setMaxWidth(max);
    }

    public void setNoAnimateForTestsOnly(boolean z) {
        this.A0P = z;
    }

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TokenizedSearchInput(Context context) {
        this(context, (AttributeSet) null);
    }
}
