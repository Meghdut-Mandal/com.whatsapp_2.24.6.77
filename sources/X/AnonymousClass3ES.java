package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.R;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3ES  reason: invalid class name */
public final class AnonymousClass3ES {
    public final Context A00;
    public final View.OnClickListener A01;
    public final View A02;
    public final PopupWindow A03;
    public final C18820ts A04;

    public final boolean A00(PopupWindow.OnDismissListener onDismissListener, InteractiveAnnotation interactiveAnnotation, PhotoView photoView) {
        int i;
        Bitmap photo = photoView.getPhoto();
        if (photo == null) {
            return false;
        }
        float height = (float) photo.getHeight();
        float[] fArr = {(float) photo.getWidth(), height};
        InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotation;
        SerializablePoint[] serializablePointArr = interactiveAnnotation2.polygonVertices;
        SerializablePoint serializablePoint = serializablePointArr[0];
        double d = serializablePoint.x;
        double d2 = (double) fArr[0];
        double d3 = d * d2;
        double d4 = (double) height;
        double d5 = serializablePoint.y * d4;
        SerializablePoint serializablePoint2 = serializablePointArr[1];
        double d6 = serializablePoint2.x * d2;
        double d7 = serializablePoint2.y * d4;
        SerializablePoint serializablePoint3 = serializablePointArr[2];
        double d8 = serializablePoint3.x * d2;
        double d9 = serializablePoint3.y * d4;
        SerializablePoint serializablePoint4 = serializablePointArr[3];
        double d10 = d2 * serializablePoint4.x;
        double d11 = d4 * serializablePoint4.y;
        double d12 = (double) 2;
        double d13 = (d3 + d8) / d12;
        double d14 = (d5 + d9) / d12;
        if (d6 <= d13 && d13 <= d8) {
            double d15 = d6 - d8;
            if (d15 != 0.0d) {
                d14 = d7 - (((d7 - d9) * (d6 - d13)) / d15);
            }
        } else if (d8 <= d13 && d13 <= d10) {
            double d16 = d8 - d10;
            if (d16 != 0.0d) {
                d14 = d9 - (((d9 - d11) * (d8 - d13)) / d16);
            }
        } else if (d10 > d13 || d13 > d3) {
            double d17 = d3 - d6;
            if (d17 != 0.0d) {
                d14 = d5 - (((d5 - d7) * (d3 - d13)) / d17);
            }
        } else {
            double d18 = d10 - d3;
            if (d18 != 0.0d) {
                d14 = d11 - (((d11 - d5) * (d10 - d13)) / d18);
            }
        }
        float[] fArr2 = {(float) d13, (float) d14};
        photoView.getImageMatrix().mapPoints(fArr2);
        fArr2[0] = fArr2[0] + ((float) photoView.getLeft());
        fArr2[1] = fArr2[1] + ((float) photoView.getTop());
        View rootView = photoView.getRootView();
        AnonymousClass00C.A08(rootView);
        int i2 = (int) fArr2[0];
        int i3 = (int) fArr2[1];
        PopupWindow popupWindow = this.A03;
        popupWindow.setHeight(-2);
        popupWindow.setWidth(-2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        popupWindow.setContentView(this.A02);
        TextView A0P = C36391kE.A0P(popupWindow.getContentView(), R.id.tooltip_text);
        Object obj = interactiveAnnotation2.data;
        AnonymousClass00C.A07(obj);
        if (obj instanceof SerializableLocation) {
            A0P.setText(R.string.f12nameremoved);
        } else if (obj instanceof C63393Jw) {
            A0P.setText(R.string.f12nameremoved);
        }
        Drawable A002 = AnonymousClass00E.A00(this.A00, R.drawable.vec_ic_chevron_right_wds);
        C18820ts r2 = this.A04;
        A0P.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new C100744vb(A002, r2), (Drawable) null);
        C33511fU.A03(A0P);
        C36331k8.A0x(popupWindow.getContentView());
        int measuredWidth = i2 - (popupWindow.getContentView().getMeasuredWidth() / 2);
        if (C36401kF.A1X(r2)) {
            if (A002 != null) {
                i = A002.getIntrinsicWidth();
            } else {
                i = 0;
            }
            measuredWidth -= i / 2;
        }
        C48902iF.A00(popupWindow.getContentView(), popupWindow, this, 18);
        popupWindow.setOnDismissListener(onDismissListener);
        popupWindow.setAnimationStyle(R.style.f13nameremoved);
        popupWindow.showAtLocation(rootView, 0, measuredWidth, (int) (((float) i3) - (((float) popupWindow.getContentView().getMeasuredHeight()) * 0.82f)));
        return true;
    }

    public AnonymousClass3ES(Context context, View.OnClickListener onClickListener, ViewGroup viewGroup, C18820ts r6) {
        C36321k7.A11(context, r6, viewGroup);
        this.A00 = context;
        this.A04 = r6;
        this.A01 = onClickListener;
        this.A03 = new PopupWindow(context);
        LayoutInflater layoutInflater = (LayoutInflater) C21060yb.A02(context, "layout_inflater");
        C18740tg.A06(layoutInflater);
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        AnonymousClass00C.A08(A0E);
        this.A02 = A0E;
    }
}
