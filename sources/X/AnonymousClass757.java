package X;

import android.view.View;
import com.whatsapp.conversation.ConversationListView;
import java.util.List;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.757  reason: invalid class name */
public class AnonymousClass757 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass757(AnonymousClass1X4 r2, AnonymousClass3T1 r3, int i) {
        this.A04 = 4;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = true;
        this.A00 = i;
    }

    public static void A00(C98264r9 r2) {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        synchronized (r2) {
            runnableFuture = r2.A00;
        }
        if (runnableFuture == null || !runnableFuture.isCancelled()) {
            synchronized (r2) {
                runnableFuture2 = r2.A00;
            }
            if (runnableFuture2 != null && !runnableFuture2.isDone() && r2.A02.get() == -1) {
                r2.A00();
            }
        }
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                C92414du r4 = (C92414du) this.A01;
                View view = (View) this.A02;
                boolean z = this.A03;
                int i = this.A00;
                if (r4.A04 != null) {
                    int height = r4.getHeight();
                    int BG2 = height - r4.A04.BG2(view, height);
                    AnonymousClass6Xh r1 = r4.A05;
                    int i2 = r1.A03;
                    if (z) {
                        view.offsetTopAndBottom(BG2 - view.getTop());
                        return;
                    }
                    r1.A08 = view;
                    r1.A02 = -1;
                    if (AnonymousClass6Xh.A05(r1, BG2, 0, i)) {
                        C011504z.A05(r4);
                        return;
                    }
                    List<C1267565j> list = r4.A0G;
                    if (!list.isEmpty() && i2 == 0) {
                        for (C1267565j A012 : list) {
                            A012.A01(r4.A04);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (this.A03) {
                    List list2 = (List) this.A02;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size >= 0 && !((C114835hu) this.A01).A00.get()) {
                            A00(((C118815om) list2.get(size)).A00);
                        } else {
                            return;
                        }
                    }
                } else {
                    int i3 = 0;
                    while (true) {
                        List list3 = (List) this.A02;
                        if (i3 < list3.size() && !((C114835hu) this.A01).A00.get()) {
                            A00(((C118815om) list3.get(i3)).A00);
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ((ConversationListView) this.A01).A09((AnonymousClass3T1) this.A02, -1, true);
                return;
            case 3:
                ((AnonymousClass3QW) this.A01).A06.A01((AnonymousClass3T1) this.A02, this.A00, true);
                return;
            default:
                ((AnonymousClass1X4) this.A01).A0V((AnonymousClass3T1) this.A02, this.A00, true, false);
                return;
        }
    }

    public AnonymousClass757(ConversationListView conversationListView, AnonymousClass3T1 r4) {
        this.A04 = 2;
        this.A01 = conversationListView;
        this.A02 = r4;
        this.A00 = -1;
        this.A03 = true;
    }

    public AnonymousClass757(Object obj, Object obj2, int i, int i2, boolean z) {
        this.A04 = i2;
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    public AnonymousClass757(AnonymousClass3QW r2, AnonymousClass3T1 r3, int i) {
        this.A04 = 3;
        this.A01 = r2;
        this.A03 = true;
        this.A02 = r3;
        this.A00 = i;
    }
}
