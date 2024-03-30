package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Hd  reason: invalid class name and case insensitive filesystem */
public class C03650Hd extends C007303d {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ AnonymousClass02E A01;
    public final /* synthetic */ AnonymousClass0Hz A02;

    public C03650Hd(FrameLayout frameLayout, AnonymousClass02E r2, AnonymousClass0Hz r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = frameLayout;
    }

    public void A00(Bundle bundle, View view, AnonymousClass02E r7, AnonymousClass01z r8) {
        if (r7 == this.A01) {
            CopyOnWriteArrayList copyOnWriteArrayList = r8.A0S.A00;
            synchronized (copyOnWriteArrayList) {
                int i = 0;
                int size = copyOnWriteArrayList.size();
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((AnonymousClass05O) copyOnWriteArrayList.get(i)).A01 == this) {
                        copyOnWriteArrayList.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            AnonymousClass0Hz.A02(view, this.A00);
        }
    }
}
