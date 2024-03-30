package com.google.android.material.timepicker;

import X.AnonymousClass6HR;
import X.C162397oW;
import X.C163447qD;
import X.C36401kF;
import X.C36431kI;
import X.C66923Xv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final Chip A01;
    public final Chip A02;
    public final MaterialButtonToggleGroup A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C66923Xv(this, 7);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A04 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.A03 = materialButtonToggleGroup;
        materialButtonToggleGroup.A06.add(new C163447qD(this, 0));
        this.A02 = (Chip) findViewById(R.id.material_minute_tv);
        this.A01 = (Chip) findViewById(R.id.material_hour_tv);
        this.A05 = (ClockHandView) findViewById(R.id.material_clock_hand);
        AnonymousClass6HR r1 = new AnonymousClass6HR(new GestureDetector(getContext(), new C162397oW(this, 0)), this, 0);
        this.A02.setOnTouchListener(r1);
        this.A01.setOnTouchListener(r1);
        Chip chip = this.A02;
        chip.setTag(R.id.selection_type, C36431kI.A12());
        Chip chip2 = this.A01;
        chip2.setTag(R.id.selection_type, C36401kF.A0j());
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
        chip.A06 = "android.view.View";
        chip2.A06 = "android.view.View";
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.A01.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
