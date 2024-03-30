package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.0Fs  reason: invalid class name and case insensitive filesystem */
public class C03510Fs extends AnonymousClass0F6 {
    public C17010qZ A00;
    public MenuItem A01;
    public final int A02;
    public final int A03;

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.A00 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            C03340Ee r4 = (C03340Ee) adapter;
            C018707z r3 = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < r4.getCount()) {
                r3 = r4.getItem(i2);
            }
            MenuItem menuItem = this.A01;
            if (menuItem != r3) {
                C016307a r1 = r4.A00;
                if (menuItem != null) {
                    this.A00.BZR(menuItem, r1);
                }
                this.A01 = r3;
                if (r3 != null) {
                    this.A00.BZQ(r3, r1);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public C03510Fs(Context context, boolean z) {
        super(context, z);
        if (1 == AnonymousClass000.A0U(context).getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
            return;
        }
        this.A02 = 22;
        this.A03 = 21;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A03.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C03340Ee) adapter).A00.A0F(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(C17010qZ r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
