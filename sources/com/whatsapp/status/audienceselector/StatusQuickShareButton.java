package com.whatsapp.status.audienceselector;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.C36361kB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

public final class StatusQuickShareButton extends LinearLayout {
    public Button A00 = ((Button) C36361kB.A0F(this, R.id.right_segment_btn));
    public MaterialButton A01 = ((MaterialButton) C36361kB.A0F(this, R.id.left_segment_btn));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusQuickShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public static /* synthetic */ void getLeftSegmentBtn$annotations() {
    }

    public static /* synthetic */ void getRightSegmentBtn$annotations() {
    }

    public final void setLabel(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A01.setText(str);
    }

    public final void setLeftSegmentBtn(MaterialButton materialButton) {
        AnonymousClass00C.A0D(materialButton, 0);
        this.A01 = materialButton;
    }

    public final void setPrimaryOnClickListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A01.setOnClickListener(onClickListener);
    }

    public final void setRightSegmentBtn(Button button) {
        AnonymousClass00C.A0D(button, 0);
        this.A00 = button;
    }

    public final void setSecondaryOnClickListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A00.setOnClickListener(onClickListener);
    }

    public final void setIcon(int i) {
        this.A01.setIcon(AnonymousClass00E.A00(getContext(), i));
    }

    public final MaterialButton getLeftSegmentBtn() {
        return this.A01;
    }

    public final Button getRightSegmentBtn() {
        return this.A00;
    }
}
