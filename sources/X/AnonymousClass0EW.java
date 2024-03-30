package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.0EW  reason: invalid class name */
public class AnonymousClass0EW extends WindowInsetsAnimation.Callback {
    public ArrayList A00;
    public List A01;
    public final HashMap A02 = AnonymousClass001.A0J();
    public final C06650Um A03;

    public AnonymousClass0EW(C06650Um r2) {
        super(r2.A01);
        this.A03 = r2;
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C06650Um r2 = this.A03;
        HashMap hashMap = this.A02;
        C07460Xt r0 = (C07460Xt) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = C07460Xt.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A03(r0);
        hashMap.remove(windowInsetsAnimation);
    }

    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C06650Um r2 = this.A03;
        HashMap hashMap = this.A02;
        C07460Xt r0 = (C07460Xt) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = C07460Xt.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A02(r0);
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.A00 = arrayList2;
            this.A01 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                HashMap hashMap = this.A02;
                C07460Xt r2 = (C07460Xt) hashMap.get(windowInsetsAnimation);
                if (r2 == null) {
                    r2 = C07460Xt.A00(windowInsetsAnimation);
                    hashMap.put(windowInsetsAnimation, r2);
                }
                r2.A00.A08(windowInsetsAnimation.getFraction());
                this.A00.add(r2);
            } else {
                C06650Um r22 = this.A03;
                AnonymousClass09H r0 = AnonymousClass09H.A01;
                Objects.requireNonNull(windowInsets);
                AnonymousClass09H r1 = new AnonymousClass09H(windowInsets);
                r22.A01(r1, this.A01);
                return r1.A06();
            }
        }
    }

    public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C06650Um r2 = this.A03;
        HashMap hashMap = this.A02;
        C07460Xt r1 = (C07460Xt) hashMap.get(windowInsetsAnimation);
        if (r1 == null) {
            r1 = C07460Xt.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r1);
        }
        AnonymousClass0Y8 A002 = AnonymousClass0Y8.A00(bounds);
        r2.A00(A002, r1);
        return A002.A01();
    }
}
