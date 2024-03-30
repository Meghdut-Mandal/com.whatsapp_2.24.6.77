package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: X.6SX  reason: invalid class name */
public final class AnonymousClass6SX {
    public static final PorterDuffXfermode A0Q = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public BitmapDrawable A00;
    public ImageView.ScaleType A01 = ImageView.ScaleType.CENTER_CROP;
    public C108525Tv A02;
    public AnonymousClass5TY A03;
    public C128246Bm A04;
    public C112005dC A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final Path A09 = C36441kJ.A0M();
    public final Path A0A = C36441kJ.A0M();
    public final Path A0B = C36441kJ.A0M();
    public final Rect A0C = AnonymousClass001.A06();
    public final RectF A0D = C36441kJ.A0N();
    public final RectF A0E = C36441kJ.A0N();
    public final RectF A0F = C36441kJ.A0N();
    public final RectF A0G = C36441kJ.A0N();
    public final RectF A0H = C36441kJ.A0N();
    public final RectF A0I = C36441kJ.A0N();
    public final C18820ts A0J;
    public final C140336lQ A0K;
    public final AnonymousClass00T A0L = C36431kI.A1I(AnonymousClass7QR.A00);
    public final AnonymousClass00T A0M = C36431kI.A1I(AnonymousClass7QS.A00);
    public final AnonymousClass00T A0N = C36431kI.A1I(AnonymousClass7QT.A00);
    public final AnonymousClass00T A0O = C36431kI.A1I(new AnonymousClass7ND(this));
    public final AnonymousClass00T A0P = C36431kI.A1I(new AnonymousClass7NE(this));

    public static final void A00(AnonymousClass6SX r4) {
        AnonymousClass00T r2 = r4.A0P;
        ((Paint) r2.getValue()).setStrokeWidth(r4.A04.A01);
        C112005dC r3 = r4.A05;
        if (r3 instanceof AnonymousClass5QJ) {
            C36381kD.A16(r4.A08, (Paint) r2.getValue(), ((AnonymousClass5QJ) r3).A00.statusColor);
        }
    }

    public AnonymousClass6SX(Context context, C18820ts r4, C140336lQ r5, C108525Tv r6, AnonymousClass5TY r7, boolean z) {
        this.A08 = context;
        this.A0J = r4;
        this.A07 = z;
        this.A03 = r7;
        this.A02 = r6;
        this.A0K = r5;
        this.A04 = AnonymousClass6RA.A02(this.A03).A00(context);
        this.A05 = new AnonymousClass5QJ(AnonymousClass5TU.UNSEEN);
    }
}
