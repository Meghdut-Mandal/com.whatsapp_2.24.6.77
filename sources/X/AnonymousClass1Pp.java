package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1Pp  reason: invalid class name */
public class AnonymousClass1Pp {
    public final C220412q A00;
    public final C20810yC A01;
    public final AnonymousClass1Po A02;
    public final C27741Pq A03 = new C27741Pq(this);
    public final C19630wG A04;

    public Bitmap A04(AnonymousClass141 r3, float f, int i) {
        Bitmap A012;
        if (f >= 0.0f || f == -2.14748365E9f) {
            A012 = A01(this.A04.A00, this, f, A02(r3), i);
        } else {
            A012 = A03(this.A04.A00, A02(r3));
        }
        if (i != 0) {
            return Bitmap.createScaledBitmap(A012, i, i, true);
        }
        return A012;
    }

    public static int A00(AnonymousClass1Pp r7, AnonymousClass11F r8, boolean z) {
        if (r8 instanceof C177638e7) {
            return R.drawable.avatar_server_psa;
        }
        if (r8 instanceof C177528dw) {
            return R.drawable.avatar_status;
        }
        if (r8 instanceof C177618e5) {
            return R.drawable.avatar_broadcast;
        }
        if (AnonymousClass143.A0G(r8)) {
            C20810yC r6 = r7.A01;
            C21000yV r4 = C21000yV.A02;
            boolean z2 = false;
            if (C20800yB.A01(r4, r6, 982)) {
                C220412q r1 = r7.A00;
                Parcelable.Creator creator = AnonymousClass147.CREATOR;
                if (r1.A05(C65533Sl.A03(r8)) == 1) {
                    return R.drawable.vec_ic_avatar_community;
                }
            }
            if (C20800yB.A01(r4, r6, 982)) {
                C220412q r12 = r7.A00;
                Parcelable.Creator creator2 = AnonymousClass147.CREATOR;
                if (r12.A05(C65533Sl.A03(r8)) == 3) {
                    z2 = true;
                }
            }
            boolean A0S = r7.A00.A0S(r8);
            if (z2) {
                if (C222013h.A05) {
                    return R.drawable.avatar_announcement_experimental;
                }
                return R.drawable.avatar_announcement;
            } else if (A0S) {
                return R.drawable.avatar_linked_general_group;
            } else {
                if (z) {
                    return R.drawable.avatar_group_large_v2;
                }
                return R.drawable.avatar_group;
            }
        } else if (r8 instanceof C28981Uw) {
            return R.drawable.avatar_newsletter;
        } else {
            if (z) {
                return R.drawable.avatar_contact_large_v2;
            }
            return R.drawable.avatar_contact;
        }
    }

    public static Bitmap A01(Context context, AnonymousClass1Pp r9, float f, int i, int i2) {
        Drawable A012;
        if (f == -2.14748365E9f) {
            A012 = C27751Pr.A00(context.getTheme(), context.getResources(), C141716ni.A00, r9.A01, i);
        } else {
            A012 = C013105r.A01(context, i);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        if (A012 != null) {
            Canvas canvas = new Canvas(createBitmap);
            A012.setBounds(0, 0, i2, i2);
            if (A012 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) A012;
                Paint paint = new Paint();
                float f2 = (float) i2;
                RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(AnonymousClass00F.A00(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)));
                if (f >= 0.0f) {
                    canvas.drawRoundRect(rectF, f, f, paint);
                } else {
                    canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF, paint);
            } else {
                A012.draw(canvas);
                return createBitmap;
            }
        }
        return createBitmap;
    }

    public int A02(AnonymousClass141 r3) {
        return A00(this, (AnonymousClass11F) r3.A06(AnonymousClass11F.class), false);
    }

    public Bitmap A03(Context context, int i) {
        Bitmap bitmap;
        AnonymousClass1Po r5 = this.A02;
        C27741Pq r2 = this.A03;
        synchronized (r5) {
            if (AnonymousClass1RC.A0A(context) != r5.A00) {
                r5.A01.clear();
                boolean z = false;
                if (!r5.A00) {
                    z = true;
                }
                r5.A00 = z;
            }
            SparseArray sparseArray = r5.A01;
            bitmap = (Bitmap) sparseArray.get(i);
            if (bitmap == null) {
                bitmap = A01(context, r2.A00, context.getResources().getDimension(R.dimen.f7nameremoved), i, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                sparseArray.put(i, bitmap);
            }
        }
        return bitmap;
    }

    public void A05(ImageView imageView, float f, int i, int i2) {
        if (f == -2.14748365E9f && (imageView instanceof WDSProfilePhoto)) {
            ((WDSProfilePhoto) imageView).setProfilePhotoShape(C108525Tv.SQUIRCLE);
        }
        imageView.setImageBitmap(A01(imageView.getContext(), this, f, i, i2));
    }

    public void A07(ImageView imageView, AnonymousClass141 r4) {
        A06(imageView, A00(this, (AnonymousClass11F) r4.A06(AnonymousClass11F.class), false));
    }

    public AnonymousClass1Pp(AnonymousClass1Po r2, C19630wG r3, C220412q r4, C20810yC r5) {
        this.A01 = r5;
        this.A04 = r3;
        this.A00 = r4;
        this.A02 = r2;
    }

    public void A06(ImageView imageView, int i) {
        imageView.setImageBitmap(A03(imageView.getContext(), i));
    }
}
