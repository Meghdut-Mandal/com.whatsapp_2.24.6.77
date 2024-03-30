package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gs  reason: invalid class name and case insensitive filesystem */
public final class C34341gs {
    public static final long A08 = TimeUnit.DAYS.toMillis(1);
    public static final long A09 = TimeUnit.SECONDS.toMillis(2);
    public final AnimatorSet A00;
    public final Paint A01 = new Paint(1);
    public final ImageView A02;
    public final AnonymousClass17Y A03;
    public final C19420v0 A04;
    public final C19770wU A05;
    public final BitmapDrawable A06;
    public final C19760wT A07;

    public C34341gs(ImageView imageView, AnonymousClass17Y r16, C19760wT r17, C19420v0 r18, C19770wU r19) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        AnonymousClass17Y r6 = r16;
        AnonymousClass00C.A0D(r6, 1);
        C19770wU r1 = r19;
        AnonymousClass00C.A0D(r1, 2);
        AnonymousClass00C.A0D(imageView, 3);
        C19760wT r3 = r17;
        AnonymousClass00C.A0D(r3, 4);
        C19420v0 r2 = r18;
        AnonymousClass00C.A0D(r2, 5);
        this.A03 = r6;
        this.A05 = r1;
        this.A02 = imageView;
        this.A07 = r3;
        this.A04 = r2;
        Context context = imageView.getContext();
        boolean z = C222013h.A07;
        Drawable A002 = AnonymousClass00E.A00(context, z ? R.drawable.ic_text_status_compose_filled_wds : R.drawable.ic_text_status_compose);
        C18740tg.A06(A002);
        if (A002 instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) A002;
        } else {
            bitmapDrawable = new BitmapDrawable(context.getResources(), AnonymousClass3UF.A00(A002));
        }
        AnonymousClass00C.A08(bitmapDrawable);
        this.A06 = bitmapDrawable;
        Drawable A003 = AnonymousClass00E.A00(context, z ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white);
        C18740tg.A06(A003);
        if (A003 instanceof BitmapDrawable) {
            bitmapDrawable2 = (BitmapDrawable) A003;
        } else {
            bitmapDrawable2 = new BitmapDrawable(context.getResources(), AnonymousClass3UF.A00(A003));
        }
        AnonymousClass00C.A08(bitmapDrawable2);
        PathInterpolator A004 = C017907q.A00(0.3f, 0.0f, 0.25f, 2.0f);
        AnonymousClass00C.A08(A004);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setStartDelay(800);
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(A004);
        ofFloat.addUpdateListener(new C34351gt(bitmapDrawable, bitmapDrawable2, this));
        TimeInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long j = A09;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        if (j > 0) {
            ofFloat2.setStartDelay(j);
        }
        ofFloat2.setDuration(350);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat2.addUpdateListener(new C34351gt(bitmapDrawable2, bitmapDrawable, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
    }

    public final void A00() {
        this.A00.cancel();
        ImageView imageView = this.A02;
        imageView.setImageDrawable(this.A06);
        long currentTimeMillis = System.currentTimeMillis();
        C19420v0 r4 = this.A04;
        AnonymousClass005 r6 = r4.A00;
        if (currentTimeMillis - ((SharedPreferences) r6.get()).getLong("text_to_voice_animation_timestamp", 0) >= A08 && ((SharedPreferences) r6.get()).getInt("text_to_voice_animation_play_times_key", 0) < 10) {
            r4.A1h("text_to_voice_animation_timestamp", System.currentTimeMillis());
            C19420v0.A00(r4).putInt("text_to_voice_animation_play_times_key", ((SharedPreferences) r6.get()).getInt("text_to_voice_animation_play_times_key", 0) + 1);
            imageView.addOnLayoutChangeListener(new AnonymousClass4XW(this, 1));
        }
    }
}
