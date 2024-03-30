package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.1nW  reason: invalid class name and case insensitive filesystem */
public class C37981nW extends BaseAdapter {
    public List A00;
    public final C62013Ej A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 114;
    }

    public C37981nW(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A01 = new C62013Ej(mediaAlbumActivity);
    }

    public int getCount() {
        return C36371kC.A06(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public int getItemViewType(int i) {
        AnonymousClass3T1 A0n;
        AnonymousClass3QY r1 = this.A02.A00.A0L;
        List list = this.A00;
        if (list == null) {
            A0n = null;
        } else {
            A0n = C36411kG.A0n(list, i);
        }
        C18740tg.A06(A0n);
        return r1.A01(A0n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r5.A00.A00 != null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.A00
            if (r0 != 0) goto L_0x007a
            r4 = 0
        L_0x0005:
            X.C18740tg.A06(r4)
            r3 = 0
            if (r8 != 0) goto L_0x0053
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            X.3fI r0 = r5.A00
            X.3QY r1 = r0.A0L
            android.content.Context r0 = r9.getContext()
            X.2IR r8 = r1.A03(r0, r5, r4)
            r0 = 2131431488(0x7f0b1040, float:1.8484707E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0025
            r0.setPadding(r3, r3, r3, r3)
        L_0x0025:
            java.util.HashSet r2 = r5.A0Z
            X.3Qa r1 = r4.A1J
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x003d
            r2.remove(r1)
            boolean r0 = r5.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003d
            boolean r0 = r4.A15
            r8.A1i(r3, r0)
        L_0x003d:
            X.3Ej r2 = r6.A01
            r1 = r8
            int r0 = r2.A00
            if (r0 != r7) goto L_0x004b
            int r0 = r2.A01
            r8.A02 = r0
        L_0x0048:
            r2.A04 = r1
        L_0x004a:
            return r8
        L_0x004b:
            r8.A02 = r3
            X.2IR r0 = r2.A04
            if (r0 != r8) goto L_0x004a
            r1 = 0
            goto L_0x0048
        L_0x0053:
            X.2IR r8 = (X.AnonymousClass2IR) r8
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            java.util.HashSet r0 = r5.A0Z
            X.3Qa r2 = r4.A1J
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0070
            java.util.HashSet r0 = r5.A0Y
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0070
            X.3fI r0 = r5.A00
            X.0V9 r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r8.A22(r4, r0)
            java.util.HashSet r0 = r5.A0Y
            r0.remove(r2)
            goto L_0x0025
        L_0x007a:
            X.3T1 r4 = X.C36411kG.A0n(r0, r7)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37981nW.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
