package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nC  reason: invalid class name and case insensitive filesystem */
public class C96354nC extends C02910Cj {
    public int A00;
    public Rect A01 = AnonymousClass001.A06();
    public LruCache A02 = new LruCache(50);
    public boolean A03;
    public View A04;
    public final C34411h0 A05;

    public static void A00(C96354nC r2, int i, int i2) {
        LruCache lruCache = r2.A02;
        if (lruCache.size() != 0) {
            for (int i3 = i; i3 <= i + i2; i3++) {
                lruCache.remove(Integer.valueOf(i3));
            }
        }
    }

    public void A04(Canvas canvas, AnonymousClass0C4 r11, RecyclerView recyclerView) {
        AnonymousClass0CP layoutManager;
        C34411h0 r8 = this.A05;
        if (r8.BtE() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int i = 0;
            View A0R = layoutManager.A0R(0);
            if (A0R != null) {
                int A002 = RecyclerView.A00(A0R);
                if (A002 == -1) {
                    View view = this.A04;
                    canvas.save();
                    canvas.translate((float) this.A01.left, 0.0f);
                    view.draw(canvas);
                } else {
                    int BCN = r8.BCN(A002);
                    if (BCN == -1) {
                        this.A03 = true;
                        return;
                    }
                    this.A03 = false;
                    if (A002 == BCN) {
                        layoutManager.A0Z(A0R, this.A01);
                    }
                    LruCache lruCache = this.A02;
                    Integer valueOf = Integer.valueOf(BCN);
                    View view2 = (View) lruCache.get(valueOf);
                    if (view2 == null) {
                        AnonymousClass0D3 BUw = r8.BUw(recyclerView, r8.getItemViewType(BCN));
                        r8.BSE(BUw, BCN);
                        view2 = BUw.A0H;
                        lruCache.put(valueOf, view2);
                    }
                    Rect rect = this.A01;
                    view2.measure(ViewGroup.getChildMeasureSpec(C90504aG.A08(recyclerView.getWidth()), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view2.getLayoutParams().height));
                    this.A00 = view2.getMeasuredHeight() + rect.bottom + rect.top;
                    view2.layout(0, 0, view2.getMeasuredWidth() + rect.left + rect.right, this.A00);
                    this.A04 = view2;
                    int bottom = view2.getBottom() - rect.top;
                    while (i < recyclerView.getChildCount()) {
                        View childAt = recyclerView.getChildAt(i);
                        Rect A06 = AnonymousClass001.A06();
                        RecyclerView.A0B(childAt, A06);
                        if (A06.bottom <= bottom || A06.top > bottom) {
                            i++;
                        } else if (childAt != null) {
                            int A003 = RecyclerView.A00(childAt);
                            if (A003 == -1 || !r8.BLw(A003)) {
                                canvas.save();
                                canvas.translate((float) rect.left, 0.0f);
                            } else {
                                canvas.save();
                                canvas.translate((float) rect.left, (float) (childAt.getTop() - view2.getHeight()));
                            }
                            view2.draw(canvas);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                canvas.restore();
            }
        }
    }

    public C96354nC(Context context, RecyclerView recyclerView, AnonymousClass7fO r5, C34411h0 r6) {
        this.A05 = r6;
        recyclerView.A13.add(new C138596iN(new C06360Th(context, new C92054d3(r5, this)), r5, r6, this));
        r6.BnA(new C162507oh(this, 0));
    }
}
