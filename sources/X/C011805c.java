package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
public class C011805c extends C011705b {
    public final /* synthetic */ ViewPager A00;

    public C011805c(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass07S r0;
        super.A0i(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.A00;
        AnonymousClass07S r02 = viewPager.A0A;
        boolean z = true;
        if (r02 == null || r02.A0H() <= 1) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() == 4096 && (r0 = viewPager.A0A) != null) {
            accessibilityEvent.setItemCount(r0.A0H());
            accessibilityEvent.setFromIndex(viewPager.A02);
            accessibilityEvent.setToIndex(viewPager.A02);
        }
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        ViewPager viewPager;
        int i2;
        if (!super.A0j(view, i, bundle)) {
            if (i != 4096) {
                if (i == 8192) {
                    viewPager = this.A00;
                    if (viewPager.canScrollHorizontally(-1)) {
                        i2 = viewPager.A02 - 1;
                    }
                }
                return false;
            }
            viewPager = this.A00;
            if (viewPager.canScrollHorizontally(1)) {
                i2 = viewPager.A02 + 1;
            }
            return false;
            viewPager.setCurrentItem(i2);
        }
        return true;
    }

    public void A0k(View view, C07650Ys r6) {
        super.A0k(view, r6);
        r6.A0C(ViewPager.class.getName());
        ViewPager viewPager = this.A00;
        AnonymousClass07S r0 = viewPager.A0A;
        boolean z = true;
        if (r0 == null || r0.A0H() <= 1) {
            z = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A02;
        accessibilityNodeInfo.setScrollable(z);
        if (viewPager.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
        }
    }
}
