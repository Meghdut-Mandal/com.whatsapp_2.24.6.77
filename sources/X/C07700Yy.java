package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0Yy  reason: invalid class name and case insensitive filesystem */
public class C07700Yy {
    public int A00;
    public int A01;
    public AnonymousClass0YE A02;
    public Object A03;
    public ArrayList A04 = AnonymousClass001.A0I();
    public boolean A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08;
    public int A09;
    public int A0A = 0;
    public Notification A0B;
    public Notification A0C;
    public PendingIntent A0D;
    public PendingIntent A0E;
    public Context A0F;
    public Bundle A0G;
    public RemoteViews A0H;
    public IconCompat A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public ArrayList A0Q = AnonymousClass001.A0I();
    @Deprecated
    public ArrayList A0R;
    public ArrayList A0S = AnonymousClass001.A0I();
    public boolean A0T;
    public boolean A0U;
    public boolean A0V = false;
    public boolean A0W = true;
    public boolean A0X;
    public boolean A0Y;

    public static AudioAttributes.Builder A01(AudioAttributes.Builder builder) {
        return builder.setContentType(4);
    }

    public static AudioAttributes.Builder A02(AudioAttributes.Builder builder) {
        return builder.setUsage(5);
    }

    public void A0J(boolean z) {
        int i;
        Notification notification = this.A0B;
        int i2 = notification.flags;
        if (z) {
            i = 2 | i2;
        } else {
            i = (~2) & i2;
        }
        notification.flags = i;
    }

    public static AudioAttributes.Builder A00() {
        return new AudioAttributes.Builder();
    }

    public static CharSequence A04(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 5120) {
            return charSequence;
        }
        return charSequence.subSequence(0, 5120);
    }

    public Notification A05() {
        return new C09580cb(this).A0M();
    }

    public void A06(int i) {
        Notification notification = this.A0B;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A07(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
    }

    public void A08(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.A0Q.add(new C07250Wx(i, charSequence, pendingIntent));
    }

    public void A09(long j) {
        this.A0B.when = j;
    }

    public void A0A(Bitmap bitmap) {
        IconCompat A032;
        if (bitmap == null) {
            A032 = null;
        } else {
            Context context = this.A0F;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            A032 = IconCompat.A03(bitmap);
        }
        this.A0I = A032;
    }

    public void A0B(Uri uri) {
        Notification notification = this.A0B;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = A03(A02(A01(A00())));
    }

    public void A0C(AnonymousClass0YE r2) {
        if (this.A02 != r2) {
            this.A02 = r2;
            if (r2.A00 != this) {
                r2.A00 = this;
                A0C(r2);
            }
        }
    }

    public void A0D(IconCompat iconCompat) {
        this.A03 = iconCompat.A09(this.A0F);
    }

    public void A0G(CharSequence charSequence) {
        this.A0B.tickerText = A04(charSequence);
    }

    @Deprecated
    public void A0H(String str) {
        if (str != null && !str.isEmpty()) {
            this.A0R.add(str);
        }
    }

    public void A0I(boolean z) {
        int i;
        Notification notification = this.A0B;
        int i2 = notification.flags;
        if (z) {
            i = 16 | i2;
        } else {
            i = (~16) & i2;
        }
        notification.flags = i;
    }

    public C07700Yy(Context context, String str) {
        Notification notification = new Notification();
        this.A0B = notification;
        this.A0F = context;
        this.A0M = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A09 = 0;
        this.A0R = AnonymousClass001.A0I();
        this.A0T = true;
    }

    public static AudioAttributes A03(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public void A0E(CharSequence charSequence) {
        this.A0J = A04(charSequence);
    }

    public void A0F(CharSequence charSequence) {
        this.A0K = A04(charSequence);
    }
}
