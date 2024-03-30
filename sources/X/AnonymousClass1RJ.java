package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.LinkedHashMap;

/* renamed from: X.1RJ  reason: invalid class name */
public final class AnonymousClass1RJ {
    public View A00;
    public View.OnClickListener A01;
    public ViewStub A02;
    public C34871hm A03;
    public LinkedHashMap A04;

    public int A00() {
        View view = this.A00;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public View A01() {
        View view;
        ViewStub viewStub;
        View view2 = this.A00;
        if (view2 == null && (viewStub = this.A02) != null) {
            view2 = viewStub.inflate();
            this.A00 = view2;
            this.A02 = null;
        }
        C18740tg.A07(view2, "View must be inflated in ViewStubHolder.getView()");
        C34871hm r0 = this.A03;
        if (!(r0 == null || view2 == null)) {
            r0.BZ9(view2);
            this.A03 = null;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (!(linkedHashMap == null || this.A00 == null)) {
            for (C34871hm BZ9 : linkedHashMap.values()) {
                BZ9.BZ9(this.A00);
            }
            this.A04 = null;
        }
        View.OnClickListener onClickListener = this.A01;
        if (!(onClickListener == null || (view = this.A00) == null)) {
            view.setOnClickListener(onClickListener);
            this.A01 = null;
        }
        return this.A00;
    }

    public ViewGroup.LayoutParams A02() {
        View view = this.A02;
        if (view != null || (view = this.A00) != null) {
            return view.getLayoutParams();
        }
        throw new IllegalStateException("Either viewStub or view should exist");
    }

    public void A03(int i) {
        View A012;
        if (i == 8) {
            A012 = this.A00;
            if (A012 == null) {
                return;
            }
        } else {
            A012 = A01();
        }
        A012.setVisibility(i);
    }

    public void A05(View.OnClickListener onClickListener) {
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            this.A01 = onClickListener;
        }
    }

    public void A06(ViewGroup.LayoutParams layoutParams) {
        View view = this.A02;
        if (view == null && (view = this.A00) == null) {
            throw new IllegalStateException("Either viewStub or view should exist");
        }
        view.setLayoutParams(layoutParams);
    }

    public void A07(C34871hm r2) {
        View view = this.A00;
        if (view != null) {
            r2.BZ9(view);
        } else {
            this.A03 = r2;
        }
    }

    public void A08(C34871hm r2, String str) {
        View view = this.A00;
        if (view != null) {
            r2.BZ9(view);
            return;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.A04 = linkedHashMap;
        }
        if (linkedHashMap.containsKey(str)) {
            this.A04.remove(str);
        }
        this.A04.put(str, r2);
    }

    public boolean A09() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass1RJ(View view) {
        C18740tg.A04(view);
        if (view instanceof ViewStub) {
            this.A02 = (ViewStub) view;
        } else {
            this.A00 = view;
        }
    }

    public void A04(int i, int i2) {
        ViewGroup.LayoutParams A022 = A02();
        A022.width = i;
        A022.height = i2;
        A06(A022);
    }
}
