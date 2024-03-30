package X;

import com.whatsapp.community.iq.CreateCommunityManager$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3OG  reason: invalid class name */
public final class AnonymousClass3OG {
    public long A00;
    public C587030s A01;
    public AnonymousClass147 A02;
    public final C19700wN A03;
    public final C19730wQ A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass16K A06;
    public final C19970wo A07;
    public final C20810yC A08;
    public final C20350xQ A09;
    public final C26801Lo A0A;
    public final C61503Cd A0B;
    public final AnonymousClass19A A0C;
    public final AnonymousClass1P3 A0D;
    public final Map A0E = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final AtomicInteger A0F;
    public final AnonymousClass01Y A0G;
    public final AnonymousClass17Y A0H;
    public final C28081Rg A0I;

    public static final void A00(AnonymousClass3OG r6, int i) {
        if (i == 0) {
            r6.A0I.A00(11, C19970wo.A00(r6.A07) - r6.A00);
            AnonymousClass147 r3 = r6.A02;
            if (r3 != null) {
                Map map = r6.A0E;
                AnonymousClass00C.A07(map);
                if (!map.isEmpty()) {
                    r6.A0H.A0H(new C80263v7(r6, r3, 23));
                }
            }
        }
    }

    public AnonymousClass3OG(AnonymousClass012 r4, C19700wN r5, AnonymousClass17Y r6, C19730wQ r7, C587030s r8, AnonymousClass16D r9, AnonymousClass16K r10, C19970wo r11, C20810yC r12, C20350xQ r13, C26801Lo r14, C61503Cd r15, AnonymousClass19A r16, AnonymousClass1P3 r17, C28081Rg r18) {
        C36321k7.A1B(r11, r12, r6, r5, r7);
        AnonymousClass19A r2 = r16;
        C28081Rg r0 = r18;
        C36321k7.A1C(r2, r9, r13, r0, r10);
        AnonymousClass1P3 r1 = r17;
        C36321k7.A15(r1, r14, r15);
        this.A07 = r11;
        this.A08 = r12;
        this.A0H = r6;
        this.A03 = r5;
        this.A04 = r7;
        this.A0C = r2;
        this.A05 = r9;
        this.A09 = r13;
        this.A0I = r0;
        this.A06 = r10;
        this.A0D = r1;
        this.A0A = r14;
        this.A0B = r15;
        this.A01 = r8;
        boolean z = false;
        this.A0F = new AtomicInteger(0);
        C18740tg.A01();
        C18740tg.A0C(((AnonymousClass01N) r4.getLifecycle()).A02 != AnonymousClass01P.DESTROYED ? true : z);
        CreateCommunityManager$$ExternalSyntheticLambda0 createCommunityManager$$ExternalSyntheticLambda0 = new CreateCommunityManager$$ExternalSyntheticLambda0(this);
        this.A0G = createCommunityManager$$ExternalSyntheticLambda0;
        r4.getLifecycle().A04(createCommunityManager$$ExternalSyntheticLambda0);
    }
}
