package com.whatsapp.mentions;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass1K5;
import X.AnonymousClass1K6;
import X.AnonymousClass1NM;
import X.AnonymousClass2H5;
import X.AnonymousClass34G;
import X.AnonymousClass4OJ;
import X.AnonymousClass4R7;
import X.AnonymousClass4R8;
import X.AnonymousClass4R9;
import X.AnonymousClass6PM;
import X.C166277vS;
import X.C18740tg;
import X.C19430v1;
import X.C19460v5;
import X.C19770wU;
import X.C19890wg;
import X.C20760y7;
import X.C21060yb;
import X.C220412q;
import X.C225314u;
import X.C225614x;
import X.C28371Sj;
import X.C33481fQ;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import X.C37301m9;
import X.C37311mA;
import X.C37321mB;
import X.C39781tl;
import X.C49432j6;
import X.C51412nm;
import X.C598835q;
import X.C64483Od;
import X.C65533Sl;
import X.C65713Te;
import X.C66823Xl;
import X.C67723aN;
import X.C69503dd;
import X.C69533dg;
import X.C75753nk;
import X.C80163ux;
import X.C80513vW;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MentionableEntry extends AnonymousClass2H5 implements AnonymousClass4R7, AnonymousClass4R8 {
    public static final String[] A0P = C64483Od.A01;
    public int A00;
    public Bundle A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public C19460v5 A05;
    public AnonymousClass1NM A06;
    public C220412q A07;
    public AnonymousClass17X A08;
    public AnonymousClass11F A09;
    public AnonymousClass4R7 A0A;
    public MentionPickerView A0B;
    public C37311mA A0C;
    public AnonymousClass4R9 A0D;
    public AnonymousClass4OJ A0E;
    public C28371Sj A0F;
    public C19890wg A0G;
    public AnonymousClass005 A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public int A0L;
    public int A0M;
    public final C33481fQ A0N = new C33481fQ();
    public final TextWatcher A0O = new C66823Xl(this);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 != '_') goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.text.Editable r7, com.whatsapp.mentions.MentionableEntry r8) {
        /*
            r0 = 0
            int r3 = r8.A02(r7, r0)
            int r2 = r3 + 1
            int r1 = r8.getSelectionEnd()
            java.lang.Class<X.1mB> r0 = X.C37321mB.class
            java.lang.Object[] r6 = r7.getSpans(r2, r1, r0)
            X.1mB[] r6 = (X.C37321mB[]) r6
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0032
            r4 = 0
            r3 = 0
        L_0x0018:
            r2 = r6[r4]
            int r1 = r7.getSpanEnd(r2)
            if (r1 <= r3) goto L_0x002a
            int r0 = r8.getSelectionEnd()
            if (r1 > r0) goto L_0x002a
            int r3 = r7.getSpanEnd(r2)
        L_0x002a:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0018
            int r3 = r8.A02(r7, r3)
        L_0x0032:
            if (r3 < 0) goto L_0x0047
            r0 = 1
            if (r3 == 0) goto L_0x0051
            int r0 = r3 - r0
            char r1 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            if (r0 != 0) goto L_0x0047
            r0 = 95
            if (r1 != r0) goto L_0x0051
        L_0x0047:
            X.1mA r0 = r8.A0C
            A08(r0, r8)
            r0 = 0
            r8.A09(r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r2 = r7.toString()
            int r1 = r3 + 1
            int r0 = r8.getSelectionEnd()
            java.lang.String r0 = r2.substring(r1, r0)
            r8.A09(r0)
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x0050
            r8.A05(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionableEntry.A06(android.text.Editable, com.whatsapp.mentions.MentionableEntry):void");
    }

    public static int A03(Editable editable, int i) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, editable.getSpans(i, i, C37321mB.class));
        Collections.addAll(linkedList, editable.getSpans(i, i, C37301m9.class));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int spanStart = editable.getSpanStart(next);
            if (next instanceof C37321mB) {
                spanStart--;
            }
            int spanEnd = editable.getSpanEnd(next);
            int i2 = i;
            i = spanEnd;
            if (i2 <= (spanStart + spanEnd) / 2) {
                i = spanStart;
            }
        }
        return i;
    }

    private void A05(Editable editable, int i) {
        int i2 = i + 1;
        if (((C37311mA[]) editable.getSpans(i, i2, C37311mA.class)).length < 1) {
            A08(this.A0C, this);
            C37311mA r1 = new C37311mA(this.A0L, false);
            this.A0C = r1;
            editable.setSpan(r1, i, i2, 33);
        }
    }

    public static void A08(ForegroundColorSpan foregroundColorSpan, MentionableEntry mentionableEntry) {
        if (foregroundColorSpan != null) {
            mentionableEntry.getText().removeSpan(foregroundColorSpan);
        }
    }

    private void A09(String str) {
        if (this.A04 == null) {
            return;
        }
        if (str != null) {
            MentionPickerView mentionPickerView = this.A0B;
            if (mentionPickerView == null) {
                MentionPickerView mentionPickerView2 = (MentionPickerView) C36361kB.A0E(C36351kA.A0C(this), this.A04, R.layout.f9nameremoved);
                this.A0B = mentionPickerView2;
                this.A04.addView(mentionPickerView2);
                if (this.A0J) {
                    this.A01.putBoolean("ARG_INCLUDE_BOT_CONTACTS", ((AnonymousClass1K5) this.A0H.get()).A01(this.A09));
                }
                this.A0B.setup(this, this.A01);
                View view = this.A03;
                if (view != null) {
                    this.A0B.setAnchorWidthView(view);
                }
                View view2 = this.A02;
                if (view2 != null) {
                    this.A0B.A00 = view2;
                }
                mentionPickerView = this.A0B;
                mentionPickerView.A0J = this;
            }
            if (mentionPickerView.A0P) {
                mentionPickerView.A0L.getFilter().filter(str);
            } else {
                mentionPickerView.A0N.Box(new C49432j6(mentionPickerView.A0E, mentionPickerView, mentionPickerView.A0M, str), mentionPickerView.A0I);
            }
            mentionPickerView.A0O = true;
            return;
        }
        MentionPickerView mentionPickerView3 = this.A0B;
        if (mentionPickerView3 != null) {
            mentionPickerView3.A0L.getFilter().filter((CharSequence) null);
            mentionPickerView3.A0O = false;
            mentionPickerView3.A00 = 0;
        }
    }

    public void A0F() {
        removeTextChangedListener(this.A0O);
        setText((String) null);
        setCursorVisible(false);
    }

    public void A0G(ViewGroup viewGroup, AnonymousClass11F r6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = r6;
        addTextChangedListener(this.A0O);
        Context context = getContext();
        Context context2 = getContext();
        int i = R.attr.f4nameremoved;
        int i2 = R.color.f6nameremoved;
        if (z) {
            i = R.attr.f4nameremoved;
            i2 = R.color.f6nameremoved;
        }
        this.A0M = C36351kA.A02(context2, context, i, i2);
        Context context3 = getContext();
        Context context4 = getContext();
        int i3 = R.attr.f4nameremoved;
        int i4 = R.color.f6nameremoved;
        if (z) {
            i3 = R.attr.f4nameremoved;
            i4 = R.color.f6nameremoved;
        }
        this.A0L = C36351kA.A02(context4, context3, i3, i4);
        A06(getText(), this);
        this.A04 = viewGroup;
        Bundle A072 = AnonymousClass001.A07();
        this.A01 = A072;
        A072.putString("ARG_JID", AnonymousClass143.A03(r6));
        this.A01.putBoolean("ARG_IS_DARK_THEME", z);
        this.A01.putBoolean("ARG_HIDE_END_DIVIDER", z2);
        this.A01.putBoolean("ARG_WITH_BACKGROUND", z3);
        this.A0J = z4;
    }

    public void A0H(AnonymousClass34G r13, AnonymousClass141 r14) {
        AnonymousClass11F r4;
        if (r14 != null && (r4 = r14.A0H) != null) {
            Editable text = getText();
            if (!this.A0I) {
                this.A00 = getInputType();
                this.A0I = true;
                setInputType(147457);
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                if (!(selectionStart == -1 || selectionEnd == -1)) {
                    setSelection(selectionStart, selectionEnd);
                }
            }
            C80163ux r10 = new C80163ux(r4, r13.A01);
            C28371Sj r0 = this.A0F;
            C18740tg.A06(r0);
            String A022 = r0.A02(r10);
            int min = Math.min(A02(text, 0), getSelectionStart());
            if (min < 0) {
                min = getSelectionStart();
            }
            int i = min + 1;
            String A0p = AnonymousClass000.A0p("@", A022, AnonymousClass000.A0u());
            A08(this.A0C, this);
            this.A0C = null;
            text.replace(min, getSelectionEnd(), AnonymousClass000.A0q(" ", AnonymousClass000.A0v(A0p)));
            C37311mA r42 = new C37311mA(this.A0L, true);
            text.setSpan(r42, min, i, 33);
            C37321mB r1 = new C37321mB(r42, C65713Te.A00(r10), this.A0M);
            text.setSpan(r1, i, C36441kJ.A09(A022, i), 33);
            setSelection(0);
            setSelection(text.getSpanEnd(r1) + 1);
            A09((String) null);
            if (this.A0I) {
                this.A0I = false;
                setInputType(this.A00);
                int selectionStart2 = getSelectionStart();
                int selectionEnd2 = getSelectionEnd();
                if (!(selectionStart2 == -1 || selectionEnd2 == -1)) {
                    setSelection(selectionStart2, selectionEnd2);
                }
            }
            AnonymousClass4OJ r02 = this.A0E;
            if (r02 != null) {
                C75753nk r03 = (C75753nk) r02;
                C39781tl r2 = r03.A01;
                C69533dg r12 = r03.A00;
                AnonymousClass00C.A0D(r12, 1);
                UserJid botMention = r12.A06.getBotMention();
                if (!AnonymousClass00C.A0J(botMention, r2.A01)) {
                    r2.A01 = botMention;
                    C19770wU r15 = r2.A06;
                    Runnable runnable = r2.A07;
                    r15.Bnx(runnable);
                    r15.Boy(runnable);
                }
            }
        }
    }

    public void BTF(boolean z) {
        int A022;
        this.A0K = z;
        AnonymousClass4R7 r0 = this.A0A;
        if (r0 != null) {
            r0.BTF(z);
        }
        if (!z || (A022 = A02(getEditableText(), 0)) < 0) {
            A08(this.A0C, this);
            this.A0C = null;
            return;
        }
        A05(getEditableText(), A022);
    }

    public void Bap(AnonymousClass34G r12, AnonymousClass141 r13, int i) {
        AnonymousClass34G r8 = r12;
        AnonymousClass141 r7 = r13;
        int i2 = i;
        if (i == 8 || i == 32) {
            C19460v5 r1 = this.A05;
            if (r1.A05() && ((AnonymousClass1K5) r1.A02()).A00()) {
                C225314u A0N2 = C225314u.A0N(getContext());
                if (A0N2 != null) {
                    C80513vW r5 = new C80513vW(this, r7, r8, i2, 17);
                    AnonymousClass1K6 r3 = ((AnonymousClass1K5) this.A05.A02()).A01;
                    AnonymousClass1K6.A00(A0N2, new C69503dd(r5), r3, C51412nm.INVOKE, C36371kC.A0o());
                    return;
                }
                return;
            }
        }
        A0H(r12, r13);
    }

    public UserJid getBotMention() {
        AnonymousClass1K5 r2 = (AnonymousClass1K5) this.A05.A03();
        if (r2 == null || !r2.A00() || !r2.A02.A03()) {
            return null;
        }
        return r2.A00.A01(getMentions());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166277vS r6 = (C166277vS) parcelable;
        super.onRestoreInstanceState(r6.getSuperState());
        String str = r6.A00;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                C18740tg.A06(str2);
                setMentionableText(str2, C65713Te.A03(str));
                setSelection(selectionStart, selectionEnd);
            }
        }
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0K) {
            A09((String) null);
        }
        A08(this.A0C, this);
        this.A0C = null;
        SpannableStringBuilder A0P2 = C36441kJ.A0P(str);
        A07(A0P2, collection, true);
        setText(A0P2);
    }

    public MentionableEntry(Context context) {
        super(context);
    }

    private int A02(Editable editable, int i) {
        int lastIndexOf = editable.toString().substring(i, getSelectionEnd()).lastIndexOf("@");
        for (C37311mA r0 : (C37311mA[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, C37311mA.class)) {
            if (r0.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    private String A04(int i, int i2) {
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i, i2));
        for (C37321mB r3 : (C37321mB[]) newEditable.getSpans(0, newEditable.length(), C37321mB.class)) {
            newEditable.replace(newEditable.getSpanStart(r3) - 1, newEditable.getSpanEnd(r3), r3.A01);
        }
        return newEditable.toString();
    }

    private void A07(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C80163ux r2 = (C80163ux) it.next();
            if (r2 != null) {
                C28371Sj r0 = this.A0F;
                C18740tg.A06(r0);
                String A022 = r0.A02(r2);
                String A002 = C65713Te.A00(r2);
                int indexOf = TextUtils.indexOf(spannableStringBuilder, A002);
                if (indexOf < 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("unable to set mention for ");
                    A0u.append(r2);
                    C36321k7.A1L(spannableStringBuilder, " in ", A0u);
                } else {
                    do {
                        spannableStringBuilder.replace(indexOf, C36441kJ.A09(A002, indexOf), AnonymousClass000.A0p("@", A022, AnonymousClass000.A0u()));
                        if (z) {
                            C37311mA r4 = new C37311mA(this.A0L, true);
                            int i = indexOf + 1;
                            spannableStringBuilder.setSpan(r4, indexOf, i, 33);
                            spannableStringBuilder.setSpan(new C37321mB(r4, A002, this.A0M), i, C36441kJ.A09(A022, i), 33);
                        }
                        indexOf = TextUtils.indexOf(spannableStringBuilder, A002, indexOf + 1);
                    } while (indexOf >= 0);
                }
            }
        }
    }

    public boolean A0I(AnonymousClass11F r3) {
        if (AnonymousClass143.A0G(r3) && (!this.A07.A0P(r3) || this.A00.A0E(3097))) {
            return true;
        }
        C19460v5 r1 = this.A05;
        if (!r1.A05() || !((AnonymousClass1K5) r1.A02()).A02(r3)) {
            return false;
        }
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0N.A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getMentions() {
        /*
            r8 = this;
            java.util.HashSet r7 = X.C36441kJ.A16()
            android.text.Editable r2 = r8.getText()
            int r1 = X.C36381kD.A06(r8)
            java.lang.Class<X.1mB> r0 = X.C37321mB.class
            r6 = 0
            java.lang.Object[] r5 = r2.getSpans(r6, r1, r0)
            X.1mB[] r5 = (X.C37321mB[]) r5
            int r4 = r5.length
        L_0x0016:
            if (r6 >= r4) goto L_0x0064
            r0 = r5[r6]
            java.lang.String r1 = r0.A01
            r0 = 1
            java.lang.String r2 = r1.substring(r0)
            X.17X r1 = r8.A08
            X.11F r0 = r8.A09
            boolean r0 = r1.A0B(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0049
            X.0yC r1 = r8.A00
            r0 = 7439(0x1d0f, float:1.0424E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0049
            X.6Nb r0 = X.C223313w.A01
            X.13w r2 = r0.A01(r2)
        L_0x003c:
            if (r2 == 0) goto L_0x0046
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r3)
            r7.add(r0)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0049:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY     // Catch:{ 0wR -> 0x0050 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C222913s.A00(r2)     // Catch:{ 0wR -> 0x0050 }
            goto L_0x003c
        L_0x0050:
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r2 = r0.A02(r2)
            if (r2 == 0) goto L_0x003c
            X.1Sj r1 = r8.A0F
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r3)
            java.lang.String r3 = r1.A02(r0)
            goto L_0x003c
        L_0x0064:
            java.util.ArrayList r0 = X.C36441kJ.A15(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mentions.MentionableEntry.getMentions():java.util.List");
    }

    public String getStringText() {
        return A04(0, C36381kD.A06(this));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, A0P);
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C67723aN(this));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C18740tg.A06(onSaveInstanceState);
        return new C166277vS(onSaveInstanceState, getStringText(), C65713Te.A01(getMentions()));
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable editableText = getEditableText();
        if (!TextUtils.isEmpty(editableText)) {
            setSelection(A03(editableText, i), A03(editableText, i2));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        int i2;
        CharSequence charSequence;
        C598835q r0;
        int A062 = C36381kD.A06(this);
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            A062 = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        AnonymousClass147 A012 = C65533Sl.A01(this.A09);
        if (i == 16908322) {
            if (A012 != null) {
                C21060yb r02 = this.A02;
                C18740tg.A06(r02);
                ClipboardManager A092 = r02.A09();
                if (A092 == null) {
                    Log.w("mentionableentry/on-text-context-menu-item cm=null");
                } else {
                    ClipData primaryClip = A092.getPrimaryClip();
                    if (!(primaryClip == null || primaryClip.getItemCount() == 0)) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        if (itemAt != null) {
                            charSequence = itemAt.getText();
                        } else {
                            charSequence = "";
                        }
                        SharedPreferences A002 = this.A0G.A00(C19430v1.A0A);
                        String string = A002.getString("copied_message", "");
                        String string2 = A002.getString("copied_message_jids", "");
                        String string3 = A002.getString("copied_message_without_mentions", "");
                        if (!TextUtils.isEmpty(charSequence) && TextUtils.equals(charSequence, string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            ArrayList A032 = C65713Te.A03(string2);
                            AnonymousClass17X r03 = this.A08;
                            C18740tg.A06(r03);
                            C20760y7 A0R = C36381kD.A0R(r03, A012);
                            HashSet A16 = C36441kJ.A16();
                            C225614x it = A0R.iterator();
                            while (it.hasNext()) {
                                A16.add(((AnonymousClass6PM) it.next()).A03);
                            }
                            Iterator it2 = this.A0F.A03(A012).iterator();
                            while (it2.hasNext()) {
                                A16.add(((C80163ux) it2.next()).A00);
                            }
                            if (A032 == null) {
                                r0 = new C598835q(Collections.emptyList(), Collections.emptyList());
                            } else {
                                HashSet A162 = C36441kJ.A16();
                                HashSet A163 = C36441kJ.A16();
                                Iterator it3 = A032.iterator();
                                while (it3.hasNext()) {
                                    C80163ux r1 = (C80163ux) it3.next();
                                    if (A16.contains(r1.A00)) {
                                        A162.add(r1);
                                    } else {
                                        A163.add(r1);
                                    }
                                }
                                r0 = new C598835q(A162, A163);
                            }
                            C18740tg.A06(string3);
                            Collection collection = (Collection) r0.A00;
                            Collection collection2 = (Collection) r0.A01;
                            if (this.A0K) {
                                A09((String) null);
                            }
                            A08(this.A0C, this);
                            this.A0C = null;
                            SpannableStringBuilder A0P2 = C36441kJ.A0P(string3);
                            A07(A0P2, collection, true);
                            if (collection2 != null) {
                                A07(A0P2, collection2, false);
                            }
                            getText().replace(i2, A062, A0P2);
                            return true;
                        }
                    }
                }
            }
        } else if (i == 16908320 || i == 16908321) {
            C36341k9.A0x(C36381kD.A0G(this.A0G, C19430v1.A0A).putString("copied_message_without_mentions", A04(i2, A062)).putString("copied_message", getText().subSequence(i2, A062).toString()), "copied_message_jids", C65713Te.A01(getMentions()));
        }
        return super.onTextContextMenuItem(i);
    }

    public void setText(String str) {
        for (C37321mB r1 : (C37321mB[]) getText().getSpans(0, C36381kD.A06(this), C37321mB.class)) {
            A08(r1.A00, this);
            A08(r1, this);
        }
        A08(this.A0C, this);
        this.A0C = null;
        super.setText(str);
    }

    public void setMentionPickerVisibilityChangeListener(AnonymousClass4R7 r1) {
        this.A0A = r1;
    }

    public void setOnCommitContentListener(AnonymousClass4R9 r1) {
        this.A0D = r1;
    }

    public void setOnMentionInsertedListener(AnonymousClass4OJ r1) {
        this.A0E = r1;
    }

    public MentionableEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
