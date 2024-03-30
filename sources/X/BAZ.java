package X;

import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public class BAZ implements C236119d {
    public Object A00;
    public final int A01;

    public BAZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C167777yn r7, int i) {
        r7.A03.A0E(i, C19970wo.A00(r7.A02) + TimeUnit.DAYS.toMillis(1));
    }

    public void BVN(String str) {
        if (this.A01 != 0) {
            C167777yn r1 = (C167777yn) this.A00;
            C001700s r3 = r1.A00;
            C21826Ab2 ab2 = new C21826Ab2(0, "No Internet!");
            C196009Xf r0 = r1.A07;
            r3.A0C(new C121835tn(new AnonymousClass9NJ(R.string.f12nameremoved, R.string.f12nameremoved, r0.A00(0, 500), r0.A01(0, 500), 0, 500), ab2, 1));
        }
    }

    public void BWw(C203399nx r6, String str) {
        if (this.A01 != 0) {
            try {
                C203399nx A0c = r6.A0c("error");
                C18740tg.A07(A0c, AnonymousClass000.A0q(" not found!", AnonymousClass000.A0v("error")));
                int A0S = A0c.A0S("code", 500);
                C167777yn.A01((C167777yn) this.A00, new C21826Ab2(A0S, A0c.A0i("text", "Unknown!")), A0S);
            } catch (C235919b | NullPointerException e) {
                C167777yn.A01((C167777yn) this.A00, e, 500);
            }
        }
    }

    public void BiM(C203399nx r11, String str) {
        if (this.A01 != 0) {
            try {
                C203399nx A0c = r11.A0c("account");
                C18740tg.A07(A0c, AnonymousClass000.A0q(" not found!", AnonymousClass000.A0v("account")));
                C203399nx A0c2 = A0c.A0c("link");
                C18740tg.A07(A0c2, C36321k7.A0D("link", " not found!"));
                int A0S = A0c2.A0S("status", 0);
                int A0S2 = A0c2.A0S("redirection_type", 0);
                C167777yn r4 = (C167777yn) this.A00;
                if (A0S == 1) {
                    if (A0S2 != 0) {
                        if (A0S2 == 1) {
                            A00(r4, 2);
                        } else if (A0S2 == 2) {
                            A00(r4, 1);
                        }
                        C001700s r2 = r4.A00;
                        C196009Xf r1 = r4.A07;
                        boolean z = r1 instanceof C180368le;
                        int i = R.string.f12nameremoved;
                        if (z && A0S2 == 1) {
                            i = R.string.f12nameremoved;
                        }
                        int i2 = R.string.f12nameremoved;
                        if (z && A0S2 == 1) {
                            i2 = R.string.f12nameremoved;
                        }
                        r2.A0C(new C121835tn(new AnonymousClass9NJ(i, i2, r1.A00(A0S2, 0), r1.A01(A0S2, 0), A0S2, 0), (Throwable) null, 0));
                        return;
                    }
                    A00(r4, 0);
                    C165577te.A1M("ViralityLinkViewModel", "postSuccessResult: unsupported redirection type");
                    C001700s r22 = r4.A00;
                    C196009Xf r12 = r4.A07;
                    boolean z2 = r12 instanceof C180368le;
                    int i3 = R.string.f12nameremoved;
                    i3 = R.string.f12nameremoved;
                    int i22 = R.string.f12nameremoved;
                    i22 = R.string.f12nameremoved;
                    r22.A0C(new C121835tn(new AnonymousClass9NJ(i3, i22, r12.A00(A0S2, 0), r12.A01(A0S2, 0), A0S2, 0), (Throwable) null, 0));
                    return;
                }
                C167777yn.A01(r4, AnonymousClass000.A0d("Status is ", AnonymousClass000.A0u(), A0S), 500);
            } catch (C235919b | NullPointerException e) {
                C167777yn.A01((C167777yn) this.A00, e, 500);
            }
        }
    }
}
