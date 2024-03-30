package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.73p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500073p implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass65M A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C006302t A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500073p(AnonymousClass65M r1, String str, C006302t r3, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = str;
        this.A04 = z;
        this.A03 = r3;
        this.A05 = z2;
        this.A00 = i;
        this.A06 = z3;
    }

    public final void run() {
        AnonymousClass65M r7 = this.A01;
        String str = this.A02;
        boolean z = this.A04;
        C006302t r5 = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        boolean z3 = this.A06;
        AnonymousClass1HC r1 = r7.A07;
        int A002 = r1.A00();
        r1.A01(A002, "start_download");
        r1.A05(C106055Ie.A00, str, A002);
        String str2 = "";
        AnonymousClass68B A012 = C132076Sa.A01((C135066c4) null, "meta-avatar", "Avatars", "Meta", "", str2, "", "", C023409w.A00);
        if (z) {
            StickerPackDownloader stickerPackDownloader = r7.A0B;
            String str3 = A012.A0F;
            AnonymousClass00C.A08(str3);
            stickerPackDownloader.A04(str3);
        }
        AtomicBoolean atomicBoolean = r7.A0F;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            r1.A02(C52322pF.CANCEL, A002);
            r5.invoke(false);
            return;
        }
        r7.A00.set(A012.A0F);
        r7.A01.A0H(new C1499973o(r7, A012, r5, A002, i, z2, z3));
    }
}
