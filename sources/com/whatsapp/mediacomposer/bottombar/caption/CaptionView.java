package com.whatsapp.mediacomposer.bottombar.caption;

import X.AnonymousClass11F;
import X.AnonymousClass1N0;
import X.AnonymousClass1QZ;
import X.AnonymousClass4UT;
import X.C135466ck;
import X.C18700tb;
import X.C18820ts;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C28981Uw;
import X.C36441kJ;
import X.C48902iF;
import X.C66763Xf;
import android.content.Context;
import android.graphics.Paint;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

public class CaptionView extends LinearLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1N0 A01;
    public C20810yC A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ImageButton A0A;
    public final LinearLayout A0B;
    public final WaImageButton A0C;
    public final WaImageView A0D;
    public final MentionableEntry A0E;
    public final boolean A0F;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Paint getCaptionPaint() {
        return this.A0E.getPaint();
    }

    public String getCaptionStringText() {
        return this.A0E.getStringText();
    }

    public CharSequence getCaptionText() {
        MentionableEntry mentionableEntry = this.A0E;
        if (TextUtils.isEmpty(mentionableEntry.getText())) {
            return "";
        }
        return mentionableEntry.getText();
    }

    public int getCurrentTextColor() {
        return this.A0E.getCurrentTextColor();
    }

    public List getMentions() {
        return this.A0E.getMentions();
    }

    public void setAddButtonActivated(boolean z) {
        this.A0C.setActivated(z);
    }

    public void setAddButtonClickable(boolean z) {
        this.A0C.setClickable(z);
    }

    public void setAddButtonEnabled(boolean z) {
        this.A0C.setEnabled(z);
    }

    public void setCaptionButtonsListener(AnonymousClass4UT r3) {
        C48902iF.A00(this.A0C, this, r3, 16);
        C135466ck.A00(this.A0D, r3, 16);
    }

    public void setCaptionEditTextView(CharSequence charSequence) {
        MentionableEntry mentionableEntry = this.A0E;
        mentionableEntry.setText(charSequence);
        mentionableEntry.setSelection(charSequence.length(), charSequence.length());
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C66763Xf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
    }

    public void setCaptionText(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public void setNewLineEnabledForNewsletter(AnonymousClass11F r3) {
        if (r3 instanceof C28981Uw) {
            this.A0E.setInputEnterAction(0);
        }
    }

    public void setViewOnceButtonClickable(boolean z) {
        this.A0D.setClickable(z);
    }

    public void setupMentions(AnonymousClass11F r9, ViewGroup viewGroup, View view) {
        MentionableEntry mentionableEntry = this.A0E;
        AnonymousClass11F r3 = r9;
        if (mentionableEntry.A0I(r9)) {
            mentionableEntry.A02 = view;
            mentionableEntry.A0G(viewGroup, r3, true, false, false, false);
        }
    }

    public CaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc.A0o((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    @Deprecated
    public WaEditText getCaptionTextView() {
        return this.A0E;
    }

    public int getCaptionTop() {
        int[] A1O = C36441kJ.A1O();
        this.A0E.getLocationInWindow(A1O);
        return A1O[1];
    }

    @Deprecated
    public ImageButton getEmojiPickerButton() {
        return this.A0A;
    }

    public void setHandleEnterKeyPress(boolean z) {
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0082, code lost:
        if (X.C20800yB.A01(r2, r4.A02, 6004) == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CaptionView(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0015
            r0 = 1
            r4.A05 = r0
            java.lang.Object r0 = r4.generatedComponent()
            X.1Qb r0 = (X.C27851Qb) r0
            X.1Qc r0 = (X.C27861Qc) r0
            X.C27861Qc.A0o(r0, r4)
        L_0x0015:
            android.content.Context r1 = r4.getContext()
            r0 = 2131625467(0x7f0e05fb, float:1.8878143E38)
            android.view.View.inflate(r1, r0, r4)
            r4.A06 = r5
            r0 = 2131428584(0x7f0b04e8, float:1.8478817E38)
            android.view.View r0 = X.C012005e.A02(r4, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r4.A0E = r0
            r0 = 2131431159(0x7f0b0ef7, float:1.848404E38)
            android.widget.LinearLayout r0 = X.C90514aH.A0U(r4, r0)
            r4.A0B = r0
            r0 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r4, r0)
            r4.A0A = r0
            r0 = 2131431160(0x7f0b0ef8, float:1.8484041E38)
            r1 = 2131431160(0x7f0b0ef8, float:1.8484041E38)
            android.view.View r0 = X.C012005e.A02(r4, r0)
            r4.A08 = r0
            r0 = 2131427558(0x7f0b00e6, float:1.8476736E38)
            android.view.View r0 = X.C012005e.A02(r4, r0)
            com.whatsapp.WaImageButton r0 = (com.whatsapp.WaImageButton) r0
            r4.A0C = r0
            android.view.View r0 = X.C012005e.A02(r4, r1)
            r4.A07 = r0
            r0 = 2131435168(0x7f0b1ea0, float:1.849217E38)
            com.whatsapp.WaImageView r3 = X.C36431kI.A0X(r4, r0)
            r4.A0D = r3
            r0 = 2131435169(0x7f0b1ea1, float:1.8492173E38)
            android.view.View r0 = X.C012005e.A02(r4, r0)
            r4.A09 = r0
            X.0yC r1 = r4.A02
            X.0yV r2 = X.C21000yV.A01
            r0 = 4093(0xffd, float:5.736E-42)
            boolean r0 = X.C20800yB.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x0084
            X.0yC r1 = r4.A02
            r0 = 6004(0x1774, float:8.413E-42)
            boolean r1 = X.C20800yB.A01(r2, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            r4.A0F = r0
            X.0yC r1 = r4.A02
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a0
            android.content.res.Resources r2 = r4.getResources()
            r1 = 0
            r0 = 2131234451(0x7f080e93, float:1.8085068E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0BT.A00(r1, r2, r0)
            r3.setImageDrawable(r0)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.bottombar.caption.CaptionView.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
