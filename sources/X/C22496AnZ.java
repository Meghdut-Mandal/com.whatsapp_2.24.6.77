package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AnZ  reason: case insensitive filesystem */
public final class C22496AnZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $isFirstRequest;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbnailSize;
    public final /* synthetic */ UserJid $userJid;
    public final /* synthetic */ C202279lS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22496AnZ(C202279lS r2, UserJid userJid, int i, int i2, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$userJid = userJid;
        this.$thumbnailSize = i;
        this.$requestPageSize = i2;
        this.$isFirstRequest = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass9W6 r7 = (AnonymousClass9W6) obj;
        AnonymousClass9VS A03 = this.this$0.A0B.A03(this.$userJid);
        if (A03 != null) {
            str = A03.A00;
        } else {
            str = null;
        }
        C202279lS r2 = this.this$0;
        AnonymousClass9VS A032 = r2.A0B.A03(this.$userJid);
        if ((A032 == null || A032.A01) && !r2.A01) {
            C202279lS r10 = this.this$0;
            r10.A01 = true;
            int i = this.$thumbnailSize;
            int i2 = this.$requestPageSize;
            String str2 = r10.A0C.A02;
            AnonymousClass9W6 r12 = r7;
            UserJid userJid = this.$userJid;
            String str3 = str2;
            C193989Nr r11 = new C193989Nr(r12, C177588e2.A00, userJid, str3, str, i, i, i2);
            AnonymousClass9TW r122 = new AnonymousClass9TW(new C193329La(this.this$0, this.$userJid, str, this.$isFirstRequest));
            C200119ge r72 = r10.A0D;
            if (r72.A00.A0M(r11.A05) || !r10.A0I.A0E(1327)) {
                AnonymousClass3L6 r9 = r10.A0L;
                AnonymousClass19A r8 = r10.A0K;
                C31781cN r73 = r10.A0E;
                AnonymousClass9EK r5 = r10.A0F;
                C19600wD r4 = r10.A0H;
                AnonymousClass8VG r102 = new AnonymousClass8VG(r10.A09, r122, r11, r73, r5, r4, r10.A0I, r10.A0J, r8, r9, r10.A0M);
                if (!r102.A02.A09()) {
                    r102.A00.A01(r102.A01, -1);
                } else {
                    AnonymousClass8VH.A01(r102.A01, r102);
                }
            } else {
                C198319dG r82 = r72.A01;
                AnonymousClass3L6 r52 = r82.A0G;
                AnonymousClass19A r112 = r82.A0F;
                C31781cN r103 = new C31781cN(new C31791cO(r82.A0A, 0));
                AnonymousClass9EK r92 = r82.A09;
                C19600wD r42 = r82.A0B;
                AnonymousClass1KK r22 = r82.A02;
                C199349fA r1 = r82.A0E;
                C63273Jk r0 = r82.A0I;
                C20810yC r3 = r82.A0C;
                AnonymousClass8VG r19 = new AnonymousClass8VG(r22, r122, r11, r103, r92, r42, r3, r1, r112, r52, r0);
                C198409dV r14 = r82.A05;
                C19770wU r23 = r82.A0J;
                C194309Pd r13 = r82.A04;
                C193349Lc r15 = new C193349Lc(r13, r14);
                C603237k r16 = r82.A07;
                AnonymousClass9IN A00 = C198319dG.A00(r82);
                C195189Sv r17 = r82.A08;
                C193989Nr r18 = r11;
                C603237k r162 = r16;
                C200119ge.A00(new AnonymousClass8W0(r122, r13, r14, r15, r162, r17, r18, r19, r42, r3, r52, A00, r23), r72);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
