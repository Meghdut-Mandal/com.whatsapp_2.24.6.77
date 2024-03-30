package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0PS;
import X.AnonymousClass0YE;
import X.C07250Wx;
import X.C07700Yy;
import X.C09580cb;
import X.C15690np;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$DecoratedCustomViewStyle extends AnonymousClass0YE {
    private RemoteViews A00(RemoteViews remoteViews, boolean z) {
        boolean z2;
        int min;
        long j;
        long j2;
        int i;
        int i2 = 0;
        Resources resources = this.A00.A0F.getResources();
        RemoteViews remoteViews2 = new RemoteViews(this.A00.A0F.getPackageName(), R.layout.f9nameremoved);
        boolean z3 = true;
        int i3 = 0;
        C07700Yy r1 = this.A00;
        if (r1.A0I != null) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            remoteViews2.setImageViewBitmap(R.id.icon, AnonymousClass0YE.A06(this, this.A00.A0I, 0, 0));
            if (this.A00.A0B.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
                C07700Yy r4 = this.A00;
                remoteViews2.setImageViewBitmap(R.id.right_icon, AnonymousClass0YE.A05(this, r4.A0B.icon, dimensionPixelSize, dimensionPixelSize2, r4.A06));
                remoteViews2.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (r1.A0B.icon != 0) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f7nameremoved) - resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            C07700Yy r42 = this.A00;
            remoteViews2.setImageViewBitmap(R.id.icon, AnonymousClass0YE.A05(this, r42.A0B.icon, dimensionPixelSize3, dimensionPixelSize4, r42.A06));
        }
        CharSequence charSequence = this.A00.A0K;
        if (charSequence != null) {
            remoteViews2.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.A00.A0J;
        if (charSequence2 != null) {
            remoteViews2.setTextViewText(R.id.text, charSequence2);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = false;
        if (this.A00.A08 > 0) {
            if (this.A00.A08 > resources.getInteger(R.integer.f8nameremoved)) {
                i = R.id.info;
                remoteViews2.setTextViewText(R.id.info, resources.getString(R.string.f12nameremoved));
            } else {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                i = R.id.info;
                remoteViews2.setTextViewText(R.id.info, integerInstance.format((long) this.A00.A08));
            }
            remoteViews2.setViewVisibility(i, 0);
            z2 = true;
            z4 = true;
        } else {
            remoteViews2.setViewVisibility(R.id.info, 8);
        }
        C07700Yy r5 = this.A00;
        if (!r5.A0W || r5.A0B.when == 0) {
            z3 = z4;
        } else if (r5.A0Y) {
            remoteViews2.setViewVisibility(R.id.chronometer, 0);
            C07700Yy r12 = this.A00;
            if (r12.A0W) {
                j2 = r12.A0B.when;
            } else {
                j2 = 0;
            }
            remoteViews2.setLong(R.id.chronometer, "setBase", j2 + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
            remoteViews2.setBoolean(R.id.chronometer, "setStarted", true);
        } else {
            remoteViews2.setViewVisibility(R.id.time, 0);
            C07700Yy r13 = this.A00;
            if (r13.A0W) {
                j = r13.A0B.when;
            } else {
                j = 0;
            }
            remoteViews2.setLong(R.id.time, "setTime", j);
        }
        int i4 = 8;
        if (z3) {
            i4 = 0;
        }
        remoteViews2.setViewVisibility(R.id.right_side, i4);
        if (!z2) {
            i3 = 8;
        }
        remoteViews2.setViewVisibility(R.id.line3, i3);
        remoteViews2.removeAllViews(R.id.actions);
        ArrayList arrayList = this.A00.A0Q;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0I.add(it.next());
        }
        if (!z || (min = Math.min(A0I.size(), 3)) <= 0) {
            i2 = 8;
        } else {
            int i5 = 0;
            do {
                C07250Wx r11 = (C07250Wx) A0I.get(i5);
                PendingIntent pendingIntent = r11.A01;
                boolean A1W = AnonymousClass000.A1W(pendingIntent);
                String packageName = this.A00.A0F.getPackageName();
                int i6 = R.layout.f9nameremoved;
                if (A1W) {
                    i6 = R.layout.f9nameremoved;
                }
                RemoteViews remoteViews3 = new RemoteViews(packageName, i6);
                IconCompat A00 = r11.A00();
                if (A00 != null) {
                    remoteViews3.setImageViewBitmap(R.id.action_image, AnonymousClass0YE.A06(this, A00, R.color.f6nameremoved, 0));
                }
                CharSequence charSequence3 = r11.A02;
                remoteViews3.setTextViewText(R.id.action_text, charSequence3);
                if (!A1W) {
                    remoteViews3.setOnClickPendingIntent(R.id.action_container, pendingIntent);
                }
                A03(remoteViews3, charSequence3);
                remoteViews2.addView(R.id.actions, remoteViews3);
                i5++;
            } while (i5 < min);
        }
        remoteViews2.setViewVisibility(R.id.actions, i2);
        remoteViews2.setViewVisibility(R.id.action_divider, i2);
        remoteViews2.setViewVisibility(R.id.title, 8);
        remoteViews2.setViewVisibility(R.id.text2, 8);
        remoteViews2.setViewVisibility(R.id.text, 8);
        remoteViews2.removeAllViews(R.id.notification_main_column);
        remoteViews2.addView(R.id.notification_main_column, remoteViews.clone());
        remoteViews2.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources2 = this.A00.A0F.getResources();
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize6 = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
        float f = resources2.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        A01(Math.round(((1.0f - f2) * ((float) dimensionPixelSize5)) + (f2 * ((float) dimensionPixelSize6))), remoteViews2);
        return remoteViews2;
    }

    public String A09() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public static void A02(Notification.Builder builder, Object obj) {
        builder.setStyle((Notification.Style) obj);
    }

    public RemoteViews A07(C15690np r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0H) == null) {
            return null;
        }
        return A00(remoteViews, true);
    }

    public RemoteViews A08(C15690np r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0H) == null) {
            return null;
        }
        return A00(remoteViews, false);
    }

    public void A0B(C15690np r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            A02(((C09580cb) r3).A02, AnonymousClass0PS.A00());
        }
    }

    public static void A01(int i, RemoteViews remoteViews) {
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, i, 0, 0);
    }

    public static void A03(RemoteViews remoteViews, CharSequence charSequence) {
        remoteViews.setContentDescription(R.id.action_container, charSequence);
    }
}
