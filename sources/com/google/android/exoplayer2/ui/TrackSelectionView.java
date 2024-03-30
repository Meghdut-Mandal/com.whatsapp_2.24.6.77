package com.google.android.exoplayer2.ui;

import X.C206989uN;
import X.C36351kA;
import X.C36441kJ;
import X.C66923Xv;
import X.C68343bk;
import X.C86994Nb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrackSelectionView extends LinearLayout {
    public boolean A00;
    public C206989uN A01;
    public C86994Nb A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray A05;
    public final CheckedTextView A06;
    public final CheckedTextView A07;
    public final LayoutInflater A08;
    public final C66923Xv A09;

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    public List getOverrides() {
        SparseArray sparseArray = this.A05;
        ArrayList A14 = C36441kJ.A14(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            A14.add(sparseArray.valueAt(i));
        }
        return A14;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A00();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (!z) {
                SparseArray sparseArray = this.A05;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            A00();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.A07.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    private void A00() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        this.A07.setEnabled(false);
        this.A06.setEnabled(false);
    }

    public boolean getIsDisabled() {
        return this.A00;
    }

    public void setTrackNameProvider(C86994Nb r1) {
        Objects.requireNonNull(r1);
        this.A02 = r1;
        A00();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.A05 = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.A08 = from;
        C66923Xv r3 = new C66923Xv(this, 3);
        this.A09 = r3;
        this.A02 = new C68343bk(getResources());
        this.A01 = C206989uN.A03;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.A07 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.f12nameremoved);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(r3);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.f9nameremoved, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.A06 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.f12nameremoved);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(r3);
        addView(checkedTextView2);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
