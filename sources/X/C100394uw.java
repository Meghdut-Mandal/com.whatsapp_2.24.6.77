package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.4uw  reason: invalid class name and case insensitive filesystem */
public class C100394uw extends C98174r0 {
    public static SwipeRefreshLayout A01(Context context) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
        AnonymousClass00C.A0D(context, 1);
        swipeRefreshLayout.addView(new C98124qv(context), new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C113035et.A00);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            swipeRefreshLayout.setColorSchemeColors(new int[]{colorStateList.getDefaultColor()});
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList2 != null) {
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(colorStateList2.getDefaultColor());
        }
        return swipeRefreshLayout;
    }

    public /* bridge */ /* synthetic */ Object A0F(View view, C1271967i r5, C140456lc r6, Object obj) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        C123055vr r7 = (C123055vr) obj;
        C142026oD r1 = (C142026oD) C133266Xn.A05(r5, r6);
        if (r1 != null) {
            r1.A00 = swipeRefreshLayout;
            swipeRefreshLayout.setOnRefreshListener(new C138706iY(r5, r6, this, r1));
            swipeRefreshLayout.setRefreshing(r1.A01);
            for (int i = 0; i < swipeRefreshLayout.getChildCount(); i++) {
                View childAt = swipeRefreshLayout.getChildAt(i);
                if (childAt instanceof C98124qv) {
                    ((C98124qv) childAt).setRenderTree(r7);
                    return null;
                }
            }
            throw AnonymousClass001.A09("SwipeRefreshLayout does not contain RenderTreeHostView child");
        }
        throw C90514aH.A0s("PTR container defines a controller but none was found");
    }

    public /* bridge */ /* synthetic */ void A0G(View view, C1271967i r6, C140456lc r7, Object obj, Object obj2) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        for (int i = 0; i < swipeRefreshLayout.getChildCount(); i++) {
            View childAt = swipeRefreshLayout.getChildAt(i);
            if (childAt instanceof C98124qv) {
                ((C98124qv) childAt).setRenderTree((C123055vr) null);
                swipeRefreshLayout.setRefreshing(false);
                return;
            }
        }
        throw AnonymousClass001.A09("SwipeRefreshLayout does not contain RenderTreeHostView child");
    }

    public /* bridge */ /* synthetic */ void A0H(View view, C1271967i r3, C140456lc r4, Object obj, Object obj2) {
        ((SwipeRefreshLayout) view).setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) null);
    }

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        return A01(context);
    }

    public C100394uw(C1271967i r1, C140456lc r2) {
        super(r1, r2);
    }
}
