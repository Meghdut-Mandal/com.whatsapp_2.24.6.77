package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: X.6j8  reason: invalid class name and case insensitive filesystem */
public class C139036j8 implements C157177bx {
    public int A00;
    public C92734eW A01;
    public C92724eV A02;
    public AnonymousClass6LC A03;
    public AnonymousClass6LD A04;
    public C90704aa A05;
    public Integer A06;
    public Integer A07;
    public Runnable A08;
    public boolean A09 = false;
    public final Deque A0A = new ArrayDeque();
    public final List A0B = AnonymousClass001.A0I();

    public static void A01(Context context, C139036j8 r7) {
        int i;
        Deque deque = r7.A0A;
        C122045uD r2 = (C122045uD) deque.pop();
        C122045uD r0 = (C122045uD) deque.peek();
        if (r0 == null) {
            AnonymousClass6RS.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
            i = 32;
        } else {
            i = r0.A02;
        }
        r7.A00(i);
        if (r7.A01 != null) {
            r2.A03.A03();
            r7.A0B.add(r2);
            C122045uD r4 = (C122045uD) deque.peek();
            if (r4 == null) {
                throw AnonymousClass001.A09("Cannot pop Screen content with an empty CDS bottom sheet or full screen.");
            } else if (r7.A01 != null) {
                AnonymousClass6LD r22 = r7.A04;
                if (r22 != null) {
                    AnonymousClass759.A00(r22.A02, r22, 27);
                }
                AnonymousClass6LC r23 = r7.A03;
                if (r23 != null) {
                    AnonymousClass759.A00(r23.A02, r23, 26);
                }
                C128926Ed r3 = r4.A03;
                View view = r4.A00;
                if (view == null) {
                    view = r3.A00(context);
                }
                r4.A00 = view;
                C92774ec.A02(view, r7.A01.getContentPager(), (Integer) null, false);
                C98124qv r1 = r3.A02;
                C92734eW r02 = r7.A01;
                if (r02 != null) {
                    ViewGroup headerContainer = r02.getHeaderContainer();
                    headerContainer.removeAllViews();
                    headerContainer.addView(r1);
                }
            } else {
                throw AnonymousClass001.A09("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
            }
        } else {
            throw AnonymousClass001.A09("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
    }

    private void A00(int i) {
        Window window;
        C122045uD r0 = (C122045uD) this.A0A.peek();
        Context context = null;
        if (r0 != null) {
            context = r0.A03.A01;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() != null) {
                window = activity.getWindow();
            } else {
                return;
            }
        } else {
            C90704aa r02 = this.A05;
            if (r02 == null || (window = r02.getWindow()) == null) {
                return;
            }
        }
        window.setSoftInputMode(i);
    }

    public static void A02(Context context, C139036j8 r3, C128926Ed r4, AnonymousClass7fM r5, Integer num, int i) {
        int i2;
        if (r3.A01 != null) {
            View A002 = r4.A00(context);
            C92774ec.A02(A002, r3.A01.getContentPager(), num, true);
            C98124qv r1 = r4.A02;
            C92734eW r0 = r3.A01;
            if (r0 != null) {
                ViewGroup headerContainer = r0.getHeaderContainer();
                headerContainer.removeAllViews();
                headerContainer.addView(r1);
            }
            C122045uD r12 = new C122045uD(A002, r4, r5, i);
            Deque deque = r3.A0A;
            deque.push(r12);
            C122045uD r02 = (C122045uD) deque.peek();
            if (r02 == null) {
                AnonymousClass6RS.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
                i2 = 32;
            } else {
                i2 = r02.A02;
            }
            r3.A00(i2);
            return;
        }
        throw AnonymousClass001.A09("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r6 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r6) {
        /*
            r5 = this;
            X.4eV r4 = r5.A02
            if (r4 == 0) goto L_0x005c
            X.4dT r0 = r4.A03
            if (r0 == 0) goto L_0x005c
            java.lang.Integer r3 = r4.A0C
            java.lang.Integer r0 = X.C023109s.A0C
            r2 = 7
            r1 = 1
            if (r3 == r0) goto L_0x0014
            java.lang.Integer r0 = X.C023109s.A0G
            if (r3 != r0) goto L_0x005c
        L_0x0014:
            if (r6 == 0) goto L_0x005f
            if (r6 == r1) goto L_0x0030
            if (r6 == r2) goto L_0x0030
        L_0x001a:
            r0 = 5
            if (r6 == r0) goto L_0x0031
            r0 = 6
            if (r6 != r0) goto L_0x0030
            X.6LD r1 = r5.A04
            if (r1 == 0) goto L_0x0030
            android.os.Handler r3 = r1.A02
            r0 = 27
            X.759 r2 = new X.759
            r2.<init>((java.lang.Object) r1, (int) r0)
        L_0x002d:
            r3.post(r2)
        L_0x0030:
            return
        L_0x0031:
            X.6LC r0 = r5.A03
            if (r0 == 0) goto L_0x0030
            if (r4 == 0) goto L_0x0030
            X.6LD r2 = r5.A04
            if (r2 == 0) goto L_0x0042
            android.os.Handler r1 = r2.A02
            r0 = 27
            X.AnonymousClass759.A00(r1, r2, r0)
        L_0x0042:
            r1 = 25
            X.759 r0 = new X.759
            r0.<init>((java.lang.Object) r5, (int) r1)
            com.instagram.common.thread.ThreadUtil.runOnUiThread(r0)
            X.6LC r4 = r5.A03
            X.4eV r1 = r5.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.os.Handler r3 = r4.A02
            X.752 r2 = new X.752
            r2.<init>((android.widget.FrameLayout) r1, (X.AnonymousClass6LC) r4)
            goto L_0x002d
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x001a
        L_0x005f:
            X.6LD r1 = r5.A04
            if (r1 == 0) goto L_0x0030
            if (r4 == 0) goto L_0x0030
            android.os.Handler r3 = r1.A02
            r0 = 23
            X.75C r2 = new X.75C
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r1, (int) r0)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139036j8.A03(int):void");
    }

    public void A04(Context context, String str) {
        String str2;
        Deque<C122045uD> deque = this.A0A;
        C122045uD r0 = (C122045uD) deque.peekFirst();
        if (r0 == null || str.equals(r0.A03.A03)) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            int i = 0;
            for (C122045uD r02 : deque) {
                if (!str.equals(r02.A03.A03)) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A01(context, this);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        AnonymousClass6RS.A01("CDSBloksBottomSheetDelegate", str2);
    }
}
