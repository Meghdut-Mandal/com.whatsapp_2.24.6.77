package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.R;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.22Q  reason: invalid class name */
public abstract class AnonymousClass22Q extends AnonymousClass27z {
    public C20810yC A00;
    public boolean A01 = this.A00.A0E(6616);
    public float A02;
    public int A03;
    public TextPaint A04;
    public String A05;
    public String A06;

    public boolean A0E() {
        Editable text;
        if (this instanceof FinalBackspaceAwareEntry) {
            text = FinalBackspaceAwareEntry.A03(getText());
        } else {
            text = getText();
        }
        return TextUtils.isEmpty(text);
    }

    public void setHint(String str) {
        this.A05 = str;
        this.A06 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.A03 = i;
        setRawInputType(180225);
        if (i == 0) {
            i = 1073741824;
        }
        C21060yb r2 = this.A02;
        if (r2 != null && Build.MANUFACTURER.toLowerCase(Locale.US).contains("htc")) {
            C21050ya A0O = r2.A0O();
            if (A0O == null) {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            } else if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A0O.A00, "default_input_method"))) {
                i |= 268435456;
            }
        }
        setImeOptions(i);
    }

    public AnonymousClass22Q(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = this.A03;
        if (i != 0) {
            int i2 = editorInfo.imeOptions;
            int i3 = i2 & 255;
            if ((i & i3) != 0) {
                int i4 = i3 ^ i2;
                editorInfo.imeOptions = i4;
                int i5 = i4 | i;
                editorInfo.imeOptions = i5;
                i2 = i5;
            }
            if ((1073741824 & i2) != 0) {
                editorInfo.imeOptions = i2 & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        String str;
        int paddingLeft;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A04 != null && !TextUtils.isEmpty(this.A06) && A0E()) {
            C18820ts r0 = this.A03;
            if (r0 == null || C36351kA.A1Y(r0)) {
                str = this.A06;
                paddingLeft = getPaddingLeft();
            } else {
                this.A04.setTextAlign(Paint.Align.RIGHT);
                str = this.A06;
                paddingLeft = AnonymousClass000.A0B(this);
            }
            canvas.drawText(str, (float) paddingLeft, ((float) getTotalPaddingTop()) - this.A02, this.A04);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.A05) && A0E()) {
            accessibilityNodeInfo.setText(this.A05);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextPaint textPaint;
        super.onLayout(z, i, i2, i3, i4);
        String str = this.A05;
        if (str != null && (textPaint = this.A04) != null && this.A01) {
            this.A06 = TextUtils.ellipsize(str, textPaint, (float) (i3 - i), TextUtils.TruncateAt.END).toString();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            if (this.A04 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A04 = textPaint;
                C36381kD.A16(getContext(), textPaint, R.color.f6nameremoved);
                this.A04.setTextSize(getTextSize());
                this.A04.setTextAlign(Paint.Align.LEFT);
                TextPaint textPaint2 = this.A04;
                getContext();
                textPaint2.setTypeface(C33511fU.A01());
            }
            if (!this.A01) {
                this.A06 = TextUtils.ellipsize(this.A05, this.A04, (float) C36331k8.A00(this, getMeasuredWidth()), TextUtils.TruncateAt.END).toString();
            }
            this.A02 = this.A04.getFontMetrics().top;
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A05) && A0E()) {
            accessibilityEvent.getText().add(this.A05);
        }
    }

    public AnonymousClass22Q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass22Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
