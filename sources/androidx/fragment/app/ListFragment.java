package androidx.fragment.app;

import X.AnonymousClass02E;
import X.C021609d;
import X.C021709e;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public abstract class ListFragment extends AnonymousClass02E {
    public View A00;
    public ListAdapter A01;
    public TextView A02;
    public View A03;
    public View A04;
    public ListView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new C021709e(this);
    public final Runnable A09 = new C021609d(this);

    public static void A00(ListFragment listFragment) {
        if (listFragment.A05 == null) {
            View view = listFragment.A0F;
            if (view != null) {
                if (view instanceof ListView) {
                    listFragment.A05 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    listFragment.A02 = textView;
                    if (textView == null) {
                        listFragment.A00 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    listFragment.A04 = view.findViewById(16711682);
                    listFragment.A03 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        listFragment.A05 = listView;
                        View view2 = listFragment.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                listFragment.A06 = true;
                listFragment.A05.setOnItemClickListener(listFragment.A08);
                ListAdapter listAdapter = listFragment.A01;
                if (listAdapter != null) {
                    listFragment.A01 = null;
                    listFragment.A1Y(listAdapter);
                } else if (listFragment.A04 != null) {
                    A00(listFragment);
                    View view3 = listFragment.A04;
                    if (view3 == null) {
                        throw new IllegalStateException("Can't be used with a custom content view");
                    } else if (listFragment.A06) {
                        listFragment.A06 = false;
                        view3.clearAnimation();
                        listFragment.A03.clearAnimation();
                        listFragment.A04.setVisibility(0);
                        listFragment.A03.setVisibility(8);
                    }
                }
                listFragment.A07.post(listFragment.A09);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public void A1J() {
        this.A07.removeCallbacks(this.A09);
        this.A05 = null;
        this.A06 = false;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A02 = null;
        this.A0Y = true;
    }

    public void A1Y(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = false;
        if (this.A01 != null) {
            z2 = true;
        }
        this.A01 = listAdapter;
        ListView listView = this.A05;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !z2) {
                if (A0d().getWindowToken() != null) {
                    z = true;
                }
                A00(this);
                View view = this.A04;
                if (view == null) {
                    throw new IllegalStateException("Can't be used with a custom content view");
                } else if (!this.A06) {
                    this.A06 = true;
                    if (z) {
                        view.startAnimation(AnimationUtils.loadAnimation(A1D(), 17432577));
                        this.A03.startAnimation(AnimationUtils.loadAnimation(A1D(), 17432576));
                    } else {
                        view.clearAnimation();
                        this.A03.clearAnimation();
                    }
                    this.A04.setVisibility(8);
                    this.A03.setVisibility(0);
                }
            }
        }
    }
}
