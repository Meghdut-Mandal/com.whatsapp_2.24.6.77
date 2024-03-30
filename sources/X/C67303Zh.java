package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.HashSet;

/* renamed from: X.3Zh  reason: invalid class name and case insensitive filesystem */
public class C67303Zh implements AbsListView.OnScrollListener {
    public float A00;
    public int A01 = -1;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ View A06;
    public final /* synthetic */ MediaAlbumActivity A07;

    public C67303Zh(View view, MediaAlbumActivity mediaAlbumActivity, int i, int i2, int i3) {
        this.A07 = mediaAlbumActivity;
        this.A06 = view;
        this.A04 = i;
        this.A05 = i2;
        this.A03 = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = r11.A07
            android.widget.ListView r0 = r6.A02
            int r5 = r0.getFirstVisiblePosition()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L_0x0112
            android.view.View r1 = r11.A06
            int r0 = r1.getTop()
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L_0x0112
            int r0 = -r0
            float r1 = (float) r0
            float r1 = r1 * r4
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x001d:
            X.1nW r0 = r6.A0B
            X.3Ej r10 = r0.A01
            X.2IR r3 = r10.A04
            if (r3 == 0) goto L_0x0087
            int r2 = r10.A01
            int r0 = r10.A02
            if (r2 >= r0) goto L_0x0087
            int r0 = r10.A03
            if (r0 == 0) goto L_0x010a
            int r2 = r3.getTop()
            int r0 = r10.A03
            if (r2 == r0) goto L_0x010a
            X.2IR r0 = r10.A04
            int r2 = r0.getTop()
            int r0 = r10.A03
            int r0 = X.AnonymousClass000.A05(r2, r0)
            int r2 = r10.A01
            int r0 = r0 * 2
            int r2 = r2 + r0
            r10.A01 = r2
            X.2IR r0 = r10.A04
            r0.A02 = r2
            r0.requestLayout()
            int r0 = r10.A00
            if (r0 == 0) goto L_0x010a
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r9 = r10.A05
            X.C36321k7.A0K(r9, r0)
            int r8 = r0.y
            int r7 = r10.A01
            int r3 = r10.A00
            X.1nW r0 = r9.A0B
            int r2 = r0.getCount()
            r0 = 1
            int r2 = r2 - r0
            if (r3 == r2) goto L_0x0070
            r0 = 0
        L_0x0070:
            int r7 = r10.A00(r8, r7, r0)
            android.widget.ListView r3 = r9.getListView()
            X.C18740tg.A04(r3)
            int r2 = r10.A00
            int r0 = r3.getHeaderViewsCount()
            int r2 = r2 + r0
            r3.setSelectionFromTop(r2, r7)
        L_0x0085:
            r10.A03 = r7
        L_0x0087:
            android.widget.ListView r0 = r6.getListView()
            android.view.View r7 = X.C36411kG.A0L(r0)
            X.1nW r0 = r6.A0B
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x00ab
            if (r7 == 0) goto L_0x00ab
            int r0 = r11.A01
            if (r0 >= 0) goto L_0x00a5
            r11.A01 = r5
            int r0 = r7.getTop()
            r11.A02 = r0
        L_0x00a5:
            int r0 = r11.A01
            if (r0 == r5) goto L_0x00eb
            r11.A00 = r4
        L_0x00ab:
            float r0 = r11.A00
            float r0 = java.lang.Math.min(r1, r0)
            float r4 = r4 - r0
            X.3fI r0 = r6.A00
            X.0V9 r0 = r0.A00
            android.view.Window r2 = r6.getWindow()
            if (r0 == 0) goto L_0x00e2
            r1 = 2130968625(0x7f040031, float:1.7545909E38)
            r0 = 2131099689(0x7f060029, float:1.7811738E38)
            int r0 = X.C36351kA.A01(r6, r1, r0)
        L_0x00c6:
            r2.setStatusBarColor(r0)
            X.1lH r3 = r6.A0D
            int r1 = r11.A04
            int r0 = r11.A03
            int r2 = X.C018107s.A03(r4, r1, r0)
            android.graphics.Paint r1 = r3.A00
            int r0 = r1.getColor()
            if (r0 == r2) goto L_0x00e1
            r1.setColor(r2)
            r3.invalidateSelf()
        L_0x00e1:
            return
        L_0x00e2:
            int r1 = r11.A04
            int r0 = r11.A05
            int r0 = X.C018107s.A03(r4, r1, r0)
            goto L_0x00c6
        L_0x00eb:
            float r3 = r11.A00
            int r2 = r11.A02
            int r0 = r7.getTop()
            int r0 = X.AnonymousClass000.A05(r2, r0)
            float r2 = (float) r0
            float r2 = r2 * r4
            int r0 = X.C36391kE.A02(r6)
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = java.lang.Math.min(r4, r2)
            float r0 = java.lang.Math.max(r3, r0)
            r11.A00 = r0
            goto L_0x00ab
        L_0x010a:
            X.2IR r0 = r10.A04
            int r7 = r0.getTop()
            goto L_0x0085
        L_0x0112:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67303Zh.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        MediaAlbumActivity mediaAlbumActivity = this.A07;
        ReactionsTrayViewModel reactionsTrayViewModel = mediaAlbumActivity.A00.A0u;
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A0S(0);
        }
        if (i == 0 && (mediaAlbumActivity.A0O instanceof C28981Uw) && AnonymousClass1GQ.A00(mediaAlbumActivity.A0S, 2)) {
            AnonymousClass3K9 r5 = mediaAlbumActivity.A0P;
            HashSet A16 = C36441kJ.A16();
            int childCount = mediaAlbumActivity.getListView().getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mediaAlbumActivity.getListView().getChildAt(i2);
                if (childAt instanceof AnonymousClass2IQ) {
                    AnonymousClass2bU fMessage = ((AnonymousClass2IQ) childAt).getFMessage();
                    if (C54732tQ.A00(fMessage)) {
                        A16.add(fMessage);
                    }
                }
            }
            r5.A01(new C596934x(A16, C36441kJ.A16()));
        }
    }
}
