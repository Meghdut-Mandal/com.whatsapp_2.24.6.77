package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.0Fn  reason: invalid class name */
public class AnonymousClass0Fn extends AnonymousClass0Y5 {
    public Drawable A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = null;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public void A02(AttributeSet attributeSet, int i) {
        super.A02(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = AnonymousClass1MJ.A06;
        C010404j A002 = C010404j.A00(context, attributeSet, iArr, i, 0);
        Context context2 = seekBar.getContext();
        TypedArray typedArray = A002.A02;
        C012005e.A0E(context2, typedArray, attributeSet, seekBar, iArr, i);
        Drawable A032 = A002.A03(0);
        if (A032 != null) {
            seekBar.setThumb(A032);
        }
        Drawable A022 = A002.A02(1);
        AnonymousClass000.A12(this.A00);
        this.A00 = A022;
        if (A022 != null) {
            A022.setCallback(seekBar);
            AnonymousClass08I.A05(AnonymousClass04F.A01(seekBar), A022);
            if (A022.isStateful()) {
                AnonymousClass000.A13(A022, seekBar);
            }
            A00();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A02 = C010504k.A00(this.A02, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A01 = A002.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A00();
    }

    private void A00() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable A012 = AnonymousClass08I.A01(drawable.mutate());
            this.A00 = A012;
            if (this.A03) {
                AnonymousClass076.A01(this.A01, A012);
            }
            if (this.A04) {
                AnonymousClass076.A04(this.A02, this.A00);
            }
            if (this.A00.isStateful()) {
                AnonymousClass000.A13(this.A00, this.A05);
            }
        }
    }

    public AnonymousClass0Fn(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }
}
